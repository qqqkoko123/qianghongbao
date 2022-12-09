
package anZhuo.MoMingMoKuai.ZaQiZaBa;

public class rg_YingYongGongJuLei {

    public rg_YingYongGongJuLei ()  { }

    private static android.content.pm.Signature[] getAppSignature(final String packageName) {
        try {
            android.content.pm.PackageManager pm = huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp ().getPackageManager();
            android.content.pm.PackageInfo pi = pm.getPackageInfo(packageName, android.content.pm.PackageManager.GET_SIGNATURES);
            return pi == null ? null : pi.signatures;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean rg_YingYong_ShiFouAnZhuang (android.content.Context rg_SuoZaiChuangKou5, String rg_PanDuanDeYingYongBaoMing1) {
        try
        {
            android.content.pm.PackageInfo rg_ChengXuBao4;
            rg_ChengXuBao4 = (rg_SuoZaiChuangKou5.getPackageManager ().getPackageInfo(rg_PanDuanDeYingYongBaoMing1, 0));
            if (rg_ChengXuBao4 == null)
            {
                return (false);
            }
            else
            {
                return (true);
            }
        }
        catch (Exception _vol_e_catched)
        {
            return (false);
        }
    }
}
