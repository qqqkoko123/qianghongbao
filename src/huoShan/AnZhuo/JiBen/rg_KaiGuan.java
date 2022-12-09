
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_KaiGuan extends rg_ZuGeAnNiuJiChuLei {

    public rg_KaiGuan ()  { }

    public rg_KaiGuan (android.content.Context context, Switch view, Object objInitData) { super (context, view, objInitData); }
    public rg_KaiGuan (android.content.Context context, Switch view) { this (context, view, null); }
    public Switch GetSwitch () { return (Switch)GetView (); }
    public static rg_KaiGuan sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new Switch (context), null);
    }
    public static rg_KaiGuan sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new Switch (context), objInitData);
    }
    public static rg_KaiGuan sNewInstanceAndAttachView (android.content.Context context, Switch viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_KaiGuan sNewInstanceAndAttachView (android.content.Context context, Switch viewAttach, Object objInitData) {
        rg_KaiGuan objControl = new rg_KaiGuan (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}
