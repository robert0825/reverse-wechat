package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.i.a;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.2;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.f;
import com.tencent.mm.plugin.appbrand.dynamic.i.d;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class WxaWidgetInitializer
{
  public static WxaWidgetContextImpl a(String paramString1, String paramString2, WxaPkgWrappingInfo paramWxaPkgWrappingInfo, d paramd)
  {
    GMTrace.i(20774622593024L, 154783);
    w.i("MicroMsg.WxaWidgetInitializer", "prepare(%s)", new Object[] { paramString1 });
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = (WxaPkgWrappingInfo)e.a("com.tencent.mm", null, a.d.class);
    if (localWxaPkgWrappingInfo == null)
    {
      w.e("MicroMsg.WxaWidgetInitializer", "getLibPkgInfo return null.");
      GMTrace.o(20774622593024L, 154783);
      return null;
    }
    paramWxaPkgWrappingInfo = new WxaWidgetContextImpl(localWxaPkgWrappingInfo, paramWxaPkgWrappingInfo);
    paramWxaPkgWrappingInfo.fXC = paramString1;
    paramWxaPkgWrappingInfo.hyD = paramString2;
    paramWxaPkgWrappingInfo.hST = paramd.hVh;
    if (paramWxaPkgWrappingInfo.hST == null) {
      paramWxaPkgWrappingInfo.hST = new DebuggerInfo();
    }
    paramWxaPkgWrappingInfo.hSU = paramd.hVi;
    paramWxaPkgWrappingInfo.hSV = paramd.hVj;
    for (;;)
    {
      try
      {
        if ((paramd.hVl == null) || (paramd.hVl.ucU == null)) {
          continue;
        }
        paramString1 = paramd.hVl.ucU.toByteArray();
        paramWxaPkgWrappingInfo.hSR = paramString1;
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.WxaWidgetInitializer", bg.f(paramString1));
        continue;
        if (paramd.hVk == null) {
          continue;
        }
        int i = paramd.hVk.tNf;
        continue;
        i = 1;
        continue;
      }
      if (!paramWxaPkgWrappingInfo.hST.hTv) {
        continue;
      }
      i = 2;
      paramWxaPkgWrappingInfo.hSS = i;
      GMTrace.o(20774622593024L, 154783);
      return paramWxaPkgWrappingInfo;
      paramString1 = new byte[0];
    }
  }
  
  public static String aU(String paramString1, String paramString2)
  {
    GMTrace.i(20774756810752L, 154784);
    paramString1 = paramString1 + "#" + paramString2;
    GMTrace.o(20774756810752L, 154784);
    return paramString1;
  }
  
  private static class WxaWidgetContextImpl
    implements WxaWidgetContext
  {
    public static final Parcelable.Creator<WxaWidgetContextImpl> CREATOR;
    String fXC;
    WxaPkgWrappingInfo hSP;
    WxaPkgWrappingInfo hSQ;
    byte[] hSR;
    int hSS;
    DebuggerInfo hST;
    WidgetSysConfig hSU;
    WidgetRuntimeConfig hSV;
    String hyD;
    
    static
    {
      GMTrace.i(20773011980288L, 154771);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20773011980288L, 154771);
    }
    
    public WxaWidgetContextImpl(Parcel paramParcel)
    {
      GMTrace.i(20770998714368L, 154756);
      ClassLoader localClassLoader = getClass().getClassLoader();
      this.fXC = paramParcel.readString();
      this.hyD = paramParcel.readString();
      this.hSQ = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
      this.hSP = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
      this.hSR = paramParcel.createByteArray();
      this.hSS = paramParcel.readInt();
      this.hST = ((DebuggerInfo)paramParcel.readParcelable(localClassLoader));
      this.hSU = ((WidgetSysConfig)paramParcel.readParcelable(localClassLoader));
      this.hSV = ((WidgetRuntimeConfig)paramParcel.readParcelable(localClassLoader));
      GMTrace.o(20770998714368L, 154756);
    }
    
    public WxaWidgetContextImpl(WxaPkgWrappingInfo paramWxaPkgWrappingInfo1, WxaPkgWrappingInfo paramWxaPkgWrappingInfo2)
    {
      GMTrace.i(20771132932096L, 154757);
      Assert.assertNotNull(paramWxaPkgWrappingInfo1);
      Assert.assertNotNull(paramWxaPkgWrappingInfo2);
      this.hSQ = paramWxaPkgWrappingInfo1;
      this.hSP = paramWxaPkgWrappingInfo2;
      GMTrace.o(20771132932096L, 154757);
    }
    
    public final WxaPkgWrappingInfo UQ()
    {
      GMTrace.i(20771267149824L, 154758);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.hSP;
      GMTrace.o(20771267149824L, 154758);
      return localWxaPkgWrappingInfo;
    }
    
    public final WxaPkgWrappingInfo UR()
    {
      GMTrace.i(20771401367552L, 154759);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.hSQ;
      GMTrace.o(20771401367552L, 154759);
      return localWxaPkgWrappingInfo;
    }
    
    public final int US()
    {
      GMTrace.i(20771804020736L, 154762);
      if (this.hSP != null)
      {
        int i = this.hSP.hKB;
        GMTrace.o(20771804020736L, 154762);
        return i;
      }
      GMTrace.o(20771804020736L, 154762);
      return 0;
    }
    
    public final int UT()
    {
      GMTrace.i(20771938238464L, 154763);
      if (this.hSP != null)
      {
        int i = this.hSP.hKC;
        GMTrace.o(20771938238464L, 154763);
        return i;
      }
      GMTrace.o(20771938238464L, 154763);
      return 0;
    }
    
    public final byte[] UU()
    {
      GMTrace.i(20772072456192L, 154764);
      byte[] arrayOfByte = this.hSR;
      GMTrace.o(20772072456192L, 154764);
      return arrayOfByte;
    }
    
    public final int UV()
    {
      GMTrace.i(20772206673920L, 154765);
      int i = this.hSS;
      GMTrace.o(20772206673920L, 154765);
      return i;
    }
    
    public final DebuggerInfo UW()
    {
      GMTrace.i(20772340891648L, 154766);
      DebuggerInfo localDebuggerInfo = this.hST;
      GMTrace.o(20772340891648L, 154766);
      return localDebuggerInfo;
    }
    
    public final WidgetSysConfig UX()
    {
      GMTrace.i(20772475109376L, 154767);
      WidgetSysConfig localWidgetSysConfig = this.hSU;
      GMTrace.o(20772475109376L, 154767);
      return localWidgetSysConfig;
    }
    
    public final WidgetRuntimeConfig UY()
    {
      GMTrace.i(20772609327104L, 154768);
      WidgetRuntimeConfig localWidgetRuntimeConfig = this.hSV;
      GMTrace.o(20772609327104L, 154768);
      return localWidgetRuntimeConfig;
    }
    
    public int describeContents()
    {
      GMTrace.i(20772743544832L, 154769);
      GMTrace.o(20772743544832L, 154769);
      return 0;
    }
    
    public final String getAppId()
    {
      GMTrace.i(20771669803008L, 154761);
      String str = this.hyD;
      GMTrace.o(20771669803008L, 154761);
      return str;
    }
    
    public final String getId()
    {
      GMTrace.i(20771535585280L, 154760);
      String str = this.fXC;
      GMTrace.o(20771535585280L, 154760);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20772877762560L, 154770);
      paramParcel.writeString(this.fXC);
      paramParcel.writeString(this.hyD);
      paramParcel.writeParcelable(this.hSQ, paramInt);
      paramParcel.writeParcelable(this.hSP, paramInt);
      paramParcel.writeByteArray(this.hSR);
      paramParcel.writeInt(this.hSS);
      paramParcel.writeParcelable(this.hST, paramInt);
      paramParcel.writeParcelable(this.hSU, paramInt);
      paramParcel.writeParcelable(this.hSV, paramInt);
      GMTrace.o(20772877762560L, 154770);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2, boolean paramBoolean, WxaWidgetContext paramWxaWidgetContext);
    
    public abstract void aS(String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\WxaWidgetInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */