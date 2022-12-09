
package anZhuo.MoMingMoKuai.ZaQiZaBa;

public class rg_RootGongJuLei {

    public rg_RootGongJuLei ()  { }

     static Process process;
     static java.io.DataInputStream inputStream;
     static java.io.DataOutputStream  outputStream;
     static java.io.BufferedReader reader;

    public static int rg_Root_ZhiHangMingLing (String rg_Can_MingLingHang) {
          int i = -1;
            try {
              Process process = Runtime.getRuntime().exec("su");
              outputStream = new java.io.DataOutputStream(process.getOutputStream());
              outputStream.writeBytes(rg_Can_MingLingHang + "\n");
              outputStream.flush();
              outputStream.writeBytes("exit\n");
              outputStream.flush();
              process.waitFor();
              i = process.exitValue();
            } catch (Exception e) {
              e.printStackTrace();
            } finally {
              if (outputStream != null) {
                try {
                  outputStream.close();
                } catch (java.io.IOException e2) {
                  e2.printStackTrace();
                }
              }
            }
            return i;
    }
}
