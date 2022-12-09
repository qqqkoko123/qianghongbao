
package huoShan.AnZhuo.LaYaDaYin;

class rg_LaYaGuanLiXianChengLei extends rg_LaYaFuWuXianChengJiChuLei {

    public rg_LaYaGuanLiXianChengLei ()  { }

    protected android.bluetooth.BluetoothSocket rg_Lei_LaYaTaoJieZi2;
    protected rg_LaYaDaYinFuWuLei rg_Lei_LaYaDaYinFuWu2;
    protected java.io.InputStream rg_Lei_ShuRuDuiXiang;
    protected java.io.OutputStream rg_Lei_ShuChuDuiXiang;
    protected boolean rg_Lei_ZhuDongDuanKai = false;

    public static rg_LaYaGuanLiXianChengLei rg_ChuangJian152 (android.bluetooth.BluetoothSocket rg_Can_LaYaTaoJieZi1, rg_LaYaDaYinFuWuLei rg_LaYaDaYinFuWu1) {
        rg_LaYaGuanLiXianChengLei rg_LaYaGuanLiXianCheng;
        rg_LaYaGuanLiXianCheng = new rg_LaYaGuanLiXianChengLei ();
        rg_LaYaGuanLiXianCheng.rg_Lei_LaYaTaoJieZi2 = rg_Can_LaYaTaoJieZi1;
        rg_LaYaGuanLiXianCheng.rg_Lei_LaYaDaYinFuWu2 = rg_LaYaDaYinFuWu1;
        rg_LaYaGuanLiXianCheng.rg_Lei_ShuRuDuiXiang = huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_ShuRuLiu (rg_Can_LaYaTaoJieZi1);
        rg_LaYaGuanLiXianCheng.rg_Lei_ShuChuDuiXiang = huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_ShuChuLiu (rg_Can_LaYaTaoJieZi1);
        if (rg_LaYaGuanLiXianCheng.rg_Lei_ShuRuDuiXiang == null || rg_LaYaGuanLiXianCheng.rg_Lei_ShuChuDuiXiang == null)
        {
            huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log ("错误！", "");
            return (null);
        }
        return (rg_LaYaGuanLiXianCheng);
    }

    public void rg_ZhengZaiYunHang () {
        byte [] rg_HuanChongOu13 = new byte [1024];
        int rg_ZiJieChangDu = 0;
        while (true)
        {
            try
            {
                rg_ZiJieChangDu = rg_Lei_LaYaTaoJieZi2.getInputStream().read (rg_HuanChongOu13);
                byte [] rg_LinShiShuZu1;
                rg_LinShiShuZu1 = new byte [rg_ZiJieChangDu];
                System.arraycopy (rg_HuanChongOu13, 0, rg_LinShiShuZu1, 0, rg_ZiJieChangDu);
            }
            catch (Exception _vol_e_catched)
            {
                rg_Lei_LaYaDaYinFuWu2.rg_LianJieZhongDuan (rg_Lei_ZhuDongDuanKai);
                break;
            }
        }
    }

    public void rg_XieChuShuJu (byte [] rg_SuoYuXieChuZiJieShuZu) {
        if (huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuShuJu4 (rg_Lei_ShuChuDuiXiang, rg_SuoYuXieChuZiJieShuZu, null) == false)
        {
            huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log ("数据打印失败,原因,管理线程通过输出对象写出数据失败！", "");
        }
    }

    public void rg_QuXiao4 () {
        rg_Lei_ZhuDongDuanKai = true;
        huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaTaoJieZiLei.rg_GuanBi23 (rg_Lei_LaYaTaoJieZi2);
    }
}
