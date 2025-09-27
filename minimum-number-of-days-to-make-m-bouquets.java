class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        while(left<=right){
            int days = left+(right-left)/2;
            if(validDays(bloomDay, days, m, k)){
                ans = days;
                right = days-1;
            }
            else{
                left = days+1;
            }
        }
        return ans;
    }

    private boolean validDays(int[] bloomDay, int days, int m, int k){
        int temp = 0;
        int countBouq = 0;

        for(int num : bloomDay){
            if(num<=days){
              temp++;
              if(temp==k){
                countBouq++;
                temp=0;
              }  
            }
            else{
                temp=0;
            }
        }
        return countBouq>=m;
    }
}