class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // first element always 1
            row.add(1);

            // middle elements
            for(int j = 1; j < i; j++) {
                int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                row.add(val);
            }

            // last element (if row > 0)
            if(i > 0) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }
}
