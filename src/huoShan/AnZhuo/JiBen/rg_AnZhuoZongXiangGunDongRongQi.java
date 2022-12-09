
package huoShan.AnZhuo.JiBen;

public class rg_AnZhuoZongXiangGunDongRongQi extends android.widget.ScrollView {

    private ISmartScrollChangedListener mSmartScrollChangedListener;
    private boolean isScrolledToTop = true;
    private boolean isScrolledToBottom = false;
    public rg_AnZhuoZongXiangGunDongRongQi(android.content.Context context) {
        super(context);
    }
    public rg_AnZhuoZongXiangGunDongRongQi(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }
    public interface ISmartScrollChangedListener {
        void onScrolledToBottom();
        void onScrolledToTop();
        void onScrollChanged(int l, int t, int oldl, int oldt);
    }
    public void setScanScrollChangedListener(ISmartScrollChangedListener smartScrollChangedListener) {
        mSmartScrollChangedListener = smartScrollChangedListener;
    }
    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mSmartScrollChangedListener != null) {
            mSmartScrollChangedListener.onScrollChanged(l, t, oldl, oldt);
            if (getScrollY() == 0) {
                isScrolledToTop = true;
                isScrolledToBottom = false;
            } else{
                android.view.View contentView = getChildAt(0);
                if (contentView != null && contentView.getMeasuredHeight() == (getScrollY() + getHeight())) {
                    isScrolledToTop = false;
                    isScrolledToBottom = true;
                }else{
                    isScrolledToTop = false;
                    isScrolledToBottom = false;
                }
            }
            notifyScrollChangedListeners();
        }
    }
    public boolean isScrolledToTop() {
        return isScrolledToTop;
    }
    public boolean isScrolledToBottom() {
        return isScrolledToBottom;
    }
    public boolean isListenersNull() {
        return (mSmartScrollChangedListener != null);
    }
    private void notifyScrollChangedListeners() {
        if (isScrolledToTop) {
            if (mSmartScrollChangedListener != null)
                mSmartScrollChangedListener.onScrolledToTop();
        } else if (isScrolledToBottom) {
            if (mSmartScrollChangedListener != null)
                mSmartScrollChangedListener.onScrolledToBottom();
        }
    }
}
