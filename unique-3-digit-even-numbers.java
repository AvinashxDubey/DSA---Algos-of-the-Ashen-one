class Solution {
    
    public int totalNumbers(int[] digits) {
        int count =0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<digits.length; i++){
            if(digits[i]==0) continue;
            for(int j=0; j<digits.length; j++){
                if(i==j) continue;
                for(int k=0; k<digits.length; k++){
                    if(k==j||k==i) continue; 
                    int threeDigitNum = digits[i]*100 + digits[j]*10 + digits[k];
                    if(threeDigitNum>=100 && threeDigitNum%2==0) set.add(threeDigitNum);
                }
            }
        }
        return set.size();
    }

}