
package huoShan.AnZhuo.JiBen;

public class rg_AnZhuoCookieGuanLiQi {

    public rg_AnZhuoCookieGuanLiQi ()  { }

    public static final int rg_LinShiGuanLi = 0;
    public static final int rg_YongJiuCunChu = 1;
    public static final int rg_BuGuanLi = 2;
    protected android.content.SharedPreferences rg_PeiZhiBiao;
    protected rg_WangLaoQingQiuShuJuLei rg_QingQiuShuJu = new rg_WangLaoQingQiuShuJuLei ();

    public void rg_TianJiaCookie (String rg_DiGongYuMing1, String rg_BaoCunDeXinCookie) {
        String rg_JiuCookie;
        rg_JiuCookie = rg_QuCookie (rg_DiGongYuMing1);
        rg_WangLaoQingQiuShuJuLei rg_GeBingDuiXiang = new rg_WangLaoQingQiuShuJuLei ();
        rg_GeBingDuiXiang.rg_Cookies = rg_JiuCookie + "; " + rg_BaoCunDeXinCookie;
        rg_BaoCunDeXinCookie = rg_GeBingDuiXiang.rg_DaoCookieDuiXiang ().rg_Cookies;
        if (rg_AnZhuoWangLaoCaoZuoLei.rg_CookieGuanLi == rg_AnZhuoCookieGuanLiQi.rg_LinShiGuanLi)
        {
            rg_QingQiuShuJu.rg_TianJia1 (rg_DiGongYuMing1, rg_BaoCunDeXinCookie);
        }
        else if (rg_AnZhuoWangLaoCaoZuoLei.rg_CookieGuanLi == rg_AnZhuoCookieGuanLiQi.rg_YongJiuCunChu)
        {
            rg_PeiZhiBiao = rg_YingYongChengXu.rg_QuChengXuPeiZhiBiao ("HTTPvolCookies", false);
            android.content.SharedPreferences.Editor rg_XiuGaiQi1;
            rg_XiuGaiQi1 = rg_ChengXuPeiZhiBiao.rg_QuXiuGaiQi (rg_PeiZhiBiao, true);
            rg_XiuGaiQi1.putString (rg_DiGongYuMing1, rg_BaoCunDeXinCookie);
            rg_XiuGaiQi1.commit ();
        }
    }

    public String rg_QuCookie (String rg_YuQuYuMing) {
        if (rg_AnZhuoWangLaoCaoZuoLei.rg_CookieGuanLi == rg_AnZhuoCookieGuanLiQi.rg_LinShiGuanLi)
        {
            return (rg_QingQiuShuJu.rg_QuJianZhi (rg_YuQuYuMing));
        }
        else if (rg_AnZhuoWangLaoCaoZuoLei.rg_CookieGuanLi == rg_AnZhuoCookieGuanLiQi.rg_YongJiuCunChu)
        {
            rg_PeiZhiBiao = rg_YingYongChengXu.rg_QuChengXuPeiZhiBiao ("HTTPvolCookies", true);
            return (rg_ChengXuPeiZhiBiao.rg_QuWenBenPeiZhiXiang (rg_PeiZhiBiao, rg_YuQuYuMing, ""));
        }
        return ("");
    }
}
