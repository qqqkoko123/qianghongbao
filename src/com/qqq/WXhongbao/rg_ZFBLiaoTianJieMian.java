
package com.qqq.WXhongbao;

public class rg_ZFBLiaoTianJieMian extends rg_RenWuJiChuLei {

    public rg_ZFBLiaoTianJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi10;
    protected static rg_ZFBLiaoTianJieMian rg_RenWuDuiXiang13;
    protected String rg_ZFBLiaoTianJieMianChuangKouLeiMing = "com.alipay.mobile.chatapp.ui.GroupChatMsgActivity_";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang81) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang81);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang81.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang81.getClassName()), rg_ZFBLiaoTianJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang81.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang81.getClassName()), "android.widget.FrameLayout", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang81.getClassName()), "android.app.AlertDialog", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao7;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian10;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian1;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian2;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian3;
            int rg_ChengYuanShu27;
            android.graphics.Rect rg_ZuoBiao = new android.graphics.Rect ();
            rg_JieDianLieBiao7 = (rg_FuWuDuiXiang3.getRootInActiveWindow ().findAccessibilityNodeInfosByText("查看红包"));
            rg_ChengYuanShu27 = rg_JieDianLieBiao7.size ();
            if (rg_JieDianLieBiao7 != null && rg_JieDianLieBiao7.size () > 0)
            {
                rg_JieDian10 = rg_JieDianLieBiao7.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb);
                if (rg_JieDian10 != null)
                {
                    if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb <= rg_JieDianLieBiao7.size () - 2)
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb + 1;
                    }
                    else
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb = 0;
                    }
                    rg_ChanJiJieDian1 (rg_JieDian10.getParent());
                    rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = false;
                    rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = true;
                }
            }
            else
            {
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBLiaoTianJieMian rg_QuRenWuDuiXiang10 () {
        if (rg_RenWuDuiXiang13 == null)
        {
            rg_RenWuDuiXiang13 = new rg_ZFBLiaoTianJieMian ();
        }
        return (rg_RenWuDuiXiang13);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong10 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang13) {
        rg_MoNiCaoZuoShiJianFaSongQi10 = rg_JieShouDuiXiang13;
    }
}
