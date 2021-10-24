
package huoShan.AnZhuo.JiBen;

public class rg_YunHangShiQuanXianGongJuLei {

    public rg_YunHangShiQuanXianGongJuLei ()  { }

    public com.voldp.runtimepermission.VolPermission.Builder builder = com.voldp.runtimepermission.VolPermission.with(rg_YingYongChengXu.sGetApp ()).setPermissionListener(new com.voldp.runtimepermission.PermissionListener(){
        @Override
        public void onPermissionGranted() {
            rg_YiShouYuQuanXian();
        }
        @Override
        public void onPermissionDenied(java.util.List<String> deniedPermissions) {
            rg_YiJuJueQuanXian(deniedPermissions);
        }
        @Override public void showWindowPermissionDenyDialog() {}
    });

    public void rg_ZiDongShenQingQuanXian (boolean rg_QiYongYuShenQingDiShi, boolean rg_QiYongJuJueHouDiShi, boolean rg_JuJueHouTuiChuYingYong, String rg_YuShenQingDiShiNeiRong, String rg_YuShenQingDiShiBiaoTi, String rg_YuShenQingQueDingNiuBiaoTi, String rg_JuJueHouDiShiNeiRong, String rg_JuJueHouDiShiBiaoTi, String rg_JuJueHouGuanBiNiuBiaoTi, boolean rg_JuJueHouSheZhiAnNiu, String rg_JuJueHouSheZhiNiuBiaoTi, boolean rg_ShiFouWeiZongXiang3) {
        this.builder.setPermissions(rg_QuSuoXuYunHangShiQuanXian ());
        if (rg_QiYongYuShenQingDiShi)
        {
            builder.setRationaleMessage(rg_YuShenQingDiShiNeiRong);
            builder.setRationaleTitle(rg_YuShenQingDiShiBiaoTi);
            builder.setRationaleConfirmText(rg_YuShenQingQueDingNiuBiaoTi);
        }
        if (rg_QiYongJuJueHouDiShi)
        {
            builder.setDeniedMessage(rg_JuJueHouDiShiNeiRong);
            builder.setDeniedTitle(rg_JuJueHouDiShiBiaoTi);
            builder.setDeniedCloseButtonText(rg_JuJueHouGuanBiNiuBiaoTi);
            if (rg_JuJueHouSheZhiAnNiu)
            {
                builder.setGotoSettingButton(true);
                builder.setGotoSettingButtonText(rg_JuJueHouSheZhiNiuBiaoTi);
            }
            else
            {
                builder.setGotoSettingButton(false);
            }
        }
        builder.setDeniedExitApp(rg_JuJueHouTuiChuYingYong);
        this.builder.setScreenOrientation(rg_ShiFouWeiZongXiang3 ? android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT : android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE).check();
    }

    public String [] rg_QuSuoXuYunHangShiQuanXian () {
        try
        {
            return rg_YingYongChengXu.sGetApp ().getPackageManager().getPackageInfo(rg_YingYongChengXu.sGetApp ().getPackageName(), 0x00001000).requestedPermissions;
        }
        catch (Exception _vol_e_catched)
        {
            return (null);
        }
    }

    public static interface re_YiShouYuQuanXian { int dispatch (rg_YunHangShiQuanXianGongJuLei objSource, int nTagNumber); }
    private re_YiShouYuQuanXian rd_YiShouYuQuanXian;
    private int rd_YiShouYuQuanXian_tag;
    public void rl_YunHangShiQuanXianGongJuLei_YiShouYuQuanXian (re_YiShouYuQuanXian objListener, int nTagNumber) {
        synchronized (this) { rd_YiShouYuQuanXian = objListener;  rd_YiShouYuQuanXian_tag = nTagNumber; }
    }
    public int rg_YiShouYuQuanXian () {
        re_YiShouYuQuanXian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_YiShouYuQuanXian;  nTagNumber = rd_YiShouYuQuanXian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_YiJuJueQuanXian { int dispatch (rg_YunHangShiQuanXianGongJuLei objSource, int nTagNumber, java.util.List<String> rg_BeiJuQuanXian); }
    private re_YiJuJueQuanXian rd_YiJuJueQuanXian;
    private int rd_YiJuJueQuanXian_tag;
    public void rl_YunHangShiQuanXianGongJuLei_YiJuJueQuanXian (re_YiJuJueQuanXian objListener, int nTagNumber) {
        synchronized (this) { rd_YiJuJueQuanXian = objListener;  rd_YiJuJueQuanXian_tag = nTagNumber; }
    }
    public int rg_YiJuJueQuanXian (java.util.List<String> rg_BeiJuQuanXian) {
        re_YiJuJueQuanXian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_YiJuJueQuanXian;  nTagNumber = rd_YiJuJueQuanXian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BeiJuQuanXian) : 0);
    }
}
