
package huoShan.AnZhuo.ZuJian;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_GaoJiJianRongBianJiKuang extends huoShan.AnZhuo.JiBen.rg_BianJiKuang {

    public rg_GaoJiJianRongBianJiKuang ()  { }

    public rg_GaoJiJianRongBianJiKuang (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText view, Object objInitData) { super (context, view, objInitData); }
    public rg_GaoJiJianRongBianJiKuang (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText view) { this (context, view, null); }
    public com.rengwuxian.materialedittext.MaterialEditText GetMaterialEditText () { return (com.rengwuxian.materialedittext.MaterialEditText)GetView (); }
    public static rg_GaoJiJianRongBianJiKuang sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new com.rengwuxian.materialedittext.MaterialEditText (context), null);
    }
    public static rg_GaoJiJianRongBianJiKuang sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new com.rengwuxian.materialedittext.MaterialEditText (context), objInitData);
    }
    public static rg_GaoJiJianRongBianJiKuang sNewInstanceAndAttachView (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_GaoJiJianRongBianJiKuang sNewInstanceAndAttachView (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText viewAttach, Object objInitData) {
        rg_GaoJiJianRongBianJiKuang objControl = new rg_GaoJiJianRongBianJiKuang (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }

    public void rg_QiYongQingChuAnNiu (final boolean rg_XianShi41) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setShowClearButton (rg_XianShi41);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setShowClearButton (rg_XianShi41);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_FuDongDiShiNeiRong (final String rg_NeiRong12) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setFloatingLabelText (rg_NeiRong12);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setFloatingLabelText (rg_NeiRong12);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_JiBenYanSe (final int rg_YanSe59) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setBaseColor (rg_YanSe59);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setBaseColor (rg_YanSe59);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_JiaoDianYanSe (final int rg_YanSe60) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setPrimaryColor (rg_YanSe60);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setPrimaryColor (rg_YanSe60);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_FuDongBiaoQianLeiXing (final int rg_LeiXing27) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setFloatingLabel (rg_LeiXing27);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setFloatingLabel (rg_LeiXing27);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZuiDaZiFuShu (final int rg_ZuiDaShuLiang1) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setMaxCharacters (rg_ZuiDaShuLiang1);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setMaxCharacters (rg_ZuiDaShuLiang1);
                    } catch (Exception e) { }
                } } );
        }
    }
}
