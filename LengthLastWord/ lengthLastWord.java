class Solution {
    public int lengthOfLastWord(String s) {
        // With split and loop
        //     String[] arr = s.split("\\s+");
        // String st = arr[arr.length -1];
        // int count=0;
        // for (char c: st.toCharArray())
        //     count++;
        // return count;

        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
        return s.length();
    }

}