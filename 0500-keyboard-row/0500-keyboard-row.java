class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String fRow = "qwertyuiop";
        String sRow = "asdfghjkl";
        String tRow = "zxcvbnm";

        for(String str : words){
            String lowercased = str.toLowerCase();
            if(firstRowMakes(lowercased, fRow) || secondRowMakes(lowercased, sRow) || thirdRowMakes(lowercased, tRow)){
                res.add(str);
            }
        }

        return res.toArray(new String[res.size()]);
    }

    public boolean firstRowMakes(String str, String fRow){
        for(char ch : str.toCharArray()){
            if(fRow.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }

    public boolean secondRowMakes(String str, String sRow){
        for(char ch : str.toCharArray()){
            if(sRow.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
    
    public boolean thirdRowMakes(String str, String tRow){
        for(char ch : str.toCharArray()){
            if(tRow.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}