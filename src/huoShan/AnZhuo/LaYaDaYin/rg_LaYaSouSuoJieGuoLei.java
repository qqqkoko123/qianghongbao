
package huoShan.AnZhuo.LaYaDaYin;

public class rg_LaYaSouSuoJieGuoLei {

    public rg_LaYaSouSuoJieGuoLei ()  { }

    public rg_LaYaSouSuoJieGuoLei (String name, String addr, android.bluetooth.BluetoothDevice dev, int bindState) {
        rg_DeZhi18 = addr;
        rg_MingChen23 = name;
        rg_SheBeiDuiXiang2 = dev;
        rg_BangDingZhuangTai1 = bindState;
    }
    public String rg_DeZhi18 = "";
    public String rg_MingChen23 = "";
    public android.bluetooth.BluetoothDevice rg_SheBeiDuiXiang2;
    public int rg_BangDingZhuangTai1;
}
