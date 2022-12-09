
package huoShan.AnZhuo.WangLao.OKHTTPFangWen;

public class rg_WangLaoFangWenLei {

    public rg_WangLaoFangWenLei () {
        rg_WangLaoFangWenLei_Lei_ChuShiHua ();
    }

    private int getCacheMode(com.lzy.okgo.cache.CacheMode mode){
        switch(mode){
            case DEFAULT:
                return 0;
            case NO_CACHE:
                return 1;
            case REQUEST_FAILED_READ_CACHE:
                return 2;
            case IF_NONE_CACHE_REQUEST:
                return 3;
            case FIRST_CACHE_THEN_REQUEST:
                return 4;
        }
        return 0;
    }
    private com.lzy.okgo.cache.CacheMode setCacheMode(int mode){
        switch(mode){
            case 0:
                return com.lzy.okgo.cache.CacheMode.DEFAULT;
            case 1:
                return com.lzy.okgo.cache.CacheMode.NO_CACHE;
            case 2:
                return com.lzy.okgo.cache.CacheMode.REQUEST_FAILED_READ_CACHE;
            case 3:
                return com.lzy.okgo.cache.CacheMode.IF_NONE_CACHE_REQUEST;
            case 4:
                return com.lzy.okgo.cache.CacheMode.FIRST_CACHE_THEN_REQUEST;
        }
        return com.lzy.okgo.cache.CacheMode.DEFAULT;
    }
    private class BytesConvert implements com.lzy.okgo.convert.Converter<byte[]>{
        @Override
        public byte[] convertResponse(okhttp3.Response response) throws Throwable {
            okhttp3.ResponseBody body = response.body();
            return body == null ? new byte[0] : body.bytes();
        }
    }
    private abstract class BytesCallback extends com.lzy.okgo.callback.AbsCallback<byte[]>{
        private BytesConvert convert = new BytesConvert();
        public byte[] convertResponse(okhttp3.Response response) throws Throwable {
            byte[] bytes = this.convert.convertResponse(response);
            response.close();
            return bytes;
        }
    }
    private com.lzy.okgo.callback.StringCallback getStringCallback(final int indexTag){
        return new com.lzy.okgo.callback.StringCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                rg_WenBen_QingQiuChengGong(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<String> response) {
                rg_WenBen_HuanCunChengGong(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<String> response) {
                super.onError(response);
                rg_WenBen_QingQiuShiBai(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<String, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_WenBen_QingQiuKaiShi(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_WenBen_QingQiuJieShu(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WenBen_ShangChuanJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WenBen_XiaZaiJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private com.lzy.okgo.callback.BitmapCallback getBitmapCallback(final int indexTag){
        return new com.lzy.okgo.callback.BitmapCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                rg_WeiTu_QingQiuChengGong(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                rg_WeiTu_HuanCunChengGong(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                super.onError(response);
                rg_WeiTu_QingQiuShiBai(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<android.graphics.Bitmap, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_WeiTu_QingQiuKaiShi(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_WeiTu_QingQiuJieShu(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WeiTu_ShangChuanJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WeiTu_XiaZaiJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private BytesCallback getBytesCallback(final int indexTag){
        return new BytesCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<byte[]> response) {
                rg_ZiJieShuZu_QingQiuChengGong(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<byte[]> response) {
                rg_ZiJieShuZu_HuanCunChengGong(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<byte[]> response) {
                super.onError(response);
                rg_ZiJieShuZu_QingQiuShiBai(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<byte[], ? extends com.lzy.okgo.request.base.Request> request) {
                rg_ZiJieShuZu_QingQiuKaiShi(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_ZiJieShuZu_QingQiuJieShu(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_ZiJieShuZu_ShangChuanJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_ZiJieShuZu_XiaZaiJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private com.lzy.okgo.callback.FileCallback getFileCallback(final int indexTag, String folder, String fileName){
        return new com.lzy.okgo.callback.FileCallback(folder, fileName) {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<java.io.File> response) {
                rg_WenJian_QingQiuChengGong(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<java.io.File> response) {
                rg_WenJian_HuanCunChengGong(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<java.io.File> response) {
                super.onError(response);
                rg_WenJian_QingQiuShiBai(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<java.io.File, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_WenJian_QingQiuKaiShi(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_WenJian_QingQiuJieShu(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WenJian_ShangChuanJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_WenJian_XiaZaiJinDuGaiBian(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }

    public com.lzy.okgo.model.Response rg_WangYeFangWen_ZiJieShuZu_TongBu (String rg_WangZhi17, int rg_FangWenFangShi10, com.lzy.okgo.model.HttpParams rg_DiJiaoCanShu6, com.lzy.okgo.model.HttpHeaders rg_XieYiTou7, int rg_HuanCunMoShi8, int rg_ShiBaiChongShi6, java.lang.Object rg_BiaoJiDuiXiang6, boolean rg_PinJieCanShu6, boolean rg_Multipart6, String rg_ShangChuanWenBen6, String rg_ShangChuanJSON6, byte [] rg_ShangChuanZiJie6, java.io.File rg_ShangChuanWenJian7) {
        if (huoShan.Java.JiBen.rg_WenBenXingLei.rg_WenBenShiFouWeiKong (rg_WangZhi17))
        {
            return (null);
        }
        String contentType = rg_XieYiTou7 == null ? "" : rg_XieYiTou7.get("Content-Type");
        if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_GET1)
        {
            com.lzy.okgo.request.GetRequest request = com.lzy.okgo.OkGo.<byte[]>get(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_POST1)
        {
            com.lzy.okgo.request.PostRequest request = com.lzy.okgo.OkGo.<byte[]>post(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            if (rg_ShangChuanWenBen6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upString(rg_ShangChuanWenBen6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upString(rg_ShangChuanWenBen6);
                }
            }
            if (rg_ShangChuanJSON6 != null)
                request.upJson(rg_ShangChuanJSON6);
            if (rg_ShangChuanZiJie6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upBytes(rg_ShangChuanZiJie6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upBytes(rg_ShangChuanZiJie6);
                }
            }
            if (rg_ShangChuanWenJian7 != null)
                request.upFile(rg_ShangChuanWenJian7);
            request.isMultipart(rg_Multipart6);
            request.isSpliceUrl(rg_PinJieCanShu6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_TRACE1)
        {
            com.lzy.okgo.request.TraceRequest request = com.lzy.okgo.OkGo.<byte[]>trace(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_HEAD1)
        {
            com.lzy.okgo.request.HeadRequest request = com.lzy.okgo.OkGo.<byte[]>head(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_DELETE1)
        {
            com.lzy.okgo.request.DeleteRequest request = com.lzy.okgo.OkGo.<byte[]>delete(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            if (rg_ShangChuanWenBen6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upString(rg_ShangChuanWenBen6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upString(rg_ShangChuanWenBen6);
                }
            }
            if (rg_ShangChuanJSON6 != null)
                request.upJson(rg_ShangChuanJSON6);
            if (rg_ShangChuanZiJie6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upBytes(rg_ShangChuanZiJie6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upBytes(rg_ShangChuanZiJie6);
                }
            }
            if (rg_ShangChuanWenJian7 != null)
                request.upFile(rg_ShangChuanWenJian7);
            request.isMultipart(rg_Multipart6);
            request.isSpliceUrl(rg_PinJieCanShu6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_OPTIONS1)
        {
            com.lzy.okgo.request.OptionsRequest request = com.lzy.okgo.OkGo.<byte[]>options(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            if (rg_ShangChuanWenBen6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upString(rg_ShangChuanWenBen6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upString(rg_ShangChuanWenBen6);
                }
            }
            if (rg_ShangChuanJSON6 != null)
                request.upJson(rg_ShangChuanJSON6);
            if (rg_ShangChuanZiJie6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upBytes(rg_ShangChuanZiJie6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upBytes(rg_ShangChuanZiJie6);
                }
            }
            if (rg_ShangChuanWenJian7 != null)
                request.upFile(rg_ShangChuanWenJian7);
            request.isMultipart(rg_Multipart6);
            request.isSpliceUrl(rg_PinJieCanShu6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_PATCH1)
        {
            com.lzy.okgo.request.PatchRequest request = com.lzy.okgo.OkGo.<byte[]>patch(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            if (rg_ShangChuanWenBen6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upString(rg_ShangChuanWenBen6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upString(rg_ShangChuanWenBen6);
                }
            }
            if (rg_ShangChuanJSON6 != null)
                request.upJson(rg_ShangChuanJSON6);
            if (rg_ShangChuanZiJie6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upBytes(rg_ShangChuanZiJie6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upBytes(rg_ShangChuanZiJie6);
                }
            }
            if (rg_ShangChuanWenJian7 != null)
                request.upFile(rg_ShangChuanWenJian7);
            request.isMultipart(rg_Multipart6);
            request.isSpliceUrl(rg_PinJieCanShu6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_FangWenFangShi10 == rg_WangLaoFangWenFangShi.rg_PUT1)
        {
            com.lzy.okgo.request.PutRequest request = com.lzy.okgo.OkGo.<byte[]>put(rg_WangZhi17);
            if (rg_DiJiaoCanShu6 != null)
                request.params(rg_DiJiaoCanShu6);
            if (rg_XieYiTou7 != null)
                request.headers(rg_XieYiTou7);
            if (rg_HuanCunMoShi8 != -1)
                request.cacheMode(setCacheMode(rg_HuanCunMoShi8));
            if (rg_ShiBaiChongShi6 > -1)
                request.retryCount(rg_ShiBaiChongShi6);
            request.tag(rg_BiaoJiDuiXiang6);
            if (rg_ShangChuanWenBen6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upString(rg_ShangChuanWenBen6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upString(rg_ShangChuanWenBen6);
                }
            }
            if (rg_ShangChuanJSON6 != null)
                request.upJson(rg_ShangChuanJSON6);
            if (rg_ShangChuanZiJie6 != null){
                if (!android.text.TextUtils.isEmpty(contentType)){
                    request.upBytes(rg_ShangChuanZiJie6, okhttp3.MediaType.parse(contentType));
                }else{
                    request.upBytes(rg_ShangChuanZiJie6);
                }
            }
            if (rg_ShangChuanWenJian7 != null)
                request.upFile(rg_ShangChuanWenJian7);
            request.isMultipart(rg_Multipart6);
            request.isSpliceUrl(rg_PinJieCanShu6);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        return (null);
    }

    protected void rg_WangLaoFangWenLei_Lei_ChuShiHua () {
        com.lzy.okgo.OkGo.getInstance().init(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp());
    }

    public void rg_CookieGuanLiCeLue_QuanJu (int rg_GuanLiCeLue) {
        okhttp3.OkHttpClient tempClient;
        if (rg_GuanLiCeLue == 0)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(okhttp3.CookieJar.NO_COOKIES).build();
        else if (rg_GuanLiCeLue == 1)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.MemoryCookieStore())).build();
        else if (rg_GuanLiCeLue == 2)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.SPCookieStore(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp()))).build();
        else if (rg_GuanLiCeLue == 3)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.DBCookieStore(huoShan.AnZhuo.JiBen.rg_YingYongChengXu.sGetApp()))).build();
        else
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(okhttp3.CookieJar.NO_COOKIES).build();
        com.lzy.okgo.OkGo.getInstance().setOkHttpClient(tempClient);
    }

    public static interface re_WenBen_QingQiuChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, String rg_QingQiuJieGuo, com.lzy.okgo.model.Response rg_XiangYingDuiXiang1, java.lang.Object rg_BiaoJiDuiXiang9, int rg_BiaoJiSuoYin4); }
    private re_WenBen_QingQiuChengGong rd_WenBen_QingQiuChengGong;
    private int rd_WenBen_QingQiuChengGong_tag;
    public void rl_WangLaoFangWenLei_WenBen_QingQiuChengGong (re_WenBen_QingQiuChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_QingQiuChengGong = objListener;  rd_WenBen_QingQiuChengGong_tag = nTagNumber; }
    }
    public int rg_WenBen_QingQiuChengGong (String rg_QingQiuJieGuo, com.lzy.okgo.model.Response rg_XiangYingDuiXiang1, java.lang.Object rg_BiaoJiDuiXiang9, int rg_BiaoJiSuoYin4) {
        re_WenBen_QingQiuChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_QingQiuChengGong;  nTagNumber = rd_WenBen_QingQiuChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_QingQiuJieGuo, rg_XiangYingDuiXiang1, rg_BiaoJiDuiXiang9, rg_BiaoJiSuoYin4) : 0);
    }

    public static interface re_WenBen_HuanCunChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Response rg_XiangYingDuiXiang2, java.lang.Object rg_BiaoJiDuiXiang10, int rg_BiaoJiSuoYin5); }
    private re_WenBen_HuanCunChengGong rd_WenBen_HuanCunChengGong;
    private int rd_WenBen_HuanCunChengGong_tag;
    public void rl_WangLaoFangWenLei_WenBen_HuanCunChengGong (re_WenBen_HuanCunChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_HuanCunChengGong = objListener;  rd_WenBen_HuanCunChengGong_tag = nTagNumber; }
    }
    public int rg_WenBen_HuanCunChengGong (com.lzy.okgo.model.Response rg_XiangYingDuiXiang2, java.lang.Object rg_BiaoJiDuiXiang10, int rg_BiaoJiSuoYin5) {
        re_WenBen_HuanCunChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_HuanCunChengGong;  nTagNumber = rd_WenBen_HuanCunChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_XiangYingDuiXiang2, rg_BiaoJiDuiXiang10, rg_BiaoJiSuoYin5) : 0);
    }

    public static interface re_WenBen_QingQiuShiBai { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Throwable rg_YiChangDuiXiang4, com.lzy.okgo.model.Response rg_XiangYingDuiXiang3, java.lang.Object rg_BiaoJiDuiXiang11, int rg_BiaoJiSuoYin6); }
    private re_WenBen_QingQiuShiBai rd_WenBen_QingQiuShiBai;
    private int rd_WenBen_QingQiuShiBai_tag;
    public void rl_WangLaoFangWenLei_WenBen_QingQiuShiBai (re_WenBen_QingQiuShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_QingQiuShiBai = objListener;  rd_WenBen_QingQiuShiBai_tag = nTagNumber; }
    }
    public int rg_WenBen_QingQiuShiBai (java.lang.Throwable rg_YiChangDuiXiang4, com.lzy.okgo.model.Response rg_XiangYingDuiXiang3, java.lang.Object rg_BiaoJiDuiXiang11, int rg_BiaoJiSuoYin6) {
        re_WenBen_QingQiuShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_QingQiuShiBai;  nTagNumber = rd_WenBen_QingQiuShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YiChangDuiXiang4, rg_XiangYingDuiXiang3, rg_BiaoJiDuiXiang11, rg_BiaoJiSuoYin6) : 0);
    }

    public static interface re_WenBen_QingQiuKaiShi { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Object rg_BiaoJiDuiXiang12, int rg_BiaoJiSuoYin7); }
    private re_WenBen_QingQiuKaiShi rd_WenBen_QingQiuKaiShi;
    private int rd_WenBen_QingQiuKaiShi_tag;
    public void rl_WangLaoFangWenLei_WenBen_QingQiuKaiShi (re_WenBen_QingQiuKaiShi objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_QingQiuKaiShi = objListener;  rd_WenBen_QingQiuKaiShi_tag = nTagNumber; }
    }
    public int rg_WenBen_QingQiuKaiShi (java.lang.Object rg_BiaoJiDuiXiang12, int rg_BiaoJiSuoYin7) {
        re_WenBen_QingQiuKaiShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_QingQiuKaiShi;  nTagNumber = rd_WenBen_QingQiuKaiShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiDuiXiang12, rg_BiaoJiSuoYin7) : 0);
    }

    public static interface re_WenBen_QingQiuJieShu { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, int rg_BiaoJiSuoYin8); }
    private re_WenBen_QingQiuJieShu rd_WenBen_QingQiuJieShu;
    private int rd_WenBen_QingQiuJieShu_tag;
    public void rl_WangLaoFangWenLei_WenBen_QingQiuJieShu (re_WenBen_QingQiuJieShu objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_QingQiuJieShu = objListener;  rd_WenBen_QingQiuJieShu_tag = nTagNumber; }
    }
    public int rg_WenBen_QingQiuJieShu (int rg_BiaoJiSuoYin8) {
        re_WenBen_QingQiuJieShu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_QingQiuJieShu;  nTagNumber = rd_WenBen_QingQiuJieShu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiSuoYin8) : 0);
    }

    public static interface re_WenBen_ShangChuanJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu6, java.lang.Object rg_BiaoJiDuiXiang13, int rg_BiaoJiSuoYin9); }
    private re_WenBen_ShangChuanJinDuGaiBian rd_WenBen_ShangChuanJinDuGaiBian;
    private int rd_WenBen_ShangChuanJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WenBen_ShangChuanJinDuGaiBian (re_WenBen_ShangChuanJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_ShangChuanJinDuGaiBian = objListener;  rd_WenBen_ShangChuanJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WenBen_ShangChuanJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu6, java.lang.Object rg_BiaoJiDuiXiang13, int rg_BiaoJiSuoYin9) {
        re_WenBen_ShangChuanJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_ShangChuanJinDuGaiBian;  nTagNumber = rd_WenBen_ShangChuanJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu6, rg_BiaoJiDuiXiang13, rg_BiaoJiSuoYin9) : 0);
    }

    public static interface re_WenBen_XiaZaiJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu7, java.lang.Object rg_BiaoJiDuiXiang14, int rg_BiaoJiSuoYin10); }
    private re_WenBen_XiaZaiJinDuGaiBian rd_WenBen_XiaZaiJinDuGaiBian;
    private int rd_WenBen_XiaZaiJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WenBen_XiaZaiJinDuGaiBian (re_WenBen_XiaZaiJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WenBen_XiaZaiJinDuGaiBian = objListener;  rd_WenBen_XiaZaiJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WenBen_XiaZaiJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu7, java.lang.Object rg_BiaoJiDuiXiang14, int rg_BiaoJiSuoYin10) {
        re_WenBen_XiaZaiJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenBen_XiaZaiJinDuGaiBian;  nTagNumber = rd_WenBen_XiaZaiJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu7, rg_BiaoJiDuiXiang14, rg_BiaoJiSuoYin10) : 0);
    }

