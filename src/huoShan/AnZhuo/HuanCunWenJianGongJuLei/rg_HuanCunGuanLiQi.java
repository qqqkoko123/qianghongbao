
package huoShan.AnZhuo.HuanCunWenJianGongJuLei;

class rg_HuanCunGuanLiQi {

    public rg_HuanCunGuanLiQi ()  { }

    protected java.io.File rg_HuanCunMuLu;
    protected long rg_HuanCunDaXiaoXianZhi;
    protected int rg_HuanCunShuLiangXianZhi;
    protected java.util.concurrent.atomic.AtomicLong rg_HuanCunDaXiao = new java.util.concurrent.atomic.AtomicLong ();
    protected java.util.concurrent.atomic.AtomicInteger rg_HuanCunShuLiang = new java.util.concurrent.atomic.AtomicInteger ();
    protected java.util.Map<java.io.File, java.lang.Long> rg_HuanCunWenJianBiao;
    public rg_HuanCunGuanLiQi(java.io.File cacheDir,long sizeLimit,int countLimit)
    {
        rg_HuanCunWenJianBiao = java.util.Collections.synchronizedMap(new java.util.HashMap<java.io.File, Long>());
        rg_HuanCunMuLu = cacheDir;
        rg_HuanCunDaXiaoXianZhi = sizeLimit;
        rg_HuanCunShuLiangXianZhi = countLimit;
        rg_JiSuanHuanCunDaXiaoHeHuanCunShuLiang();
    }

    protected void rg_JiSuanHuanCunDaXiaoHeHuanCunShuLiang () {
        huoShan.Java.JiBen.rg_XianChengLei rg_XianCheng = new huoShan.Java.JiBen.rg_XianChengLei ();
        rg_XianCheng.rl_XianChengLei_XianChengQiDong (new huoShan.Java.JiBen.rg_XianChengLei.re_XianChengQiDong () {
            public int dispatch (huoShan.Java.JiBen.rg_XianChengLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang35, java.lang.Object rg_YongHuDuiXiang36) {
                return rg_XianChengLei_XianChengQiDong2 (objSource, nTagNumber, rg_YongHuDuiXiang35, rg_YongHuDuiXiang36);
            }
        }, 666);
        rg_XianCheng.rg_QiDong11 (null, null);
    }

    protected int rg_XianChengLei_XianChengQiDong2 (huoShan.Java.JiBen.rg_XianChengLei rg_LaiYuanDuiXiang29, int rg_BiaoJiZhi29, java.lang.Object rg_YongHuDuiXiang14, java.lang.Object rg_YongHuDuiXiang15) {
        if (rg_BiaoJiZhi29 == 666)
        {
            int rg_JuBu_WenJianDaXiao = 0;
            int rg_JuBu_WenJianShuLiang = 0;
            java.io.File [] rg_WenJianLieBiao;
            rg_WenJianLieBiao = rg_HuanCunMuLu.listFiles ();
            if (rg_WenJianLieBiao != null)
            {
                int rg_i1 = 0;
                for (rg_i1 = 0; rg_i1 < rg_WenJianLieBiao.length; rg_i1++)
                {
                    rg_JuBu_WenJianDaXiao = (int)(rg_JuBu_WenJianDaXiao + (rg_WenJianLieBiao [rg_i1].length ()));
                    rg_JuBu_WenJianShuLiang = rg_JuBu_WenJianShuLiang + 1;
                    rg_WenJianMingLeiDaoChangZhengShuLeiJianZhiDuiJiGeLei.rg_JiaRuJianZhiDui (rg_HuanCunWenJianBiao, rg_WenJianLieBiao [rg_i1], new java.lang.Long (rg_WenJianLieBiao [rg_i1].length ()));
                }
                huoShan.Java.JiBen.rg_YuanZiChangZhengShuLei.rg_DangQianZhi16 (rg_HuanCunDaXiao, rg_JuBu_WenJianDaXiao);
                huoShan.Java.JiBen.rg_YuanZiZhengShuLei.rg_DangQianZhi14 (rg_HuanCunShuLiang, rg_JuBu_WenJianShuLiang);
            }
        }
        return (0);
    }

    public long rg_ShanChuGuoJiWenJian () {
        if (rg_HuanCunWenJianBiao.isEmpty())
        {
            return (0);
        }
        java.lang.Long rg_JuBu_ShiJian;
        java.io.File rg_JuBu_ShiYongShiJianZuiChangDeWenJian = null;
        java.util.Set<java.util.Map.Entry<java.io.File, java.lang.Long>> rg_JuBu_ShuJuJi;
        rg_JuBu_ShiJian = new java.lang.Long (0);
        rg_JuBu_ShuJuJi = rg_HuanCunWenJianBiao.entrySet();
        synchronized(rg_HuanCunWenJianBiao)
        {
            for(java.util.Map.Entry<java.io.File,Long> entry : rg_JuBu_ShuJuJi)
            {
                if (rg_JuBu_ShiYongShiJianZuiChangDeWenJian == null)
                {
                    rg_JuBu_ShiYongShiJianZuiChangDeWenJian = entry.getKey();
                    rg_JuBu_ShiJian = entry.getValue();
                }
                else
                {
                    java.lang.Long rg_lastValueUsage = null;
                    rg_lastValueUsage = entry.getValue();
                    if (rg_lastValueUsage.longValue () < rg_JuBu_ShiJian.longValue ())
                    {
                        rg_JuBu_ShiJian = rg_lastValueUsage;
                        rg_JuBu_ShiYongShiJianZuiChangDeWenJian = entry.getKey();
                    }
                }
            }
        }
        long rg_JuBu_WenJianDaXiao2;
        rg_JuBu_WenJianDaXiao2 = rg_JuBu_ShiYongShiJianZuiChangDeWenJian.length ();
        if (rg_JuBu_ShiYongShiJianZuiChangDeWenJian.exists ())
        {
            rg_WenJianMingLeiDaoChangZhengShuLeiJianZhiDuiJiGeLei.rg_ShanChuJian2 (rg_HuanCunWenJianBiao, rg_JuBu_ShiYongShiJianZuiChangDeWenJian);
        }
        return (rg_JuBu_WenJianDaXiao2);
    }
}
