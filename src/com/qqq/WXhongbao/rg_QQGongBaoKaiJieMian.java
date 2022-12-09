
package com.qqq.WXhongbao;

public class rg_QQGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_QQGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi6;
    protected static rg_QQGongBaoKaiJieMian rg_RenWuDuiXiang8;
    protected String rg_GongBaoYiKaiJieMianChuangKouLeiMing = "";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang77) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang77);
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.valueOf(rg_ShiJianDuiXiang77.getClassName()));
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang77.getPackageName()), "com.tencent.mobileqq", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang77.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang77.getClassName()), "cooperation.qwallet.plugin.QWalletPluginProxyActivity", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang77.getClassName()), "com.toshiba_dealin.developerhelper.ui.activity.HierarchyActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_AnNiuJieDianLieBiao1;
            android.view.accessibility.AccessibilityNodeInfo rg_AnNiuJieDian1;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian9;
            String [] rg_QQBanBenXinXi1;
            String rg_QQBanBenMingChen1 = "";
            rg_QQBanBenXinXi1 = com.wuliguanhua.floating.rg_YingYongCaoZuoLei.rg_QuYingYongBanBenXinXi ("com.tencent.mobileqq");
            if (rg_QQBanBenXinXi1.length == 2)
            {
                rg_QQBanBenMingChen1 = rg_QQBanBenXinXi1 [0];
            }
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_QQBanBenMingChen1, "8.9.23", false))
            {
                rg_AnNiuJieDianLieBiao1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDianLieBiao ("com.tencent.mobileqq:id/u0h", rg_FuWuDuiXiang3.getRootInActiveWindow ());
                if (rg_AnNiuJieDianLieBiao1 != null && rg_AnNiuJieDianLieBiao1.size () > 0)
                {
                    rg_AnNiuJieDian1 = rg_AnNiuJieDianLieBiao1.get (0);
                    huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_AnNiuJieDian1, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null);
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (450);
                    if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                    if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                    android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian1;
                    android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian1;
                    rg_BianJiKuangJieDian1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mobileqq:id/input", null);
                    rg_FaSongAnNiuJieDian1 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.tencent.mobileqq:id/fun_btn", null);
                    if (rg_BianJiKuangJieDian1 != null && rg_QiDongLei.rg_QQShiFouGanXieLaoBan == true)
                    {
                        rg_ZhiZhiDingJieDianNeiRong (rg_BianJiKuangJieDian1, rg_QiDongLei.rg_HuiFuNeiRong);
                        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiJieDian (rg_FaSongAnNiuJieDian1);
                    }
                    rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = true;
                    rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi6 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi6.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = true;
                        rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QQGongBaoKaiJieMian rg_QuRenWuDuiXiang6 () {
        if (rg_RenWuDuiXiang8 == null)
        {
            rg_RenWuDuiXiang8 = new rg_QQGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang8);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong6 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang9) {
        rg_MoNiCaoZuoShiJianFaSongQi6 = rg_JieShouDuiXiang9;
    }
}
