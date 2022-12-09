
package com.wuliguanhua.floating;

public class rg_YingYongCaoZuoLei {

    public rg_YingYongCaoZuoLei ()  { }

    public static String rg_QuZiShenYingYongBanBenMing () {
        try{return huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp ().getPackageManager().getPackageInfo(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp ().getPackageName(), 0).versionName;}catch (Exception e){e.printStackTrace();return "0";}
    }

    public static String [] rg_QuYingYongBanBenXinXi (String rg_APKBaoMing2) {
        String[] versionName = new String[2];
        int versioncode;
        try {
        android.content.pm.PackageInfo pi = huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp ().getPackageManager().getPackageInfo(rg_APKBaoMing2, 0);
        versionName[0] = pi.versionName;
        versionName[1] = String.valueOf (pi.versionCode);
        if (versionName == null || versionName.length <= 0) {
        return new String[0];}} catch (Exception e) {}
        return versionName;
    }
}
