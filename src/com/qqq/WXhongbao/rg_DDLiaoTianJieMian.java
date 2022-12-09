
package com.qqq.WXhongbao;

public class rg_DDLiaoTianJieMian extends rg_RenWuJiChuLei {

    public rg_DDLiaoTianJieMian ()  { }

    public static rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianFaSongQi;
    protected static rg_DDLiaoTianJieMian rg_RenWuDuiXiang2;
    protected String rg_DDLiaoTianJieMianChuangKouLeiMing = "";

    public void rg_ShouDaoXinShiJian1 (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang71) {
        super.rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang71);
        if (rg_QiYongZhuangTai3 == false)
        {
            return;
        }
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenXiangDeng (String.valueOf(rg_ShiJianDuiXiang71.getPackageName()), "com.alibaba.android.rimet", false) == false)
        {
            return;
        }
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_JieDianLieBiao2;
        android.view.accessibility.AccessibilityNodeInfo rg_JieDian3;
        int rg_ChengYuanShu29;
        int rg_ZiJieDianShuLiang2;
        rg_JieDianLieBiao2 = rg_ZhiDingIDChaZhaoJieDianLieBiao1 ("com.alibaba.android.rimet:id/chatting_content_view_stub");
        rg_ChengYuanShu29 = rg_JieDianLieBiao2.size ();
        if (rg_JieDianLieBiao2 != null && rg_JieDianLieBiao2.size () > 0)
        {
            rg_JieDian3 = rg_JieDianLieBiao2.get (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindd);
            if (rg_JieDian3 != null)
            {
                if (rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindd <= rg_ChengYuanShu29 - 2)
                {
                    rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindd = rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindd + 1;
                }
                else
                {
                    rg_QuanJuBianLiangLei.rg_ChengYuanSuoYindd = 0;
                }
                rg_ZiJieDianShuLiang2 = rg_JieDian3.getChildCount();
                if (rg_JieDian3.getChildCount() == 3)
                {
                    if ((String.valueOf(huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiJieDianXinXiLei.rg_QuZhiDingZiJieDian (rg_JieDian3, 2).getText()).contains ("已领取")) == false)
                    {
                        rg_ChanJiJieDian1 (rg_JieDian3);
                        rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = false;
                        rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = true;
                    }
                }
            }
        }
        else
        {
            rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
            rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
        }
        return;
    }

    public static synchronized rg_DDLiaoTianJieMian rg_QuRenWuDuiXiang () {
        if (rg_RenWuDuiXiang2 == null)
        {
            rg_RenWuDuiXiang2 = new rg_DDLiaoTianJieMian ();
        }
        return (rg_RenWuDuiXiang2);
    }

    public static void rg_ChuShiHuaMoNiShiJianFaSong (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_JieShouDuiXiang3) {
        rg_MoNiCaoZuoShiJianFaSongQi = rg_JieShouDuiXiang3;
    }
}
