package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.Window;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.ipc.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.pluginsdk.model.r;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class JsApiOpenDocument
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 99;
  private static final String NAME = "openDocument";
  private static long iex;
  
  static
  {
    GMTrace.i(10393149767680L, 77435);
    iex = -1L;
    GMTrace.o(10393149767680L, 77435);
  }
  
  public JsApiOpenDocument()
  {
    GMTrace.i(10392612896768L, 77431);
    GMTrace.o(10392612896768L, 77431);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10392747114496L, 77432);
    super.a(paramj, paramJSONObject, paramInt);
    long l = bg.Pv();
    if (l - iex < 1000L)
    {
      paramj.v(paramInt, d("fail:document viewer already starting", null));
      GMTrace.o(10392747114496L, 77432);
      return;
    }
    iex = l;
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10392747114496L, 77432);
      return;
    }
    Object localObject = paramJSONObject.optString("filePath");
    if (bg.nm((String)localObject))
    {
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10392747114496L, 77432);
      return;
    }
    AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.aJ(paramj.hyD, (String)localObject);
    if (localAppBrandLocalMediaObject == null)
    {
      paramj.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(10392747114496L, 77432);
      return;
    }
    localObject = new OpenRequest();
    ((OpenRequest)localObject).filePath = localAppBrandLocalMediaObject.gpy;
    ((OpenRequest)localObject).hLy = s.OV(localAppBrandLocalMediaObject.mimeType);
    paramJSONObject = paramJSONObject.optString("fileType");
    if (!bg.nm(paramJSONObject)) {
      ((OpenRequest)localObject).hLy = paramJSONObject;
    }
    com.tencent.mm.plugin.appbrand.ipc.a.b(localMMActivity, (AppBrandProxyUIProcessTask.ProcessRequest)localObject, new AppBrandProxyUIProcessTask.b() {});
    GMTrace.o(10392747114496L, 77432);
  }
  
  private static final class OpenRequest
    extends AppBrandProxyUIProcessTask.ProcessRequest
  {
    public static final Parcelable.Creator<OpenRequest> CREATOR;
    public String filePath;
    public String hLy;
    
    static
    {
      GMTrace.i(10391002284032L, 77419);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10391002284032L, 77419);
    }
    
    OpenRequest()
    {
      GMTrace.i(10390733848576L, 77417);
      GMTrace.o(10390733848576L, 77417);
    }
    
    OpenRequest(Parcel paramParcel)
    {
      super();
      GMTrace.i(10390868066304L, 77418);
      GMTrace.o(10390868066304L, 77418);
    }
    
    protected final String VH()
    {
      GMTrace.i(16156324790272L, 120374);
      GMTrace.o(16156324790272L, 120374);
      return "QbDocumentReader";
    }
    
    protected final Class<? extends AppBrandProxyUIProcessTask> VI()
    {
      GMTrace.i(10390196977664L, 77413);
      GMTrace.o(10390196977664L, 77413);
      return JsApiOpenDocument.a.class;
    }
    
    public final int describeContents()
    {
      GMTrace.i(10390465413120L, 77415);
      GMTrace.o(10390465413120L, 77415);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      GMTrace.i(10390331195392L, 77414);
      super.h(paramParcel);
      this.filePath = paramParcel.readString();
      this.hLy = paramParcel.readString();
      GMTrace.o(10390331195392L, 77414);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10390599630848L, 77416);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.filePath);
      paramParcel.writeString(this.hLy);
      GMTrace.o(10390599630848L, 77416);
    }
  }
  
  private static final class OpenResult
    extends AppBrandProxyUIProcessTask.ProcessResult
  {
    public static final Parcelable.Creator<OpenResult> CREATOR;
    public int ret;
    
    static
    {
      GMTrace.i(10392478679040L, 77430);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10392478679040L, 77430);
    }
    
    OpenResult()
    {
      GMTrace.i(10392210243584L, 77428);
      GMTrace.o(10392210243584L, 77428);
    }
    
    OpenResult(Parcel paramParcel)
    {
      super();
      GMTrace.i(10392344461312L, 77429);
      GMTrace.o(10392344461312L, 77429);
    }
    
    public final int describeContents()
    {
      GMTrace.i(10391941808128L, 77426);
      GMTrace.o(10391941808128L, 77426);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      GMTrace.i(10391807590400L, 77425);
      this.ret = paramParcel.readInt();
      GMTrace.o(10391807590400L, 77425);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10392076025856L, 77427);
      paramParcel.writeInt(this.ret);
      GMTrace.o(10392076025856L, 77427);
    }
  }
  
  private static final class a
    extends AppBrandProxyUIProcessTask
  {
    private static final int iez;
    
    static
    {
      GMTrace.i(17671911374848L, 131666);
      iez = a.class.hashCode() & 0xFFFF;
      GMTrace.o(17671911374848L, 131666);
    }
    
    private a()
    {
      GMTrace.i(10388586364928L, 77401);
      GMTrace.o(10388586364928L, 77401);
    }
    
    protected final void VF()
    {
      GMTrace.i(10388854800384L, 77403);
      super.VF();
      VD().getWindow().setBackgroundDrawableResource(o.c.transparent);
      GMTrace.o(10388854800384L, 77403);
    }
    
    public final void a(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(17671508721664L, 131663);
      if (iez == paramInt1)
      {
        paramIntent = new JsApiOpenDocument.OpenResult();
        if (-1 == paramInt2) {}
        for (paramIntent.ret = 0;; paramIntent.ret = Integer.MAX_VALUE)
        {
          a(paramIntent);
          GMTrace.o(17671508721664L, 131663);
          return;
        }
      }
      a(null);
      GMTrace.o(17671508721664L, 131663);
    }
    
    protected final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      GMTrace.i(10388720582656L, 77402);
      String str1 = ((JsApiOpenDocument.OpenRequest)paramProcessRequest).filePath;
      paramProcessRequest = ((JsApiOpenDocument.OpenRequest)paramProcessRequest).hLy;
      String str2 = Integer.toString(VD().hashCode());
      int i = r.a(VD(), str1, paramProcessRequest, str2, new ValueCallback() {});
      w.i("MicroMsg.AppBrand.JsApiOpenDocument", "QB openReadFile, ret = %d", new Object[] { Integer.valueOf(i) });
      if (i == -102) {
        try
        {
          paramProcessRequest = ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).k(VD(), str1, paramProcessRequest);
          int j = iez;
          VD().vKC = this;
          VD().startActivityForResult(paramProcessRequest, j);
          GMTrace.o(10388720582656L, 77402);
          return;
        }
        catch (Exception paramProcessRequest)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenDocument", paramProcessRequest, " fallback to AppChooserUI ", new Object[0]);
        }
      }
      paramProcessRequest = new JsApiOpenDocument.OpenResult();
      paramProcessRequest.ret = i;
      if (paramProcessRequest.ret != 0)
      {
        a(paramProcessRequest);
        GMTrace.o(10388720582656L, 77402);
        return;
      }
      if (this.hWZ != null) {
        this.hWZ.b(paramProcessRequest);
      }
      GMTrace.o(10388720582656L, 77402);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\file\JsApiOpenDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */