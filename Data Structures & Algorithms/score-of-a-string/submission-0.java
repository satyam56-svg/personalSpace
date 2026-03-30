class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int score=0;
        for(int i=0; i<n-1; i++) {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1>ch2) {
                score+=(ch1-ch2);
            } else {
                score+=(ch2-ch1);
            }
        }
        return score;
    }
}