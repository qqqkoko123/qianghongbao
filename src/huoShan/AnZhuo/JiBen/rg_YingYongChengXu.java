
package huoShan.AnZhuo.JiBen;

public class rg_YingYongChengXu extends android.app.Application {

    protected java.util.HashMap<String, java.lang.Object> rg_QuanJuBianLiangBiao = new java.util.HashMap<String, java.lang.Object> ();
    private static rg_YingYongChengXu ms_objApp;
    protected rg_QuanJuShuJuCunChuQiLei rg_QuanJuShuJuCunChuQi = new rg_QuanJuShuJuCunChuQiLei ();
    protected rg_UIDongZuoZhiHangQiLei rg_DongZuoZhiHangQi = new rg_UIDongZuoZhiHangQiLei ();
    public void onCreate () {
        super.onCreate ();
        sPermitDiskAndNetworkOperInsideUIThread ();
        ms_objApp = this;
        rg_DongZuoZhiHangQi.init ();
        rg_TongZhi_BeiChuangJian3 ();
    }
    public static void sPermitDiskAndNetworkOperInsideUIThread () {
        android.os.StrictMode.setThreadPolicy (new android.os.StrictMode.ThreadPolicy.Builder ().permitAll ().build ());
    }
    public static void sRunOnUiThread (Runnable action) {
        ms_objApp.rg_DongZuoZhiHangQi.RunOnUiThread (action);
    }
    public static rg_YingYongChengXu sGetApp () {
        return ms_objApp;
    }
    public static rg_QuanJuShuJuCunChuQiLei sGetGlobalDataCache () {
        return ms_objApp.rg_QuanJuShuJuCunChuQi;
    }
    public static boolean sIsUiThread () {
        return ms_objApp.rg_DongZuoZhiHangQi.IsUiThread ();
    }
    private void CleanupGlobalData () {
        rg_TongZhi_QingLiQuanJuShuJu ();
        rg_QuanJuBianLiangBiao.clear ();
        rg_QuanJuShuJuCunChuQi.Cleanup ();
    }
    private int m_nStartupState = 0;
    private static int ms_nStartupState = 0;
    public static void sOnStartupClassEnter () {
        ms_objApp.m_nStartupState = ms_nStartupState = 1;
        ms_objApp.CleanupGlobalData ();
    }
    public static boolean sCheckRestart (android.content.Context context) {
        if (ms_objApp.m_nStartupState == 1 && ms_nStartupState == 1)
            return true;
        Class<?> clsStartup = com.qqq.WXhongbao.rg_QiDongLei.class;
        if (android.app.Activity.class.isAssignableFrom (clsStartup)) {
            try {
                android.content.Intent intent = new android.content.Intent (context, clsStartup);
                intent.addFlags (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK |
                        android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity (intent);
            } catch (Exception e) { }
        }
        return false;
    }
    public static void sForceRestart () {
        ms_objApp.m_nStartupState = ms_nStartupState = -1;
    }
    private static final String cs_strServiceStartUserData = "@service_start_user_data";
    public static int sGetServiceStartUserData (android.content.Intent objIntent) {
        return objIntent.getIntExtra (cs_strServiceStartUserData, 0);
    }
    public static final String cs_strServiceStartParams = "@service_start_params";
    public static boolean sMyStartService (Class clsService, android.os.Bundle bundle, Object... params) {
        rg_QuanJuShuJuCunChuQiLei objCache = sGetGlobalDataCache ();
        int nParamDataIdentifier = 0;
        try {
            android.content.Intent objIntent = new android.content.Intent (ms_objApp, clsService);
            if (bundle != null)
                objIntent.putExtras (bundle);
            if (params != null && params.length > 0) {
                nParamDataIdentifier = objCache.Push (params);
                objIntent.putExtra (cs_strServiceStartParams, nParamDataIdentifier);
            }
            if (ms_objApp.startService (objIntent) != null)
                return true;
        } catch (Exception e) { }
        objCache.Remove (nParamDataIdentifier);
        return false;
    }
    public static boolean sMyStopService (Class clsService) {
        android.content.Intent objIntent = new android.content.Intent (ms_objApp, clsService);
        try {
            return ms_objApp.stopService (objIntent);
        } catch (Exception e) {
            return false;
        }
    }

    public void rg_TongZhi_BeiChuangJian3 () {
    }

    public void rg_TongZhi_QingLiQuanJuShuJu () {
    }

    public static rg_YingYongChengXu rg_QuChengXu () {
        return ms_objApp;
    }

    public static void rg_DiShiKuang (final String rg_YuXianShiDeWenBen, final boolean rg_ChangShiJianXianShi) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                android.widget.Toast.makeText (ms_objApp, rg_YuXianShiDeWenBen,
                    (rg_ChangShiJianXianShi ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT)).show ();
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        android.widget.Toast.makeText (ms_objApp, rg_YuXianShiDeWenBen,
                                (rg_ChangShiJianXianShi ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT)).show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public static android.content.res.Resources rg_QuZiYuanGuanLiQi () {
        return ms_objApp.getResources ();
    }

    public static android.content.res.AssetManager rg_QuZiChanGuanLiQi () {
        return ms_objApp.getAssets ();
    }

    public static android.content.SharedPreferences rg_QuChengXuPeiZhiBiao (String rg_ChengXuPeiZhiBiaoMingChen, boolean rg_ShiFouWeiTianJiaXieChu) {
        return ms_objApp.getSharedPreferences (rg_ChengXuPeiZhiBiaoMingChen,
            (rg_ShiFouWeiTianJiaXieChu ? (android.content.Context.MODE_APPEND | android.content.Context.MODE_PRIVATE) : android.content.Context.MODE_PRIVATE));
    }
}
