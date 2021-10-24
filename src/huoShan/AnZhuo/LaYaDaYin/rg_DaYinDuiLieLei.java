
package huoShan.AnZhuo.LaYaDaYin;

class rg_DaYinDuiLieLei {

    public rg_DaYinDuiLieLei ()  { }

    protected static rg_DaYinDuiLieLei rg_DaYinDuiLieDuiXiang;
    protected java.util.ArrayList<byte[]> rg_RenWuLieBiao;
    protected android.bluetooth.BluetoothAdapter rg_LaYaKuoPeiQi2;
    protected rg_LaYaDaYinFuWuLei rg_DaYinFuWuDuiXiang;
    static android.content.Context mContext;

    public static rg_DaYinDuiLieLei rg_QuShiLi1 (android.content.Context rg_ChuangKouDuiXiang22) {
        if (rg_DaYinDuiLieDuiXiang == null)
        {
            rg_DaYinDuiLieDuiXiang = new rg_DaYinDuiLieLei ();
        }
        if (mContext == null)
        {
            mContext = rg_ChuangKouDuiXiang22;
        }
        return (rg_DaYinDuiLieDuiXiang);
    }

    public synchronized void rg_DaYin () {
        if (rg_RenWuLieBiao == null || rg_RenWuLieBiao.size() <= 0)
        {
            return;
        }
        if (rg_LaYaKuoPeiQi2 == null)
        {
            rg_LaYaKuoPeiQi2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            if (rg_LaYaKuoPeiQi2 == null)
            {
                return;
            }
        }
        if (rg_DaYinFuWuDuiXiang == null)
        {
            rg_DaYinFuWuDuiXiang = new rg_LaYaDaYinFuWuLei (mContext);
        }
        if (rg_DaYinFuWuDuiXiang.rg_ZhuangTai15 () != rg_LaYaDaYinFuWuLei.rg_ZhuangTai_YiLianJie)
        {
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_LaYaDaYinXinXiLei.rg_QuSheBeiDeZhi ()) == false)
            {
                android.bluetooth.BluetoothDevice rg_SheBei35;
                rg_SheBei35 = huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_QuZhiDingLaYaSheBei (rg_LaYaKuoPeiQi2, rg_LaYaDaYinXinXiLei.rg_QuSheBeiDeZhi ());
                if (rg_SheBei35 == null)
                {
                    return;
                }
                rg_DaYinFuWuDuiXiang.rg_LianJie4 (rg_SheBei35);
                return;
            }
        }
        while (rg_RenWuLieBiao.size() > 0)
        {
            rg_DaYinFuWuDuiXiang.rg_XieChu (rg_RenWuLieBiao.get (0));
            rg_ZhiLingZiJieShuZuLieBiaoLei.rg_ShanChuZhiDingWeiZhiChengYuan38 (rg_RenWuLieBiao, 0);
        }
    }
}
