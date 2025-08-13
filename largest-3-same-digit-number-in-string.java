class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num.charAt(0));
        StringBuilder res = new StringBuilder();
        for (int r = 1; r < num.length(); r++) {
            char curr = num.charAt(r);
            char prev = num.charAt(r - 1);
            if (curr == prev) {
                sb.append(curr);
            } else {
                sb.setLength(0);
                sb.append(curr);
            }

            if (sb.length() == 3) {
                if (res.isEmpty() || res.compareTo(sb)<=0) {
                    res.setLength(0);
                    res.append(sb);
                    System.out.println(sb);
                }
            }
        }
        return res.toString();
    }
}