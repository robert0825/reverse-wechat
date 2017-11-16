package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.JsApiGetStorageInfoTask;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"DefaultLocale"})
public final class AppBrandPerformanceManager
{
  private static SparseArray<a> iwQ;
  
  static
  {
    GMTrace.i(15451815936000L, 115125);
    iwQ = new SparseArray();
    GMTrace.o(15451815936000L, 115125);
  }
  
  public static final void C(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(15451279065088L, 115121);
    com.tencent.mm.plugin.appbrand.ui.e locale = com.tencent.mm.plugin.appbrand.a.nM(paramString1);
    if (locale == null)
    {
      u.Av().p(paramString1.hashCode() + "performance_custom_data", true).o(paramString2, paramString3);
      GMTrace.o(15451279065088L, 115121);
      return;
    }
    locale.bn(paramString2, paramString3);
    GMTrace.o(15451279065088L, 115121);
  }
  
  public static final void b(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(15451010629632L, 115119);
    l(paramString, paramInt, String.format("%d ms", new Object[] { Long.valueOf(paramLong) }));
    GMTrace.o(15451010629632L, 115119);
  }
  
  public static final void l(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(15451144847360L, 115120);
    com.tencent.mm.plugin.appbrand.ui.e locale = com.tencent.mm.plugin.appbrand.a.nM(paramString1);
    if (locale == null)
    {
      u.Av().p(paramString1.hashCode() + "performance_data", true).o(String.valueOf(paramInt), paramString2);
      GMTrace.o(15451144847360L, 115120);
      return;
    }
    locale.D(paramInt, paramString2);
    GMTrace.o(15451144847360L, 115120);
  }
  
  public static final void p(String paramString, long paramLong)
  {
    GMTrace.i(19683969335296L, 146657);
    com.tencent.mm.plugin.appbrand.app.e.Si().aQ(paramString + "_PkgDownloadCost", String.valueOf(paramLong));
    GMTrace.o(19683969335296L, 146657);
  }
  
