class Solution {

    public int power(int n) {
        int t=n,sum=0;
        while(t!=0) {
            int digit=t%10;
            sum+=Math.pow(digit,2);
            t/=10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        int result=power(n);
        while(result!=1) {
            if(set.contains(result)) {
                return false;
            } else {
                set.add(result);
            }
            result=power(result);
        }
        return true;
    }
}
