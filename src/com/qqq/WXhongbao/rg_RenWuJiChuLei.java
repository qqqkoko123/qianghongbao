
package com.qqq.WXhongbao;

public class rg_RenWuJiChuLei {

    public rg_RenWuJiChuLei ()  { }

    public boolean rg_QiYongZhuangTai3;
    protected huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuLei rg_FuWuDuiXiang3;

    public void rg_ChuShiHuaRenWu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuLei rg_FuWu3) {
        rg_FuWuDuiXiang3 = rg_FuWu3;
    }

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang82) {
    }

    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_ZhiDingIDChaZhaoJieDianLieBiao1 (String rg_ID52) {
        if (rg_FuWuDuiXiang3 == null)
        {
            throw new RuntimeException ("请先启用自动服务！");
        }
        return (rg_FuWuDuiXiang3.getRootInActiveWindow ().findAccessibilityNodeInfosByViewId(rg_ID52));
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

    public void rg_ZhiZhiDingJieDianNeiRong (android.view.accessibility.AccessibilityNodeInfo rg_MuBiao6, String rg_NeiRong196) {
        while (rg_MuBiao6.isEditable())
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                android.os.Bundle rg_ShuJuBao20 = new android.os.Bundle ();
                rg_ShuJuBao20.putString (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoCanShuLeiXing.rg_ZhiDingWenBenNeiRong, rg_NeiRong196);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_SheZhiWenBen, rg_ShuJuBao20);
                return;
            }
            else if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanWenBen (rg_NeiRong196, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_DiGongShuRuJiaoDian, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiao6, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_NianTieCaoZuo, null);
                return;
            }
            rg_MuBiao6 = rg_MuBiao6.getParent();
        }
    }
}
