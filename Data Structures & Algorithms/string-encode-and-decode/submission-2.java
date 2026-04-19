class Solution {

    public String encode(List<String> strs) {
        StringBuilder strb = new StringBuilder();
        
        for(String str: strs){
            strb.append(str.length());
            strb.append("#");
            strb.append(str);
        }

        return strb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            
            int j = i;
            
            while(j < str.length() && str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            j++;

            String word = str.substring(j, j + len);
            list.add(word);

            i = j + len;
        }

        return list;
    }
}
