
package huoShan.AnZhuo.JiBen;

public class rg_ZiYuanBiaoShiFuLei {

    public static android.net.Uri rg_CongWenJianChuangJian4 (android.app.Activity rg_DangQianSuoChuChuangKou12, java.io.File rg_WenJianMingDuiXiang1) {
        android.net.Uri fileUri = null;
        if (android.os.Build.VERSION.SDK_INT >= 24)
            fileUri = android.support.v4.content.FileProvider.getUriForFile(rg_DangQianSuoChuChuangKou12, rg_DangQianSuoChuChuangKou12.getPackageName() + ".fileprovider", rg_WenJianMingDuiXiang1);
        else
            fileUri = android.net.Uri.fromFile(rg_WenJianMingDuiXiang1);
        return fileUri;
    }
}
