class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        // sort trips by pickup loc
        Arrays.sort(trips,(a,b)->a[1]-b[1]);

        // min heap based on drop loc
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );

        int curr=0;

        for(int i=0; i<trips.length; i++) {
            int psg=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];

            // drop psg
            while(!pq.isEmpty() && pq.peek()[0]<=from) {
                curr-=pq.poll()[1];
            }

            // pick new psg
            curr+=psg;

            if(curr>capacity) return false;

            pq.add(new int[]{to,psg});
        }

        return true;
    }
}