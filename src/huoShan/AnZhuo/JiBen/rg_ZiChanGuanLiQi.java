
package huoShan.AnZhuo.JiBen;

public class rg_ZiChanGuanLiQi {

    public static java.io.InputStream rg_DaKaiZiChanWenJian (String rg_ZiChanWenJianLuJingMing1, int rg_FangWenMoShi) {
        try {
            return rg_YingYongChengXu.rg_QuZiChanGuanLiQi ().open (rg_ZiChanWenJianLuJingMing1, rg_FangWenMoShi);
        } catch (Exception e) {
            return null;
        }
    }
}
