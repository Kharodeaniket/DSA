class Solution {
    // public int smallestNumber(int n, int t) {
    //     int product=0;
    //     while(n>0){
    //          product= product(n);
    //         if(product%t==0){
    //             return n;
    //         }
    //         n++;
    //     }
    //     return product;
    // }

    // public int product(int num){
    //     int product=1;
    //     while(num!=0){
    //         int rem=num%10;
    //         product*=rem;
    //         num/=10;

    //     }
    //     return product;
    // }
     public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int rem1=i%10;
            int rem2=Math.max((i/10)%10,1);
           if(rem1*rem2%t==0){
            return i;
           }
        }
        return 0;
    }
}