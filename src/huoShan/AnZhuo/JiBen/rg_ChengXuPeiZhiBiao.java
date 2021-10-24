
package huoShan.AnZhuo.JiBen;

public final class rg_ChengXuPeiZhiBiao {

    public static android.content.SharedPreferences.Editor rg_QuXiuGaiQi (android.content.SharedPreferences rg_SuoYuXiuGaiPeiZhiBiao, boolean rg_ShiFouQingChuYuanNeiRong) {
        android.content.SharedPreferences.Editor objEditor = rg_SuoYuXiuGaiPeiZhiBiao.edit ();
        if (rg_ShiFouQingChuYuanNeiRong) objEditor.clear ();
        return objEditor;
    }
}
