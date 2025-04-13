class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int curr=candies;
        int[] people = new int[num_people];
        int index=0;
        int give=1;
        while(candies>0){
            if(candies>=give){
                people[index]+=give;
                candies-=give;
                give++;
            }
            else{
                people[index]+=candies;
                candies=0;
            }
            index=(index+1)%num_people;
        }
        return people;
    }
}