
package com.qqq.WXhongbao;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_QiDongLei extends huoShan.AnZhuo.JiBen.rg_JianRongChuangKou {

    public rg_QiDongLei ()  { }

    protected huoShan.AnZhuo.JiBen.rg_AnNiu rg_AnNiu16;
    protected huoShan.AnZhuo.JiBen.rg_WenBenKuang rg_WenBenKuang2;
    protected huoShan.AnZhuo.JiBen.rg_WenBenKuang rg_WenBenKuang3;
    protected huoShan.AnZhuo.JiBen.rg_AnNiu rg_AnNiu17;
    protected huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi rg_XianXingBuJuQi2;
    protected huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang rg_GaoJiJianRongBianJiKuang1;
    protected huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang rg_GaoJiJianRongBianJiKuang2;
    protected huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang rg_GaoJiJianRongBianJiKuang3;
    protected huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang rg_GaoJiJianRongBianJiKuang4;
    protected huoShan.AnZhuo.JiBen.rg_AnNiu rg_AnNiu18;
    protected huoShan.AnZhuo.JiBen.rg_DiShiDuiHuaKuangLei rg_DuiHuaKuang15;
    protected String rg_BanBenHao11 = "";
    protected String rg_GengXinXiangQing = "";
    protected String rg_WenJianDeZhi2 = "";
    protected huoShan.AnZhuo.JiBen.rg_AnZhuoWangLaoCaoZuoLei rg_http1 = new huoShan.AnZhuo.JiBen.rg_AnZhuoWangLaoCaoZuoLei ();
    protected huoShan.AnZhuo.JiBen.rg_JinDuDuiHuaKuangLei rg_JinDuDuiHuaKuang1;
    protected huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei rg_YunHangShiQuanXian = new huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei ();

    {
        rg_http1.rl_AnZhuoWangLaoCaoZuoLei_QingQiuWanBi (new huoShan.AnZhuo.JiBen.rg_AnZhuoWangLaoCaoZuoLei.re_QingQiuWanBi () {
            public int dispatch (huoShan.AnZhuo.JiBen.rg_AnZhuoWangLaoCaoZuoLei objSource, int nTagNumber, byte [] rg_FanHuiShuJu4, String rg_Cookies1, String rg_XiangYingTou1, int rg_QingQiuSuoYin2) {
                return rg_AnZhuoWangLaoCaoZuoLei_QingQiuWanBi1 (objSource, nTagNumber, rg_FanHuiShuJu4, rg_Cookies1, rg_XiangYingTou1, rg_QingQiuSuoYin2);
            }
        }, 0);
        rg_YunHangShiQuanXian.rl_YunHangShiQuanXianGongJuLei_YiShouYuQuanXian (new huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei.re_YiShouYuQuanXian () {
            public int dispatch (huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei objSource, int nTagNumber) {
                return rg_YunHangShiQuanXianGongJuLei_YiShouYuQuanXian (objSource, nTagNumber);
            }
        }, 0);
        rg_YunHangShiQuanXian.rl_YunHangShiQuanXianGongJuLei_YiJuJueQuanXian (new huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei.re_YiJuJueQuanXian () {
            public int dispatch (huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei objSource, int nTagNumber, java.util.List<String> rg_BeiJuQuanXian) {
                return rg_YunHangShiQuanXianGongJuLei_YiJuJueQuanXian (objSource, nTagNumber, rg_BeiJuQuanXian);
            }
        }, 0);
    }

    protected huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi rp_1;
    @Override public huoShan.AnZhuo.JiBen.AndroidViewGroup GetAndroidActivityContainer () {
        return rp_1;
    }

    @Override
    protected boolean onInitAndroidActivity () {
        if (super.onInitAndroidActivity () == false)
            return false;

        setContentView (R.layout.rg_qidonglei);
        rp_1 = new huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi (this, (LinearLayout)findViewById (R.id.rg_qidonglei));
        rp_1.onInitControlContent (this, null);

        rg_AnNiu16 = new huoShan.AnZhuo.JiBen.rg_AnNiu (this, (Button)findViewById (R.id.rg_anniu16));
        rg_AnNiu16.onInitControlContent (this, null);
        rg_AnNiu16.rg_XuKe1 (false);
        rg_AnNiu16.rl_AndroidView_BeiChanJi1 (new huoShan.AnZhuo.JiBen.AndroidView.re_BeiChanJi1 () {
            public int dispatch (huoShan.AnZhuo.JiBen.AndroidView objSource, int nTagNumber) {
                return rg_AnNiu_BeiChanJi ((huoShan.AnZhuo.JiBen.rg_AnNiu)objSource, nTagNumber);
            }
        }, 0);
        rg_WenBenKuang2 = new huoShan.AnZhuo.JiBen.rg_WenBenKuang (this, (TextView)findViewById (R.id.rg_wenbenkuang2));
        rg_WenBenKuang2.onInitControlContent (this, null);
        rg_WenBenKuang3 = new huoShan.AnZhuo.JiBen.rg_WenBenKuang (this, (TextView)findViewById (R.id.rg_wenbenkuang3));
        rg_WenBenKuang3.onInitControlContent (this, null);
        rg_WenBenKuang3.rg_NeiRong8 ("本插件适用：\n1.7.0.1-8.0.15最新版的微信红包，收到红包AI智能播报，抢完并回复“感谢老板”；\n2.V8.8.35.6445的QQ普通红包，拼手气红包以及口令红包，在抢完的同时自动发送\"感谢老板\"防封；\n3.支付宝10.2.36最新版支付宝拼手气红包；\n4.适用最新版钉钉6.3.5拼手气红包。\n5.适用3.1.18的最新版企业微信\n使用方法：\n1.点开\"启动服务\"按钮，选中\"无障碍\"中\"自动抢红包服务\"并将其打开；\n2.将本应用添加到自启动或者手机管家的白名单中；\n3.然后回来首页，再次点击\"启动服务\"按钮，进入微信、QQ、钉钉、支付宝页面，即可对微信，QQ，钉钉，支付宝进行抢相关的红包了！\n重要提示：\n如果感觉不错，请点击\"支持作者\"按钮，来捐赠作者！！！");
        rg_AnNiu17 = new huoShan.AnZhuo.JiBen.rg_AnNiu (this, (Button)findViewById (R.id.rg_anniu17));
        rg_AnNiu17.onInitControlContent (this, null);
        rg_AnNiu17.rl_AndroidView_BeiChanJi1 (new huoShan.AnZhuo.JiBen.AndroidView.re_BeiChanJi1 () {
            public int dispatch (huoShan.AnZhuo.JiBen.AndroidView objSource, int nTagNumber) {
                return rg_AnNiu_BeiChanJi ((huoShan.AnZhuo.JiBen.rg_AnNiu)objSource, nTagNumber);
            }
        }, 0);
        rg_XianXingBuJuQi2 = new huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi (this, (LinearLayout)findViewById (R.id.rg_xianxingbujuqi2));
        rg_XianXingBuJuQi2.onInitControlContent (this, null);
        rg_GaoJiJianRongBianJiKuang1 = new huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_gaojijianrongbianjikuang1));
        rg_GaoJiJianRongBianJiKuang1.onInitControlContent (this, null);
        rg_GaoJiJianRongBianJiKuang1.rg_FuDongDiShiNeiRong ("请输入用户名");
        rg_GaoJiJianRongBianJiKuang1.rg_DiShiWenBen4 ("请输入用户名");
        rg_GaoJiJianRongBianJiKuang1.rg_WenBenZiTiCheCun1 (15);
        rg_GaoJiJianRongBianJiKuang1.rg_JiBenYanSe (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang1.rg_FuDongBiaoQianLeiXing (huoShan.AnZhuo.ZuJian.rg_GaoJiBianJiKuangFuDongBiaoQianLeiXing.rg_GaoLiangLeiXing);
        rg_GaoJiJianRongBianJiKuang1.rg_ZuiDaZiFuShu (20);
        rg_GaoJiJianRongBianJiKuang1.rg_JiaoDianYanSe (0xFFC0C0C0);
        rg_GaoJiJianRongBianJiKuang1.rg_WenBenYanSe2 (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang1.rg_ZhiChiChanJi1 (true);
        rg_GaoJiJianRongBianJiKuang1.rg_QiYongQingChuAnNiu (true);
        rg_GaoJiJianRongBianJiKuang2 = new huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_gaojijianrongbianjikuang2));
        rg_GaoJiJianRongBianJiKuang2.onInitControlContent (this, null);
        rg_GaoJiJianRongBianJiKuang2.rg_FuDongDiShiNeiRong ("请输入密码");
        rg_GaoJiJianRongBianJiKuang2.rg_DiShiWenBen4 ("请输入密码");
        rg_GaoJiJianRongBianJiKuang2.rg_WenBenZiTiCheCun1 (15);
        rg_GaoJiJianRongBianJiKuang2.rg_JiBenYanSe (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang2.rg_FuDongBiaoQianLeiXing (huoShan.AnZhuo.ZuJian.rg_GaoJiBianJiKuangFuDongBiaoQianLeiXing.rg_GaoLiangLeiXing);
        rg_GaoJiJianRongBianJiKuang2.rg_ZuiDaZiFuShu (20);
        rg_GaoJiJianRongBianJiKuang2.rg_JiaoDianYanSe (0xFFC0C0C0);
        rg_GaoJiJianRongBianJiKuang2.rg_WenBenYanSe2 (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang2.rg_ZhiChiChanJi1 (true);
        rg_GaoJiJianRongBianJiKuang2.rg_ChangYongShuRuLeiXing1 (huoShan.AnZhuo.JiBen.rg_ChangYongShuRuLeiXing.rg_WenBenMiMa);
        rg_GaoJiJianRongBianJiKuang2.rg_QiYongQingChuAnNiu (true);
        rg_GaoJiJianRongBianJiKuang3 = new huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_gaojijianrongbianjikuang3));
        rg_GaoJiJianRongBianJiKuang3.onInitControlContent (this, null);
        rg_GaoJiJianRongBianJiKuang3.rg_FuDongDiShiNeiRong ("请再次输入密码");
        rg_GaoJiJianRongBianJiKuang3.rg_DiShiWenBen4 ("请再次输入密码");
        rg_GaoJiJianRongBianJiKuang3.rg_WenBenZiTiCheCun1 (15);
        rg_GaoJiJianRongBianJiKuang3.rg_JiBenYanSe (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang3.rg_FuDongBiaoQianLeiXing (huoShan.AnZhuo.ZuJian.rg_GaoJiBianJiKuangFuDongBiaoQianLeiXing.rg_GaoLiangLeiXing);
        rg_GaoJiJianRongBianJiKuang3.rg_ZuiDaZiFuShu (20);
        rg_GaoJiJianRongBianJiKuang3.rg_JiaoDianYanSe (0xFFC0C0C0);
        rg_GaoJiJianRongBianJiKuang3.rg_WenBenYanSe2 (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang3.rg_ZhiChiChanJi1 (true);
        rg_GaoJiJianRongBianJiKuang3.rg_ChangYongShuRuLeiXing1 (huoShan.AnZhuo.JiBen.rg_ChangYongShuRuLeiXing.rg_WenBenMiMa);
        rg_GaoJiJianRongBianJiKuang3.rg_QiYongQingChuAnNiu (true);
        rg_GaoJiJianRongBianJiKuang4 = new huoShan.AnZhuo.ZuJian.rg_GaoJiJianRongBianJiKuang (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_gaojijianrongbianjikuang4));
        rg_GaoJiJianRongBianJiKuang4.onInitControlContent (this, null);
        rg_GaoJiJianRongBianJiKuang4.rg_FuDongDiShiNeiRong ("请输入注册码");
        rg_GaoJiJianRongBianJiKuang4.rg_DiShiWenBen4 ("请输入注册码");
        rg_GaoJiJianRongBianJiKuang4.rg_WenBenZiTiCheCun1 (15);
        rg_GaoJiJianRongBianJiKuang4.rg_JiBenYanSe (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang4.rg_FuDongBiaoQianLeiXing (huoShan.AnZhuo.ZuJian.rg_GaoJiBianJiKuangFuDongBiaoQianLeiXing.rg_GaoLiangLeiXing);
        rg_GaoJiJianRongBianJiKuang4.rg_ZuiDaZiFuShu (20);
        rg_GaoJiJianRongBianJiKuang4.rg_JiaoDianYanSe (0xFFC0C0C0);
        rg_GaoJiJianRongBianJiKuang4.rg_WenBenYanSe2 (0xFFFFFFFF);
        rg_GaoJiJianRongBianJiKuang4.rg_ZhiChiChanJi1 (true);
        rg_GaoJiJianRongBianJiKuang4.rg_QiYongQingChuAnNiu (true);
        rg_AnNiu18 = new huoShan.AnZhuo.JiBen.rg_AnNiu (this, (Button)findViewById (R.id.rg_anniu18));
        rg_AnNiu18.onInitControlContent (this, null);
        rg_AnNiu18.rl_AndroidView_BeiChanJi1 (new huoShan.AnZhuo.JiBen.AndroidView.re_BeiChanJi1 () {
            public int dispatch (huoShan.AnZhuo.JiBen.AndroidView objSource, int nTagNumber) {
                return rg_AnNiu_BeiChanJi ((huoShan.AnZhuo.JiBen.rg_AnNiu)objSource, nTagNumber);
            }
        }, 0);
        return true;
    }

    protected int rg_YunHangShiQuanXianGongJuLei_YiShouYuQuanXian (huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei rg_LaiYuanDuiXiang180, int rg_BiaoJiZhi180) {
        rg_ShuChuNeiRong1 ("权限申请结果:已允许所有权限");
        return (0);
    }

    protected int rg_YunHangShiQuanXianGongJuLei_YiJuJueQuanXian (huoShan.AnZhuo.JiBen.rg_YunHangShiQuanXianGongJuLei rg_LaiYuanDuiXiang181, int rg_BiaoJiZhi181, java.util.List<String> rg_BeiJuQuanXian1) {
        rg_ShuChuNeiRong1 ("权限申请结果:权限被拒绝");
        if (rg_BeiJuQuanXian1 != null)
        {
            int rg_i31 = 0;
            for (rg_i31 = 0; rg_i31 < rg_BeiJuQuanXian1.size (); rg_i31++)
            {
                rg_ShuChuNeiRong1 (rg_BeiJuQuanXian1.get (rg_i31));
            }
        }
        return (0);
    }

    protected void rg_ShuChuNeiRong1 (String rg_NeiRong170) {
        rg_WenBenKuang2.rg_NeiRong8 (rg_NeiRong170 + "\n" + String.valueOf (rg_WenBenKuang2.GetTextView ().getText ()));
    }

    protected int rg_AnNiu_BeiChanJi (huoShan.AnZhuo.JiBen.rg_AnNiu rg_LaiYuanDuiXiang182, int rg_BiaoJiZhi182) {
        if (rg_LaiYuanDuiXiang182 == rg_AnNiu16)
        {
            if (rg_ChengXuGongJuLei.rg_JianCeZiShenFuWuShiFouKaiQi (this))
            {
                huoShan.AnZhuo.JiBen.AndComActivity.rg_DaKaiZhiDingYingYong (this, rg_ChengXuGongJuLei.rg_WeiXinBaoMing);
                huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_DiShiKuang ("任务已启动！", false);
                rg_QiangGongBaoRenWuLei.rg_QuRenWuDuiXiang7 ().rg_QiYongZhuangTai3 = true;
                rg_GongBaoKaiJieMian.rg_QuRenWuDuiXiang9 ().rg_QiYongZhuangTai3 = false;
                rg_GongBaoYiKaiJieMian.rg_QuRenWuDuiXiang8 ().rg_QiYongZhuangTai3 = false;
                rg_QQLiaoTianJieMian.rg_QuRenWuDuiXiang2 ().rg_QiYongZhuangTai3 = true;
                rg_QQGongBaoKaiJieMian.rg_QuRenWuDuiXiang3 ().rg_QiYongZhuangTai3 = false;
                rg_ZFBLiaoTianJieMian.rg_QuRenWuDuiXiang10 ().rg_QiYongZhuangTai3 = true;
                rg_ZFBGongBaoKaiJieMian.rg_QuRenWuDuiXiang11 ().rg_QiYongZhuangTai3 = false;
                rg_DDLiaoTianJieMian.rg_QuRenWuDuiXiang ().rg_QiYongZhuangTai3 = true;
                rg_DDGongBaoKaiJieMian.rg_QuRenWuDuiXiang1 ().rg_QiYongZhuangTai3 = false;
                rg_QYWXQiangGongBaoRenWuLei.rg_QuRenWuDuiXiang4 ().rg_QiYongZhuangTai3 = true;
                rg_QYWXGongBaoKaiJieMian.rg_QuRenWuDuiXiang5 ().rg_QiYongZhuangTai3 = false;
                rg_QYWXGongBaoYiKaiJieMian.rg_QuRenWuDuiXiang6 ().rg_QiYongZhuangTai3 = false;
            }
            else
            {
                huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_DiShiKuang ("请先启用服务", false);
                huoShan.AnZhuo.GongNeng.MoZhangAiFuWu.rg_MoZhangAiGuanLiLei.rg_DaKaiSheZhi (this);
            }
        }
        else if (rg_BiaoJiZhi182 == 2)
        {
            rg_KaiShiJinHangXiaZai (rg_WenJianDeZhi2, "/sdcard/", "红包秒抢.apk");
        }
        else if (rg_LaiYuanDuiXiang182 == rg_AnNiu18)
        {
            String rg_AnZhuoWeiYiBiaoShi;
            String rg_FanHuiWenBen2;
            if (String.valueOf (rg_AnNiu18.GetTextView ().getText ()).equals ("确定注册"))
            {
                rg_AnZhuoWeiYiBiaoShi = anZhuo.MoMingMoKuai.ZaQiZaBa.rg_ShiBieMaLei.rg_JiTong_QuShiBieMa (anZhuo.MoMingMoKuai.ZaQiZaBa.rg_ShiBieMaLei.rg_QuIMEI1, this);
                if (rg_AnZhuoWeiYiBiaoShi.equals (""))
                {
                    rg_AnZhuoWeiYiBiaoShi = anZhuo.MoMingMoKuai.ZaQiZaBa.rg_ShiBieMaLei.rg_JiTong_QuShiBieMa (anZhuo.MoMingMoKuai.ZaQiZaBa.rg_ShiBieMaLei.rg_QuAnZhuoID1, this);
                }
                if (String.valueOf (rg_GaoJiJianRongBianJiKuang2.GetTextView ().getText ()).equals (String.valueOf (rg_GaoJiJianRongBianJiKuang3.GetTextView ().getText ())) == false)
                {
                    com.wuliguanhua.toast.Toasts.warning(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "两次密码输入不一致", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
                    return (0);
                }
                String [] rg_JiaMiWenBen = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
                rg_FanHuiWenBen2 = huoShan.Java.JiBen.rg_WenBenXingLei.rg_ZhiDingBianMaZiJieShuZuDaoWenBen (anZhuo.MoMingMoKuai.WangLaoCaoZuo.rg_WangLaoChuLiFangWenLei.rg_WangYe_FangWen ("http://" + rg_JiaMiWenBen [0] + rg_JiaMiWenBen [1] + rg_JiaMiWenBen [0] + "." + rg_JiaMiWenBen [2] + rg_JiaMiWenBen [5] + "." + rg_JiaMiWenBen [0] + rg_JiaMiWenBen [3] + rg_JiaMiWenBen [1] + "." + rg_JiaMiWenBen [0] + rg_JiaMiWenBen [8] + rg_JiaMiWenBen [9] + ":" + rg_JiaMiWenBen [0] + rg_JiaMiWenBen [9] + rg_JiaMiWenBen [9] + rg_JiaMiWenBen [1] + "/hongbaomiaoqiang/public/getkey", huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_POST1, "&UserIMEI=" + rg_AnZhuoWeiYiBiaoShi + "&UserName=" + String.valueOf (rg_GaoJiJianRongBianJiKuang1.GetTextView ().getText ()) + "&PassWord=" + String.valueOf (rg_GaoJiJianRongBianJiKuang2.GetTextView ().getText ()) + "&changshang=" + android.os.Build.BRAND + "&xinghao=" + android.os.Build.MODEL, "", "", false, "", "", false, null, null, null, null, false, true), huoShan.Java.JiBen.rg_WenBenBianMa.rg_UTF);
                if (rg_FanHuiWenBen2.equals ("fail") || rg_FanHuiWenBen2 == null || rg_FanHuiWenBen2.equals (""))
                {
                    com.wuliguanhua.toast.Toasts.error(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "注册失败！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
                    return (0);
                }
                else
                {
                    rg_GaoJiJianRongBianJiKuang4.rg_NeiRong8 (rg_FanHuiWenBen2);
                    huoShan.AnZhuo.YangWang.rg_WenBenZiJieLei.rg_XiePeiZhiXiang_n ("key", rg_FanHuiWenBen2);
                    rg_AnNiu18.rg_NeiRong8 ("开始使用");
                }
            }
            else if (String.valueOf (rg_AnNiu18.GetTextView ().getText ()).equals ("开始使用"))
            {
                rg_AnNiu16.rg_XuKe1 (true);
                rg_XianXingBuJuQi2.rg_KeShi2 (huoShan.AnZhuo.JiBen.rg_ZuJianKeShiZhuangTai.rg_WanQuanYinCang);
            }
        }
        else if (rg_LaiYuanDuiXiang182 == rg_AnNiu17)
        {
            anZhuo.MoMingMoKuai.ZaQiZaBa.rg_ZhiFuBaoGongJuLei.rg_ZhiFuBao_DaKaiZhuaiZhang (this, "https://qr.alipay.com/fkx13578bxlmmuehmvnqy77");
            com.wuliguanhua.toast.Toasts.info(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "请捐赠作者已支持更新此软件！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        }
        return (0);
    }

    protected void rg_DanChuShengJi () {
        huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi rg_ZongBuJuQi = new huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi (this, new LinearLayout (this));
        rg_ZongBuJuQi.onInitControlContent (this, null);
        rg_ZongBuJuQi.rg_BuJuFangXiang1 (huoShan.AnZhuo.JiBen.rg_XianXingBuJuFangXiang.rg_ZongXiang2);
        huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi rg_ZiBuJuQi = new huoShan.AnZhuo.JiBen.rg_XianXingBuJuQi (this, new LinearLayout (this));
        rg_ZiBuJuQi.onInitControlContent (this, null);
        rg_ZiBuJuQi.rg_BeiJingTu3 (R.drawable.zt);
        rg_ZiBuJuQi.rg_BuJuFangXiang1 (huoShan.AnZhuo.JiBen.rg_XianXingBuJuFangXiang.rg_ZongXiang2);
        huoShan.AnZhuo.JiBen.rg_ZongXiangGunDongRongQi rg_ZongXiangGunDongRongQi1 = new huoShan.AnZhuo.JiBen.rg_ZongXiangGunDongRongQi (this, new huoShan.AnZhuo.JiBen.rg_AnZhuoZongXiangGunDongRongQi (this));
        rg_ZongXiangGunDongRongQi1.onInitControlContent (this, null);
        huoShan.AnZhuo.JiBen.rg_ZhengBuJuQi rg_ZhengBuJuQi1 = new huoShan.AnZhuo.JiBen.rg_ZhengBuJuQi (this, new FrameLayout (this));
        rg_ZhengBuJuQi1.onInitControlContent (this, null);
        huoShan.AnZhuo.JiBen.rg_AnNiu rg_AnNiu_QueDing = new huoShan.AnZhuo.JiBen.rg_AnNiu (this, new Button (this));
        rg_AnNiu_QueDing.onInitControlContent (this, null);
        rg_AnNiu_QueDing.rg_BeiJingTu3 (R.drawable.bjt);
        rg_AnNiu_QueDing.rg_NeiRong8 ("开始升级");
        rg_AnNiu_QueDing.rg_ID4 (1000);
        huoShan.AnZhuo.JiBen.rg_TuPianAnNiu rg_TuPianAnNiu_GuanBi = new huoShan.AnZhuo.JiBen.rg_TuPianAnNiu (this, new ImageButton (this));
        rg_TuPianAnNiu_GuanBi.onInitControlContent (this, null);
        huoShan.AnZhuo.JiBen.rg_TuPianKuang rg_TuPianKuang_DingTu = new huoShan.AnZhuo.JiBen.rg_TuPianKuang (this, new ImageView (this));
        rg_TuPianKuang_DingTu.onInitControlContent (this, null);
        rg_TuPianKuang_DingTu.rg_BeiJingTu3 (R.drawable.st);
        huoShan.AnZhuo.JiBen.rg_TuPianKuang rg_TuPianKuang_XianTiao = new huoShan.AnZhuo.JiBen.rg_TuPianKuang (this, new ImageView (this));
        rg_TuPianKuang_XianTiao.onInitControlContent (this, null);
        rg_TuPianKuang_XianTiao.rg_BeiJingTu3 (R.drawable.xt);
        huoShan.AnZhuo.JiBen.rg_WenBenKuang rg_WenBenKuang_GengXinBanBen = new huoShan.AnZhuo.JiBen.rg_WenBenKuang (this, new TextView (this));
        rg_WenBenKuang_GengXinBanBen.onInitControlContent (this, null);
        rg_WenBenKuang_GengXinBanBen.rg_NeiRong8 ("发现新版本V2.0");
        rg_WenBenKuang_GengXinBanBen.rg_WenBenZiTiCheCun1 (18);
        rg_WenBenKuang_GengXinBanBen.rg_WenBenZiTiFengGe1 (huoShan.AnZhuo.JiBen.rg_ZiTiFengGe.rg_CuTi);
        rg_WenBenKuang_GengXinBanBen.rg_NeiRongShuiPingDuiJiFangShi3 (huoShan.AnZhuo.JiBen.rg_ShuiPingDuiJiFangShi2.rg_JuZhong3);
        rg_WenBenKuang_GengXinBanBen.rg_WenBenYanSe2 (huoShan.AnZhuo.JiBen.rg_YanSeLei.rg_HeiSe);
        rg_WenBenKuang_GengXinBanBen.rg_ID4 (2000);
        huoShan.AnZhuo.JiBen.rg_WenBenKuang rg_WenBenKuang_GengXinNeiRong = new huoShan.AnZhuo.JiBen.rg_WenBenKuang (this, new TextView (this));
        rg_WenBenKuang_GengXinNeiRong.onInitControlContent (this, null);
        rg_WenBenKuang_GengXinNeiRong.rg_WenBenYanSe2 (huoShan.AnZhuo.JiBen.rg_YanSeLei.rg_HuiSe);
        rg_WenBenKuang_GengXinNeiRong.rg_WenBenZiTiCheCun1 (16);
        rg_WenBenKuang_GengXinNeiRong.rg_ID4 (3000);
        huoShan.AnZhuo.JiBen.rg_ZhuangTaiDaoTuXiangBiao rg_ZhuangTaiTu = new huoShan.AnZhuo.JiBen.rg_ZhuangTaiDaoTuXiangBiao ();
        rg_ZhuangTaiTu.rg_TongChang5 = R.drawable.sj1;
        rg_ZhuangTaiTu.rg_BeiAnXia2 = R.drawable.sj2;
        int rg_GaoDu238;
        rg_DuiHuaKuang15 = huoShan.AnZhuo.JiBen.rg_DiShiDuiHuaKuangLei.rg_ChuangJianDiShiDuiHuaKuang (this);
        rg_DuiHuaKuang15.rg_BeiJingSe3 (huoShan.AnZhuo.JiBen.rg_YanSeLei.rg_TouMingSe);
        rg_GaoDu238 = huoShan.AnZhuo.YangWang.rg_JiTongLei.rg_QuBingMuGaoDu_n () / 6 * 4;
        rg_DuiHuaKuang15.rg_ZhiXuQiuCheCun1 (huoShan.AnZhuo.YangWang.rg_JiTongLei.rg_QuBingMuKuanDu_n () - 190, rg_GaoDu238);
        rg_ZongBuJuQi.rg_TianJiaZiZuJian2 (rg_ZhengBuJuQi1, null);
        rg_ZongBuJuQi.rg_TianJiaZiZuJian2 (rg_TuPianKuang_XianTiao, null);
        rg_ZongBuJuQi.rg_TianJiaZiZuJian2 (rg_TuPianAnNiu_GuanBi, null);
        rg_ZhengBuJuQi1.rg_TianJiaZiZuJian2 (rg_ZiBuJuQi, null);
        rg_ZhengBuJuQi1.rg_TianJiaZiZuJian2 (rg_TuPianKuang_DingTu, null);
        rg_ZhengBuJuQi1.rg_TianJiaZiZuJian2 (rg_AnNiu_QueDing, null);
        rg_ZiBuJuQi.rg_TianJiaZiZuJian2 (rg_WenBenKuang_GengXinBanBen, null);
        rg_ZiBuJuQi.rg_TianJiaZiZuJian2 (rg_ZongXiangGunDongRongQi1, null);
        rg_ZongXiangGunDongRongQi1.rg_TianJiaZiZuJian2 (rg_WenBenKuang_GengXinNeiRong, null);
        rg_ZongBuJuQi.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian, huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian);
        rg_ZhengBuJuQi1.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian, rg_GaoDu238 - 280);
        rg_ZiBuJuQi.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian, huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian);
        rg_WenBenKuang_GengXinNeiRong.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian, huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian);
        rg_ZongXiangGunDongRongQi1.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian, huoShan.AnZhuo.JiBen.AndroidView.rg_TianManFuZuJian);
        rg_ZiBuJuQi.rg_ZhiWaiBianJu1 (-1, 50, -1, -1);
        rg_TuPianKuang_DingTu.rg_ZhiXuQiuCheCun (200, 180);
        rg_WenBenKuang_GengXinBanBen.rg_ZhiWaiBianJu1 (-1, 110, -1, -1);
        rg_ZongXiangGunDongRongQi1.rg_ZhiWaiBianJu1 (60, 10, 35, 200);
        rg_AnNiu_QueDing.rg_ZhiXuQiuCheCun (huoShan.AnZhuo.JiBen.AndroidView.rg_DengYuNeiRongCheCun, 90);
        rg_AnNiu_QueDing.rg_ZhiNeiBianJu (0, 0, 0, 0);
        rg_AnNiu_QueDing.rg_ZhiWaiBianJu1 (-1, -1, -1, 25);
        rg_TuPianKuang_XianTiao.rg_ZhiXuQiuCheCun (1, 70);
        rg_TuPianAnNiu_GuanBi.rg_ZhiZhuangTaiBeiJingTu (rg_ZhuangTaiTu);
        rg_TuPianAnNiu_GuanBi.rg_ZhiXuQiuCheCun (90, 90);
        rg_TuPianAnNiu_GuanBi.rg_ZhiWaiBianJu1 (-1, -1, -1, 25);
        rg_ZongBuJuQi.rg_NeiRongShuiPingDuiJiFangShi2 (huoShan.AnZhuo.JiBen.rg_ShuiPingDuiJiFangShi2.rg_JuZhong3);
        rg_ZhengBuJuQi1.rg_ZhiZiZuJianDuiJiFangShi (rg_TuPianKuang_DingTu, huoShan.AnZhuo.JiBen.rg_ShuiPingDuiJiFangShi2.rg_JuZhong3, huoShan.AnZhuo.JiBen.rg_ChuiZhiDuiJiFangShi.rg_DingDuiJi);
        rg_ZhengBuJuQi1.rg_ZhiZiZuJianDuiJiFangShi (rg_AnNiu_QueDing, huoShan.AnZhuo.JiBen.rg_ShuiPingDuiJiFangShi2.rg_JuZhong3, huoShan.AnZhuo.JiBen.rg_ChuiZhiDuiJiFangShi.rg_DeDuiJi);
        rg_WenBenKuang_GengXinBanBen.rg_NeiRong8 ("发现新版本V" + rg_BanBenHao11);
        String [] rg_HangNeiRongShuZu1;
        int rg_i32 = 0;
        rg_HangNeiRongShuZu1 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_FenGe (rg_GengXinXiangQing, ";");
        for (rg_i32 = 0; rg_i32 < rg_HangNeiRongShuZu1.length; rg_i32++)
        {
            rg_WenBenKuang_GengXinNeiRong.rg_TianJiaNeiRong ("\n" + rg_HangNeiRongShuZu1 [rg_i32] + "\n");
        }
        rg_DuiHuaKuang15.rg_ZhiZuJian1 (rg_ZongBuJuQi, 0, 0, 0, 0);
        rg_JinDuDuiHuaKuang1.rg_GuanBi3 ();
        rg_DuiHuaKuang15.rg_XianShi13 ();
        rg_TuPianAnNiu_GuanBi.rl_AndroidView_BeiChanJi1 (new huoShan.AnZhuo.JiBen.AndroidView.re_BeiChanJi1 () {
            public int dispatch (huoShan.AnZhuo.JiBen.AndroidView objSource, int nTagNumber) {
                return rg_TuPianAnNiu_BeiChanJi ((huoShan.AnZhuo.JiBen.rg_TuPianAnNiu)objSource, nTagNumber);
            }
        }, 1);
        rg_AnNiu_QueDing.rl_AndroidView_BeiChanJi1 (new huoShan.AnZhuo.JiBen.AndroidView.re_BeiChanJi1 () {
            public int dispatch (huoShan.AnZhuo.JiBen.AndroidView objSource, int nTagNumber) {
                return rg_AnNiu_BeiChanJi ((huoShan.AnZhuo.JiBen.rg_AnNiu)objSource, nTagNumber);
            }
        }, 2);
    }

    protected int rg_XianChengLei_XianChengQiDong13 (huoShan.Java.JiBen.rg_XianChengLei rg_LaiYuanDuiXiang183, int rg_BiaoJiZhi183, java.lang.Object rg_YongHuDuiXiang73, java.lang.Object rg_YongHuDuiXiang74) {
        String rg_url2;
        rg_url2 = huoShan.Java.JiBen.rg_DuiXiangLei3.rg_DuiXiangDaoWenBen (rg_YongHuDuiXiang73);
        rg_http1.rg_HTTPYiBuDouWenJian (rg_url2, 0);
        rg_LaiYuanDuiXiang183.interrupt ();
        return (0);
    }

    protected String rg_KaiShiJinHangXiaZai (String rg_XiaZaiDeZhi4, String rg_BaoCunLuJing8, String rg_BaoCunWenJianMing4) {
        com.lzy.okserver.download.DownloadTask rg_RenWuDuiXiang9;
        rg_RenWuDuiXiang9 = huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiLei.rg_ChuangJianRenWu (rg_XiaZaiDeZhi4, rg_XiaZaiDeZhi4, huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_GET1, null, null, false, false, null, null, null, null);
        if (rg_RenWuDuiXiang9 != null)
        {
            huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei rg_JianTingDuiXiang14;
            rg_JianTingDuiXiang14 = new huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei(null);
            rg_JianTingDuiXiang14.rl_WangLaoXiaZaiJianTingLei_RenWuJinDuGaiBian (new huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei.re_RenWuJinDuGaiBian () {
                public int dispatch (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang27, com.lzy.okgo.model.Progress rg_RenWuJinDu2) {
                    return rg_WangLaoXiaZaiJianTingLei_RenWuJinDuGaiBian (objSource, nTagNumber, rg_YongHuDuiXiang27, rg_RenWuJinDu2);
                }
            }, 0);
            rg_JianTingDuiXiang14.rl_WangLaoXiaZaiJianTingLei_RenWuYiWanCheng (new huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei.re_RenWuYiWanCheng () {
                public int dispatch (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang29, java.io.File rg_WenJian14, com.lzy.okgo.model.Progress rg_RenWuJinDu4) {
                    return rg_WangLaoXiaZaiJianTingLei_RenWuYiWanCheng (objSource, nTagNumber, rg_YongHuDuiXiang29, rg_WenJian14, rg_RenWuJinDu4);
                }
            }, 0);
            rg_JianTingDuiXiang14.rl_WangLaoXiaZaiJianTingLei_RenWuChuXianCuoWu (new huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei.re_RenWuChuXianCuoWu () {
                public int dispatch (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang28, com.lzy.okgo.model.Progress rg_RenWuJinDu3) {
                    return rg_WangLaoXiaZaiJianTingLei_RenWuChuXianCuoWu (objSource, nTagNumber, rg_YongHuDuiXiang28, rg_RenWuJinDu3);
                }
            }, 0);
            rg_RenWuDuiXiang9.register(rg_JianTingDuiXiang14);
            rg_RenWuDuiXiang9.save();
            rg_RenWuDuiXiang9.folder(rg_BaoCunLuJing8);
            rg_RenWuDuiXiang9.fileName(rg_BaoCunWenJianMing4);
            rg_RenWuDuiXiang9.start();
            return (rg_RenWuDuiXiang9.progress.tag + "0%");
        }
        else
        {
            return ("任务创建失败！");
        }
    }

    protected int rg_WangLaoXiaZaiJianTingLei_RenWuJinDuGaiBian (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei rg_LaiYuanDuiXiang184, int rg_BiaoJiZhi184, java.lang.Object rg_YongHuDuiXiang75, com.lzy.okgo.model.Progress rg_RenWuJinDu5) {
        huoShan.AnZhuo.JiBen.rg_AnNiu rg_QueDingAnNiu4 = new huoShan.AnZhuo.JiBen.rg_AnNiu (this, new Button (this));
        rg_QueDingAnNiu4.onInitControlContent (this, null);
        rg_QueDingAnNiu4 = (huoShan.AnZhuo.JiBen.rg_AnNiu)rg_DuiHuaKuang15.rg_ChaZhaoZuJian (1000);
        rg_QueDingAnNiu4.rg_NeiRong8 (String.valueOf ((int)Math.round (huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenJinDuLei.rg_QuJinDu (rg_RenWuJinDu5) * 100)) + "%");
        return (0);
    }

    protected int rg_WangLaoXiaZaiJianTingLei_RenWuYiWanCheng (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei rg_LaiYuanDuiXiang185, int rg_BiaoJiZhi185, java.lang.Object rg_YongHuDuiXiang76, java.io.File rg_WenJian23, com.lzy.okgo.model.Progress rg_RenWuJinDu6) {
        java.io.File rg_AnZhuangWenJian;
        rg_AnZhuangWenJian = new java.io.File ("/sdcard/" + rg_RenWuJinDu6.fileName);
        huoShan.AnZhuo.JiBen.rg_YingYongAnZhuangLei.rg_AnZhuangZiWenJian (this, rg_AnZhuangWenJian);
        return (0);
    }

    protected int rg_WangLaoXiaZaiJianTingLei_RenWuChuXianCuoWu (huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiJianTingLei rg_LaiYuanDuiXiang186, int rg_BiaoJiZhi186, java.lang.Object rg_YongHuDuiXiang77, com.lzy.okgo.model.Progress rg_RenWuJinDu7) {
        huoShan.AnZhuo.JiBen.AndComActivity.rg_DiShiXinXiKuang (this, "下载失败");
        return (0);
    }

    protected int rg_TuPianAnNiu_BeiChanJi (huoShan.AnZhuo.JiBen.rg_TuPianAnNiu rg_LaiYuanDuiXiang187, int rg_BiaoJiZhi187) {
        if (rg_BiaoJiZhi187 == 1)
        {
            rg_DuiHuaKuang15.rg_GuanBi3 ();
        }
        return (0);
    }

    public void rg_TongZhi_BeiChuangJian1 (android.content.Intent rg_QiDongXinXiDuiXiang18, java.lang.Object [] rg_ZaiRuCanShu13, int rg_CanShuShuMu17) {
        super.rg_TongZhi_BeiChuangJian1 (rg_QiDongXinXiDuiXiang18, rg_ZaiRuCanShu13, rg_CanShuShuMu17);
        rg_YunHangShiQuanXian.builder.setPermissions(huoShan.AnZhuo.JiBen.rg_AnZhuoQuanXian.rg_DouWaiBuCunChu);
        rg_YunHangShiQuanXian.builder.setPermissions(huoShan.AnZhuo.JiBen.rg_AnZhuoQuanXian.rg_XieWaiBuCunChu);
        rg_YunHangShiQuanXian.builder.setPermissions(huoShan.AnZhuo.JiBen.rg_AnZhuoQuanXian.rg_AnZhuangYingYongChengXu);
        rg_YunHangShiQuanXian.builder.setPermissions(huoShan.AnZhuo.JiBen.rg_AnZhuoQuanXian.rg_QingQiuAnZhuangYingYongChengXu);
        rg_YunHangShiQuanXian.rg_ZiDongShenQingQuanXian (true, true, false, "本程序运行需要您授予权限", "提示", "确定", "您拒绝了权限导致本程序无法正常运行，请前往系统设置手动启用权限", "提示", "关闭", true, "设置", true);
        huoShan.AnZhuo.rg_YouMengTongJiLei.rg_ChuShiHua37 ("5f215eaeb4b08b653e8f68ed", "Voldev", false);
        huoShan.AnZhuo.WangLao.OKHTTPXiaZai.rg_WangLaoXiaZaiLei.rg_ChuShiHua36 ();
        huoShan.Java.JiBen.rg_XianChengLei rg_ShengJiXianCheng = new huoShan.Java.JiBen.rg_XianChengLei ();
        rg_JinDuDuiHuaKuang1 = huoShan.AnZhuo.JiBen.rg_JinDuDuiHuaKuangLei.rg_ChuangJian19 (this);
        rg_JinDuDuiHuaKuang1.rg_BiaoTi11 ("正在检测");
        rg_JinDuDuiHuaKuang1.rg_NeiRong9 ("请稍等。。。");
        rg_JinDuDuiHuaKuang1.rg_JieWaiChuMoGuanBi1 (true);
        rg_JinDuDuiHuaKuang1.rg_TuiHuiJianGuanBi (true);
        rg_JinDuDuiHuaKuang1.rg_XianShi13 ();
        anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo.rg_Lei_ZiChanWenJianGongJu.rg_ZiChanWenJian_BaoCunDaoBenDe ("hb.mp3", anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo.rg_MuLuGongJuLei.rg_MuLu_QuCunChuLuJing () + "hb.mp3");
        rg_ShengJiXianCheng.rl_XianChengLei_XianChengQiDong (new huoShan.Java.JiBen.rg_XianChengLei.re_XianChengQiDong () {
            public int dispatch (huoShan.Java.JiBen.rg_XianChengLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36) {
                return rg_XianChengLei_XianChengQiDong13 (objSource, nTagNumber, rg_YongHuDuiXiang35, rg_YongHuDuiXiang36);
            }
        }, 0);
        String [] rg_JiaMiWenBen1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        rg_ShengJiXianCheng.rg_QiDong11 ((Object)("http://" + rg_JiaMiWenBen1 [0] + rg_JiaMiWenBen1 [1] + rg_JiaMiWenBen1 [0] + "." + rg_JiaMiWenBen1 [2] + rg_JiaMiWenBen1 [5] + "." + rg_JiaMiWenBen1 [0] + rg_JiaMiWenBen1 [3] + rg_JiaMiWenBen1 [1] + "." + rg_JiaMiWenBen1 [0] + rg_JiaMiWenBen1 [8] + rg_JiaMiWenBen1 [9] + ":" + rg_JiaMiWenBen1 [0] + rg_JiaMiWenBen1 [9] + rg_JiaMiWenBen1 [9] + rg_JiaMiWenBen1 [1] + "/bbxx.txt"), null);
        {
            rg_AnNiu16.rg_XuKe1 (true);
            rg_XianXingBuJuQi2.rg_KeShi2 (huoShan.AnZhuo.JiBen.rg_ZuJianKeShiZhuangTai.rg_WanQuanYinCang);
        }
    }

    protected int rg_AnZhuoWangLaoCaoZuoLei_QingQiuWanBi1 (huoShan.AnZhuo.JiBen.rg_AnZhuoWangLaoCaoZuoLei rg_LaiYuanDuiXiang188, int rg_BiaoJiZhi188, byte [] rg_FanHuiShuJu24, String rg_Cookies4, String rg_XiangYingTou5, int rg_QingQiuSuoYin15) {
        String rg_WangYe1;
        String [] rg_FanHuiShuZu11;
        String rg_BanBenMing;
        rg_WangYe1 = huoShan.Java.JiBen.rg_WenBenXingLei.rg_ZhiDingBianMaZiJieShuZuDaoWenBen (rg_FanHuiShuJu24, huoShan.Java.JiBen.rg_WenBenBianMa.rg_GBK);
        rg_FanHuiShuZu11 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_FenGe (rg_WangYe1, "@");
        if (rg_FanHuiShuZu11.length == 0)
        {
            rg_JinDuDuiHuaKuang1.rg_GuanBi3 ();
            huoShan.AnZhuo.JiBen.AndComActivity.rg_DiShiXinXiKuang (this, "获取信息失败");
            return (0);
        }
        rg_BanBenHao11 = rg_FanHuiShuZu11 [0];
        rg_WenJianDeZhi2 = rg_FanHuiShuZu11 [1];
        rg_GengXinXiangQing = rg_FanHuiShuZu11 [2];
        rg_BanBenMing = huoShan.AnZhuo.WuLiGuanHuaZhiChiKu.rg_YingYongCaoZuoLei.rg_QuZiShenYingYongBanBenMing ();
        rg_BanBenHao11 = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_ShanQuanBuKong (rg_BanBenHao11);
        rg_BanBenMing = anZhuo.MoMingMoKuai.JiBenShuJuLeiXing.rg_WenBenCaoZuoGongJuLei.rg_WenBen_ShanQuanBuKong (rg_BanBenMing);
        rg_BanBenHao11 = huoShan.Java.JiBen.rg_WenBenXingLei.rg_ZiJieShuZuDaoWenBen (huoShan.AnZhuo.YangWang.rg_BianMaLei.rg_WenBenZhuaiZiJieShuZuUTF8_n (rg_BanBenHao11));
        rg_BanBenMing = huoShan.Java.JiBen.rg_WenBenXingLei.rg_ZiJieShuZuDaoWenBen (huoShan.AnZhuo.YangWang.rg_BianMaLei.rg_WenBenZhuaiZiJieShuZuUTF8_n (rg_BanBenMing));
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (rg_BanBenHao11, "");
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (rg_BanBenMing, "");
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (rg_YinQingWenBenJiaJieMi.rg_WenBenMD532WeiXiaoXie (rg_BanBenHao11), "");
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (rg_YinQingWenBenJiaJieMi.rg_WenBenMD532WeiXiaoXie (rg_BanBenMing), "");
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (String.valueOf (huoShan.AnZhuo.YangWang.rg_ShuZuLei.rg_QuShuZuChengYuanShu_ZiJie (huoShan.AnZhuo.YangWang.rg_BianMaLei.rg_WenBenZhuaiZiJieShuZuUTF8_n (rg_BanBenHao11))), "");
        huoShan.AnZhuo.JiBen.rg_ChangYongGongNeng.dbg_log (String.valueOf (huoShan.AnZhuo.YangWang.rg_ShuZuLei.rg_QuShuZuChengYuanShu_ZiJie (huoShan.AnZhuo.YangWang.rg_BianMaLei.rg_WenBenZhuaiZiJieShuZuUTF8_n (rg_BanBenMing))), "");
        if (rg_BanBenHao11.equals (rg_BanBenMing) == false)
        {
            rg_DanChuShengJi ();
        }
        else
        {
            rg_JinDuDuiHuaKuang1.rg_GuanBi3 ();
            huoShan.AnZhuo.JiBen.AndComActivity.rg_DiShiXinXiKuang (this, "当前没有更新版本！");
        }
        return (0);
    }

    public void rg_TongZhi_JiangBeiXiaoHui1 () {
        com.wuliguanhua.toast.Toasts.error(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_TongZhi_JiangBeiXiaoHui1 ();
    }

    public void rg_TongZhi_BeiJiHuo () {
        super.rg_TongZhi_BeiJiHuo ();
        com.umeng.analytics.MobclickAgent.onResume(this);
    }

    public void rg_TongZhi_ShiQuJiHuo () {
        super.rg_TongZhi_ShiQuJiHuo ();
        com.umeng.analytics.MobclickAgent.onPause(this);
    }

    public void rg_TongZhi_BeiTingZhi () {
        com.wuliguanhua.toast.Toasts.error(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_TongZhi_BeiTingZhi ();
    }

    public void rg_TongZhi_QingLiShuJu () {
        com.wuliguanhua.toast.Toasts.error(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.rg_QuChengXu(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_TongZhi_QingLiShuJu ();
    }
}
