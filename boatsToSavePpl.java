//https://leetcode.com/problems/boats-to-save-people/description/


class Solution {
    public int numRescueBoats(int[] people, int limit) {
      //Tc: O(nlogn)  Sc: O(n)
       Arrays.sort(people);
        int cnt = 0;
        int low = 0, high = people.length - 1;

        while (low <= high) {
            if (people[low] + people[high] <= limit) {
                low++;
            }
            high--;
            cnt++;
        }
        return cnt;
    }
}
