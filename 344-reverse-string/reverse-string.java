class Solution {
    public void reverseString(char[] s) {
        int st = 0;
       int  n=s.length -1;
       
       
        while(st <= n) {
            char temp = s[st];
            s[st]=s[n];
            s[n]=temp;
            st++;
            n--;
        }
    }
}