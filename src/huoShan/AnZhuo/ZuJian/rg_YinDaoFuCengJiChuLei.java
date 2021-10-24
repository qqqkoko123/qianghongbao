
package huoShan.AnZhuo.ZuJian;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.voldp.ctrl.MeasureUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class rg_YinDaoFuCengJiChuLei extends android.view.View {

    public static final int VIEWSTYLE_RECT = 0;
    public static final int VIEWSTYLE_CIRCLE = 1;
    public static final int VIEWSTYLE_OVAL = 2;
    public static final int MASKBLURSTYLE_SOLID = 0;
    public static final int MASKBLURSTYLE_NORMAL = 1;
    private Bitmap fgBitmap;
    private Bitmap jtUpLeft,jtUpRight,jtUpCenter,jtDownRight,jtDownLeft,jtDownCenter;
    private Canvas mCanvas;
    private Paint mPaint;
    private int screenW,screenH;
    private View targetView;
    private boolean touchOutsideCancel = true;
    private int borderWitdh = 10;
    private int offestMargin = 10;
    private int margin = 10;
    private int highLightStyle = VIEWSTYLE_CIRCLE;
    public int maskblurstyle = MASKBLURSTYLE_NORMAL;
    private Bitmap tipBitmap;
    private int radius;
    private int maskColor = 0x99000000;
    private OnDismissListener onDismissListener;
    private int statusBarHeight = 0;
    private ArrayList <View> targetViews;
    private ArrayList <Integer> tipViews;
    private Rect tipViewHitRect;
    private boolean showArrow = true;
    private int jtUpLeftMoveX,jtUpRightMoveX,jtUpCenterMoveX,jtDownRightMoveX,jtDownLeftMoveX,jtDownCenterMoveX;
    private int tipViewMoveX;
    private LinkedHashMap <View,Integer> tipViewMoveXMap = new LinkedHashMap <View,Integer>();
    private int tipViewMoveY;
    private LinkedHashMap <View,Integer> tipViewMoveYMap = new LinkedHashMap <View,Integer>();
    public rg_YinDaoFuCengJiChuLei(Context context) {
        this(context, null);
    }
    public rg_YinDaoFuCengJiChuLei(Context context, AttributeSet set) {
        this(context, set, -1);
    }
    public rg_YinDaoFuCengJiChuLei(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (attrs != null) {
            TypedArray array = context.obtainStyledAttributes(attrs, com.qqq.WXhongbao.R.styleable.UserGuideView);
            highLightStyle = array.getInt(com.qqq.WXhongbao.R.styleable.UserGuideView_HighlightViewStyle, VIEWSTYLE_RECT);
            maskblurstyle = array.getInt(com.qqq.WXhongbao.R.styleable.UserGuideView_MaskBlurStyle, MASKBLURSTYLE_SOLID);
            BitmapDrawable drawable = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_tipView);
            maskColor = array.getColor(com.qqq.WXhongbao.R.styleable.UserGuideView_maskColor, maskColor);
            if (drawable != null) {
                tipBitmap = drawable.getBitmap();
            }
            BitmapDrawable jtUpCenter = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_up_center);
            BitmapDrawable jtUpLeft = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_up_left);
            BitmapDrawable jtUpRight = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_up_right);
            BitmapDrawable jtDownCenter = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_down_center);
            BitmapDrawable jtDownLeft = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_down_left);
            BitmapDrawable jtDownRight = (BitmapDrawable) array.getDrawable(com.qqq.WXhongbao.R.styleable.UserGuideView_indicator_arrow_down_right);
            if (jtUpCenter != null) {
                this.jtUpCenter = jtUpCenter.getBitmap();
            } else {
                this.jtUpCenter = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_up_center);
            }
            if (jtUpLeft != null) {
                this.jtUpLeft = jtUpLeft.getBitmap();
            } else {
                this.jtUpLeft = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_up_left);
            }
            if (jtUpRight != null) {
                this.jtUpRight = jtUpRight.getBitmap();
            } else {
                this.jtUpRight = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_up_right);
            }
            if (jtDownCenter != null) {
                this.jtDownCenter = jtDownCenter.getBitmap();
            } else {
                this.jtDownCenter = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_down_center);
            }
            if (jtDownLeft != null) {
                this.jtDownLeft = jtDownLeft.getBitmap();
            } else {
                this.jtDownLeft = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_down_left);
            }
            if (jtDownRight != null) {
                this.jtDownRight = jtDownRight.getBitmap();
            } else {
                this.jtDownRight = BitmapFactory.decodeResource(getResources(), com.qqq.WXhongbao.R.drawable.jt_down_right);
            }
            array.recycle();
        }
        cal(context);
        init(context);
    }
    private void cal(Context context) {
        int[] screenSize = MeasureUtil.getScreenSize(context);
        screenW = screenSize[0];
        screenH = screenSize[1];
    }
    private void init(Context context) {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        mPaint.setARGB(0, 255, 0, 0);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        BlurMaskFilter.Blur blurStyle = null;
        switch (maskblurstyle) {
            case MASKBLURSTYLE_SOLID:
                blurStyle = BlurMaskFilter.Blur.SOLID;
                break;
            case MASKBLURSTYLE_NORMAL:
                blurStyle = BlurMaskFilter.Blur.NORMAL;
                break;
        }
        mPaint.setMaskFilter(new BlurMaskFilter(15, blurStyle));
        fgBitmap = MeasureUtil.createBitmapSafely(screenW, screenH, Bitmap.Config.ARGB_8888, 2);
        if (fgBitmap == null) {
            throw new RuntimeException("out of memery cause fgbitmap create fail");
        }
        mCanvas = new Canvas(fgBitmap);
        mCanvas.drawColor(maskColor);
        this.setVisibility(View.GONE);
    }
    public void setArrowUpCenter(int resId) {
        jtUpCenter = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setHighLightStyle(int style) {
        this.highLightStyle = style;
    }
    public int getHighLightStyle() {
        return this.highLightStyle;
    }
    public void setArrowUpCenter(Bitmap src) {
        this.jtUpCenter = src;
    }
    public Bitmap getArrowUpCenter() {
        return this.jtUpCenter;
    }
    public void setArrowUpLeft(int resId) {
        jtUpLeft = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setArrowUpLeft(Bitmap src) {
        this.jtUpLeft = src;
    }
    public Bitmap getArrowUpLeft() {
        return this.jtUpLeft;
    }
    public void setArrowUpRight(int resId) {
        jtUpRight = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setArrowUpRight(Bitmap src) {
        this.jtUpRight = src;
    }
    public Bitmap getArrowUpRight() {
        return this.jtUpRight;
    }
    public void setArrowDownCenter(int resId) {
        jtDownCenter = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setArrowDownCenter(Bitmap src) {
        this.jtDownCenter = src;
    }
    public Bitmap getArrowDownCenter() {
        return this.jtDownCenter;
    }
    public void setArrowDownLeft(int resId) {
        jtDownLeft = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setArrowDownLeft(Bitmap src) {
        this.jtDownLeft = src;
    }
    public Bitmap getArrowDownLeft() {
        return this.jtDownLeft;
    }
    public void setArrowDownRight(int resId) {
        jtDownRight = BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setArrowDownRight(Bitmap src) {
        this.jtDownRight = src;
    }
    public Bitmap getArrowDownRight() {
        return this.jtDownRight;
    }
    @Override protected void onDraw(Canvas canvas) {
        if (targetView == null) {
            return;
        }
        canvas.drawBitmap(fgBitmap, 0, 0, null);
        int left = 0;
        int top = 0;
        int right = 0;
        int bottom = 0;
        int vWidth = targetView.getWidth();
        int vHeight = targetView.getHeight();
        Rect tagetRect = new Rect();
        targetView.getGlobalVisibleRect(tagetRect);
        tagetRect.offset(0, -statusBarHeight);
        left = tagetRect.left - offestMargin;
        top = tagetRect.top - offestMargin;
        right = tagetRect.right + offestMargin;
        bottom = tagetRect.bottom + offestMargin;
        if (left == 0) {
            left += borderWitdh;
        } else if (top == 0) {
            top += borderWitdh;
        } else if (right == screenW) {
            right -= borderWitdh;
        } else if (bottom == screenH) {
            bottom -= borderWitdh;
        }
        switch (highLightStyle) {
        case VIEWSTYLE_RECT:
            RectF rect = new RectF(left, top, right, bottom);
            mCanvas.drawRoundRect(rect, 20, 20, mPaint);
            break;
        case VIEWSTYLE_CIRCLE:
            radius = vWidth < vHeight ? vWidth / 2 + 2 * offestMargin: vHeight / 2 + 2 * offestMargin;
            if (radius < 50) {
                radius = 100;
            }
            mCanvas.drawCircle(left + offestMargin + vWidth / 2, top + offestMargin + vHeight / 2, radius, mPaint);
            break;
        case VIEWSTYLE_OVAL:
            RectF rectf = new RectF(left, top, right, bottom);
            mCanvas.drawOval(rectf, mPaint);
            break;
        }
        tipViewMoveX = getTipViewMoveX();
        tipViewMoveY = getTipViewMoveY();
        if (bottom < screenH / 2 || (screenH / 2 - top > bottom - screenH / 2)) {
            int jtTop = getUpJtTop(bottom, vHeight);
            if (right < screenW / 2 || (screenW / 2 - left > right - screenW / 2)) {
                if (showArrow) {
                    canvas.drawBitmap(jtUpLeft, left + vWidth / 2 + jtUpLeftMoveX, jtTop, null);
                }
                int tipTop = showArrow ? jtTop + jtUpLeft.getHeight() : jtTop;
                if (tipBitmap != null) {
                    canvas.drawBitmap(tipBitmap, left + vWidth / 2 + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(left + vWidth / 2 + tipViewMoveX, tipTop + tipViewMoveY, left + vWidth / 2 + tipBitmap.getWidth(), tipTop + tipBitmap.getHeight());
                }
            } else if (screenW / 2 - 10 <= right - offestMargin - vWidth / 2 && right - offestMargin - vWidth / 2 <= screenW / 2 + 10) {
                if (showArrow) {
                    canvas.drawBitmap(jtUpCenter, left + offestMargin + vWidth / 2 - jtUpCenter.getWidth() / 2 + jtUpCenterMoveX, jtTop, null);
                }
                if (tipBitmap != null) {
                    int tipLeft = left + offestMargin + vWidth / 2 - tipBitmap.getWidth() / 2;
                    int tipTop = showArrow ? jtTop + jtUpCenter.getHeight() : jtTop;
                    canvas.drawBitmap(tipBitmap, tipLeft + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(tipLeft + tipViewMoveX, tipTop + tipViewMoveY, tipLeft + tipBitmap.getWidth(), tipTop + tipBitmap.getHeight());
                }
            } else {
                if (showArrow) {
                    canvas.drawBitmap(jtUpRight, left + vWidth / 2 - 100 - margin + jtUpRightMoveX, jtTop, null);
                }
                if (tipBitmap != null) {
                    int tipLeft = left + vWidth / 2 - 100 - tipBitmap.getWidth() / 2;
                    int tipTop = showArrow ? jtTop + jtUpRight.getHeight() : jtTop;
                    if (tipLeft + tipBitmap.getWidth() > screenW) {
                        tipLeft = screenW - tipBitmap.getWidth() - borderWitdh;
                    }
                    canvas.drawBitmap(tipBitmap, tipLeft + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(tipLeft + tipViewMoveX, tipTop + tipViewMoveY, tipLeft + tipBitmap.getWidth(), tipTop + tipBitmap.getHeight());
                }
            }
        } else {
            int jtTop = getDownJTtop(jtDownLeft, top, vHeight);
            int jtDownCenterTop = getDownJTtop(jtDownCenter, top, vHeight);
            if (right < screenW / 2 || (screenW / 2 - left > right - screenW / 2)) {
                if (showArrow) {
                    canvas.drawBitmap(jtDownLeft, left + vWidth / 2 + jtDownLeftMoveX, jtTop, null);
                }
                if (tipBitmap != null) {
                    int tipLeft = left + vWidth / 2;
                    int tipTop = showArrow ? jtTop - tipBitmap.getHeight() : top - tipBitmap.getHeight() - margin;
                    canvas.drawBitmap(tipBitmap, tipLeft + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(tipLeft + tipViewMoveX, tipTop + tipViewMoveY, tipLeft + tipBitmap.getWidth(), showArrow ? jtTop: top);
                }
            } else if (screenW / 2 - 10 <= right - offestMargin - vWidth / 2 && right - offestMargin - vWidth / 2 <= screenW / 2 + 10) {
                if (showArrow) {
                    canvas.drawBitmap(jtDownCenter, left + offestMargin + vWidth / 2 - jtDownCenter.getWidth() / 2 + jtDownCenterMoveX, jtDownCenterTop, null);
                }
                if (tipBitmap != null) {
                    int tipLeft = left + offestMargin + vWidth / 2 - tipBitmap.getWidth() / 2;
                    int tipTop = showArrow ? jtDownCenterTop - tipBitmap.getHeight() : top - tipBitmap.getHeight() - margin;
                    canvas.drawBitmap(tipBitmap, tipLeft + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(tipLeft + tipViewMoveX, tipTop + tipViewMoveY, tipLeft + tipBitmap.getWidth(), showArrow ? jtDownCenterTop: top);
                }
            } else {
                if (showArrow) {
                    canvas.drawBitmap(jtDownRight, left + vWidth / 2 - 100 - margin + jtDownRightMoveX, jtTop, null);
                }
                if (tipBitmap != null) {
                    int tipLeft = left + vWidth / 2 - 100 - tipBitmap.getWidth() / 2 - margin;
                    if (tipLeft + tipBitmap.getWidth() > screenW) {
                        tipLeft = screenW - tipBitmap.getWidth() - borderWitdh;
                    }
                    int tipTop = showArrow ? jtTop - tipBitmap.getHeight() : top - tipBitmap.getHeight() - margin;
                    canvas.drawBitmap(tipBitmap, tipLeft + tipViewMoveX, tipTop + tipViewMoveY, null);
                    tipViewHitRect = new Rect(tipLeft + tipViewMoveX, tipTop + tipViewMoveY, tipLeft + tipBitmap.getWidth(), showArrow ? jtTop: top);
                }
            }
        }
    }
    private int getUpJtTop(int targetBottom, int targetHeight) {
        int jtTop = 0;
        if (highLightStyle == VIEWSTYLE_CIRCLE) {
            jtTop = targetBottom + (radius - targetHeight / 2) + margin + offestMargin;
        } else {
            jtTop = targetBottom + margin + offestMargin;
        }
        return jtTop;
    }
    private int getDownJTtop(Bitmap jtBitmap, int trgetTop, int targetHeight) {
        int jtTop = 0;
        if (highLightStyle == VIEWSTYLE_CIRCLE) {
            jtTop = trgetTop - (radius - targetHeight / 2) - jtBitmap.getHeight() - margin - offestMargin;
        } else {
            jtTop = trgetTop - jtBitmap.getHeight() - margin - offestMargin;
        }
        return jtTop;
    }
    public void setHighLightView(View targetView) {
        if (this.targetView != null && targetView != null && this.targetView != targetView) {
            Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            mCanvas.drawPaint(paint);
            mCanvas.drawColor(maskColor);
        }
        this.targetView = targetView;
        invalidate();
        setVisibility(VISIBLE);
    }
    public void setHighLightView(huoShan.AnZhuo.JiBen.AndroidView...targetView) {
        if (targetView != null) {
            targetViews = new ArrayList <View> ();
            for (int i = 0; i < targetView.length; i++) {
                targetViews.add(i, targetView[i].GetView());
            }
            setHighLightView(targetView[0]);
            targetViews.remove(0);
        }
    }
    public void setHighLightView(LinkedHashMap <View, Integer> targetsWithTipViews) {
        if (targetsWithTipViews != null) {
            targetViews = new ArrayList <View> ();
            tipViews = new ArrayList <Integer>();
            for (Map.Entry <View, Integer> entry: targetsWithTipViews.entrySet()) {
                targetViews.add(entry.getKey());
                tipViews.add(entry.getValue());
            }
            tipBitmap = getBitmapFromResId(tipViews.get(0));
            tipViews.remove(0);
            setHighLightView(targetViews.get(0));
            targetViews.remove(0);
        }
    }
    public void setTouchOutsideDismiss(boolean cancel) {
        this.touchOutsideCancel = cancel;
    }
    public boolean getTouchOutsideDismiss() {
        return this.touchOutsideCancel;
    }
    public void setBorderWidth(int borderWidth) {
        this.borderWitdh = borderWidth;
    }
    public int getBorderWidth() {
        return this.borderWitdh;
    }
    public void setTipView(Bitmap bitmap) {
        this.tipBitmap = bitmap;
    }
    public void setTipView(int resId) {
        this.tipBitmap = getBitmapFromResId(resId);
    }
    public Bitmap getTipView() {
        return this.tipBitmap;
    }
    public Bitmap getBitmapFromResId(int resId) {
        return BitmapFactory.decodeResource(getResources(), resId);
    }
    public void setTipView(View tipView, int width, int height) {
        Bitmap tipBitmap = MeasureUtil.drawViewToBitmap(tipView, width, height);
        if (null != tipBitmap) {
            setTipView(tipBitmap);
        }
    }
    public void setMaskColor(int maskColor) {
        this.maskColor = maskColor;
    }
    public int getMaskColor() {
        return this.maskColor;
    }
    public void setStatusBarHeight(int statusBarHeight) {
        this.statusBarHeight = statusBarHeight;
    }
    public int getStatusBarHeight() {
        return this.statusBarHeight;
    }
    @Override public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
        case MotionEvent.ACTION_UP:
            if (touchOutsideCancel) {
                if (targetViews == null || targetViews.size() == 0) {
                    this.setVisibility(View.GONE);
                    if (this.onDismissListener != null) {
                        onDismissListener.onDismiss(rg_YinDaoFuCengJiChuLei.this);
                    }
                } else {
                    tipBitmap = getBitmapFromResId(tipViews.get(0));
                    tipViews.remove(0);
                    setHighLightView(targetViews.get(0));
                    targetViews.remove(0);
                }
                return true;
            } else {
                int touchX = (int) event.getX();
                int touchY = (int) event.getY();
                if (tipViewHitRect != null && tipViewHitRect.contains(touchX, touchY)) {
                    if (targetViews == null || targetViews.size() == 0) {
                        this.setVisibility(View.GONE);
                        if (this.onDismissListener != null) {
                            onDismissListener.onDismiss(rg_YinDaoFuCengJiChuLei.this);
                        }
                    } else {
                        tipBitmap = getBitmapFromResId(tipViews.get(0));
                        tipViews.remove(0);
                        setHighLightView(targetViews.get(0));
                        targetViews.remove(0);
                    }
                    return true;
                }
            }
        }
        return true;
    }
    public int getMargin() {
        return margin;
    }
    public void setMargin(int margin) {
        this.margin = margin;
    }
    public int getOffestMargin() {
        return offestMargin;
    }
    public boolean isShowArrow() {
        return showArrow;
    }
    public void setShowArrow(boolean showArrow) {
        this.showArrow = showArrow;
    }
    public void setOffestMargin(int offestMargin) {
        this.offestMargin = offestMargin;
    }
    public void setOnDismissListener(OnDismissListener listener) {
        this.onDismissListener = listener;
    }
    public interface OnDismissListener {
        public void onDismiss(rg_YinDaoFuCengJiChuLei userGuideView);
    }
    public int getArrowUpLeftMoveX() {
        return jtUpLeftMoveX;
    }
    public void setArrowUpLeftMoveX(int jtUpLeftMoveX) {
        this.jtUpLeftMoveX = jtUpLeftMoveX;
    }
    public int getArrowUpRightMoveX() {
        return jtUpRightMoveX;
    }
    public void setArrowUpRightMoveX(int jtUpRightMoveX) {
        this.jtUpRightMoveX = jtUpRightMoveX;
    }
    public int getArrowUpCenterMoveX() {
        return jtUpCenterMoveX;
    }
    public void setArrowUpCenterMoveX(int jtUpCenterMoveX) {
        this.jtUpCenterMoveX = jtUpCenterMoveX;
    }
    public int getArrowDownRightMoveX() {
        return jtDownRightMoveX;
    }
    public void setArrowDownRightMoveX(int jtDownRightMoveX) {
        this.jtDownRightMoveX = jtDownRightMoveX;
    }
    public int getArrowDownLeftMoveX() {
        return jtDownLeftMoveX;
    }
    public void setArrowDownLeftMoveX(int jtDownLeftMoveX) {
        this.jtDownLeftMoveX = jtDownLeftMoveX;
    }
    public int getArrowDownCenterMoveX() {
        return jtDownCenterMoveX;
    }
    public void setArrowDownCenterMoveX(int jtDownCenterMoveX) {
        this.jtDownCenterMoveX = jtDownCenterMoveX;
    }
    public void setTipViewMoveX(View highlightView, int tipViewMoveX) {
        tipViewMoveXMap.put(highlightView, tipViewMoveX);
    }
    public void setTipViewMoveY(View highlightView, int tipViewMoveY) {
        tipViewMoveYMap.put(highlightView, tipViewMoveY);
    }
    private int getTipViewMoveX() {
        Integer moveX = tipViewMoveXMap.get(targetView);
        return moveX == null ? 0 : moveX;
    }
    private int getTipViewMoveY() {
        Integer moveY = tipViewMoveYMap.get(targetView);
        return moveY == null ? 0 : moveY;
    }
    public boolean isListener() {
        return this.onDismissListener != null;
    }
}
