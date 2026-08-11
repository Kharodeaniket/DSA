class Solution {
    public boolean halvesAreAlike(String s) {
        int firstcount=0,secondcount=0;
        for(int i=0;i<=((s.length()/2)-1);i++){
            if(isVowel(s.charAt(i))){
                firstcount++;
            }
        }
        for(int i=(s.length()/2);i<s.length();i++){
            if(isVowel(s.charAt(i))){
                secondcount++;
            }
        }
        return firstcount==secondcount;
    }
    public static boolean isVowel(char ch){
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u';
    }
}