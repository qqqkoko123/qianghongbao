
package huoShan.AnZhuo.LaYaDaYin;

class rg_LaYaDaYinFuWuLei {

    public rg_LaYaDaYinFuWuLei ()  { }

    public static final int rg_ZhuangTai_MoCaoZuo = 0;
    public static final int rg_ZhuangTai_ZhenTingZhong = 1;
    public static final int rg_ZhuangTai_LianJieZhong = 2;
    public static final int rg_ZhuangTai_YiLianJie = 3;
    public static final String rg_WeiYiBiaoShiWenBen = "0001101-0000-1000-8000-00805F9B34FB";
    public static final int rg_ShiJian_ZhengZaiLianJie = 0;
    public static final int rg_ShiJian_LianJieWanBi = 1;
    public static final int rg_ShiJian_LianJieShiBai = 2;
    public static final int rg_ShiJian_LianJieZhongDuan = 3;
    public static final int rg_ShiJian_ZhuangTaiGengXin = 4;
    protected android.content.Context rg_ChuangKouShangXiaWen16;
    protected int rg_DangQianZhuangTai6 = 0;
    public android.bluetooth.BluetoothAdapter rg_LaYaKuoPeiQi1;
    public rg_LaYaLianJieXianChengLei rg_XianCheng_LianJieXianCheng;
    public rg_LaYaGuanLiXianChengLei rg_XianCheng_LianJieWanBiXianCheng;
    public rg_LaYaZhenTingXianChengLei rg_XianCheng_ZhenTingXianCheng;
    public java.util.UUID rg_WeiYiBiaoShiDuiXiang;
        public rg_LaYaDaYinFuWuLei (android.content.Context context) {
            rg_ChuShiHua21 ();
            this.rg_ChuangKouShangXiaWen16 = context;
            this.rg_DangQianZhuangTai6  = rg_ZhuangTai_MoCaoZuo;
            this.rg_LaYaKuoPeiQi1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }

    public synchronized void rg_ZhuangTai14 (int rg_SuoYuSheZhiZhuangTai) {
        rg_DangQianZhuangTai6 = rg_SuoYuSheZhiZhuangTai;
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing5 = new rg_ShiJianZongXianZhuangTaiLei ();
        rg_ShiJianLeiXing5.rg_LeiXing36 = rg_LaYaDaYinFuWuLei.rg_ShiJian_ZhuangTaiGengXin;
        rg_ShiJianLeiXing5.rg_DuiXiangZhi = Integer.valueOf (rg_DangQianZhuangTai6);
        org.greenrobot.eventbus.EventBus.getDefault().post(rg_ShiJianLeiXing5);
    }

    public synchronized int rg_ZhuangTai15 () {
        return (rg_DangQianZhuangTai6);
    }

    public synchronized void rg_LianJie4 (android.bluetooth.BluetoothDevice rg_LaYaSheBei2) {
        if (rg_DangQianZhuangTai6 == rg_ZhuangTai_LianJieZhong)
        {
            if (rg_XianCheng_LianJieXianCheng != null)
            {
                rg_XianCheng_LianJieXianCheng.rg_QuXiao2 ();
                rg_XianCheng_LianJieXianCheng = null;
            }
        }
        if (rg_XianCheng_LianJieWanBiXianCheng != null)
        {
            rg_XianCheng_LianJieWanBiXianCheng.rg_QuXiao4 ();
            rg_XianCheng_LianJieWanBiXianCheng = null;
        }
        if (rg_XianCheng_ZhenTingXianCheng != null)
        {
            rg_XianCheng_ZhenTingXianCheng.rg_QuXiao3 ();
            rg_XianCheng_ZhenTingXianCheng = null;
        }
        rg_XianCheng_LianJieXianCheng = rg_LaYaLianJieXianChengLei.rg_ChuangJian149 (rg_LaYaSheBei2, this);
        rg_XianCheng_LianJieXianCheng.rg_QiDong6 ();
        rg_ZhuangTai14 (rg_ZhuangTai_LianJieZhong);
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing6 = new rg_ShiJianZongXianZhuangTaiLei ();
        rg_ShiJianLeiXing6.rg_LeiXing36 = rg_LaYaDaYinFuWuLei.rg_ShiJian_ZhengZaiLianJie;
        org.greenrobot.eventbus.EventBus.getDefault().post(rg_ShiJianLeiXing6);
    }

