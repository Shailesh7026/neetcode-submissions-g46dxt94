class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int a[] = new int[26];
        int length = s.length() ;
        for(int i=0; i<length ; i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }

        for(int count:a){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
