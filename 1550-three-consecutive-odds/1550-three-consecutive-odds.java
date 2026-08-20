class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean isOdd=false;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2== 1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                isOdd = true;
            }
        }
        return isOdd;
    }
}