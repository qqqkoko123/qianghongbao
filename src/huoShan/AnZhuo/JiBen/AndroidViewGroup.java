
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndroidViewGroup extends AndroidView {

    public AndroidViewGroup ()  { }

    public AndroidViewGroup (android.content.Context context, ViewGroup view, Object objInitData) { super (context, view, objInitData); }
    public AndroidViewGroup (android.content.Context context, ViewGroup view) { this (context, view, null); }
    public ViewGroup GetViewGroup () { return (ViewGroup)GetView (); }
    public static AndroidViewGroup sNewInstance (android.content.Context context) {
        return null;
    }
    public static AndroidViewGroup sNewInstance (android.content.Context context, Object objInitData) {
        return null;
    }

    public void rg_TianJiaZiZuJian2 (AndroidView rg_YuTianJiaZuJian2, AndroidView rg_WeiZhiZuJian) {
        final ViewGroup vg = GetViewGroup ();
        final View viewAdd = rg_YuTianJiaZuJian2.GetView ();
        final int nIndex = (rg_WeiZhiZuJian == null ? -1 : vg.indexOfChild (rg_WeiZhiZuJian.GetView ()));
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                if (nIndex < 0)
                    vg.addView (viewAdd);
                else
                    vg.addView (viewAdd, nIndex);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        if (nIndex < 0)
                                vg.addView (viewAdd);
                            else
                                vg.addView (viewAdd, nIndex);
                    } catch (Exception e) { }
                } } );
        }
    }
}
