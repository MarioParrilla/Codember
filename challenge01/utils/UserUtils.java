package challenge01.utils;

import challenge01.entity.User;

import java.util.Arrays;

public class UserUtils {

    public static User parseStringToUses(String strUser) {
        var props = strUser.split(" ");
        var user = new User();

        for (String p: props) {
            var propName = p.substring(0, p.indexOf(":"));
            var propValue = p.substring(p.indexOf(":")+1, p.length()) ;
            setValueToUser(user, propName,  propValue);
        }

        return user;
    }

    public static boolean isValidUser(User user) {
        return user.getUsr() != null && user.getEme() != null && user.getPsw() != null
                && user.getAge() != null && user.getLoc() != null && user.getFll() != null;
    }

    private static void setValueToUser(User user, String propName, String propValue) {
        switch (propName) {
            case "usr" -> user.setUsr(propValue);
            case "eme" -> user.setEme(propValue);
            case "psw" -> user.setPsw(propValue);
            case "age" -> user.setAge(propValue);
            case "loc" -> user.setLoc(propValue);
            case "fll" -> user.setFll(propValue);
        }
    }

}
