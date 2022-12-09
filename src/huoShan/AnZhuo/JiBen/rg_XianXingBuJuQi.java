
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_XianXingBuJuQi extends AndroidViewGroup {

    public rg_XianXingBuJuQi ()  { }

    public rg_XianXingBuJuQi (android.content.Context context, LinearLayout view, Object objInitData) { super (context, view, objInitData); }
    public rg_XianXingBuJuQi (android.content.Context context, LinearLayout view) { this (context, view, null); }
    public LinearLayout GetLinearLayout () { return (LinearLayout)GetView (); }
    public static rg_XianXingBuJuQi sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new LinearLayout (context), null);
    }
    public static rg_XianXingBuJuQi sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new LinearLayout (context), objInitData);
    }
    public static rg_XianXingBuJuQi sNewInstanceAndAttachView (android.content.Context context, LinearLayout viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_XianXingBuJuQi sNewInstanceAndAttachView (android.content.Context context, LinearLayout viewAttach, Object objInitData) {
        rg_XianXingBuJuQi objControl = new rg_XianXingBuJuQi (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }

    public void rg_BuJuFangXiang1 (final int rg_SuoSheZhiBuJuFangXiang) {
        if ((this.GetLinearLayout ().getOrientation ()) != rg_SuoSheZhiBuJuFangXiang)
        {
            if (rg_YingYongChengXu.sIsUiThread ()) {
                try {
                    GetLinearLayout ().setOrientation (rg_SuoSheZhiBuJuFangXiang);
                } catch (Exception e) { }
            } else {
                rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                    @Override public void run () {
                        try {
                            GetLinearLayout ().setOrientation (rg_SuoSheZhiBuJuFangXiang);
                        } catch (Exception e) { }
                    } } );
            }
        }
    }

    public void rg_NeiRongShuiPingDuiJiFangShi2 (final int rg_YuSheZhiDuiJiFangShi2) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetLinearLayout ().setHorizontalGravity (rg_YuSheZhiDuiJiFangShi2);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetLinearLayout ().setHorizontalGravity (rg_YuSheZhiDuiJiFangShi2);
                    } catch (Exception e) { }
                } } );
        }
    }
}
