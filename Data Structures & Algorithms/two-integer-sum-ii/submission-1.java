class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;

        while(i<=j){
            int currSum = numbers[i] + numbers[j];
            if(currSum > target){
                j--;
            }
            else if(currSum < target){
                i++;
            }else{
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
        }

        return res;
    }
}
