class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int age[]=new int[n];
        int count=0;
        for(int i=0; i<n; i++) {
            int curr=Integer.parseInt(details[i].substring(11,13));
            age[i]=curr;
            if(age[i]>60) count++;
        }
        return count;
    }
}