
package huoShan.AnZhuo.JiBen;

public class rg_QuanJuAnBoDongTaiJieShouQi {

    public rg_QuanJuAnBoDongTaiJieShouQi ()  { }

    android.content.BroadcastReceiver m_receiver;
    public void MyRegisterGlobalReceiver (int priority, String... saryActions) {
        rg_QuXiaoDengJi1 ();
        if (saryActions == null || saryActions.length == 0)
            return;
        m_receiver = new android.content.BroadcastReceiver () {
            public void onReceive (android.content.Context context, android.content.Intent intent) {
                rg_JieShouDaoQuanJuAnBo (this, intent);
            }
        };
        android.content.IntentFilter filter = new android.content.IntentFilter ();
        for (String strAction : saryActions)
            filter.addAction (strAction);
        if (priority < 0)
            priority = 0;
        else if (priority > android.content.IntentFilter.SYSTEM_HIGH_PRIORITY)
            priority = android.content.IntentFilter.SYSTEM_HIGH_PRIORITY;
        filter.setPriority (priority);
        rg_YingYongChengXu.sGetApp ().registerReceiver (m_receiver, filter);
    }

    public static interface re_JieShouDaoQuanJuAnBo { int dispatch (rg_QuanJuAnBoDongTaiJieShouQi objSource, int nTagNumber, android.content.BroadcastReceiver rg_JieShouQiDuiXiang, android.content.Intent rg_QiDongXinXi6); }
    private re_JieShouDaoQuanJuAnBo rd_JieShouDaoQuanJuAnBo;
    private int rd_JieShouDaoQuanJuAnBo_tag;
    public void rl_QuanJuAnBoDongTaiJieShouQi_JieShouDaoQuanJuAnBo (re_JieShouDaoQuanJuAnBo objListener, int nTagNumber) {
        synchronized (this) { rd_JieShouDaoQuanJuAnBo = objListener;  rd_JieShouDaoQuanJuAnBo_tag = nTagNumber; }
    }
    public int rg_JieShouDaoQuanJuAnBo (android.content.BroadcastReceiver rg_JieShouQiDuiXiang, android.content.Intent rg_QiDongXinXi6) {
        re_JieShouDaoQuanJuAnBo objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_JieShouDaoQuanJuAnBo;  nTagNumber = rd_JieShouDaoQuanJuAnBo_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JieShouQiDuiXiang, rg_QiDongXinXi6) : 0);
    }

    public void rg_QuXiaoDengJi1 () {
        if (m_receiver != null) {
            rg_YingYongChengXu.sGetApp ().unregisterReceiver (m_receiver);
            m_receiver = null;
        }
    }
}
