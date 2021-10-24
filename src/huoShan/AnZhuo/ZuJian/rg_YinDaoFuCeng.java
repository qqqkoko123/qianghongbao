
package huoShan.AnZhuo.ZuJian;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_YinDaoFuCeng extends huoShan.AnZhuo.JiBen.AndroidView {

    public rg_YinDaoFuCeng ()  { }

    public rg_YinDaoFuCeng (android.content.Context context, rg_YinDaoFuCengJiChuLei view, Object objInitData) { super (context, view, objInitData); }
    public rg_YinDaoFuCeng (android.content.Context context, rg_YinDaoFuCengJiChuLei view) { this (context, view, null); }
    public rg_YinDaoFuCengJiChuLei GetUserGuide () { return (rg_YinDaoFuCengJiChuLei)GetView (); }
    public static rg_YinDaoFuCeng sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new rg_YinDaoFuCengJiChuLei (context), null);
    }
    public static rg_YinDaoFuCeng sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new rg_YinDaoFuCengJiChuLei (context), objInitData);
    }
    public static rg_YinDaoFuCeng sNewInstanceAndAttachView (android.content.Context context, rg_YinDaoFuCengJiChuLei viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_YinDaoFuCeng sNewInstanceAndAttachView (android.content.Context context, rg_YinDaoFuCengJiChuLei viewAttach, Object objInitData) {
        rg_YinDaoFuCeng objControl = new rg_YinDaoFuCeng (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    public void setHighLightView(final huoShan.AnZhuo.JiBen.AndroidView... views){
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetUserGuide().setHighLightView(views);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetUserGuide().setHighLightView(views);
                    } catch (Exception e) { }
                } } );
        }
    }

    public boolean rg_ZhiChiGuanBiJianTing1 () {
        return GetUserGuide().isListener();
    }
}
