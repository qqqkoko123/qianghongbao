
package com.qqq.WXhongbao;

public class rg_ZFBGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_ZFBGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi15;
    protected static rg_ZFBGongBaoKaiJieMian rg_RenWuDuiXiang17;
    protected String rg_ZFBGongBaoKaiJieMianChuangKouLeiMing = "com.alipay.android.phone.discovery.envelope.get.SnsCouponDetailActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang87) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang87);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang87.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang87.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang87.getClassName()), "com.alipay.mobile.nebulax.xriver.activity.XRiverActivity", false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi15 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi15.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = true;
            rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = false;
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang87.getClassName()), rg_ZFBGongBaoKaiJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang87.getClassName()), "com.alipay.mobile.framework.app.ui.DialogHelper$APGenericProgressDialog", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao8;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian17;
            android.graphics.Rect rg_ZuoBiao8 = new android.graphics.Rect ();
            rg_JieDian17 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingLeiMingChaZhaoJieDian ("android.widget.ImageView", null);
            if (rg_JieDian17 != null)
            {
                rg_ChanJiJieDian1 (rg_JieDian17);
                if (rg_MoNiCaoZuoShiJianFaSongQi15 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi15.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = false;
            }
            else
            {
                if (rg_MoNiCaoZuoShiJianFaSongQi15 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi15.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBGongBaoKaiJieMian rg_QuRenWuDuiXiang14 () {
        if (rg_RenWuDuiXiang17 == null)
        {
            rg_RenWuDuiXiang17 = new rg_ZFBGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang17);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong14 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang17) {
        rg_MoNiCaoZuoShiJianFaSongQi15 = rg_JieShouDuiXiang17;
    }
}
