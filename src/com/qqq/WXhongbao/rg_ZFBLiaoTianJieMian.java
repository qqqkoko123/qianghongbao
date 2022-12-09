
package com.qqq.WXhongbao;

public class rg_ZFBLiaoTianJieMian extends rg_RenWuJiChuLei {

    public rg_ZFBLiaoTianJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi14;
    protected static rg_ZFBLiaoTianJieMian rg_RenWuDuiXiang16;
    protected String rg_ZFBLiaoTianJieMianChuangKouLeiMing = "com.alipay.mobile.chatapp.ui.GroupChatMsgActivity_";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang86) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang86);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang86.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang86.getClassName()), rg_ZFBLiaoTianJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang86.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang86.getClassName()), "android.widget.FrameLayout", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang86.getClassName()), "android.app.AlertDialog", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao7;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian16;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian1;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian2;
            android.view.accessibility.AccessibilityNodeInfo rg_ZiJieDian3;
            int rg_ChengYuanShu30;
            android.graphics.Rect rg_ZuoBiao7 = new android.graphics.Rect ();
            rg_JieDianLieBiao7 = (rg_FuWuDuiXiang3.getRootInActiveWindow ().findAccessibilityNodeInfosByText("查看红包"));
            rg_ChengYuanShu30 = rg_JieDianLieBiao7.size ();
            if (rg_JieDianLieBiao7 != null && rg_JieDianLieBiao7.size () > 0)
            {
                rg_JieDian16 = rg_JieDianLieBiao7.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb);
                if (rg_JieDian16 != null)
                {
                    if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb <= rg_JieDianLieBiao7.size () - 2)
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb + 1;
                    }
                    else
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinzfb = 0;
                    }
                    rg_ChanJiJieDian1 (rg_JieDian16.getParent());
                    huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (500);
                    rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = false;
                    rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = true;
                }
                else
                {
                    if (rg_MoNiCaoZuoShiJianFaSongQi14 != null)
                    {
                        rg_MoNiCaoZuoShiJianFaSongQi14.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                    }
                    rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = true;
                    rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = false;
                }
            }
            else
            {
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang13 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang14 ().rg_QiYongZhuangTai3 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBLiaoTianJieMian rg_QuRenWuDuiXiang13 () {
        if (rg_RenWuDuiXiang16 == null)
        {
            rg_RenWuDuiXiang16 = new rg_ZFBLiaoTianJieMian ();
        }
        return (rg_RenWuDuiXiang16);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong13 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang16) {
        rg_MoNiCaoZuoShiJianFaSongQi14 = rg_JieShouDuiXiang16;
    }
}
