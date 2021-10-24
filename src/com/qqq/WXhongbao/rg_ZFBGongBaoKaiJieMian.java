
package com.qqq.WXhongbao;

public class rg_ZFBGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_ZFBGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi11;
    protected static rg_ZFBGongBaoKaiJieMian rg_RenWuDuiXiang14;
    protected String rg_ZFBGongBaoKaiJieMianChuangKouLeiMing = "com.alipay.android.phone.discovery.envelope.get.SnsCouponDetailActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang82) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang82);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang82.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang82.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang82.getClassName()), rg_ZFBGongBaoKaiJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang82.getClassName()), "com.alipay.mobile.framework.app.ui.DialogHelper$APGenericProgressDialog", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao8;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian11;
            android.graphics.Rect rg_ZuoBiao1 = new android.graphics.Rect ();
            rg_JieDian11 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingZiNeiRongMiaoShuChaZhaoJieDian ("拆红包", null);
            if (rg_JieDian11 != null)
            {
                rg_ChanJiJieDian1 (rg_JieDian11);
                if (rg_MoNiCaoZuoShiJianFaSongQi11 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi11.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
            }
            else
            {
                if (rg_MoNiCaoZuoShiJianFaSongQi11 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi11.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBGongBaoKaiJieMian rg_QuRenWuDuiXiang11 () {
        if (rg_RenWuDuiXiang14 == null)
        {
            rg_RenWuDuiXiang14 = new rg_ZFBGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang14);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong11 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang14) {
        rg_MoNiCaoZuoShiJianFaSongQi11 = rg_JieShouDuiXiang14;
    }
}
