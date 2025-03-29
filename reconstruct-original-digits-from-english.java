class Solution {
    public String originalDigits(String s) {
        int[] charMap = new int[26];
        ArrayList<Integer> ls = new ArrayList<>();
        for(char ch : s.toCharArray()){
            charMap[ch-'a']++;
        }

        while(charMap['z'-'a']>0){
            charMap['z'-'a']--;
            charMap['e'-'a']--;
            charMap['r'-'a']--;
            charMap['o'-'a']--;
            ls.add(0);
        }
        while(charMap['w'-'a']>0){
            charMap['t'-'a']--;
            charMap['w'-'a']--;
            charMap['o'-'a']--;
            ls.add(2);
        }
        while(charMap['u'-'a']>0){
            charMap['f'-'a']--;
            charMap['o'-'a']--;
            charMap['u'-'a']--;
            charMap['r'-'a']--;
            ls.add(4);
        }
        while(charMap['x'-'a']>0){
            charMap['s'-'a']--;
            charMap['i'-'a']--;
            charMap['x'-'a']--;
            ls.add(6);
        }
        while(charMap['g'-'a']>0){
            charMap['e'-'a']--;
            charMap['i'-'a']--;
            charMap['g'-'a']--;
            charMap['h'-'a']--;
            charMap['t'-'a']--;
            ls.add(8);
        }
        while(charMap['o'-'a']>0){
            charMap['o'-'a']--;
            charMap['n'-'a']--;
            charMap['e'-'a']--;
            ls.add(1);
        }
        while(charMap['t'-'a']>0){
            charMap['t'-'a']--;
            charMap['h'-'a']--;
            charMap['r'-'a']--;
            charMap['e'-'a']--;
            charMap['e'-'a']--;
            ls.add(3);
        }
        while(charMap['f'-'a']>0){
            charMap['f'-'a']--;
            charMap['i'-'a']--;
            charMap['v'-'a']--;
            charMap['e'-'a']--;
            ls.add(5);
        }
        while(charMap['s'-'a']>0){
            charMap['s'-'a']--;
            charMap['e'-'a']--;
            charMap['v'-'a']--;
            charMap['e'-'a']--;
            charMap['n'-'a']--;
            ls.add(7);
        }
        while(charMap['i'-'a']>0){
            charMap['n'-'a']--;
            charMap['i'-'a']--;
            charMap['n'-'a']--;
            charMap['e'-'a']--;
            ls.add(9);
        }
        
        Collections.sort(ls);
        StringBuilder sb = new StringBuilder();
        for(int num : ls){
            sb.append(num);
        }
        return sb.toString();
    }
}