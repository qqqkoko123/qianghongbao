
package huoShan.AnZhuo.JiBen;

public class rg_YingYongAnZhuangLei {

    public rg_YingYongAnZhuangLei ()  { }

    public static void rg_AnZhuangZiWenJian (android.app.Activity rg_DangQianSuoChuChuangKou7, java.io.File rg_WenJian1) {
        if (android.os.Build.VERSION.SDK_INT >= 24)
        {
            android.net.Uri rg_WenJianZiYuan;
            rg_WenJianZiYuan = rg_ZiYuanBiaoShiFuLei.rg_CongWenJianChuangJian4 (rg_DangQianSuoChuChuangKou7, rg_WenJian1);
            rg_AnZhuangZiZiYuanBiaoShiFu1 (rg_DangQianSuoChuChuangKou7, rg_WenJianZiYuan);
        }
        else
        {
            rg_AnZhuangZiZiYuanBiaoShiFu (rg_DangQianSuoChuChuangKou7, rg_WenJian1);
        }
    }

    public static void rg_AnZhuangZiZiYuanBiaoShiFu (android.app.Activity rg_DangQianSuoChuChuangKou8, java.io.File rg_WenJian2) {
        android.content.Intent intentInstall = new android.content.Intent(android.content.Intent.ACTION_VIEW);
        intentInstall.setDataAndType(android.net.Uri.fromFile(rg_WenJian2), "application/vnd.android.package-archive");
        intentInstall.setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
        rg_DangQianSuoChuChuangKou8.startActivity(intentInstall);
    }

    public static void rg_AnZhuangZiZiYuanBiaoShiFu1 (android.app.Activity rg_DangQianSuoChuChuangKou9, android.net.Uri rg_WenJianZiYuan1) {
        android.content.Intent intentInstall = new android.content.Intent(android.content.Intent.ACTION_VIEW);
        intentInstall.setFlags(android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intentInstall.setDataAndType(rg_WenJianZiYuan1, "application/vnd.android.package-archive");
        rg_DangQianSuoChuChuangKou9.startActivity(intentInstall);
    }
}
