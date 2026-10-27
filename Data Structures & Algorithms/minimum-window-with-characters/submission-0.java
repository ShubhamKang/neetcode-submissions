class Solution {
    public String minWindow(String s, String t) {
               if(t.length() > s.length()) return "";
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        int m = t.length();
        int n = s.length();
        int start_ind = -1;

        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i< m; i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }

        while(right < s.length()){
            if(mp.containsKey(s.charAt(right))){
                if(mp.get(s.charAt(right)) > 0){
                    count++;
                }
                mp.put(s.charAt(right), mp.get(s.charAt(right)) - 1);
            }
            while(count==m){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start_ind = left;
                }
                if(mp.containsKey(s.charAt(left))){
                    mp.put(s.charAt(left),mp.get(s.charAt(left)) + 1);
                    if(mp.get(s.charAt(left)) > 0){
                        count--;
                    }
                }     
                left++;
            }
            right++;
        }
        if(start_ind == -1) return "";
        return s.substring(start_ind,start_ind+minLen);
        
    }
}
