class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] arr = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[index]=nums[i];
                index+=2;
            }
        }
        index=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[index]=nums[i];
                index+=2;
            }
        }
        return arr;
    }
}