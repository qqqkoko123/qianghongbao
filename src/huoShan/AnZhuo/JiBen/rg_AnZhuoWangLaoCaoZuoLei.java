
package huoShan.AnZhuo.JiBen;

public class rg_AnZhuoWangLaoCaoZuoLei {

    public rg_AnZhuoWangLaoCaoZuoLei ()  { }

    public static byte [] rg_HTTPDouWenJian1 (String rg_WangZhi4, int rg_FangWenFangShi, String rg_DiJiaoXinXi, String rg_DiJiaoCookies, String rg_FuJiaXieYiTou, boolean rg_JinZhiChongDingXiang, String rg_DaiLiDeZhi, int rg_DaiLiDuanKou, int rg_ChaoShi, rg_WangLaoQingQiuShuJuLei rg_FanHuiDuiXiang) {
        java.net.URL rg_URLDuiXiang1;
        java.net.HttpURLConnection rg_HTTPDuiXiang1;
        String rg_QingQiuFangShi = "GET";
        rg_URLDuiXiang1 = huoShan.Java.JiBen.rg_URLLei.rg_ChuangJian325 (rg_WangZhi4);
        if (rg_URLDuiXiang1 == null)
        {
            return (new byte [0]);
        }
        if (rg_DaiLiDeZhi != null && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DaiLiDeZhi) == false)
        {
            java.net.Proxy rg_DaiLiDuiXiang;
            java.net.InetSocketAddress rg_TaoJieZiDeZhiDuiXiang;
            rg_TaoJieZiDeZhiDuiXiang = huoShan.Java.JiBen.rg_TaoJieZiDeZhiLei.rg_ChuangJianDuiXiang45 (rg_DaiLiDeZhi, rg_DaiLiDuanKou);
            rg_DaiLiDuiXiang = huoShan.Java.JiBen.rg_DaiLiLei.rg_ChuangJianDuiXiang43 (huoShan.Java.JiBen.rg_DaiLiLei.rg_HTTPDaiLi2, rg_TaoJieZiDeZhiDuiXiang);
            rg_HTTPDuiXiang1 = (java.net.HttpURLConnection)huoShan.Java.JiBen.rg_URLLei.rg_DaKaiLianJie1 (rg_URLDuiXiang1, rg_DaiLiDuiXiang);
        }
        else
        {
            rg_HTTPDuiXiang1 = (java.net.HttpURLConnection)huoShan.Java.JiBen.rg_URLLei.rg_DaKaiLianJie (rg_URLDuiXiang1);
        }
        if (rg_HTTPDuiXiang1 == null)
        {
            return (new byte [0]);
        }
        huoShan.Java.JiBen.rg_URLLianJieLei.rg_LianJieChaoShi15 (rg_HTTPDuiXiang1, rg_ChaoShi);
        if (rg_FangWenFangShi == 0)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "GET");
        }
        else if (rg_FangWenFangShi == 1)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "POST");
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiXieChu1 (rg_HTTPDuiXiang1, true);
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiShuRu1 (rg_HTTPDuiXiang1, true);
        }
        else if (rg_FangWenFangShi == 2)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "HEAD");
        }
        else if (rg_FangWenFangShi == 3)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "PUT");
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiXieChu1 (rg_HTTPDuiXiang1, true);
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_DaKaiShuRu1 (rg_HTTPDuiXiang1, true);
        }
        else if (rg_FangWenFangShi == 4)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "OPTIONS");
        }
        else if (rg_FangWenFangShi == 5)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "DELETE");
        }
        else if (rg_FangWenFangShi == 6)
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, "TRACE");
        }
        else
        {
            huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuFangFa3 (rg_HTTPDuiXiang1, rg_QingQiuFangShi);
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DiJiaoCookies) == false)
        {
            huoShan.Java.JiBen.rg_URLLianJieLei.rg_TianJiaQingQiuTou3 (rg_HTTPDuiXiang1, "Cookie", rg_DiJiaoCookies);
        }
        if (rg_FuJiaXieYiTou != null && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_FuJiaXieYiTou) == false)
        {
            String [] rg_SuoYouQingQiuTou;
            int rg_i = 0;
            rg_SuoYouQingQiuTou = rg_FuJiaXieYiTou.split ("\n", 0);
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
                    huoShan.Java.JiBen.rg_URLLianJieLei.rg_TianJiaQingQiuTou3 (rg_HTTPDuiXiang1, rg_Ju_QingQiuTou, rg_Ju_XieYiZhi);
                }
            }
        }
        huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_ChongDingXiang3 (rg_HTTPDuiXiang1, rg_JinZhiChongDingXiang);
        huoShan.Java.JiBen.rg_URLLianJieLei.rg_LianJie22 (rg_HTTPDuiXiang1);
        if (rg_FangWenFangShi == 1 && rg_DiJiaoXinXi != null && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_DiJiaoXinXi) == false)
        {
            java.io.PrintWriter rg_ShuJuShuChuDuiXiang;
            rg_ShuJuShuChuDuiXiang = huoShan.Java.JiBen.rg_DaYinXieChuLiu.rg_ChuangJian332 (huoShan.Java.JiBen.rg_URLLianJieLei.rg_ShuChuLiu2 (rg_HTTPDuiXiang1), false);
            if (rg_ShuJuShuChuDuiXiang == null)
            {
                return (new byte [0]);
            }
            rg_ShuJuShuChuDuiXiang.print (rg_DiJiaoXinXi);
            huoShan.Java.JiBen.rg_XieChuLiu.rg_GuanBi64 (rg_ShuJuShuChuDuiXiang);
        }
        if (huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang1) == huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_QingQiuChengGong1 || huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang1) == huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_LinShiChongDingXiang)
        {
            java.io.InputStream rg_ShuRuLiuDuiXiang1;
            java.io.ByteArrayOutputStream rg_ZiJieShuChuLiuDuiXiang1 = new java.io.ByteArrayOutputStream ();
            rg_ShuRuLiuDuiXiang1 = huoShan.Java.JiBen.rg_URLLianJieLei.rg_ShuRuLiu2 (rg_HTTPDuiXiang1);
            if (rg_FanHuiDuiXiang != null)
            {
                rg_FanHuiDuiXiang.rg_Cookies = rg_HTTPDuiXiang1.getHeaderField("Set-Cookie");
                java.util.Set<String> rg_QingQiuTouShuJuJi;
                rg_QingQiuTouShuJuJi = (huoShan.Java.JiBen.rg_URLLianJieLei.rg_SuoYouXiangYingTou (rg_HTTPDuiXiang1).keySet());
                java.util.Iterator<String> rg_QingQiuTouJianMeiJuDuiXiang;
                rg_QingQiuTouJianMeiJuDuiXiang = rg_QingQiuTouShuJuJi.iterator ();
                while (rg_QingQiuTouJianMeiJuDuiXiang.hasNext ())
                {
                    String rg_Jian;
                    String rg_Zhi8;
                    rg_Jian = huoShan.Java.JiBen.rg_WenBenMeiJuQiLei.rg_DaoXiaYiChengYuan108 (rg_QingQiuTouJianMeiJuDuiXiang);
                    rg_Zhi8 = rg_HTTPDuiXiang1.getHeaderField(rg_Jian);
                    if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_FanHuiDuiXiang.rg_XiangYingTou))
                    {
                        rg_FanHuiDuiXiang.rg_XiangYingTou = rg_Jian + ":" + rg_Zhi8;
                    }
                    else
                    {
                        rg_FanHuiDuiXiang.rg_XiangYingTou = rg_FanHuiDuiXiang.rg_XiangYingTou + "\n" + rg_Jian + ":" + rg_Zhi8;
                    }
                }
            }
            byte [] rg_HuanChongOu9 = new byte [2048];
            int rg_YiDouChangDu1 = 0;
            while (rg_YiDouChangDu1 != -1)
            {
                rg_YiDouChangDu1 = huoShan.Java.JiBen.rg_ShuRuLiu1.rg_DouRuShuJu4 (rg_ShuRuLiuDuiXiang1, rg_HuanChongOu9, null);
                huoShan.Java.JiBen.rg_ShuChuLiu1.rg_XieChuShuJu3 (rg_ZiJieShuChuLiuDuiXiang1, rg_HuanChongOu9, 0, rg_YiDouChangDu1, null);
            }
            byte [] rg_FanHuiShuJu2;
            rg_FanHuiShuJu2 = rg_ZiJieShuChuLiuDuiXiang1.toByteArray ();
            huoShan.Java.JiBen.rg_ShuRuLiu1.rg_GuanBi56 (rg_ShuRuLiuDuiXiang1);
            huoShan.Java.JiBen.rg_ShuChuLiu1.rg_GuanBi58 (rg_ZiJieShuChuLiuDuiXiang1);
            return (rg_FanHuiShuJu2);
        }
        else
        {
            rg_ChangYongGongNeng.dbg_log (String.valueOf (huoShan.Java.JiBen.rg_HTTPLianJieLei.rg_XiangYingZhuangTaiMa (rg_HTTPDuiXiang1)), "");
            return (new byte [0]);
        }
    }

    public void rg_HTTPYiBuDouWenJian (String rg_WangZhi5, int rg_QingQiuSuoYin) {
        huoShan.Java.JiBen.rg_XianChengLei rg_QingQiuXianCheng = new huoShan.Java.JiBen.rg_XianChengLei ();
        rg_QingQiuXianCheng.rl_XianChengLei_XianChengQiDong (new huoShan.Java.JiBen.rg_XianChengLei.re_XianChengQiDong () {
            public int dispatch (huoShan.Java.JiBen.rg_XianChengLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36) {
                return rg_XianChengLei_XianChengQiDong (objSource, nTagNumber, rg_YongHuDuiXiang35, rg_YongHuDuiXiang36);
            }
        }, 0);
        rg_QingQiuXianCheng.rg_QiDong11 ((Object)rg_WangZhi5, (Object)rg_QingQiuSuoYin);
    }

    protected int rg_XianChengLei_XianChengQiDong (huoShan.Java.JiBen.rg_XianChengLei rg_LaiYuanDuiXiang24, int rg_BiaoJiZhi24, java.lang.Object rg_YongHuDuiXiang10, java.lang.Object rg_YongHuDuiXiang11) {
        rg_WangLaoQingQiuShuJuLei rg_ShuJuFanHuiDuiXiang = new rg_WangLaoQingQiuShuJuLei ();
        byte [] rg_FanHuiShuJu3;
        rg_FanHuiShuJu3 = null;
        if (rg_BiaoJiZhi24 == 0)
        {
            rg_FanHuiShuJu3 = rg_HTTPDouWenJian1 (String.valueOf (rg_YongHuDuiXiang10), 0, null, null, null, true, null, 0, 5000, rg_ShuJuFanHuiDuiXiang);
        }
        else if (rg_BiaoJiZhi24 == 1)
        {
            android.os.Bundle rg_QingQiuCanShuShuJuBao;
            rg_QingQiuCanShuShuJuBao = (android.os.Bundle)rg_YongHuDuiXiang10;
            rg_FanHuiShuJu3 = rg_HTTPDouWenJian1 (rg_QingQiuCanShuShuJuBao.getString ("网址", ""), rg_QingQiuCanShuShuJuBao.getInt ("访问方式", 0), rg_QingQiuCanShuShuJuBao.getString ("提交信息", ""), rg_QingQiuCanShuShuJuBao.getString ("提交Cookies", ""), rg_QingQiuCanShuShuJuBao.getString ("附加协议头", ""), rg_QingQiuCanShuShuJuBao.getBoolean ("禁止重定向", false), rg_QingQiuCanShuShuJuBao.getString ("代理地址", ""), rg_QingQiuCanShuShuJuBao.getInt ("代理端口", 0), rg_QingQiuCanShuShuJuBao.getInt ("超时", 0), rg_ShuJuFanHuiDuiXiang);
        }
        final byte[] data = rg_FanHuiShuJu3;
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

    public static interface re_QingQiuWanBi { int dispatch (rg_AnZhuoWangLaoCaoZuoLei objSource, int nTagNumber, byte [] rg_FanHuiShuJu4, String rg_Cookies1, String rg_XiangYingTou1, int rg_QingQiuSuoYin2); }
    private re_QingQiuWanBi rd_QingQiuWanBi;
    private int rd_QingQiuWanBi_tag;
    public void rl_AnZhuoWangLaoCaoZuoLei_QingQiuWanBi (re_QingQiuWanBi objListener, int nTagNumber) {
        synchronized (this) { rd_QingQiuWanBi = objListener;  rd_QingQiuWanBi_tag = nTagNumber; }
    }
    public int rg_QingQiuWanBi (byte [] rg_FanHuiShuJu4, String rg_Cookies1, String rg_XiangYingTou1, int rg_QingQiuSuoYin2) {
        re_QingQiuWanBi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_QingQiuWanBi;  nTagNumber = rd_QingQiuWanBi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_FanHuiShuJu4, rg_Cookies1, rg_XiangYingTou1, rg_QingQiuSuoYin2) : 0);
    }
}
