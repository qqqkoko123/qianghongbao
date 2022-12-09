
package com.guanyun.tcp;

public class rg_YunHangXianChengLei implements Runnable {

    public rg_YunHangXianChengLei ()  { }

    @Override
    public void run() {
        rg_XianChengYunHang10();
    }

    public static interface re_XianChengYunHang10 { int dispatch (rg_YunHangXianChengLei objSource, int nTagNumber); }
    private re_XianChengYunHang10 rd_XianChengYunHang10;
    private int rd_XianChengYunHang10_tag;
    public void rl_YunHangXianChengLei_XianChengYunHang10 (re_XianChengYunHang10 objListener, int nTagNumber) {
        synchronized (this) { rd_XianChengYunHang10 = objListener;  rd_XianChengYunHang10_tag = nTagNumber; }
    }
    public int rg_XianChengYunHang10 () {
        re_XianChengYunHang10 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_XianChengYunHang10;  nTagNumber = rd_XianChengYunHang10_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }
}
