class Solution {
    /**
        aight wed focus on removing one type of substring
        here, we greedily focus on removing substring 'ab'
     */
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            sb.reverse();
        }

        int a = 0, b = 0, maxPoints = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == 'a') {
                a++;
            }
            else if (ch == 'b') {
                if (a > 0) {
                    maxPoints += x;
                    a--;
                } else {
                    b++;
                }
            }
            else {
                maxPoints += Math.min(a, b)*y;
                a = 0;
                b = 0;
            }
        }

        maxPoints += Math.min(a, b)*y; //for the remaining a's and b's in case last char was a or b

        return maxPoints;
    }
}