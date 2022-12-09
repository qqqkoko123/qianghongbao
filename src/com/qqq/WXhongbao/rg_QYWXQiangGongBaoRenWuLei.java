
package com.qqq.WXhongbao;

public class rg_QYWXQiangGongBaoRenWuLei extends rg_RenWuJiChuLei {

    public rg_QYWXQiangGongBaoRenWuLei ()  { }

    protected static rg_QYWXQiangGongBaoRenWuLei rg_RenWuDuiXiang9;
    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi7;
    protected String rg_ShouYeChuangKouLeiMing1 = "com.tencent.wework.msg.controller.MessageListActivity";

    public static void rg_ChuShiHuaMoNiShiJianFaSong7 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang10) {
        rg_MoNiCaoZuoShiJianFaSongQi7 = rg_JieShouDuiXiang10;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang78) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang78);
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf(rg_ShiJianDuiXiang78.getClassName()));
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf (rg_QiYongZhuangTai3));
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), rg_ShouYeChuangKouLeiMing1, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_GenLieBiao1;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian10;
            String [] rg_WeiXinBanBenXinXi;
            String rg_WeiXinBanBenHao = "0";
            int rg_ZiJieDianShuLiang4;
            String rg_ZiJieDianNeiRong1;
            rg_WeiXinBanBenXinXi = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi.length == 2)
            {
                rg_WeiXinBanBenHao = rg_WeiXinBanBenXinXi [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao) == 18722)
            {
                rg_GenLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/gaj", null);
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian10 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx);
                    if (rg_JieDian10 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = 0;
                        }
                        rg_ZiJieDianShuLiang4 = rg_JieDian10.getChildCount();
                        if (rg_ZiJieDianShuLiang4 == 2)
                        {
                            rg_ZiJieDianNeiRong1 = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText());
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText()).equals ("红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian10);
                                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao) == 14197)
            {
                rg_GenLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/ewu", null);
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian10 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx);
                    if (rg_JieDian10 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = 0;
                        }
                        rg_ZiJieDianShuLiang4 = rg_JieDian10.getChildCount();
                        if (rg_ZiJieDianShuLiang4 == 2)
                        {
                            rg_ZiJieDianNeiRong1 = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText());
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText()).equals ("红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian10);
                                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao) == 17946)
            {
                rg_GenLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/f_l", null);
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian10 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx);
                    if (rg_JieDian10 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = 0;
                        }
                        rg_ZiJieDianShuLiang4 = rg_JieDian10.getChildCount();
                        if (rg_ZiJieDianShuLiang4 == 2)
                        {
                            rg_ZiJieDianNeiRong1 = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText());
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText()).equals ("红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian10);
                                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao) >= 20360)
            {
                rg_GenLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/gze", null);
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian10 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx);
                    if (rg_JieDian10 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqywx = 0;
                        }
                        rg_ZiJieDianShuLiang4 = rg_JieDian10.getChildCount();
                        if (rg_ZiJieDianShuLiang4 == 2)
                        {
                            rg_ZiJieDianNeiRong1 = String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText());
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian10, 1).getText()).equals ("红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian10);
                                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXQiangGongBaoRenWuLei rg_QuRenWuDuiXiang7 () {
        if (rg_RenWuDuiXiang9 == null)
        {
            rg_RenWuDuiXiang9 = new rg_QYWXQiangGongBaoRenWuLei ();
        }
        return (rg_RenWuDuiXiang9);
    }
}
