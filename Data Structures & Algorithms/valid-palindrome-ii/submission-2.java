class Solution {
     public boolean check(String s,int i , int j){
         while (i < j) {

            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int canBeDelete = 1;

        while(i<j){
        
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }else{
                return check(s,i+1,j) || check(s,i,j-1);
            }
           
        }

        return true;
    }
    }
