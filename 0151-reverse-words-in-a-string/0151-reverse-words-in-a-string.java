class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=" "+s;
        StringBuilder sb = new StringBuilder("");
        StringBuilder res=new StringBuilder("");
        boolean firspace=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                firspace=true;
            }else if(s.charAt(i)==' '){
                if(firspace){
                    sb.reverse();
                    res.append(sb);
                    res.append(" ");
                    firspace=false;
                    sb.setLength(0);
                }
            }
        }
        return res.toString().trim();
    }
}