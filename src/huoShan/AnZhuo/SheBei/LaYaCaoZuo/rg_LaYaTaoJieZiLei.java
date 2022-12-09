
package huoShan.AnZhuo.SheBei.LaYaCaoZuo;

public final class rg_LaYaTaoJieZiLei {

    public static boolean rg_LianJie1 (android.bluetooth.BluetoothSocket rg_YuCaoZuoBenDuiXiang2415) {
        try {
            rg_YuCaoZuoBenDuiXiang2415.connect ();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void rg_GuanBi23 (android.bluetooth.BluetoothSocket rg_YuCaoZuoBenDuiXiang2416) {
        try {
            rg_YuCaoZuoBenDuiXiang2416.close();
        } catch (Exception e) { }
    }

    public static java.io.InputStream rg_ShuRuLiu (android.bluetooth.BluetoothSocket rg_YuCaoZuoBenDuiXiang2418) {
        try {
            return rg_YuCaoZuoBenDuiXiang2418.getInputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.io.OutputStream rg_ShuChuLiu (android.bluetooth.BluetoothSocket rg_YuCaoZuoBenDuiXiang2419) {
        try {
            return rg_YuCaoZuoBenDuiXiang2419.getOutputStream();
        } catch (Exception e) {
            return null;
        }
    }
}
