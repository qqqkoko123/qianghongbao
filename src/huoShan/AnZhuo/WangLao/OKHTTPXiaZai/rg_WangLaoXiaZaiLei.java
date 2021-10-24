
package huoShan.AnZhuo.WangLao.OKHTTPXiaZai;

public class rg_WangLaoXiaZaiLei {

    public rg_WangLaoXiaZaiLei ()  { }

    public static void rg_ChuShiHua36 () {
        com.lzy.okgo.OkGo.getInstance().init(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp());
    }

    public static com.lzy.okserver.download.DownloadTask rg_ChuangJianRenWu (String rg_RenWuBiaoJi21, String rg_WenJianDeZhi1, int rg_FangWenFangShi10, com.lzy.okgo.model.HttpParams rg_DiJiaoCanShu8, com.lzy.okgo.model.HttpHeaders rg_XieYiTou8, boolean rg_PinJieCanShu8, boolean rg_Multipart8, String rg_ShangChuanWenBen8, String rg_ShangChuanJSON8, byte [] rg_ShangChuanZiJie8, java.io.File rg_ShangChuanWenJian9) {
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_WenJianDeZhi1))
        {
            return (null);
        }
        if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_GET1)
        {
            com.lzy.okgo.request.GetRequest request = com.lzy.okgo.OkGo.<java.io.File>get(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_POST1)
        {
            com.lzy.okgo.request.PostRequest request = com.lzy.okgo.OkGo.<java.io.File>post(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            if (rg_ShangChuanWenBen8 != null)
                request.upString(rg_ShangChuanWenBen8);
            if (rg_ShangChuanJSON8 != null)
                request.upJson(rg_ShangChuanJSON8);
            if (rg_ShangChuanZiJie8 != null)
                request.upBytes(rg_ShangChuanZiJie8);
            if (rg_ShangChuanWenJian9 != null)
                request.upFile(rg_ShangChuanWenJian9);
            request.isMultipart(rg_Multipart8);
            request.isSpliceUrl(rg_PinJieCanShu8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_TRACE1)
        {
            com.lzy.okgo.request.TraceRequest request = com.lzy.okgo.OkGo.<java.io.File>trace(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_HEAD1)
        {
            com.lzy.okgo.request.HeadRequest request = com.lzy.okgo.OkGo.<java.io.File>head(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_DELETE1)
        {
            com.lzy.okgo.request.DeleteRequest request = com.lzy.okgo.OkGo.<java.io.File>delete(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            if (rg_ShangChuanWenBen8 != null)
                request.upString(rg_ShangChuanWenBen8);
            if (rg_ShangChuanJSON8 != null)
                request.upJson(rg_ShangChuanJSON8);
            if (rg_ShangChuanZiJie8 != null)
                request.upBytes(rg_ShangChuanZiJie8);
            if (rg_ShangChuanWenJian9 != null)
                request.upFile(rg_ShangChuanWenJian9);
            request.isMultipart(rg_Multipart8);
            request.isSpliceUrl(rg_PinJieCanShu8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_OPTIONS1)
        {
            com.lzy.okgo.request.OptionsRequest request = com.lzy.okgo.OkGo.<java.io.File>options(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            if (rg_ShangChuanWenBen8 != null)
                request.upString(rg_ShangChuanWenBen8);
            if (rg_ShangChuanJSON8 != null)
                request.upJson(rg_ShangChuanJSON8);
            if (rg_ShangChuanZiJie8 != null)
                request.upBytes(rg_ShangChuanZiJie8);
            if (rg_ShangChuanWenJian9 != null)
                request.upFile(rg_ShangChuanWenJian9);
            request.isMultipart(rg_Multipart8);
            request.isSpliceUrl(rg_PinJieCanShu8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_PATCH1)
        {
            com.lzy.okgo.request.PatchRequest request = com.lzy.okgo.OkGo.<java.io.File>patch(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            if (rg_ShangChuanWenBen8 != null)
                request.upString(rg_ShangChuanWenBen8);
            if (rg_ShangChuanJSON8 != null)
                request.upJson(rg_ShangChuanJSON8);
            if (rg_ShangChuanZiJie8 != null)
                request.upBytes(rg_ShangChuanZiJie8);
            if (rg_ShangChuanWenJian9 != null)
                request.upFile(rg_ShangChuanWenJian9);
            request.isMultipart(rg_Multipart8);
            request.isSpliceUrl(rg_PinJieCanShu8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        else if (rg_FangWenFangShi10 == huoShan.AnZhuo.WangLao.OKHTTPFangWen.rg_WangLaoFangWenFangShi.rg_PUT1)
        {
            com.lzy.okgo.request.PutRequest request = com.lzy.okgo.OkGo.<java.io.File>put(rg_WenJianDeZhi1);
            if (rg_DiJiaoCanShu8 != null)
                request.params(rg_DiJiaoCanShu8);
            if (rg_XieYiTou8 != null)
                request.headers(rg_XieYiTou8);
            if (rg_ShangChuanWenBen8 != null)
                request.upString(rg_ShangChuanWenBen8);
            if (rg_ShangChuanJSON8 != null)
                request.upJson(rg_ShangChuanJSON8);
            if (rg_ShangChuanZiJie8 != null)
                request.upBytes(rg_ShangChuanZiJie8);
            if (rg_ShangChuanWenJian9 != null)
                request.upFile(rg_ShangChuanWenJian9);
            request.isMultipart(rg_Multipart8);
            request.isSpliceUrl(rg_PinJieCanShu8);
            return com.lzy.okserver.OkDownload.request(rg_RenWuBiaoJi21, request);
        }
        return (null);
    }
}