  public static final void rW(String paramString)
  {
    GMTrace.i(15450339540992L, 115114);
    w.d("MicroMsg.AppBrandPerformanceManager", "startMonitoring, appId: %s", new Object[] { paramString });
    a locala2 = (a)iwQ.get(paramString.hashCode());
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(paramString);
      iwQ.put(paramString.hashCode(), locala1);
    }
    locala1.Aa = true;
    com.tencent.mm.plugin.appbrand.o.d.xB().A(locala1);
    com.tencent.mm.plugin.appbrand.c.a(locala1.hyD, locala1.iwY);
    if ((a.ZO()) && (locala1.iwW != null))
    {
      paramString = locala1.iwW;
      paramString.Aa = true;
      paramString.ixm.postFrameCallback(paramString);
    }
    if (!locala1.iwU)
    {
      paramString = new GetPkgDownloadCostTask();
      paramString.hyD = locala1.hyD;
      AppBrandMainProcessService.a(paramString);
      locala1.iwU = true;
    }
    GMTrace.o(15450339540992L, 115114);
  }
  
  public static final void rX(String paramString)
  {
    GMTrace.i(15450607976448L, 115116);
    w.d("MicroMsg.AppBrandPerformanceManager", "enablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask();
    localSetAppPerformanceModeTask.hyD = paramString;
    localSetAppPerformanceModeTask.mEnable = true;
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    GMTrace.o(15450607976448L, 115116);
  }
  
  public static final void rY(String paramString)
  {
    GMTrace.i(15450742194176L, 115117);
    w.d("MicroMsg.AppBrandPerformanceManager", "disablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask();
    localSetAppPerformanceModeTask.hyD = paramString;
    localSetAppPerformanceModeTask.mEnable = false;
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    GMTrace.o(15450742194176L, 115117);
  }
  
  public static final boolean rZ(String paramString)
  {
    GMTrace.i(15450876411904L, 115118);
    if (DebuggerShell.UK())
    {
      GMTrace.o(15450876411904L, 115118);
      return true;
    }
    paramString = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    if ((paramString != null) && (paramString.hQM) && (paramString.hRg.hKB == 1))
    {
      GMTrace.o(15450876411904L, 115118);
      return true;
    }
    GMTrace.o(15450876411904L, 115118);
    return false;
  }
  
  public static final void sa(String paramString)
  {
    GMTrace.i(15451413282816L, 115122);
    com.tencent.mm.plugin.appbrand.ui.e locale = com.tencent.mm.plugin.appbrand.a.nM(paramString);
    u.b localb = u.Av().gx(paramString.hashCode() + "performance_data");
    if (locale == null) {
      w.e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
    }
    for (;;)
    {
      sb(paramString);
      GMTrace.o(15451413282816L, 115122);
      return;
      if (localb == null)
      {
        w.d("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData cache is empty.");
      }
      else
      {
        Iterator localIterator = localb.Aw().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)localb.get(str1);
          if (str2 != null) {
            locale.D(Integer.valueOf(str1).intValue(), str2);
          }
        }
      }
    }
  }
  
  private static final void sb(String paramString)
  {
    GMTrace.i(15451547500544L, 115123);
    com.tencent.mm.plugin.appbrand.ui.e locale = com.tencent.mm.plugin.appbrand.a.nM(paramString);
    paramString = u.Av().gx(paramString.hashCode() + "performance_custom_data");
    if (locale == null)
    {
      w.e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
      GMTrace.o(15451547500544L, 115123);
      return;
    }
    if (paramString == null)
    {
      w.d("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData cache is empty.");
      GMTrace.o(15451547500544L, 115123);
      return;
    }
    Iterator localIterator = paramString.Aw().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramString.get(str1);
      if (str2 != null) {
        locale.bn(str1, str2);
      }
    }
    GMTrace.o(15451547500544L, 115123);
  }
  
  private static class GetPkgDownloadCostTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetPkgDownloadCostTask> CREATOR;
    public String hyD;
    private long iwR;
    
    static
    {
      GMTrace.i(15454097637376L, 115142);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15454097637376L, 115142);
    }
    
    public GetPkgDownloadCostTask()
    {
      GMTrace.i(15453158113280L, 115135);
      GMTrace.o(15453158113280L, 115135);
    }
    
    public final void RY()
    {
      GMTrace.i(15453292331008L, 115136);
      w.d("MicroMsg.AppBrandPerformanceManager", "try to get pkg download cost in main process.");
      String str1 = this.hyD + "_PkgDownloadCost";
      String str2 = com.tencent.mm.plugin.appbrand.app.e.Si().get(str1, null);
      if (str2 != null) {
        com.tencent.mm.plugin.appbrand.app.e.Si().aQ(str1, null);
      }
      try
      {
        this.iwR = Long.parseLong(str2);
        VL();
        GMTrace.o(15453292331008L, 115136);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrandPerformanceManager", "GetPkgDownloadCost error.");
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(15453426548736L, 115137);
      w.d("MicroMsg.AppBrandPerformanceManager", "received pkg download cost from main process: %d ms", new Object[] { Long.valueOf(this.iwR) });
      if (this.iwR != 0L) {
        AppBrandPerformanceManager.b(this.hyD, 201, this.iwR);
      }
      VN();
      GMTrace.o(15453426548736L, 115137);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15453560766464L, 115138);
      this.hyD = paramParcel.readString();
      this.iwR = paramParcel.readLong();
      GMTrace.o(15453560766464L, 115138);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15453694984192L, 115139);
      paramParcel.writeString(this.hyD);
      paramParcel.writeLong(this.iwR);
      GMTrace.o(15453694984192L, 115139);
    }
  }
  
  private static class SetAppPerformanceModeTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAppPerformanceModeTask> CREATOR;
    public String hyD;
    public boolean mEnable;
    
    static
    {
      GMTrace.i(15448863145984L, 115103);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15448863145984L, 115103);
    }
    
    public SetAppPerformanceModeTask()
    {
      GMTrace.i(15447923621888L, 115096);
      GMTrace.o(15447923621888L, 115096);
    }
    
    public final void RY()
    {
      GMTrace.i(15448057839616L, 115097);
      com.tencent.mm.plugin.appbrand.config.c localc = com.tencent.mm.plugin.appbrand.app.e.Si();
      String str2 = this.hyD + "_PerformancePanelEnabled";
      if (this.mEnable) {}
      for (String str1 = "1";; str1 = "0")
      {
        localc.aQ(str2, str1);
        GMTrace.o(15448057839616L, 115097);
        return;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15448192057344L, 115098);
      this.hyD = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.mEnable = bool;
        GMTrace.o(15448192057344L, 115098);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15448326275072L, 115099);
      paramParcel.writeString(this.hyD);
      if (this.mEnable) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        GMTrace.o(15448326275072L, 115099);
        return;
      }
    }
  }
  
  private static final class a
    implements Runnable
  {
    volatile boolean Aa;
    public final String hyD;
    public volatile double iwS;
    private volatile int iwT;
    volatile boolean iwU;
    private c iwV;
    d iwW;
    d.a iwX;
    c.b iwY;
    volatile boolean mPaused;
    
    public a(String paramString)
    {
      GMTrace.i(15452352806912L, 115129);
      this.iwS = 0.0D;
      this.iwT = 4;
      this.Aa = true;
      this.mPaused = false;
      this.iwU = false;
      this.iwX = new d.a()
      {
        public final void i(double paramAnonymousDouble)
        {
          GMTrace.i(15449534234624L, 115108);
          if (Math.round(AppBrandPerformanceManager.a.this.iwS) != Math.round(paramAnonymousDouble))
          {
            AppBrandPerformanceManager.a.this.iwS = paramAnonymousDouble;
            String str = Math.round(AppBrandPerformanceManager.a.this.iwS) + " fps";
            AppBrandPerformanceManager.l(AppBrandPerformanceManager.a.this.hyD, 303, str);
            a.a(AppBrandPerformanceManager.a.this.hyD, "Hardware", "FPS", AppBrandPerformanceManager.a.this.iwS);
          }
          GMTrace.o(15449534234624L, 115108);
        }
      };
      this.iwY = new c.b()
      {
        public final void a(c.c paramAnonymousc)
        {
          GMTrace.i(20681609707520L, 154090);
          super.a(paramAnonymousc);
          paramAnonymousc = AppBrandPerformanceManager.a.this;
          paramAnonymousc.mPaused = true;
          if ((AppBrandPerformanceManager.a.ZO()) && (paramAnonymousc.iwW != null)) {
            paramAnonymousc.iwW.mPaused = true;
          }
          GMTrace.o(20681609707520L, 154090);
        }
        
        public final void onDestroy()
        {
          GMTrace.i(20681475489792L, 154089);
          super.onDestroy();
          Object localObject = AppBrandPerformanceManager.a.this;
          ((AppBrandPerformanceManager.a)localObject).Aa = false;
          com.tencent.mm.plugin.appbrand.c.b(((AppBrandPerformanceManager.a)localObject).hyD, ((AppBrandPerformanceManager.a)localObject).iwY);
          if ((AppBrandPerformanceManager.a.ZO()) && (((AppBrandPerformanceManager.a)localObject).iwW != null))
          {
            localObject = ((AppBrandPerformanceManager.a)localObject).iwW;
            ((d)localObject).Aa = false;
            ((d)localObject).ixn = 0L;
            ((d)localObject).ixo = 0;
            ((d)localObject).ixm.removeFrameCallback((Choreographer.FrameCallback)localObject);
          }
          GMTrace.o(20681475489792L, 154089);
        }
        
        public final void onResume()
        {
          GMTrace.i(20681743925248L, 154091);
          super.onResume();
          AppBrandPerformanceManager.a locala = AppBrandPerformanceManager.a.this;
          locala.mPaused = false;
          if ((AppBrandPerformanceManager.a.ZO()) && (locala.iwW != null)) {
            locala.iwW.mPaused = false;
          }
          GMTrace.o(20681743925248L, 154091);
        }
      };
      this.hyD = paramString;
      this.iwV = new c(Process.myPid());
      if (ZO())
      {
        this.iwW = new d();
        this.iwW.mInterval = 100L;
        this.iwW.iwX = this.iwX;
      }
      GMTrace.o(15452352806912L, 115129);
    }
    
    static boolean ZO()
    {
      GMTrace.i(15452487024640L, 115130);
      if (Build.VERSION.SDK_INT >= 16)
      {
        GMTrace.o(15452487024640L, 115130);
        return true;
      }
      GMTrace.o(15452487024640L, 115130);
      return false;
    }
    
    public final void run()
    {
      GMTrace.i(15452621242368L, 115131);
      if ((this.Aa) && (!this.mPaused))
      {
        double d = this.iwV.ZP();
        AppBrandPerformanceManager.l(this.hyD, 101, (int)d + "%");
        a.a(this.hyD, "Hardware", "CPU", d);
        int i = bg.bRc();
        AppBrandPerformanceManager.l(this.hyD, 102, i + "m");
        a.a(this.hyD, "Hardware", "MEMORY", i);
        this.iwT += 1;
        if (this.iwT >= 4)
        {
          this.iwT = 0;
          final JsApiGetStorageInfoTask localJsApiGetStorageInfoTask = new JsApiGetStorageInfoTask();
          localJsApiGetStorageInfoTask.appId = this.hyD;
          localJsApiGetStorageInfoTask.hYr = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(15450205323264L, 115113);
              AppBrandPerformanceManager.l(AppBrandPerformanceManager.a.this.hyD, 401, bg.aF(localJsApiGetStorageInfoTask.size));
              localJsApiGetStorageInfoTask.VN();
              GMTrace.o(15450205323264L, 115113);
            }
          };
          localJsApiGetStorageInfoTask.VM();
          AppBrandMainProcessService.a(localJsApiGetStorageInfoTask);
        }
      }
      if (this.Aa) {
        com.tencent.mm.plugin.appbrand.o.d.xB().h(this, 3000L);
      }
      GMTrace.o(15452621242368L, 115131);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\performance\AppBrandPerformanceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */