class Solution {
    public void duplicateZeros(int[] arr) {
        int zerocount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zerocount++;
        }
        int index=0;
        int i=0;
        int []a= new int[arr.length];
        while(index<arr.length){
            if(arr[i]==0){
                a[index++]=arr[i++];
                if(index<arr.length)
                a[index++]=0;
            }else{
                a[index++]=arr[i++];
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=a[j];
        }
    }
}