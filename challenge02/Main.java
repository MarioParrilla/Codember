package challenge02;

import challenge02.utils.ASCIIUtils;
import io.Input;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            run(args[0]);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    static void run(String path) throws IOException {
        Input.init(path);
        String cipherLine;

        do {
            cipherLine = Input.readNextLine();
            if (cipherLine == null) break;

            String[] words = cipherLine.split(" ");
            List<String> decipheredWords = Arrays.stream(words)
                    .map(ASCIIUtils::parseAsciiToString)
                    .toList();

            for (int i = 0; i < decipheredWords.size(); i++) {
                if (i == decipheredWords.size()-1) System.out.print(decipheredWords.get(i));
                else System.out.print(decipheredWords.get(i) + " ");
            }
        } while (true);

    }
}
