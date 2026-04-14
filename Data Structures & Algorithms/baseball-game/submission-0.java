class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s: operations){
            switch(s){
                case "+": int index = stack.size() - 1;
                          stack.push(stack.elementAt(index) + stack.elementAt(index-1));
                          break;

                case "D": stack.push(2 * stack.elementAt(stack.size()-1));
                          break;

                case "C": stack.pop();
                          break;

                default: stack.push(Integer.parseInt(s));
                
            }

            System.out.println(stack);

        }

        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
            return result;
    }
}