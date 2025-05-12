class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digiCount = new int[10];
        for(int digit : digits){
            digiCount[digit]++;
        }

        List<Integer> ls = new ArrayList<>();
        for(int num=100; num<=999; num+=2){  //only even numbers
            int a =  num/100;
            int b = (num/10)%10;
            int c = num%10;

            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;

            if(temp[a]>digiCount[a] || temp[b]>digiCount[b] || temp[c]>digiCount[c]){
                continue;
            }

            ls.add(num);
        }

        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}