
package huoShan.Java.JiBen;

public final class rg_WenBenXingLei {

    public static int rg_WenBenDaoZhengShu (String rg_DaiZhuaiHuanWenBen3) {
        try {
            return Integer.parseInt (rg_DaiZhuaiHuanWenBen3);
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean rg_WenBenShiFouWeiKong (String rg_DaiChuLiWenBen1) {
        return (rg_DaiChuLiWenBen1 == null || rg_DaiChuLiWenBen1.isEmpty ());
    }

    public static String rg_ZiJieShuZuDaoWenBen (byte [] rg_ZiJieShuJu3) {
        try {
            return new String (rg_ZiJieShuJu3);
        } catch (Exception e) {
            return "";
        }
    }

    public static String rg_ZhiDingBianMaZiJieShuZuDaoWenBen (byte [] rg_ZiJieShuJu5, String rg_WenBenBianMaGeShi2) {
        try {
            return new String (rg_ZiJieShuJu5, rg_WenBenBianMaGeShi2);
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean rg_WenBenXiangDeng (String rg_WenBen32, String rg_WenBen33, boolean rg_ShiFouHuLueDaXiaoXie1) {
        return (rg_ShiFouHuLueDaXiaoXie1 ? rg_WenBen32.equalsIgnoreCase (rg_WenBen33) :  rg_WenBen32.equals (rg_WenBen33));
    }

    public static byte [] rg_WenBenDaoZhiDingBianMaZiJieShuZu (String rg_YuCaoZuoWenBen4, String rg_WenBenBianMaGeShi4) {
         try {
             return rg_YuCaoZuoWenBen4.getBytes (rg_WenBenBianMaGeShi4);
         } catch (Exception e) {
             return null;
         }
    }

    public static String rg_QuZiWenBen (String rg_YuCaoZuoWenBen17, int rg_QiShiSuoYinWeiZhi, int rg_SuoQuZiWenBenChangDu) {
        if (rg_SuoQuZiWenBenChangDu < 0)
            return rg_YuCaoZuoWenBen17.substring (rg_QiShiSuoYinWeiZhi);
        else
            return rg_YuCaoZuoWenBen17.substring (rg_QiShiSuoYinWeiZhi, rg_QiShiSuoYinWeiZhi + rg_SuoQuZiWenBenChangDu);
    }

    public static String rg_QuWenBenYouBian (String rg_YuCaoZuoWenBen20, int rg_YouCeZiWenBenChangDu) {
        final int nLength = rg_YuCaoZuoWenBen20.length ();
        return rg_YuCaoZuoWenBen20.substring (nLength - rg_YouCeZiWenBenChangDu, nLength);
    }
}
