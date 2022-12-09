
package com.guanyun.tcp;

public class rg_TcpTongXinLei {

    public rg_TcpTongXinLei ()  { }

    protected long rg_QiDongShiJian3;
    protected java.net.Socket rg_WangLaoLianJieDuiXiang;
    public int rg_ChaoShiShiJian35 = 0;
    public String rg_IPDeZhi5 = "";
    public int rg_DuanKou12 = 0;
    protected java.io.InputStream rg_ShuJuShuRuLiuDuiXiang;
    protected java.io.OutputStream rg_ShuJuShuChuLiuDuiXiang;
    public boolean rg_ShiFouLianJieChengGong2 = false;
    protected rg_DuoXianChengYunHangLei rg_ShuJuDouQuXianCheng = new rg_DuoXianChengYunHangLei ();
    protected rg_DuoXianChengYunHangLei rg_DuanKaiJianTingXianCheng = new rg_DuoXianChengYunHangLei ();
    protected byte [] rg_ShuJuHuanCunOu = new byte [2048];
    public boolean rg_ShiFouZiDongChongLian = true;
    public long rg_XinTiaoJianGe = 10000;

    {
        rg_ShuJuDouQuXianCheng.rl_DuoXianChengYunHangLei_XianChengBeiQiDong (new rg_DuoXianChengYunHangLei.re_XianChengBeiQiDong () {
            public int dispatch (rg_DuoXianChengYunHangLei objSource, int nTagNumber) {
                return rg_DuoXianChengYunHangLei_XianChengBeiQiDong (objSource, nTagNumber);
            }
        }, 0);
        rg_DuanKaiJianTingXianCheng.rl_DuoXianChengYunHangLei_XianChengBeiQiDong (new rg_DuoXianChengYunHangLei.re_XianChengBeiQiDong () {
            public int dispatch (rg_DuoXianChengYunHangLei objSource, int nTagNumber) {
                return rg_DuoXianChengYunHangLei_XianChengBeiQiDong (objSource, nTagNumber);
            }
        }, 0);
    }

    protected void rg_LianJie_n () {
        rg_QiDongShiJian3 = System.currentTimeMillis ();
        try
        {
            rg_WangLaoLianJieDuiXiang = new java.net.Socket ();
            rg_WangLaoLianJieDuiXiang.setOOBInline(true);
            rg_WangLaoLianJieDuiXiang.setKeepAlive(true);
            rg_WangLaoLianJieDuiXiang.setTcpNoDelay(true);
            if (rg_ChaoShiShiJian35 > 0)
            {
                rg_WangLaoLianJieDuiXiang.connect(new java.net.InetSocketAddress(rg_IPDeZhi5,rg_DuanKou12),rg_ChaoShiShiJian35);
            }
            else
            {
                rg_WangLaoLianJieDuiXiang.connect(new java.net.InetSocketAddress(rg_IPDeZhi5,rg_DuanKou12));
            }
            if (rg_WangLaoLianJieDuiXiang.isConnected())
            {
                rg_ShuJuShuRuLiuDuiXiang = rg_WangLaoLianJieDuiXiang.getInputStream();
                rg_ShuJuShuChuLiuDuiXiang = rg_WangLaoLianJieDuiXiang.getOutputStream();
                if (rg_ShuJuShuChuLiuDuiXiang != null)
                {
                    huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen ("非空");
                }
                else
                {
                    huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen ("空");
                }
                rg_LianJieChengGong4 ();
            }
        }
        catch (Exception _vol_e_catched)
        {
            rg_LianJieShiBai2 ();
        }
    }

