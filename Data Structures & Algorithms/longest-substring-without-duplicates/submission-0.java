class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxLen = Integer.MIN_VALUE;
        for(int i =0; i<s.length(); i++){
            Set<Character> sett = new HashSet<>();
            int len = 0;
            for(int j = i; j<s.length(); j++){
                if(!sett.contains(s.charAt(j))){
                    sett.add(s.charAt(j));
                    len++;
                }
                else{
                    break;
                }
            }
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}
