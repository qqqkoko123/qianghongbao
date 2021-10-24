
package huoShan.AnZhuo.JiBen;

public class rg_ZhuangTaiDaoTuXiangBiao {

    public rg_ZhuangTaiDaoTuXiangBiao ()  { }

    public int rg_SuoChuChuangKouBeiJiHuo2;
    public int rg_BeiXuanZe4;
    public int rg_HuoDeJiaoDian4;
    public int rg_BeiJinZhi2;
    public int rg_BeiAnXia2;
    public int rg_BeiJiHuo2;
    public int rg_ZhiZhenYiGuo2;
    public int rg_ZhiZhenTuoGuo2;
    public int rg_ZhiZhenTuoGuoQieKeFangXia2;
    public int rg_TongChang5;

    public android.graphics.drawable.StateListDrawable rg_ChuangJian29 () {
        android.graphics.drawable.Drawable rg_JuBu_TongChangKeHuiZhiDuiXiang;
        rg_JuBu_TongChangKeHuiZhiDuiXiang = rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_TongChang5);
        if (rg_JuBu_TongChangKeHuiZhiDuiXiang == null)
        {
            return (null);
        }
        android.graphics.drawable.StateListDrawable list = new android.graphics.drawable.StateListDrawable ();
        if (rg_BeiJinZhi2 != 0)
            list.addState (new int [] { -android.R.attr.state_enabled }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_BeiJinZhi2));
        if (rg_BeiAnXia2 != 0)
            list.addState (new int [] { android.R.attr.state_pressed, android.R.attr.state_window_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_BeiAnXia2));
        if (rg_ZhiZhenTuoGuoQieKeFangXia2 != 0)
            list.addState (new int [] { android.R.attr.state_drag_can_accept, android.R.attr.state_window_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_ZhiZhenTuoGuoQieKeFangXia2));
        if (rg_ZhiZhenTuoGuo2 != 0)
            list.addState (new int [] { android.R.attr.state_drag_hovered, android.R.attr.state_window_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_ZhiZhenTuoGuo2));
        if (rg_ZhiZhenYiGuo2 != 0)
            list.addState (new int [] { android.R.attr.state_hovered, android.R.attr.state_window_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_ZhiZhenYiGuo2));
        if (rg_BeiXuanZe4 != 0)
            list.addState (new int [] { android.R.attr.state_selected }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_BeiXuanZe4));
        if (rg_HuoDeJiaoDian4 != 0)
            list.addState (new int [] { android.R.attr.state_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_HuoDeJiaoDian4));
        if (rg_BeiJiHuo2 != 0)
            list.addState (new int [] { android.R.attr.state_activated }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_BeiJiHuo2));
        if (rg_SuoChuChuangKouBeiJiHuo2 != 0)
            list.addState (new int [] { android.R.attr.state_window_focused }, rg_ZiYuanGuanLiQi.rg_ZaiRuKeHuiZhiZiYuan (rg_SuoChuChuangKouBeiJiHuo2));
        list.addState (android.util.StateSet.WILD_CARD, rg_JuBu_TongChangKeHuiZhiDuiXiang);
        return list;
    }
}
