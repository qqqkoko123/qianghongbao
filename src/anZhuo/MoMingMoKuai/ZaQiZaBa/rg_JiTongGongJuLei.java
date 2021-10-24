
package anZhuo.MoMingMoKuai.ZaQiZaBa;

public class rg_JiTongGongJuLei {

    public rg_JiTongGongJuLei ()  { }

        /**
            info   输出头,在输出内容之前显示,默认为空文本.
            tag    输出tagname. 默认为 VolDev
            emmss  输出数组.
        */
        public static void printLogE (String info, String tag, Object ... emmss) {
            String outstring = "";
            for (Object emms : emmss) {
                if (emms == null) {
                    emms = new String ("空对象");
                    continue ;
                }
                if (emms instanceof String) {
                    String msg = (String) emms;
                    if (msg.length() <= 3 * 1024) {
                        outstring = outstring + "“" + msg +  "”, ";
                    } else {
                        while (msg.length() > 1024 * 3) {
                            String str = msg.substring (0, 1024 * 3);
                            msg = msg.replace(str, "");
                            android.util.Log.d (tag, str);
                        }
                        android.util.Log.d (tag, msg);
                        return;
                    }
                    continue ;
                }
                else if (emms instanceof Integer) {
                    outstring +=  (Integer)emms + ", ";
                    continue;
                }
                else if (emms instanceof Byte) {
                    outstring +=  (Byte)emms + ", ";
                    continue;
                }
                else if (emms instanceof Double) {
                    outstring +=  (Double)emms + ", ";
                    continue;
                }
                else if (emms instanceof Boolean) {
                    outstring +=  ((Boolean)emms) ? "真" + ", " : "假" + ", ";
                    continue;
                }
                else if (emms instanceof Short) {
                    outstring +=  (Short)emms + ", ";
                    continue;
                }
                else if (emms instanceof Long) {
                    outstring +=  (Long)emms + ", ";
                    continue;
                }
                else  if (emms instanceof int[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "整数：" + s;
                    for (int i : (int []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue ;
                }
                else if (emms instanceof byte[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "字节：" + s;
                    for (byte i : (byte []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof String[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "文本：" + s;
                    for (String i : (String []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof Double[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "小数：" + s;
                    for (Double i : (Double []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof boolean[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "逻辑：" + s;
                    for (Boolean i : (boolean []) emms)
                        s += (i ? "真" : "假") + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof Short[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "短整：" + s;
                    for (Short i : (Short []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof Long[]) {
                    String s = "{";
                    if (rg_Si_ShuChuLeiXing) s = "长整：" + s;
                    for (Long i : (Long []) emms)
                        s += i + ", ";
                    s = s.substring (0, s.length () - 2);
                    s += "}";
                    outstring +=  s + ", ";
                    continue;
                }
                else if (emms instanceof org.json.JSONObject) {
                    org.json.JSONObject obj = (org.json.JSONObject)emms;
                    try {
                        String out = obj.toString (4);
                        String[] arrays = out.split("\n", 0);
                        if (rg_Si_ShuChuLeiXing) out = "|JSON：\n";
                        else out = "\n";
                        for (int i=0; i<arrays.length; i++) {
                            out = out + "|" + arrays[i] + "\n";
                        }
                        printLogE (info, tag, out);
                    } catch (Exception e) {
                        try {
                            printLogE (info, tag, obj.toString ());
                        } catch (Exception ex) {
                        }
                    }
                    return ;
                }
                else if (emms instanceof org.json.JSONArray) {
                    org.json.JSONArray obj = (org.json.JSONArray)emms;
                    try {
                        String out = obj.toString (4);
                        String[] arrays = out.split("\n", 0);
                        if (rg_Si_ShuChuLeiXing) out = "|JSON：\n";
                        else out = "\n";
                        for (int i=0; i<arrays.length; i++) {
                            out = out + "|" + arrays[i] + "\n";
                        }
                        printLogE (info, tag, out);
                    } catch (Exception e) {
                        try {
                            printLogE (info, tag, obj.toString ());
                        } catch (Exception ex) {
                        }
                    }
                    return ;
                }
                else if (emms.getClass() == new java.util.ArrayList<Object>().getClass ()) {
                    java.util.List<Object> mList = (java.util.List<Object>) emms;
                    if (mList == null || mList.size () == 0)
                        return;
                    if (mList.get (0) instanceof Integer) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "整数：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (Integer) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof String) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "文本：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (String) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof Byte) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "字节：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (Byte) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof Double) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "小数：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (Double) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof Boolean) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "逻辑：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += ((Boolean) mList.get (i) ? "真" : "假") + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof Short) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "短整：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (Short) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                    else if (mList.get (0) instanceof Long) {
                        String s = "[";
                        if (rg_Si_ShuChuLeiXing) s = "长整：" + s;
                        for (int i=0; i< mList.size (); i++)
                            s += (Long) mList.get (i) + ", ";
                        s = s.substring (0, s.length () - 2) + "]";
                        outstring +=  s + ", ";
                        continue;
                    }
                } else {
                    outstring += "不支持的数据类型：" + emms.getClass ().toString () + ", ";
                }
            }
            outstring = outstring.substring (0, outstring.length() - 2);
            android.util.Log.d (tag, info + outstring);
        }
    public static boolean rg_Si_ShuChuLeiXing = false;
    public static boolean rg_Si_XuNiAnJianZhuangTai;

    public static String rg_JiTong_QuShouJiHao () {
        huoShan.AnZhuo.SheBei.DianHuaGuanLi.rg_DianHuaGuanLiQiLei rg_DianHuaGuanLiQiLei1 = new huoShan.AnZhuo.SheBei.DianHuaGuanLi.rg_DianHuaGuanLiQiLei ();
        return (rg_DianHuaGuanLiQiLei1.rg_DianHuaKa1HaoMa ());
    }
}
