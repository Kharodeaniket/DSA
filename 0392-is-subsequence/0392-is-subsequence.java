class Solution {
    public boolean isSubsequence(String s, String t) {
        // if(s.length()==0 && t.length()==0 )
        // return true;
        // if(s.length()>=t.length()){
        //     return false;
        // }
        
        

        // HashMap<Character,Integer> map = new HashMap<>();
        // HashMap<Character,Integer> count = new HashMap<>();
        // char[] tarr = t.toCharArray();
        // for(int i=0;i<tarr.length;i++){
        //     map.put(tarr[i],i);
        //     count.put(tarr[i],count.getOrDefault(tarr[i],0)+1);
        // }
        // char[] sarr = s.toCharArray();
        // int lastindex =0;
        // for(int i=0;i<sarr.length;i++){
        //     if(map.containsKey(sarr[i])){
        //         int index = map.get(sarr[i]);
        //         if(count.get(sarr[i])==0)
        //              return false;
        //         count.put(sarr[i],count.get(sarr[i])-1);
        //         if(index<lastindex){
        //             return false;
        //         }
        //         lastindex=index;
        //     }else {
        //         return false;
        //     }
        // }
        // return true;

       

        StringBuilder result =  new StringBuilder("");
        for(int i=0;i<t.length();i++){
            String res = result.toString()+t.charAt(i);
            if(s.contains(res)&& s.startsWith(res)){
                result.append(t.charAt(i));
            }
        }

        
        return result.toString().equals(s)?true:false;
    }
}