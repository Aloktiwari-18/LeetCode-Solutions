class Solution {
    public int characterReplacement(String s, int k) {
                       // BRUTE FORCE 
        // int maxlen=0;
        
        // for(int i=0;i<s.length();i++){
        //     int freq[] = new int[26];
        //     int maxfreq=0;
        //     int changes=0;

        //     for(int j=i;j<s.length();j++){
        //         int idx=s.charAt(j)-'A';
        //         freq[idx]++;
               
        //         maxfreq=Math.max(maxfreq,freq[idx]);

        //         changes=(j-i+1)-maxfreq;
        //         if(changes<=k){
        //             maxlen=Math.max(maxlen,(j-i+1));

        //         }else{
        //             break;
        //         }

        //     }
        // }
        // return maxlen;



        //                     SLIDING WINDOW METHOD

        int left=0;
        int right=0;
        int n=s.length();
        int maxlen=0;
        int maxfreq=0;
        int hash[]=new int [26];
        while(right<n){
            hash[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(right)-'A']);

            if((right-left+1)-maxfreq>k){
                hash[s.charAt(left)-'A']--;
                maxfreq=0;
                for(int i=0;i<25;i++){
                    maxfreq=Math.max(maxfreq,hash[i]);
                }
                left=left+1;
            }if((right-left+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;

        }
        return maxlen;

        
    }
}