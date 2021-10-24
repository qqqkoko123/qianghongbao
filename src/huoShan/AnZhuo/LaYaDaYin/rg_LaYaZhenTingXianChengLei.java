
package huoShan.AnZhuo.LaYaDaYin;

class rg_LaYaZhenTingXianChengLei extends rg_LaYaFuWuXianChengJiChuLei {

    public rg_LaYaZhenTingXianChengLei ()  { }

    protected rg_LaYaDaYinFuWuLei rg_Lei_LaYaDaYinFuWu1;
    protected android.bluetooth.BluetoothServerSocket rg_Lei_LaYaTaoJieZi1;

    public void rg_ZhengZaiYunHang () {
        android.bluetooth.BluetoothSocket rg_TaoJieZi;
        while (rg_Lei_LaYaDaYinFuWu1.rg_ZhuangTai15 () != rg_LaYaDaYinFuWuLei.rg_ZhuangTai_YiLianJie)
        {
            rg_TaoJieZi = huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaFuWuQiTaoJieZiLei.rg_QuTaoJieZiDuiXiang1 (rg_Lei_LaYaTaoJieZi1, 3000);
            if (rg_TaoJieZi == null)
            {
                huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log ("[蓝牙侦听线程类-正在运行]-> 错误,创建蓝牙套接字失败.", "");
                break;
            }
            if (rg_TaoJieZi != null)
            {
                synchronized (rg_Lei_LaYaDaYinFuWu1)
                {
                    if (rg_Lei_LaYaDaYinFuWu1.rg_ZhuangTai15 () == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_ZhenTingZhong)
                    {
                    }
                    if (rg_Lei_LaYaDaYinFuWu1.rg_ZhuangTai15 () == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_LianJieZhong)
                    {
                        rg_Lei_LaYaDaYinFuWu1.rg_LianJieWanBi1 (rg_TaoJieZi);
                    }
                    if (rg_Lei_LaYaDaYinFuWu1.rg_ZhuangTai15 () == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_MoCaoZuo)
                    {
                    }
                    if (rg_Lei_LaYaDaYinFuWu1.rg_ZhuangTai15 () == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_YiLianJie)
                    {
                        huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_GuanBi23 (rg_TaoJieZi);
                    }
                }
            }
        }
    }

    public void rg_QuXiao3 () {
        huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaFuWuQiTaoJieZiLei.rg_GuanBi22 (rg_Lei_LaYaTaoJieZi1);
    }
}
