
package huoShan.AnZhuo.LaYaDaYin;

public class rg_LaYaBiaoQianDaYinLei extends rg_LaYaDaYinJiChuLei {

    public rg_LaYaBiaoQianDaYinLei ()  { }

    public rg_LaYaBiaoQianDaYinLei (int a) { }
    protected java.util.ArrayList<java.lang.Byte> rg_MingLingZiJieShuZu1 = new java.util.ArrayList<java.lang.Byte> ();
    protected String rg_MingLingHang1 = "";
      public static byte[] printTscDraw(int i, int i2, android.graphics.Bitmap bitmap) {
            byte[] bArr;
            android.graphics.Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width / 8;
            byte[] bArr2 = new byte[i3];
            StringBuilder sb = new StringBuilder();
            sb.append("BITMAP ");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(i3);
            sb.append(",");
            sb.append(height);
            sb.append(",");
            sb.append("2");
            sb.append(",");
            try {
                bArr = sb.toString().getBytes("GB2312");
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                bArr = null;
            }
            byte[] bArr3 = new byte[((i3 * height) + bArr.length + 8)];
            for (int i4 = 0; i4 < bArr.length; i4++) {
                bArr3[i4] = bArr[i4];
            }
            int length = bArr.length - 1;
            int i5 = 0;
            while (i5 < height) {
                int i6 = 0;
                while (i6 < i3) {
                    int i7 = i6 * 8;
                    int i8 = height;
                    bArr2[i6] = (byte) (((bitmap2.getPixel(i7, i5) == -1 ? 1 : 0) * 128) + ((bitmap2.getPixel(i7 + 1, i5) == -1 ? 1 : 0) * 64) + ((bitmap2.getPixel(i7 + 2, i5) == -1 ? 1 : 0) * 32) + ((bitmap2.getPixel(i7 + 3, i5) == -1 ? 1 : 0) * 16) + ((bitmap2.getPixel(i7 + 4, i5) == -1 ? 1 : 0) * 8) + ((bitmap2.getPixel(i7 + 5, i5) == -1 ? 1 : 0) * 4) + ((bitmap2.getPixel(i7 + 6, i5) == -1 ? 1 : 0) * 2) + (bitmap2.getPixel(i7 + 7, i5) == -1 ? 1 : 0));
                    i6++;
                    height = i8;
                }
                int i9 = height;
                for (int i10 = 0; i10 < i3; i10++) {
                    length++;
                    bArr3[length] = bArr2[i10];
                }
                i5++;
                height = i9;
            }
            return bArr3;
        }
}
