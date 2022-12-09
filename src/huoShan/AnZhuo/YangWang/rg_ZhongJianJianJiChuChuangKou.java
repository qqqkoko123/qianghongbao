
package huoShan.AnZhuo.YangWang;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_ZhongJianJianJiChuChuangKou extends huoShan.AnZhuo.JiBen.rg_ChuangKou {

    public rg_ZhongJianJianJiChuChuangKou ()  { }

    protected int rg_ChuangKouBiaoJiZhi;

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN) public void rg_ZhuXianChengJieShouShiJianLei (rg_ShuJuXinXiJiGeLei rg_ShiJian26) {
        if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("分页查询"))
        {
            rg_FenYeChaXunShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_DiShiXinXi10, rg_ShiJian26.rg_ShiJianLeiXing22, rg_ShiJian26.rg_JiLuJiShu6, rg_ShiJian26.rg_ZiDuanShu6, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48, rg_ShiJian26.rg_CuoWuMiaoShu100);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("记录集更新"))
        {
            rg_JiLuJiGengXinShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("请求文件"))
        {
            rg_QingQiuWenJianShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_QingQiuJieGuo7, rg_ShiJian26.rg_WenJianShuJu3);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("断连"))
        {
            rg_DuanLianShiJian_n (rg_ChuangKouBiaoJiZhi);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("数据到达"))
        {
            rg_ShuJuDaoDaShiJian_n1 (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_DangQianShuJuChangDu8, rg_ShiJian26.rg_SuoJieShouDaoShuJu7);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("创建数据库表"))
        {
            rg_ChuangJianShuJuKuBiaoShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_JieGuoDiShi3, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_ShiJianLeiXing22);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("取库表名"))
        {
            rg_QuKuBiaoMingShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_HuoQuLeiXing3, rg_ShiJian26.rg_HuoDeJieGuo3, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("执行事务"))
        {
            rg_ZhiHangShiWuShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_ShiWuLeiXing3, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("执行SQL语句"))
        {
            rg_ZhiHangSQLYuGouShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ZhiHangJieGuo21, rg_ShiJian26.rg_DiShiXinXi10, rg_ShiJian26.rg_JiLuJiShu6, rg_ShiJian26.rg_ZiDuanShu6, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48, rg_ShiJian26.rg_CuoWuMiaoShu100);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("取连接"))
        {
            rg_QuLianJieShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_LianJieBiaoJi48, rg_ShiJian26.rg_HuoQuJieGuo4, rg_ShiJian26.rg_ShuJuKuLeiXing61, rg_ShiJian26.rg_YiBuBiaoJi48, rg_ShiJian26.rg_ShiJianLeiXing22);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("数据库连接"))
        {
            rg_ShuJuKuLianJieShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_LianJieJieGuo3, rg_ShiJian26.rg_ShuJuKuLeiXing61);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("是否存活"))
        {
            rg_ShiFouCunHuoShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_ShiFouCunHuo3);
        }
        else if ((rg_ShiJian26.rg_ShiJianMingChen).equals ("提示信息"))
        {
            rg_DiShiXinXiShiJian_n (rg_ChuangKouBiaoJiZhi, rg_ShiJian26.rg_DiShiNeiRong14);
        }
    }

    protected void rg_FenYeChaXunShiJian_n (int rg_ChuangKouBiaoJi1, boolean rg_ZhiHangJieGuo7, String rg_DiShiXinXi6, String rg_ShiJianLeiXing16, int rg_JiLuJiShu2, int rg_ZiDuanShu2, String rg_ShuJuKuLeiXing45, int rg_YiBuBiaoJi36, String rg_CuoWuMiaoShu96) {
    }

    protected void rg_JiLuJiGengXinShiJian_n (int rg_ChuangKouBiaoJi2, boolean rg_ZhiHangJieGuo8, String rg_ShuJuKuLeiXing46, int rg_YiBuBiaoJi37) {
    }

    protected void rg_QingQiuWenJianShiJian_n (int rg_ChuangKouBiaoJi3, String rg_QingQiuJieGuo5, byte [] rg_WenJianShuJu1) {
    }

    protected void rg_DuanLianShiJian_n (int rg_ChuangKouBiaoJi4) {
    }

    protected void rg_ShuJuDaoDaShiJian_n1 (int rg_ChuangKouBiaoJi5, int rg_DangQianShuJuChangDu6, byte [] rg_SuoJieShouDaoShuJu5) {
    }

    protected void rg_ChuangJianShuJuKuBiaoShiJian_n (int rg_ChuangKouBiaoJi6, boolean rg_ZhiHangJieGuo9, String rg_JieGuoDiShi1, String rg_ShuJuKuLeiXing47, String rg_ShiJianLeiXing17) {
    }

    protected void rg_QuKuBiaoMingShiJian_n (int rg_ChuangKouBiaoJi7, boolean rg_ZhiHangJieGuo10, String rg_HuoQuLeiXing1, String [] rg_HuoDeJieGuo1, String rg_ShuJuKuLeiXing48, int rg_YiBuBiaoJi38) {
    }

    protected void rg_ZhiHangShiWuShiJian_n (int rg_ChuangKouBiaoJi8, boolean rg_ZhiHangJieGuo11, String rg_ShiWuLeiXing1, String rg_ShuJuKuLeiXing49, int rg_YiBuBiaoJi39) {
    }

    protected void rg_ZhiHangSQLYuGouShiJian_n (int rg_ChuangKouBiaoJi9, boolean rg_ZhiHangJieGuo12, String rg_DiShiXinXi7, int rg_JiLuJiShu3, int rg_ZiDuanShu3, String rg_ShuJuKuLeiXing50, int rg_YiBuBiaoJi40, String rg_CuoWuMiaoShu97) {
    }

    protected void rg_QuLianJieShiJian_n (int rg_ChuangKouBiaoJi10, int rg_LianJieBiaoJi46, String rg_HuoQuJieGuo2, String rg_ShuJuKuLeiXing51, int rg_YiBuBiaoJi41, String rg_ShiJianLeiXing18) {
    }

    protected void rg_ShuJuKuLianJieShiJian_n (int rg_ChuangKouBiaoJi11, boolean rg_LianJieJieGuo1, String rg_ShuJuKuLeiXing52) {
    }

    protected void rg_ShiFouCunHuoShiJian_n (int rg_ChuangKouBiaoJi12, boolean rg_ShiFouCunHuo1) {
    }

    protected void rg_DiShiXinXiShiJian_n (int rg_ChuangKouBiaoJi13, String rg_DiShiNeiRong12) {
    }

    protected void rg_QuShiJianShiJian_n (long rg_ShiJianChuo27, boolean rg_ZhiHangJieGuo13) {
    }

    public void rg_TongZhi_BeiChuangJian7 (android.content.Intent rg_QiDongXinXiDuiXiang18, java.lang.Object [] rg_ZaiRuCanShu13, int rg_CanShuShuMu17) {
        super.rg_TongZhi_BeiChuangJian7 (rg_QiDongXinXiDuiXiang18, rg_ZaiRuCanShu13, rg_CanShuShuMu17);
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
    }

    public void rg_TongZhi_JiangBeiXiaoHui6 () {
        super.rg_TongZhi_JiangBeiXiaoHui6 ();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }
}
