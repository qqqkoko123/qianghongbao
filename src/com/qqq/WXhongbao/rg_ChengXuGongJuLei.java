
package com.qqq.WXhongbao;

public class rg_ChengXuGongJuLei {

    public rg_ChengXuGongJuLei ()  { }

    protected static final String rg_ZiShenFuWuID = "com.qqq.WXhongbao/.AutoService";
    public static final String rg_WeiXinBaoMing = "com.tencent.mm";

    public static boolean rg_JianCeZiShenFuWuShiFouKaiQi (android.content.Context rg_ShangXiaWen) {
        android.view.accessibility.AccessibilityManager rg_GuanLiDuiXiang5;
        rg_GuanLiDuiXiang5 = (android.view.accessibility.AccessibilityManager)rg_ShangXiaWen.getSystemService (huoShan.AnZhuo.JiBen.rg_AnZhuoHuanJing.rg_MoZhangAiGuanLiFuWu);
        if (rg_GuanLiDuiXiang5 == null)
        {
            return (false);
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> rg_YiQiYongLieBiao;
        rg_YiQiYongLieBiao = rg_GuanLiDuiXiang5.getEnabledAccessibilityServiceList(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFanKuiLeiXing.rg_PuTongFanKui);
        if (rg_YiQiYongLieBiao == null || rg_YiQiYongLieBiao.size () == 0)
        {
            return (false);
        }
        int rg_i46 = 0;
        for (rg_i46 = 0; rg_i46 < rg_YiQiYongLieBiao.size (); rg_i46++)
        {
            android.accessibilityservice.AccessibilityServiceInfo rg_XinXiDuiXiang15;
            rg_XinXiDuiXiang15 = rg_YiQiYongLieBiao.get (rg_i46);
            if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (rg_XinXiDuiXiang15.getId(), rg_ZiShenFuWuID, false))
            {
                return (true);
            }
        }
        return (false);
    }
}
