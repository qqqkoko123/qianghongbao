
package com.qqq.WXhongbao;

public class rg_QYWXQiangGongBaoRenWuLei extends rg_RenWuJiChuLei {

    public rg_QYWXQiangGongBaoRenWuLei ()  { }

    protected static rg_QYWXQiangGongBaoRenWuLei rg_RenWuDuiXiang6;
    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi4;
    protected String rg_ShouYeChuangKouLeiMing = "com.tencent.wework.msg.controller.MessageListActivity";

    public static void rg_ChuShiHuaMoNiShiJianFaSong4 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang7) {
        rg_MoNiCaoZuoShiJianFaSongQi4 = rg_JieShouDuiXiang7;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang73) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang73);
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf(rg_ShiJianDuiXiang73.getClassName()));
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf (rg_QiYongZhuangTai3));
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), rg_ShouYeChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang73.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_GenLieBiao;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian4;
            String [] rg_WeiXinBanBenXinXi;
            String rg_WeiXinBanBenHao = "0";
            int rg_ZiJieDianShuLiang2;
            String rg_ZiJieDianNeiRong;
            rg_WeiXinBanBenXinXi = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi.length == 2)
            {
                rg_WeiXinBanBenHao = rg_WeiXinBanBenXinXi [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao) == 17946)
            {
                rg_GenLieBiao = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.wework:id/f_l");
                if (rg_GenLieBiao != null && rg_GenLieBiao.size () > 0)
                {
                    rg_JieDian4 = rg_GenLieBiao.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx);
                    if (rg_JieDian4 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx <= rg_GenLieBiao.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = 0;
                        }
                        rg_ZiJieDianShuLiang2 = rg_JieDian4.getChildCount();
                        if (rg_ZiJieDianShuLiang2 == 2)
                        {
                            rg_ZiJieDianNeiRong = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian4, 1).getText());
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian4, 1).getText()).equals ("红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian4);
                                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXQiangGongBaoRenWuLei rg_QuRenWuDuiXiang4 () {
        if (rg_RenWuDuiXiang6 == null)
        {
            rg_RenWuDuiXiang6 = new rg_QYWXQiangGongBaoRenWuLei ();
        }
        return (rg_RenWuDuiXiang6);
    }
}
