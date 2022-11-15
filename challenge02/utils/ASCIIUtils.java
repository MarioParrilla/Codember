package challenge02.utils;

public class ASCIIUtils {
    public static String parseAsciiToString(String asciiCodeSequence) {
        int endOfLastLetter = 0;
        String word = "";
        for (int i = 1; i <= asciiCodeSequence.length(); i++) {
            int asciiCode = Integer.parseInt(asciiCodeSequence.substring(endOfLastLetter,i));
            if (asciiCode >= Constants.MIN_ASCII_CODE && asciiCode <= Constants.MAX_ASCII_CODE) {
                word+=Character.valueOf((char) asciiCode);
                endOfLastLetter = i;
            }
        }
        return word;
    }
}
