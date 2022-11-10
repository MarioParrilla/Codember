package challenge01.entity;

public class User {

    private String usr;
    private String eme;
    private String psw;
    private String age;
    private String loc;
    private String fll;

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getEme() {
        return eme;
    }

    public void setEme(String eme) {
        this.eme = eme;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getFll() {
        return fll;
    }

    public void setFll(String fll) {
        this.fll = fll;
    }

    @Override
    public String toString() {
        return "User{" +
                "usr='" + usr + '\'' +
                ", eme='" + eme + '\'' +
                ", psw='" + psw + '\'' +
                ", age='" + age + '\'' +
                ", loc='" + loc + '\'' +
                ", fll='" + fll + '\'' +
                '}';
    }
}
