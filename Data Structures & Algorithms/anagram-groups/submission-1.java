class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        // Arrays.sort(strs);

        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String keyy = new String(arr);
            if(!mp.containsKey(keyy)){
                mp.put(keyy,new ArrayList<>());
            }
            
            mp.get(keyy).add(s);
            
        }
        return new ArrayList<>(mp.values());
    }
}
