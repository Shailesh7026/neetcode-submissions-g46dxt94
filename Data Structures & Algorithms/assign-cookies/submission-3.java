class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<n && j<m){

            if(g[i] <= s[j]){
                i++;
                j++;
            }

            while(i<n && j<m && g[i] > s[j]){
                j++;
            }

        }

        return i;
    }
}