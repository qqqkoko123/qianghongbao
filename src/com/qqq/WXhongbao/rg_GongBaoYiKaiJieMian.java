
package com.qqq.WXhongbao;

public class rg_GongBaoYiKaiJieMian extends rg_RenWuJiChuLei {

    public rg_GongBaoYiKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi12;
    protected static rg_GongBaoYiKaiJieMian rg_RenWuDuiXiang14;
    protected String rg_GongBaoYiKaiJieMianChuangKouLeiMing1 = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang84) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang84);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang84.getPackageName()), rg_ChengXuGongJuLei.rg_WeiXinBaoMing, false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang84.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang84.getClassName()), rg_GongBaoYiKaiJieMianChuangKouLeiMing1, false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
            rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
            rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang84.getClassName()), "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao4;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian4;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian14;
            String [] rg_WeiXinBanBenXinXi4;
            String rg_WeiXinBanBenHao4 = "0";
            rg_WeiXinBanBenXinXi4 = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi (rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
            if (rg_WeiXinBanBenXinXi4.length == 2)
            {
                rg_WeiXinBanBenHao4 = rg_WeiXinBanBenXinXi4 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) < 1840)
            {
                rg_AnNiuJieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/den", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao4 != null && rg_AnNiuJieDianLieBiao4.size () > 0)
                {
                    rg_AnNiuJieDian4 = rg_AnNiuJieDianLieBiao4.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (400);
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) >= 1840 && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) < 2040 || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_WeiXinBanBenXinXi4 [0], "8.0.16", false))
            {
                rg_AnNiuJieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/f4f", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao4 != null && rg_AnNiuJieDianLieBiao4.size () > 0)
                {
                    rg_AnNiuJieDian4 = rg_AnNiuJieDianLieBiao4.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                    android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian2;
                    android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian2;
                    java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_BianJiKuangFuJieDian;
                    int rg_BianJiKuangJieDianShu;
                    rg_BianJiKuangFuJieDian = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/auj", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    rg_BianJiKuangJieDianShu = rg_BianJiKuangFuJieDian.size ();
                    rg_BianJiKuangJieDian2 = rg_BianJiKuangFuJieDian.get (1);
                    if (rg_BianJiKuangJieDian2 != null && rg_QiDongLei.rg_WeiXinShiFouGanXieLaoBan == true)
                    {
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_BianJiKuangJieDian2);
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiRuJieDianNeiRong (rg_BianJiKuangJieDian2, rg_QiDongLei.rg_HuiFuNeiRong);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                        rg_FaSongAnNiuJieDian2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mm:id/ay5", null);
                        if (rg_FaSongAnNiuJieDian2 != null)
                        {
                            rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian2);
                        }
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) >= 2040 && huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_WeiXinBanBenXinXi4 [0], "8.0.16", false) == false)
            {
                rg_AnNiuJieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/giq", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao4 != null && rg_AnNiuJieDianLieBiao4.size () > 0)
                {
                    rg_AnNiuJieDian4 = rg_AnNiuJieDianLieBiao4.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                    android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian3;
                    android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian3;
                    java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_BianJiKuangFuJieDian1;
                    int rg_BianJiKuangJieDianShu1;
                    rg_BianJiKuangFuJieDian1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/b4a", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    rg_BianJiKuangJieDianShu1 = rg_BianJiKuangFuJieDian1.size ();
                    rg_BianJiKuangJieDian3 = rg_BianJiKuangFuJieDian1.get (1);
                    if (rg_BianJiKuangJieDian3 != null && rg_QiDongLei.rg_WeiXinShiFouGanXieLaoBan == true)
                    {
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_BianJiKuangJieDian3);
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiRuJieDianNeiRong (rg_BianJiKuangJieDian3, rg_QiDongLei.rg_HuiFuNeiRong);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                        rg_FaSongAnNiuJieDian3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mm:id/b8k", null);
                        if (rg_FaSongAnNiuJieDian3 != null)
                        {
                            rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian3);
                        }
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi12 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi12.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang12 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_GongBaoYiKaiJieMian rg_QuRenWuDuiXiang11 () {
        if (rg_RenWuDuiXiang14 == null)
        {
            rg_RenWuDuiXiang14 = new rg_GongBaoYiKaiJieMian ();
        }
        return (rg_RenWuDuiXiang14);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong11 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang14) {
        rg_MoNiCaoZuoShiJianFaSongQi12 = rg_JieShouDuiXiang14;
    }
}
