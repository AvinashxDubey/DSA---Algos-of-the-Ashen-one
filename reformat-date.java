class Solution {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        String[] strs = date.split(" ");
        String dd = (strs[0].length()>3) ? strs[0].substring(0, 2) : "0"+strs[0].substring(0, 1);
        String mm = map.get(strs[1]);
        sb.append(strs[2]).append('-');
        sb.append(mm).append('-');
        sb.append(dd);
        return sb.toString();
    }
}