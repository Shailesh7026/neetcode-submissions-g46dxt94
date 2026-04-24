class Solution {
    public int calculate(String s) {
        int last = 0;
        int result = 0;
        int num = 0;
        char sign = '+';

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num*10 + (c -'0');
            }

            if(!Character.isDigit(c) && c != ' ' || i == s.length() - 1){
                if(sign == '+'){
                    result += last;
                    last = num;
                }
                else if(sign == '-'){
                    result += last;
                    last = -num;
                }
                else if(sign == '*'){
                    last = last * num;
                }
                else if(sign == '/'){
                    last = last / num;
                }

                num=0;
                sign=c;
            }
        }

        return result+last;
    }
}