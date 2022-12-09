
package huoShan.AnZhuo.JiBen;

import android.view.ViewGroup;

public class rg_DuiHuaKuangLei extends huoShan.Java.JiBen.rg_BiaoJiLei implements android.content.DialogInterface.OnShowListener,
android.content.DialogInterface.OnDismissListener,
android.content.DialogInterface.OnCancelListener {

    public rg_DuiHuaKuangLei ()  { }

    public android.app.Dialog m_dlg;
    public rg_DuiHuaKuangLei (android.app.Dialog dlg) {
        init (dlg);
    }
    void init (android.app.Dialog dlg) {
        m_dlg = dlg;
        m_dlg.setOnShowListener (this);
        m_dlg.setOnDismissListener (this);
        m_dlg.setOnCancelListener (this);
    }
    @Override public void onShow (android.content.DialogInterface dialog) { rg_BeiXianShi (); }
    @Override public void onDismiss (android.content.DialogInterface dialog) { rg_BeiGuanBi1 (); }
    @Override public void onCancel (android.content.DialogInterface dialog) { rg_BeiZhongZhi (); }

    public void rg_BiaoTi11 (final String rg_BiaoTiNeiRong) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_dlg.setTitle (rg_BiaoTiNeiRong);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.setTitle (rg_BiaoTiNeiRong);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_JieWaiChuMoGuanBi1 (boolean rg_ShiFouGuanBi1) {
        m_dlg.setCanceledOnTouchOutside (rg_ShiFouGuanBi1);
    }

    public void rg_TuiHuiJianGuanBi (boolean rg_ShiFouKeYiGuanBi) {
        m_dlg.setCancelable (rg_ShiFouKeYiGuanBi);
    }

    public void rg_XianShi13 () {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_dlg.show ();
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_GuanBi3 () {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_dlg.dismiss ();
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.dismiss ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public AndroidView rg_ChaZhaoZuJian (int rg_YuChaZhaoZuJianID3) {
        return AndroidView.sSafeGetVolView (m_dlg.findViewById (rg_YuChaZhaoZuJianID3));
    }

    public void rg_BeiJingSe3 (final int rg_YuSheZhiYanSe12) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_dlg.getWindow ().getDecorView ().setBackgroundColor (rg_YuSheZhiYanSe12);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.getWindow ().getDecorView ().setBackgroundColor (rg_YuSheZhiYanSe12);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiXuQiuCheCun1 (final int rg_YuSheZhiKuanDuZhi6, final int rg_YuSheZhiGaoDuZhi6) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                android.view.WindowManager.LayoutParams params = m_dlg.getWindow().getAttributes();
                if (params != null) {
                    params.width = rg_YuSheZhiKuanDuZhi6;
                    params.height = rg_YuSheZhiGaoDuZhi6;
                    m_dlg.getWindow().setAttributes (params);
                };
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        android.view.WindowManager.LayoutParams params = m_dlg.getWindow().getAttributes();
                            if (params != null) {
                                params.width = rg_YuSheZhiKuanDuZhi6;
                                params.height = rg_YuSheZhiGaoDuZhi6;
                                m_dlg.getWindow().setAttributes (params);
                            };
                    } catch (Exception e) { }
                } } );
        }
    }

    public static interface re_BeiXianShi { int dispatch (rg_DuiHuaKuangLei objSource, int nTagNumber); }
    private re_BeiXianShi rd_BeiXianShi;
    private int rd_BeiXianShi_tag;
    public void rl_DuiHuaKuangLei_BeiXianShi (re_BeiXianShi objListener, int nTagNumber) {
        synchronized (this) { rd_BeiXianShi = objListener;  rd_BeiXianShi_tag = nTagNumber; }
    }
    public int rg_BeiXianShi () {
        re_BeiXianShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BeiXianShi;  nTagNumber = rd_BeiXianShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_BeiZhongZhi { int dispatch (rg_DuiHuaKuangLei objSource, int nTagNumber); }
    private re_BeiZhongZhi rd_BeiZhongZhi;
    private int rd_BeiZhongZhi_tag;
    public void rl_DuiHuaKuangLei_BeiZhongZhi (re_BeiZhongZhi objListener, int nTagNumber) {
        synchronized (this) { rd_BeiZhongZhi = objListener;  rd_BeiZhongZhi_tag = nTagNumber; }
    }
    public int rg_BeiZhongZhi () {
        re_BeiZhongZhi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BeiZhongZhi;  nTagNumber = rd_BeiZhongZhi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_BeiGuanBi1 { int dispatch (rg_DuiHuaKuangLei objSource, int nTagNumber); }
    private re_BeiGuanBi1 rd_BeiGuanBi1;
    private int rd_BeiGuanBi1_tag;
    public void rl_DuiHuaKuangLei_BeiGuanBi1 (re_BeiGuanBi1 objListener, int nTagNumber) {
        synchronized (this) { rd_BeiGuanBi1 = objListener;  rd_BeiGuanBi1_tag = nTagNumber; }
    }
    public int rg_BeiGuanBi1 () {
        re_BeiGuanBi1 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BeiGuanBi1;  nTagNumber = rd_BeiGuanBi1_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }
}
