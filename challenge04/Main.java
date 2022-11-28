package challenge04;

import io.Input;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        final int MIN = 11098;
        final int MAX = 98123;
        ArrayList<Integer> validPasswords = new ArrayList<>();

        for (int i = MIN; i <= MAX; i++) {
            boolean isValid = false;
            int lastNum = 0;
            String stringNum = String.valueOf(i);

            for (String current : stringNum.split("")) {
                int currentNum = Integer.parseInt(current);
                if (currentNum >= lastNum) {
                    lastNum = currentNum;
                    isValid = true;
                }
                else {
                    isValid = false;
                    break;
                }
            }
            if (stringNum.replaceAll("[123467890]","").length() > 1 && isValid)
                validPasswords.add(i);
        }
        System.out.printf("%d-%d", validPasswords.size(), validPasswords.get(55));
    }

}
