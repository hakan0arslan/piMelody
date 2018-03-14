package piMelody;


import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main{
    public static void main(String[] args) {
        //create object to convert values to notes
        PiConverter con = new PiConverter();
        try {
            //taking pi value from url
            URL url =new URL("http://www.angio.net/pi/digits/pi1000000.txt");
            URLConnection uc;
            uc = url.openConnection();
            uc.addRequestProperty("User-Agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            uc.connect();
            uc.getInputStream();
            BufferedInputStream in = new BufferedInputStream(uc.getInputStream());
            while(in.available()>0){
                char c = (char)in.read();
                con.convert(Character.getNumericValue(c));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
