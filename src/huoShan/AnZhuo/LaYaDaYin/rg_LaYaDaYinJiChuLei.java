
package huoShan.AnZhuo.LaYaDaYin;

public class rg_LaYaDaYinJiChuLei {

    public rg_LaYaDaYinJiChuLei () {
        rg_LaYaDaYinJiChuLei_Lei_ChuShiHua ();
    }

    public huoShan.AnZhuo.JiBen.rg_QuanJuAnBoDongTaiJieShouQi rg_LaYaSouSuoJieGuoAnBo = new huoShan.AnZhuo.JiBen.rg_QuanJuAnBoDongTaiJieShouQi ();
    public android.bluetooth.BluetoothAdapter rg_LaYaKuoPeiQi;
    public int rg_DangQianLianJieZhuangTai1 = 0;
    protected rg_LaYaBiaoQianDaYinLei rg_MianChanDaYinShiLi;
    protected rg_LaYaPiaoJuDaYinLei rg_BiaoQianDaYinShiLi;
        int mLength;
        int width;
        public rg_LaYaDaYinJiChuLei (int a) {  }
        public rg_LaYaSouSuoJieGuoLei[] BleDevsToScans (java.util.Set <android.bluetooth.BluetoothDevice> Devs) {
            if (Devs == null || Devs.size() == 0)
                return null;
            rg_LaYaSouSuoJieGuoLei[] scas = new rg_LaYaSouSuoJieGuoLei [Devs.size()];
            int i = 0;
            for (android.bluetooth.BluetoothDevice dev : Devs) {
                scas [i] = new rg_LaYaSouSuoJieGuoLei (dev.getName (), dev.getAddress (), dev, dev.getBondState());
                i++;
            }
            return scas;
        }
        public byte[] createByteArray (byte...bytes) {
            byte[] mbyte = new byte[bytes.length];
            for (int i=0; i<bytes.length; i++)
                mbyte[i] = bytes[i];
            return mbyte;
        }

    {
        rg_LaYaSouSuoJieGuoAnBo.rl_QuanJuAnBoDongTaiJieShouQi_JieShouDaoQuanJuAnBo (new huoShan.AnZhuo.JiBen.rg_QuanJuAnBoDongTaiJieShouQi.re_JieShouDaoQuanJuAnBo () {
            public int dispatch (huoShan.AnZhuo.JiBen.rg_QuanJuAnBoDongTaiJieShouQi objSource, int nTagNumber, android.content.BroadcastReceiver rg_JieShouQiDuiXiang, android.content.Intent rg_QiDongXinXi6) {
                return rg_QuanJuAnBoDongTaiJieShouQi_JieShouDaoQuanJuAnBo (objSource, nTagNumber, rg_JieShouQiDuiXiang, rg_QiDongXinXi6);
            }
        }, 0);
    }

    protected void rg_LaYaDaYinJiChuLei_Lei_ChuShiHua () {
        rg_LaYaSouSuoJieGuoAnBo.MyRegisterGlobalReceiver (0, huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_KaiShiChaZhao, huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_ChaZhaoWanBi, "android.bluetooth.adapter.action.STATE_CHANGED", huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_BangDingZhuangTaiBianHua, huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_XinZhaoSheBei, huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_BangDingZhuangTaiBianHua);
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        rg_LaYaKuoPeiQi = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    }

