
package com.qqq.WXhongbao;

public class rg_DYGongBaoYiKaiJieMian extends rg_RenWuJiChuLei {

    public rg_DYGongBaoYiKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi4;
    protected static rg_DYGongBaoYiKaiJieMian rg_RenWuDuiXiang6;
    protected String rg_DYGongBaoYiKaiJieMianChuangKouLeiMing = "com.ss.android.ugc.aweme.im.sdk.redpacket.RedPacketReceiveActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang75) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang75);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang75.getPackageName()), "com.ss.android.ugc.aweme", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang75.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang75.getClassName()), rg_DYGongBaoYiKaiJieMianChuangKouLeiMing, false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi4 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi4.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_DYQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
            rg_DYGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
            rg_DYGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
        }
        return;
    }

    public static synchronized rg_DYGongBaoYiKaiJieMian rg_QuRenWuDuiXiang4 () {
        if (rg_RenWuDuiXiang6 == null)
        {
            rg_RenWuDuiXiang6 = new rg_DYGongBaoYiKaiJieMian ();
        }
        return (rg_RenWuDuiXiang6);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong4 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang7) {
        rg_MoNiCaoZuoShiJianFaSongQi4 = rg_JieShouDuiXiang7;
    }
}
