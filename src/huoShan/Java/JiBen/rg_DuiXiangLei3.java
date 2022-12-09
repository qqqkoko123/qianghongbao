
package huoShan.Java.JiBen;

public class rg_DuiXiangLei3 {

    public static int rg_DuiXiangDaoZhengShu (java.lang.Object rg_DaiZhuaiHuanDuiXiang3) {
        if (rg_DaiZhuaiHuanDuiXiang3 instanceof Integer)         { return (int)(Integer)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Character)  { return (int)(char)(Character)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Byte)       { return (int)(byte)(Byte)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Short)      { return (int)(short)(Short)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Long)       { return (int)(long)(Long)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Float)      { return (int)(float)(Float)rg_DaiZhuaiHuanDuiXiang3; }
        else if (rg_DaiZhuaiHuanDuiXiang3 instanceof Double)     { return (int)(double)(Double)rg_DaiZhuaiHuanDuiXiang3; }
        else { return 0; }
    }

    public static String rg_DuiXiangDaoWenBen (java.lang.Object rg_DaiZhuaiHuanDuiXiang7) {
        if (rg_DaiZhuaiHuanDuiXiang7 instanceof String)  { return (String)rg_DaiZhuaiHuanDuiXiang7; }
        else { return ""; }
    }
}
