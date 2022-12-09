
package huoShan.AnZhuo.SheBei.LaYaCaoZuo;

public final class rg_LaYaSheBeiLei {

    public static final String rg_EWaiZiDuan_LaYaSheBeiDuiXiang = "android.bluetooth.device.extra.DEVICE";
    public static final String rg_EWaiZiDuan_XinHaoZhi = "android.bluetooth.device.extra.RSSI";
    public static final String rg_BangDingZhuangTaiBianHua = "android.bluetooth.device.action.BOND_STATE_CHANGED";
    public static final String rg_XinZhaoSheBei = "android.bluetooth.device.action.FOUND";
    public static final String rg_QingQiuPeiDui = "android.bluetooth.device.action.PAIRING_REQUEST";
    public static final int rg_YiPeiDui = 12;
    public static final int rg_ZhengZaiPeiDui = 11;
    public static final int rg_WeiPeiDui = 10;

    public static android.bluetooth.BluetoothSocket rg_ChuangJianChuanHangXianXingFangZhenXieYiAnQuanTaoJieZi (android.bluetooth.BluetoothDevice rg_YuCaoZuoDuiXiang68, java.util.UUID rg_BiaoShiFu5) {
        try {
            return rg_YuCaoZuoDuiXiang68.createRfcommSocketToServiceRecord(rg_BiaoShiFu5);
        } catch (Exception e) {
            return null;
        }
    }

    public static android.bluetooth.BluetoothClass rg_LaYaLeiDuiXiang (android.bluetooth.BluetoothDevice rg_YuCaoZuoDuiXiang71) {
        return rg_YuCaoZuoDuiXiang71.getBluetoothClass();
    }
}
