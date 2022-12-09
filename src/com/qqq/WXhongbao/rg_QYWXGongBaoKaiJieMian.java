
package com.qqq.WXhongbao;

public class rg_QYWXGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QYWXGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi8;
    protected static rg_QYWXGongBaoKaiJieMian rg_RenWuDuiXiang10;
    protected String rg_QYWXGongBaoKaiJieMianChuangKouLeiMing = "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeCollectorWithCoverActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang79) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang79);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang79.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang79.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang79.getClassName()), rg_QYWXGongBaoKaiJieMianChuangKouLeiMing, false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao2;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian2;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian11;
            String [] rg_WeiXinBanBenXinXi1;
            String rg_WeiXinBanBenHao1 = "0";
            rg_WeiXinBanBenXinXi1 = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi1.length == 2)
            {
                rg_WeiXinBanBenHao1 = rg_WeiXinBanBenXinXi1 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao1) == 17946)
            {
                rg_AnNiuJieDianLieBiao2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/ggt", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao2 != null && rg_AnNiuJieDianLieBiao2.size () > 0)
                {
                    rg_AnNiuJieDian2 = rg_AnNiuJieDianLieBiao2.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian2, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao1) == 18722)
            {
                rg_AnNiuJieDianLieBiao2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/hl5", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao2 != null && rg_AnNiuJieDianLieBiao2.size () > 0)
                {
                    rg_AnNiuJieDian2 = rg_AnNiuJieDianLieBiao2.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian2, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao1) >= 20360)
            {
                rg_AnNiuJieDianLieBiao2 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/idc", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao2 != null && rg_AnNiuJieDianLieBiao2.size () > 0)
                {
                    rg_AnNiuJieDian2 = rg_AnNiuJieDianLieBiao2.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian2, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi8 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi8.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXGongBaoKaiJieMian rg_QuRenWuDuiXiang8 () {
        if (rg_RenWuDuiXiang10 == null)
        {
            rg_RenWuDuiXiang10 = new rg_QYWXGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang10);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong8 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang11) {
        rg_MoNiCaoZuoShiJianFaSongQi8 = rg_JieShouDuiXiang11;
    }
}
