
package huoShan.AnZhuo.JiBen;

public final class rg_ChengXuPeiZhiBiao {

    public static android.content.SharedPreferences.Editor rg_QuXiuGaiQi (android.content.SharedPreferences rg_SuoYuXiuGaiPeiZhiBiao, boolean rg_ShiFouQingChuYuanNeiRong) {
        android.content.SharedPreferences.Editor objEditor = rg_SuoYuXiuGaiPeiZhiBiao.edit ();
        if (rg_ShiFouQingChuYuanNeiRong) objEditor.clear ();
        return objEditor;
    }

    public static String rg_QuWenBenPeiZhiXiang (android.content.SharedPreferences rg_SuoCaoZuoPeiZhiBiao1, String rg_PeiZhiXiangMingChen8, String rg_MoRenZhi20) {
        try {
            return rg_SuoCaoZuoPeiZhiBiao1.getString (rg_PeiZhiXiangMingChen8, rg_MoRenZhi20);
        } catch (Exception e) {
            return rg_MoRenZhi20;
        }
    }
}
