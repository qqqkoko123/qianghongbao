
package anZhuo.MoMingMoKuai.WangLaoCaoZuo;

public class rg_WangLaoChuLiFangWenLei {

    public rg_WangLaoChuLiFangWenLei ()  { }

    protected static org.jsoup.nodes.Document rg_Si_HTMLWenDang;
    protected static com.lzy.okgo.model.Response rg_Si_FanHuiJieGuo;

    public static byte [] rg_WangYe_FangWen (String rg_Can_WangZhi3, int rg_Can_FangWenFangShi2, String rg_Can_DiJiaoXinXi2, String rg_Can_DiJiaoCookies2, String rg_Can_FuJiaXieYiTou2, boolean rg_Can_JinZhiChongDingXiang1, String rg_Can_YaoShangChuanDeWenJian2, String rg_Can_YaoShangChuanDeWenJianCanShuMing2, boolean rg_Can_QingQiuTiFangShiShangChuan2, String rg_Can_ShangChuanWenBen2, String rg_Can_ShangChuanJSON2, byte [] rg_Can_ShangChuanZiJie2, java.io.File rg_Can_ChunWenJianShangChuan2, boolean rg_Can_PinJieCanShuDaoWangZhi2, boolean rg_Can_ShiFouBuQuanBiYaoXieYiTou1) {
        huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenLei rg_WangLaoFangWen1 = new huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenLei ();
        rg_WangLaoFangWen1.rg_CookieGuanLiCeLue_QuanJu (2);
        com.lzy.okgo.model.HttpParams rg_CanShuDuiXiang2 = new com.lzy.okgo.model.HttpParams ();
        String rg_DiJiaoXinXi4;
        com.lzy.okgo.OkGo.getInstance().setOkHttpClient(com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().followRedirects(rg_Can_JinZhiChongDingXiang1 ? false : true).build());
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_Can_DiJiaoXinXi2) == false)
        {
            if (rg_Can_DiJiaoXinXi2.substring (0, 1).equals ("&"))
            {
                rg_DiJiaoXinXi4 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_ShanZuoBian (rg_Can_DiJiaoXinXi2, 1, true);
            }
            else
            {
                rg_DiJiaoXinXi4 = rg_Can_DiJiaoXinXi2;
            }
            String [] rg_CanShuShuZu1;
            int rg_JiCi107 = 0;
            rg_CanShuShuZu1 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_FenGeWenBen (rg_DiJiaoXinXi4, "&", true);
            for (rg_JiCi107 = 0; rg_JiCi107 < rg_CanShuShuZu1.length; rg_JiCi107++)
            {
                String [] rg_CanShu8;
                rg_CanShu8 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_FenGeWenBen (rg_CanShuShuZu1 [rg_JiCi107], "=", true);
                if (rg_CanShu8.length == 2)
                {
                    rg_CanShuDuiXiang2.put(rg_CanShu8 [0], rg_CanShu8 [1], false);
                }
                else if (rg_CanShu8.length == 1)
                {
                    rg_CanShuDuiXiang2.put(rg_CanShu8 [0], "", false);
                }
            }
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_Can_YaoShangChuanDeWenJian2) == false)
        {
            if ((new java.io.File (rg_Can_YaoShangChuanDeWenJian2).exists ()) == true)
            {
                huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (rg_Can_QingQiuTiFangShiShangChuan2 ? "" : "<参_请求体方式上传>参数值为假，上传文件可能会上传失败。");
                rg_CanShuDuiXiang2.put(rg_Can_YaoShangChuanDeWenJianCanShuMing2, new java.io.File (rg_Can_YaoShangChuanDeWenJian2));
            }
        }
        com.lzy.okgo.model.HttpHeaders rg_QingQiuTou9 = new com.lzy.okgo.model.HttpHeaders ();
        if (rg_Can_DiJiaoCookies2.equals ("") == false)
        {
            if (rg_Can_DiJiaoCookies2.toUpperCase ().startsWith (("Cookie".toUpperCase ()), 0))
            {
                String rg_WenBen52;
                String rg_WenBen53;
                rg_WenBen52 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_QuZuoBian (rg_Can_DiJiaoCookies2, ":", 1, false);
                rg_WenBen53 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_QuYouBian (rg_Can_DiJiaoCookies2, ":", 0, false);
                rg_QingQiuTou9.put(rg_WenBen52, rg_WenBen53);
            }
            else
            {
                rg_QingQiuTou9.put("Cookie", rg_Can_DiJiaoCookies2);
            }
        }
        if (rg_Can_ShiFouBuQuanBiYaoXieYiTou1)
        {
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_Can_FuJiaXieYiTou2) == true)
            {
                rg_QingQiuTou9.put("Accept", "*/*");
            }
            if (rg_Can_FuJiaXieYiTou2.indexOf ("Accept:", 0) == -1)
            {
                rg_QingQiuTou9.put("Accept", "*/*");
            }
            if (rg_Can_FuJiaXieYiTou2.indexOf ("Referer:", 0) == -1)
            {
                rg_QingQiuTou9.put("Referer", rg_Can_WangZhi3);
            }
            if (rg_Can_FuJiaXieYiTou2.indexOf ("Accept-Language:", 0) == -1)
            {
                rg_QingQiuTou9.put("Accept-Language", "zh-cn");
            }
            if (rg_Can_FangWenFangShi2 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_POST1)
            {
                if (rg_Can_FuJiaXieYiTou2.indexOf ("Content-Type:", 0) == -1)
                {
                    rg_QingQiuTou9.put("Content-Type", "application/x-www-form-urlencoded");
                }
            }
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_Can_FuJiaXieYiTou2) == false)
        {
            String [] rg_XieYiTouShuZu1;
            rg_XieYiTouShuZu1 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_FenGeWenBen (rg_Can_FuJiaXieYiTou2, "\n", true);
            int rg_JiCi108 = 0;
            for (rg_JiCi108 = 0; rg_JiCi108 < rg_XieYiTouShuZu1.length; rg_JiCi108++)
            {
                String rg_MingZi1;
                String rg_Zhi76;
                rg_MingZi1 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_QuZuoBian (rg_XieYiTouShuZu1 [rg_JiCi108], ":", 1, true);
                rg_Zhi76 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_QuYouBian (rg_XieYiTouShuZu1 [rg_JiCi108], ":", 0, true);
                rg_QingQiuTou9.put(rg_MingZi1, rg_Zhi76);
            }
        }
        String rg_Ju_LinShiWangZhi1;
        if ((rg_Can_WangZhi3.toUpperCase ().startsWith ("HTTP", 0)) == false)
        {
            rg_Ju_LinShiWangZhi1 = "http://" + rg_Can_WangZhi3;
        }
        else
        {
            rg_Ju_LinShiWangZhi1 = rg_Can_WangZhi3;
        }
        rg_Si_FanHuiJieGuo = rg_WangLaoFangWen1.rg_WangYeFangWen_ZiJieShuZu_TongBu (rg_Ju_LinShiWangZhi1, rg_Can_FangWenFangShi2, rg_CanShuDuiXiang2, rg_QingQiuTou9, huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenHuanCunMoShi.rg_GenSuiQuanJuSheZhi, -1, null, rg_Can_PinJieCanShuDaoWangZhi2, rg_Can_QingQiuTiFangShiShangChuan2, rg_Can_ShangChuanWenBen2, rg_Can_ShangChuanJSON2, rg_Can_ShangChuanZiJie2, rg_Can_ChunWenJianShangChuan2);
        return ((byte [])rg_Si_FanHuiJieGuo.body());
    }
}
