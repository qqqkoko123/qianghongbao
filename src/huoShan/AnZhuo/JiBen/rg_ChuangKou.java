
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_ChuangKou extends android.app.Activity {

    private static final String cs_strActivityLoadParams = "@activity_params";
    protected boolean onInitAndroidActivity () {
        if (rg_YingYongChengXu.sCheckRestart (this) == false)
            return false;
        rg_TongZhi_JiJiangChuShiHuaNeiRong2 ();
        return true;
    }
    protected void onStart ()    {  super.onStart ();  m_blCleanupMethodCalled = false;  rg_TongZhi_BeiQiDong2 ();  }
    protected void onRestart ()  {  super.onRestart ();  rg_TongZhi_BeiChongXinQiDong4 ();  }
    protected void onResume ()   {  super.onResume ();  rg_TongZhi_BeiJiHuo2 ();  }
    protected void onPause ()    {  super.onPause ();  rg_TongZhi_ShiQuJiHuo2 ();  }
    protected void onNewIntent(android.content.Intent intent) { super.onNewIntent(intent); rg_TongZhi_BeiChongXinQiDong5 (intent);  }
    protected void onStop () {
        super.onStop ();
        rg_TongZhi_BeiTingZhi2 ();
        if (isChangingConfigurations ())
            rg_YingYongChengXu.sForceRestart  ();
        if (isFinishing ())
            SendCleanupNotify ();
    }
    protected void onDestroy () {
        super.onDestroy ();
        SendCleanupNotify ();
        rg_TongZhi_JiangBeiXiaoHui6 ();
    }
    private boolean m_blCleanupMethodCalled;
    void SendCleanupNotify () {
        if (m_blCleanupMethodCalled == false) {
            m_blCleanupMethodCalled = true;
            rg_TongZhi_QingLiShuJu2 ();
        }
    }
    @Override protected void onCreate (android.os.Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        rg_YingYongChengXu.sPermitDiskAndNetworkOperInsideUIThread ();
        if (getClass ().equals (com.qqq.WXhongbao.rg_QiDongLei.class))
            rg_YingYongChengXu.sOnStartupClassEnter ();
        android.content.Intent objIntent = getIntent ();
        final int nParamDataIdentifier = objIntent.getIntExtra (cs_strActivityLoadParams, 0);
        Object[] aryParams = rg_YingYongChengXu.sGetGlobalDataCache ().Pop (nParamDataIdentifier);
        if (nParamDataIdentifier != 0 && aryParams == null)
            rg_YingYongChengXu.sForceRestart ();
        if (onInitAndroidActivity () == false) {
            finish ();
            return;
        }
        rg_TongZhi_BeiChuangJian7 (objIntent, aryParams, (aryParams == null ? 0 : aryParams.length));
    }
    @Override public boolean onCreateOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_TongZhi_ChuShiHuaXuanXiangCaiChan2 (menu);
        return (super.onCreateOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onPrepareOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_TongZhi_GengXinXuanXiangCaiChan2 (menu);
        return (super.onPrepareOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onOptionsItemSelected (android.view.MenuItem item) {
        if (rg_TongZhi_CaiChanXiangBeiXuanZe2 (item, false))
            return true;
        return super.onOptionsItemSelected (item);
    }
    @Override public void onOptionsMenuClosed (android.view.Menu menu) {
        rg_TongZhi_CaiChanBeiGuanBi2 (menu, false);
         super.onOptionsMenuClosed (menu);
    }
    @Override public boolean onContextItemSelected (android.view.MenuItem item) {
        if (rg_TongZhi_CaiChanXiangBeiXuanZe2 (item, true))
            return true;
        return super.onContextItemSelected (item);
    }
    @Override public void onContextMenuClosed (android.view.Menu menu) {
        rg_TongZhi_CaiChanBeiGuanBi2 (menu, true);
        super.onContextMenuClosed (menu);
    }
    @Override public void onCreateContextMenu (android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        AndroidView volView = AndroidView.sSafeGetVolView (v);
        if (volView != null)
            rg_TongZhi_ChuShiHuaZuJianShangXiaWenCaiChan2 (volView, menu);
        super.onCreateContextMenu (menu, v, menuInfo);
    }
    protected void onActivityResult (int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult (requestCode, resultCode, data);
        rg_TongZhi_HuoDeFanHuiShuJu2 (requestCode, resultCode, data);
    }
    @Override public boolean dispatchKeyEvent (android.view.KeyEvent event) {
        if (rg_TongZhi_JiJiangFaSongAnJianShiJian2 (event))
            return true;
        return super.dispatchKeyEvent (event);
    }
    @Override public boolean dispatchKeyShortcutEvent (android.view.KeyEvent event) {
        if (rg_TongZhi_JiJiangFaSongKuaiJieJianShiJian2 (event))
            return true;
        return super.dispatchKeyShortcutEvent (event);
    }
    @Override public boolean dispatchTouchEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongChuMoShiJian2 (event))
            return true;
        return super.dispatchTouchEvent (event);
    }
    @Override public boolean dispatchTrackballEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongGuiJiQiuShiJian2 (event))
            return true;
        return super.dispatchTrackballEvent (event);
    }
    @Override public boolean dispatchGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongTongYongDongZuoShiJian2 (event))
            return true;
        return super.dispatchGenericMotionEvent (event);
    }
    @Override public boolean onTouchEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_BeiChuMo3 (event))
            return true;
        return super.onTouchEvent (event);
    }
    @Override public boolean onGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_TongYongDongZuoShiJian3 (event))
            return true;
        return super.onGenericMotionEvent (event);
    }
    @Override public boolean onTrackballEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_GuiJiQiuShiJian3 (event))
            return true;
        return super.onTrackballEvent (event);
    }
    @Override public boolean onKeyDown (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian3 (rg_AnJianTongZhiLeiXing.rg_BeiAnXia5, keyCode, event))
            return true;
        return super.onKeyDown (keyCode, event);
    }
    @Override public boolean onKeyLongPress (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian3 (rg_AnJianTongZhiLeiXing.rg_BeiChangAn5, keyCode, event))
            return true;
        return super.onKeyLongPress (keyCode, event);
    }
    @Override public boolean onKeyMultiple (int keyCode, int repeatCount, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian3 (rg_AnJianTongZhiLeiXing.rg_DuoChongAnJian1, keyCode, event))
            return true;
        return super.onKeyMultiple (keyCode, repeatCount, event);
    }
    @Override public boolean onKeyShortcut (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian3 (rg_AnJianTongZhiLeiXing.rg_KuaiJieJianBeiAnXia, keyCode, event))
            return true;
        return super.onKeyShortcut (keyCode, event);
    }
    @Override public boolean onKeyUp (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian3 (rg_AnJianTongZhiLeiXing.rg_BeiFangKai1, keyCode, event))
            return true;
        return super.onKeyUp (keyCode, event);
    }
    @Override public void onBackPressed () {
        if (rg_TongZhi_HuiTuiJianBeiAnXia2 ())
            return;
        super.onBackPressed ();
    }
    @Override public void onUserInteraction () {
        super.onUserInteraction ();
        rg_TongZhi_YongHuJinRu2 ();
    }
    @Override public void onUserLeaveHint () {
        rg_TongZhi_YongHuLiKai2 ();
        super.onUserLeaveHint ();
    }
    @Override public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged (hasFocus);
        rg_TongZhi_ChuangKouJiaoDianGaiBian2 (hasFocus);
    }
    @Override public CharSequence onCreateDescription () {
        final String strDesc = rg_TongZhi_HuoQuChuangKouMiaoShu2 ();
        return (strDesc != null ? strDesc : super.onCreateDescription ());
    }

    public AndroidViewGroup GetAndroidActivityContainer () {
        return (null);
    }

    public void rg_TongZhi_BeiChuangJian7 (android.content.Intent rg_QiDongXinXiDuiXiang8, java.lang.Object [] rg_ZaiRuCanShu7, int rg_CanShuShuMu10) {
    }

    public void rg_TongZhi_BeiQiDong2 () {
    }

    public void rg_TongZhi_BeiChongXinQiDong4 () {
    }

    public void rg_TongZhi_BeiChongXinQiDong5 (android.content.Intent rg_QiDongXinXiDuiXiang9) {
    }

    public void rg_TongZhi_BeiJiHuo2 () {
    }

    public void rg_TongZhi_ShiQuJiHuo2 () {
    }

    public void rg_TongZhi_QingLiShuJu2 () {
    }

    public void rg_TongZhi_BeiTingZhi2 () {
    }

    public void rg_TongZhi_JiangBeiXiaoHui6 () {
    }

    public void rg_TongZhi_JiJiangChuShiHuaNeiRong2 () {
    }

    public boolean rg_TongZhi_ChuShiHuaXuanXiangCaiChan2 (android.view.Menu rg_XuanXiangCaiChan4) {
        return (true);
    }

    public boolean rg_TongZhi_GengXinXuanXiangCaiChan2 (android.view.Menu rg_XuanXiangCaiChan5) {
        return (true);
    }

    public void rg_TongZhi_ChuShiHuaZuJianShangXiaWenCaiChan2 (AndroidView rg_SuoYuXianShiCaiChanDeZuJian2, android.view.ContextMenu rg_ZuJianShangXiaWenCaiChan2) {
    }

    public boolean rg_TongZhi_CaiChanXiangBeiXuanZe2 (android.view.MenuItem rg_SuoXuanZeCaiChanXiang3, boolean rg_ShiFouWeiZuJianShangXiaWenCaiChan4) {
        return (false);
    }

    public void rg_TongZhi_CaiChanBeiGuanBi2 (android.view.Menu rg_BeiGuanBiDeXuanXiangCaiChan2, boolean rg_ShiFouWeiZuJianShangXiaWenCaiChan5) {
    }

    public void rg_TongZhi_HuoDeFanHuiShuJu2 (int rg_QingQiuMa17, int rg_SuoFanHuiJieGuoMa3, android.content.Intent rg_SuoFanHuiJieGuoXinXi2) {
    }

    public boolean rg_TongZhi_JiJiangFaSongTongYongDongZuoShiJian2 (android.view.MotionEvent rg_TongYongDongZuoShiJian5) {
        return (false);
    }

    public boolean rg_TongZhi_TongYongDongZuoShiJian3 (android.view.MotionEvent rg_TongYongDongZuoShiJian6) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongAnJianShiJian2 (android.view.KeyEvent rg_AnJianShuRuShiJian7) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongKuaiJieJianShiJian2 (android.view.KeyEvent rg_KuaiJieJianShuRuShiJian2) {
        return (false);
    }

    public boolean rg_TongZhi_AnJianShiJian3 (int rg_TongZhiLeiXing4, int rg_AnJianDaiMa5, android.view.KeyEvent rg_AnJianShuRuShiJian8) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongChuMoShiJian2 (android.view.MotionEvent rg_ChuMoDongZuoShiJian5) {
        return (false);
    }

    public boolean rg_TongZhi_BeiChuMo3 (android.view.MotionEvent rg_ChuMoDongZuoShiJian6) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongGuiJiQiuShiJian2 (android.view.MotionEvent rg_GuiJiQiuDongZuoShiJian5) {
        return (false);
    }

    public boolean rg_TongZhi_GuiJiQiuShiJian3 (android.view.MotionEvent rg_GuiJiQiuDongZuoShiJian6) {
        return (false);
    }

    public boolean rg_TongZhi_HuiTuiJianBeiAnXia2 () {
        return (false);
    }

    public String rg_TongZhi_HuoQuChuangKouMiaoShu2 () {
        return (null);
    }

    public void rg_TongZhi_YongHuJinRu2 () {
    }

    public void rg_TongZhi_YongHuLiKai2 () {
    }

    public void rg_TongZhi_ChuangKouJiaoDianGaiBian2 (boolean rg_ShiFouHuoDeJiaoDian6) {
    }
}