    public static interface re_WeiTu_QingQiuChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, android.graphics.Bitmap rg_QingQiuJieGuo1, com.lzy.okgo.model.Response rg_XiangYingDuiXiang4, java.lang.Object rg_BiaoJiDuiXiang15, int rg_BiaoJiSuoYin11); }
    private re_WeiTu_QingQiuChengGong rd_WeiTu_QingQiuChengGong;
    private int rd_WeiTu_QingQiuChengGong_tag;
    public void rl_WangLaoFangWenLei_WeiTu_QingQiuChengGong (re_WeiTu_QingQiuChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_QingQiuChengGong = objListener;  rd_WeiTu_QingQiuChengGong_tag = nTagNumber; }
    }
    public int rg_WeiTu_QingQiuChengGong (android.graphics.Bitmap rg_QingQiuJieGuo1, com.lzy.okgo.model.Response rg_XiangYingDuiXiang4, java.lang.Object rg_BiaoJiDuiXiang15, int rg_BiaoJiSuoYin11) {
        re_WeiTu_QingQiuChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_QingQiuChengGong;  nTagNumber = rd_WeiTu_QingQiuChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_QingQiuJieGuo1, rg_XiangYingDuiXiang4, rg_BiaoJiDuiXiang15, rg_BiaoJiSuoYin11) : 0);
    }

    public static interface re_WeiTu_HuanCunChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Response rg_XiangYingDuiXiang5, java.lang.Object rg_BiaoJiDuiXiang16, int rg_BiaoJiSuoYin12); }
    private re_WeiTu_HuanCunChengGong rd_WeiTu_HuanCunChengGong;
    private int rd_WeiTu_HuanCunChengGong_tag;
    public void rl_WangLaoFangWenLei_WeiTu_HuanCunChengGong (re_WeiTu_HuanCunChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_HuanCunChengGong = objListener;  rd_WeiTu_HuanCunChengGong_tag = nTagNumber; }
    }
    public int rg_WeiTu_HuanCunChengGong (com.lzy.okgo.model.Response rg_XiangYingDuiXiang5, java.lang.Object rg_BiaoJiDuiXiang16, int rg_BiaoJiSuoYin12) {
        re_WeiTu_HuanCunChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_HuanCunChengGong;  nTagNumber = rd_WeiTu_HuanCunChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_XiangYingDuiXiang5, rg_BiaoJiDuiXiang16, rg_BiaoJiSuoYin12) : 0);
    }

    public static interface re_WeiTu_QingQiuShiBai { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Throwable rg_YiChangDuiXiang5, com.lzy.okgo.model.Response rg_XiangYingDuiXiang6, java.lang.Object rg_BiaoJiDuiXiang17, int rg_BiaoJiSuoYin13); }
    private re_WeiTu_QingQiuShiBai rd_WeiTu_QingQiuShiBai;
    private int rd_WeiTu_QingQiuShiBai_tag;
    public void rl_WangLaoFangWenLei_WeiTu_QingQiuShiBai (re_WeiTu_QingQiuShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_QingQiuShiBai = objListener;  rd_WeiTu_QingQiuShiBai_tag = nTagNumber; }
    }
    public int rg_WeiTu_QingQiuShiBai (java.lang.Throwable rg_YiChangDuiXiang5, com.lzy.okgo.model.Response rg_XiangYingDuiXiang6, java.lang.Object rg_BiaoJiDuiXiang17, int rg_BiaoJiSuoYin13) {
        re_WeiTu_QingQiuShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_QingQiuShiBai;  nTagNumber = rd_WeiTu_QingQiuShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YiChangDuiXiang5, rg_XiangYingDuiXiang6, rg_BiaoJiDuiXiang17, rg_BiaoJiSuoYin13) : 0);
    }

    public static interface re_WeiTu_QingQiuKaiShi { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Object rg_BiaoJiDuiXiang18, int rg_BiaoJiSuoYin14); }
    private re_WeiTu_QingQiuKaiShi rd_WeiTu_QingQiuKaiShi;
    private int rd_WeiTu_QingQiuKaiShi_tag;
    public void rl_WangLaoFangWenLei_WeiTu_QingQiuKaiShi (re_WeiTu_QingQiuKaiShi objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_QingQiuKaiShi = objListener;  rd_WeiTu_QingQiuKaiShi_tag = nTagNumber; }
    }
    public int rg_WeiTu_QingQiuKaiShi (java.lang.Object rg_BiaoJiDuiXiang18, int rg_BiaoJiSuoYin14) {
        re_WeiTu_QingQiuKaiShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_QingQiuKaiShi;  nTagNumber = rd_WeiTu_QingQiuKaiShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiDuiXiang18, rg_BiaoJiSuoYin14) : 0);
    }

    public static interface re_WeiTu_QingQiuJieShu { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, int rg_BiaoJiSuoYin15); }
    private re_WeiTu_QingQiuJieShu rd_WeiTu_QingQiuJieShu;
    private int rd_WeiTu_QingQiuJieShu_tag;
    public void rl_WangLaoFangWenLei_WeiTu_QingQiuJieShu (re_WeiTu_QingQiuJieShu objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_QingQiuJieShu = objListener;  rd_WeiTu_QingQiuJieShu_tag = nTagNumber; }
    }
    public int rg_WeiTu_QingQiuJieShu (int rg_BiaoJiSuoYin15) {
        re_WeiTu_QingQiuJieShu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_QingQiuJieShu;  nTagNumber = rd_WeiTu_QingQiuJieShu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiSuoYin15) : 0);
    }

    public static interface re_WeiTu_ShangChuanJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu8, java.lang.Object rg_BiaoJiDuiXiang19, int rg_BiaoJiSuoYin16); }
    private re_WeiTu_ShangChuanJinDuGaiBian rd_WeiTu_ShangChuanJinDuGaiBian;
    private int rd_WeiTu_ShangChuanJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WeiTu_ShangChuanJinDuGaiBian (re_WeiTu_ShangChuanJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_ShangChuanJinDuGaiBian = objListener;  rd_WeiTu_ShangChuanJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WeiTu_ShangChuanJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu8, java.lang.Object rg_BiaoJiDuiXiang19, int rg_BiaoJiSuoYin16) {
        re_WeiTu_ShangChuanJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_ShangChuanJinDuGaiBian;  nTagNumber = rd_WeiTu_ShangChuanJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu8, rg_BiaoJiDuiXiang19, rg_BiaoJiSuoYin16) : 0);
    }

    public static interface re_WeiTu_XiaZaiJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu9, java.lang.Object rg_BiaoJiDuiXiang20, int rg_BiaoJiSuoYin17); }
    private re_WeiTu_XiaZaiJinDuGaiBian rd_WeiTu_XiaZaiJinDuGaiBian;
    private int rd_WeiTu_XiaZaiJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WeiTu_XiaZaiJinDuGaiBian (re_WeiTu_XiaZaiJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WeiTu_XiaZaiJinDuGaiBian = objListener;  rd_WeiTu_XiaZaiJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WeiTu_XiaZaiJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu9, java.lang.Object rg_BiaoJiDuiXiang20, int rg_BiaoJiSuoYin17) {
        re_WeiTu_XiaZaiJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WeiTu_XiaZaiJinDuGaiBian;  nTagNumber = rd_WeiTu_XiaZaiJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu9, rg_BiaoJiDuiXiang20, rg_BiaoJiSuoYin17) : 0);
    }

    public static interface re_ZiJieShuZu_QingQiuChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, byte [] rg_QingQiuJieGuo2, com.lzy.okgo.model.Response rg_XiangYingDuiXiang7, java.lang.Object rg_BiaoJiDuiXiang21, int rg_BiaoJiSuoYin18); }
    private re_ZiJieShuZu_QingQiuChengGong rd_ZiJieShuZu_QingQiuChengGong;
    private int rd_ZiJieShuZu_QingQiuChengGong_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_QingQiuChengGong (re_ZiJieShuZu_QingQiuChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_QingQiuChengGong = objListener;  rd_ZiJieShuZu_QingQiuChengGong_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_QingQiuChengGong (byte [] rg_QingQiuJieGuo2, com.lzy.okgo.model.Response rg_XiangYingDuiXiang7, java.lang.Object rg_BiaoJiDuiXiang21, int rg_BiaoJiSuoYin18) {
        re_ZiJieShuZu_QingQiuChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_QingQiuChengGong;  nTagNumber = rd_ZiJieShuZu_QingQiuChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_QingQiuJieGuo2, rg_XiangYingDuiXiang7, rg_BiaoJiDuiXiang21, rg_BiaoJiSuoYin18) : 0);
    }

    public static interface re_ZiJieShuZu_HuanCunChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Response rg_XiangYingDuiXiang8, java.lang.Object rg_BiaoJiDuiXiang22, int rg_BiaoJiSuoYin19); }
    private re_ZiJieShuZu_HuanCunChengGong rd_ZiJieShuZu_HuanCunChengGong;
    private int rd_ZiJieShuZu_HuanCunChengGong_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_HuanCunChengGong (re_ZiJieShuZu_HuanCunChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_HuanCunChengGong = objListener;  rd_ZiJieShuZu_HuanCunChengGong_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_HuanCunChengGong (com.lzy.okgo.model.Response rg_XiangYingDuiXiang8, java.lang.Object rg_BiaoJiDuiXiang22, int rg_BiaoJiSuoYin19) {
        re_ZiJieShuZu_HuanCunChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_HuanCunChengGong;  nTagNumber = rd_ZiJieShuZu_HuanCunChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_XiangYingDuiXiang8, rg_BiaoJiDuiXiang22, rg_BiaoJiSuoYin19) : 0);
    }

    public static interface re_ZiJieShuZu_QingQiuShiBai { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Throwable rg_YiChangDuiXiang6, com.lzy.okgo.model.Response rg_XiangYingDuiXiang9, java.lang.Object rg_BiaoJiDuiXiang23, int rg_BiaoJiSuoYin20); }
    private re_ZiJieShuZu_QingQiuShiBai rd_ZiJieShuZu_QingQiuShiBai;
    private int rd_ZiJieShuZu_QingQiuShiBai_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_QingQiuShiBai (re_ZiJieShuZu_QingQiuShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_QingQiuShiBai = objListener;  rd_ZiJieShuZu_QingQiuShiBai_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_QingQiuShiBai (java.lang.Throwable rg_YiChangDuiXiang6, com.lzy.okgo.model.Response rg_XiangYingDuiXiang9, java.lang.Object rg_BiaoJiDuiXiang23, int rg_BiaoJiSuoYin20) {
        re_ZiJieShuZu_QingQiuShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_QingQiuShiBai;  nTagNumber = rd_ZiJieShuZu_QingQiuShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YiChangDuiXiang6, rg_XiangYingDuiXiang9, rg_BiaoJiDuiXiang23, rg_BiaoJiSuoYin20) : 0);
    }

    public static interface re_ZiJieShuZu_QingQiuKaiShi { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Object rg_BiaoJiDuiXiang24, int rg_BiaoJiSuoYin21); }
    private re_ZiJieShuZu_QingQiuKaiShi rd_ZiJieShuZu_QingQiuKaiShi;
    private int rd_ZiJieShuZu_QingQiuKaiShi_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_QingQiuKaiShi (re_ZiJieShuZu_QingQiuKaiShi objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_QingQiuKaiShi = objListener;  rd_ZiJieShuZu_QingQiuKaiShi_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_QingQiuKaiShi (java.lang.Object rg_BiaoJiDuiXiang24, int rg_BiaoJiSuoYin21) {
        re_ZiJieShuZu_QingQiuKaiShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_QingQiuKaiShi;  nTagNumber = rd_ZiJieShuZu_QingQiuKaiShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiDuiXiang24, rg_BiaoJiSuoYin21) : 0);
    }

    public static interface re_ZiJieShuZu_QingQiuJieShu { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, int rg_BiaoJiSuoYin22); }
    private re_ZiJieShuZu_QingQiuJieShu rd_ZiJieShuZu_QingQiuJieShu;
    private int rd_ZiJieShuZu_QingQiuJieShu_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_QingQiuJieShu (re_ZiJieShuZu_QingQiuJieShu objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_QingQiuJieShu = objListener;  rd_ZiJieShuZu_QingQiuJieShu_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_QingQiuJieShu (int rg_BiaoJiSuoYin22) {
        re_ZiJieShuZu_QingQiuJieShu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_QingQiuJieShu;  nTagNumber = rd_ZiJieShuZu_QingQiuJieShu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiSuoYin22) : 0);
    }

    public static interface re_ZiJieShuZu_ShangChuanJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu10, java.lang.Object rg_BiaoJiDuiXiang25, int rg_BiaoJiSuoYin23); }
    private re_ZiJieShuZu_ShangChuanJinDuGaiBian rd_ZiJieShuZu_ShangChuanJinDuGaiBian;
    private int rd_ZiJieShuZu_ShangChuanJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_ShangChuanJinDuGaiBian (re_ZiJieShuZu_ShangChuanJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_ShangChuanJinDuGaiBian = objListener;  rd_ZiJieShuZu_ShangChuanJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_ShangChuanJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu10, java.lang.Object rg_BiaoJiDuiXiang25, int rg_BiaoJiSuoYin23) {
        re_ZiJieShuZu_ShangChuanJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_ShangChuanJinDuGaiBian;  nTagNumber = rd_ZiJieShuZu_ShangChuanJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu10, rg_BiaoJiDuiXiang25, rg_BiaoJiSuoYin23) : 0);
    }

    public static interface re_ZiJieShuZu_XiaZaiJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu11, java.lang.Object rg_BiaoJiDuiXiang26, int rg_BiaoJiSuoYin24); }
    private re_ZiJieShuZu_XiaZaiJinDuGaiBian rd_ZiJieShuZu_XiaZaiJinDuGaiBian;
    private int rd_ZiJieShuZu_XiaZaiJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_ZiJieShuZu_XiaZaiJinDuGaiBian (re_ZiJieShuZu_XiaZaiJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_ZiJieShuZu_XiaZaiJinDuGaiBian = objListener;  rd_ZiJieShuZu_XiaZaiJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_ZiJieShuZu_XiaZaiJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu11, java.lang.Object rg_BiaoJiDuiXiang26, int rg_BiaoJiSuoYin24) {
        re_ZiJieShuZu_XiaZaiJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_ZiJieShuZu_XiaZaiJinDuGaiBian;  nTagNumber = rd_ZiJieShuZu_XiaZaiJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu11, rg_BiaoJiDuiXiang26, rg_BiaoJiSuoYin24) : 0);
    }

    public static interface re_WenJian_QingQiuChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.io.File rg_QingQiuJieGuo3, com.lzy.okgo.model.Response rg_XiangYingDuiXiang10, java.lang.Object rg_BiaoJiDuiXiang27, int rg_BiaoJiSuoYin25); }
    private re_WenJian_QingQiuChengGong rd_WenJian_QingQiuChengGong;
    private int rd_WenJian_QingQiuChengGong_tag;
    public void rl_WangLaoFangWenLei_WenJian_QingQiuChengGong (re_WenJian_QingQiuChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_QingQiuChengGong = objListener;  rd_WenJian_QingQiuChengGong_tag = nTagNumber; }
    }
    public int rg_WenJian_QingQiuChengGong (java.io.File rg_QingQiuJieGuo3, com.lzy.okgo.model.Response rg_XiangYingDuiXiang10, java.lang.Object rg_BiaoJiDuiXiang27, int rg_BiaoJiSuoYin25) {
        re_WenJian_QingQiuChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_QingQiuChengGong;  nTagNumber = rd_WenJian_QingQiuChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_QingQiuJieGuo3, rg_XiangYingDuiXiang10, rg_BiaoJiDuiXiang27, rg_BiaoJiSuoYin25) : 0);
    }

    public static interface re_WenJian_HuanCunChengGong { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Response rg_XiangYingDuiXiang11, java.lang.Object rg_BiaoJiDuiXiang28, int rg_BiaoJiSuoYin26); }
    private re_WenJian_HuanCunChengGong rd_WenJian_HuanCunChengGong;
    private int rd_WenJian_HuanCunChengGong_tag;
    public void rl_WangLaoFangWenLei_WenJian_HuanCunChengGong (re_WenJian_HuanCunChengGong objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_HuanCunChengGong = objListener;  rd_WenJian_HuanCunChengGong_tag = nTagNumber; }
    }
    public int rg_WenJian_HuanCunChengGong (com.lzy.okgo.model.Response rg_XiangYingDuiXiang11, java.lang.Object rg_BiaoJiDuiXiang28, int rg_BiaoJiSuoYin26) {
        re_WenJian_HuanCunChengGong objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_HuanCunChengGong;  nTagNumber = rd_WenJian_HuanCunChengGong_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_XiangYingDuiXiang11, rg_BiaoJiDuiXiang28, rg_BiaoJiSuoYin26) : 0);
    }

    public static interface re_WenJian_QingQiuShiBai { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Throwable rg_YiChangDuiXiang7, com.lzy.okgo.model.Response rg_XiangYingDuiXiang12, java.lang.Object rg_BiaoJiDuiXiang29, int rg_BiaoJiSuoYin27); }
    private re_WenJian_QingQiuShiBai rd_WenJian_QingQiuShiBai;
    private int rd_WenJian_QingQiuShiBai_tag;
    public void rl_WangLaoFangWenLei_WenJian_QingQiuShiBai (re_WenJian_QingQiuShiBai objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_QingQiuShiBai = objListener;  rd_WenJian_QingQiuShiBai_tag = nTagNumber; }
    }
    public int rg_WenJian_QingQiuShiBai (java.lang.Throwable rg_YiChangDuiXiang7, com.lzy.okgo.model.Response rg_XiangYingDuiXiang12, java.lang.Object rg_BiaoJiDuiXiang29, int rg_BiaoJiSuoYin27) {
        re_WenJian_QingQiuShiBai objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_QingQiuShiBai;  nTagNumber = rd_WenJian_QingQiuShiBai_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_YiChangDuiXiang7, rg_XiangYingDuiXiang12, rg_BiaoJiDuiXiang29, rg_BiaoJiSuoYin27) : 0);
    }

    public static interface re_WenJian_QingQiuKaiShi { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, java.lang.Object rg_BiaoJiDuiXiang30, int rg_BiaoJiSuoYin28); }
    private re_WenJian_QingQiuKaiShi rd_WenJian_QingQiuKaiShi;
    private int rd_WenJian_QingQiuKaiShi_tag;
    public void rl_WangLaoFangWenLei_WenJian_QingQiuKaiShi (re_WenJian_QingQiuKaiShi objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_QingQiuKaiShi = objListener;  rd_WenJian_QingQiuKaiShi_tag = nTagNumber; }
    }
    public int rg_WenJian_QingQiuKaiShi (java.lang.Object rg_BiaoJiDuiXiang30, int rg_BiaoJiSuoYin28) {
        re_WenJian_QingQiuKaiShi objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_QingQiuKaiShi;  nTagNumber = rd_WenJian_QingQiuKaiShi_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiDuiXiang30, rg_BiaoJiSuoYin28) : 0);
    }

    public static interface re_WenJian_QingQiuJieShu { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, int rg_BiaoJiSuoYin29); }
    private re_WenJian_QingQiuJieShu rd_WenJian_QingQiuJieShu;
    private int rd_WenJian_QingQiuJieShu_tag;
    public void rl_WangLaoFangWenLei_WenJian_QingQiuJieShu (re_WenJian_QingQiuJieShu objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_QingQiuJieShu = objListener;  rd_WenJian_QingQiuJieShu_tag = nTagNumber; }
    }
    public int rg_WenJian_QingQiuJieShu (int rg_BiaoJiSuoYin29) {
        re_WenJian_QingQiuJieShu objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_QingQiuJieShu;  nTagNumber = rd_WenJian_QingQiuJieShu_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_BiaoJiSuoYin29) : 0);
    }

    public static interface re_WenJian_ShangChuanJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu12, java.lang.Object rg_BiaoJiDuiXiang31, int rg_BiaoJiSuoYin30); }
    private re_WenJian_ShangChuanJinDuGaiBian rd_WenJian_ShangChuanJinDuGaiBian;
    private int rd_WenJian_ShangChuanJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WenJian_ShangChuanJinDuGaiBian (re_WenJian_ShangChuanJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_ShangChuanJinDuGaiBian = objListener;  rd_WenJian_ShangChuanJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WenJian_ShangChuanJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu12, java.lang.Object rg_BiaoJiDuiXiang31, int rg_BiaoJiSuoYin30) {
        re_WenJian_ShangChuanJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_ShangChuanJinDuGaiBian;  nTagNumber = rd_WenJian_ShangChuanJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu12, rg_BiaoJiDuiXiang31, rg_BiaoJiSuoYin30) : 0);
    }

    public static interface re_WenJian_XiaZaiJinDuGaiBian { int dispatch (rg_WangLaoFangWenLei objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_JinDu13, java.lang.Object rg_BiaoJiDuiXiang32, int rg_BiaoJiSuoYin31); }
    private re_WenJian_XiaZaiJinDuGaiBian rd_WenJian_XiaZaiJinDuGaiBian;
    private int rd_WenJian_XiaZaiJinDuGaiBian_tag;
    public void rl_WangLaoFangWenLei_WenJian_XiaZaiJinDuGaiBian (re_WenJian_XiaZaiJinDuGaiBian objListener, int nTagNumber) {
        synchronized (this) { rd_WenJian_XiaZaiJinDuGaiBian = objListener;  rd_WenJian_XiaZaiJinDuGaiBian_tag = nTagNumber; }
    }
    public int rg_WenJian_XiaZaiJinDuGaiBian (com.lzy.okgo.model.Progress rg_JinDu13, java.lang.Object rg_BiaoJiDuiXiang32, int rg_BiaoJiSuoYin31) {
        re_WenJian_XiaZaiJinDuGaiBian objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_WenJian_XiaZaiJinDuGaiBian;  nTagNumber = rd_WenJian_XiaZaiJinDuGaiBian_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_JinDu13, rg_BiaoJiDuiXiang32, rg_BiaoJiSuoYin31) : 0);
    }
}
