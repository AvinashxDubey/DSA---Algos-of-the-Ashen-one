class Solution {
    /**
        hcf and gcd are the same thign
        few things to consider before solving the ques:
        1. for any two nos, lcm*gcd = product of the two nos
        2. Euceldian algo could be used to solve gcd:
            // any common divisor of (a, b) also divides (b, r) and vice versa
            // so we shrink the nos by doing  b = a%b and a = prev_b
            // eventually when b == 0, final a is the gcd
     */
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for (int num : nums) {
            while (!st.isEmpty() && findGcd(st.peek(), num)>1) {
                long lcm = ((long)st.peek() * num) / findGcd(st.peek(), num);
                num = (int)lcm;
                st.pop();
            }
            st.push(num);
        }
        return new ArrayList<>(st);
    }

    public int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}