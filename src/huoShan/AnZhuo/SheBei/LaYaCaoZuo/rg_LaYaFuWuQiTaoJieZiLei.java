
package huoShan.AnZhuo.SheBei.LaYaCaoZuo;

public final class rg_LaYaFuWuQiTaoJieZiLei {

    public static android.bluetooth.BluetoothSocket rg_QuTaoJieZiDuiXiang1 (android.bluetooth.BluetoothServerSocket rg_YuCaoZuoBenDuiXiang2412, int rg_ChaoShi3) {
        try {
            return rg_YuCaoZuoBenDuiXiang2412.accept(rg_ChaoShi3);
        } catch (Exception e) {
            return null;
        }
    }

    public static void rg_GuanBi22 (android.bluetooth.BluetoothServerSocket rg_YuCaoZuoBenDuiXiang2413) {
        try {
            rg_YuCaoZuoBenDuiXiang2413.close();
        } catch (Exception e) { }
    }
}
