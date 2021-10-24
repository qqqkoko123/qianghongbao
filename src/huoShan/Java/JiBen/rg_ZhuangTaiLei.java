
package huoShan.Java.JiBen;

public class rg_ZhuangTaiLei {

    public rg_ZhuangTaiLei ()  { }

    public static final int rg_ChengGong4 = 0;
    public static final int rg_ShiBai2 = -1;
    public static final int rg_YiDouDaoShuJuWeiBu = -100;
    protected int rg_DangQianZhuangTai17;

    public synchronized boolean rg_ZhiZhuangTai (int rg_YuZhiRuZhuangTai) {
        rg_DangQianZhuangTai17 = rg_YuZhiRuZhuangTai;
        return (rg_YiChengGong ());
    }

    public synchronized boolean rg_YiChengGong () {
        return (rg_DangQianZhuangTai17 >= 0);
    }

    public synchronized boolean rg_YiShiBai1 () {
        return (rg_DangQianZhuangTai17 < 0);
    }
}
