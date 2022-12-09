
package anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo;

public class rg_WenJianCaoZuoGongJuLei {

    public rg_WenJianCaoZuoGongJuLei ()  { }

    public static boolean rg_WenJian_FuMuLuShiFouCunZai (String rg_Can_WenJianLuJing7) {
        return ((new java.io.File (rg_Can_WenJianLuJing7).getParentFile ()).exists ());
    }

    public static boolean rg_WenJian_ShiFouCunZai (String rg_Can_WenJianLuJing15) {
        return (new java.io.File (rg_Can_WenJianLuJing15).exists ());
    }
}
