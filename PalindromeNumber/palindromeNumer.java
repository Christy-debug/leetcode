public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int original = x;
        if (x < 0) {
            return false;
        }
        int value = x;
        int reminder, reversed = 0;
        while (value != 0) {
            reminder = value % 10;
            reversed = reversed * 10 + reminder;
            value = value / 10;
        }
        if (reversed == original) {
            return true;
        } else {
            return false;
        }
    }
}
