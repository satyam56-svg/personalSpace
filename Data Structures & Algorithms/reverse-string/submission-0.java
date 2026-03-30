class Solution {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j) {
            char temp[]=new char[s.length];
            temp[i]=s[i];
            s[i]=s[j];
            s[j]=temp[i];
            i++;
            j--;
        }
    }
}