package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bud;
import com.tencent.mm.protocal.c.bvd;
import com.tencent.mm.protocal.c.bvj;

public final class AppBrandTaskUsageRecorder
{
  private static final class LaunchCheckParams
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchCheckParams> CREATOR;
    final int hKC;
    final boolean hUD;
    final String hzG;
    final int icO;
    final AppBrandInitConfig ipW;
    final AppBrandStatObject ipX;
    
    static
    {
      GMTrace.i(15445373485056L, 115077);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15445373485056L, 115077);
    }
    
    LaunchCheckParams(Parcel paramParcel)
    {
      GMTrace.i(15445239267328L, 115076);
      this.hUD = true;
      this.ipW = ((AppBrandInitConfig)paramParcel.readParcelable(AppBrandInitConfig.class.getClassLoader()));
      this.ipX = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
      this.hKC = paramParcel.readInt();
      this.icO = paramParcel.readInt();
      this.hzG = paramParcel.readString();
      GMTrace.o(15445239267328L, 115076);
    }
    
    public LaunchCheckParams(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject, int paramInt1, int paramInt2, String paramString)
    {
      GMTrace.i(19677258448896L, 146607);
      this.hUD = true;
      this.ipW = paramAppBrandInitConfig;
      this.ipX = paramAppBrandStatObject;
      this.hKC = paramInt1;
      this.icO = paramInt2;
      this.hzG = paramString;
      GMTrace.o(19677258448896L, 146607);
    }
    
    public final int describeContents()
    {
      GMTrace.i(15444836614144L, 115073);
      GMTrace.o(15444836614144L, 115073);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15444970831872L, 115074);
      paramParcel.writeParcelable(this.ipW, paramInt);
      paramParcel.writeParcelable(this.ipX, paramInt);
      paramParcel.writeInt(this.hKC);
      paramParcel.writeInt(this.icO);
      paramParcel.writeString(this.hzG);
      GMTrace.o(15444970831872L, 115074);
    }
  }
  
  private static final class UpdateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<UpdateTask> CREATOR;
    AppBrandTaskUsageRecorder.LaunchCheckParams ipY;
    
    static
    {
      GMTrace.i(15441212735488L, 115046);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15441212735488L, 115046);
    }
    
    UpdateTask(Parcel paramParcel)
    {
      GMTrace.i(15440675864576L, 115042);
      f(paramParcel);
      GMTrace.o(15440675864576L, 115042);
    }
    
    public UpdateTask(AppBrandTaskUsageRecorder.LaunchCheckParams paramLaunchCheckParams)
    {
      GMTrace.i(15440541646848L, 115041);
      this.ipY = paramLaunchCheckParams;
      GMTrace.o(15440541646848L, 115041);
    }
    
    public final void RY()
    {
      bud localbud = null;
      GMTrace.i(15440407429120L, 115040);
      if (!h.xw().wL())
      {
        GMTrace.o(15440407429120L, 115040);
        return;
      }
      this.ipY.getClass();
      AppBrandLaunchReferrer localAppBrandLaunchReferrer = this.ipY.ipW.hQB;
      bvd localbvd;
      if ((localAppBrandLaunchReferrer != null) && (1 == localAppBrandLaunchReferrer.hQF))
      {
        localbvd = new bvd();
        localbvd.uyn = localAppBrandLaunchReferrer.appId;
      }
      for (;;)
      {
        Object localObject = localbud;
        if (localAppBrandLaunchReferrer != null)
        {
          localObject = localbud;
          if (2 == localAppBrandLaunchReferrer.hQF)
          {
            localObject = new bvj();
            ((bvj)localObject).lTf = localAppBrandLaunchReferrer.appId;
            ((bvj)localObject).lPM = localAppBrandLaunchReferrer.url;
          }
        }
        localbud = new bud();
        localbud.uyt = this.ipY.ipW.hKs;
        localbud.tVE = this.ipY.hKC;
        localbud.tOG = this.ipY.ipX.scene;
        localbud.uBM = this.ipY.ipW.hQy;
        localbud.uBL = 1;
        localbud.uBK = this.ipY.ipX.eVi;
        new f(this.ipY.ipW.appId, false, localbud, (bvj)localObject, localbvd, this.ipY.hzG, this.ipY.icO).Yr();
        GMTrace.o(15440407429120L, 115040);
        return;
        localbvd = null;
      }
    }
    
    public final int describeContents()
    {
      GMTrace.i(15440810082304L, 115043);
      GMTrace.o(15440810082304L, 115043);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15440944300032L, 115044);
      this.ipY = ((AppBrandTaskUsageRecorder.LaunchCheckParams)paramParcel.readParcelable(AppBrandTaskUsageRecorder.LaunchCheckParams.class.getClassLoader()));
      GMTrace.o(15440944300032L, 115044);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15441078517760L, 115045);
      paramParcel.writeParcelable(this.ipY, paramInt);
      GMTrace.o(15441078517760L, 115045);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\AppBrandTaskUsageRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */