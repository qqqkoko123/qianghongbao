
package huoShan.AnZhuo.JiBen;

public class rg_QuanJuShuJuCunChuQiLei {

    public rg_QuanJuShuJuCunChuQiLei ()  { }

    private int m_nFreeDataIdentifier;
    private java.util.HashMap<Integer, Object[]> m_mapCachedData = new java.util.HashMap<Integer, Object[]> ();
    synchronized public int Push (Object[] aryData) {
        if (aryData == null || aryData.length == 0)
            return 0;
        m_nFreeDataIdentifier++;
        if (m_nFreeDataIdentifier == 0)
            m_nFreeDataIdentifier++;
        m_mapCachedData.put (m_nFreeDataIdentifier, aryData);
        return m_nFreeDataIdentifier;
    }
    synchronized public void Cleanup () {
        m_nFreeDataIdentifier = 0;
        m_mapCachedData.clear ();
    }
    synchronized public boolean IsEmpty () {
        return m_mapCachedData.isEmpty ();
    }
    synchronized public void Remove (int nDataIdentifier) {
        if (nDataIdentifier != 0)
            m_mapCachedData.remove (nDataIdentifier);
    }
    synchronized public void Modify (int nDataIdentifier, Object[] aryNewData) {
        if (nDataIdentifier != 0) {
            if (m_mapCachedData.containsKey (nDataIdentifier))
                m_mapCachedData.put (nDataIdentifier, aryNewData);
            else
                throw new RuntimeException ("[Volcano]: " + "the modified data not found.");
        }
    }
    synchronized public boolean IsDataIdentifierExist (int nDataIdentifier) {
        return (nDataIdentifier != 0 && m_mapCachedData.containsKey (nDataIdentifier));
    }
    synchronized public Object[] Pop (int nReqDataIdentifier) {
        if (nReqDataIdentifier == 0)
            return null;
        Object[] aryData = m_mapCachedData.remove (nReqDataIdentifier);
        return aryData;
    }
}
