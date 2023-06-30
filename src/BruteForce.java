import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class BruteForce {

    private static final char Alphabet[] = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '"', ':', '-', '!', '?', ' '};


    public static String BruteForce(String offer, Path path) throws IOException {
        String allVariants = null;
        char[] encryptedArrayChar = offer.toCharArray();
        for (int k = 1; k < 41; k++) {
            for (int i = 0; i < encryptedArrayChar.length; i++) {
                for (int j = 0; j < Alphabet.length; j++) {
                    if (encryptedArrayChar[i] == Alphabet[j]) {
                        if (j + k > 40) {
                            allVariants += String.valueOf(encryptedArrayChar[i] = Alphabet[j + k - 41]);
                        } else {
                            allVariants += String.valueOf(encryptedArrayChar[i] = Alphabet[j + k]);
                        }
                        break;
                    }
                }
            }
            allVariants +=" ";
        }
        return allVariants;
    }


}
