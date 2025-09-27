class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int boats=0;
        int left = 0, right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;  //take the lightest person
            }
            right--;  //take the heaviest person each time
            boats++;
        }
        return boats;
    }
}