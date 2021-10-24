
package huoShan.Java.JiBen;

public class rg_KeFuHuoYiChangLei {

    public static void rg_QuYiChangWenBen1 (java.lang.Throwable rg_YuCaoZuoBenDuiXiang7353, java.lang.StringBuilder rg_CuoWuXinXi19) {
        Throwable e = rg_YuCaoZuoBenDuiXiang7353;
        rg_CuoWuXinXi19.setLength (0);
        rg_CuoWuXinXi19.append (e.getMessage ()).append (" [").append (e.getClass ().getName ()).append ("]");
        e = e.getCause ();
        while (e != null) {
            rg_CuoWuXinXi19.append ("\n- ").append (e.getMessage ()).append (" [").append (e.getClass ().getName ()).append ("]");
            e = e.getCause();
        }
    }
}
