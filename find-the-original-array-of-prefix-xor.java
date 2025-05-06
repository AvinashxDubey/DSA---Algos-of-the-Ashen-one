class Solution {
    /**
    ----explanation-----
    In xor, we've got this property a^a =0
    lets say x = a^a^b^b^a value
                y = b^a^b
    then x^y = (a^a^b^b^a)^(b^a^b) = 0
    so xoring two xor values with only common elements would result into 0
    -------------------------
    Now lets take a pref array
    pref = [5 3 7]
    here, pref[0]=5
            pref[1]=5^3
            pref[2]=5^3^7
    then, pref[2]^pref[1]=(5^3^7)^(5^3)=which is the element at index 2
    for result array
    **/
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        for(int i=pref.length-1; i>0; i--){
            arr[i] = pref[i]^pref[i-1];
        }
        arr[0] = pref[0];
        return arr;
    }
}