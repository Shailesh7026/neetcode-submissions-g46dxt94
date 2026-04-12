class Solution {
    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        for(int i=0; i<logs.length ; i++){
            if(logs[i].equals("../") && !stack.isEmpty()){
                stack.pop();
            }else if(logs[i].equals("./")){
                continue;
            }else{
                if(!logs[i].equals("../")){
                    stack.push(logs[i]);
                }
            }
        }

        return stack.size();
    }
}