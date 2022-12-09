
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndroidView extends huoShan.Java.JiBen.rg_BiaoJiLei {

    public AndroidView ()  { }

    public static final int rg_TianManFuZuJian = -1;
    public static final int rg_DengYuNeiRongCheCun = -2;
    protected static final int rg_HuoShanZuJianBaoCunID = com.qqq.WXhongbao.R.id.rg_huoshanzujianbaocunid;
    private View m_view;
    private rg_ZuJianShuXingDongHuaBoFangQi m_animator;
    private View.OnAttachStateChangeListener m_stateChangeListener;
    private android.view.ViewTreeObserver.OnDrawListener m_drawListener;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener m_layoutListener;
    public AndroidView (android.content.Context context, View view, Object objInitData) {
        m_view = view;
        m_view.setTag (rg_HuoShanZuJianBaoCunID, this);
    }
    public AndroidView (android.content.Context context, View view) {
        this (context, view, null);
    }
    public void onInitControlContent (android.content.Context context, Object objInitData) {
        OnInitView (context, objInitData);
        rg_ChuShiHuaNeiRong (context, objInitData);
    }
    public View GetView () { return m_view; }
    public static AndroidView sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new View (context), null);
    }
    public static AndroidView sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new View (context), objInitData);
    }
    public static AndroidView sNewInstanceAndAttachView (android.content.Context context, View viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static AndroidView sNewInstanceAndAttachView (android.content.Context context, View viewAttach, Object objInitData) {
        AndroidView objControl = new AndroidView (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    public static AndroidView sSafeGetVolView (View view) {
        if (view != null) {
            Object obj = view.getTag (rg_HuoShanZuJianBaoCunID);
            if (obj != null && obj instanceof AndroidView)
                return (AndroidView)obj;
        }
        return null;
    }
    protected void OnInitView (android.content.Context context, Object objInitData) {
    }

    public static interface re_BeiChanJi1 { int dispatch (AndroidView objSource, int nTagNumber); }
    private re_BeiChanJi1 rd_BeiChanJi1;
    private int rd_BeiChanJi1_tag;
    public void rl_AndroidView_BeiChanJi1 (re_BeiChanJi1 objListener, int nTagNumber) {
        synchronized (this) { rd_BeiChanJi1 = objListener;  rd_BeiChanJi1_tag = nTagNumber; }
    }
    public int rg_BeiChanJi1 () {
        re_BeiChanJi1 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BeiChanJi1;  nTagNumber = rd_BeiChanJi1_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public void rg_ZhiChiChanJi1 (final boolean rg_ShiFouZhiChiChanJi) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_view.setClickable (rg_ShiFouZhiChiChanJi);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setClickable (rg_ShiFouZhiChiChanJi);
                    } catch (Exception e) { }
                } } );
        }
        try {
            if (rg_ShiFouZhiChiChanJi) {
               m_view.setOnClickListener (new View.OnClickListener () {
                       @Override public void onClick (View v) {
                           rg_BeiChanJi1 ();
                       } } );
            } else {
                m_view.setOnClickListener (null);
            };
        } catch (Exception e) { }
    }

    public void rg_XuKe1 (final boolean rg_ShiFouXuKe) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_view.setEnabled (rg_ShiFouXuKe);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setEnabled (rg_ShiFouXuKe);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_KeShi2 (final int rg_KeShiZhuangTai) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_view.setVisibility (rg_KeShiZhuangTai);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setVisibility (rg_KeShiZhuangTai);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ID4 (final int rg_SuoSheZhiID) {
        m_view.setId (Math.max (1, rg_SuoSheZhiID));
    }

    public void rg_BeiJingTu3 (final int rg_ZuJianBeiJingZiYuan) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_view.setBackgroundResource (rg_ZuJianBeiJingZiYuan);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setBackgroundResource (rg_ZuJianBeiJingZiYuan);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiBeiJingTu1 (final android.graphics.drawable.Drawable rg_ZuJianBeiJingDuiXiang) {
        if (rg_ZuJianBeiJingDuiXiang != null)
        {
            if (rg_YingYongChengXu.sIsUiThread ()) {
                try {
                    m_view.setBackground (rg_ZuJianBeiJingDuiXiang);
                } catch (Exception e) { }
            } else {
                rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                    @Override public void run () {
                        try {
                            m_view.setBackground (rg_ZuJianBeiJingDuiXiang);
                        } catch (Exception e) { }
                    } } );
            }
        }
    }

    public void rg_ZhiZhuangTaiBeiJingTu (rg_ZhuangTaiDaoTuXiangBiao rg_ZhuangTaiBeiJingTuDuiXiang) {
        rg_ZhiBeiJingTu1 (rg_ZhuangTaiBeiJingTuDuiXiang.rg_ChuangJian29 ());
    }

    public void rg_ZhiNeiBianJu (final int rg_Can_ZuoNeiBianJu, final int rg_Can_ShangNeiBianJu, final int rg_Can_YouNeiBianJu, final int rg_Can_XiaNeiBianJu) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                m_view.setPadding (rg_Can_ZuoNeiBianJu, rg_Can_ShangNeiBianJu, rg_Can_YouNeiBianJu, rg_Can_XiaNeiBianJu);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setPadding (rg_Can_ZuoNeiBianJu, rg_Can_ShangNeiBianJu, rg_Can_YouNeiBianJu, rg_Can_XiaNeiBianJu);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiWaiBianJu1 (int rg_ZuoWaiBianJu, int rg_ShangWaiBianJu, int rg_YouWaiBianJu, int rg_XiaWaiBianJu) {
        ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
        if (pmLayout == null || pmLayout instanceof ViewGroup.MarginLayoutParams == false)
            return;
        ViewGroup.MarginLayoutParams pmMargin = (ViewGroup.MarginLayoutParams)pmLayout;
        final android.graphics.Rect rtNew = new android.graphics.Rect (
                (rg_ZuoWaiBianJu == -1 ?  pmMargin.leftMargin : rg_ZuoWaiBianJu),
                (rg_ShangWaiBianJu == -1 ?  pmMargin.topMargin : rg_ShangWaiBianJu),
                (rg_YouWaiBianJu == -1 ?  pmMargin.rightMargin : rg_YouWaiBianJu),
                (rg_XiaWaiBianJu == -1 ?  pmMargin.bottomMargin : rg_XiaWaiBianJu));
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                ViewGroup.MarginLayoutParams pmNewMargin = (ViewGroup.MarginLayoutParams)m_view.getLayoutParams ();
                pmNewMargin.setMargins (rtNew.left, rtNew.top, rtNew.right, rtNew.bottom);
                m_view.setLayoutParams (pmNewMargin);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ViewGroup.MarginLayoutParams pmNewMargin = (ViewGroup.MarginLayoutParams)m_view.getLayoutParams ();
                            pmNewMargin.setMargins (rtNew.left, rtNew.top, rtNew.right, rtNew.bottom);
                            m_view.setLayoutParams (pmNewMargin);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiXuQiuCheCun (final int rg_YuSheZhiKuanDuZhi1, final int rg_YuSheZhiGaoDuZhi1) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
                if (pmLayout != null) {
                    pmLayout.width = rg_YuSheZhiKuanDuZhi1;
                    pmLayout.height = rg_YuSheZhiGaoDuZhi1;
                    m_view.setLayoutParams (pmLayout);
                } else {
                   m_view.setLayoutParams (new ViewGroup.LayoutParams (rg_YuSheZhiKuanDuZhi1, rg_YuSheZhiGaoDuZhi1));
                };
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
                            if (pmLayout != null) {
                                pmLayout.width = rg_YuSheZhiKuanDuZhi1;
                                pmLayout.height = rg_YuSheZhiGaoDuZhi1;
                                m_view.setLayoutParams (pmLayout);
                            } else {
                               m_view.setLayoutParams (new ViewGroup.LayoutParams (rg_YuSheZhiKuanDuZhi1, rg_YuSheZhiGaoDuZhi1));
                            };
                    } catch (Exception e) { }
                } } );
        }
    }

    protected void rg_ChuShiHuaNeiRong (android.content.Context rg_HuanJingDuiXiang6, java.lang.Object rg_ShuJuDuiXiang2) {
    }
}
