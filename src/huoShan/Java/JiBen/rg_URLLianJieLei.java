
package huoShan.Java.JiBen;

public class rg_URLLianJieLei {

    public static void rg_LianJieChaoShi15 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7385, int rg_ChaoShi35) {
        try {
            rg_YuCaoZuoBenDuiXiang7385.setConnectTimeout(rg_ChaoShi35);
        } catch (Exception e) { }
    }

    public static void rg_DaKaiShuRu1 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7397, boolean rg_ShiFouYunXu15) {
        try {
            rg_YuCaoZuoBenDuiXiang7397.setDoInput(rg_ShiFouYunXu15);
        } catch (Exception e) { }
    }

    public static void rg_DaKaiXieChu1 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7399, boolean rg_ShiFouYunXu16) {
        try {
            rg_YuCaoZuoBenDuiXiang7399.setDoOutput(rg_ShiFouYunXu16);
        } catch (Exception e) { }
    }

    public static java.io.InputStream rg_ShuRuLiu2 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7403) {
        try {
            return rg_YuCaoZuoBenDuiXiang7403.getInputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.io.OutputStream rg_ShuChuLiu2 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7404) {
        try {
            return rg_YuCaoZuoBenDuiXiang7404.getOutputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.util.Map<String, java.util.List<String>> rg_SuoYouXiangYingTou (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7406) {
        return rg_YuCaoZuoBenDuiXiang7406.getHeaderFields();
    }

    public static void rg_TianJiaQingQiuTou3 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7418, String rg_JianMing84, String rg_JianZhi12) {
        try {
            rg_YuCaoZuoBenDuiXiang7418.addRequestProperty(rg_JianMing84, rg_JianZhi12);
        } catch (Exception e) { }
    }

    public static void rg_LianJie22 (java.net.URLConnection rg_YuCaoZuoBenDuiXiang7420) {
        try {
            rg_YuCaoZuoBenDuiXiang7420.connect();
        } catch (Exception e) { }
    }
}
