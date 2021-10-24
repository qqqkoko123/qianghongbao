
package com.qqq.WXhongbao;

public class rg_GongBaoYiKaiJieMian extends rg_RenWuJiChuLei {

    public rg_GongBaoYiKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi8;
    protected static rg_GongBaoYiKaiJieMian rg_RenWuDuiXiang11;
    protected String rg_GongBaoYiKaiJieMianChuangKouLeiMing1 = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang79) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang79);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang79.getPackageName()), rg_ChengXuGongJuLei.rg_WeiXinBaoMing, false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang79.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang79.getClassName()), rg_GongBaoYiKaiJieMianChuangKouLeiMing1, false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
            rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
            rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang79.getClassName()), "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao3;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian3;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian8;
            String [] rg_WeiXinBanBenXinXi4;
            String rg_WeiXinBanBenHao4 = "0";
            rg_WeiXinBanBenXinXi4 = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi (rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
            if (rg_WeiXinBanBenXinXi4.length == 2)
            {
                rg_WeiXinBanBenHao4 = rg_WeiXinBanBenXinXi4 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) < 1840)
            {
                rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/den", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                {
                    rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (400);
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao4) >= 1840)
            {
                rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/f4f", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                {
                    rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                    android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian2;
                    android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian2;
                    java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_BianJiKuangFuJieDian;
                    int rg_BianJiKuangJieDianShu;
                    rg_BianJiKuangFuJieDian = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/auj", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    rg_BianJiKuangJieDianShu = rg_BianJiKuangFuJieDian.size ();
                    rg_BianJiKuangJieDian2 = rg_BianJiKuangFuJieDian.get (1);
                    if (rg_BianJiKuangJieDian2 != null)
                    {
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_BianJiKuangJieDian2);
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiRuJieDianNeiRong (rg_BianJiKuangJieDian2, "感谢老板");
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                        rg_FaSongAnNiuJieDian2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mm:id/ay5", null);
                        if (rg_FaSongAnNiuJieDian2 != null)
                        {
                            rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian2);
                        }
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_GongBaoYiKaiJieMian rg_QuRenWuDuiXiang8 () {
        if (rg_RenWuDuiXiang11 == null)
        {
            rg_RenWuDuiXiang11 = new rg_GongBaoYiKaiJieMian ();
        }
        return (rg_RenWuDuiXiang11);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong8 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang11) {
        rg_MoNiCaoZuoShiJianFaSongQi8 = rg_JieShouDuiXiang11;
    }
}
