
package huoShan.AnZhuo.SheBei.LaYaCaoZuo;

public final class rg_LaYaFuWuQiTaoJieZiLei {

    public static android.bluetooth.BluetoothSocket rg_QuTaoJieZiDuiXiang1 (android.bluetooth.BluetoothServerSocket rg_YuCaoZuoBenDuiXiang2413, int rg_ChaoShi5) {
        try {
            return rg_YuCaoZuoBenDuiXiang2413.accept(rg_ChaoShi5);
        } catch (Exception e) {
            return null;
        }
    }

    public static void rg_GuanBi22 (android.bluetooth.BluetoothServerSocket rg_YuCaoZuoBenDuiXiang2414) {
        try {
            rg_YuCaoZuoBenDuiXiang2414.close();
        } catch (Exception e) { }
    }
}
