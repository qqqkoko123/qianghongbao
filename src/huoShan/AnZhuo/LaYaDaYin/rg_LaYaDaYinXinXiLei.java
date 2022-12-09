
package huoShan.AnZhuo.LaYaDaYin;

class rg_LaYaDaYinXinXiLei {

    public rg_LaYaDaYinXinXiLei ()  { }

    public static String rg_LaYaDeZhi1 = "";
    public static String rg_LaYaMingChen1 = "";

    public static String rg_QuSheBeiDeZhi () {
        return (rg_LaYaDeZhi1);
    }

    public static void rg_ZhiSheBeiDeZhi (String rg_XinDeZhi1) {
        rg_LaYaDeZhi1 = rg_XinDeZhi1;
    }

    public static void rg_ZhiSheBeiMingChen (String rg_XinMingChen) {
        rg_LaYaMingChen1 = rg_XinMingChen;
    }
}
