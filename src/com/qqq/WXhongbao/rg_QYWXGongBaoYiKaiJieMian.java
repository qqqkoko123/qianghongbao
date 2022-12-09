
package com.qqq.WXhongbao;

public class rg_QYWXGongBaoYiKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QYWXGongBaoYiKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi9;
    protected static rg_QYWXGongBaoYiKaiJieMian rg_RenWuDuiXiang11;
    protected String rg_QYWXGongBaoYiKaiJieMianChuangKouLeiMing = "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeDetailWithCoverActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang80) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang80);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang80.getPackageName()), "com.tencent.wework", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang80.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang80.getClassName()), rg_QYWXGongBaoYiKaiJieMianChuangKouLeiMing, false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
            rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
            rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang80.getClassName()), "com.tencent.wework.enterprise.redenvelopes.controller.RedEnvelopeDetailWithCoverActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao3;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian3;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian12;
            String [] rg_WeiXinBanBenXinXi2;
            String rg_WeiXinBanBenHao2 = "0";
            rg_WeiXinBanBenXinXi2 = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.wework");
            if (rg_WeiXinBanBenXinXi2.length == 2)
            {
                rg_WeiXinBanBenHao2 = rg_WeiXinBanBenXinXi2 [1];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao2) == 17946)
            {
                rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/ggt", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                {
                    rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/g0h", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                    {
                        rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                        huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                    else
                    {
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao2) == 18722)
            {
                rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/hl5", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                {
                    rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/g0h", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                    {
                        rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                        huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                    else
                    {
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
            else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenDaoZhengShu (rg_WeiXinBanBenHao2) == 18808)
            {
                rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/hlw", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                {
                    rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                    rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                    rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    rg_AnNiuJieDianLieBiao3 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.wework:id/g0h", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                    if (rg_AnNiuJieDianLieBiao3 != null && rg_AnNiuJieDianLieBiao3.size () > 0)
                    {
                        rg_AnNiuJieDian3 = rg_AnNiuJieDianLieBiao3.get (0);
                        huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian3, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                    else
                    {
                        if (rg_MoNiCaoZuoShiJianFaSongQi9 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi9.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QYWXGongBaoYiKaiJieMian rg_QuRenWuDuiXiang9 () {
        if (rg_RenWuDuiXiang11 == null)
        {
            rg_RenWuDuiXiang11 = new rg_QYWXGongBaoYiKaiJieMian ();
        }
        return (rg_RenWuDuiXiang11);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong9 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang12) {
        rg_MoNiCaoZuoShiJianFaSongQi9 = rg_JieShouDuiXiang12;
    }
}
