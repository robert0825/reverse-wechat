package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.aju;
import com.tencent.mm.protocal.c.ajv;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiRefreshSession
  extends a
{
  private static final int CTRL_INDEX = 118;
  private static final String NAME = "refreshSession";
  
  public JsApiRefreshSession()
  {
    GMTrace.i(10384291397632L, 77369);
    GMTrace.o(10384291397632L, 77369);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10384425615360L, 77370);
    paramJSONObject = new RefreshSessionTask();
    Object localObject = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    if (localObject != null) {
      paramJSONObject.hZb = ((AppBrandSysConfig)localObject).hRg.hKB;
    }
    localObject = paramj.hyD;
    paramJSONObject.hYX = this;
    paramJSONObject.hYK = paramj;
    paramJSONObject.hYL = paramInt;
    paramJSONObject.appId = ((String)localObject);
    paramj = com.tencent.mm.plugin.appbrand.a.nL((String)localObject);
    if (paramj != null) {
      paramJSONObject.hZc = paramj.scene;
    }
    paramJSONObject.VM();
    AppBrandMainProcessService.a(paramJSONObject);
    GMTrace.o(10384425615360L, 77370);
  }
  
  public static class RefreshSessionTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<RefreshSessionTask> CREATOR;
    String appId;
    j hYK;
    int hYL;
    d hYX;
    public int hYY;
    public int hYZ;
    public int hZa;
    public int hZb;
    int hZc;
    
    static
    {
      GMTrace.i(10310471647232L, 76819);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10310471647232L, 76819);
    }
    
    public RefreshSessionTask()
    {
      GMTrace.i(10308458381312L, 76804);
      GMTrace.o(10308458381312L, 76804);
    }
    
    public RefreshSessionTask(Parcel paramParcel)
    {
      GMTrace.i(10308592599040L, 76805);
      f(paramParcel);
      GMTrace.o(10308592599040L, 76805);
    }
    
    public final void RY()
    {
      GMTrace.i(10308726816768L, 76806);
      VM();
      b.a locala = new b.a();
      locala.gtF = new aju();
      locala.gtG = new ajv();
      locala.uri = "/cgi-bin/mmbiz-bin/js-refreshsession";
      locala.gtE = 1196;
      locala.gtH = 0;
      locala.gtI = 0;
      aju localaju = new aju();
      localaju.lQa = this.appId;
      localaju.uyt = this.hZb;
      locala.gtF = localaju;
      if (this.hZc > 0)
      {
        localaju.uyu = new bvc();
        localaju.uyu.scene = this.hZc;
      }
      w.i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", new Object[] { this.appId, Integer.valueOf(this.hZb), Integer.valueOf(this.hZc) });
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(10355166150656L, 77152);
          w.d("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            JsApiRefreshSession.RefreshSessionTask.this.hZa = 0;
            JsApiRefreshSession.RefreshSessionTask.a(JsApiRefreshSession.RefreshSessionTask.this);
            GMTrace.o(10355166150656L, 77152);
            return 0;
          }
          paramAnonymousString = (ajv)paramAnonymousb.gtD.gtK;
          if (paramAnonymousString == null)
          {
            JsApiRefreshSession.RefreshSessionTask.this.hZa = 0;
            w.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
            JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this);
          }
          for (;;)
          {
            GMTrace.o(10355166150656L, 77152);
            return 0;
            JsApiRefreshSession.RefreshSessionTask.this.hYZ = paramAnonymousString.uyv.eGy;
            paramAnonymousb = paramAnonymousString.uyv.eGz;
            if (JsApiRefreshSession.RefreshSessionTask.this.hYZ == 0)
            {
              JsApiRefreshSession.RefreshSessionTask.this.hYY = paramAnonymousString.uyD;
              JsApiRefreshSession.RefreshSessionTask.this.hYZ = paramAnonymousString.uyv.eGy;
              JsApiRefreshSession.RefreshSessionTask.this.hZa = 1;
              JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this);
            }
            else
            {
              JsApiRefreshSession.RefreshSessionTask.this.hYZ = paramAnonymousString.uyv.eGy;
              JsApiRefreshSession.RefreshSessionTask.this.hZa = 2;
              w.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", new Object[] { paramAnonymousb });
              JsApiRefreshSession.RefreshSessionTask.d(JsApiRefreshSession.RefreshSessionTask.this);
            }
          }
        }
      }, true);
      GMTrace.o(10308726816768L, 76806);
    }
    
    public final void VK()
    {
      GMTrace.i(10308861034496L, 76807);
      HashMap localHashMap = new HashMap();
      switch (this.hZa)
      {
      default: 
        localHashMap.put("errCode", "-1");
        this.hYK.v(this.hYL, this.hYX.d("fail", localHashMap));
      }
      for (;;)
      {
        VN();
        GMTrace.o(10308861034496L, 76807);
        return;
        localHashMap.put("expireIn", this.hYY);
        localHashMap.put("errCode", this.hYZ);
        this.hYK.v(this.hYL, this.hYX.d("ok", localHashMap));
        continue;
        localHashMap.put("errCode", this.hYZ);
        this.hYK.v(this.hYL, this.hYX.d("fail", localHashMap));
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10308995252224L, 76808);
      this.hYY = paramParcel.readInt();
      this.hYZ = paramParcel.readInt();
      this.hZa = paramParcel.readInt();
      this.hYL = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.hZb = paramParcel.readInt();
      this.hZc = paramParcel.readInt();
      GMTrace.o(10308995252224L, 76808);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10309129469952L, 76809);
      paramParcel.writeInt(this.hYY);
      paramParcel.writeInt(this.hYZ);
      paramParcel.writeInt(this.hZa);
      paramParcel.writeInt(this.hYL);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.hZb);
      paramParcel.writeInt(this.hZc);
      GMTrace.o(10309129469952L, 76809);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiRefreshSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */