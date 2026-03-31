class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        List<Integer> list = new ArrayList<>();

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        int j = left;
        int i = j - 1;

        while (j - i - 1 < k) {
            if (i < 0) {
                j++;
            } else if (j >= arr.length || Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                i--;
            } else {
                j++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int index = i + 1; index < j; index++) {
            result.add(arr[index]);
        }
        return result;
    }
}