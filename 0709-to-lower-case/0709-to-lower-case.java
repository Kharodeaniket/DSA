class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                char ch =(char)(s.charAt(i)+32);
                sb.append(ch);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}