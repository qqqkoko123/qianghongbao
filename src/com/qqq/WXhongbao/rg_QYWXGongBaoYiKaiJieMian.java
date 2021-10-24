
package com.qqq.WXhongbao;

public class rg_QYWXGongBaoYiKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QYWXGongBaoYiKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi6;
    protected static rg_QYWXGongBaoYiKaiJieMian rg_RenWuDuiXiang8;
    protected String rg_QYWXGongBaoYiKaiJieMianChuangKouLeiMing = "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeDetailWithCoverActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang75) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang75);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang75.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang75.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang75.getClassName()), rg_QYWXGongBaoYiKaiJieMianChuangKouLeiMing, false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
            rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
            rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang75.getClassName()), "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeDetailWithCoverActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao2;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian2;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian6;
            String [] rg_WeiXinBanBenXinXi2;
            String rg_WeiXinBanBenHao2 = "0";
            rg_WeiXinBanBenXinXi2 = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi2.length == 2)
            {
                rg_WeiXinBanBenHao2 = rg_WeiXinBanBenXinXi2 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao2) == 17946)
            {
                rg_AnNiuJieDianLieBiao2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/ggt", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao2 != null && rg_AnNiuJieDianLieBiao2.size () > 0)
                {
                    rg_AnNiuJieDian2 = rg_AnNiuJieDianLieBiao2.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian2, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    rg_AnNiuJieDianLieBiao2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/g0h", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    if (rg_AnNiuJieDianLieBiao2 != null && rg_AnNiuJieDianLieBiao2.size () > 0)
                    {
                        rg_AnNiuJieDian2 = rg_AnNiuJieDianLieBiao2.get (0);
                        huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian2, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                    }
                    else
                    {
                        if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXGongBaoYiKaiJieMian rg_QuRenWuDuiXiang6 () {
        if (rg_RenWuDuiXiang8 == null)
        {
            rg_RenWuDuiXiang8 = new rg_QYWXGongBaoYiKaiJieMian ();
        }
        return (rg_RenWuDuiXiang8);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong6 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang9) {
        rg_MoNiCaoZuoShiJianFaSongQi6 = rg_JieShouDuiXiang9;
    }
}
