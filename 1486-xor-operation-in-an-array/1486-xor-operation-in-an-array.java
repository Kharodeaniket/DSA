class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            int op = start+2*i;
            sum=sum^op;
        }
        return sum;
    }
}