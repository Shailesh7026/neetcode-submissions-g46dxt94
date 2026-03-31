class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int i = 0;
      
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j=0; i<n && j<m ; j++){

            if(g[i] <= s[j]){
                i++;
               
            }

          
        }

        return i;
    }
}