
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_BianJiKuang extends rg_WenBenKuang {

    public rg_BianJiKuang ()  { }

    public rg_BianJiKuang (android.content.Context context, EditText view, Object objInitData) { super (context, view, objInitData); }
    public rg_BianJiKuang (android.content.Context context, EditText view) { this (context, view, null); }
    public EditText GetEditText () { return (EditText)GetView (); }
    public static rg_BianJiKuang sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new EditText (context), null);
    }
    public static rg_BianJiKuang sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new EditText (context), objInitData);
    }
    public static rg_BianJiKuang sNewInstanceAndAttachView (android.content.Context context, EditText viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_BianJiKuang sNewInstanceAndAttachView (android.content.Context context, EditText viewAttach, Object objInitData) {
        rg_BianJiKuang objControl = new rg_BianJiKuang (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}
