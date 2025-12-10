class Solution {
    public int numberOfSubstrings(String s) {
        // int[] freq = new int[3];
        // int left = 0, count = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     freq[s.charAt(right) - 'a']++;

        //     while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
        //         count += (s.length() - right);
        //         freq[s.charAt(left) - 'a']--;
        //         left++;
        //     }
        // }

        // return count;
        int n=s.length();
        int count =0;

        int lastseen[] = new int[]{-1, -1, -1};

        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
    int mini = Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2]));
    count += (1 + mini);
}

        }
        return count;

    }
}
