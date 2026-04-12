class Solution {
    public int minOperations(String[] logs) {
        int response = 0;
        for(int i=0; i<logs.length ; i++){
            if(logs[i].equals("../")){
                if(response > 0) response--;
                
            }else if(logs[i].equals("./")){
                continue;
            }else{
               response++;
            }
        }

        return response;
    }
}