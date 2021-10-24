
package com.qqq.WXhongbao;

public class rg_QQGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QQGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi3;
    protected static rg_QQGongBaoKaiJieMian rg_RenWuDuiXiang5;
    protected String rg_GongBaoYiKaiJieMianChuangKouLeiMing = "";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang72) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang72);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getPackageName()), "com.tencent.mobileqq", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang72.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getClassName()), "cooperation.qwallet.plugin.QWalletPluginProxyActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian3;
            rg_AnNiuJieDianLieBiao = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mobileqq:id/qm_", rg_FuWuDuiXiang3.getRootInActiveWindow ());
            if (rg_AnNiuJieDianLieBiao != null && rg_AnNiuJieDianLieBiao.size () > 0)
            {
                rg_AnNiuJieDian = rg_AnNiuJieDianLieBiao.get (0);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                if (rg_MoNiCaoZuoShiJianFaSongQi3 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi3.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                if (rg_MoNiCaoZuoShiJianFaSongQi3 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi3.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian1;
                android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian1;
                rg_BianJiKuangJieDian1 = rg_ZhiDingIDChaZhaoShouJieDian ("com.tencent.mobileqq:id/input");
                rg_FaSongAnNiuJieDian1 = rg_ZhiDingIDChaZhaoShouJieDian ("com.tencent.mobileqq:id/fun_btn");
                if (rg_BianJiKuangJieDian1 != null)
                {
                    rg_ZhiZhiDingJieDianNeiRong (rg_BianJiKuangJieDian1, "感谢老板");
                    rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian1);
                }
                rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
            }
            else
            {
                if (rg_MoNiCaoZuoShiJianFaSongQi3 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi3.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                    rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_QQGongBaoKaiJieMian rg_QuRenWuDuiXiang3 () {
        if (rg_RenWuDuiXiang5 == null)
        {
            rg_RenWuDuiXiang5 = new rg_QQGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang5);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong3 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang6) {
        rg_MoNiCaoZuoShiJianFaSongQi3 = rg_JieShouDuiXiang6;
    }
}
