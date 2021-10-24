
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_JianRongChuangKou extends android.support.v7.app.AppCompatActivity {

    private static final String cs_strActivityLoadParams = "@activity_params";
    protected boolean onInitAndroidActivity () {
        if (rg_YingYongChengXu.sCheckRestart (this) == false)
            return false;
        rg_TongZhi_JiJiangChuShiHuaNeiRong ();
        return true;
    }
    protected void onStart ()    {  super.onStart ();  m_blCleanupMethodCalled = false;  rg_TongZhi_BeiQiDong ();  }
    protected void onRestart ()  {  super.onRestart ();  rg_TongZhi_BeiChongXinQiDong ();  }
    protected void onResume ()   {  super.onResume ();  rg_TongZhi_BeiJiHuo ();  }
    protected void onPause ()    {  super.onPause ();  rg_TongZhi_ShiQuJiHuo ();  }
    protected void onNewIntent(android.content.Intent intent) { super.onNewIntent(intent); rg_TongZhi_BeiChongXinQiDong1 (intent);  }
    protected void onStop () {
        super.onStop ();
        rg_TongZhi_BeiTingZhi ();
        if (isChangingConfigurations ())
            rg_YingYongChengXu.sForceRestart  ();
        if (isFinishing ())
            SendCleanupNotify ();
    }
    protected void onDestroy () {
        super.onDestroy ();
        SendCleanupNotify ();
        rg_TongZhi_JiangBeiXiaoHui1 ();
    }
    private boolean m_blCleanupMethodCalled;
    void SendCleanupNotify () {
        if (m_blCleanupMethodCalled == false) {
            m_blCleanupMethodCalled = true;
            rg_TongZhi_QingLiShuJu ();
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
        rg_TongZhi_BeiChuangJian1 (objIntent, aryParams, (aryParams == null ? 0 : aryParams.length));
    }
    @Override public boolean onCreateOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_TongZhi_ChuShiHuaXuanXiangCaiChan (menu);
        return (super.onCreateOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onPrepareOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_TongZhi_GengXinXuanXiangCaiChan (menu);
        return (super.onPrepareOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onOptionsItemSelected (android.view.MenuItem item) {
        if (rg_TongZhi_CaiChanXiangBeiXuanZe (item, false))
            return true;
        return super.onOptionsItemSelected (item);
    }
    @Override public void onOptionsMenuClosed (android.view.Menu menu) {
        rg_TongZhi_CaiChanBeiGuanBi (menu, false);
         super.onOptionsMenuClosed (menu);
    }
    @Override public boolean onContextItemSelected (android.view.MenuItem item) {
        if (rg_TongZhi_CaiChanXiangBeiXuanZe (item, true))
            return true;
        return super.onContextItemSelected (item);
    }
    @Override public void onContextMenuClosed (android.view.Menu menu) {
        rg_TongZhi_CaiChanBeiGuanBi (menu, true);
        super.onContextMenuClosed (menu);
    }
    @Override public void onCreateContextMenu (android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        AndroidView volView = AndroidView.sSafeGetVolView (v);
        if (volView != null)
            rg_TongZhi_ChuShiHuaZuJianShangXiaWenCaiChan (volView, menu);
        super.onCreateContextMenu (menu, v, menuInfo);
    }
    protected void onActivityResult (int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult (requestCode, resultCode, data);
        rg_TongZhi_HuoDeFanHuiShuJu (requestCode, resultCode, data);
    }
    @Override public boolean dispatchKeyEvent (android.view.KeyEvent event) {
        if (rg_TongZhi_JiJiangFaSongAnJianShiJian (event))
            return true;
        return super.dispatchKeyEvent (event);
    }
    @Override public boolean dispatchKeyShortcutEvent (android.view.KeyEvent event) {
        if (rg_TongZhi_JiJiangFaSongKuaiJieJianShiJian (event))
            return true;
        return super.dispatchKeyShortcutEvent (event);
    }
    @Override public boolean dispatchTouchEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongChuMoShiJian (event))
            return true;
        return super.dispatchTouchEvent (event);
    }
    @Override public boolean dispatchTrackballEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongGuiJiQiuShiJian (event))
            return true;
        return super.dispatchTrackballEvent (event);
    }
    @Override public boolean dispatchGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_JiJiangFaSongTongYongDongZuoShiJian (event))
            return true;
        return super.dispatchGenericMotionEvent (event);
    }
    @Override public boolean onTouchEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_BeiChuMo (event))
            return true;
        return super.onTouchEvent (event);
    }
    @Override public boolean onGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_TongYongDongZuoShiJian (event))
            return true;
        return super.onGenericMotionEvent (event);
    }
    @Override public boolean onTrackballEvent (android.view.MotionEvent event) {
        if (rg_TongZhi_GuiJiQiuShiJian (event))
            return true;
        return super.onTrackballEvent (event);
    }
    @Override public boolean onKeyDown (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian (rg_AnJianTongZhiLeiXing.rg_BeiAnXia5, keyCode, event))
            return true;
        return super.onKeyDown (keyCode, event);
    }
    @Override public boolean onKeyLongPress (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian (rg_AnJianTongZhiLeiXing.rg_BeiChangAn5, keyCode, event))
            return true;
        return super.onKeyLongPress (keyCode, event);
    }
    @Override public boolean onKeyMultiple (int keyCode, int repeatCount, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian (rg_AnJianTongZhiLeiXing.rg_DuoChongAnJian1, keyCode, event))
            return true;
        return super.onKeyMultiple (keyCode, repeatCount, event);
    }
    @Override public boolean onKeyShortcut (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian (rg_AnJianTongZhiLeiXing.rg_KuaiJieJianBeiAnXia, keyCode, event))
            return true;
        return super.onKeyShortcut (keyCode, event);
    }
    @Override public boolean onKeyUp (int keyCode, android.view.KeyEvent event) {
        if (rg_TongZhi_AnJianShiJian (rg_AnJianTongZhiLeiXing.rg_BeiFangKai1, keyCode, event))
            return true;
        return super.onKeyUp (keyCode, event);
    }
    @Override public void onBackPressed () {
        if (rg_TongZhi_HuiTuiJianBeiAnXia ())
            return;
        super.onBackPressed ();
    }
    @Override public void onUserInteraction () {
        super.onUserInteraction ();
        rg_TongZhi_YongHuJinRu ();
    }
    @Override public void onUserLeaveHint () {
        rg_TongZhi_YongHuLiKai ();
        super.onUserLeaveHint ();
    }
    @Override public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged (hasFocus);
        rg_TongZhi_ChuangKouJiaoDianGaiBian (hasFocus);
    }
    @Override public CharSequence onCreateDescription () {
        final String strDesc = rg_TongZhi_HuoQuChuangKouMiaoShu ();
        return (strDesc != null ? strDesc : super.onCreateDescription ());
    }

    public void rg_TongZhi_BeiChuangJian1 (android.content.Intent rg_QiDongXinXiDuiXiang, java.lang.Object [] rg_ZaiRuCanShu1, int rg_CanShuShuMu1) {
    }

    public void rg_TongZhi_BeiQiDong () {
    }

    public void rg_TongZhi_BeiChongXinQiDong () {
    }

    public void rg_TongZhi_BeiChongXinQiDong1 (android.content.Intent rg_QiDongXinXiDuiXiang1) {
    }

    public void rg_TongZhi_BeiJiHuo () {
    }

    public void rg_TongZhi_ShiQuJiHuo () {
    }

    public void rg_TongZhi_QingLiShuJu () {
    }

    public void rg_TongZhi_BeiTingZhi () {
    }

    public void rg_TongZhi_JiangBeiXiaoHui1 () {
    }

    public void rg_TongZhi_JiJiangChuShiHuaNeiRong () {
    }

    public boolean rg_TongZhi_ChuShiHuaXuanXiangCaiChan (android.view.Menu rg_XuanXiangCaiChan) {
        return (true);
    }

    public boolean rg_TongZhi_GengXinXuanXiangCaiChan (android.view.Menu rg_XuanXiangCaiChan1) {
        return (true);
    }

    public void rg_TongZhi_ChuShiHuaZuJianShangXiaWenCaiChan (AndroidView rg_SuoYuXianShiCaiChanDeZuJian, android.view.ContextMenu rg_ZuJianShangXiaWenCaiChan) {
    }

    public boolean rg_TongZhi_CaiChanXiangBeiXuanZe (android.view.MenuItem rg_SuoXuanZeCaiChanXiang, boolean rg_ShiFouWeiZuJianShangXiaWenCaiChan) {
        return (false);
    }

    public void rg_TongZhi_CaiChanBeiGuanBi (android.view.Menu rg_BeiGuanBiDeXuanXiangCaiChan, boolean rg_ShiFouWeiZuJianShangXiaWenCaiChan1) {
    }

    public void rg_TongZhi_HuoDeFanHuiShuJu (int rg_QingQiuMa3, int rg_SuoFanHuiJieGuoMa, android.content.Intent rg_SuoFanHuiJieGuoXinXi) {
    }

    public boolean rg_TongZhi_JiJiangFaSongTongYongDongZuoShiJian (android.view.MotionEvent rg_TongYongDongZuoShiJian) {
        return (false);
    }

    public boolean rg_TongZhi_TongYongDongZuoShiJian (android.view.MotionEvent rg_TongYongDongZuoShiJian1) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongAnJianShiJian (android.view.KeyEvent rg_AnJianShuRuShiJian) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongKuaiJieJianShiJian (android.view.KeyEvent rg_KuaiJieJianShuRuShiJian) {
        return (false);
    }

    public boolean rg_TongZhi_AnJianShiJian (int rg_TongZhiLeiXing, int rg_AnJianDaiMa, android.view.KeyEvent rg_AnJianShuRuShiJian1) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongChuMoShiJian (android.view.MotionEvent rg_ChuMoDongZuoShiJian) {
        return (false);
    }

    public boolean rg_TongZhi_BeiChuMo (android.view.MotionEvent rg_ChuMoDongZuoShiJian1) {
        return (false);
    }

    public boolean rg_TongZhi_JiJiangFaSongGuiJiQiuShiJian (android.view.MotionEvent rg_GuiJiQiuDongZuoShiJian) {
        return (false);
    }

    public boolean rg_TongZhi_GuiJiQiuShiJian (android.view.MotionEvent rg_GuiJiQiuDongZuoShiJian1) {
        return (false);
    }

    public boolean rg_TongZhi_HuiTuiJianBeiAnXia () {
        return (false);
    }

    public String rg_TongZhi_HuoQuChuangKouMiaoShu () {
        return (null);
    }

    public void rg_TongZhi_YongHuJinRu () {
    }

    public void rg_TongZhi_YongHuLiKai () {
    }

    public void rg_TongZhi_ChuangKouJiaoDianGaiBian (boolean rg_ShiFouHuoDeJiaoDian) {
    }

    @Override public void onRequestPermissionsResult (int rg_QingQiuMa4, String [] rg_QuanXian2, int [] rg_ShouQuanJieGuo) {
    }

    public AndroidViewGroup GetAndroidActivityContainer () {
        return (null);
    }
}
