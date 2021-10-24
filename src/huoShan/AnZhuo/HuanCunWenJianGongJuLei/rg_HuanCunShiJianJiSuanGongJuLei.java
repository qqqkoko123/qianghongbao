
package huoShan.AnZhuo.HuanCunWenJianGongJuLei;

class rg_HuanCunShiJianJiSuanGongJuLei {

    public rg_HuanCunShiJianJiSuanGongJuLei ()  { }

    protected static final char rg_Chang_KongZiFu = ' ';

    protected static boolean rg_ShiFouYouRiJi (byte [] rg_YaoPanDuanDeZiJie1) {
        return (rg_YaoPanDuanDeZiJie1 != null && rg_YaoPanDuanDeZiJie1.length > 15 && rg_YaoPanDuanDeZiJie1 [13] == '-' && rg_ZiJieShuZuChaZhaoZiFu (rg_YaoPanDuanDeZiJie1, rg_Chang_KongZiFu) > 14);
    }

    protected static int rg_ZiJieShuZuChaZhaoZiFu (byte [] rg_ZiJieShuJu1, char rg_ZiFuShuJu) {
        for (int i = 0; i < rg_ZiJieShuJu1.length; i++)
            if (rg_ZiJieShuJu1[i] == rg_ZiFuShuJu)
                 return i;
        return -1;
    }
}
