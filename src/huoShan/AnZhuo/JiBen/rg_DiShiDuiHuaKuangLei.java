
package huoShan.AnZhuo.JiBen;

import android.app.AlertDialog;
import android.view.ViewGroup;

public class rg_DiShiDuiHuaKuangLei extends rg_DuiHuaKuangLei implements 
     android.content.DialogInterface.OnClickListener,
     android.content.DialogInterface.OnMultiChoiceClickListener {

    public rg_DiShiDuiHuaKuangLei ()  { }

    rg_DiShiDuiHuaKuangLei (android.app.Dialog dlg) { super (dlg); }
    @Override public void onClick (android.content.DialogInterface dialog, int which, boolean isChecked) { rg_DuoXuanXiangMuBeiXuanZhong (which, isChecked); }
    @Override public void onClick (android.content.DialogInterface dialog, int which) { rg_XiangMuBeiXuanZhong (which); }

    public static rg_DiShiDuiHuaKuangLei rg_ChuangJianDiShiDuiHuaKuang (android.app.Activity rg_ChuangKouShangXiaWen1) {
        return new rg_DiShiDuiHuaKuangLei (new AlertDialog.Builder (rg_ChuangKouShangXiaWen1).create ());
    }

    public void rg_NeiRong9 (final String rg_DiShiNeiRong5) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                ((android.app.AlertDialog) m_dlg).setMessage (rg_DiShiNeiRong5);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ((android.app.AlertDialog) m_dlg).setMessage (rg_DiShiNeiRong5);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiZuJian1 (final AndroidView rg_YuZhiRuHuoShanZuJian2, final int rg_ZuoBianJu, final int rg_DingBianJu, final int rg_YouBianJu, final int rg_DeBianJu) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                ((android.app.AlertDialog) m_dlg).setView (rg_YuZhiRuHuoShanZuJian2.GetView(), rg_ZuoBianJu, rg_DingBianJu, rg_YouBianJu, rg_DeBianJu);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ((android.app.AlertDialog) m_dlg).setView (rg_YuZhiRuHuoShanZuJian2.GetView(), rg_ZuoBianJu, rg_DingBianJu, rg_YouBianJu, rg_DeBianJu);
                    } catch (Exception e) { }
                } } );
        }
    }

    public static interface re_DuoXuanXiangMuBeiXuanZhong { int dispatch (rg_DiShiDuiHuaKuangLei objSource, int nTagNumber, int rg_BeiXuanZhongXiangMuSuoYin1, boolean rg_ShiFouXuanZhong1); }
    private re_DuoXuanXiangMuBeiXuanZhong rd_DuoXuanXiangMuBeiXuanZhong;
    private int rd_DuoXuanXiangMuBeiXuanZhong_tag;
    public void rl_DiShiDuiHuaKuangLei_DuoXuanXiangMuBeiXuanZhong (re_DuoXuanXiangMuBeiXuanZhong objListener, int nTagNumber) {
        synchronized (this) { rd_DuoXuanXiangMuBeiXuanZhong = objListener;  rd_DuoXuanXiangMuBeiXuanZhong_tag = nTagNumber; }
    }
    public int rg_DuoXuanXiangMuBeiXuanZhong (int rg_BeiXuanZhongXiangMuSuoYin1, boolean rg_ShiFouXuanZhong1) {
        re_DuoXuanXiangMuBeiXuanZhong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_DuoXuanXiangMuBeiXuanZhong;  nTagNumber = rd_DuoXuanXiangMuBeiXuanZhong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BeiXuanZhongXiangMuSuoYin1, rg_ShiFouXuanZhong1) : 0);
    }

    public static interface re_XiangMuBeiXuanZhong { int dispatch (rg_DiShiDuiHuaKuangLei objSource, int nTagNumber, int rg_BeiXuanZhongXiangMuSuoYin2); }
    private re_XiangMuBeiXuanZhong rd_XiangMuBeiXuanZhong;
    private int rd_XiangMuBeiXuanZhong_tag;
    public void rl_DiShiDuiHuaKuangLei_XiangMuBeiXuanZhong (re_XiangMuBeiXuanZhong objListener, int nTagNumber) {
        synchronized (this) { rd_XiangMuBeiXuanZhong = objListener;  rd_XiangMuBeiXuanZhong_tag = nTagNumber; }
    }
    public int rg_XiangMuBeiXuanZhong (int rg_BeiXuanZhongXiangMuSuoYin2) {
        re_XiangMuBeiXuanZhong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_XiangMuBeiXuanZhong;  nTagNumber = rd_XiangMuBeiXuanZhong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BeiXuanZhongXiangMuSuoYin2) : 0);
    }
}
