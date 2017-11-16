package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.jsapi.a.d;
import com.tencent.mm.jsapi.a.d.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiLogin
  extends b
{
  public static final int CTRL_INDEX = 52;
  public static final String NAME = "login";
  
  public JsApiLogin()
  {
    GMTrace.i(18221801406464L, 135763);
    GMTrace.o(18221801406464L, 135763);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18221935624192L, 135764);
    LoginTask localLoginTask = new LoginTask();
    localLoginTask.appId = paramj.hyD;
    localLoginTask.ibp = "login";
    Object localObject = a.nK(paramj.hyD);
    if (localObject != null) {
      localLoginTask.hZb = ((AppBrandSysConfig)localObject).hRg.hKB;
    }
    localObject = a.nL(paramj.hyD);
    if (localObject != null) {
      localLoginTask.hZc = ((AppBrandStatObject)localObject).scene;
    }
    paramJSONObject = paramJSONObject.toString();
    localLoginTask.ibm = this;
    localLoginTask.hYK = paramj;
    localLoginTask.data = paramJSONObject;
    localLoginTask.hYL = paramInt;
    localLoginTask.ibn = parama;
    localLoginTask.ibu = new Bundle();
    localLoginTask.VM();
    AppBrandMainProcessService.a(localLoginTask);
    GMTrace.o(18221935624192L, 135764);
  }
  
  private static class LoginTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<LoginTask> CREATOR;
    public String appId;
    public String code;
    public String data;
    j hYK;
    public int hYL;
    public int hZb;
    public int hZc;
    public int ibA;
    public String ibB;
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
      GMTrace.i(18216701132800L, 135725);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18216701132800L, 135725);
    }
    
    public LoginTask()
    {
      GMTrace.i(18215224737792L, 135714);
      GMTrace.o(18215224737792L, 135714);
    }
    
    public LoginTask(Parcel paramParcel)
    {
      GMTrace.i(18215358955520L, 135715);
      f(paramParcel);
      GMTrace.o(18215358955520L, 135715);
    }
    
    private void a(String paramString1, Bundle paramBundle, int paramInt1, String paramString2, int paramInt2, final int paramInt3, final a parama)
    {
      GMTrace.i(18216030044160L, 135720);
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramBundle.add((String)((Iterator)localObject).next());
      }
      h.xx().fYr.a(new d(paramString1, paramBundle, paramInt1, paramString2, paramInt2, paramInt3, this.hZc, new d.a() {}), 0);
      GMTrace.o(18216030044160L, 135720);
    }
    
    public final void RY()
    {
      GMTrace.i(18215493173248L, 135716);
      final a local1 = new a()
      {
        public final void Wh()
        {
          GMTrace.i(18225022631936L, 135787);
          w.i("MicroMsg.JsApiLogin", "onFailure !");
          JsApiLogin.LoginTask.this.ibq = "fail";
          JsApiLogin.LoginTask.b(JsApiLogin.LoginTask.this);
          GMTrace.o(18225022631936L, 135787);
        }
        
        public final void a(LinkedList<baa> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
        {
          GMTrace.i(18225156849664L, 135788);
          w.i("MicroMsg.JsApiLogin", "onConfirm !");
          JsApiLogin.LoginTask.this.ibt = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiLogin.LoginTask.this.ibt)
          {
            baa localbaa = (baa)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiLogin.LoginTask.this.ibu.putByteArray(String.valueOf(i), localbaa.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiLogin", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiLogin", paramAnonymousLinkedList, "", new Object[0]);
              JsApiLogin.LoginTask.this.ibq = "fail";
              JsApiLogin.LoginTask.c(JsApiLogin.LoginTask.this);
              GMTrace.o(18225156849664L, 135788);
              return;
            }
          }
          JsApiLogin.LoginTask.this.ibB = paramAnonymousString3;
          JsApiLogin.LoginTask.this.mAppName = paramAnonymousString1;
          JsApiLogin.LoginTask.this.ibs = paramAnonymousString2;
          JsApiLogin.LoginTask.this.ibq = "needConfirm";
          JsApiLogin.LoginTask.d(JsApiLogin.LoginTask.this);
          GMTrace.o(18225156849664L, 135788);
        }
        
        public final void qm(String paramAnonymousString)
        {
          GMTrace.i(18224888414208L, 135786);
          w.i("MicroMsg.JsApiLogin", "onSuccess !");
          JsApiLogin.LoginTask.this.code = paramAnonymousString;
          JsApiLogin.LoginTask.this.ibq = "ok";
          JsApiLogin.LoginTask.a(JsApiLogin.LoginTask.this);
          GMTrace.o(18224888414208L, 135786);
        }
      };
      if (this.ibp.equals("login"))
      {
        w.i("MicroMsg.JsApiLogin", "start login");
        LinkedList localLinkedList = new LinkedList();
        this.ibA = 1;
        this.ibB = "";
        String str1 = this.appId;
        int i = this.ibA;
        String str2 = this.ibB;
        int j = this.hZb;
        h.xx().fYr.a(new com.tencent.mm.jsapi.a.c(str1, localLinkedList, i, "", str2, j, this.hZc, new com.tencent.mm.jsapi.a.c.a() {}), 0);
        GMTrace.o(18215493173248L, 135716);
        return;
      }
      if (this.ibp.equals("loginConfirm"))
      {
        w.i("MicroMsg.JsApiLogin", "start loginConfirm");
        a(this.appId, this.ibo, this.ibA, this.ibB, this.hZb, this.ibr, local1);
      }
      GMTrace.o(18215493173248L, 135716);
    }
    
    public final void VK()
    {
      GMTrace.i(18215627390976L, 135717);
      VN();
      if (!this.hYK.mRunning)
      {
        GMTrace.o(18215627390976L, 135717);
        return;
      }
      Object localObject;
      if (this.ibq.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("code", this.code);
        localObject = this.ibm.d("ok", (Map)localObject);
        this.hYK.v(this.hYL, (String)localObject);
        this.ibn.Wd();
        GMTrace.o(18215627390976L, 135717);
        return;
      }
      if (this.ibq.equals("fail"))
      {
        this.ibm.a(this.hYK, this.hYL, "fail");
        this.ibn.Wd();
        GMTrace.o(18215627390976L, 135717);
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
            w.e("MicroMsg.JsApiLogin", "parse scope info error %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiLogin", localIOException, "", new Object[0]);
            this.ibm.a(this.hYK, this.hYL, "fail");
            this.ibn.Wd();
            GMTrace.o(18215627390976L, 135717);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18228243857408L, 135811);
              com.tencent.mm.plugin.appbrand.widget.c.a local1 = new com.tencent.mm.plugin.appbrand.widget.c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18226096373760L, 135795);
                  w.i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiLogin", "press back button!");
                    JsApiLogin.LoginTask.this.ibm.a(JsApiLogin.LoginTask.this.hYK, JsApiLogin.LoginTask.this.hYL, "fail auth cancel");
                    JsApiLogin.LoginTask.this.ibn.Wd();
                  }
                  do
                  {
                    GMTrace.o(18226096373760L, 135795);
                    return;
                    JsApiLogin.LoginTask.this.ibp = "loginConfirm";
                    JsApiLogin.LoginTask.this.ibo = paramAnonymous2Bundle;
                    JsApiLogin.LoginTask.this.ibr = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiLogin.LoginTask.this);
                  } while (paramAnonymous2Int != 2);
                  JsApiLogin.LoginTask.this.ibm.a(JsApiLogin.LoginTask.this.hYK, JsApiLogin.LoginTask.this.hYL, "fail auth deny");
                  JsApiLogin.LoginTask.this.ibn.Wd();
                  GMTrace.o(18226096373760L, 135795);
                }
              };
              JsApiLogin.LoginTask.this.hYK.hzM.a(new com.tencent.mm.plugin.appbrand.widget.c(JsApiLogin.LoginTask.this.ibm.a(JsApiLogin.LoginTask.this.hYK), localIOException, JsApiLogin.LoginTask.this.mAppName, JsApiLogin.LoginTask.this.ibs, local1));
              GMTrace.o(18228243857408L, 135811);
            }
          });
          GMTrace.o(18215627390976L, 135717);
          return;
        }
        this.ibm.a(this.hYK, this.hYL, "fail");
        this.ibn.Wd();
      }
      GMTrace.o(18215627390976L, 135717);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18215761608704L, 135718);
      this.data = paramParcel.readString();
      this.hYL = paramParcel.readInt();
      this.ibp = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.code = paramParcel.readString();
      this.ibq = paramParcel.readString();
      this.ibB = paramParcel.readString();
      this.ibA = paramParcel.readInt();
      this.mAppName = paramParcel.readString();
      this.ibs = paramParcel.readString();
      this.ibt = paramParcel.readInt();
      this.ibu = paramParcel.readBundle(JsApiLogin.class.getClassLoader());
      this.ibo = paramParcel.readBundle(JsApiLogin.class.getClassLoader());
      this.hZb = paramParcel.readInt();
      this.ibr = paramParcel.readInt();
      this.hZc = paramParcel.readInt();
      GMTrace.o(18215761608704L, 135718);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18215895826432L, 135719);
      paramParcel.writeString(this.data);
      paramParcel.writeInt(this.hYL);
      paramParcel.writeString(this.ibp);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.code);
      paramParcel.writeString(this.ibq);
      paramParcel.writeString(this.ibB);
      paramParcel.writeInt(this.ibA);
      paramParcel.writeString(this.mAppName);
      paramParcel.writeString(this.ibs);
      paramParcel.writeInt(this.ibt);
      paramParcel.writeBundle(this.ibu);
      paramParcel.writeBundle(this.ibo);
      paramParcel.writeInt(this.hZb);
      paramParcel.writeInt(this.ibr);
      paramParcel.writeInt(this.hZc);
      GMTrace.o(18215895826432L, 135719);
    }
    
    static abstract interface a
    {
      public abstract void Wh();
      
      public abstract void a(LinkedList<baa> paramLinkedList, String paramString1, String paramString2, String paramString3);
      
      public abstract void qm(String paramString);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\auth\JsApiLogin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */