
package com.qqq.WXhongbao;

public class rg_DYQiangGongBaoRenWuLei extends rg_RenWuJiChuLei {

    public rg_DYQiangGongBaoRenWuLei ()  { }

    protected static rg_DYQiangGongBaoRenWuLei rg_RenWuDuiXiang4;
    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi2;
    protected String rg_ShouYeChuangKouLeiMing = "com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity";

    public static void rg_ChuShiHuaMoNiShiJianFaSong2 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang5) {
        rg_MoNiCaoZuoShiJianFaSongQi2 = rg_JieShouDuiXiang5;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang73) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang73);
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf(rg_ShiJianDuiXiang73.getClassName()));
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf (rg_QiYongZhuangTai3));
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getPackageName()), "com.ss.android.ugc.aweme", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), rg_ShouYeChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_GenLieBiao;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian6;
            String [] rg_DouYinBanBenXinXi;
            String rg_DouYinBanBenHao = "0";
            int rg_ZiJieDianShuLiang3;
            String rg_ZiJieDianNeiRong;
            rg_DouYinBanBenXinXi = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.ss.android.ugc.aweme");
            if (rg_DouYinBanBenXinXi.length == 2)
            {
                rg_DouYinBanBenHao = rg_DouYinBanBenXinXi [1];
            }
            rg_GenLieBiao = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.ss.android.ugc.aweme:id/content", null);
            if (rg_GenLieBiao != null && rg_GenLieBiao.size () > 0)
            {
                rg_JieDian6 = rg_GenLieBiao.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindy);
                if (rg_JieDian6 != null)
                {
                    if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindy <= rg_GenLieBiao.size () - 2)
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindy = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindy + 1;
                    }
                    else
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindy = 0;
                    }
                    rg_ZiJieDianShuLiang3 = rg_JieDian6.getChildCount();
                    if (rg_ZiJieDianShuLiang3 == 2)
                    {
                        rg_ZiJieDianNeiRong = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian6, 1).getText());
                        if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian6, 1).getText()).equals ("抖音红包"))
                        {
                            anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian_JiangZhi (rg_JieDian6);
                            rg_DYQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = false;
                            rg_DYGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
                            rg_DYGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = true;
                        }
                    }
                }
            }
            else
            {
                rg_DYQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                rg_DYGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
                rg_DYGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
            }
        }
        return;
    }

    public static synchronized rg_DYQiangGongBaoRenWuLei rg_QuRenWuDuiXiang2 () {
        if (rg_RenWuDuiXiang4 == null)
        {
            rg_RenWuDuiXiang4 = new rg_DYQiangGongBaoRenWuLei ();
        }
        return (rg_RenWuDuiXiang4);
    }
}
