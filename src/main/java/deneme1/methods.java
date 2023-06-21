package deneme1;

import java.util.ArrayList;
import java.util.Objects;


public class methods {

    ArrayList<Objects> urunList = new ArrayList<Objects>();

    public Objects urunTanimlama(String urunID, String urunIsmi, String uretici, int miktar, String birim, String raf) {

        urunList.add(urunID,urunIsmi,uretici,miktar,birim,raf);
    }

    public String urunListele() {
        System.out.println(urunList);

    }

    public String urunGirisi() {

    }

    public String urunuRafaKoy() {

    }

    public urunCikisi() {

    }
}
