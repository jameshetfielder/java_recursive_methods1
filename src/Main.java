public class Main {

    static boolean isPalindrome(int number){
        int tempNum = number, lastDigit, reverseNum = 0;
        while (tempNum != 0){
            lastDigit = tempNum % 10;
            reverseNum = lastDigit + (10 * reverseNum);
            tempNum /= 10;
        }
        if (number == reverseNum) {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.print(isPalindrome(2));
    }
}