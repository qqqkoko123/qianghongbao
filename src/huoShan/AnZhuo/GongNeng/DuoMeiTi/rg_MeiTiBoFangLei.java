
package huoShan.AnZhuo.GongNeng.DuoMeiTi;

public class rg_MeiTiBoFangLei extends android.media.MediaPlayer {

        public rg_MeiTiBoFangLei() { super();
            this.setOnBufferingUpdateListener(new android.media.MediaPlayer.OnBufferingUpdateListener() {
                @Override public void onBufferingUpdate(android.media.MediaPlayer mp, int percent) { rg_HuanChongBeiGengXin (percent); } });
            this.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
                @Override public void onCompletion(android.media.MediaPlayer mp) { rg_BoFangJieShu (); } });
            this.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {
                @Override public boolean onError(android.media.MediaPlayer mp, int what, int extra) { return (rg_BoFangChuCuo (what, extra)!=0); } });
            this.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {
                @Override public boolean onInfo(android.media.MediaPlayer mp, int what, int extra) { return ( rg_DeDaoXinXi (what, extra)!=0); } });
            this.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {
                @Override public void onPrepared(android.media.MediaPlayer mp) { rg_ZhunBeiWanBi2 (); } });
            this.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() {
                @Override public void onSeekComplete(android.media.MediaPlayer mp) { rg_YongHuYiDongWeiZhiWanBi (); } });
            this.setOnTimedTextListener(new android.media.MediaPlayer.OnTimedTextListener() {
                @Override public void onTimedText(android.media.MediaPlayer mp, android.media.TimedText text) { rg_ZiMuBeiGaiBian (text); } });
            this.setOnVideoSizeChangedListener(new android.media.MediaPlayer.OnVideoSizeChangedListener() {
                @Override public void onVideoSizeChanged(android.media.MediaPlayer mp, int width, int height) { rg_ShiPinCheCunBeiGaiBian (width, height); } });
        }

    public static interface re_HuanChongBeiGengXin { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_BaiFenBi5); }
    private re_HuanChongBeiGengXin rd_HuanChongBeiGengXin;
    private int rd_HuanChongBeiGengXin_tag;
    public void rl_MeiTiBoFangLei_HuanChongBeiGengXin (re_HuanChongBeiGengXin objListener, int nTagNumber) {
        synchronized (this) { rd_HuanChongBeiGengXin = objListener;  rd_HuanChongBeiGengXin_tag = nTagNumber; }
    }
    public int rg_HuanChongBeiGengXin (int rg_BaiFenBi5) {
        re_HuanChongBeiGengXin objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_HuanChongBeiGengXin;  nTagNumber = rd_HuanChongBeiGengXin_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BaiFenBi5) : 0);
    }

    public static interface re_BoFangJieShu { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber); }
    private re_BoFangJieShu rd_BoFangJieShu;
    private int rd_BoFangJieShu_tag;
    public void rl_MeiTiBoFangLei_BoFangJieShu (re_BoFangJieShu objListener, int nTagNumber) {
        synchronized (this) { rd_BoFangJieShu = objListener;  rd_BoFangJieShu_tag = nTagNumber; }
    }
    public int rg_BoFangJieShu () {
        re_BoFangJieShu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BoFangJieShu;  nTagNumber = rd_BoFangJieShu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_BoFangChuCuo { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_CuoWuLeiXing2, int rg_CuoWuDaiMa4); }
    private re_BoFangChuCuo rd_BoFangChuCuo;
    private int rd_BoFangChuCuo_tag;
    public void rl_MeiTiBoFangLei_BoFangChuCuo (re_BoFangChuCuo objListener, int nTagNumber) {
        synchronized (this) { rd_BoFangChuCuo = objListener;  rd_BoFangChuCuo_tag = nTagNumber; }
    }
    public int rg_BoFangChuCuo (int rg_CuoWuLeiXing2, int rg_CuoWuDaiMa4) {
        re_BoFangChuCuo objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_BoFangChuCuo;  nTagNumber = rd_BoFangChuCuo_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_CuoWuLeiXing2, rg_CuoWuDaiMa4) : 0);
    }

    public static interface re_DeDaoXinXi { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_XinXiLeiXing1, int rg_CuoWuDaiMa5); }
    private re_DeDaoXinXi rd_DeDaoXinXi;
    private int rd_DeDaoXinXi_tag;
    public void rl_MeiTiBoFangLei_DeDaoXinXi (re_DeDaoXinXi objListener, int nTagNumber) {
        synchronized (this) { rd_DeDaoXinXi = objListener;  rd_DeDaoXinXi_tag = nTagNumber; }
    }
    public int rg_DeDaoXinXi (int rg_XinXiLeiXing1, int rg_CuoWuDaiMa5) {
        re_DeDaoXinXi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_DeDaoXinXi;  nTagNumber = rd_DeDaoXinXi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_XinXiLeiXing1, rg_CuoWuDaiMa5) : 0);
    }

    public static interface re_ZhunBeiWanBi2 { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber); }
    private re_ZhunBeiWanBi2 rd_ZhunBeiWanBi2;
    private int rd_ZhunBeiWanBi2_tag;
    public void rl_MeiTiBoFangLei_ZhunBeiWanBi2 (re_ZhunBeiWanBi2 objListener, int nTagNumber) {
        synchronized (this) { rd_ZhunBeiWanBi2 = objListener;  rd_ZhunBeiWanBi2_tag = nTagNumber; }
    }
    public int rg_ZhunBeiWanBi2 () {
        re_ZhunBeiWanBi2 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZhunBeiWanBi2;  nTagNumber = rd_ZhunBeiWanBi2_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_YongHuYiDongWeiZhiWanBi { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber); }
    private re_YongHuYiDongWeiZhiWanBi rd_YongHuYiDongWeiZhiWanBi;
    private int rd_YongHuYiDongWeiZhiWanBi_tag;
    public void rl_MeiTiBoFangLei_YongHuYiDongWeiZhiWanBi (re_YongHuYiDongWeiZhiWanBi objListener, int nTagNumber) {
        synchronized (this) { rd_YongHuYiDongWeiZhiWanBi = objListener;  rd_YongHuYiDongWeiZhiWanBi_tag = nTagNumber; }
    }
    public int rg_YongHuYiDongWeiZhiWanBi () {
        re_YongHuYiDongWeiZhiWanBi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_YongHuYiDongWeiZhiWanBi;  nTagNumber = rd_YongHuYiDongWeiZhiWanBi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_ShiPinCheCunBeiGaiBian { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber, int rg_KuanDu192, int rg_GaoDu203); }
    private re_ShiPinCheCunBeiGaiBian rd_ShiPinCheCunBeiGaiBian;
    private int rd_ShiPinCheCunBeiGaiBian_tag;
    public void rl_MeiTiBoFangLei_ShiPinCheCunBeiGaiBian (re_ShiPinCheCunBeiGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_ShiPinCheCunBeiGaiBian = objListener;  rd_ShiPinCheCunBeiGaiBian_tag = nTagNumber; }
    }
    public int rg_ShiPinCheCunBeiGaiBian (int rg_KuanDu192, int rg_GaoDu203) {
        re_ShiPinCheCunBeiGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ShiPinCheCunBeiGaiBian;  nTagNumber = rd_ShiPinCheCunBeiGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_KuanDu192, rg_GaoDu203) : 0);
    }

    public static interface re_ZiMuBeiGaiBian { int dispatch (rg_MeiTiBoFangLei objSource, int nTagNumber, android.media.TimedText rg_DingShiWenBen); }
    private re_ZiMuBeiGaiBian rd_ZiMuBeiGaiBian;
    private int rd_ZiMuBeiGaiBian_tag;
    public void rl_MeiTiBoFangLei_ZiMuBeiGaiBian (re_ZiMuBeiGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_ZiMuBeiGaiBian = objListener;  rd_ZiMuBeiGaiBian_tag = nTagNumber; }
    }
    public int rg_ZiMuBeiGaiBian (android.media.TimedText rg_DingShiWenBen) {
        re_ZiMuBeiGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiMuBeiGaiBian;  nTagNumber = rd_ZiMuBeiGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_DingShiWenBen) : 0);
    }
}