    public synchronized void rg_LianJieShiBai () {
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing7 = new rg_ShiJianZongXianZhuangTaiLei ();
        rg_ZhuangTai14 (rg_ZhuangTai_MoCaoZuo);
        rg_ShiJianLeiXing7.rg_LeiXing36 = rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieShiBai;
        org.greenrobot.eventbus.EventBus.getDefault().post(rg_ShiJianLeiXing7);
        rg_LaYaDaYinXinXiLei.rg_ZhiSheBeiMingChen ("");
        rg_LaYaDaYinXinXiLei.rg_ZhiSheBeiDeZhi ("");
    }

    public synchronized void rg_LianJieZhongDuan (boolean rg_ShiFouZhuDong) {
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing8 = new rg_ShiJianZongXianZhuangTaiLei ();
        rg_ZhuangTai14 (rg_ZhuangTai_MoCaoZuo);
        rg_ShiJianLeiXing8.rg_LeiXing36 = rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieZhongDuan;
        rg_ShiJianLeiXing8.rg_LuoJiZhi1 = rg_ShiFouZhuDong;
        org.greenrobot.eventbus.EventBus.getDefault().post(rg_ShiJianLeiXing8);
        rg_LaYaDaYinXinXiLei.rg_ZhiSheBeiMingChen ("");
        rg_LaYaDaYinXinXiLei.rg_ZhiSheBeiDeZhi ("");
    }

    public synchronized void rg_LianJieWanBi1 (android.bluetooth.BluetoothSocket rg_Can_LaYaTaoJieZi) {
        if (rg_XianCheng_LianJieXianCheng != null)
        {
            rg_XianCheng_LianJieXianCheng.rg_QuXiao2 ();
            rg_XianCheng_LianJieXianCheng = null;
        }
        if (rg_XianCheng_LianJieWanBiXianCheng != null)
        {
            rg_XianCheng_LianJieWanBiXianCheng.rg_QuXiao4 ();
            rg_XianCheng_LianJieWanBiXianCheng = null;
        }
        if (rg_XianCheng_ZhenTingXianCheng != null)
        {
            rg_XianCheng_ZhenTingXianCheng.rg_QuXiao3 ();
            rg_XianCheng_ZhenTingXianCheng = null;
        }
        rg_XianCheng_LianJieWanBiXianCheng = rg_LaYaGuanLiXianChengLei.rg_ChuangJian151 (rg_Can_LaYaTaoJieZi, this);
        rg_XianCheng_LianJieWanBiXianCheng.rg_QiDong6 ();
        rg_ZhuangTai14 (rg_ZhuangTai_YiLianJie);
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing9 = new rg_ShiJianZongXianZhuangTaiLei ();
        rg_ShiJianLeiXing9.rg_LeiXing36 = rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieWanBi;
        org.greenrobot.eventbus.EventBus.getDefault().post(rg_ShiJianLeiXing9);
        rg_DaYinDuiLieLei.rg_QuShiLi1 (rg_ChuangKouShangXiaWen16).rg_DaYin ();
    }

    public void rg_XieChu (byte [] rg_SuoXieChuZiJieShuZu) {
        rg_LaYaGuanLiXianChengLei rg_LinShiXianCheng;
        rg_LinShiXianCheng = null;
        synchronized (this)
        {
            if (rg_ZhuangTai15 () != rg_ZhuangTai_YiLianJie)
            {
                return;
            }
            rg_LinShiXianCheng = rg_XianCheng_LianJieWanBiXianCheng;
        }
        rg_LinShiXianCheng.rg_XieChuShuJu (rg_SuoXieChuZiJieShuZu);
    }

    protected void rg_ChuShiHua21 () {
        rg_WeiYiBiaoShiDuiXiang = java.util.UUID.fromString(rg_WeiYiBiaoShiWenBen);
    }
}
