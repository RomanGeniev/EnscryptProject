import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int choiceOfOption = -1;
        Scanner scanner = new Scanner(System.in);
        //System.out.println(Encryption.DecryptionOffer("привет",9));
        System.out.println("Введите сылку на файл который нужно зашифровать или расшифровать: ");

        Path Output = Path.of(String.valueOf(scanner.nextLine()));
        System.out.println("Введите сылку на файл в который нужно записать результат: ");
        Path Input = Path.of(String.valueOf(scanner.nextLine()));
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();

        try {
            System.out.println("Введите 1 чтобы сделать шифровку, введите 2, чтобы сделать расшифровку или введите 3, чтобы запустить метод Brute Force");
            choiceOfOption = scanner.nextInt();
            switch (choiceOfOption) {
                case 1:
                    String DecryptionString = Encryption.EncryptedOffer(Files.readString(Output), key);
                    Files.writeString(Input, DecryptionString);
                    break;

                case 2:
                    String EncryptionString = Encryption.DecryptionOffer(Files.readString(Output), key);
                    Files.writeString(Input, EncryptionString);
                    break;

                case 3:
                        String BruteForceString = BruteForce.BruteForce(Files.readString(Output),Input);
                        Files.writeString(Input,BruteForceString);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}