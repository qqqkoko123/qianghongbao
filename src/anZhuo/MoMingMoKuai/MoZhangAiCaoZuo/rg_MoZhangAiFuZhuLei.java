
package anZhuo.MoMingMoKuai.MoZhangAiCaoZuo;

import java.lang.ref.WeakReference;

public class rg_MoZhangAiFuZhuLei {

    public rg_MoZhangAiFuZhuLei ()  { }

    private static java.lang.ref.WeakReference<android.accessibilityservice.AccessibilityService> serviceWeakReference;
    private static java.util.List<android.view.accessibility.AccessibilityNodeInfo>allNodes = new java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo>();
    private static void refreshAllNode(android.view.accessibility.AccessibilityNodeInfo parent){
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            allNodes.clear();
            getAllNodes(parent == null ? serviceWeakReference.get().getRootInActiveWindow() : parent);
        }
    }
    private static void getAllNodes(android.view.accessibility.AccessibilityNodeInfo parent){
        if (parent == null) return;
        allNodes.add(parent);
        if (parent.getChildCount() > 0){
            for (int i = 0; i < parent.getChildCount(); i++){
                if (parent.getChild(i) != null && parent.getChild(i).getChildCount() > 0){
                    getAllNodes(parent.getChild(i));
                }else{
                    allNodes.add(parent.getChild(i));
                }
            }
        }
    }

    public static synchronized void rg_ChuShiHua52 (android.accessibilityservice.AccessibilityService rg_FuWuDuiXiang2) {
        if (serviceWeakReference == null && rg_FuWuDuiXiang2 != null){
            serviceWeakReference = new WeakReference<android.accessibilityservice.AccessibilityService>(rg_FuWuDuiXiang2);
        }
    }

    public static boolean rg_ChanJiZuoBiao (int rg_HengZuoBiao46, int rg_ZongZuoBiao46) {
        if (android.os.Build.VERSION.SDK_INT >= 24)
        {
            android.accessibilityservice.GestureDescription.Builder rg_ShouShiGouJian = new android.accessibilityservice.GestureDescription.Builder ();
            android.graphics.Path rg_LuJing50 = new android.graphics.Path ();
            rg_LuJing50.moveTo ((float)rg_HengZuoBiao46, (float)rg_ZongZuoBiao46);
            android.accessibilityservice.GestureDescription.StrokeDescription rg_BiHua;
            rg_BiHua = new android.accessibilityservice.GestureDescription.StrokeDescription(rg_LuJing50, 0, 50);
            rg_ShouShiGouJian.addStroke(rg_BiHua);
            if (serviceWeakReference != null && serviceWeakReference.get() != null){
                return serviceWeakReference.get().dispatchGesture(rg_ShouShiGouJian.build(), null, null);
            }
        }
        return (anZhuo.MoMingMoKuai.ZaQiZaBa.rg_RootGongJuLei.rg_Root_ZhiHangMingLing ("input tap " + String.valueOf (rg_HengZuoBiao46) + " " + String.valueOf (rg_ZongZuoBiao46)) == 0);
    }

    public static boolean rg_ChanJiJieDian (android.view.accessibility.AccessibilityNodeInfo rg_MuBiaoJieDian4) {
        while (rg_MuBiaoJieDian4 != null)
        {
            if (rg_MuBiaoJieDian4.isClickable())
            {
                return (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiaoJieDian4, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null));
            }
            rg_MuBiaoJieDian4 = rg_MuBiaoJieDian4.getParent();
        }
        return (false);
    }

    public static boolean rg_ZhiRuJieDianNeiRong (android.view.accessibility.AccessibilityNodeInfo rg_MuBiaoJieDian5, String rg_NeiRong168) {
        if (rg_MuBiaoJieDian5 == null)
        {
            return (false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            android.os.Bundle rg_ShuJuBao10 = new android.os.Bundle ();
            rg_ShuJuBao10.putCharSequence(android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, rg_NeiRong168);
            return (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiaoJieDian5, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_SheZhiWenBen, rg_ShuJuBao10));
        }
        else if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            if (huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_JianTieBanShiFouBuWeiKong ())
            {
                android.content.ClipData rg_ShuJuDuiXiang56;
                rg_ShuJuDuiXiang56 = huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_QuJianTieBanShuJu ();
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanWenBen (rg_NeiRong168, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiaoJieDian5, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_NianTieCaoZuo, null);
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanShuJu (rg_ShuJuDuiXiang56);
            }
            else
            {
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanWenBen (rg_NeiRong168, null);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiaoJieDian5, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_NianTieCaoZuo, null);
                huoShan.AnZhuo.JiBen.rg_JianTieBanGuanLiQi.rg_ZhiJianTieBanWenBen (null, null);
            }
        }
        return (false);
    }

    public static boolean rg_ChanJiJieDian_JiangZhi (android.view.accessibility.AccessibilityNodeInfo rg_MuBiaoJieDian9) {
        if (rg_MuBiaoJieDian9 == null)
        {
            return (false);
        }
        if (rg_MuBiaoJieDian9.isClickable())
        {
            return (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_ZhiHangDongZuo (rg_MuBiaoJieDian9, huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuJieDianDongZuoLeiXing.rg_ChanJiCaoZuo, null));
        }
        android.graphics.Rect rg_WeiZhi114 = new android.graphics.Rect ();
        rg_MuBiaoJieDian9.getBoundsInScreen(rg_WeiZhi114);
        return (rg_ChanJiZuoBiao (rg_WeiZhi114.centerX (), rg_WeiZhi114.centerY ()));
    }

    public static android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingIDChaZhaoJieDian (String rg_IDZiYuan1, android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingFuJieDian) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            android.view.accessibility.AccessibilityNodeInfo rootNode = serviceWeakReference.get().getRootInActiveWindow();
            if (rootNode == null && rg_ZhiDingFuJieDian == null) return null;
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodeInfoList = rg_ZhiDingFuJieDian == null ? rootNode.findAccessibilityNodeInfosByViewId(rg_IDZiYuan1) : rg_ZhiDingFuJieDian.findAccessibilityNodeInfosByViewId(rg_IDZiYuan1);
            if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
                return nodeInfoList.get(0);
            }
        }
        return null;
    }

    public static android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingLeiMingChaZhaoJieDian (String rg_JieDianLeiMing1, android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingFuJieDian1) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            refreshAllNode(rg_ZhiDingFuJieDian1);
            if (allNodes.isEmpty()) return null;
            for (android.view.accessibility.AccessibilityNodeInfo temp : allNodes){
                if (temp != null && temp.getClassName() != null && temp.getClassName().toString().equals(rg_JieDianLeiMing1)){
                    return temp;
                }
            }
        }
        return null;
    }

    public static java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_ZhiDingIDChaZhaoJieDianLieBiao (String rg_IDZiYuan2, android.view.accessibility.AccessibilityNodeInfo rg_ZhiDingFuJieDian6) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            android.view.accessibility.AccessibilityNodeInfo rootNode = serviceWeakReference.get().getRootInActiveWindow();
            if (rootNode == null) return null;
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodeInfoList = rg_ZhiDingFuJieDian6 == null ? rootNode.findAccessibilityNodeInfosByViewId(rg_IDZiYuan2) : rg_ZhiDingFuJieDian6.findAccessibilityNodeInfosByViewId(rg_IDZiYuan2);
            if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
                return nodeInfoList;
            }
        }
        return null;
    }
}
