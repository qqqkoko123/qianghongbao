
package huoShan.AnZhuo.HuanCunWenJianGongJuLei;

class rg_WenJianMingLeiDaoChangZhengShuLeiJianZhiDuiJiGeLei {

    public static java.lang.Long rg_JiaRuJianZhiDui (java.util.Map<java.io.File, java.lang.Long> rg_YuCaoZuoJiGeDuiXiang82, java.io.File rg_JianDuiXiang2, java.lang.Long rg_ZhiDuiXiang2) {
        try {
            return rg_YuCaoZuoJiGeDuiXiang82.put(rg_JianDuiXiang2, rg_ZhiDuiXiang2);
        } catch (Exception e) {
            return null;
        }
    }

    public static java.lang.Long rg_ShanChuJian1 (java.util.Map<java.io.File, java.lang.Long> rg_YuCaoZuoJiGeDuiXiang83, java.lang.Object rg_JianDuiXiang3) {
        try {
            return rg_YuCaoZuoJiGeDuiXiang83.remove(rg_JianDuiXiang3);
        } catch (Exception e) {
            return null;
        }
    }
}
