
package huoShan.AnZhuo.LaYaDaYin;

class rg_LaYaLianJieXianChengLei extends rg_LaYaFuWuXianChengJiChuLei {

    public rg_LaYaLianJieXianChengLei ()  { }

    protected android.bluetooth.BluetoothDevice rg_Lei_LaYaSheBei;
    protected android.bluetooth.BluetoothSocket rg_Lei_LaYaTaoJieZi;
    protected rg_LaYaDaYinFuWuLei rg_Lei_LaYaDaYinFuWu;

    public static rg_LaYaLianJieXianChengLei rg_ChuangJian149 (android.bluetooth.BluetoothDevice rg_DangQianLaYaSheBei, rg_LaYaDaYinFuWuLei rg_LaYaDaYinFuWuDuiXiang) {
        rg_LaYaLianJieXianChengLei rg_LaYaLianJieXianCheng;
        rg_LaYaLianJieXianCheng = new rg_LaYaLianJieXianChengLei ();
        rg_LaYaLianJieXianCheng.rg_Lei_LaYaSheBei = rg_DangQianLaYaSheBei;
        rg_LaYaLianJieXianCheng.rg_Lei_LaYaDaYinFuWu = rg_LaYaDaYinFuWuDuiXiang;
        android.bluetooth.BluetoothSocket rg_Lin_LaYaTaoJieZi;
        rg_Lin_LaYaTaoJieZi = huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_ChuangJianChuanHangXianXingFangZhenXieYiAnQuanTaoJieZi (rg_DangQianLaYaSheBei, rg_LaYaDaYinFuWuDuiXiang.rg_WeiYiBiaoShiDuiXiang);
        if (rg_Lin_LaYaTaoJieZi == null)
        {
            huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log ("蓝牙套接字创建失败,无法继续.退出方法!", "");
            return (null);
        }
        rg_LaYaLianJieXianCheng.rg_Lei_LaYaTaoJieZi = rg_Lin_LaYaTaoJieZi;
        return (rg_LaYaLianJieXianCheng);
    }

    public void rg_QuXiao2 () {
        huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_GuanBi23 (rg_Lei_LaYaTaoJieZi);
    }

    public void rg_ZhengZaiYunHang () {
        rg_Lei_LaYaDaYinFuWu.rg_LaYaKuoPeiQi1.cancelDiscovery();
        if (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_LianJie1 (rg_Lei_LaYaTaoJieZi) == false)
        {
            huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log ("连接蓝牙设备失败.", "");
            rg_Lei_LaYaDaYinFuWu.rg_LianJieShiBai ();
            return;
        }
        synchronized (rg_Lei_LaYaDaYinFuWu)
        {
            rg_Lei_LaYaDaYinFuWu.rg_XianCheng_LianJieXianCheng = null;
        }
        rg_Lei_LaYaDaYinFuWu.rg_LianJieWanBi1 (rg_Lei_LaYaTaoJieZi);
    }
}
