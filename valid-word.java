class Solution {
    public boolean isValid(String word) {
        Set<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        int vowelCount =0;
        int consCount = 0;
        for(char ch : word.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                count++;
                if(set.contains(Character.toLowerCase(ch))){
                    vowelCount++;
                }
                else if(!(ch>='0' && ch<='9')){
                    consCount++;
                }
            }
            else return false;
        }

        return count>=3 && vowelCount>=1 && consCount>=1;
    }
}   