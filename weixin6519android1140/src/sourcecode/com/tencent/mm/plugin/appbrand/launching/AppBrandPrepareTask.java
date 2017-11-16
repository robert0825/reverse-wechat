package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

public final class AppBrandPrepareTask
{
  public PrepareParams ipF;
  public volatile transient b ipG;
  volatile transient WeakReference<MMActivity> ipH;
  
  public AppBrandPrepareTask(MMActivity paramMMActivity, com.tencent.mm.plugin.appbrand.e parame)
  {
    GMTrace.i(20671274942464L, 154013);
    AppBrandStatObject localAppBrandStatObject = parame.hyO;
    this.ipF = new PrepareParams();
    this.ipH = new WeakReference(paramMMActivity);
    this.ipF.hyD = parame.hyD;
    this.ipF.ipP = parame.hyF.hKs;
    paramMMActivity = this.ipF;
    if (localAppBrandStatObject == null)
    {
      i = 0;
      paramMMActivity.ipM = i;
      paramMMActivity = this.ipF;
      if (localAppBrandStatObject != null) {
        break label177;
      }
    }
    label177:
    for (int i = j;; i = localAppBrandStatObject.scene)
    {
      paramMMActivity.ipN = i;
      this.ipF.ipO = parame.hyF.hQy;
      this.ipF.ipQ = parame.hyF.hQB;
      this.ipF.ipR = parame.hyF.hzG;
      this.ipF.ipS = l.SC().hKC;
      GMTrace.o(20671274942464L, 154013);
      return;
      i = localAppBrandStatObject.eVi;
      break;
    }
  }
  
  private static final class PrepareParams
    implements Parcelable
  {
    public static final Parcelable.Creator<PrepareParams> CREATOR;
    public String hyD;
    public int ipM;
    public int ipN;
    public String ipO;
    public int ipP;
    public AppBrandLaunchReferrer ipQ;
    public String ipR;
    public int ipS;
    
    static
    {
      GMTrace.i(20677180522496L, 154057);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20677180522496L, 154057);
    }
    
    PrepareParams()
    {
      GMTrace.i(20676912087040L, 154055);
      GMTrace.o(20676912087040L, 154055);
    }
    
    PrepareParams(Parcel paramParcel)
    {
      GMTrace.i(20677046304768L, 154056);
      this.ipM = paramParcel.readInt();
      this.ipN = paramParcel.readInt();
      this.ipO = paramParcel.readString();
      this.hyD = paramParcel.readString();
      this.ipP = paramParcel.readInt();
      this.ipQ = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
      this.ipR = paramParcel.readString();
      this.ipS = paramParcel.readInt();
      GMTrace.o(20677046304768L, 154056);
    }
    
    public final int describeContents()
    {
      GMTrace.i(20676643651584L, 154053);
      GMTrace.o(20676643651584L, 154053);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20676777869312L, 154054);
      paramParcel.writeInt(this.ipM);
      paramParcel.writeInt(this.ipN);
      paramParcel.writeString(this.ipO);
      paramParcel.writeString(this.hyD);
      paramParcel.writeInt(this.ipP);
      paramParcel.writeParcelable(this.ipQ, paramInt);
      paramParcel.writeString(this.ipR);
      paramParcel.writeInt(this.ipS);
      GMTrace.o(20676777869312L, 154054);
    }
  }
  
  private static final class PrepareResult
    implements Parcelable
  {
    public static final Parcelable.Creator<PrepareResult> CREATOR;
    public AppBrandSysConfig hyG;
    public int ipT;
    public AppBrandLaunchErrorAction ipU;
    
    static
    {
      GMTrace.i(20679328006144L, 154073);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20679328006144L, 154073);
    }
    
    PrepareResult()
    {
      GMTrace.i(20679059570688L, 154071);
      GMTrace.o(20679059570688L, 154071);
    }
    
    PrepareResult(Parcel paramParcel)
    {
      GMTrace.i(20679193788416L, 154072);
      this.ipT = paramParcel.readInt();
      this.ipU = ((AppBrandLaunchErrorAction)paramParcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader()));
      this.hyG = ((AppBrandSysConfig)paramParcel.readParcelable(AppBrandSysConfig.class.getClassLoader()));
      GMTrace.o(20679193788416L, 154072);
    }
    
    public final int describeContents()
    {
      GMTrace.i(20678791135232L, 154069);
      GMTrace.o(20678791135232L, 154069);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20678925352960L, 154070);
      paramParcel.writeInt(this.ipT);
      paramParcel.writeParcelable(this.ipU, paramInt);
      paramParcel.writeParcelable(this.hyG, paramInt);
      GMTrace.o(20678925352960L, 154070);
    }
  }
  
  private static final class a
    implements com.tencent.mm.ipcinvoker.g<AppBrandPrepareTask.PrepareParams, AppBrandPrepareTask.PrepareResult>
  {
    private a()
    {
      GMTrace.i(20673556643840L, 154030);
      GMTrace.o(20673556643840L, 154030);
    }
  }
  
  public static abstract interface b
  {
    public abstract void b(AppBrandSysConfig paramAppBrandSysConfig);
    
    public abstract void onDownloadStarted();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\AppBrandPrepareTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */