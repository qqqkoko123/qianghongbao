
package anZhuo.MoMingMoKuai.WangLaoCaoZuo;

public class rg_YinLeBoFangLei {

    public rg_YinLeBoFangLei ()  { }

    protected huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei rg_YinLeBoFangQi = new huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei ();
    protected huoShan.AnZhuo.JiBen.rg_ShiZhongLei rg_ShiZhong1 = new huoShan.AnZhuo.JiBen.rg_ShiZhongLei ();
    protected boolean rg_Cheng_ShouCiBoFang = false;
    protected boolean rg_Cheng_XiaYiShouZhunBei = false;
    protected boolean rg_Cheng_BeiZanTing = false;
    protected int rg_Cheng_HuanChongBaiFenBi;

    {
        rg_ShiZhong1.rg_ZhouJi = 1000;
    }

    {
        rg_YinLeBoFangQi.rl_MeiTiBoFangLei_HuanChongBeiGengXin (new huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei.re_HuanChongBeiGengXin () {
            public int dispatch (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_BaiFenBi5) {
                return rg_MeiTiBoFangLei_HuanChongBeiGengXin1 (objSource, nTagNumber, rg_BaiFenBi5);
            }
        }, 0);
        rg_YinLeBoFangQi.rl_MeiTiBoFangLei_BoFangJieShu (new huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei.re_BoFangJieShu () {
            public int dispatch (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei objSource, int nTagNumber) {
                return rg_MeiTiBoFangLei_BoFangJieShu1 (objSource, nTagNumber);
            }
        }, 0);
        rg_YinLeBoFangQi.rl_MeiTiBoFangLei_BoFangChuCuo (new huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei.re_BoFangChuCuo () {
            public int dispatch (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_CuoWuLeiXing2, int rg_CuoWuDaiMa4) {
                return rg_MeiTiBoFangLei_BoFangChuCuo1 (objSource, nTagNumber, rg_CuoWuLeiXing2, rg_CuoWuDaiMa4);
            }
        }, 0);
        rg_YinLeBoFangQi.rl_MeiTiBoFangLei_ZhunBeiWanBi2 (new huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei.re_ZhunBeiWanBi2 () {
            public int dispatch (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei objSource, int nTagNumber) {
                return rg_MeiTiBoFangLei_ZhunBeiWanBi1 (objSource, nTagNumber);
            }
        }, 0);
        rg_ShiZhong1.rl_ShiZhongLei_ShiZhongShiJian (new huoShan.AnZhuo.JiBen.rg_ShiZhongLei.re_ShiZhongShiJian () {
            public int dispatch (huoShan.AnZhuo.JiBen.rg_ShiZhongLei objSource, int nTagNumber) {
                return rg_ShiZhongLei_ShiZhongShiJian1 (objSource, nTagNumber);
            }
        }, 0);
    }

    public void rg_XunHuanBoFang7 (boolean rg_ShiFouXunHuanBoFang1) {
        huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_ShiFouXunHuan6 (rg_YinLeBoFangQi, rg_ShiFouXunHuanBoFang1);
    }

    public int rg_BoFangJinDu1 () {
        return (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_XianHangWeiZhi1 (rg_YinLeBoFangQi));
    }

    public int rg_ZongJinDu () {
        return (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_ChangDu44 (rg_YinLeBoFangQi));
    }

    public void rg_ZhiYinLiang4 (double rg_ZuoShengDao, double rg_YouShengDao) {
        huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_ZhiYinLiang1 (rg_YinLeBoFangQi, rg_ZuoShengDao, rg_YouShengDao);
    }

