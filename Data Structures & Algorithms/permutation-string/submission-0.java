class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] freq_arr = new int[26];
        int[] window_count = new int[26];
        int window_size = s1.length();
        Arrays.fill(freq_arr,0);

        for(int i = 0; i< s1.length(); i++){
            int ind = s1.charAt(i) - 'a';
            freq_arr[ind]++;
        }
    
        for(int j = 0; j<s2.length(); j++){
            int index = s2.charAt(j) - 'a';
            window_count[index]++;

            if(j >= window_size){
                int del_ind = s2.charAt(j-window_size) - 'a';
                window_count[del_ind]--;
            }

            if(match(freq_arr,window_count)) return true;
        }
        return false;
    }

    public static boolean match(int[] arr_1,int[] arr_2){
        if(arr_1.length != arr_2.length) return false;

        for(int i = 0; i< arr_1.length; i++){
            if(arr_1[i] != arr_2[i]) return false;
        }
        return true;
    }
}
