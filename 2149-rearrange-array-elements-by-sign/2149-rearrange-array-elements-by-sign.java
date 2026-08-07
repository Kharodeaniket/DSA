class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
         int[] neg = new int[nums.length/2];
        int posind=0 , negind=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[posind++]=nums[i];
            }
            else if (nums[i]<0){
                neg[negind++]=nums[i];
            }
         }
            int i=0,index=0;
         int[]result = new int[nums.length];
         while(i<result.length){
            result[i]=pos[index++];
            i+=2;
         }
         index=0;
         int j=1;
         while(j<result.length){
            result[j]=neg[index++];
            j+=2;
         }
        return result;
    }
}