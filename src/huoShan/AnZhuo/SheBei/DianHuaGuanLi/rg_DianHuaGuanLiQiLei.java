
package huoShan.AnZhuo.SheBei.DianHuaGuanLi;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

public class rg_DianHuaGuanLiQiLei extends android.telephony.PhoneStateListener {

    public rg_DianHuaGuanLiQiLei () {
        rg_DianHuaGuanLiQiLei_Lei_ChuShiHua ();
    }

    private android.telephony.TelephonyManager mTelephonyManager;

    protected void rg_DianHuaGuanLiQiLei_Lei_ChuShiHua () {
        mTelephonyManager = (android.telephony.TelephonyManager) huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp().getSystemService(android.content.Context.TELEPHONY_SERVICE);
    }

    public String rg_DianHuaKa1HaoMa () {
        return mTelephonyManager.getLine1Number ();
    }
}
