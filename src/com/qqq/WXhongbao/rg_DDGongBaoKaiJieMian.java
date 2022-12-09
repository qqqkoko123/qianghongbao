
package com.qqq.WXhongbao;

public class rg_DDGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_DDGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi1;
    protected static rg_DDGongBaoKaiJieMian rg_RenWuDuiXiang3;
    protected String rg_DDGongBaoKaiJieMianChuangKouLeiMing = "com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang72) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang72);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getPackageName()), "com.alibaba.android.rimet", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang72.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getClassName()), rg_DDGongBaoKaiJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getClassName()), "com.toshiba_dealin.developerhelper.ui.activity.HierarchyActivity", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getClassName()), "com.alibaba.android.dingtalk.redpackets.activities.ThemeRedPacketsPickActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao3;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian4;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian5;
            android.graphics.Rect rg_GongBaoKaiJieMianFanWei = new android.graphics.Rect ();
            int rg_HengZuoBiao50;
            int rg_ZongZuoBiao49;
            rg_JieDian4 = anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ZhiDingIDChaZhaoJieDian ("com.alibaba.android.rimet:id/rl_content", null);
            if (rg_JieDian4 != null)
            {
                rg_JieDian4.getBoundsInScreen(rg_GongBaoKaiJieMianFanWei);
                rg_HengZuoBiao50 = (rg_GongBaoKaiJieMianFanWei.right - rg_GongBaoKaiJieMianFanWei.left) / 2 + rg_GongBaoKaiJieMianFanWei.left;
                rg_ZongZuoBiao49 = rg_GongBaoKaiJieMianFanWei.bottom - (rg_GongBaoKaiJieMianFanWei.bottom - rg_GongBaoKaiJieMianFanWei.top) / 3;
                anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChanJiZuoBiao (rg_HengZuoBiao50, rg_ZongZuoBiao49);
            }
            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
            if (rg_MoNiCaoZuoShiJianFaSongQi1 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi1.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
            rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang72.getClassName()), "com.alibaba.android.dingtalk.redpackets.activities.RedPacketsDetailActivity", false))
        {
            if (rg_MoNiCaoZuoShiJianFaSongQi1 != null)
            {
                rg_MoNiCaoZuoShiJianFaSongQi1.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
            }
            rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
            rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
            huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
        }
        return;
    }

    public static synchronized rg_DDGongBaoKaiJieMian rg_QuRenWuDuiXiang1 () {
        if (rg_RenWuDuiXiang3 == null)
        {
            rg_RenWuDuiXiang3 = new rg_DDGongBaoKaiJieMian ();
        }
        return (rg_RenWuDuiXiang3);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong1 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang4) {
        rg_MoNiCaoZuoShiJianFaSongQi1 = rg_JieShouDuiXiang4;
    }
}
