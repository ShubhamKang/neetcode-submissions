class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapp = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(char c: s.toCharArray()){
            if (mapp.containsKey(c)){
                mapp.put(c,mapp.get(c)+1);
            }
            else{
                mapp.put(c,1);
            }
        }

        for(char d: t.toCharArray()){
            if (mapp.containsKey(d)){
                mapp.put(d,mapp.get(d)-1); 
            }
        }

        for(int value: mapp.values()){
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}
