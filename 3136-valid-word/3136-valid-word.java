class Solution {
    public boolean isValid(String word) {
        int charcount=0;
        int vowel=0;
        int cont=0;
        for(int i=0;i<word.length();i++){
            if((word.charAt(i)>='A'&& word.charAt(i)<='Z') || (word.charAt(i)>='a'&& word.charAt(i)<='z')||(word.charAt(i)>='0'&& word.charAt(i)<='9')){
                if(isVowel(word.charAt(i))){
                    vowel++;
                    charcount++;
                }else if (word.charAt(i)>='0' && word.charAt(i)<='9'){
                    charcount++;
                }else{
                    cont++;
                    charcount++;
                }
            }else{return false;}
        }
        return charcount>=3 && vowel>=1 && cont>=1;
        
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U';
    }
}