import java.util.*;

class Solution {

    public int minimumOperations(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int ans = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            int[] arr = new int[size];

            // Current level values
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                arr[i] = node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            
            ans += minSwaps(arr);
        }

        return ans;
    }

    public int minSwaps(int[] arr) {
        int sortArr[]= arr.clone();
        Arrays.sort(sortArr);
        int count=0;

        HashMap<Integer , Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==sortArr[i]) continue;
            int idx= map.get(sortArr[i]);

            map.put(arr[i],idx);
            map.put(sortArr[i], i);

            int temp= arr[i];
            arr[i]= arr[idx];
            arr[idx]=temp;
            count++;

            

        }
        return count;
       
    }
}