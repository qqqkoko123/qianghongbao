
package huoShan.AnZhuo.JiBen;

public class rg_WangLaoQingQiuShuJuLei {

    public rg_WangLaoQingQiuShuJuLei ()  { }

    public String rg_Cookies = "";
    public String rg_XiangYingTou = "";
    public int rg_XiangYingMa;
    public String rg_ChongDingXiangDeZhi = "";
    protected java.util.HashMap<String, String> rg_HaXiBiao = new java.util.HashMap<String, String> ();

    public void rg_TianJia1 (String rg_JianMingChen, String rg_JianZhi) {
        huoShan.Java.JiBen.rg_WenBenDaoWenBenHaXiBiaoLei.rg_ZhiRu38 (rg_HaXiBiao, rg_JianMingChen, rg_JianZhi);
    }

    public String rg_QuJianZhi (String rg_JianMingChen1) {
        String rg_JianZhi1;
        rg_JianZhi1 = (String)rg_HaXiBiao.get (rg_JianMingChen1);
        return ((rg_JianZhi1 == null) ? "" : rg_JianZhi1);
    }

    public void rg_ShanChuJian1 (String rg_YaoShanChuDeJianMing) {
        huoShan.Java.JiBen.rg_WenBenDaoWenBenHaXiBiaoLei.rg_ShanChu12 (rg_HaXiBiao, rg_YaoShanChuDeJianMing);
    }

    public rg_WangLaoQingQiuShuJuLei rg_DaoCookieDuiXiang () {
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_Cookies))
        {
            return (null);
        }
        String [] rg_FenGeHou;
        rg_FenGeHou = rg_Cookies.split (";", 0);
        if (rg_FenGeHou != null)
        {
            rg_WangLaoQingQiuShuJuLei rg_RongQiDuiXiang = new rg_WangLaoQingQiuShuJuLei ();
            for (int __vol_counter_index = 0; __vol_counter_index < rg_FenGeHou.length; __vol_counter_index++)
            {
                String rg_ChengYuanWenBen;
                rg_ChengYuanWenBen = (rg_FenGeHou [__vol_counter_index].trim ());
                int rg_SuoYin10;
                rg_SuoYin10 = rg_ChengYuanWenBen.indexOf ("=", 0);
                if (rg_SuoYin10 != -1)
                {
                    String rg_CkZhi;
                    String rg_CkMingChen;
                    rg_CkZhi = huoShan.Java.JiBen.rg_WenBenXingLei.rg_QuWenBenYouBian (rg_ChengYuanWenBen, rg_ChengYuanWenBen.length () - (rg_SuoYin10 + 1));
                    rg_CkMingChen = rg_ChengYuanWenBen.substring (0, rg_SuoYin10);
                    rg_RongQiDuiXiang.rg_TianJia1 (rg_CkMingChen, rg_CkZhi);
                    if (rg_CkZhi.equals ("deleted"))
                    {
                        rg_RongQiDuiXiang.rg_ShanChuJian1 (rg_CkMingChen);
                    }
                }
            }
            rg_RongQiDuiXiang.rg_Cookies = rg_RongQiDuiXiang.rg_DaoCookiesWenBen ();
            return (rg_RongQiDuiXiang);
        }
        return (null);
    }

    public String rg_DaoCookiesWenBen () {
        if (rg_HaXiBiao.size () == 0)
        {
            return ("");
        }
        java.util.Iterator<java.util.Map.Entry<String, String>> rg_MeiJuQi;
        rg_MeiJuQi = (rg_HaXiBiao.entrySet ().iterator ());
        if (rg_MeiJuQi == null)
        {
            return ("");
        }
        java.lang.StringBuffer rg_HuanChongOu8 = new java.lang.StringBuffer ();
        while (rg_MeiJuQi.hasNext ())
        {
            java.util.Map.Entry<String, String> rg_HaXiBiaoXiang;
            rg_HaXiBiaoXiang = huoShan.Java.JiBen.rg_WenBenDaoWenBenHaXiBiaoXiangMeiJuQiLei.rg_DaoXiaYiChengYuan151 (rg_MeiJuQi);
            rg_HuanChongOu8.append (rg_HaXiBiaoXiang.getKey () + "=" + rg_HaXiBiaoXiang.getValue () + "; ");
        }
        rg_Cookies = huoShan.Java.JiBen.rg_AnQuanWenBenHuanChongOu.rg_QuZiWenBen3 (rg_HuanChongOu8, 0, rg_HuanChongOu8.length () - 2);
        return (rg_Cookies);
    }
}
