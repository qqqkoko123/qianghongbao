
package huoShan.Java.JiBen;

public final class rg_URLLei {

    public static java.net.URL rg_ChuangJian325 (String rg_GuiFan) {
        try {
            return new java.net.URL(rg_GuiFan);
        } catch (Exception e) {
            return null;
        }
    }

    public static java.net.URLConnection rg_DaKaiLianJie (java.net.URL rg_YuCaoZuoBenDuiXiang7378) {
        try {
            return rg_YuCaoZuoBenDuiXiang7378.openConnection();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.net.URLConnection rg_DaKaiLianJie1 (java.net.URL rg_YuCaoZuoBenDuiXiang7379, java.net.Proxy rg_DaiLiDuiXiang2) {
        try {
            return rg_YuCaoZuoBenDuiXiang7379.openConnection(rg_DaiLiDuiXiang2);
        } catch (Exception e) {
            return null;
        }
    }
}
