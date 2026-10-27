class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        output = strs[0];
        
        for(int i = 1; i<strs.length; i++){
            int j = 0;
            if(strs[i].length() == 0){
                return "";
            }
            while(j<output.length()){
                if(j<strs[i].length()){
                    if(output.charAt(j) == strs[i].charAt(j)){
                    j++;
                    continue;
                    }
                    else{
                        output = output.substring(0,j);
                        break;
                    }
                }
                else{
                    output = output.substring(0,j);
                    break;
                }
                
            }
        }
        return output;
    }
}