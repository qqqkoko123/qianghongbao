
package huoShan.AnZhuo.GongNeng.MoZhangAiFuWu;

public class rg_MoZhangAiFuWuLei extends android.accessibilityservice.AccessibilityService {

    @Override public void onCreate () {
        super.onCreate ();
        huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sPermitDiskAndNetworkOperInsideUIThread ();
        rg_TongZhi_BeiChuangJian ();
    }
    @Override public int onStartCommand (android.content.Intent intent, int flags, int startId) {
        final int nResult = super.onStartCommand (intent, flags, startId);
        rg_TongZhi_BeiQiDongYiCi (intent, null, 0);
        return nResult;
    }
    @Override public void onDestroy () {
        rg_TongZhi_JiangBeiXiaoHui ();
        super.onDestroy ();
    }
    @Override public void onInterrupt () {
        rg_TongZhi_BeiZhongDuan ();
    }
    @Override public void onAccessibilityEvent (android.view.accessibility.AccessibilityEvent event) {
        rg_TongZhi_ShouDaoXinShiJian (event);
    }
    @Override protected void onServiceConnected () {
        rg_TongZhi_FuWuYiLianJie ();
        super.onServiceConnected();
    }
    @Override protected boolean onGesture (int gestureId) {
        return rg_TongZhi_ShouDaoChuMoShouShi (gestureId);
    }
    @Override public boolean onUnbind (android.content.Intent intent) {
        rg_TongZhi_BeiJieChuSuoYouBangDing ();
        return false;
    }

    public void rg_TongZhi_BeiChuangJian () {
    }

    public void rg_TongZhi_JiangBeiXiaoHui () {
    }

    public void rg_TongZhi_BeiZhongDuan () {
    }

    public void rg_TongZhi_FuWuYiLianJie () {
    }

    public boolean rg_TongZhi_ShouDaoChuMoShouShi (int rg_ShouShiLeiXing) {
        return (false);
    }

    @Override public boolean onKeyEvent (android.view.KeyEvent rg_ShiJianDuiXiang) {
        return (false);
    }

    public void rg_TongZhi_ShouDaoXinShiJian (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang1) {
    }

    public void rg_TongZhi_BeiQiDongYiCi (android.content.Intent rg_QiDongXinXi, java.lang.Object [] rg_ZaiRuCanShu, int rg_CanShuShuMu) {
    }

    public void rg_TongZhi_BeiJieChuSuoYouBangDing () {
    }
}
