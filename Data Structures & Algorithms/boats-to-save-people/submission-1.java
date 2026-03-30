// import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int count = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // lightest person goes with heaviest
            }
            j--; // heaviest always goes (either alone or with someone)
            count++;
        }

        return count;
    }
}
