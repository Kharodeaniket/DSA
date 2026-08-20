class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lucky=-1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey();
            int num2=map.get(num);
            if(num==num2){
                lucky = Math.max(lucky,num);
            }
        }
        return lucky;
        
    }
}