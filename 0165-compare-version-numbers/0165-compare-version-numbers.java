class Solution {
    public int compareVersion(String version1, String version2) {
        String [] nums1= version1.split("\\.");
        String [] nums2= version2.split("\\.");


        int arr1[]= new int[500];
        int arr2[] = new int[500];
        for(int i=0;i<nums1.length;i++){
            arr1[i]= Integer.parseInt(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            arr2[i]= Integer.parseInt(nums2[i]);
        }

        for(int i=0;i<500;i++){
            if(arr1[i]<arr2[i]) return -1;
            else if(arr1[i]>arr2[i]) return 1;
        }
        return 0;


    }
}