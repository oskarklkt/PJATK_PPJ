import java.io.*;
import java.util.Scanner;

//Nie do końca zrozumiałem polecenie. Stworzyłem klasę dzięki której można odczytywać z pliku nastepne słowa
//linie czy liczby a dodałem do niej pole typu Scanner aby dla całej klasy był przerabiany ciągle jeden plik
//dlatego np. wywołanie odczytajLinie a potem odczytaj słowo zwroci pierwszą linie a następnie pierwsze słowo z
//następnej lini a nie pierwszą linie a następnie pierwsze słowo z pierwszej lini
//mam nadzieje że jest to dopuszczalne rozwiązanie
public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\PROGRAMOWANIE\\zadanie12.1.txt");
            MojSkaner mojSkaner = new MojSkaner(in);
            System.out.println(mojSkaner.odczytajLinie());

            System.out.println(mojSkaner.odczytajLiczbeCalkowita());
            System.out.println(mojSkaner.odczytajSlowo());
            System.out.println(mojSkaner.odczytajDodatniaLiczbeCalkowita());
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class MojSkaner {
    InputStream inputStream;

    private Scanner scanner;

    public MojSkaner(InputStream inputStream) {
        this.inputStream = inputStream;
        this.scanner = new Scanner(inputStream);
        scanner.useDelimiter("[ \n]");
    }

    public String odczytajSlowo() throws IOException {
        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            throw new IOException("Nie ma wiecej slow");
        }
    }

    public String odczytajLinie() throws IOException {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            throw new IOException("Nie ma kolejnej lini");
        }
    }

    public int odczytajLiczbeCalkowita() throws IOException {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new IOException("Brak kolejnych liczb calkowitych");
        }
    }

    public int odczytajDodatniaLiczbeCalkowita() throws Exception {
        int i = odczytajLiczbeCalkowita();
        if (i <= 0) {
            throw new Exception("Liczba nie jest dodatnia");
        }
        return i;
    }
}