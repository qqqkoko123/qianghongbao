
package huoShan.Java.JiBen;

public class rg_ShuChuLiu1 {

    public static void rg_GuanBi58 (java.io.OutputStream rg_SuoYuCaoZuoShuChuLiu) {
        try {
            rg_SuoYuCaoZuoShuChuLiu.close ();
        } catch (Exception e) { }
    }

    public static boolean rg_XieChuHuanCun2 (java.io.OutputStream rg_SuoYuCaoZuoShuChuLiu1, rg_ZhuangTaiLei rg_ZhuangTaiDuiXiang32) {
        if (rg_ZhuangTaiDuiXiang32 == null || rg_ZhuangTaiDuiXiang32.rg_YiShiBai1 () == false) {
           try {
               rg_SuoYuCaoZuoShuChuLiu1.flush ();
               return true;
           } catch (Exception e) {
               if (rg_ZhuangTaiDuiXiang32 != null)
                   rg_ZhuangTaiDuiXiang32.rg_ZhiZhuangTai (rg_ZhuangTaiLei.rg_ShiBai3);
           }
        }
        return false;
    }

    public static boolean rg_XieChuShuJu3 (java.io.OutputStream rg_SuoYuCaoZuoShuChuLiu2, byte [] rg_YuXieChuShuJu1, int rg_YuXieChuShuJuShouWeiZhi, int rg_YuXieChuShuJuCheCun, rg_ZhuangTaiLei rg_ZhuangTaiDuiXiang33) {
        if (rg_ZhuangTaiDuiXiang33 == null || rg_ZhuangTaiDuiXiang33.rg_YiShiBai1 () == false) {
           try {
               rg_SuoYuCaoZuoShuChuLiu2.write (rg_YuXieChuShuJu1, rg_YuXieChuShuJuShouWeiZhi, rg_YuXieChuShuJuCheCun);
               return true;
           } catch (Exception e) {
               if (rg_ZhuangTaiDuiXiang33 != null)
                   rg_ZhuangTaiDuiXiang33.rg_ZhiZhuangTai (rg_ZhuangTaiLei.rg_ShiBai3);
           }
        }
        return false;
    }

    public static boolean rg_XieChuShuJu4 (java.io.OutputStream rg_SuoYuCaoZuoShuChuLiu3, byte [] rg_YuXieChuShuJu2, rg_ZhuangTaiLei rg_ZhuangTaiDuiXiang34) {
        return (rg_XieChuShuJu3 (rg_SuoYuCaoZuoShuChuLiu3, rg_YuXieChuShuJu2, 0, rg_YuXieChuShuJu2.length, rg_ZhuangTaiDuiXiang34));
    }
}
