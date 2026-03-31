class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j = 0;
        while(i<n){
            char currChar = chars[i];
            int count = 0;
            
            while(i<n && chars[i] == currChar){
                i++;
                count++;
            }

            chars[j++] = currChar ;

            if(count > 1){  
                String cnt = String.valueOf(count);
                for(char ch: cnt.toCharArray()){
                    chars[j++] = ch;
                }
            }
           
        }

        return j;
    }
}