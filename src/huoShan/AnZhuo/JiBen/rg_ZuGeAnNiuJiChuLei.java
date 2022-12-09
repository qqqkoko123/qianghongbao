
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_ZuGeAnNiuJiChuLei extends rg_AnNiu {

    public rg_ZuGeAnNiuJiChuLei ()  { }

    public rg_ZuGeAnNiuJiChuLei (android.content.Context context, CompoundButton view, Object objInitData) { super (context, view, objInitData); }
    public rg_ZuGeAnNiuJiChuLei (android.content.Context context, CompoundButton view) { this (context, view, null); }
    public CompoundButton GetCompoundButton () { return (CompoundButton)GetView (); }
    public static rg_ZuGeAnNiuJiChuLei sNewInstance (android.content.Context context) {
        return null;
    }
    public static rg_ZuGeAnNiuJiChuLei sNewInstance (android.content.Context context, Object objInitData) {
        return null;
    }
    @Override
    protected void OnInitView (android.content.Context context, Object objInitData) {
        super.OnInitView (context, objInitData);
        GetCompoundButton ().setOnCheckedChangeListener (new CompoundButton.OnCheckedChangeListener () {
                public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                    rg_XuanZhongZhuangTaiBeiGaiBian1 (isChecked);
                } } );
    }

    public static interface re_XuanZhongZhuangTaiBeiGaiBian1 { int dispatch (rg_ZuGeAnNiuJiChuLei objSource, int nTagNumber, boolean rg_DangQianXuanZhongZhuangTai1); }
    private re_XuanZhongZhuangTaiBeiGaiBian1 rd_XuanZhongZhuangTaiBeiGaiBian1;
    private int rd_XuanZhongZhuangTaiBeiGaiBian1_tag;
    public void rl_ZuGeAnNiuJiChuLei_XuanZhongZhuangTaiBeiGaiBian1 (re_XuanZhongZhuangTaiBeiGaiBian1 objListener, int nTagNumber) {
        synchronized (this) { rd_XuanZhongZhuangTaiBeiGaiBian1 = objListener;  rd_XuanZhongZhuangTaiBeiGaiBian1_tag = nTagNumber; }
    }
    public int rg_XuanZhongZhuangTaiBeiGaiBian1 (boolean rg_DangQianXuanZhongZhuangTai1) {
        re_XuanZhongZhuangTaiBeiGaiBian1 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_XuanZhongZhuangTaiBeiGaiBian1;  nTagNumber = rd_XuanZhongZhuangTaiBeiGaiBian1_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DangQianXuanZhongZhuangTai1) : 0);
    }

    public void rg_XuanZhong5 (final boolean rg_ShiFouBeiXuanZhong6) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetCompoundButton ().setChecked (rg_ShiFouBeiXuanZhong6);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetCompoundButton ().setChecked (rg_ShiFouBeiXuanZhong6);
                    } catch (Exception e) { }
                } } );
        }
    }
}
