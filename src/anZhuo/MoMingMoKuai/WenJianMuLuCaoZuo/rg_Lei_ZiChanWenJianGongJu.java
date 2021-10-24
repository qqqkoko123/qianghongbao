
package anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo;

public class rg_Lei_ZiChanWenJianGongJu {

    public rg_Lei_ZiChanWenJianGongJu ()  { }

    public static boolean rg_ZiChanWenJian_BaoCunDaoBenDe (String rg_ZiChanWenJianLuJingMing7, String rg_BaoCunDaoDeWenJianLuJing) {
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_ZiChanWenJianLuJingMing7) == true || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_BaoCunDaoDeWenJianLuJing) == true)
        {
            return (false);
        }
        if (rg_MuLuGongJuLei.rg_MuLu_ShiFouCunZai (rg_MuLuGongJuLei.rg_MuLu_QuMuLu (rg_BaoCunDaoDeWenJianLuJing)) == false)
        {
            rg_MuLuGongJuLei.rg_MuLu_ChuangJianWenJianMuLu (rg_BaoCunDaoDeWenJianLuJing);
        }
        java.io.InputStream rg_ShuRuLiuDuiXiang16;
        rg_ShuRuLiuDuiXiang16 = huoShan.AnZhuo.JiBen.rg_ZiChanGuanLiQi.rg_DaKaiZiChanWenJian (rg_ZiChanWenJianLuJingMing7, huoShan.AnZhuo.JiBen.rg_ZiChanFangWenMoShi.rg_Liu);
        java.io.FileOutputStream rg_ShuChuLiuDuiXiang13;
        rg_ShuChuLiuDuiXiang13 = huoShan.Java.JiBen.rg_WenJianShuChuLiu.rg_ChuangJian322 (rg_BaoCunDaoDeWenJianLuJing, false);
        byte [] rg_HuanChongOu27 = new byte [1024];
        int rg_DouCheCun4 = 1;
        while (rg_DouCheCun4 > 0)
        {
            rg_DouCheCun4 = huoShan.Java.JiBen.rg_ShuRuLiu1.rg_DouRuShuJu4 (rg_ShuRuLiuDuiXiang16, rg_HuanChongOu27, null);
            if (rg_DouCheCun4 < 1)
            {
                break;
            }
            huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuShuJu3 (rg_ShuChuLiuDuiXiang13, rg_HuanChongOu27, 0, rg_DouCheCun4, null);
        }
        huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuHuanCun1 (rg_ShuChuLiuDuiXiang13, null);
        huoShan.Java.JiBen.rg_ShuChuLiu1.rg_GuanBi58 (rg_ShuChuLiuDuiXiang13);
        huoShan.Java.JiBen.rg_ShuRuLiu1.rg_GuanBi56 (rg_ShuRuLiuDuiXiang16);
        return (rg_WenJianCaoZuoGongJuLei.rg_WenJian_ShiFouCunZai (rg_BaoCunDaoDeWenJianLuJing));
    }
}
