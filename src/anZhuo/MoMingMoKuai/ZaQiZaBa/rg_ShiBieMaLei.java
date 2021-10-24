
package anZhuo.MoMingMoKuai.ZaQiZaBa;

public class rg_ShiBieMaLei {

    public rg_ShiBieMaLei ()  { }

    public static final int rg_QuIMEI1 = 0;
    public static final int rg_QuMEID1 = 1;
    public static final int rg_QuDianHuaKaShiBieMa = 2;
    public static final int rg_QuSIMID = 3;
    public static final int rg_QuSIMIDMingChen = 4;
    public static final int rg_QuDianHuaKaGuoJiaDaiMa = 5;
    public static final int rg_QuDianHuaKaXuLieHao = 6;
    public static final int rg_QuDianHuaKaYunYingShangDaiMa = 7;
    public static final int rg_QuDianHuaKaYunYingShangMing = 8;
    public static final int rg_QuWangLaoYunYingShangMingChen = 9;
    public static final int rg_QuWangLaoYunYingShangDaiMa = 10;
    public static final int rg_QuDianHuaKa1HaoMa = 11;
    public static final int rg_QuChanPinXuLieHao = 12;
    public static final int rg_QuAnZhuoID1 = 13;

    public static String rg_JiTong_QuShiBieMa (int rg_YaoQuDeShiBieMa, android.app.Activity rg_SuoChuChuangKou35) {
        android.telephony.TelephonyManager rg_DianHuaGuanLi;
        rg_DianHuaGuanLi = (android.telephony.TelephonyManager)rg_SuoChuChuangKou35.getSystemService (huoShan.AnZhuo.JiBen.rg_AnZhuoHuanJing.rg_DianHuaFuWu);
        if (rg_DianHuaGuanLi != null)
        {
            if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuIMEI1)
            {
                if (android.os.Build.VERSION.SDK_INT >= 26)
                {
                    return rg_DianHuaGuanLi.getImei();
                }
                else
                {
                    String rg_ChuanHao;
                    rg_ChuanHao = rg_DianHuaGuanLi.getDeviceId();
                    if (rg_ChuanHao == null)
                    {
                        return ("");
                    }
                    return (rg_ChuanHao);
                }
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuMEID1)
            {
                if (android.os.Build.VERSION.SDK_INT >= 26)
                {
                    String rg_MEID1 = "";
                    rg_MEID1= rg_DianHuaGuanLi.getMeid();
                    if (rg_MEID1 == null)
                    {
                        return ("");
                    }
                    return (rg_MEID1);
                }
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKaShiBieMa)
            {
                String rg_IMSI1;
                rg_IMSI1 = rg_DianHuaGuanLi.getSubscriberId();
                if (rg_IMSI1 == null)
                {
                    return ("");
                }
                return (rg_IMSI1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuSIMID)
            {
                if (android.os.Build.VERSION.SDK_INT >= 28)
                {
                    int rg_SIMID1 = 0;
                    rg_SIMID1=rg_DianHuaGuanLi.getSimCarrierId();
                    return (String.valueOf (rg_SIMID1));
                }
                return ("");
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuSIMIDMingChen)
            {
                String rg_SIMIDMingChen1 = "";
                if (android.os.Build.VERSION.SDK_INT >= 28)
                {
                    rg_SIMIDMingChen1= String.valueOf (rg_DianHuaGuanLi.getSimCarrierIdName());
                    if (rg_SIMIDMingChen1 == null)
                    {
                        return ("");
                    }
                    return (rg_SIMIDMingChen1);
                }
                return ("");
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKaGuoJiaDaiMa)
            {
                String rg_SIMDeOuDaiMa1;
                rg_SIMDeOuDaiMa1 = rg_DianHuaGuanLi.getSimCountryIso();
                if (rg_SIMDeOuDaiMa1 == null)
                {
                    return ("");
                }
                return (rg_SIMDeOuDaiMa1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKaXuLieHao)
            {
                String rg_SIMXuLieHao1;
                rg_SIMXuLieHao1 = rg_DianHuaGuanLi.getSimSerialNumber();
                if (rg_SIMXuLieHao1 == null)
                {
                    return ("");
                }
                return (rg_SIMXuLieHao1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKaYunYingShangDaiMa)
            {
                String rg_SIMShuZiMingChen1;
                rg_SIMShuZiMingChen1 = rg_DianHuaGuanLi.getSimOperator();
                if (rg_SIMShuZiMingChen1 == null)
                {
                    return ("");
                }
                return (rg_SIMShuZiMingChen1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKaYunYingShangMing)
            {
                String rg_SIMFuWuDiGongMingChen1;
                rg_SIMFuWuDiGongMingChen1 = rg_DianHuaGuanLi.getSimOperatorName();
                if (rg_SIMFuWuDiGongMingChen1 == null)
                {
                    return ("");
                }
                return (rg_SIMFuWuDiGongMingChen1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuWangLaoYunYingShangMingChen)
            {
                String rg_WangLaoZiMuMingChen1;
                rg_WangLaoZiMuMingChen1 = rg_DianHuaGuanLi.getNetworkOperatorName();
                if (rg_WangLaoZiMuMingChen1 == null)
                {
                    return ("");
                }
                return (rg_WangLaoZiMuMingChen1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuWangLaoYunYingShangDaiMa)
            {
                String rg_WangLaoShuZiMingChen1;
                rg_WangLaoShuZiMingChen1 = rg_DianHuaGuanLi.getNetworkOperator();
                if (rg_WangLaoShuZiMingChen1 == null)
                {
                    return ("");
                }
                return (rg_WangLaoShuZiMingChen1);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuDianHuaKa1HaoMa)
            {
                return (rg_JiTongGongJuLei.rg_JiTong_QuShouJiHao ());
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuChanPinXuLieHao)
            {
                String rg_XuLieHao18;
                rg_XuLieHao18 = huoShan.AnZhuo.SheBei.DianHuaGuanLi.rg_JiTongXinXiLei.rg_QuSNMa ();
                if (rg_XuLieHao18 == null)
                {
                    return ("");
                }
                return (rg_XuLieHao18);
            }
            else if (rg_YaoQuDeShiBieMa == rg_ShiBieMaLei.rg_QuAnZhuoID1)
            {
                return (huoShan.AnZhuo.SheBei.DianHuaGuanLi.rg_JiTongXinXiLei.rg_QuAnZhuoID (rg_SuoChuChuangKou35));
            }
            else
            {
                return ("");
            }
        }
        return ("");
    }
}
