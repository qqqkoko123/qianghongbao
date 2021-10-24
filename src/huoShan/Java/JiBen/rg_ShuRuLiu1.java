
package huoShan.Java.JiBen;

public class rg_ShuRuLiu1 {

    public static void rg_GuanBi56 (java.io.InputStream rg_SuoYuCaoZuoShuRuLiu1) {
        try {
            rg_SuoYuCaoZuoShuRuLiu1.close ();
        } catch (Exception e) { }
    }

    public static int rg_DouRuShuJu3 (java.io.InputStream rg_SuoYuCaoZuoShuRuLiu2, byte [] rg_YuDouRuDaoHuanChongOu2, int rg_QiShiDouRuWeiZhi, int rg_YuDouRuShuJuCheCun1, rg_ZhuangTaiLei rg_ZhuangTaiDuiXiang6) {
        if (rg_ZhuangTaiDuiXiang6 == null || rg_ZhuangTaiDuiXiang6.rg_YiShiBai1 () == false) {
           try {
               return rg_SuoYuCaoZuoShuRuLiu2.read (rg_YuDouRuDaoHuanChongOu2, rg_QiShiDouRuWeiZhi, rg_YuDouRuShuJuCheCun1);
           } catch (Exception e) {
               if (rg_ZhuangTaiDuiXiang6 != null)
                   rg_ZhuangTaiDuiXiang6.rg_ZhiZhuangTai (rg_ZhuangTaiLei.rg_ShiBai2);
           }
        }
        return -1;
    }

    public static int rg_DouRuShuJu4 (java.io.InputStream rg_SuoYuCaoZuoShuRuLiu3, byte [] rg_YuDouRuDaoHuanChongOu3, rg_ZhuangTaiLei rg_ZhuangTaiDuiXiang7) {
        return (rg_DouRuShuJu3 (rg_SuoYuCaoZuoShuRuLiu3, rg_YuDouRuDaoHuanChongOu3, 0, rg_YuDouRuDaoHuanChongOu3.length, rg_ZhuangTaiDuiXiang7));
    }
}