    protected int rg_QuanJuAnBoDongTaiJieShouQi_JieShouDaoQuanJuAnBo (huoShan.AnZhuo.JiBen.rg_QuanJuAnBoDongTaiJieShouQi rg_LaiYuanDuiXiang48, int rg_BiaoJiZhi48, android.content.BroadcastReceiver rg_JieShouQiDuiXiang1, android.content.Intent rg_QiDongXinXi18) {
        if (rg_QiDongXinXi18.getAction ().equals (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_KaiShiChaZhao))
        {
            rg_KaiShiSouSuoSheBei1 ();
        }
        else if (rg_QiDongXinXi18.getAction ().equals (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_ChaZhaoWanBi))
        {
            rg_SheBeiSouSuoWanBi ();
        }
        else if (rg_QiDongXinXi18.getAction ().equals ("android.bluetooth.adapter.action.STATE_CHANGED"))
        {
            rg_ZhuangTaiBeiGaiBian2 (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaKuoPeiQiLei.rg_ZhuangTai10 (rg_LaYaKuoPeiQi));
        }
        else if (rg_QiDongXinXi18.getAction ().equals (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_BangDingZhuangTaiBianHua))
        {
            android.bluetooth.BluetoothDevice rg_LaYaSheBei;
            rg_LaYaSheBei = (android.bluetooth.BluetoothDevice)rg_QiDongXinXi18.getParcelableExtra (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_EWaiZiDuan_LaYaSheBeiDuiXiang);
            if (rg_LaYaSheBeiBangDingZhuangTai.rg_YiPeiDui1 == rg_LaYaSheBei.getBondState())
            {
                rg_BangDingZhuangTaiBeiGaiBian (rg_LaYaSheBeiBangDingZhuangTai.rg_YiPeiDui1, rg_LaYaSheBei);
            }
            else if (rg_LaYaSheBeiBangDingZhuangTai.rg_WeiPeiDui1 == rg_LaYaSheBei.getBondState())
            {
                rg_BangDingZhuangTaiBeiGaiBian (rg_LaYaSheBeiBangDingZhuangTai.rg_WeiPeiDui1, rg_LaYaSheBei);
            }
            else if (rg_LaYaSheBeiBangDingZhuangTai.rg_ZhengZaiPeiDui1 == rg_LaYaSheBei.getBondState())
            {
                rg_BangDingZhuangTaiBeiGaiBian (rg_LaYaSheBeiBangDingZhuangTai.rg_ZhengZaiPeiDui1, rg_LaYaSheBei);
            }
        }
        else if (rg_QiDongXinXi18.getAction ().equals (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_XinZhaoSheBei))
        {
            android.bluetooth.BluetoothDevice rg_LaYaSheBei1;
            rg_LaYaSheBei1 = (android.bluetooth.BluetoothDevice)rg_QiDongXinXi18.getParcelableExtra (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_EWaiZiDuan_LaYaSheBeiDuiXiang);
            if (rg_LaYaKuoPeiQi != null && rg_LaYaSheBei1 != null && (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_LaYaLeiDuiXiang (rg_LaYaSheBei1).getMajorDeviceClass ()) == huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaZhuYaoSheBeiLeiXing.rg_ChengXiangSheBei)
            {
                rg_LaYaSouSuoJieGuoLei rg_SheBeiXinXi = new rg_LaYaSouSuoJieGuoLei ();
                rg_SheBeiXinXi.rg_DeZhi18 = rg_LaYaSheBei1.getAddress();
                rg_SheBeiXinXi.rg_MingChen23 = rg_LaYaSheBei1.getName();
                rg_SheBeiXinXi.rg_SheBeiDuiXiang2 = rg_LaYaSheBei1;
                if (rg_LaYaSheBei1.getBondState() == huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_YiPeiDui)
                {
                    rg_SheBeiXinXi.rg_BangDingZhuangTai1 = rg_LaYaSheBeiBangDingZhuangTai.rg_YiPeiDui1;
                }
                else if (rg_LaYaSheBei1.getBondState() == huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_WeiPeiDui)
                {
                    rg_SheBeiXinXi.rg_BangDingZhuangTai1 = rg_LaYaSheBeiBangDingZhuangTai.rg_WeiPeiDui1;
                }
                else if (rg_LaYaSheBei1.getBondState() == huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_ZhengZaiPeiDui)
                {
                    rg_SheBeiXinXi.rg_BangDingZhuangTai1 = rg_LaYaSheBeiBangDingZhuangTai.rg_ZhengZaiPeiDui1;
                }
                rg_SouXinDaoDaYinSheBei (rg_SheBeiXinXi);
            }
        }
        else if (rg_QiDongXinXi18.getAction ().equals (huoShan.AnZhuo.SheBei.LaYaCaoZuo.rg_LaYaSheBeiLei.rg_QingQiuPeiDui))
        {
        }
        return (0);
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND) public void rg_ShiJianJieShou (final java.lang.Object rg_ShuJuDuiXiang32) {
        rg_ShiJianZongXianZhuangTaiLei rg_ShiJianLeiXing4;
        rg_ShiJianLeiXing4 = (rg_ShiJianZongXianZhuangTaiLei)rg_ShuJuDuiXiang32;
        if (rg_ShiJianLeiXing4.rg_LeiXing36 == rg_LaYaDaYinFuWuLei.rg_ShiJian_ZhengZaiLianJie)
        {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_ZhengZaiLianJieSheBei ();
                    } catch (Exception e) { }
                } } );
        }
        else if (rg_ShiJianLeiXing4.rg_LeiXing36 == rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieShiBai)
        {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_LianJieSheBeiShiBai ();
                    } catch (Exception e) { }
                } } );
        }
        else if (rg_ShiJianLeiXing4.rg_LeiXing36 == rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieZhongDuan)
        {
            final boolean state = rg_ShiJianLeiXing4.rg_LuoJiZhi1;
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_LianJieBeiZhongDuan (state);
                    } catch (Exception e) { }
                } } );
        }
        else if (rg_ShiJianLeiXing4.rg_LeiXing36 == rg_LaYaDaYinFuWuLei.rg_ShiJian_LianJieWanBi)
        {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_LianJieSheBeiChengGong ();
                    } catch (Exception e) { }
                } } );
        }
        else if (rg_ShiJianLeiXing4.rg_LeiXing36 == rg_LaYaDaYinFuWuLei.rg_ShiJian_ZhuangTaiGengXin)
        {
            if (huoShan.Java.JiBen.rg_DuiXiangLei3.rg_DuiXiangDaoZhengShu (rg_ShiJianLeiXing4.rg_DuiXiangZhi) == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_YiLianJie)
            {
                rg_DangQianLianJieZhuangTai1 = rg_LaYaDaYinLianJieZhuangTai.rg_YiLianJie3;
            }
            else if (huoShan.Java.JiBen.rg_DuiXiangLei3.rg_DuiXiangDaoZhengShu (rg_ShiJianLeiXing4.rg_DuiXiangZhi) == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_LianJieZhong)
            {
                rg_DangQianLianJieZhuangTai1 = rg_LaYaDaYinLianJieZhuangTai.rg_LianJieZhong;
            }
            else if (huoShan.Java.JiBen.rg_DuiXiangLei3.rg_DuiXiangDaoZhengShu (rg_ShiJianLeiXing4.rg_DuiXiangZhi) == rg_LaYaDaYinFuWuLei.rg_ZhuangTai_MoCaoZuo)
            {
                rg_DangQianLianJieZhuangTai1 = rg_LaYaDaYinLianJieZhuangTai.rg_WeiLianJie1;
            }
        }
    }

    public static interface re_BangDingZhuangTaiBeiGaiBian { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber, int rg_DangQianZhuangTai5, android.bluetooth.BluetoothDevice rg_GaiBianSheBei); }
    private re_BangDingZhuangTaiBeiGaiBian rd_BangDingZhuangTaiBeiGaiBian;
    private int rd_BangDingZhuangTaiBeiGaiBian_tag;
    public void rl_LaYaDaYinJiChuLei_BangDingZhuangTaiBeiGaiBian (re_BangDingZhuangTaiBeiGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_BangDingZhuangTaiBeiGaiBian = objListener;  rd_BangDingZhuangTaiBeiGaiBian_tag = nTagNumber; }
    }
    public int rg_BangDingZhuangTaiBeiGaiBian (int rg_DangQianZhuangTai5, android.bluetooth.BluetoothDevice rg_GaiBianSheBei) {
        re_BangDingZhuangTaiBeiGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BangDingZhuangTaiBeiGaiBian;  nTagNumber = rd_BangDingZhuangTaiBeiGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DangQianZhuangTai5, rg_GaiBianSheBei) : 0);
    }

    public static interface re_ZhuangTaiBeiGaiBian2 { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber, int rg_DangQianLaYaZhuangTai); }
    private re_ZhuangTaiBeiGaiBian2 rd_ZhuangTaiBeiGaiBian2;
    private int rd_ZhuangTaiBeiGaiBian2_tag;
    public void rl_LaYaDaYinJiChuLei_ZhuangTaiBeiGaiBian2 (re_ZhuangTaiBeiGaiBian2 objListener, int nTagNumber) {
        synchronized (this) { rd_ZhuangTaiBeiGaiBian2 = objListener;  rd_ZhuangTaiBeiGaiBian2_tag = nTagNumber; }
    }
    public int rg_ZhuangTaiBeiGaiBian2 (int rg_DangQianLaYaZhuangTai) {
        re_ZhuangTaiBeiGaiBian2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZhuangTaiBeiGaiBian2;  nTagNumber = rd_ZhuangTaiBeiGaiBian2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DangQianLaYaZhuangTai) : 0);
    }

    public static interface re_KaiShiSouSuoSheBei1 { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber); }
    private re_KaiShiSouSuoSheBei1 rd_KaiShiSouSuoSheBei1;
    private int rd_KaiShiSouSuoSheBei1_tag;
    public void rl_LaYaDaYinJiChuLei_KaiShiSouSuoSheBei1 (re_KaiShiSouSuoSheBei1 objListener, int nTagNumber) {
        synchronized (this) { rd_KaiShiSouSuoSheBei1 = objListener;  rd_KaiShiSouSuoSheBei1_tag = nTagNumber; }
    }
    public int rg_KaiShiSouSuoSheBei1 () {
        re_KaiShiSouSuoSheBei1 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_KaiShiSouSuoSheBei1;  nTagNumber = rd_KaiShiSouSuoSheBei1_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_SheBeiSouSuoWanBi { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber); }
    private re_SheBeiSouSuoWanBi rd_SheBeiSouSuoWanBi;
    private int rd_SheBeiSouSuoWanBi_tag;
    public void rl_LaYaDaYinJiChuLei_SheBeiSouSuoWanBi (re_SheBeiSouSuoWanBi objListener, int nTagNumber) {
        synchronized (this) { rd_SheBeiSouSuoWanBi = objListener;  rd_SheBeiSouSuoWanBi_tag = nTagNumber; }
    }
    public int rg_SheBeiSouSuoWanBi () {
        re_SheBeiSouSuoWanBi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_SheBeiSouSuoWanBi;  nTagNumber = rd_SheBeiSouSuoWanBi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_SouXinDaoDaYinSheBei { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber, rg_LaYaSouSuoJieGuoLei rg_DangQianSouSuoJieGuo); }
    private re_SouXinDaoDaYinSheBei rd_SouXinDaoDaYinSheBei;
    private int rd_SouXinDaoDaYinSheBei_tag;
    public void rl_LaYaDaYinJiChuLei_SouXinDaoDaYinSheBei (re_SouXinDaoDaYinSheBei objListener, int nTagNumber) {
        synchronized (this) { rd_SouXinDaoDaYinSheBei = objListener;  rd_SouXinDaoDaYinSheBei_tag = nTagNumber; }
    }
    public int rg_SouXinDaoDaYinSheBei (rg_LaYaSouSuoJieGuoLei rg_DangQianSouSuoJieGuo) {
        re_SouXinDaoDaYinSheBei objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_SouXinDaoDaYinSheBei;  nTagNumber = rd_SouXinDaoDaYinSheBei_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DangQianSouSuoJieGuo) : 0);
    }

    public static interface re_LianJieSheBeiChengGong { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber); }
    private re_LianJieSheBeiChengGong rd_LianJieSheBeiChengGong;
    private int rd_LianJieSheBeiChengGong_tag;
    public void rl_LaYaDaYinJiChuLei_LianJieSheBeiChengGong (re_LianJieSheBeiChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_LianJieSheBeiChengGong = objListener;  rd_LianJieSheBeiChengGong_tag = nTagNumber; }
    }
    public int rg_LianJieSheBeiChengGong () {
        re_LianJieSheBeiChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_LianJieSheBeiChengGong;  nTagNumber = rd_LianJieSheBeiChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_LianJieBeiZhongDuan { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber, boolean rg_WeiZhuDongDuanKai); }
    private re_LianJieBeiZhongDuan rd_LianJieBeiZhongDuan;
    private int rd_LianJieBeiZhongDuan_tag;
    public void rl_LaYaDaYinJiChuLei_LianJieBeiZhongDuan (re_LianJieBeiZhongDuan objListener, int nTagNumber) {
        synchronized (this) { rd_LianJieBeiZhongDuan = objListener;  rd_LianJieBeiZhongDuan_tag = nTagNumber; }
    }
    public int rg_LianJieBeiZhongDuan (boolean rg_WeiZhuDongDuanKai) {
        re_LianJieBeiZhongDuan objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_LianJieBeiZhongDuan;  nTagNumber = rd_LianJieBeiZhongDuan_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_WeiZhuDongDuanKai) : 0);
    }

    public static interface re_LianJieSheBeiShiBai { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber); }
    private re_LianJieSheBeiShiBai rd_LianJieSheBeiShiBai;
    private int rd_LianJieSheBeiShiBai_tag;
    public void rl_LaYaDaYinJiChuLei_LianJieSheBeiShiBai (re_LianJieSheBeiShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_LianJieSheBeiShiBai = objListener;  rd_LianJieSheBeiShiBai_tag = nTagNumber; }
    }
    public int rg_LianJieSheBeiShiBai () {
        re_LianJieSheBeiShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_LianJieSheBeiShiBai;  nTagNumber = rd_LianJieSheBeiShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_ZhengZaiLianJieSheBei { int dispatch (rg_LaYaDaYinJiChuLei objSource, int nTagNumber); }
    private re_ZhengZaiLianJieSheBei rd_ZhengZaiLianJieSheBei;
    private int rd_ZhengZaiLianJieSheBei_tag;
    public void rl_LaYaDaYinJiChuLei_ZhengZaiLianJieSheBei (re_ZhengZaiLianJieSheBei objListener, int nTagNumber) {
        synchronized (this) { rd_ZhengZaiLianJieSheBei = objListener;  rd_ZhengZaiLianJieSheBei_tag = nTagNumber; }
    }
    public int rg_ZhengZaiLianJieSheBei () {
        re_ZhengZaiLianJieSheBei objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZhengZaiLianJieSheBei;  nTagNumber = rd_ZhengZaiLianJieSheBei_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }
}
