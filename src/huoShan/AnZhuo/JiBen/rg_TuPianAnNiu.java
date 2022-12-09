
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_TuPianAnNiu extends rg_TuPianKuang {

    public rg_TuPianAnNiu ()  { }

    public rg_TuPianAnNiu (android.content.Context context, ImageButton view, Object objInitData) { super (context, view, objInitData); }
    public rg_TuPianAnNiu (android.content.Context context, ImageButton view) { this (context, view, null); }
    public ImageButton GetImageButton () { return (ImageButton)GetView (); }
    public static rg_TuPianAnNiu sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new ImageButton (context), null);
    }
    public static rg_TuPianAnNiu sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new ImageButton (context), objInitData);
    }
    public static rg_TuPianAnNiu sNewInstanceAndAttachView (android.content.Context context, ImageButton viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_TuPianAnNiu sNewInstanceAndAttachView (android.content.Context context, ImageButton viewAttach, Object objInitData) {
        rg_TuPianAnNiu objControl = new rg_TuPianAnNiu (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    protected void OnInitView (android.content.Context context, Object objInitData) {
        super.OnInitView (context, objInitData);
        rg_ZhiChiChanJi1 (true);
    }
}
