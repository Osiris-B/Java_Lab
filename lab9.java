import java.util.sc;

interface compute {
    public void convert();
}

class byt implements compute {
    public float kbytes = 0;

    public byt(float val) {
        this.kbytes = val;
    }

    public void convert() {
        float gb = kbytes / (1024 * 1024);
        System.out.println("value in kb = " + kbytes);
        System.out.println("value in gb = " + gb);
    }
}

class curr implements compute {
    public float euro = 0;

    public curr(float val) {
        this.euro = val;
    }

    public void convert() {
        double rupees = euro * 89.68;
        System.out.println("Value in euro = " + euro);
        System.out.println("value in rupees = " + rupees);
    }
}

public class lab9 {
    public static void main(String[] args) {
        sc sc = new sc(System.in);
        float kb, euro;

        System.out.println("enter the data in Kb: ");
        kb = sc.nextFloat();
        byt obj = new byt(kb);
        obj.convert();

        System.out.println("Enter the currency in Euro: ");
        euro = sc.nextFloat();
        curr obj2 = new curr(euro);
        obj2.convert();

        sc.close();
    }
}
