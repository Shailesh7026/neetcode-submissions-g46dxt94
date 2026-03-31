class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = k;

        while (right < arr.length) {
            if (x - arr[left] > arr[right] - x) {
                left++;
                right++;
            } else {
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < right; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}