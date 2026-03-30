class Solution {
   public String largestGoodInteger(String num) {
    for (int d = 9; d >= 0; d--) {
        String target = String.valueOf(d).repeat(3);  // "999", "888", ..., "000"
        if (num.contains(target)) {
            return target;
        }
    }
    return "";
}

}
