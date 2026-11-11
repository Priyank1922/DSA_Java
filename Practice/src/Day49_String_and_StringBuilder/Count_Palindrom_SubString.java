package Day49_String_and_StringBuilder;

public class Count_Palindrom_SubString {

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;   // Corrected
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "abcd";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (isPalindrome(sub)) {
                    System.out.print(sub + " ");
                    count++;
                }
            }
        }

        System.out.println();
        System.out.println("The no of palindrome subString = " + count);
    }
}