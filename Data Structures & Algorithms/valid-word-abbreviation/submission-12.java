class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int n = word.length();
        int m = abbr.length();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            
            if(Character.isDigit(abbr.charAt(j))){
                if (abbr.charAt(j) == '0') return false;
                int num = 0 ;
                while(j<m && Character.isDigit(abbr.charAt(j))){
                    num = (num*10) + Character.digit(abbr.charAt(j), 10);
                    j++;
                }
                i += num;
            }
            else{
                if(i<n && j<m && abbr.charAt(j) != word.charAt(i)){ return false;}
                i++;
                j++;
            }
           


           
        }

        return i == n && j == m;
    }
}