
package com.qqq.WXhongbao;

public class rg_QiangGongBaoRenWuLei extends rg_RenWuJiChuLei {

    public rg_QiangGongBaoRenWuLei ()  { }

    protected static rg_QiangGongBaoRenWuLei rg_RenWuDuiXiang13;
    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi11;
    protected String rg_ShouYeChuangKouLeiMing2 = "com.tencent.mm.ui.LauncherUI";

    public static void rg_ChuShiHuaMoNiShiJianFaSong10 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang13) {
        rg_MoNiCaoZuoShiJianFaSongQi11 = rg_JieShouDuiXiang13;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang83) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang83);
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf(rg_ShiJianDuiXiang83.getClassName()));
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf (rg_QiYongZhuangTai3));
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang83.getPackageName()), rg_ChengXuGongJuLei.rg_WeiXinBaoMing, false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang83.getClassName()), rg_ShouYeChuangKouLeiMing2, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang83.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang83.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_GenLieBiao2;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian13;
            String [] rg_WeiXinBanBenXinXi3;
            String rg_WeiXinBanBenHao3 = "0";
            rg_WeiXinBanBenXinXi3 = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi (rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
            if (rg_WeiXinBanBenXinXi3.length == 2)
            {
                rg_WeiXinBanBenHao3 = rg_WeiXinBanBenXinXi3 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) < 1840)
            {
                rg_GenLieBiao2 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mm:id/al7");
                if (rg_GenLieBiao2 != null && rg_GenLieBiao2.size () > 0)
                {
                    rg_JieDian13 = rg_GenLieBiao2.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7);
                    if (rg_JieDian13 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 <= rg_GenLieBiao2.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = 0;
                        }
                        if (rg_JieDian13.getChildCount() == 2)
                        {
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian13, 1).getText()).equals ("微信红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian13);
                                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) >= 1840 && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) < 2040 || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_WeiXinBanBenXinXi3 [0], "8.0.16", false))
            {
                rg_GenLieBiao2 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mm:id/auf");
                if (rg_GenLieBiao2 != null && rg_GenLieBiao2.size () > 0)
                {
                    rg_JieDian13 = rg_GenLieBiao2.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7);
                    if (rg_JieDian13 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 <= rg_GenLieBiao2.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = 0;
                        }
                        if (rg_JieDian13.getChildCount() == 2 || rg_JieDian13.getChildCount() == 3)
                        {
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian13, 1).getText()).equals ("微信红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian13);
                                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (rg_QiDongLei.rg_YanShi8);
                                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao3) >= 2040 && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_WeiXinBanBenXinXi3 [0], "8.0.16", false) == false)
            {
                rg_GenLieBiao2 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mm:id/b47");
                if (rg_GenLieBiao2 != null && rg_GenLieBiao2.size () > 0)
                {
                    rg_JieDian13 = rg_GenLieBiao2.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7);
                    if (rg_JieDian13 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 <= rg_GenLieBiao2.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYin7 = 0;
                        }
                        if (rg_JieDian13.getChildCount() == 2 || rg_JieDian13.getChildCount() == 3)
                        {
                            if (String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian13, 1).getText()).equals ("微信红包"))
                            {
                                rg_ChanJiJieDian1 (rg_JieDian13);
                                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (rg_QiDongLei.rg_YanShi8);
                                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = true;
                            }
                        }
                    }
                }
                else
                {
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_QiangGongBaoRenWuLei rg_QuRenWuDuiXiang10 () {
        if (rg_RenWuDuiXiang13 == null)
        {
            rg_RenWuDuiXiang13 = new rg_QiangGongBaoRenWuLei ();
        }
        return (rg_RenWuDuiXiang13);
    }
}
