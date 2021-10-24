
package huoShan.AnZhuo.JiBen;

public class rg_ShiZhongLei {

    public rg_ShiZhongLei ()  { }

    public int rg_ZhouJi = 1000;
    protected long rg_YiFaSongCiShuBianLiang;
    protected boolean rg_ShiZhongYiQiDong;
    protected boolean rg_ShiJianYiCunZai;
    private android.os.Handler m_objHandler;
    private static final int c_nMessageID = 2;

    public static interface re_ShiZhongShiJian { int dispatch (rg_ShiZhongLei objSource, int nTagNumber); }
    private re_ShiZhongShiJian rd_ShiZhongShiJian;
    private int rd_ShiZhongShiJian_tag;
    public void rl_ShiZhongLei_ShiZhongShiJian (re_ShiZhongShiJian objListener, int nTagNumber) {
        synchronized (this) { rd_ShiZhongShiJian = objListener;  rd_ShiZhongShiJian_tag = nTagNumber; }
    }
    public int rg_ShiZhongShiJian () {
        re_ShiZhongShiJian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ShiZhongShiJian;  nTagNumber = rd_ShiZhongShiJian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public boolean rg_QiDong4 () {
        if (rg_ShiZhongYiQiDong)
        {
            return (true);
        }
        if (rg_ZhouJi <= 0)
        {
            return (false);
        }
        if (m_objHandler == null)
        {
            if (android.os.Looper.myLooper () == null)
            {
                return (false);
            }
            m_objHandler = new android.os.Handler () {
                public void handleMessage (android.os.Message m) {
                    rg_ShiJianYiCunZai = false;
                    if (rg_ShiZhongYiQiDong &&
                            rg_ZhouJi > 0 &&
                            rg_ShiZhongShiJian () != 1) {
                        if (rg_ShiZhongYiQiDong &&
                                rg_ShiJianYiCunZai == false) {
                            rg_YiFaSongCiShuBianLiang = rg_YiFaSongCiShuBianLiang + 1;
                            rg_ShiJianYiCunZai = true;
                            sendMessageDelayed (android.os.Message.obtain (this, c_nMessageID), rg_ZhouJi);
                        }
                    }
                    else rg_ShiZhongYiQiDong = false;
                } };
        }
        rg_ShiZhongYiQiDong = true;
        rg_YiFaSongCiShuBianLiang = 0;
        rg_ShiJianYiCunZai = true;
        m_objHandler.sendMessageDelayed (android.os.Message.obtain (m_objHandler, c_nMessageID), rg_ZhouJi);
        return (true);
    }

    public void rg_TingZhi4 () {
        if (rg_ShiZhongYiQiDong)
        {
            rg_ShiZhongYiQiDong = false;
            rg_ShiJianYiCunZai = false;
            if (m_objHandler != null)
            {
                m_objHandler.removeMessages (c_nMessageID);
            }
        }
    }
}
