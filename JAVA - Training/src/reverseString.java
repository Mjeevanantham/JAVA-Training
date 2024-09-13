import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("Enter a word to reverse: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(stringReverse(word));
        sc.close();
    }

    public static String stringReverse(String in) {
//        Ans 1
        StringBuilder builder = new StringBuilder(in);
        return builder.reverse().toString();

//        Ans 2
//        String out = "";
//        char[] characters = in.toCharArray();
//        for (int i = characters.length - 1; i >= 0; i--) {
//            out += characters[i];
//        }
//        return out;

    }
}
