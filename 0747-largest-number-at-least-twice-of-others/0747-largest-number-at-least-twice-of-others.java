class Solution {
    public int dominantIndex(int[] nums) {
        int max =Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                secmax=max;
                max=nums[i];
                index=i;
            }else if(secmax<nums[i] && nums[i]<max){
                secmax=nums[i];
            }
        }
        if(secmax*2<=max){
            return index;
        }
       
        return -1;
    }
}