    protected int rg_DuoXianChengYunHangLei_XianChengBeiQiDong (rg_DuoXianChengYunHangLei rg_LaiYuanDuiXiang216, int rg_BiaoJiZhi216) {
        if (rg_LaiYuanDuiXiang216 == rg_ShuJuDouQuXianCheng)
        {
            int rg_DouQuChangDu = 0;
            try
            {
                rg_ShuJuShuRuLiuDuiXiang = rg_WangLaoLianJieDuiXiang.getInputStream();
                rg_DouQuChangDu = rg_ShuJuShuRuLiuDuiXiang.read(rg_ShuJuHuanCunOu);
            }
            catch (Exception _vol_e_catched)
            {
                rg_DouQuChangDu = 0;
                rg_FaShengCuoWu5 ("读取数据异常");
            }
            if (rg_DouQuChangDu > 0)
            {
                byte [] rg_JieGuoShuJu3;
                rg_JieGuoShuJu3 = new byte [rg_DouQuChangDu];
                System.arraycopy (rg_ShuJuHuanCunOu, 0, rg_JieGuoShuJu3, 0, rg_DouQuChangDu);
                rg_QiDongShiJian3 = System.currentTimeMillis ();
                rg_ShouDaoShuJu3 (rg_JieGuoShuJu3);
            }
        }
        if (rg_LaiYuanDuiXiang216 == rg_DuanKaiJianTingXianCheng)
        {
            try
            {
                Thread.sleep (1000);
            }
            catch (Exception _vol_e_catched)
            {
            }
            if (System.currentTimeMillis () - rg_QiDongShiJian3 > rg_XinTiaoJianGe)
            {
                try
                {
                    int rg_XinTiaoShuJu = 0xff;
                    rg_ShuJuShuChuLiuDuiXiang.write(rg_XinTiaoShuJu);
                    rg_ShuJuShuChuLiuDuiXiang.flush();
                    rg_QiDongShiJian3 = System.currentTimeMillis ();
                }
                catch (Exception _vol_e_catched)
                {
                    rg_QiDongShiJian3 = 0;
                    if (rg_ShiFouZiDongChongLian == true)
                    {
                        rg_DuanKaiLianJie_n ();
                        rg_LianJie_n ();
                    }
                    else
                    {
                        rg_KaiShiZiDongChongLian ();
                    }
                }
            }
        }
        return (0);
    }

