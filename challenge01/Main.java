package challenge01;

import challenge01.entity.User;
import challenge01.io.Input;
import challenge01.utils.UserUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            run(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    static void run(String path) throws IOException {
        Input.File(path);
        String userLine = null;
        User lastUser = new User();
        lastUser.setUsr("Null");
        int count = 0;

        do {
            userLine = Input.readNextLine();
            if (userLine == null) break;

            var tmp = UserUtils.parseStringToUses(userLine);
            if (UserUtils.isValidUser(tmp)) {
                lastUser = tmp;
                count++;
            }
            else System.out.println("Usuario no valido: "+tmp);
        } while (userLine != null);

        System.out.println(count+lastUser.getUsr());
    }
}
