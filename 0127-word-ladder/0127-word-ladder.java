class Pair {
    String first;
    int second;

    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));

        Set<String> st = new HashSet<>();
        for (String word : wordList) {
            st.add(word);
        }

        if (!st.contains(endWord)) return 0;

        st.remove(beginWord);

        while (!q.isEmpty()) {

            Pair curr = q.poll();
            String word = curr.first;
            int steps = curr.second;

            if (word.equals(endWord)) return steps;

            for (int i = 0; i < word.length(); i++) {
                char[] arr = word.toCharArray();

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (arr[i] == ch) continue;

                    arr[i] = ch;
                    String newWord = new String(arr);

                    if (st.contains(newWord)) {
                        st.remove(newWord);
                        q.add(new Pair(newWord, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
}
