
package com.qqq.WXhongbao;

public class rg_QYWXGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QYWXGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi5;
    protected static rg_QYWXGongBaoKaiJieMian rg_RenWuDuiXiang7;
    protected String rg_QYWXGongBaoKaiJieMianChuangKouLeiMing = "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeCollectorWithCoverActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang74) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang74);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang74.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang74.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang74.getClassName()), rg_QYWXGongBaoKaiJieMianChuangKouLeiMing, false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao1;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian1;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian5;
            String [] rg_WeiXinBanBenXinXi1;
            String rg_WeiXinBanBenHao1 = "0";
            rg_WeiXinBanBenXinXi1 = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi1.length == 2)
            {
                rg_WeiXinBanBenHao1 = rg_WeiXinBanBenXinXi1 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao1) == 17946)
            {
                rg_AnNiuJieDianLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/ggt", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao1 != null && rg_AnNiuJieDianLieBiao1.size () > 0)
                {
                    rg_AnNiuJieDian1 = rg_AnNiuJieDianLieBiao1.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian1, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi5 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi5.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi5 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi5.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXGongBaoKaiJieMian rg_QuRenWuDuiXiang5 () {
        if (rg_RenWuDuiXiang7 == null)
        {
            rg_RenWuDuiXiang7 = new rg_QYWXGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang7);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong5 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang8) {
        rg_MoNiCaoZuoShiJianFaSongQi5 = rg_JieShouDuiXiang8;
    }
}
