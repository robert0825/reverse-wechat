package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.jsapi.a.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiAuthorize
  extends b
{
  private static final int CTRL_INDEX = 54;
  private static final String NAME = "authorize";
  
  public JsApiAuthorize()
  {
    GMTrace.i(18222740930560L, 135770);
    GMTrace.o(18222740930560L, 135770);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18222875148288L, 135771);
    w.d("MicroMsg.JsApiAuthorize", "stev JsApiAuthorize!");
    AuthorizeTask localAuthorizeTask = new AuthorizeTask();
    localAuthorizeTask.appId = paramj.hyD;
    localAuthorizeTask.ibp = "authorize";
    Object localObject = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    if (localObject != null) {
      localAuthorizeTask.hZb = ((AppBrandSysConfig)localObject).hRg.hKB;
    }
    localObject = com.tencent.mm.plugin.appbrand.a.nL(paramj.hyD);
    if (localObject != null) {
      localAuthorizeTask.hZc = ((AppBrandStatObject)localObject).scene;
    }
    paramJSONObject = paramJSONObject.toString();
    localAuthorizeTask.ibm = this;
    localAuthorizeTask.hYK = paramj;
    localAuthorizeTask.data = paramJSONObject;
    localAuthorizeTask.hYL = paramInt;
    localAuthorizeTask.ibn = parama;
    localAuthorizeTask.ibu = new Bundle();
    localAuthorizeTask.VM();
    AppBrandMainProcessService.a(localAuthorizeTask);
    GMTrace.o(18222875148288L, 135771);
  }
  
  private static class AuthorizeTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<AuthorizeTask> CREATOR;
    public String appId;
    public String data;
    j hYK;
    public int hYL;
    public int hZb;
    public int hZc;
    b ibm;
    b.a ibn;
    public Bundle ibo;
    public String ibp;
    public String ibq;
    public int ibr;
    public String ibs;
    public int ibt;
    public Bundle ibu;
    public String mAppName;
    
    static
    {
      GMTrace.i(18214553649152L, 135709);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18214553649152L, 135709);
    }
    
    public AuthorizeTask()
    {
      GMTrace.i(18213077254144L, 135698);
      GMTrace.o(18213077254144L, 135698);
    }
    
    public AuthorizeTask(Parcel paramParcel)
    {
      GMTrace.i(18213211471872L, 135699);
      f(paramParcel);
      GMTrace.o(18213211471872L, 135699);
    }
    
    private void a(String paramString, Bundle paramBundle, int paramInt1, final int paramInt2, final a parama)
    {
      GMTrace.i(18213882560512L, 135704);
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramBundle.add((String)((Iterator)localObject).next());
      }
      h.xx().fYr.a(new com.tencent.mm.jsapi.a.b(paramString, paramBundle, paramInt1, paramInt2, this.hZc, new com.tencent.mm.jsapi.a.b.a() {}), 0);
      GMTrace.o(18213882560512L, 135704);
    }
    
    public final void RY()
    {
      GMTrace.i(18213345689600L, 135700);
      a local1 = new a()
      {
        public final void Wh()
        {
          GMTrace.i(18222472495104L, 135768);
          w.e("MicroMsg.JsApiAuthorize", "onFailure !");
          JsApiAuthorize.AuthorizeTask.this.ibq = "fail";
          JsApiAuthorize.AuthorizeTask.b(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222472495104L, 135768);
        }
        
        public final void a(LinkedList<baa> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(18222606712832L, 135769);
          w.d("MicroMsg.JsApiAuthorize", "onConfirm !");
          JsApiAuthorize.AuthorizeTask.this.ibt = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiAuthorize.AuthorizeTask.this.ibt)
          {
            baa localbaa = (baa)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiAuthorize.AuthorizeTask.this.ibu.putByteArray(String.valueOf(i), localbaa.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiAuthorize", paramAnonymousLinkedList, "", new Object[0]);
              JsApiAuthorize.AuthorizeTask.this.ibq = "fail";
              JsApiAuthorize.AuthorizeTask.c(JsApiAuthorize.AuthorizeTask.this);
              GMTrace.o(18222606712832L, 135769);
              return;
            }
          }
          JsApiAuthorize.AuthorizeTask.this.mAppName = paramAnonymousString1;
          JsApiAuthorize.AuthorizeTask.this.ibs = paramAnonymousString2;
          JsApiAuthorize.AuthorizeTask.this.ibq = "needConfirm";
          JsApiAuthorize.AuthorizeTask.d(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222606712832L, 135769);
        }
        
        public final void onSuccess()
        {
          GMTrace.i(18222338277376L, 135767);
          w.d("MicroMsg.JsApiAuthorize", "onSuccess !");
          JsApiAuthorize.AuthorizeTask.this.ibq = "ok";
          JsApiAuthorize.AuthorizeTask.a(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222338277376L, 135767);
        }
      };
      if (this.ibp.equals("authorize"))
      {
        Object localObject;
        LinkedList localLinkedList;
        try
        {
          localObject = new JSONArray(new JSONObject(this.data).optString("scope"));
          localLinkedList = new LinkedList();
          i = 0;
          while (i < ((JSONArray)localObject).length())
          {
            localLinkedList.add(((JSONArray)localObject).optString(i));
            i += 1;
          }
          localObject = this.appId;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiAuthorize", "Exception %s", new Object[] { localException.getMessage() });
          this.ibq = "fail";
          VL();
          GMTrace.o(18213345689600L, 135700);
          return;
        }
        int i = this.hZb;
        h.xx().fYr.a(new com.tencent.mm.jsapi.a.a((String)localObject, localLinkedList, i, this.hZc, new a.a() {}), 0);
        GMTrace.o(18213345689600L, 135700);
        return;
      }
      if (this.ibp.equals("authorizeConfirm")) {
        a(this.appId, this.ibo, this.hZb, this.ibr, localException);
      }
      GMTrace.o(18213345689600L, 135700);
    }
    
    public final void VK()
    {
      GMTrace.i(18213479907328L, 135701);
      VN();
      if (!this.hYK.mRunning)
      {
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.ibq.equals("ok"))
      {
        this.ibm.a(this.hYK, this.hYL, "ok");
        this.ibn.Wd();
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.ibq.equals("fail"))
      {
        this.ibm.a(this.hYK, this.hYL, "fail");
        this.ibn.Wd();
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.ibq.equals("needConfirm"))
      {
        LinkedList localLinkedList = new LinkedList();
        int i = 0;
        while (i < this.ibt)
        {
          byte[] arrayOfByte = this.ibu.getByteArray(String.valueOf(i));
          baa localbaa = new baa();
          try
          {
            localbaa.aD(arrayOfByte);
            localLinkedList.add(localbaa);
            i += 1;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiAuthorize", localIOException, "", new Object[0]);
            this.ibm.a(this.hYK, this.hYL, "fail");
            this.ibn.Wd();
            GMTrace.o(18213479907328L, 135701);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18214822084608L, 135711);
              c.a local1 = new c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18221667188736L, 135762);
                  w.i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiAuthorize", "press back button!");
                    JsApiAuthorize.AuthorizeTask.this.ibm.a(JsApiAuthorize.AuthorizeTask.this.hYK, JsApiAuthorize.AuthorizeTask.this.hYL, "fail auth cancel");
                    JsApiAuthorize.AuthorizeTask.this.ibn.Wd();
                  }
                  do
                  {
                    GMTrace.o(18221667188736L, 135762);
                    return;
                    JsApiAuthorize.AuthorizeTask.this.ibp = "authorizeConfirm";
                    JsApiAuthorize.AuthorizeTask.this.ibo = paramAnonymous2Bundle;
                    JsApiAuthorize.AuthorizeTask.this.ibr = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiAuthorize.AuthorizeTask.this);
                  } while (paramAnonymous2Int != 2);
                  JsApiAuthorize.AuthorizeTask.this.ibm.a(JsApiAuthorize.AuthorizeTask.this.hYK, JsApiAuthorize.AuthorizeTask.this.hYL, "fail auth deny");
                  JsApiAuthorize.AuthorizeTask.this.ibn.Wd();
                  GMTrace.o(18221667188736L, 135762);
                }
              };
              JsApiAuthorize.AuthorizeTask.this.hYK.hzM.a(new c(JsApiAuthorize.AuthorizeTask.this.ibm.a(JsApiAuthorize.AuthorizeTask.this.hYK), localIOException, JsApiAuthorize.AuthorizeTask.this.mAppName, JsApiAuthorize.AuthorizeTask.this.ibs, local1));
              GMTrace.o(18214822084608L, 135711);
            }
          });
          GMTrace.o(18213479907328L, 135701);
          return;
        }
        this.ibm.a(this.hYK, this.hYL, "fail");
        this.ibn.Wd();
      }
      GMTrace.o(18213479907328L, 135701);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18213614125056L, 135702);
      this.data = paramParcel.readString();
      this.hYL = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.ibq = paramParcel.readString();
      this.ibp = paramParcel.readString();
      this.mAppName = paramParcel.readString();
      this.ibs = paramParcel.readString();
      this.ibt = paramParcel.readInt();
      this.ibu = paramParcel.readBundle(JsApiAuthorize.class.getClassLoader());
      this.ibo = paramParcel.readBundle(JsApiAuthorize.class.getClassLoader());
      this.hZb = paramParcel.readInt();
      this.ibr = paramParcel.readInt();
      this.hZc = paramParcel.readInt();
      GMTrace.o(18213614125056L, 135702);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18213748342784L, 135703);
      paramParcel.writeString(this.data);
      paramParcel.writeInt(this.hYL);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ibq);
      paramParcel.writeString(this.ibp);
      paramParcel.writeString(this.mAppName);
      paramParcel.writeString(this.ibs);
      paramParcel.writeInt(this.ibt);
      paramParcel.writeBundle(this.ibu);
      paramParcel.writeBundle(this.ibo);
      paramParcel.writeInt(this.hZb);
      paramParcel.writeInt(this.ibr);
      paramParcel.writeInt(this.hZc);
      GMTrace.o(18213748342784L, 135703);
    }
    
    public static abstract interface a
    {
      public abstract void Wh();
      
      public abstract void a(LinkedList<baa> paramLinkedList, String paramString1, String paramString2);
      
      public abstract void onSuccess();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\auth\JsApiAuthorize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */