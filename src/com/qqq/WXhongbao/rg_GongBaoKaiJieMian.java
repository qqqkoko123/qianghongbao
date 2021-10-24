
package com.qqq.WXhongbao;

public class rg_GongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_GongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi9;
    protected static rg_GongBaoKaiJieMian rg_RenWuDuiXiang12;
    protected String rg_GongBaoKaiJieMianChuangKouLeiMing = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang80) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang80);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang80.getPackageName()), rg_ChengXuGongJuLei.rg_WeiXinBaoMing, false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang80.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang80.getClassName()), rg_GongBaoKaiJieMianChuangKouLeiMing, false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao4;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian4;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian9;
            String [] rg_WeiXinBanBenXinXi5;
            String rg_WeiXinBanBenHao5 = "0";
            rg_WeiXinBanBenXinXi5 = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi (rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
            if (rg_WeiXinBanBenXinXi5.length == 2)
            {
                rg_WeiXinBanBenHao5 = rg_WeiXinBanBenXinXi5 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao5) < 1840)
            {
                rg_AnNiuJieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/den", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao4 != null && rg_AnNiuJieDianLieBiao4.size () > 0)
                {
                    rg_AnNiuJieDian4 = rg_AnNiuJieDianLieBiao4.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao5) >= 1840)
            {
                rg_AnNiuJieDianLieBiao4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mm:id/f4f", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao4 != null && rg_AnNiuJieDianLieBiao4.size () > 0)
                {
                    rg_AnNiuJieDian4 = rg_AnNiuJieDianLieBiao4.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (1000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_GongBaoKaiJieMian rg_QuRenWuDuiXiang9 () {
        if (rg_RenWuDuiXiang12 == null)
        {
            rg_RenWuDuiXiang12 = new rg_GongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang12);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong9 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang12) {
        rg_MoNiCaoZuoShiJianFaSongQi9 = rg_JieShouDuiXiang12;
    }
}
