class Solution {
    public String generateTag(String caption) {
        char[] charArray = caption.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        if(charArray[0]!=' '){sb.append(Character.toLowerCase(charArray[0]));}
        int i=1;
        while(i<caption.length()){
            if(charArray[i]==' ') {
                while(i<caption.length() && charArray[i]==' ') i++;
                if(i<caption.length()){
                    sb.append(Character.toUpperCase(charArray[i]));
                }
            }
            else{
                sb.append(Character.toLowerCase(charArray[i]));
            }
            i++;
        }
        return sb.length()>100 ? sb.substring(0, 100) : sb.toString();
    }
}