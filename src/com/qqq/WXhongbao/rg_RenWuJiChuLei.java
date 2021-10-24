
package com.qqq.WXhongbao;

public class rg_RenWuJiChuLei {

    public rg_RenWuJiChuLei ()  { }

    public boolean rg_QiYongZhuangTai3;
    protected huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuLei rg_FuWuDuiXiang3;

    public void rg_ChuShiHuaRenWu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuLei rg_FuWu3) {
        rg_FuWuDuiXiang3 = rg_FuWu3;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang77) {
    }

    public android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingIDChaZhaoShouJieDian (String rg_ID44) {
        if (rg_FuWuDuiXiang3 == null)
        {
            throw new RuntimeException ("请先启用自动服务！");
        }
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao5;
        rg_JieDianLieBiao5 = (rg_FuWuDuiXiang3.getRootInActiveWindow ().findAccessibilityNodeInfosByViewId(rg_ID44));
        if (rg_JieDianLieBiao5 != null && rg_JieDianLieBiao5.size () > 0)
        {
            return (rg_JieDianLieBiao5.get (0));
        }
        return (null);
    }

    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_ZhiDingIDChaZhaoJieDianLieBiao1 (String rg_ID45) {
        if (rg_FuWuDuiXiang3 == null)
        {
            throw new RuntimeException ("请先启用自动服务！");
        }
        return (rg_FuWuDuiXiang3.getRootInActiveWindow ().findAccessibilityNodeInfosByViewId(rg_ID45));
    }

    public boolean rg_ChanJiJieDian1 (android.view.accessibility.AccessibilityNodeInfo rg_MuBiao5) {
        if (rg_MuBiao5 == null)
        {
            return (false);
        }
        while (rg_MuBiao5 != null)
        {
            if (rg_MuBiao5.isClickable())
            {
                return (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao5, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null));
            }
            rg_MuBiao5 = rg_MuBiao5.getParent();
        }
        return (false);
    }

    public void rg_ZhiZhiDingJieDianNeiRong (android.view.accessibility.AccessibilityNodeInfo rg_MuBiao6, String rg_NeiRong172) {
        while (rg_MuBiao6.isEditable())
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                android.os.Bundle rg_ShuJuBao19 = new android.os.Bundle ();
                rg_ShuJuBao19.putString (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoCanShuLeiXing.rg_ZhiDingWenBenNeiRong, rg_NeiRong172);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_SheZhiWenBen, rg_ShuJuBao19);
                return;
            }
            else if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanWenBen (rg_NeiRong172, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_DiGongShuRuJiaoDian, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_NianTieCaoZuo, null);
                return;
            }
            rg_MuBiao6 = rg_MuBiao6.getParent();
        }
    }
}
