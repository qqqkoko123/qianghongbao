
package huoShan.AnZhuo.JiBen;

public class rg_AnZhuoChuangKouHuanJing {

    public static void rg_QiDongAnZhuoChuangKou (android.content.Context rg_YuChuLiDeBenDuiXiang23, android.content.Intent rg_QiDongXinXi8, android.os.Bundle rg_QiDongCanShu) {
        if (rg_QiDongCanShu == null)
        {
            rg_YuChuLiDeBenDuiXiang23.startActivity (rg_QiDongXinXi8);
        }
        else
        {
            rg_YuChuLiDeBenDuiXiang23.startActivity (rg_QiDongXinXi8, rg_QiDongCanShu);
        }
    }
}
