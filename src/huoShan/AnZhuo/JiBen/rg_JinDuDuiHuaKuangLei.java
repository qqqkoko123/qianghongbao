
package huoShan.AnZhuo.JiBen;

import android.view.ViewGroup;

public class rg_JinDuDuiHuaKuangLei extends rg_DiShiDuiHuaKuangLei {

    public rg_JinDuDuiHuaKuangLei ()  { }

    rg_JinDuDuiHuaKuangLei (android.app.Dialog dlg) { super (dlg); }

    public static rg_JinDuDuiHuaKuangLei rg_ChuangJian19 (android.app.Activity rg_ChuangKouShangXiaWen5) {
        android.app.ProgressDialog dlg = new android.app.ProgressDialog (rg_ChuangKouShangXiaWen5);
        dlg.setCanceledOnTouchOutside (false);
        dlg.setCancelable (false);
        return new rg_JinDuDuiHuaKuangLei (dlg);
    }
}
