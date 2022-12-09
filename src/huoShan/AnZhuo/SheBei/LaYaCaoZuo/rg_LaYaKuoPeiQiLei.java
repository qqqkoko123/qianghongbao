
package huoShan.AnZhuo.SheBei.LaYaCaoZuo;

public final class rg_LaYaKuoPeiQiLei {

    public static final String rg_ChaZhaoWanBi = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    public static final String rg_KaiShiChaZhao = "android.bluetooth.adapter.action.DISCOVERY_STARTED";

    public static android.bluetooth.BluetoothDevice rg_QuZhiDingLaYaSheBei (android.bluetooth.BluetoothAdapter rg_YuCaoZuoDuiXiang34, String rg_Can_DeZhi3) {
        try {
            return rg_YuCaoZuoDuiXiang34.getRemoteDevice(rg_Can_DeZhi3);
        } catch (Exception e) {
            return null;
        }
    }

    public static int rg_ZhuangTai10 (android.bluetooth.BluetoothAdapter rg_YuCaoZuoDuiXiang42) {
        return rg_YuCaoZuoDuiXiang42.getState();
    }
}
