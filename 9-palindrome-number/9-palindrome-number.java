class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String str = ""+x;
        int j=str.length()-1;
        for(int i=0;i<=j;i++){
            if(!(str.charAt(i)==str.charAt(j)))
                return false;
            j--;
        }
        return true;
    } 
}