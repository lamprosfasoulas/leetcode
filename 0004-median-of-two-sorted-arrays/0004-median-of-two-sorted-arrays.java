class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int[] nums = new int[x+y];
        for(int i = 0; i < x; i++){
            nums[i] = nums1[i];
        }
        for(int j = 0; j < y; j++){
            nums[j+x] = nums2[j];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return findM(nums);
    }
    public double findM(int[] result){
        int len = result.length;
        double res;
        if(len != 1){
            int test = len%2;
            switch (test){
                case 0:
                res = (result[len/2] + result [len/2-1]);
                return res/2;
                case 1:
                res = result[len/2];
                return res;
            }

        }else{
            return result[0];
        }
        return 0;
    }
}