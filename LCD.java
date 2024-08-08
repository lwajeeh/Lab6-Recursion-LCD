public class LCD {

    public static void main(String[] args) {

    System.out.println(lcd(11,5,22,17,1));
    }

    public static int lcd(int fn, int fd, int sn, int sd, int i) {
        if ((fd * i)%sd == 0) {
            return fd * i;
        } else {
            return lcd(fn, fd, sn, sd, i + 1);
        }
    }
}