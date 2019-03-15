import java.util.*;

public class Aplikasi {

    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = new Integer("5");

        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);

        Properties prop = new Properties();
        prop.setProperty("angka", "23");
        System.setProperties(prop);
        Integer hasil = Integer.getInteger("angka", 0);
        System.out.println("hasil : " + hasil);

    }

}