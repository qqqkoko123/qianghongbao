
package huoShan.AnZhuo.JiBen;

public class rg_JianTieBanGuanLiQi {

    public rg_JianTieBanGuanLiQi ()  { }

    android.content.ClipboardManager.OnPrimaryClipChangedListener m_listener;

    public static boolean rg_JianTieBanShiFouBuWeiKong () {
        android.content.ClipboardManager mgrClip = (android.content.ClipboardManager)rg_YingYongChengXu.sGetApp ().getSystemService (android.content.Context.CLIPBOARD_SERVICE);
        return mgrClip.hasPrimaryClip ();
    }

    public static android.content.ClipData rg_QuJianTieBanShuJu () {
        android.content.ClipboardManager mgrClip = (android.content.ClipboardManager)rg_YingYongChengXu.sGetApp ().getSystemService (android.content.Context.CLIPBOARD_SERVICE);
        return (mgrClip.hasPrimaryClip () ? mgrClip.getPrimaryClip () : null);
    }

    public static void rg_ZhiJianTieBanShuJu (android.content.ClipData rg_YuSheZhiJianTieShuJu) {
        android.content.ClipboardManager mgrClip = (android.content.ClipboardManager)rg_YingYongChengXu.sGetApp ().getSystemService (android.content.Context.CLIPBOARD_SERVICE);
        mgrClip.setPrimaryClip (rg_YuSheZhiJianTieShuJu);
    }

    public static void rg_ZhiJianTieBanWenBen (String rg_YuSheZhiWenBenNeiRong, String rg_BiaoQian8) {
        android.content.ClipboardManager mgrClip = (android.content.ClipboardManager)rg_YingYongChengXu.sGetApp ().getSystemService (android.content.Context.CLIPBOARD_SERVICE);
        mgrClip.setPrimaryClip (android.content.ClipData.newPlainText (rg_BiaoQian8, rg_YuSheZhiWenBenNeiRong));
    }
}
