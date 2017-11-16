package com.tencent.mm.plugin.appbrand.task;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.i;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public class AppBrandRemoteTaskController
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandRemoteTaskController> CREATOR;
  private static long izX;
  public String hyD;
  public b hze;
  public c hzs;
  public int ipP;
  public String izU;
  public int izV;
  public int izW;
  public long mTimestamp;
  
  static
  {
    GMTrace.i(10650847805440L, 79355);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10650847805440L, 79355);
  }
  
  public AppBrandRemoteTaskController()
  {
    GMTrace.i(10648297668608L, 79336);
    this.hzs = null;
    this.hze = null;
    this.izV = a.izZ;
    GMTrace.o(10648297668608L, 79336);
  }
  
  private void aar()
  {
    GMTrace.i(10650042499072L, 79349);
    e locale = d.sm(this.izU);
    if (locale == null)
    {
      GMTrace.o(10650042499072L, 79349);
      return;
    }
    locale.a(this.hyD, this.ipP, this);
    d.a(locale);
    GMTrace.o(10650042499072L, 79349);
  }
  
  private void aas()
  {
    GMTrace.i(10650176716800L, 79350);
    if (d.bk(this.hyD, this.izU) == null)
    {
      GMTrace.o(10650176716800L, 79350);
      return;
    }
    d.so(this.hyD);
    GMTrace.o(10650176716800L, 79350);
  }
  
  public final void RY()
  {
    GMTrace.i(10649908281344L, 79348);
    switch (2.izY[(this.izV - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(10649908281344L, 79348);
      return;
      aar();
      try
      {
        if (izX == 0L)
        {
          long l = System.currentTimeMillis();
          izX = l;
          SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4).edit();
          localEditor.putLong("on_wxa_process_connected_time", l);
          localEditor.commit();
          w.v("MicroMsg.AppBrandReporter", "update timestamp(%s)", new Object[] { Long.valueOf(l) });
        }
        this.mTimestamp = izX;
        VL();
        GMTrace.o(10649908281344L, 79348);
        return;
      }
      finally {}
      aar();
      GMTrace.o(10649908281344L, 79348);
      return;
      aas();
      GMTrace.o(10649908281344L, 79348);
      return;
      d.jy(this.izW);
      GMTrace.o(10649908281344L, 79348);
      return;
      d.sj(this.hyD);
      GMTrace.o(10649908281344L, 79348);
      return;
      d.aau();
    }
  }
  
  public final void VK()
  {
    GMTrace.i(10650310934528L, 79351);
    switch (2.izY[(this.izV - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(10650310934528L, 79351);
      return;
      this.hze.finish();
      GMTrace.o(10650310934528L, 79351);
      return;
      switch (this.izW)
      {
      }
      for (;;)
      {
        GMTrace.o(10650310934528L, 79351);
        return;
        b.hp(ab.vM());
        this.hzs.finish();
        Process.killProcess(Process.myPid());
        GMTrace.o(10650310934528L, 79351);
        return;
        this.hzs.a(this);
      }
      Assert.assertTrue("AppBrand Test Assert", false);
      GMTrace.o(10650310934528L, 79351);
      return;
      i.onNetworkChange();
    }
  }
  
  public final void ar(String paramString, int paramInt)
  {
    GMTrace.i(17271405674496L, 128682);
    this.izV = a.iAa;
    this.hyD = paramString;
    this.ipP = paramInt;
    AppBrandMainProcessService.a(this);
    GMTrace.o(17271405674496L, 128682);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10650713587712L, 79354);
    this.hyD = paramParcel.readString();
    this.ipP = paramParcel.readInt();
    this.izU = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i == -1) {}
    for (i = 0;; i = a.aat()[i])
    {
      this.izV = i;
      this.izW = paramParcel.readInt();
      this.mTimestamp = paramParcel.readLong();
      GMTrace.o(10650713587712L, 79354);
      return;
    }
  }
  
  final void si(String paramString)
  {
    GMTrace.i(17271539892224L, 128683);
    this.izV = a.iAc;
    this.hyD = paramString;
    aas();
    VL();
    GMTrace.o(17271539892224L, 128683);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10650579369984L, 79353);
    paramParcel.writeString(this.hyD);
    paramParcel.writeInt(this.ipP);
    paramParcel.writeString(this.izU);
    if (this.izV == 0) {}
    for (paramInt = -1;; paramInt = this.izV - 1)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.izW);
      paramParcel.writeLong(this.mTimestamp);
      GMTrace.o(10650579369984L, 79353);
      return;
    }
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(10647223926784L, 79328);
      izZ = 1;
      iAa = 2;
      iAb = 3;
      iAc = 4;
      iAd = 5;
      iAe = 6;
      iAf = 7;
      iAg = 8;
      iAh = 9;
      iAi = 10;
      iAj = 11;
      iAk = new int[] { izZ, iAa, iAb, iAc, iAd, iAe, iAf, iAg, iAh, iAi, iAj };
      GMTrace.o(10647223926784L, 79328);
    }
    
    public static int[] aat()
    {
      GMTrace.i(10647089709056L, 79327);
      int[] arrayOfInt = (int[])iAk.clone();
      GMTrace.o(10647089709056L, 79327);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract void finish();
  }
  
  public static abstract interface c
  {
    public abstract void a(AppBrandRemoteTaskController paramAppBrandRemoteTaskController);
    
    public abstract void finish();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\task\AppBrandRemoteTaskController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */