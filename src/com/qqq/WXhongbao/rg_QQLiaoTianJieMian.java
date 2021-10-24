
package com.qqq.WXhongbao;

public class rg_QQLiaoTianJieMian extends rg_RenWuJiChuLei {

    public rg_QQLiaoTianJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi2;
    protected static rg_QQLiaoTianJieMian rg_RenWuDuiXiang4;
    protected String rg_QQLiaoTianJieMianChuangKouLeiMing = "com.tencent.mobileqq.activity.ChatActivity";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang71) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang71);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getPackageName()), "com.tencent.mobileqq", false) == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getClassName()), rg_QQLiaoTianJieMianChuangKouLeiMing, false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getClassName()), "android.widget.ListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getClassName()), "android.widget.FrameLayout", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getClassName()), "android.widget.AbsListView", false) || huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getClassName()), "com.tencent.mobileqq.activity.SplashActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao4;
            android.view.accessibility.AccessibilityNodeInfo rg_JieDian2;
            rg_JieDianLieBiao4 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.tencent.mobileqq:id/qlu");
            if (rg_JieDianLieBiao4 != null && rg_JieDianLieBiao4.size () > 0)
            {
                rg_JieDian2 = rg_JieDianLieBiao4.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq);
                if (rg_JieDian2 != null && (String.valueOf(rg_JieDian2.getContentDescription()).contains ("口令:")))
                {
                    if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq <= rg_JieDianLieBiao4.size () - 2)
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq + 1;
                    }
                    else
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = 0;
                    }
                    rg_ChanJiJieDian1 (rg_JieDian2);
                    android.view.accessibility.AccessibilityNodeInfo rg_FaSongAnNiuJieDian;
                    android.view.accessibility.AccessibilityNodeInfo rg_BianJiKuangJieDian;
                    android.view.accessibility.AccessibilityNodeInfo rg_NeiRongJieDian;
                    rg_BianJiKuangJieDian = rg_ZhiDingIDChaZhaoShouJieDian ("com.tencent.mobileqq:id/input");
                    rg_FaSongAnNiuJieDian = rg_ZhiDingIDChaZhaoShouJieDian ("com.tencent.mobileqq:id/fun_btn");
                    rg_NeiRongJieDian = rg_ZhiDingIDChaZhaoShouJieDian ("com.tencent.mobileqq:id/awh");
                    if (rg_NeiRongJieDian != null && rg_BianJiKuangJieDian != null && rg_FaSongAnNiuJieDian != null)
                    {
                        rg_ChanJiJieDian1 (rg_NeiRongJieDian);
                        rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian);
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi2 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi2.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        rg_ZhiZhiDingJieDianNeiRong (rg_BianJiKuangJieDian, "感谢老板");
                        rg_ChanJiJieDian1 (rg_FaSongAnNiuJieDian);
                    }
                    else
                    {
                        huoShan.Java.JiBen.rg_XianChengJiChuLei.rg_ShuiMianDangQianXianCheng (2000);
                        if (rg_MoNiCaoZuoShiJianFaSongQi2 != null)
                        {
                            rg_MoNiCaoZuoShiJianFaSongQi2.rg_ShouDaoQuanJuCaoZuoQingQiu (huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuQuanJuCaoZuoLeiXing.rg_FanHuiCaoZuo);
                        }
                    }
                }
                else if (rg_JieDian2 != null)
                {
                    if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq <= rg_JieDianLieBiao4.size () - 2)
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq + 1;
                    }
                    else
                    {
                        rg_QuanJuBianLiangLei.rg_ChengYuanSuoYinqq = 0;
                    }
                    rg_ChanJiJieDian1 (rg_JieDian2);
                    rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = false;
                    rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = true;
                }
            }
        }
        return;
    }

    public static synchronized rg_QQLiaoTianJieMian rg_QuRenWuDuiXiang2 () {
        if (rg_RenWuDuiXiang4 == null)
        {
            rg_RenWuDuiXiang4 = new rg_QQLiaoTianJieMian ();
        }
        return (rg_RenWuDuiXiang4);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong2 (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang5) {
        rg_MoNiCaoZuoShiJianFaSongQi2 = rg_JieShouDuiXiang5;
    }
}
