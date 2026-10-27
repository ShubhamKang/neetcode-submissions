class Solution {
    public boolean isPalindrome(String s) {
        String news = s.trim().toLowerCase();
        int i = 0;
        int j = news.length() - 1;
        while(i<=j){
            if(isRightChar(news.charAt(i)) && isRightChar(news.charAt(j))){
                if(news.charAt(i) != news.charAt(j)){
                    return false;
                }
                i+=1;
                j-=1;
            }
            else if(!isRightChar(news.charAt(i))){
                i+=1;
            }
            else if(!isRightChar(news.charAt(j))){
                j-=1;
            }

            
        }
        return true;
        
    }
    public boolean isRightChar(char c){
            if((c >='0') && (c<='9') ||  (c >='a') && (c<='z')){
                return true;
            }
            return false;
    }
}
