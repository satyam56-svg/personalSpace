class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==1) {
                set.add(i);
            }
        }

        for(int i=0; i<flowerbed.length; i++) {
            if(i==0 && flowerbed[i]==0){
                if(set.contains(i+1)) {
                    continue;
                }else{
                    n--;
                    set.add(i);
                }
            }
            if(i==flowerbed.length-1 && flowerbed[i]==0){
                if(set.contains(i-1)) {
                    continue;
                }else{
                    n--;
                    set.add(i);
                }
            }
            if(flowerbed[i]==1) {
                continue;
            } else {
                if(set.contains(i-1) || set.contains(i+1)) {
                    continue;
                } else {
                    set.add(i);
                    n--;
                }
            }
        }

        if(n<=0) return true;
        return false;
    }
}