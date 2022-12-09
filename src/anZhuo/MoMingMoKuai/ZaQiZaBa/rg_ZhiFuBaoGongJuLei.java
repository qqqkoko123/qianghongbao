
package anZhuo.MoMingMoKuai.ZaQiZaBa;

public class rg_ZhiFuBaoGongJuLei {

    public rg_ZhiFuBaoGongJuLei ()  { }

    public static boolean rg_ZhiFuBao_DaKaiZhuaiZhang (android.content.Context rg_Can_SuoChuChuangKou4, String rg_Can_ShouKuanDeZhi) {
        try
        {
            if (rg_YingYongGongJuLei.rg_YingYong_ShiFouAnZhuang (rg_Can_SuoChuChuangKou4, "com.eg.android.AlipayGphone"))
            {
                android.content.Intent rg_QiDongDuiXiang5;
                String rg_BianMaDeZhi;
                rg_BianMaDeZhi = huoShan.Java.JiBen.rg_URLBianMaLei.rg_BianMa5 (rg_Can_ShouKuanDeZhi, "UTF-8");
                rg_BianMaDeZhi = "alipayqr://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=" + rg_BianMaDeZhi;
                rg_BianMaDeZhi = rg_BianMaDeZhi + "%3F_s%3Dweb-other&_t=" + String.valueOf (System.currentTimeMillis ());
                rg_QiDongDuiXiang5 = new android.content.Intent(huoShan.AnZhuo.JiBen.rg_QiDongCaoZuoLeiXing.rg_XianShiShuJu1, android.net.Uri.parse (rg_BianMaDeZhi));
                rg_QiDongDuiXiang5.addFlags(huoShan.AnZhuo.JiBen.rg_QiDongXinXiBiaoZhiLeiXing.rg_ChuangJianXinChuangKouRenWu);
                huoShan.AnZhuo.JiBen.rg_AnZhuoChuangKouHuanJing.rg_QiDongAnZhuoChuangKou (rg_Can_SuoChuChuangKou4, rg_QiDongDuiXiang5, null);
                return (true);
            }
            return (false);
        }
        catch (Exception _vol_e_catched)
        {
            return (false);
        }
    }
}
