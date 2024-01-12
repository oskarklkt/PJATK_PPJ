import java.io.FileInputStream;
//zawartość pliku: sample text dog cat java programming
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream in = new FileInputStream("D:\\PROGRAMOWANIE\\zadanie12.1.txt");
            int c;
            while ((c = in.read()) != -1) {
                sb.append((char) c);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String text = sb.toString().replace(" ", "");
        printSignsOccurrence(text);
    }

    public static void printSignsOccurrence(String text) {
        while (!text.isEmpty()) {
            char c = text.charAt(0);
            int occurrences = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) { occurrences++;}
            }
            System.out.println("Sign: " + c + " Occurrences: " + occurrences);
            text = text.replace(String.valueOf(c), "");
        }
    }
}



