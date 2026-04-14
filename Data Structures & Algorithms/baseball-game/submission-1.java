class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<operations.length ; i++)
        {
            String cur = operations[i];

            if(cur.equals("D"))
            {
                stack.push(stack.peek() * 2);
            }
            else if(cur.equals("C"))
            {
                stack.pop();
            }
            else if(cur.equals("+"))
            {
                int num1 = stack.pop();
                int num2 = stack.peek();
                
                stack.push(num1);
                stack.push(num1+num2);

            }
            else{
                stack.push(Integer.parseInt(cur));
            }
        }
        int sum =0 ;
        while(!stack.isEmpty())
        {
            sum += stack.pop();
        }

        return sum;
    }
}