
package com.qqq.WXhongbao;

public class rg_MoZhangAiFuWuChuangKouShiJianJieShouQi {

    public rg_MoZhangAiFuWuChuangKouShiJianJieShouQi ()  { }

    public static interface re_ShouDaoQuanJuCaoZuoQingQiu { int dispatch (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi objSource, int nTagNumber, int rg_CaoZuoLeiXing7); }
    private re_ShouDaoQuanJuCaoZuoQingQiu rd_ShouDaoQuanJuCaoZuoQingQiu;
    private int rd_ShouDaoQuanJuCaoZuoQingQiu_tag;
    public void rl_MoZhangAiFuWuChuangKouShiJianJieShouQi_ShouDaoQuanJuCaoZuoQingQiu (re_ShouDaoQuanJuCaoZuoQingQiu objListener, int nTagNumber) {
        synchronized (this) { rd_ShouDaoQuanJuCaoZuoQingQiu = objListener;  rd_ShouDaoQuanJuCaoZuoQingQiu_tag = nTagNumber; }
    }
    public int rg_ShouDaoQuanJuCaoZuoQingQiu (int rg_CaoZuoLeiXing7) {
        re_ShouDaoQuanJuCaoZuoQingQiu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ShouDaoQuanJuCaoZuoQingQiu;  nTagNumber = rd_ShouDaoQuanJuCaoZuoQingQiu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_CaoZuoLeiXing7) : 0);
    }
}
