package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.af;

public final class AppBrandPreInitTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandPreInitTask> CREATOR;
  private String appId;
  private int hZb;
  public AppBrandInitConfig ipA;
  public AppBrandStatObject ipB;
  private transient a ipz;
  
  static
  {
    GMTrace.i(20675704127488L, 154046);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20675704127488L, 154046);
  }
  
  public AppBrandPreInitTask(Parcel paramParcel)
  {
    GMTrace.i(20675435692032L, 154044);
    f(paramParcel);
    GMTrace.o(20675435692032L, 154044);
  }
  
  public AppBrandPreInitTask(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, a parama)
  {
    GMTrace.i(20674630385664L, 154038);
    this.appId = paramString;
    this.hZb = paramInt;
    this.ipB = paramAppBrandStatObject;
    this.ipz = parama;
    GMTrace.o(20674630385664L, 154038);
  }
  
  public final void RY()
  {
    GMTrace.i(20674898821120L, 154040);
    c localc = new c(this.appId, this.hZb, this.ipB, new c.a()
    {
      public final void b(AppBrandInitConfig paramAnonymousAppBrandInitConfig, AppBrandStatObject paramAnonymousAppBrandStatObject)
      {
        GMTrace.i(20676375216128L, 154051);
        AppBrandPreInitTask.this.ipA = paramAnonymousAppBrandInitConfig;
        AppBrandPreInitTask.this.ipB = paramAnonymousAppBrandStatObject;
        if (paramAnonymousAppBrandInitConfig != null) {
          b.c(paramAnonymousAppBrandInitConfig, paramAnonymousAppBrandStatObject);
        }
        AppBrandPreInitTask.a(AppBrandPreInitTask.this);
        GMTrace.o(20676375216128L, 154051);
      }
    });
    d.xB().A(localc);
    GMTrace.o(20674898821120L, 154040);
  }
  
  public final void VK()
  {
    GMTrace.i(20674764603392L, 154039);
    if (this.ipz != null) {
      this.ipz.a(this.ipA);
    }
    VN();
    GMTrace.o(20674764603392L, 154039);
  }
  
  public final int describeContents()
  {
    GMTrace.i(20675033038848L, 154041);
    GMTrace.o(20675033038848L, 154041);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(20675301474304L, 154043);
    this.appId = paramParcel.readString();
    this.hZb = paramParcel.readInt();
    this.ipA = ((AppBrandInitConfig)paramParcel.readParcelable(AppBrandInitConfig.class.getClassLoader()));
    this.ipB = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    GMTrace.o(20675301474304L, 154043);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20675167256576L, 154042);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hZb);
    paramParcel.writeParcelable(this.ipA, paramInt);
    paramParcel.writeParcelable(this.ipB, paramInt);
    GMTrace.o(20675167256576L, 154042);
  }
  
  public static abstract interface a
  {
    public abstract void a(AppBrandInitConfig paramAppBrandInitConfig);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\AppBrandPreInitTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */