
package huoShan.AnZhuo.JiBen;

import android.util.Log;
import android.widget.Toast;

public class rg_ChangYongGongNeng {

    public rg_ChangYongGongNeng ()  { }

    public static void dbg_log (String format, Object... args) {
       if (args == null || args.length == 0 || args [0] == "")
           rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (format);
       else
           rg_ChangYongGongNeng.rg_ShuChuDiaoShiWenBen (String.format (format, args));
    }

    public static void rg_ShuChuDiaoShiWenBen (String rg_YuShuChuWenBen) {
    }
}
