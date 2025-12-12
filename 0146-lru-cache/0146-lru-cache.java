import java.util.HashMap;

class LRUCache {

    private class Node {
        int key;
        int val;
        Node prev;
        Node next;
        Node(int k, int v) { key = k; val = v; }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final Node head; // dummy head (most recent is head.next)
    private final Node tail; // dummy tail (least recent is tail.prev)

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        // move this node to front (most recently used)
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            // update value and mark as recently used
            node.val = value;
            moveToHead(node);
        } else {
            // new node
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);

            if (map.size() > capacity) {
                // remove least recently used
                Node lru = removeTail();
                map.remove(lru.key);
            }
        }
    }

    // helper: add node right after head
    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // helper: remove a node from its current position
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // helper: move node to head (most recent)
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    // helper: remove tail.prev (least recent) and return it
    private Node removeTail() {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */