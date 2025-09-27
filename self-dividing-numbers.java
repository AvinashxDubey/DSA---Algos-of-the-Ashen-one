class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int curr = i;
            boolean flag = true;
            while(curr>0){
                int rem = curr%10;
                if(rem==0 || i%rem!=0){
                    flag=false;
                    break;
                }
                curr/=10;
            }
            if(flag) ls.add(i);
        }
        return ls;
    }
}