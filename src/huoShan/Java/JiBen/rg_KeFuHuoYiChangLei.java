
package huoShan.Java.JiBen;

public class rg_KeFuHuoYiChangLei {

    public static void rg_QuYiChangWenBen1 (java.lang.Throwable rg_YuCaoZuoBenDuiXiang7392, java.lang.StringBuilder rg_CuoWuXinXi22) {
        Throwable e = rg_YuCaoZuoBenDuiXiang7392;
        rg_CuoWuXinXi22.setLength (0);
        rg_CuoWuXinXi22.append (e.getMessage ()).append (" [").append (e.getClass ().getName ()).append ("]");
        e = e.getCause ();
        while (e != null) {
            rg_CuoWuXinXi22.append ("\n- ").append (e.getMessage ()).append (" [").append (e.getClass ().getName ()).append ("]");
            e = e.getCause();
        }
    }
}
