package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiOperateWXData
  extends b
{
  public static final int CTRL_INDEX = 79;
  public static final String NAME = "operateWXData";
  
  public JsApiOperateWXData()
  {
    GMTrace.i(18221130317824L, 135758);
    GMTrace.o(18221130317824L, 135758);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18221264535552L, 135759);
    try
    {
      String str = paramJSONObject.getString("data");
      paramJSONObject = new OperateWXDataTask();
      paramJSONObject.appId = paramj.hyD;
      paramJSONObject.ibp = "operateWXData";
      AppBrandSysConfig localAppBrandSysConfig = a.nK(paramj.hyD);
      if (localAppBrandSysConfig != null) {
        paramJSONObject.hZb = localAppBrandSysConfig.hRg.hKB;
      }
      paramJSONObject.ibm = this;
      paramJSONObject.hYK = paramj;
      paramJSONObject.ibF = str;
      paramJSONObject.hYL = paramInt;
      paramJSONObject.ibn = parama;
      paramJSONObject.ibu = new Bundle();
      paramj = a.nL(paramJSONObject.appId);
      if (paramj != null) {
        paramJSONObject.hZc = paramj.scene;
      }
      paramJSONObject.VM();
      AppBrandMainProcessService.a(paramJSONObject);
      GMTrace.o(18221264535552L, 135759);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiOperateWXData", "Exception %s", new Object[] { paramJSONObject.getMessage() });
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(18221264535552L, 135759);
    }
  }
  
  private static class OperateWXDataTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateWXDataTask> CREATOR;
    public String appId;
    j hYK;
    public int hYL;
    public int hZb;
    int hZc;
    public String ibF;
    public String ibG;
    public String ibH;
    b ibm;
    b.a ibn;
    public String ibp;
    public String ibq;
    public int ibr;
    public String ibs;
    public int ibt;
    public Bundle ibu;
    public String mAppName;
    
    static
    {
      GMTrace.i(18227975421952L, 135809);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18227975421952L, 135809);
    }
    
    public OperateWXDataTask()
    {
      GMTrace.i(18226499026944L, 135798);
      GMTrace.o(18226499026944L, 135798);
    }
    
    public OperateWXDataTask(Parcel paramParcel)
    {
      GMTrace.i(18226633244672L, 135799);
      f(paramParcel);
      GMTrace.o(18226633244672L, 135799);
    }
    
    private void a(String paramString1, String paramString2, String paramString3, int paramInt1, final int paramInt2, final a parama)
    {
      GMTrace.i(18227304333312L, 135804);
      h.xx().fYr.a(new com.tencent.mm.plugin.appbrand.g.b(paramString1, paramString2, paramString3, paramInt1, paramInt2, this.hZc, new com.tencent.mm.plugin.appbrand.g.b.a() {}), 0);
      GMTrace.o(18227304333312L, 135804);
    }
    
    public final void RY()
    {
      GMTrace.i(18226767462400L, 135800);
      a local1 = new a()
      {
        public final void a(LinkedList<baa> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(18218580180992L, 135739);
          w.d("MicroMsg.JsApiOperateWXData", "onConfirm !");
          JsApiOperateWXData.OperateWXDataTask.this.ibt = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiOperateWXData.OperateWXDataTask.this.ibt)
          {
            baa localbaa = (baa)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiOperateWXData.OperateWXDataTask.this.ibu.putByteArray(String.valueOf(i), localbaa.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiOperateWXData", paramAnonymousLinkedList, "", new Object[0]);
              JsApiOperateWXData.OperateWXDataTask.this.ibq = "fail";
              JsApiOperateWXData.OperateWXDataTask.c(JsApiOperateWXData.OperateWXDataTask.this);
              GMTrace.o(18218580180992L, 135739);
              return;
            }
          }
          JsApiOperateWXData.OperateWXDataTask.this.mAppName = paramAnonymousString1;
          JsApiOperateWXData.OperateWXDataTask.this.ibs = paramAnonymousString2;
          JsApiOperateWXData.OperateWXDataTask.this.ibq = "needConfirm";
          JsApiOperateWXData.OperateWXDataTask.d(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218580180992L, 135739);
        }
        
        public final void eu(String paramAnonymousString)
        {
          GMTrace.i(18218445963264L, 135738);
          w.e("MicroMsg.JsApiOperateWXData", "onFailure !");
          JsApiOperateWXData.OperateWXDataTask.this.ibq = ("fail:" + paramAnonymousString);
          JsApiOperateWXData.OperateWXDataTask.b(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218445963264L, 135738);
        }
        
        public final void qm(String paramAnonymousString)
        {
          GMTrace.i(18218311745536L, 135737);
          w.d("MicroMsg.JsApiOperateWXData", "onSuccess !");
          JsApiOperateWXData.OperateWXDataTask.this.ibG = paramAnonymousString;
          JsApiOperateWXData.OperateWXDataTask.this.ibq = "ok";
          JsApiOperateWXData.OperateWXDataTask.a(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218311745536L, 135737);
        }
      };
      if (this.ibp.equals("operateWXData"))
      {
        a(this.appId, this.ibF, "", this.hZb, this.ibr, local1);
        GMTrace.o(18226767462400L, 135800);
        return;
      }
      if (this.ibp.equals("operateWXDataConfirm")) {
        a(this.appId, this.ibF, this.ibH, this.hZb, this.ibr, local1);
      }
      GMTrace.o(18226767462400L, 135800);
    }
    
    public final void VK()
    {
      GMTrace.i(18226901680128L, 135801);
      VN();
      if (!this.hYK.mRunning)
      {
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      Object localObject;
      if (this.ibq.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("data", this.ibG);
        this.hYK.v(this.hYL, this.ibm.d("ok", (Map)localObject));
        this.ibn.Wd();
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      if (this.ibq.contains("fail"))
      {
        this.ibm.a(this.hYK, this.hYL, this.ibq);
        this.ibn.Wd();
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      if (this.ibq.equals("needConfirm"))
      {
        localObject = new LinkedList();
        int i = 0;
        while (i < this.ibt)
        {
          byte[] arrayOfByte = this.ibu.getByteArray(String.valueOf(i));
          baa localbaa = new baa();
          try
          {
            localbaa.aD(arrayOfByte);
            ((LinkedList)localObject).add(localbaa);
            i += 1;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiOperateWXData", localIOException, "", new Object[0]);
            this.ibm.a(this.hYK, this.hYL, "fail");
            this.ibn.Wd();
            GMTrace.o(18226901680128L, 135801);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18216969568256L, 135727);
              c.a local1 = new c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18215090520064L, 135713);
                  w.i("MicroMsg.JsApiOperateWXData", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiOperateWXData", "press back button!");
                    JsApiOperateWXData.OperateWXDataTask.this.ibm.a(JsApiOperateWXData.OperateWXDataTask.this.hYK, JsApiOperateWXData.OperateWXDataTask.this.hYL, "fail auth cancel");
                    JsApiOperateWXData.OperateWXDataTask.this.ibn.Wd();
                    GMTrace.o(18215090520064L, 135713);
                    return;
                  }
                  JsApiOperateWXData.OperateWXDataTask.this.ibp = "operateWXDataConfirm";
                  paramAnonymous2Bundle = (ArrayList)paramAnonymous2Bundle.getSerializable("key_scope");
                  if ((paramAnonymous2Bundle != null) && (paramAnonymous2Bundle.size() > 0)) {}
                  for (JsApiOperateWXData.OperateWXDataTask.this.ibH = ((String)paramAnonymous2Bundle.get(0));; JsApiOperateWXData.OperateWXDataTask.this.ibH = "")
                  {
                    JsApiOperateWXData.OperateWXDataTask.this.ibr = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiOperateWXData.OperateWXDataTask.this);
                    if (paramAnonymous2Int != 2) {
                      break;
                    }
                    JsApiOperateWXData.OperateWXDataTask.this.ibm.a(JsApiOperateWXData.OperateWXDataTask.this.hYK, JsApiOperateWXData.OperateWXDataTask.this.hYL, "fail auth deny");
                    JsApiOperateWXData.OperateWXDataTask.this.ibn.Wd();
                    GMTrace.o(18215090520064L, 135713);
                    return;
                  }
                }
              };
              JsApiOperateWXData.OperateWXDataTask.this.hYK.hzM.a(new c(JsApiOperateWXData.OperateWXDataTask.this.ibm.a(JsApiOperateWXData.OperateWXDataTask.this.hYK), localIOException, JsApiOperateWXData.OperateWXDataTask.this.mAppName, JsApiOperateWXData.OperateWXDataTask.this.ibs, local1));
              GMTrace.o(18216969568256L, 135727);
            }
          });
          GMTrace.o(18226901680128L, 135801);
          return;
        }
        this.ibm.a(this.hYK, this.hYL, "fail");
        this.ibn.Wd();
      }
      GMTrace.o(18226901680128L, 135801);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18227035897856L, 135802);
      this.appId = paramParcel.readString();
      this.ibq = paramParcel.readString();
      this.mAppName = paramParcel.readString();
      this.ibs = paramParcel.readString();
      this.ibF = paramParcel.readString();
      this.ibG = paramParcel.readString();
      this.hYL = paramParcel.readInt();
      this.ibp = paramParcel.readString();
      this.ibH = paramParcel.readString();
      this.ibt = paramParcel.readInt();
      this.ibu = paramParcel.readBundle(JsApiOperateWXData.class.getClassLoader());
      this.hZb = paramParcel.readInt();
      this.ibr = paramParcel.readInt();
      this.hZc = paramParcel.readInt();
      GMTrace.o(18227035897856L, 135802);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18227170115584L, 135803);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ibq);
      paramParcel.writeString(this.mAppName);
      paramParcel.writeString(this.ibs);
      paramParcel.writeString(this.ibF);
      paramParcel.writeString(this.ibG);
      paramParcel.writeInt(this.hYL);
      paramParcel.writeString(this.ibp);
      paramParcel.writeString(this.ibH);
      paramParcel.writeInt(this.ibt);
      paramParcel.writeBundle(this.ibu);
      paramParcel.writeInt(this.hZb);
      paramParcel.writeInt(this.ibr);
      paramParcel.writeInt(this.hZc);
      GMTrace.o(18227170115584L, 135803);
    }
    
    public static abstract interface a
    {
      public abstract void a(LinkedList<baa> paramLinkedList, String paramString1, String paramString2);
      
      public abstract void eu(String paramString);
      
      public abstract void qm(String paramString);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\auth\JsApiOperateWXData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */