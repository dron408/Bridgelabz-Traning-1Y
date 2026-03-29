package level2;

public class palindromechecker {
    String text;

    boolean isPalindrome() {
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        return text.equals(rev);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

class Main {
    public static void main(String[] args) {
        palindromechecker p = new palindromechecker();
        p.text = "madam";
        p.displayResult();

    }
}
