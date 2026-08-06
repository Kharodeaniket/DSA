class Solution {
    public void sortColors(int[] nums) {
        int zerocount=0;
        int onecount=0;
        int twocount=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zerocount++;
        }
        if(nums[i]==1)
            onecount++;
            if(nums[i]==2)
            twocount++;
      }
      for(int i=0;i<nums.length;i++){
       if(zerocount!=0){
        nums[i]=0;
        zerocount--;
       }
      else  if(onecount!=0){
        nums[i]=1;
        onecount--;
       }
       else if(twocount!=0){
        nums[i]=2;
        twocount--;
       }
            
      }
        
    }
}