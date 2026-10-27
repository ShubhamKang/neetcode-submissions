class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr_one = s.toCharArray();
        char[] arr_two = t.toCharArray();

        Arrays.sort(arr_one);
        Arrays.sort(arr_two);
        return Arrays.toString(arr_one).equals(Arrays.toString(arr_two));
    }
}
