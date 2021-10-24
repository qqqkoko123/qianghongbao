
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndComActivity {

    private static final int rg_GuanBiWenBen = com.qqq.WXhongbao.R.string.rg_guanbiwenben;
    private static final int rg_TuBiao13 = com.qqq.WXhongbao.R.drawable.info_icon;
    private static final int rg_BiaoTiZiYuan4 = com.qqq.WXhongbao.R.string.rg_biaotiziyuan4;
    public static final int rg_QianJingYanSe = android.R.attr.colorForeground;
    public static final int rg_BeiJingYanSe = android.R.attr.colorBackground;
    private static final String cs_strActivityLoadParams = "@activity_params";
    public static void sStartNewActivity (final android.content.Context context, final Class clsActivity,
            final android.os.Bundle bundle, final int nRequestCode, final int nAddFlags, final Object... params) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                _sStartNewActivity (context, clsActivity, bundle, nRequestCode, nAddFlags,  params);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        _sStartNewActivity (context, clsActivity, bundle, nRequestCode, nAddFlags,  params);
                    } catch (Exception e) { }
                } } );
        }
    }
    public static boolean _sStartNewActivity (android.content.Context context, Class clsActivity,
            android.os.Bundle bundle, int nRequestCode, int nAddFlags, Object... params) {
        rg_QuanJuShuJuCunChuQiLei objCache = rg_YingYongChengXu.sGetGlobalDataCache ();
        int nParamDataIdentifier = 0;
        try {
            android.content.Intent objIntent = new android.content.Intent (context, clsActivity);
            if (nAddFlags != 0)
                objIntent.addFlags (nAddFlags);
            if (bundle != null)
                objIntent.putExtras (bundle);
            if (params != null && params.length > 0) {
                nParamDataIdentifier = objCache.Push (params);
                objIntent.putExtra (cs_strActivityLoadParams, nParamDataIdentifier);
            }
            if (nRequestCode != 0 && context instanceof android.app.Activity)
                ((android.app.Activity)context).startActivityForResult (objIntent, nRequestCode);
            else
                context.startActivity (objIntent);
            return true;
        } catch (Exception e) { }
        objCache.Remove (nParamDataIdentifier);
        return false;
    }

    public static void rg_XinXiKuang (final android.app.Activity rg_YuCaoZuoBenDuiXiang608, int rg_YuXianShiDeTuBiaoZiYuan, final String rg_YuXianShiDeNeiRongWenBen, final String rg_YuXianShiDeBiaoTiWenBen) {
        final android.graphics.drawable.Drawable objDrawable = rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_YuXianShiDeTuBiaoZiYuan);
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                new android.app.AlertDialog.Builder (rg_YuCaoZuoBenDuiXiang608).
                       setIcon (objDrawable).setPositiveButton (rg_GuanBiWenBen, null).
                       setTitle (rg_YuXianShiDeBiaoTiWenBen).setMessage (rg_YuXianShiDeNeiRongWenBen).show ();
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        new android.app.AlertDialog.Builder (rg_YuCaoZuoBenDuiXiang608).
                                   setIcon (objDrawable).setPositiveButton (rg_GuanBiWenBen, null).
                                   setTitle (rg_YuXianShiDeBiaoTiWenBen).setMessage (rg_YuXianShiDeNeiRongWenBen).show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public static void rg_DiShiXinXiKuang (final android.app.Activity rg_YuCaoZuoBenDuiXiang609, final String rg_YuXianShiDeNeiRongWenBen1) {
        AndComActivity.rg_XinXiKuang (rg_YuCaoZuoBenDuiXiang609, rg_TuBiao13, rg_YuXianShiDeNeiRongWenBen1, rg_ZiYuanGuanLiQi.rg_QuWenBenZiYuan (rg_BiaoTiZiYuan4, ""));
    }

    public static boolean rg_DaKaiZhiDingYingYong (android.app.Activity rg_YuCaoZuoBenDuiXiang633, String rg_YingYongBaoMing) {
        android.content.Intent intent = rg_YuCaoZuoBenDuiXiang633.getPackageManager().getLaunchIntentForPackage(rg_YingYongBaoMing);
        intent.setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK|android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
        try
        {
            rg_YuCaoZuoBenDuiXiang633.startActivity(intent);
            return (true);
        }
        catch (Exception _vol_e_catched)
        {
            return (false);
        }
    }
}
