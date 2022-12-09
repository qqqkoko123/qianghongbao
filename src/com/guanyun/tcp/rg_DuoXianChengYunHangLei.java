
package com.guanyun.tcp;

public class rg_DuoXianChengYunHangLei {

    public rg_DuoXianChengYunHangLei ()  { }

    protected java.lang.Thread rg_XianChengDuiXiang2;

    public void rg_TingZhiXianCheng () {
        if (rg_XianChengDuiXiang2 != null)
        {
            rg_XianChengDuiXiang2.interrupt ();
            rg_XianChengDuiXiang2 = null;
        }
    }

    public static interface re_XianChengBeiQiDong { int dispatch (rg_DuoXianChengYunHangLei objSource, int nTagNumber); }
    private re_XianChengBeiQiDong rd_XianChengBeiQiDong;
    private int rd_XianChengBeiQiDong_tag;
    public void rl_DuoXianChengYunHangLei_XianChengBeiQiDong (re_XianChengBeiQiDong objListener, int nTagNumber) {
        synchronized (this) { rd_XianChengBeiQiDong = objListener;  rd_XianChengBeiQiDong_tag = nTagNumber; }
    }
    public int rg_XianChengBeiQiDong () {
        re_XianChengBeiQiDong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_XianChengBeiQiDong;  nTagNumber = rd_XianChengBeiQiDong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    protected int rg_YunHangXianChengLei_XianChengYunHang (rg_YunHangXianChengLei rg_LaiYuanDuiXiang217, int rg_BiaoJiZhi217) {
        while (true)
        {
            if (rg_XianChengDuiXiang2.interrupted ())
            {
                return (0);
            }
            rg_XianChengBeiQiDong ();
        }
    }
}
