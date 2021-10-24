
package com.qqq.WXhongbao;

public class rg_QiangGongBaoRenWuLei extends rg_RenWuJiChuLei {

    public rg_QiangGongBaoRenWuLei ()  { }

    protected static rg_QiangGongBaoRenWuLei rg_RenWuDuiXiang10;
    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi7;
    protected String rg_ShouYeChuangKouLeiMing1 = "com.tencent.mm.ui.LauncherUI";

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
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getPackageName()), rg_ChengXuGongJuLei.rg_WeiXinBaoMing, false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), rg_ShouYeChuangKouLeiMing1, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang78.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_GenLieBiao1;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian7;
            String [] rg_WeiXinBanBenXinXi3;
            String rg_WeiXinBanBenHao3 = "0";
            rg_WeiXinBanBenXinXi3 = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi (rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
            if (rg_WeiXinBanBenXinXi3.length == 2)
            {
                rg_WeiXinBanBenHao3 = rg_WeiXinBanBenXinXi3 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) < 1840)
            {
                rg_GenLieBiao1 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mm:id/al7");
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian7 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7);
                    if (rg_JieDian7 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = 0;
                        }
                        if (rg_JieDian7.getChildCount() == 2)
                        {
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian7, 1).getText()).equals ("微信红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian7);
                                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) >= 1840)
            {
                rg_GenLieBiao1 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mm:id/auf");
                if (rg_GenLieBiao1 != null && rg_GenLieBiao1.size () > 0)
                {
                    rg_JieDian7 = rg_GenLieBiao1.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7);
                    if (rg_JieDian7 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 <= rg_GenLieBiao1.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = 0;
                        }
                        if (rg_JieDian7.getChildCount() == 2 || rg_JieDian7.getChildCount() == 3)
                        {
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian7, 1).getText()).equals ("微信红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian7);
                                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_QiangGongBaoRenWuLei rg_QuRenWuDuiXiang7 () {
        if (rg_RenWuDuiXiang10 == null)
        {
            rg_RenWuDuiXiang10 = new rg_QiangGongBaoRenWuLei ();
        }
        return (rg_RenWuDuiXiang10);
    }
}
