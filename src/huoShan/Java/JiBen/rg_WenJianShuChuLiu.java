
package huoShan.Java.JiBen;

public class rg_WenJianShuChuLiu {

    public static java.io.FileOutputStream rg_ChuangJian322 (String rg_SuoJiYuWenJianLuJing2, boolean rg_ShiFouTianJiaDaoYuanNeiRongHou) {
        try {
            return new java.io.FileOutputStream (rg_SuoJiYuWenJianLuJing2, rg_ShiFouTianJiaDaoYuanNeiRongHou);
        } catch (Exception e) {
            return null;
        }
    }
}
