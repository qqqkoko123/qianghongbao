
package huoShan.AnZhuo;

public class rg_YouMengTongJiLei {

    public rg_YouMengTongJiLei ()  { }

    public static void rg_ChuShiHua37 (final String rg_YingYongID, final String rg_QuDaoBiaoShi, final boolean rg_YeMianZiDongCaiJi) {
        if (huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sIsUiThread ()) {
            try {
                com.umeng.commonsdk.UMConfigure.init(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp (), rg_YingYongID, rg_QuDaoBiaoShi, 1, null);
            } catch (Exception e) { }
        } else {
            huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        com.umeng.commonsdk.UMConfigure.init(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp (), rg_YingYongID, rg_QuDaoBiaoShi, 1, null);
                    } catch (Exception e) { }
                } } );
        }
        if (rg_YeMianZiDongCaiJi)
        {
            com.umeng.analytics.MobclickAgent.setPageCollectionMode(com.umeng.analytics.MobclickAgent.PageMode.AUTO);
        }
        else
        {
            com.umeng.analytics.MobclickAgent.setPageCollectionMode(com.umeng.analytics.MobclickAgent.PageMode.MANUAL);
        }
    }
}
