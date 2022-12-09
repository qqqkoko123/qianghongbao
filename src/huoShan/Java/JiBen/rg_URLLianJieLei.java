
package huoShan.Java.JiBen;

public class rg_URLLianJieLei {

    public static void rg_LianJieChaoShi17 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7424, int rg_ChaoShi39) {
        try {
            rg_YuCaoZuoBenDuiXiang7424.setConnectTimeout(rg_ChaoShi39);
        } catch (Exception e) { }
    }

    public static void rg_DaKaiShuRu1 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7436, boolean rg_ShiFouYunXu17) {
        try {
            rg_YuCaoZuoBenDuiXiang7436.setDoInput(rg_ShiFouYunXu17);
        } catch (Exception e) { }
    }

    public static void rg_DaKaiXieChu1 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7438, boolean rg_ShiFouYunXu18) {
        try {
            rg_YuCaoZuoBenDuiXiang7438.setDoOutput(rg_ShiFouYunXu18);
        } catch (Exception e) { }
    }

    public static java.io.InputStream rg_ShuRuLiu2 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7442) {
        try {
            return rg_YuCaoZuoBenDuiXiang7442.getInputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.io.OutputStream rg_ShuChuLiu2 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7443) {
        try {
            return rg_YuCaoZuoBenDuiXiang7443.getOutputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.util.Map<String, java.util.List<String>> rg_SuoYouXiangYingTou (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7445) {
        return rg_YuCaoZuoBenDuiXiang7445.getHeaderFields();
    }

    public static void rg_TianJiaQingQiuTou4 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7457, String rg_JianMing87, String rg_JianZhi15) {
        try {
            rg_YuCaoZuoBenDuiXiang7457.addRequestProperty(rg_JianMing87, rg_JianZhi15);
        } catch (Exception e) { }
    }

    public static void rg_LianJie22 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7459) {
        try {
            rg_YuCaoZuoBenDuiXiang7459.connect();
        } catch (Exception e) { }
    }
}
