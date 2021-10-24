
package huoShan.Java.JiBen;

public class rg_DaiLiLei {

    public static final int rg_HTTPDaiLi2 = 1;

    public static java.net.Proxy rg_ChuangJianDuiXiang43 (int rg_Can_DaiLiFangShi, java.net.InetSocketAddress rg_Can_DeZhi6) {
        java.net.Proxy.Type type;
        if (rg_Can_DaiLiFangShi == 2){
            type = java.net.Proxy.Type.SOCKS;
        }else if(rg_Can_DaiLiFangShi == 1){
            type = java.net.Proxy.Type.HTTP;
        }else{
            type = java.net.Proxy.Type.DIRECT;
        }
        try {
            return new java.net.Proxy(type, rg_Can_DeZhi6);
        } catch (Exception e) {
            return null;
        }
    }
}