    public static interface re_KaiShiZiDongChongLian { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber); }
    private re_KaiShiZiDongChongLian rd_KaiShiZiDongChongLian;
    private int rd_KaiShiZiDongChongLian_tag;
    public void rl_TcpTongXinLei_KaiShiZiDongChongLian (re_KaiShiZiDongChongLian objListener, int nTagNumber) {
        synchronized (this) { rd_KaiShiZiDongChongLian = objListener;  rd_KaiShiZiDongChongLian_tag = nTagNumber; }
    }
    public int rg_KaiShiZiDongChongLian () {
        re_KaiShiZiDongChongLian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_KaiShiZiDongChongLian;  nTagNumber = rd_KaiShiZiDongChongLian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_ShouDaoShuJu3 { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber, byte [] rg_ShuZuShuJu4); }
    private re_ShouDaoShuJu3 rd_ShouDaoShuJu3;
    private int rd_ShouDaoShuJu3_tag;
    public void rl_TcpTongXinLei_ShouDaoShuJu3 (re_ShouDaoShuJu3 objListener, int nTagNumber) {
        synchronized (this) { rd_ShouDaoShuJu3 = objListener;  rd_ShouDaoShuJu3_tag = nTagNumber; }
    }
    public int rg_ShouDaoShuJu3 (byte [] rg_ShuZuShuJu4) {
        re_ShouDaoShuJu3 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ShouDaoShuJu3;  nTagNumber = rd_ShouDaoShuJu3_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_ShuZuShuJu4) : 0);
    }

    public void rg_GuanBiShuJuDouQuXianCheng () {
        rg_ShuJuDouQuXianCheng.rg_TingZhiXianCheng ();
    }

    public static interface re_FaShengCuoWu5 { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber, String rg_CuoWuXinXi468); }
    private re_FaShengCuoWu5 rd_FaShengCuoWu5;
    private int rd_FaShengCuoWu5_tag;
    public void rl_TcpTongXinLei_FaShengCuoWu5 (re_FaShengCuoWu5 objListener, int nTagNumber) {
        synchronized (this) { rd_FaShengCuoWu5 = objListener;  rd_FaShengCuoWu5_tag = nTagNumber; }
    }
    public int rg_FaShengCuoWu5 (String rg_CuoWuXinXi468) {
        re_FaShengCuoWu5 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_FaShengCuoWu5;  nTagNumber = rd_FaShengCuoWu5_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_CuoWuXinXi468) : 0);
    }

    public static interface re_LianJieChengGong4 { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber); }
    private re_LianJieChengGong4 rd_LianJieChengGong4;
    private int rd_LianJieChengGong4_tag;
    public void rl_TcpTongXinLei_LianJieChengGong4 (re_LianJieChengGong4 objListener, int nTagNumber) {
        synchronized (this) { rd_LianJieChengGong4 = objListener;  rd_LianJieChengGong4_tag = nTagNumber; }
    }
    public int rg_LianJieChengGong4 () {
        re_LianJieChengGong4 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_LianJieChengGong4;  nTagNumber = rd_LianJieChengGong4_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_LianJieShiBai2 { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber); }
    private re_LianJieShiBai2 rd_LianJieShiBai2;
    private int rd_LianJieShiBai2_tag;
    public void rl_TcpTongXinLei_LianJieShiBai2 (re_LianJieShiBai2 objListener, int nTagNumber) {
        synchronized (this) { rd_LianJieShiBai2 = objListener;  rd_LianJieShiBai2_tag = nTagNumber; }
    }
    public int rg_LianJieShiBai2 () {
        re_LianJieShiBai2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_LianJieShiBai2;  nTagNumber = rd_LianJieShiBai2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    protected void rg_DuanKaiLianJie_n () {
        try
        {
            if (rg_WangLaoLianJieDuiXiang != null)
            {
                rg_ShiFouLianJieChengGong2 = false;
                rg_GuanBiShuJuDouQuXianCheng ();
                if (rg_WangLaoLianJieDuiXiang.isClosed())
                {
                    if (rg_WangLaoLianJieDuiXiang.isInputShutdown() == false)
                    {
                        rg_WangLaoLianJieDuiXiang.shutdownInput();
                    }
                    if (rg_WangLaoLianJieDuiXiang.isOutputShutdown() == false)
                    {
                        rg_WangLaoLianJieDuiXiang.shutdownOutput();
                    }
                    if (rg_ShuJuShuRuLiuDuiXiang != null)
                    {
                        rg_ShuJuShuRuLiuDuiXiang.close();
                        rg_ShuJuShuRuLiuDuiXiang = null;
                    }
                    if (rg_ShuJuShuChuLiuDuiXiang != null)
                    {
                        rg_ShuJuShuChuLiuDuiXiang.close();
                        rg_ShuJuShuChuLiuDuiXiang = null;
                    }
                    rg_WangLaoLianJieDuiXiang.close();
                }
                rg_WangLaoLianJieDuiXiang = null;
                rg_DuanKaiLianJieChengGong ();
            }
        }
        catch (Exception _vol_e_catched)
        {
            rg_DuanKaiLianJieShiBai ();
        }
    }

    public static interface re_DuanKaiLianJieShiBai { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber); }
    private re_DuanKaiLianJieShiBai rd_DuanKaiLianJieShiBai;
    private int rd_DuanKaiLianJieShiBai_tag;
    public void rl_TcpTongXinLei_DuanKaiLianJieShiBai (re_DuanKaiLianJieShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_DuanKaiLianJieShiBai = objListener;  rd_DuanKaiLianJieShiBai_tag = nTagNumber; }
    }
    public int rg_DuanKaiLianJieShiBai () {
        re_DuanKaiLianJieShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_DuanKaiLianJieShiBai;  nTagNumber = rd_DuanKaiLianJieShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_DuanKaiLianJieChengGong { int dispatch (rg_TcpTongXinLei objSource, int nTagNumber); }
    private re_DuanKaiLianJieChengGong rd_DuanKaiLianJieChengGong;
    private int rd_DuanKaiLianJieChengGong_tag;
    public void rl_TcpTongXinLei_DuanKaiLianJieChengGong (re_DuanKaiLianJieChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_DuanKaiLianJieChengGong = objListener;  rd_DuanKaiLianJieChengGong_tag = nTagNumber; }
    }
    public int rg_DuanKaiLianJieChengGong () {
        re_DuanKaiLianJieChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_DuanKaiLianJieChengGong;  nTagNumber = rd_DuanKaiLianJieChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }
}
