
package huoShan.Java.JiBen;

public class rg_DaShuLei {

    public static java.math.BigDecimal rg_ChuangJianZiXiaoShu (double rg_XiaoShuZhi1) {
        try {
            return new java.math.BigDecimal(rg_XiaoShuZhi1);
        } catch(Exception exception) {
            if(null != null) rg_KeFuHuoYiChangLei.rg_QuYiChangWenBen1(exception, null);
            return null;
        }
    }

    public static java.math.BigDecimal rg_ZhiJingDuZhi (java.math.BigDecimal rg_YuCaoZuoBenDuiXiang7313, int rg_JingDu25, int rg_SheRuMoShi) {
        try {
            return rg_YuCaoZuoBenDuiXiang7313.setScale(rg_JingDu25, rg_SheRuMoShi);
        } catch (Exception e) {
            return null;
        }
    }
}