    public void rg_BoFang10 (String rg_YinLeDeZhi1) {
        rg_ShiZhong1.rg_QiDong4 ();
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_YinLeDeZhi1) && rg_Cheng_BeiZanTing == true)
        {
            huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_BoFang5 (rg_YinLeBoFangQi);
            rg_Cheng_BeiZanTing = false;
            rg_Cheng_ShouCiBoFang = false;
        }
        else
        {
            huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_ChongZhi16 (rg_YinLeBoFangQi);
            huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_MeiTi1 (rg_YinLeBoFangQi, rg_YinLeDeZhi1);
            rg_Cheng_ShouCiBoFang = true;
            huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_YiBuZhunBei1 (rg_YinLeBoFangQi);
        }
    }

    protected int rg_MeiTiBoFangLei_HuanChongBeiGengXin1 (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei rg_LaiYuanDuiXiang152, int rg_BiaoJiZhi152, int rg_BaiFenBi10) {
        rg_Cheng_HuanChongBaiFenBi = rg_BaiFenBi10;
        rg_KaiShiBoFang2 (rg_BoFangJinDu1 (), rg_ZongJinDu (), anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_XiaoShuCaoZuoLei.rg_XiaoShu_SiSheWuRu ((double)rg_BoFangJinDu1 () / (double)rg_ZongJinDu () * 100, 2), rg_BaiFenBi10);
        return (0);
    }

    protected int rg_MeiTiBoFangLei_BoFangJieShu1 (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei rg_LaiYuanDuiXiang153, int rg_BiaoJiZhi153) {
        rg_ShiZhong1.rg_TingZhi4 ();
        rg_BoFangJieShu2 ();
        return (0);
    }

    protected int rg_MeiTiBoFangLei_BoFangChuCuo1 (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei rg_LaiYuanDuiXiang154, int rg_BiaoJiZhi154, int rg_CuoWuLeiXing5, int rg_CuoWuDaiMa9) {
        rg_ShiZhong1.rg_TingZhi4 ();
        rg_BoFangChuCuo2 (rg_CuoWuLeiXing5, rg_CuoWuDaiMa9);
        return (0);
    }

    public static interface re_BoFangJieShu2 { int dispatch (rg_YinLeBoFangLei objSource, int nTagNumber); }
    private re_BoFangJieShu2 rd_BoFangJieShu2;
    private int rd_BoFangJieShu2_tag;
    public void rl_YinLeBoFangLei_BoFangJieShu2 (re_BoFangJieShu2 objListener, int nTagNumber) {
        synchronized (this) { rd_BoFangJieShu2 = objListener;  rd_BoFangJieShu2_tag = nTagNumber; }
    }
    public int rg_BoFangJieShu2 () {
        re_BoFangJieShu2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BoFangJieShu2;  nTagNumber = rd_BoFangJieShu2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_BoFangChuCuo2 { int dispatch (rg_YinLeBoFangLei objSource, int nTagNumber, int rg_CuoWuLeiXing6, int rg_CuoWuDaiMa10); }
    private re_BoFangChuCuo2 rd_BoFangChuCuo2;
    private int rd_BoFangChuCuo2_tag;
    public void rl_YinLeBoFangLei_BoFangChuCuo2 (re_BoFangChuCuo2 objListener, int nTagNumber) {
        synchronized (this) { rd_BoFangChuCuo2 = objListener;  rd_BoFangChuCuo2_tag = nTagNumber; }
    }
    public int rg_BoFangChuCuo2 (int rg_CuoWuLeiXing6, int rg_CuoWuDaiMa10) {
        re_BoFangChuCuo2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BoFangChuCuo2;  nTagNumber = rd_BoFangChuCuo2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_CuoWuLeiXing6, rg_CuoWuDaiMa10) : 0);
    }

    public static interface re_KaiShiBoFang2 { int dispatch (rg_YinLeBoFangLei objSource, int nTagNumber, int rg_DangQianJinDu8, int rg_ZongJinDu1, double rg_BoFangBaiFenBi, int rg_HuanChongBaiFenBi1); }
    private re_KaiShiBoFang2 rd_KaiShiBoFang2;
    private int rd_KaiShiBoFang2_tag;
    public void rl_YinLeBoFangLei_KaiShiBoFang2 (re_KaiShiBoFang2 objListener, int nTagNumber) {
        synchronized (this) { rd_KaiShiBoFang2 = objListener;  rd_KaiShiBoFang2_tag = nTagNumber; }
    }
    public int rg_KaiShiBoFang2 (int rg_DangQianJinDu8, int rg_ZongJinDu1, double rg_BoFangBaiFenBi, int rg_HuanChongBaiFenBi1) {
        re_KaiShiBoFang2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_KaiShiBoFang2;  nTagNumber = rd_KaiShiBoFang2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DangQianJinDu8, rg_ZongJinDu1, rg_BoFangBaiFenBi, rg_HuanChongBaiFenBi1) : 0);
    }

    protected int rg_MeiTiBoFangLei_ZhunBeiWanBi1 (huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangLei rg_LaiYuanDuiXiang155, int rg_BiaoJiZhi155) {
        if (rg_Cheng_ShouCiBoFang)
        {
            huoShan.AnZhuo.GongNeng.DuoMeiTi.rg_MeiTiBoFangJiChuLei.rg_BoFang5 (rg_YinLeBoFangQi);
            rg_Cheng_BeiZanTing = false;
            rg_Cheng_ShouCiBoFang = false;
        }
        return (0);
    }

    protected int rg_ShiZhongLei_ShiZhongShiJian1 (huoShan.AnZhuo.JiBen.rg_ShiZhongLei rg_LaiYuanDuiXiang156, int rg_BiaoJiZhi156) {
        rg_KaiShiBoFang2 (rg_BoFangJinDu1 (), rg_ZongJinDu (), anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_XiaoShuCaoZuoLei.rg_XiaoShu_SiSheWuRu ((double)rg_BoFangJinDu1 () / (double)rg_ZongJinDu () * 100, 2), rg_Cheng_HuanChongBaiFenBi);
        return (0);
    }
}
