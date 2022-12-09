
package com.qqq.WXhongbao;

public class rg_DYGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_DYGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi3;
    protected static rg_DYGongBaoKaiJieMian rg_RenWuDuiXiang5;
    protected String rg_DYGongBaoKaiJieMianChuangKouLeiMing = "com.ss.android.ugc.aweme.im.sdk.redpacket.RedPacketReceiveActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang74) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang74);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang74.getPackageName()), "com.ss.android.ugc.aweme", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang74.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang74.getClassName()), rg_DYGongBaoKaiJieMianChuangKouLeiMing, false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian7;
            rg_AnNiuJieDianLieBiao = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.ss.android.ugc.aweme:id/d=", null);
            if (rg_AnNiuJieDianLieBiao != null && rg_AnNiuJieDianLieBiao.size () > 0)
            {
                rg_AnNiuJieDian = rg_AnNiuJieDianLieBiao.get (0);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                if (rg_MoNiCaoZuoShiJianFaSongQi3 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi3.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_DYQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                rg_DYGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
                rg_DYGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
            }
            else
            {
                if (rg_MoNiCaoZuoShiJianFaSongQi3 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi3.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    rg_DYQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                    rg_DYGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = false;
                    rg_DYGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_DYGongBaoKaiJieMian rg_QuRenWuDuiXiang3 () {
        if (rg_RenWuDuiXiang5 == null)
        {
            rg_RenWuDuiXiang5 = new rg_DYGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang5);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong3 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang6) {
        rg_MoNiCaoZuoShiJianFaSongQi3 = rg_JieShouDuiXiang6;
    }
}
