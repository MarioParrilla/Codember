package challenge01;

import challenge01.entity.User;
import io.Input;
import java.io.IOException;

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
        String userLine;
        User lastUser = new User();
        int count = 0;

        do {
            userLine = Input.readNextLine();
            if (userLine == null) break;

            var tmp = new User();
            tmp.parseStringToUses(userLine);
            if (tmp.isValidUser()) {
                lastUser = tmp;
                count++;
            }
        } while (true);

        System.out.println(count+lastUser.getUsr());
    }
}
