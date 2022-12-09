
package huoShan.AnZhuo.JiBen;

public class rg_AnZhuoWangLaoCaoZuoLei {

    public rg_AnZhuoWangLaoCaoZuoLei ()  { }

    public static int rg_CookieGuanLi = rg_AnZhuoCookieGuanLiQi.rg_BuGuanLi;
    protected static rg_AnZhuoCookieGuanLiQi rg_GuanLiQi = new rg_AnZhuoCookieGuanLiQi ();
    public static rg_WangLaoQingQiuShuJuLei rg_CookiesJianZhiDuiXiang;

    public static String rg_QuZhuYuMing (String rg_FangWenDeWangZhi) {
        return (huoShan.Java.JiBen.rg_URLLei.rg_ChuangJian352 (rg_FangWenDeWangZhi).getHost());
    }

    public static byte [] rg_HTTPDouWenJian1 (String rg_WangZhi4, int rg_FangWenFangShi, String rg_DiJiaoXinXi, String rg_DiJiaoCookies, String rg_FuJiaXieYiTou, boolean rg_YunXuChongDingXiang, String rg_DaiLiDeZhi, int rg_DaiLiDuanKou, int rg_ChaoShi, rg_WangLaoQingQiuShuJuLei rg_FanHuiDuiXiang) {
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DiJiaoXinXi))
        {
            rg_DiJiaoXinXi = "";
        }
        return (rg_HTTPDouWenJian_ZiJieShuZuDiJiao (rg_WangZhi4, rg_FangWenFangShi,  rg_DiJiaoXinXi.getBytes (), rg_DiJiaoCookies, rg_FuJiaXieYiTou, rg_YunXuChongDingXiang, rg_DaiLiDeZhi, rg_DaiLiDuanKou, rg_ChaoShi, rg_FanHuiDuiXiang));
    }

    public static byte [] rg_HTTPDouWenJian_ZiJieShuZuDiJiao (String rg_WangZhi5, int rg_FangWenFangShi1, byte [] rg_DiJiaoXinXi1, String rg_DiJiaoCookies1, String rg_FuJiaXieYiTou1, boolean rg_YunXuChongDingXiang1, String rg_DaiLiDeZhi1, int rg_DaiLiDuanKou1, int rg_ChaoShi1, rg_WangLaoQingQiuShuJuLei rg_FanHuiDuiXiang1) {
        java.net.URL rg_URLDuiXiang;
        java.net.HttpURLConnection rg_HTTPDuiXiang;
        String rg_QingQiuFangShi = "GET";
        rg_URLDuiXiang = huoShan.Java.JiBen.rg_URLLei.rg_ChuangJian352 (rg_WangZhi5);
        if (rg_URLDuiXiang == null)
        {
            return (new byte [0]);
        }
        if (rg_DaiLiDeZhi1 != null && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DaiLiDeZhi1) == false)
        {
            java.net.Proxy rg_DaiLiDuiXiang;
            java.net.InetSocketAddress rg_TaoJieZiDeZhiDuiXiang;
            rg_TaoJieZiDeZhiDuiXiang = huoShan.Java.JiBen.rg_TaoJieZiDeZhiLei.rg_ChuangJianDuiXiang45 (rg_DaiLiDeZhi1, rg_DaiLiDuanKou1);
            rg_DaiLiDuiXiang = huoShan.Java.JiBen.rg_DaiLiLei.rg_ChuangJianDuiXiang43 (huoShan.Java.JiBen.rg_DaiLiLei.rg_HTTPDaiLi2, rg_TaoJieZiDeZhiDuiXiang);
            rg_HTTPDuiXiang = (java.net.HttpURLConnection)huoShan.Java.JiBen.rg_URLLei.rg_DaKaiLianJie1 (rg_URLDuiXiang, rg_DaiLiDuiXiang);
        }
        else
        {
            rg_HTTPDuiXiang = (java.net.HttpURLConnection)huoShan.Java.JiBen.rg_URLLei.rg_DaKaiLianJie (rg_URLDuiXiang);
        }
        if (rg_HTTPDuiXiang == null)
        {
            return (new byte [0]);
        }
        huoShan.Java.JiBen.rg_URLLianJieLei.rg_LianJieChaoShi17 (rg_HTTPDuiXiang, rg_ChaoShi1);
        if (rg_FangWenFangShi1 == 0)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "GET");
        }
        else if (rg_FangWenFangShi1 == 1)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "POST");
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiXieChu1 (rg_HTTPDuiXiang, true);
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiShuRu1 (rg_HTTPDuiXiang, true);
        }
        else if (rg_FangWenFangShi1 == 2)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "HEAD");
        }
        else if (rg_FangWenFangShi1 == 3)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "PUT");
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiXieChu1 (rg_HTTPDuiXiang, true);
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiShuRu1 (rg_HTTPDuiXiang, true);
        }
        else if (rg_FangWenFangShi1 == 4)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "OPTIONS");
        }
        else if (rg_FangWenFangShi1 == 5)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "DELETE");
        }
        else if (rg_FangWenFangShi1 == 6)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, "TRACE");
        }
        else
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa4 (rg_HTTPDuiXiang, rg_QingQiuFangShi);
        }
        String rg_JiuCookie1;
        rg_JiuCookie1 = rg_GuanLiQi.rg_QuCookie (rg_QuZhuYuMing (rg_WangZhi5));
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DiJiaoCookies1))
        {
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_TianJiaQingQiuTou4 (rg_HTTPDuiXiang, "Cookie", rg_JiuCookie1);
        }
        else
        {
            rg_WangLaoQingQiuShuJuLei rg_QingQiuShuJu1 = new rg_WangLaoQingQiuShuJuLei ();
            rg_QingQiuShuJu1.rg_Cookies = (rg_JiuCookie1.equals ("") ? rg_DiJiaoCookies1 : (rg_JiuCookie1 + "; " + rg_DiJiaoCookies1));
            rg_QingQiuShuJu1.rg_DaoCookieDuiXiang ();
            rg_GuanLiQi.rg_TianJiaCookie (rg_QuZhuYuMing (rg_WangZhi5), rg_QingQiuShuJu1.rg_Cookies);
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_TianJiaQingQiuTou4 (rg_HTTPDuiXiang, "Cookie", rg_JiuCookie1.equals ("") ? rg_DiJiaoCookies1 : rg_QingQiuShuJu1.rg_Cookies);
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_FuJiaXieYiTou1) == false)
        {
            String [] rg_SuoYouQingQiuTou;
            int rg_i = 0;
            rg_SuoYouQingQiuTou = rg_FuJiaXieYiTou1.split ("\n", 0);
            for (rg_i = 0; rg_i < rg_SuoYouQingQiuTou.length; rg_i++)
            {
                String rg_Ju_QingQiuTou;
                String rg_Ju_XieYiZhi;
                int rg_Ju_MaoHaoWeiZhi;
                rg_Ju_MaoHaoWeiZhi = (rg_SuoYouQingQiuTou [rg_i].indexOf (":", 0));
                if (rg_Ju_MaoHaoWeiZhi != -1)
                {
                    rg_Ju_QingQiuTou = huoShan.Java.JiBen.rg_WenBenXingLei.rg_QuZiWenBen (rg_SuoYouQingQiuTou [rg_i], 0, rg_Ju_MaoHaoWeiZhi);
                    rg_Ju_XieYiZhi = huoShan.Java.JiBen.rg_WenBenXingLei.rg_QuZiWenBen (rg_SuoYouQingQiuTou [rg_i], rg_Ju_MaoHaoWeiZhi + 1, -1);
                    huoShan.Java.JiBen.rg_URLLianJieLei.rg_TianJiaQingQiuTou4 (rg_HTTPDuiXiang, rg_Ju_QingQiuTou, rg_Ju_XieYiZhi);
                }
            }
        }
        huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_ChongDingXiang3 (rg_HTTPDuiXiang, rg_YunXuChongDingXiang1);
        huoShan.Java.JiBen.rg_URLLianJieLei.rg_LianJie22 (rg_HTTPDuiXiang);
        if (rg_FangWenFangShi1 == 1 && rg_DiJiaoXinXi1.length > 0 && rg_DiJiaoXinXi1 != null)
        {
            java.io.OutputStream rg_ShuJuShuChuDuiXiang;
            rg_ShuJuShuChuDuiXiang = huoShan.Java.JiBen.rg_URLLianJieLei.rg_ShuChuLiu2 (rg_HTTPDuiXiang);
            if (rg_ShuJuShuChuDuiXiang == null)
            {
                return (new byte [0]);
            }
            huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuShuJu4 (rg_ShuJuShuChuDuiXiang, rg_DiJiaoXinXi1, null);
            huoShan.Java.JiBen.rg_ShuChuLiu1.rg_GuanBi58 (rg_ShuJuShuChuDuiXiang);
        }
        if (huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang) == huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuChengGong1 || huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang) == huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_LinShiChongDingXiang)
        {
            java.io.InputStream rg_ShuRuLiuDuiXiang;
            java.io.ByteArrayOutputStream rg_ZiJieShuChuLiuDuiXiang = new java.io.ByteArrayOutputStream ();
            rg_ShuRuLiuDuiXiang = huoShan.Java.JiBen.rg_URLLianJieLei.rg_ShuRuLiu2 (rg_HTTPDuiXiang);
            if (rg_FanHuiDuiXiang1 == null)
            {
                rg_FanHuiDuiXiang1 = new rg_WangLaoQingQiuShuJuLei ();
            }
            rg_FanHuiDuiXiang1.rg_XiangYingMa = huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang);
            java.util.Map<String, java.util.List<String>> rg_XiangYingTouJiGe;
            rg_XiangYingTouJiGe = huoShan.Java.JiBen.rg_URLLianJieLei.rg_SuoYouXiangYingTou (rg_HTTPDuiXiang);
            if (rg_XiangYingTouJiGe != null)
            {
                for (int __vol_counter_index = 0; __vol_counter_index < huoShan.Java.JiBen.rg_URLLianJieLei.rg_SuoYouXiangYingTou (rg_HTTPDuiXiang).size(); __vol_counter_index++)
                {
                    String rg_JianMing19;
                    String rg_JianZhi2;
                    rg_JianMing19 = rg_HTTPDuiXiang.getHeaderFieldKey(__vol_counter_index);
                    rg_JianZhi2 = rg_HTTPDuiXiang.getHeaderField(__vol_counter_index);
                    if (rg_JianMing19 != null && rg_JianZhi2 != null)
                    {
                        if (rg_JianMing19.equals ("Location"))
                        {
                            rg_FanHuiDuiXiang1.rg_ChongDingXiangDeZhi = rg_JianZhi2;
                        }
                        if (rg_JianMing19.equals ("Set-Cookie"))
                        {
                            rg_FanHuiDuiXiang1.rg_Cookies = rg_FanHuiDuiXiang1.rg_Cookies + rg_JianZhi2 + "; ";
                        }
                        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_FanHuiDuiXiang1.rg_XiangYingTou))
                        {
                            rg_FanHuiDuiXiang1.rg_XiangYingTou = rg_JianMing19 + ":" + rg_JianZhi2;
                        }
                        else
                        {
                            rg_FanHuiDuiXiang1.rg_XiangYingTou = rg_FanHuiDuiXiang1.rg_XiangYingTou + "\n" + rg_JianMing19 + ":" + rg_JianZhi2;
                        }
                    }
                }
                if (rg_FanHuiDuiXiang1.rg_Cookies.length () > 2)
                {
                    rg_GuanLiQi.rg_TianJiaCookie (rg_QuZhuYuMing (rg_WangZhi5), rg_FanHuiDuiXiang1.rg_Cookies.substring (0, (rg_FanHuiDuiXiang1.rg_Cookies.length () - 2)));
                    rg_FanHuiDuiXiang1.rg_Cookies = rg_GuanLiQi.rg_QuCookie (rg_QuZhuYuMing (rg_WangZhi5));
                    rg_CookiesJianZhiDuiXiang = rg_FanHuiDuiXiang1.rg_DaoCookieDuiXiang ();
                }
            }
            byte [] rg_HuanChongOu11 = new byte [2048];
            int rg_YiDouChangDu = 0;
            while (rg_YiDouChangDu != -1)
            {
                rg_YiDouChangDu = huoShan.Java.JiBen.rg_ShuRuLiu1.rg_DouRuShuJu4 (rg_ShuRuLiuDuiXiang, rg_HuanChongOu11, null);
                huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuShuJu3 (rg_ZiJieShuChuLiuDuiXiang, rg_HuanChongOu11, 0, rg_YiDouChangDu, null);
            }
            byte [] rg_FanHuiShuJu1;
            rg_FanHuiShuJu1 = rg_ZiJieShuChuLiuDuiXiang.toByteArray ();
            huoShan.Java.JiBen.rg_ShuRuLiu1.rg_GuanBi56 (rg_ShuRuLiuDuiXiang);
            huoShan.Java.JiBen.rg_ShuChuLiu1.rg_GuanBi58 (rg_ZiJieShuChuLiuDuiXiang);
            return (rg_FanHuiShuJu1);
        }
        else
        {
            rg_ChangYongGongNeng.dbg_log (("网页访问失败状态码：" + String.valueOf (huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang))), "");
            return (new byte [0]);
        }
    }

    public void rg_HTTPYiBuDouWenJian (String rg_WangZhi6, int rg_QingQiuSuoYin) {
        huoShan.Java.JiBen.rg_XianChengLei rg_QingQiuXianCheng = new huoShan.Java.JiBen.rg_XianChengLei ();
        rg_QingQiuXianCheng.rl_XianChengLei_XianChengQiDong (new huoShan.Java.JiBen.rg_XianChengLei.re_XianChengQiDong () {
            public int dispatch (huoShan.Java.JiBen.rg_XianChengLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36) {
                return rg_XianChengLei_XianChengQiDong (objSource, nTagNumber, rg_YongHuDuiXiang35, rg_YongHuDuiXiang36);
            }
        }, 0);
        rg_QingQiuXianCheng.rg_QiDong11 ((Object)rg_WangZhi6, (Object)rg_QingQiuSuoYin);
    }

    protected int rg_XianChengLei_XianChengQiDong (huoShan.Java.JiBen.rg_XianChengLei rg_LaiYuanDuiXiang26, int rg_BiaoJiZhi26, java.lang.Object rg_YongHuDuiXiang10, java.lang.Object rg_YongHuDuiXiang11) {
        rg_WangLaoQingQiuShuJuLei rg_ShuJuFanHuiDuiXiang = new rg_WangLaoQingQiuShuJuLei ();
        byte [] rg_FanHuiShuJu2;
        rg_FanHuiShuJu2 = new byte [0];
        if (rg_BiaoJiZhi26 == 0)
        {
            rg_FanHuiShuJu2 = rg_HTTPDouWenJian1 (String.valueOf (rg_YongHuDuiXiang10), 0, null, null, null, true, null, 0, 5000, rg_ShuJuFanHuiDuiXiang);
        }
        else if (rg_BiaoJiZhi26 == 1)
        {
            android.os.Bundle rg_QingQiuCanShuShuJuBao;
            rg_QingQiuCanShuShuJuBao = (android.os.Bundle)rg_YongHuDuiXiang10;
            rg_FanHuiShuJu2 = rg_HTTPDouWenJian_ZiJieShuZuDiJiao (rg_QingQiuCanShuShuJuBao.getString ("网址", ""), rg_QingQiuCanShuShuJuBao.getInt ("访问方式", 0), rg_QingQiuCanShuShuJuBao.getByteArray ("提交信息"), rg_QingQiuCanShuShuJuBao.getString ("提交Cookies", ""), rg_QingQiuCanShuShuJuBao.getString ("附加协议头", ""), rg_QingQiuCanShuShuJuBao.getBoolean ("禁止重定向", false), rg_QingQiuCanShuShuJuBao.getString ("代理地址", ""), rg_QingQiuCanShuShuJuBao.getInt ("代理端口", 0), rg_QingQiuCanShuShuJuBao.getInt ("超时", 0), rg_ShuJuFanHuiDuiXiang);
            rg_CookiesJianZhiDuiXiang = rg_ShuJuFanHuiDuiXiang.rg_DaoCookieDuiXiang ();
        }
        final byte[] data = rg_FanHuiShuJu2;
        final String cookies = rg_ShuJuFanHuiDuiXiang.rg_Cookies;
        final String response = rg_ShuJuFanHuiDuiXiang.rg_XiangYingTou;
        final int i = (int)(Integer)rg_YongHuDuiXiang11;
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                rg_QingQiuWanBi(data, cookies, response, i);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_QingQiuWanBi(data, cookies, response, i);
                    } catch (Exception e) { }
                } } );
        }
        return (0);
    }

    public static interface re_QingQiuWanBi { int dispatch (rg_AnZhuoWangLaoCaoZuoLei objSource, int nTagNumber, byte [] rg_FanHuiShuJu3, String rg_Cookies1, String rg_XiangYingTou1, int rg_QingQiuSuoYin3); }
    private re_QingQiuWanBi rd_QingQiuWanBi;
    private int rd_QingQiuWanBi_tag;
    public void rl_AnZhuoWangLaoCaoZuoLei_QingQiuWanBi (re_QingQiuWanBi objListener, int nTagNumber) {
        synchronized (this) { rd_QingQiuWanBi = objListener;  rd_QingQiuWanBi_tag = nTagNumber; }
    }
    public int rg_QingQiuWanBi (byte [] rg_FanHuiShuJu3, String rg_Cookies1, String rg_XiangYingTou1, int rg_QingQiuSuoYin3) {
        re_QingQiuWanBi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_QingQiuWanBi;  nTagNumber = rd_QingQiuWanBi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_FanHuiShuJu3, rg_Cookies1, rg_XiangYingTou1, rg_QingQiuSuoYin3) : 0);
    }
}
