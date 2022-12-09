
package huoShan.AnZhuo.GongNeng.DuoMeiTi;

public class rg_MeiTiBoFangJiChuLei {

    public static void rg_ShiFouXunHuan6 (android.media.MediaPlayer rg_MeiTiBoFang4, boolean rg_Can_ShiFouXunHuan) {
        rg_MeiTiBoFang4.setLooping (rg_Can_ShiFouXunHuan);
    }

    public static int rg_XianHangWeiZhi1 (android.media.MediaPlayer rg_MeiTiBoFang7) {
        return rg_MeiTiBoFang7.getCurrentPosition ();
    }

    public static int rg_ChangDu44 (android.media.MediaPlayer rg_MeiTiBoFang8) {
        return rg_MeiTiBoFang8.getDuration ();
    }

    public static void rg_MeiTi1 (android.media.MediaPlayer rg_MeiTiBoFang9, String rg_MeiTiDeZhi) {
        try {
            rg_MeiTiBoFang9.setDataSource (rg_MeiTiDeZhi);
        } catch (Exception e) { }
    }

    public static void rg_BoFang5 (android.media.MediaPlayer rg_MeiTiBoFang18) {
        rg_MeiTiBoFang18.start ();
    }

    public static void rg_YiBuZhunBei1 (android.media.MediaPlayer rg_MeiTiBoFang22) {
        try {
            rg_MeiTiBoFang22.prepareAsync ();
        } catch (Exception e) { }
    }

    public static void rg_ChongZhi16 (android.media.MediaPlayer rg_MeiTiBoFang24) {
        rg_MeiTiBoFang24.reset ();
    }

    public static void rg_ZhiYinLiang1 (android.media.MediaPlayer rg_MeiTiBoFang25, double rg_ZuoYinDao, double rg_YouYinDao) {
        rg_MeiTiBoFang25.setVolume ((float)rg_ZuoYinDao, (float)rg_YouYinDao);
    }
}
