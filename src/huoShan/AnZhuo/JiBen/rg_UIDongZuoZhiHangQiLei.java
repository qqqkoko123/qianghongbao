
package huoShan.AnZhuo.JiBen;

class rg_UIDongZuoZhiHangQiLei {

    public rg_UIDongZuoZhiHangQiLei ()  { }

    private android.os.Looper m_objMainLooper;
    private android.os.Handler m_objHandler;
    public void init () {
        m_objMainLooper = android.os.Looper.getMainLooper ();
        if (m_objMainLooper == null)
            throw new RuntimeException ("[Volcano]: " + "Must call on main thread.");
        m_objHandler = new android.os.Handler (m_objMainLooper);
    }
    public boolean IsUiThread () {
        return (android.os.Looper.myLooper () == m_objMainLooper);
    }
    public void RunOnUiThread (Runnable action) {
        if (IsUiThread ())
            action.run ();
        else
            m_objHandler.post (action);
    }
    public void WaitAllUiActionDown () {
        if (IsUiThread () == false)
            new UIActionDoneWaiter ().Wait (m_objHandler);
    }
    private static final class UIActionDoneWaiter implements Runnable {
        private boolean m_blDone;
        @Override public void run () {
            synchronized (this) {
                m_blDone = true;
                notifyAll ();
            }
        }
        public boolean Wait (android.os.Handler handler) {
            if (handler.post (this) == false)
                return false;
            synchronized (this) {
                while (m_blDone == false) {
                    try {
                        wait ();
                    } catch (InterruptedException ex) { }
                }
            }
            return true;
        }
    }
}
