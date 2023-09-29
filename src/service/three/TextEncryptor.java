package service.three;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextEncryptor {

    public static String encryptText(String text) {
        return Arrays.stream(text.split("\\b")) // Split by word boundaries.
                .map(word -> {
                    if (word.matches("[a-zA-Z]+")) { // Only transform words, leave punctuation intact.
                        if (isVowel(word.charAt(0))) {
                            return preserveCapitalization(word, word + "way");
                        } else {
                            return preserveCapitalization(word, word.substring(1) + word.charAt(0) + "ay");
                        }
                    } else {
                        return word;
                    }
                })
                .collect(Collectors.joining()); // Join back the transformed words/punctuation.
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static String preserveCapitalization(String original, String transformed) {
        if (Character.isUpperCase(original.charAt(0))) {
            return Character.toUpperCase(transformed.charAt(0)) + transformed.substring(1).toLowerCase();
        } else {
            return transformed;
        }
    }
}