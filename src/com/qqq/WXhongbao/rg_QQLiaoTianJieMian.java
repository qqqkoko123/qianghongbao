
package com.qqq.WXhongbao;

public class rg_QQLiaoTianJieMian extends rg_RenWuJiChuLei {

    public rg_QQLiaoTianJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi5;
    protected static rg_QQLiaoTianJieMian rg_RenWuDuiXiang7;
    protected String rg_QQLiaoTianJieMianChuangKouLeiMing = "com.tencent.mobileqq.activity.ChatActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang76) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getPackageName()), "com.tencent.mobileqq", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), rg_QQLiaoTianJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), "android.widget.FrameLayout", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), "android.widget.AbsListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), "com.tencent.mobileqq.activity.SplashActivity", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang76.getClassName()), "android.inputmethodservice.SoftInputWindow", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao4;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian8;
            String [] rg_QQBanBenXinXi;
            String rg_QQBanBenMingChen = "";
            rg_QQBanBenXinXi = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.mobileqq");
            if (rg_QQBanBenXinXi.length == 2)
            {
                rg_QQBanBenMingChen = rg_QQBanBenXinXi [0];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_QQBanBenMingChen, "8.9.23", false))
            {
                rg_JieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mobileqq:id/tzx", null);
                if (rg_JieDianLieBiao4 != null && rg_JieDianLieBiao4.size () == 1)
                {
                    rg_JieDian8 = rg_JieDianLieBiao4.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq);
                    if (rg_JieDian8 != null && (String.valueOf(rg_JieDian8.getContentDescription()).contains ("口令:")))
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq <= rg_JieDianLieBiao4.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = 0;
                        }
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian_JiangZhi (rg_JieDian8);
                        android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian;
                        android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian;
                        android.view.accessibility.AccessibilityNodeInfo rg_NeiRongJieDian;
                        rg_BianJiKuangJieDian = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mobileqq:id/input", null);
                        rg_FaSongAnNiuJieDian = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mobileqq:id/fun_btn", null);
                        rg_NeiRongJieDian = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mobileqq:id/awh", null);
                        if (rg_NeiRongJieDian != null && rg_BianJiKuangJieDian != null && rg_FaSongAnNiuJieDian != null && rg_QiDongLei.rg_QQShiFouGanXieLaoBan == true)
                        {
                            anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_NeiRongJieDian);
                            anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_FaSongAnNiuJieDian);
                            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                            if (rg_MoNiCaoZuoShiJianFaSongQi5 != null)
                            {
                                rg_MoNiCaoZuoShiJianFaSongQi5.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                            }
                            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                            rg_ZhiZhiDingJieDianNeiRong (rg_BianJiKuangJieDian, rg_QiDongLei.rg_HuiFuNeiRong);
                            anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_FaSongAnNiuJieDian);
                        }
                        else
                        {
                            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                            if (rg_MoNiCaoZuoShiJianFaSongQi5 != null)
                            {
                                rg_MoNiCaoZuoShiJianFaSongQi5.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                            }
                        }
                    }
                    else if (rg_JieDian8 != null)
                    {
                        if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq <= rg_JieDianLieBiao4.size () - 2)
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq + 1;
                        }
                        else
                        {
                            rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = 0;
                        }
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian_JiangZhi (rg_JieDian8);
                        rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                        rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = true;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QQLiaoTianJieMian rg_QuRenWuDuiXiang5 () {
        if (rg_RenWuDuiXiang7 == null)
        {
            rg_RenWuDuiXiang7 = new rg_QQLiaoTianJieMian ();
        }
        return (rg_RenWuDuiXiang7);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong5 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang8) {
        rg_MoNiCaoZuoShiJianFaSongQi5 = rg_JieShouDuiXiang8;
    }
}
