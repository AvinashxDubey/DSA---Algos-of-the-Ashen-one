class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int prefix[] = new int[garbage.length];
        for(int i=1; i<garbage.length; i++){
            prefix[i]=prefix[i-1]+travel[i-1];
        }
        int lastIdxM=0, lastIdxP=0, lastIdxG=0;
        int[] charMap = new int[26];
        for(int i=0; i<garbage.length; i++){
            for(int j=0; j<garbage[i].length(); j++){
                char ch = garbage[i].charAt(j);
                charMap[ch-'A']++;
                if(ch=='M'){
                    lastIdxM=i;
                }
                if(ch=='P'){
                    lastIdxP=i;
                }
                if(ch=='G'){
                    lastIdxG=i;
                }
            }
        }

        int total = 0;
        total+= charMap['M'-'A'] + charMap['P'-'A'] + charMap['G'-'A'];
        total+= prefix[lastIdxM] + prefix[lastIdxP] + prefix[lastIdxG];
        return total;
    }
}