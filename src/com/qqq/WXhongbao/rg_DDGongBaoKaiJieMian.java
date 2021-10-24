
package com.qqq.WXhongbao;

public class rg_DDGongBaoKaiJieMian extends rg_RenWuJiChuLei {

    public rg_DDGongBaoKaiJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi1;
    protected static rg_DDGongBaoKaiJieMian rg_RenWuDuiXiang3;
    protected String rg_DDGongBaoKaiJieMianChuangKouLeiMing = "com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang70) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang70);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang70.getPackageName()), "com.alibaba.android.rimet", false) == false)
        {
            return;
        }
        if (rg_ShiJianDuiXiang70.getEventType() != huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_ChuangKouZhuangTaiGaiBian)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang70.getClassName()), rg_DDGongBaoKaiJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang70.getClassName()), "com.toshiba_dealin.developerhelper.ui.activity.HierarchyActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao3;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian1;
            rg_JieDian1 = rg_ZhiDingIDChaZhaoShouJieDian ("com.alibaba.android.rimet:id/iv_pick");
            if (rg_JieDian1 != null)
            {
                rg_ChanJiJieDian1 (rg_JieDian1);
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                if (rg_MoNiCaoZuoShiJianFaSongQi1 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi1.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
                rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
                huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
            }
            else
            {
                if (rg_MoNiCaoZuoShiJianFaSongQi1 != null)
                {
                    rg_MoNiCaoZuoShiJianFaSongQi1.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                }
                rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
                rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
            }
        }
        else if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang70.getClassName()), "com.alibaba.android.dingtalk.redpackets.activities.RedPacketsDetailActivity", false))
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
