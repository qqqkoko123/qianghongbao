
package huoShan.Java.JiBen;

public class rg_URLBianMaLei {

    public static String rg_BianMa5 (String rg_DaiBianMaWenBen, String rg_BianMaLeiXing7) {
        try {
            return java.net.URLEncoder.encode(rg_DaiBianMaWenBen, rg_BianMaLeiXing7);
        } catch (Exception e) {
            return null;
        }
    }
}
