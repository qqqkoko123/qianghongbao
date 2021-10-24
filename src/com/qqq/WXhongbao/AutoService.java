
package com.qqq.WXhongbao;

public class AutoService extends huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiFuWuLei {

    public AutoService ()  { }

    protected static rg_MoZhangAiFuWuShiJianJieShouQi rg_ShiJianJieShouQi;
    protected rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_MoNiCaoZuoShiJianDuiXiang = new rg_MoZhangAiFuWuChuangKouShiJianJieShouQi ();
    public static final String rg_QingChanShengMingShuJu = "<. android:label=\"自动抢红包服务\"> <meta-data android:name=\"android.accessibilityservice\" android:resource = \"@xml/voldev_accessibility_service_config\"/> </.>";

    {
        rg_MoNiCaoZuoShiJianDuiXiang.rl_MoZhangAiFuWuChuangKouShiJianJieShouQi_ShouDaoQuanJuCaoZuoQingQiu (new rg_MoZhangAiFuWuChuangKouShiJianJieShouQi.re_ShouDaoQuanJuCaoZuoQingQiu () {
            public int dispatch (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi objSource, int nTagNumber, int rg_CaoZuoLeiXing7) {
                return rg_mzhaifwchkshjjshq_shdqjczqq (objSource, nTagNumber, rg_CaoZuoLeiXing7);
            }
        }, 0);
    }

    public void rg_TongZhi_ShouDaoXinShiJian (android.view.accessibility.AccessibilityEvent rg_ShiJianDuiXiang76) {
        if (rg_ShiJianDuiXiang76.getEventType() == huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiShiJianLeiXing.rg_TongZhiLanZhuangTaiGaiBian)
        {
            if (rg_ShiJianDuiXiang76.getParcelableData() instanceof android.app.Notification)
            {
                java.util.List<java.lang.CharSequence> rg_SuoYouZiFuChuan;
                rg_SuoYouZiFuChuan = rg_ShiJianDuiXiang76.getText();
                String rg_TongZhiLanDiShiWenBen;
                if (rg_SuoYouZiFuChuan.size () >= 1)
                {
                    rg_TongZhiLanDiShiWenBen = String.valueOf (rg_SuoYouZiFuChuan.get (rg_SuoYouZiFuChuan.size () - 1));
                    if (rg_TongZhiLanDiShiWenBen.contains ("[微信红包]") || rg_TongZhiLanDiShiWenBen.contains ("[QQ红包]") || rg_TongZhiLanDiShiWenBen.contains ("[钉钉红包]") || rg_TongZhiLanDiShiWenBen.contains ("[支付宝红包]") || rg_TongZhiLanDiShiWenBen.contains ("[拼手气红包]"))
                    {
                        anZhuo.MoMingMoKuai.WangLaoCaoZuo.rg_YinLeBoFangLei rg_YinLeBoFang = new anZhuo.MoMingMoKuai.WangLaoCaoZuo.rg_YinLeBoFangLei ();
                        rg_YinLeBoFang.rg_XunHuanBoFang7 (false);
                        android.app.Notification rg_ShouDaoTongZhiLan;
                        rg_YinLeBoFang.rg_ZhiYinLiang4 (100, 100);
                        rg_YinLeBoFang.rg_BoFang10 (anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo.rg_MuLuGongJuLei.rg_MuLu_QuCunChuLuJing () + "hb.mp3");
                        rg_ShouDaoTongZhiLan = (android.app.Notification)rg_ShiJianDuiXiang76.getParcelableData();
                        huoShan.AnZhuo.JiBen.rg_YanChiQiDongXinXiLei.rg_FaSong1 (rg_ShouDaoTongZhiLan.contentIntent);
                    }
                }
            }
        }
        super.rg_TongZhi_ShouDaoXinShiJian (rg_ShiJianDuiXiang76);
        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_ShouDaoXinShiJian1 (rg_ShiJianDuiXiang76);
    }

    public void rg_TongZhi_FuWuYiLianJie () {
        super.rg_TongZhi_FuWuYiLianJie ();
        rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_ChuShiHuaRenWu (this);
        rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_ChuShiHuaRenWu (this);
        rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_ChuShiHuaRenWu (this);
        rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_ChuShiHuaRenWu (this);
        rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_ChuShiHuaRenWu (this);
        rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_ChuShiHuaRenWu (this);
        rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_ChuShiHuaRenWu (this);
        rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_ChuShiHuaRenWu (this);
        rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_ChuShiHuaRenWu (this);
        rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_ChuShiHuaRenWu (this);
        rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_ChuShiHuaRenWu (this);
        rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_ChuShiHuaRenWu (this);
        rg_GongBaoKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong9 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_GongBaoYiKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong8 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QiangGongBaoRenWuLei.rg_ChuShiHuaMoNiShiJianFaSong7 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QQLiaoTianJieMian.rg_ChuShiHuaMoNiShiJianFaSong2 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QQGongBaoKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong3 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_ZFBLiaoTianJieMian.rg_ChuShiHuaMoNiShiJianFaSong10 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_ZFBGongBaoKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong11 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_DDLiaoTianJieMian.rg_ChuShiHuaMoNiShiJianFaSong (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_DDGongBaoKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong1 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QYWXQiangGongBaoRenWuLei.rg_ChuShiHuaMoNiShiJianFaSong4 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QYWXGongBaoKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong5 (rg_MoNiCaoZuoShiJianDuiXiang);
        rg_QYWXGongBaoYiKaiJieMian.rg_ChuShiHuaMoNiShiJianFaSong6 (rg_MoNiCaoZuoShiJianDuiXiang);
        anZhuo.MoMingMoKuai.MoZhangAiCaoZuo.rg_MoZhangAiFuZhuLei.rg_ChuShiHua50 (this);
    }

    protected int rg_mzhaifwchkshjjshq_shdqjczqq (rg_MoZhangAiFuWuChuangKouShiJianJieShouQi rg_LaiYuanDuiXiang189, int rg_BiaoJiZhi189, int rg_CaoZuoLeiXing6) {
        this.performGlobalAction (rg_CaoZuoLeiXing6);
        return (0);
    }
}
