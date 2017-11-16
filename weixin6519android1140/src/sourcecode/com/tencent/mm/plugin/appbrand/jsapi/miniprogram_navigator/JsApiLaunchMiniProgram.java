package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.LaunchBroadCast;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import junit.framework.Assert;
import org.json.JSONObject;

public final class JsApiLaunchMiniProgram
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 166;
  public static final String NAME = "launchMiniProgram";
  
  public JsApiLaunchMiniProgram()
  {
    GMTrace.i(19832682577920L, 147765);
    GMTrace.o(19832682577920L, 147765);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    final int i = 1;
    GMTrace.i(19832816795648L, 147766);
    final String str1 = paramJSONObject.optString("appId", null);
    if (bg.nm(str1))
    {
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19832816795648L, 147766);
      return;
    }
    if (str1.equals(paramj.hyD))
    {
      paramj.v(paramInt, d("fail target appId is the same as the caller appId", null));
      GMTrace.o(19832816795648L, 147766);
      return;
    }
    final String str2 = paramJSONObject.optString("path", null);
    final String str3 = paramJSONObject.optString("extraData", null);
    if ((com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD).hRg.hKB == 1) && (paramJSONObject.optBoolean("isDev", false))) {}
    for (;;)
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19828387610624L, 147733);
          Object localObject3 = JsApiLaunchMiniProgram.this;
          j localj = paramj;
          String str1 = str1;
          int i = i;
          String str2 = str2;
          String str3 = str3;
          int j = paramInt;
          Object localObject1 = new JsApiLaunchMiniProgram.LaunchPreconditionTask();
          ((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iix = str1;
          ((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iiy = i;
          if (!AppBrandMainProcessService.b((MainProcessTask)localObject1))
          {
            localj.v(j, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject3).d("fail precondition error", null));
            GMTrace.o(19828387610624L, 147733);
            return;
          }
          Object localObject2 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iG(((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iiz);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iiA;
          }
          if (JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iiC != localObject1)
          {
            localj.v(j, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject3).d(((JsApiLaunchMiniProgram.LaunchPreconditionTask.a)localObject1).eCh, null));
            GMTrace.o(19828387610624L, 147733);
            return;
          }
          c.a(localj.hyD, c.c.hyy);
          MMToClientEvent.a(new JsApiLaunchMiniProgram.2((JsApiLaunchMiniProgram)localObject3, str1, i, localj, j));
          if ((localj.mContext != null) && ((localj.mContext instanceof Activity)) && (!((Activity)localj.mContext).isFinishing()))
          {
            localObject2 = new AppBrandStatObject();
            ((AppBrandStatObject)localObject2).scene = 1037;
            localObject1 = com.tencent.mm.plugin.appbrand.a.nL(localj.hyD);
            if (localObject1 != null) {
              ((AppBrandStatObject)localObject2).eVh = ((AppBrandStatObject)localObject1).eVh;
            }
            localObject1 = "";
            localObject3 = JsApiLaunchMiniProgram.b(localj);
            if (localObject3 != null) {
              localObject1 = ((AppBrandPageView)localObject3).ivj.iwc;
            }
            localObject3 = new StringBuilder(localj.hyD);
            ((StringBuilder)localObject3).append(":");
            ((StringBuilder)localObject3).append(bg.nl(p.encode((String)localObject1)));
            ((AppBrandStatObject)localObject2).eAv = ((StringBuilder)localObject3).toString();
            localObject3 = new AppBrandLaunchReferrer();
            ((AppBrandLaunchReferrer)localObject3).appId = localj.hyD;
            ((AppBrandLaunchReferrer)localObject3).hQG = str3;
            ((AppBrandLaunchReferrer)localObject3).hQF = 1;
            ((AppBrandLaunchReferrer)localObject3).url = ((String)localObject1);
            AppBrandLaunchProxyUI.a(localj.mContext, null, str1, str2, i, -1, (AppBrandStatObject)localObject2, (AppBrandLaunchReferrer)localObject3, null);
            Assert.assertTrue(true);
          }
          GMTrace.o(19828387610624L, 147733);
        }
      });
      GMTrace.o(19832816795648L, 147766);
      return;
      i = 0;
    }
  }
  
  private static final class LaunchPreconditionTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<LaunchPreconditionTask> CREATOR;
    public String iix;
    public int iiy;
    public int iiz;
    
    static
    {
      GMTrace.i(19828119175168L, 147731);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19828119175168L, 147731);
    }
    
    LaunchPreconditionTask()
    {
      GMTrace.i(19827850739712L, 147729);
      this.iiz = a.iiA.ordinal();
      GMTrace.o(19827850739712L, 147729);
    }
    
    LaunchPreconditionTask(Parcel paramParcel)
    {
      GMTrace.i(19827984957440L, 147730);
      this.iiz = a.iiA.ordinal();
      f(paramParcel);
      GMTrace.o(19827984957440L, 147730);
    }
    
    public final void RY()
    {
      GMTrace.i(19827448086528L, 147726);
      com.tencent.mm.plugin.appbrand.task.d.sn(this.iix);
      this.iiz = a.iiC.ordinal();
      GMTrace.o(19827448086528L, 147726);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19827582304256L, 147727);
      GMTrace.o(19827582304256L, 147727);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19827313868800L, 147725);
      this.iix = paramParcel.readString();
      this.iiy = paramParcel.readInt();
      this.iiz = paramParcel.readInt();
      GMTrace.o(19827313868800L, 147725);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19827716521984L, 147728);
      paramParcel.writeString(this.iix);
      paramParcel.writeInt(this.iiy);
      paramParcel.writeInt(this.iiz);
      GMTrace.o(19827716521984L, 147728);
    }
    
    static enum a
    {
      public final String eCh;
      
      static
      {
        GMTrace.i(19831206182912L, 147754);
        iiA = new a("FAIL", 0, "fail");
        iiB = new a("FAIL_MORE_THAN_ONE_TASK", 1, "fail can not launch more than 1 mini program");
        iiC = new a("OK", 2, "ok");
        iiD = new a[] { iiA, iiB, iiC };
        GMTrace.o(19831206182912L, 147754);
      }
      
      private a(String paramString)
      {
        GMTrace.i(19830937747456L, 147752);
        this.eCh = paramString;
        GMTrace.o(19830937747456L, 147752);
      }
      
      public static a iG(int paramInt)
      {
        GMTrace.i(19831071965184L, 147753);
        a[] arrayOfa = values();
        int j = arrayOfa.length;
        int i = 0;
        while (i < j)
        {
          a locala = arrayOfa[i];
          if (paramInt == locala.ordinal())
          {
            GMTrace.o(19831071965184L, 147753);
            return locala;
          }
          i += 1;
        }
        GMTrace.o(19831071965184L, 147753);
        return null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\miniprogram_navigator\JsApiLaunchMiniProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */