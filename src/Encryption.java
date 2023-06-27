import java.util.Arrays;

public class Encryption {


    private static final char Alphabet[] = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '"', ':', '-', '!', '?', ' '};

    public static String EncryptedOffer(String EncryptedOffer, int key) {
        char[] encryptedArrayChar = EncryptedOffer.toCharArray();
        for (int i = 0; i < encryptedArrayChar.length; i++) {
            for (int j = 0; j < Alphabet.length; j++) {
                if (encryptedArrayChar[i] == Alphabet[j]) {
                    if (j + key > 41) {
                        encryptedArrayChar[i] = Alphabet[j + key - 41];
                    } else {
                        encryptedArrayChar[i] = Alphabet[j + key];
                    }
                    break;
                }
            }
        }
        return String.valueOf(encryptedArrayChar);
    }

    public static String DecryptionOffer(String DecryptionOffer, int key) {
        char[] DecryptionArrayChar = DecryptionOffer.toCharArray();
        for (int i = 0; i < DecryptionArrayChar.length; i++) {
            for (int j = 0; j < Alphabet.length; j++) {
                if (DecryptionArrayChar[i] == Alphabet[j]) {
                    if (j - key < 0) {
                        DecryptionArrayChar[i] = Alphabet[j - key + 41];
                    } else {
                        DecryptionArrayChar[i] = Alphabet[j - key];
                    }
                    break;
                }
            }
        }
        return String.valueOf(DecryptionArrayChar);
    }


}