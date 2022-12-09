
package huoShan.Java.JiBen;

public class rg_XianChengLei extends java.lang.Thread {

    private Object m_objUserData1, m_objUserData2;
    @Override
    public void run () {
        rg_XianChengQiDong (m_objUserData1, m_objUserData2);
        m_objUserData1 = m_objUserData2 = null;
    }

    public boolean rg_QiDong11 (java.lang.Object rg_YongHuDuiXiang33, java.lang.Object rg_YongHuDuiXiang34) {
        m_objUserData1 = rg_YongHuDuiXiang33;
        m_objUserData2 = rg_YongHuDuiXiang34;
        try {
            start ();
            return true;
        } catch (Exception e) { }
        m_objUserData1 = m_objUserData2 = null;
        return false;
    }

    public static interface re_XianChengQiDong { int dispatch (rg_XianChengLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36); }
    private re_XianChengQiDong rd_XianChengQiDong;
    private int rd_XianChengQiDong_tag;
    public void rl_XianChengLei_XianChengQiDong (re_XianChengQiDong objListener, int nTagNumber) {
        synchronized (this) { rd_XianChengQiDong = objListener;  rd_XianChengQiDong_tag = nTagNumber; }
    }
    public int rg_XianChengQiDong (java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36) {
        re_XianChengQiDong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_XianChengQiDong;  nTagNumber = rd_XianChengQiDong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang35, rg_YongHuDuiXiang36) : 0);
    }
}
