package challenge03;

import io.Input;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    final static String path = "/challenge03/colors.json";
    public static void main(String[] args) {
        try {
            run(Paths.get("").toAbsolutePath()+path);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    static void run(String path) throws IOException {
        Input.init(path);
        List<String> listOfColors;
        ArrayList<String> zebra = new ArrayList<>();
        do {
            listOfColors = Input.jsonArrayToList(String.class);
            if (listOfColors == null)
                break;

            String lastColor = null;
            int maxCount = 0;

            for (String color : listOfColors) {
                if (zebra.size() == 1 && zebra.get(0).equals(color))
                    continue;

                if (zebra.size() < 2 || zebra.get(zebra.size()-2).equals(color)) {
                    zebra.add(color);
                    continue;
                }

                if (zebra.size() >= maxCount) {
                    lastColor = zebra.get(zebra.size()-1);
                    maxCount = zebra.size();
                }
                zebra = new ArrayList<>(List.of(zebra.get(zebra.size()-1), color));
            }
            if (zebra.size() >= maxCount) {
                lastColor = zebra.get(zebra.size()-1);
                maxCount = zebra.size();
            }

            System.out.printf("%d, %s\n", maxCount, lastColor);
        } while (true);
    }

}
