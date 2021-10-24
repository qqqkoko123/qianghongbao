
package huoShan.AnZhuo.SheBei.DianHuaGuanLi;

public class rg_JiTongXinXiLei {

    public rg_JiTongXinXiLei ()  { }

    public static String rg_QuSNMa () {
        String rg_XuLieHao5 = "";
        try
        {
            java.lang.Class rg_DuiXiangLei;
            rg_DuiXiangLei = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.reflect.Method rg_FangFaXinXi;
            rg_FangFaXinXi = rg_DuiXiangLei.getMethod("get", String.class);
            rg_XuLieHao5 = huoShan.Java.JiBen.rg_DuiXiangLei3.rg_DuiXiangDaoWenBen (rg_FangFaXinXi.invoke(rg_DuiXiangLei, "ro.serialno"));
        }
        catch (Exception _vol_e_catched)
        {
        }
        return (rg_XuLieHao5);
    }

    public static String rg_QuAnZhuoID (android.content.Context rg_HuanJingDuiXiang48) {
        return android.provider.Settings.System.getString(rg_HuanJingDuiXiang48.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
    }
}
