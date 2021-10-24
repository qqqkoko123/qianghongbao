
package huoShan.AnZhuo.WangLao.OKHTTPXiaZai;

public class rg_WangLaoXiaZaiJianTingLei extends com.lzy.okserver.download.DownloadListener implements com.lzy.okserver.task.XExecutor.OnAllTaskEndListener {

    public rg_WangLaoXiaZaiJianTingLei(Object tag) {
        super(tag);
    }
    @Override
    public void onStart(com.lzy.okgo.model.Progress progress) {
        rg_RenWuJiJiangKaiShi(tag,progress);
    }
    @Override
    public void onRemove(com.lzy.okgo.model.Progress progress) {
        rg_RenWuYiYiChu(tag,progress);
    }
    @Override
    public void onProgress(com.lzy.okgo.model.Progress progress) {
        rg_RenWuJinDuGaiBian(tag,progress);
    }
    @Override
    public void onError(com.lzy.okgo.model.Progress progress) {
        rg_RenWuChuXianCuoWu(tag,progress);
    }
    @Override
    public void onFinish(java.io.File file, com.lzy.okgo.model.Progress progress) {
        rg_RenWuYiWanCheng(tag,file, progress);
    }
    @Override
    public void onAllTaskEnd() {
        rg_YiWanChengQuanBuRenWu(tag);
    }

    public static interface re_RenWuJiJiangKaiShi { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang25, com.lzy.okgo.model.Progress rg_RenWuJinDu); }
    private re_RenWuJiJiangKaiShi rd_RenWuJiJiangKaiShi;
    private int rd_RenWuJiJiangKaiShi_tag;
    public void rl_WangLaoXiaZaiJianTingLei_RenWuJiJiangKaiShi (re_RenWuJiJiangKaiShi objListener, int nTagNumber) {
        synchronized (this) { rd_RenWuJiJiangKaiShi = objListener;  rd_RenWuJiJiangKaiShi_tag = nTagNumber; }
    }
    public int rg_RenWuJiJiangKaiShi (java.lang.Object rg_YongHuDuiXiang25, com.lzy.okgo.model.Progress rg_RenWuJinDu) {
        re_RenWuJiJiangKaiShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_RenWuJiJiangKaiShi;  nTagNumber = rd_RenWuJiJiangKaiShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang25, rg_RenWuJinDu) : 0);
    }

    public static interface re_RenWuYiYiChu { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang26, com.lzy.okgo.model.Progress rg_RenWuJinDu1); }
    private re_RenWuYiYiChu rd_RenWuYiYiChu;
    private int rd_RenWuYiYiChu_tag;
    public void rl_WangLaoXiaZaiJianTingLei_RenWuYiYiChu (re_RenWuYiYiChu objListener, int nTagNumber) {
        synchronized (this) { rd_RenWuYiYiChu = objListener;  rd_RenWuYiYiChu_tag = nTagNumber; }
    }
    public int rg_RenWuYiYiChu (java.lang.Object rg_YongHuDuiXiang26, com.lzy.okgo.model.Progress rg_RenWuJinDu1) {
        re_RenWuYiYiChu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_RenWuYiYiChu;  nTagNumber = rd_RenWuYiYiChu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang26, rg_RenWuJinDu1) : 0);
    }

    public static interface re_RenWuJinDuGaiBian { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang27, com.lzy.okgo.model.Progress rg_RenWuJinDu2); }
    private re_RenWuJinDuGaiBian rd_RenWuJinDuGaiBian;
    private int rd_RenWuJinDuGaiBian_tag;
    public void rl_WangLaoXiaZaiJianTingLei_RenWuJinDuGaiBian (re_RenWuJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_RenWuJinDuGaiBian = objListener;  rd_RenWuJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_RenWuJinDuGaiBian (java.lang.Object rg_YongHuDuiXiang27, com.lzy.okgo.model.Progress rg_RenWuJinDu2) {
        re_RenWuJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_RenWuJinDuGaiBian;  nTagNumber = rd_RenWuJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang27, rg_RenWuJinDu2) : 0);
    }

    public static interface re_RenWuChuXianCuoWu { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang28, com.lzy.okgo.model.Progress rg_RenWuJinDu3); }
    private re_RenWuChuXianCuoWu rd_RenWuChuXianCuoWu;
    private int rd_RenWuChuXianCuoWu_tag;
    public void rl_WangLaoXiaZaiJianTingLei_RenWuChuXianCuoWu (re_RenWuChuXianCuoWu objListener, int nTagNumber) {
        synchronized (this) { rd_RenWuChuXianCuoWu = objListener;  rd_RenWuChuXianCuoWu_tag = nTagNumber; }
    }
    public int rg_RenWuChuXianCuoWu (java.lang.Object rg_YongHuDuiXiang28, com.lzy.okgo.model.Progress rg_RenWuJinDu3) {
        re_RenWuChuXianCuoWu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_RenWuChuXianCuoWu;  nTagNumber = rd_RenWuChuXianCuoWu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang28, rg_RenWuJinDu3) : 0);
    }

    public static interface re_RenWuYiWanCheng { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang29, java.io.File rg_WenJian14, com.lzy.okgo.model.Progress rg_RenWuJinDu4); }
    private re_RenWuYiWanCheng rd_RenWuYiWanCheng;
    private int rd_RenWuYiWanCheng_tag;
    public void rl_WangLaoXiaZaiJianTingLei_RenWuYiWanCheng (re_RenWuYiWanCheng objListener, int nTagNumber) {
        synchronized (this) { rd_RenWuYiWanCheng = objListener;  rd_RenWuYiWanCheng_tag = nTagNumber; }
    }
    public int rg_RenWuYiWanCheng (java.lang.Object rg_YongHuDuiXiang29, java.io.File rg_WenJian14, com.lzy.okgo.model.Progress rg_RenWuJinDu4) {
        re_RenWuYiWanCheng objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_RenWuYiWanCheng;  nTagNumber = rd_RenWuYiWanCheng_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang29, rg_WenJian14, rg_RenWuJinDu4) : 0);
    }

    public static interface re_YiWanChengQuanBuRenWu { int dispatch (rg_WangLaoXiaZaiJianTingLei objSource, int nTagNumber, java.lang.Object rg_YongHuDuiXiang30); }
    private re_YiWanChengQuanBuRenWu rd_YiWanChengQuanBuRenWu;
    private int rd_YiWanChengQuanBuRenWu_tag;
    public void rl_WangLaoXiaZaiJianTingLei_YiWanChengQuanBuRenWu (re_YiWanChengQuanBuRenWu objListener, int nTagNumber) {
        synchronized (this) { rd_YiWanChengQuanBuRenWu = objListener;  rd_YiWanChengQuanBuRenWu_tag = nTagNumber; }
    }
    public int rg_YiWanChengQuanBuRenWu (java.lang.Object rg_YongHuDuiXiang30) {
        re_YiWanChengQuanBuRenWu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_YiWanChengQuanBuRenWu;  nTagNumber = rd_YiWanChengQuanBuRenWu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YongHuDuiXiang30) : 0);
    }
}
