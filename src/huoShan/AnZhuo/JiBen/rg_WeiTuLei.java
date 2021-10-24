
package huoShan.AnZhuo.JiBen;

public class rg_WeiTuLei {

    static int computeSampleSize (final int nBitmapWidth, final int nBitmapHeight, int nReqMinSideLength) {
        if (nReqMinSideLength < 0)
            return 1;
        if (nReqMinSideLength <= 1) {
            android.util.DisplayMetrics infDisplay = rg_YingYongChengXu.rg_QuZiYuanGuanLiQi ().getDisplayMetrics ();
            if (nReqMinSideLength == 0)
                nReqMinSideLength = Math.min (infDisplay.widthPixels, infDisplay.heightPixels);
            else
                nReqMinSideLength = Math.max (infDisplay.widthPixels, infDisplay.heightPixels);
        }
        return computeSampleSize (nBitmapWidth, nBitmapHeight, nReqMinSideLength, nReqMinSideLength * nReqMinSideLength);
    }
    static int computeSampleSize (final int nBitmapWidth, final int nBitmapHeight, int nReqMinSideLength, int nReqMaxNumOfPixels) {
        if (nReqMaxNumOfPixels == -1 && nReqMinSideLength == -1)
            return 1;
        double w = nBitmapWidth;
        double h = nBitmapHeight;
        int nSampleSize1 = (nReqMaxNumOfPixels == -1) ? 1 : (int) Math.ceil (Math.sqrt (w * h / nReqMaxNumOfPixels));
        int nSampleSize2 = (nReqMinSideLength == -1) ? 128 :
                (int)Math.min (Math.floor (w / nReqMinSideLength), Math.floor (h / nReqMinSideLength));
        int initialSize;
        if (nReqMaxNumOfPixels == -1)
            initialSize = nSampleSize2;
        else if (nReqMinSideLength == -1)
            initialSize = nSampleSize1;
        else
            initialSize = Math.max (nSampleSize1, nSampleSize2);
        int roundedSize;
        if (initialSize <= 8 ) {
            roundedSize = 1;
            while (roundedSize < initialSize)
                roundedSize <<= 1;
        }
        else
            roundedSize = (initialSize + 7) / 8 * 8;
        return roundedSize;
    }
}
