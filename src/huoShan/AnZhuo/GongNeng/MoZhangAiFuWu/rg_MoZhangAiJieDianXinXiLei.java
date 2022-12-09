
package huoShan.AnZhuo.GongNeng.MoZhangAiFuWu;

public class rg_MoZhangAiJieDianXinXiLei {

    public static boolean rg_ZhiHangDongZuo (android.view.accessibility.AccessibilityNodeInfo rg_YuCaoZuoBenDuiXiang179, int rg_DongZuoLeiXing3, android.os.Bundle rg_EWaiCanShu) {
        try {
            return rg_YuCaoZuoBenDuiXiang179.performAction(rg_DongZuoLeiXing3, rg_EWaiCanShu);
        } catch (Exception e) {
            return false;
        }
    }

    public static android.view.accessibility.AccessibilityNodeInfo rg_QuZhiDingZiJieDian (android.view.accessibility.AccessibilityNodeInfo rg_YuCaoZuoBenDuiXiang197, int rg_SuoYin4) {
        try {
            return rg_YuCaoZuoBenDuiXiang197.getChild(rg_SuoYin4);
        } catch (Exception e) {
            return null;
        }
    }
}
