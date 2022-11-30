package challenge05;

import io.Input;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    final static String path = "/challenge05/data.json";

    public static void main(String[] args) {
        try {
            run(Paths.get("").toAbsolutePath()+path);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    static void run(String path) throws IOException {
        Input.init(path);
        String[] survivors = Input.jsonArrayToList(String.class).toArray(new String[0]);
        int indexOfSurvivor = 0;
        int countOfKills = 0;
        boolean run = true;
        while (run) {
            for (int i = 0; i < survivors.length; i++) {
                if (countOfKills == survivors.length-1) {
                    run = false;
                    break;
                }
                if (survivors[i].equals("x"))
                    continue;
                if (i+1 == survivors.length)
                    survivors[0] = "x";
                else {
                    int count = i;
                    while (survivors[count+1].equals("x"))
                        if (count+1 == survivors.length-1)
                            count = -1;
                        else
                            count++;
                    survivors[count+1] = "x";
                }
                indexOfSurvivor = i;
                countOfKills++;
            }
        }
        System.out.printf("%s-%d", survivors[indexOfSurvivor], indexOfSurvivor);
    }

}
