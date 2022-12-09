
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_ZongXiangGunDongRongQi extends rg_ZhengBuJuQi {

    public rg_ZongXiangGunDongRongQi ()  { }

    public rg_ZongXiangGunDongRongQi (android.content.Context context, rg_AnZhuoZongXiangGunDongRongQi view, Object objInitData) { super (context, view, objInitData); }
    public rg_ZongXiangGunDongRongQi (android.content.Context context, rg_AnZhuoZongXiangGunDongRongQi view) { this (context, view, null); }
    public rg_AnZhuoZongXiangGunDongRongQi GetScrollView () { return (rg_AnZhuoZongXiangGunDongRongQi)GetView (); }
    public static rg_ZongXiangGunDongRongQi sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new rg_AnZhuoZongXiangGunDongRongQi (context), null);
    }
    public static rg_ZongXiangGunDongRongQi sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new rg_AnZhuoZongXiangGunDongRongQi (context), objInitData);
    }
    public static rg_ZongXiangGunDongRongQi sNewInstanceAndAttachView (android.content.Context context, rg_AnZhuoZongXiangGunDongRongQi viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_ZongXiangGunDongRongQi sNewInstanceAndAttachView (android.content.Context context, rg_AnZhuoZongXiangGunDongRongQi viewAttach, Object objInitData) {
        rg_ZongXiangGunDongRongQi objControl = new rg_ZongXiangGunDongRongQi (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}
