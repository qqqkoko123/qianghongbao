
package huoShan.AnZhuo.JiBen;

public class rg_ZiYuanGuanLiQi {

    public static double LP2DP (final int nUnitType, final double dbLPSize) {
        android.util.DisplayMetrics metrics = rg_YingYongChengXu.rg_QuZiYuanGuanLiQi ().getDisplayMetrics ();
        switch (nUnitType) {
            case rg_CheCunChanWei.rg_XiangSu:
                return dbLPSize;
            case rg_CheCunChanWei.rg_DP:
                return dbLPSize * metrics.density;
            case rg_CheCunChanWei.rg_SP:
                return dbLPSize * metrics.scaledDensity;
            case rg_CheCunChanWei.rg_Bang:
                return dbLPSize * metrics.xdpi * (1.0 / 72);
            case rg_CheCunChanWei.rg_YingCun:
                return dbLPSize * metrics.xdpi;
            case rg_CheCunChanWei.rg_HaoMi:
                return dbLPSize * metrics.xdpi * (1.0 / 25.4);
            }
        return 0;
    }
    public static double DP2LP (final int nUnitType, final double dbDPSize) {
        android.util.DisplayMetrics metrics = rg_YingYongChengXu.rg_QuZiYuanGuanLiQi ().getDisplayMetrics ();
        switch (nUnitType) {
            case rg_CheCunChanWei.rg_XiangSu:
                return dbDPSize;
            case rg_CheCunChanWei.rg_DP:
                return dbDPSize / metrics.density;
            case rg_CheCunChanWei.rg_SP:
                return dbDPSize / metrics.scaledDensity;
            case rg_CheCunChanWei.rg_Bang:
                return dbDPSize * 72 / metrics.xdpi;
            case rg_CheCunChanWei.rg_YingCun:
                return dbDPSize / metrics.xdpi;
            case rg_CheCunChanWei.rg_HaoMi:
                return dbDPSize * 25.4 / metrics.xdpi;
            }
        return 0;
    }

    public static String rg_QuWenBenZiYuan (int rg_YuChuLiZiYuan6, String rg_MoRenZhi17) {
        if (rg_YuChuLiZiYuan6 == (int)0)
            return rg_MoRenZhi17;
        try {
            return rg_YingYongChengXu.rg_QuZiYuanGuanLiQi ().getString (rg_YuChuLiZiYuan6);
        } catch (Exception e) {
            return rg_MoRenZhi17;
        }
    }

    public static android.graphics.drawable.Drawable rg_ZaiRuKeHuiZhiZiYuan (int rg_YuChuLiZiYuan7) {
        if (rg_YuChuLiZiYuan7 == (int)0)
            return null;
        try {
            return rg_YingYongChengXu.rg_QuZiYuanGuanLiQi ().getDrawable (rg_YuChuLiZiYuan7);
        } catch (Exception e) {
            return null;
        }
    }
}
