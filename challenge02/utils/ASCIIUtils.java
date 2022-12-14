package challenge02.utils;

public class ASCIIUtils {
    public static String parseAsciiToString(String asciiCodeSequence) {
        int endOfLastLetter = 0;
        String word = "";
        for (int i = 1; i <= asciiCodeSequence.length(); i++) {
            Double asciiCode = Double.parseDouble(asciiCodeSequence.substring(endOfLastLetter,i));
            if (asciiCode >= Constants.MIN_ASCII_CODE && asciiCode <= Constants.MAX_ASCII_CODE) {
                word+=Character.valueOf((char) asciiCode.intValue());
                endOfLastLetter = i;
            }
        }
        return word;
    }
}
