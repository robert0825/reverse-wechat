package com.tencent.mm.plugin.appbrand.ui.banner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public enum AppBrandStickyBannerLogic
{
  static
  {
    GMTrace.i(15518119493632L, 115619);
    iDG = new AppBrandStickyBannerLogic[0];
    GMTrace.o(15518119493632L, 115619);
  }
  
  static final class OperateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateTask> CREATOR;
    boolean iDN;
    int iDO;
    String iDP;
    String iix;
    int op;
    
    static
    {
      GMTrace.i(15523219767296L, 115657);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15523219767296L, 115657);
    }
    
    OperateTask()
    {
      GMTrace.i(15522146025472L, 115649);
      this.op = 0;
      GMTrace.o(15522146025472L, 115649);
    }
    
    static OperateTask ax(String paramString, int paramInt)
    {
      GMTrace.i(15522414460928L, 115651);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 1;
      localOperateTask.iix = paramString;
      localOperateTask.iDO = paramInt;
      GMTrace.o(15522414460928L, 115651);
      return localOperateTask;
    }
    
    static OperateTask ay(String paramString, int paramInt)
    {
      GMTrace.i(15522548678656L, 115652);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 3;
      localOperateTask.iix = paramString;
      localOperateTask.iDO = paramInt;
      GMTrace.o(15522548678656L, 115652);
      return localOperateTask;
    }
    
    static OperateTask n(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(17313415823360L, 128995);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 2;
      localOperateTask.iix = paramString1;
      localOperateTask.iDO = paramInt;
      localOperateTask.iDP = paramString2;
      GMTrace.o(17313415823360L, 128995);
      return localOperateTask;
    }
    
    public final void RY()
    {
      GMTrace.i(15522280243200L, 115650);
      switch (this.op)
      {
      }
      for (;;)
      {
        GMTrace.o(15522280243200L, 115650);
        return;
        this.iDN = AppBrandStickyBannerLogic.b.av(this.iix, this.iDO);
        VL();
        GMTrace.o(15522280243200L, 115650);
        return;
        AppBrandStickyBannerLogic.b.aw(this.iix, this.iDO);
        GMTrace.o(15522280243200L, 115650);
        return;
        AppBrandStickyBannerLogic.b.b(this);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15522951331840L, 115655);
      this.op = paramParcel.readInt();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iDN = bool;
        this.iix = paramParcel.readString();
        this.iDO = paramParcel.readInt();
        this.iDP = paramParcel.readString();
        GMTrace.o(15522951331840L, 115655);
        return;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15522817114112L, 115654);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.op);
      if (this.iDN) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeString(this.iix);
        paramParcel.writeInt(this.iDO);
        paramParcel.writeString(this.iDP);
        GMTrace.o(15522817114112L, 115654);
        return;
      }
    }
  }
  
  private static final class Watcher
    extends MainProcessTask
  {
    public static final Parcelable.Creator<Watcher> CREATOR;
    private static final transient Map<String, Boolean> iDT;
    String iDQ;
    String iDR;
    int iDS;
    
    static
    {
      GMTrace.i(15522011807744L, 115648);
      iDT = new HashMap();
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15522011807744L, 115648);
    }
    
    Watcher()
    {
      GMTrace.i(15521743372288L, 115646);
      GMTrace.o(15521743372288L, 115646);
    }
    
    public final void RY()
    {
      GMTrace.i(15521206501376L, 115642);
      if (bg.nm(this.iDQ))
      {
        GMTrace.o(15521206501376L, 115642);
        return;
      }
      synchronized (iDT)
      {
        if ((iDT.containsKey(this.iDQ)) && (((Boolean)iDT.get(this.iDQ)).booleanValue()))
        {
          GMTrace.o(15521206501376L, 115642);
          return;
        }
        d.aR(this);
        AppBrandStickyBannerLogic.b.d(new e()
        {
          public final void Y(String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(15515972009984L, 115603);
            AppBrandStickyBannerLogic.Watcher.this.iDR = paramAnonymousString;
            AppBrandStickyBannerLogic.Watcher.this.iDS = paramAnonymousInt;
            AppBrandStickyBannerLogic.Watcher.a(AppBrandStickyBannerLogic.Watcher.this);
            GMTrace.o(15515972009984L, 115603);
          }
        });
        iDT.put(this.iDQ, Boolean.valueOf(true));
        GMTrace.o(15521206501376L, 115642);
        return;
      }
    }
    
    public final void VK()
    {
      GMTrace.i(15521340719104L, 115643);
      AppBrandStickyBannerLogic.a.au(this.iDR, this.iDS);
      GMTrace.o(15521340719104L, 115643);
    }
    
    public final int describeContents()
    {
      GMTrace.i(15521072283648L, 115641);
      GMTrace.o(15521072283648L, 115641);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15521609154560L, 115645);
      this.iDQ = paramParcel.readString();
      this.iDR = paramParcel.readString();
      this.iDS = paramParcel.readInt();
      GMTrace.o(15521609154560L, 115645);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15521474936832L, 115644);
      paramParcel.writeString(this.iDQ);
      paramParcel.writeString(this.iDR);
      paramParcel.writeInt(this.iDS);
      GMTrace.o(15521474936832L, 115644);
    }
  }
  
  public static final class a
  {
    private static final AppBrandStickyBannerLogic.Watcher iDH;
    private static final Set<e> iDI;
    public static volatile boolean iDJ;
    public static String iDK;
    private static e iDL;
    private static final Map<String, String> iDM;
    
    static
    {
      GMTrace.i(17316905484288L, 129021);
      iDH = new AppBrandStickyBannerLogic.Watcher();
      iDI = new HashSet();
      iDL = new e()
      {
        public final void Y(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17317845008384L, 129028);
          AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(AppBrandStickyBannerLogic.a.iDK);
          if (localAppBrandSysConfig != null) {}
          for (int i = localAppBrandSysConfig.hRg.hKB;; i = 0)
          {
            if ((AppBrandStickyBannerLogic.a.iDK != null) && (AppBrandStickyBannerLogic.a.iDK.equals(paramAnonymousString)) && (i == paramAnonymousInt)) {}
            for (boolean bool = true;; bool = false)
            {
              AppBrandStickyBannerLogic.a.iDJ = bool;
              w.i("MicroMsg.AppBrandStickyBannerLogic", "onStickyBannerChanged(appId : %s, openType : %s), isStick(appId : %s) = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), AppBrandStickyBannerLogic.a.iDK, Boolean.valueOf(AppBrandStickyBannerLogic.a.iDJ) });
              GMTrace.o(17317845008384L, 129028);
              return;
            }
          }
        }
      };
      iDM = new HashMap();
      GMTrace.o(17316905484288L, 129021);
    }
    
    public static void a(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3)
    {
      GMTrace.i(17315831742464L, 129013);
      if (bg.nm(paramString1))
      {
        GMTrace.o(17315831742464L, 129013);
        return;
      }
      if (paramContext == null) {
        paramContext = ab.getContext();
      }
      for (;;)
      {
        Intent localIntent = new Intent().setClassName(paramContext, "com.tencent.mm.ui.LauncherUI").addFlags(268435456).addFlags(67108864).addFlags(536870912);
        synchronized (iDM)
        {
          String str = (String)iDM.get(paramString1);
          b.a(localIntent, paramString1, paramInt, paramString2, paramString3, bg.nl(str));
          paramContext.startActivity(localIntent);
          if (!(paramContext instanceof Activity)) {}
        }
        GMTrace.o(17315831742464L, 129013);
        return;
      }
    }
    
    static void au(String paramString, int paramInt)
    {
      GMTrace.i(17315697524736L, 129012);
      synchronized (iDI)
      {
        Iterator localIterator = iDI.iterator();
        if (localIterator.hasNext()) {
          ((e)localIterator.next()).Y(paramString, paramInt);
        }
      }
      GMTrace.o(17315697524736L, 129012);
    }
    
    public static boolean av(String paramString, int paramInt)
    {
      GMTrace.i(17315965960192L, 129014);
      if ((bg.nm(paramString)) || (paramInt < 0))
      {
        GMTrace.o(17315965960192L, 129014);
        return false;
      }
      AppBrandStickyBannerLogic.OperateTask localOperateTask = AppBrandStickyBannerLogic.OperateTask.ax(paramString, paramInt);
      boolean bool = AppBrandMainProcessService.b(localOperateTask);
      if (!bool)
      {
        w.w("MicroMsg.AppBrandStickyBannerLogic.ClientLogic", "execSync process task failed(%s, %s) use local state(%s).", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(iDJ) });
        bool = iDJ;
        GMTrace.o(17315965960192L, 129014);
        return bool;
      }
      if ((bool) && (localOperateTask.iDN))
      {
        GMTrace.o(17315965960192L, 129014);
        return true;
      }
      GMTrace.o(17315965960192L, 129014);
      return false;
    }
    
    public static void bo(String paramString1, String paramString2)
    {
      GMTrace.i(17316771266560L, 129020);
      if (bg.nm(paramString1))
      {
        GMTrace.o(17316771266560L, 129020);
        return;
      }
      synchronized (iDM)
      {
        iDM.put(paramString1, bg.nl(paramString2));
        ??? = com.tencent.mm.plugin.appbrand.a.nK(paramString1);
        if (??? == null)
        {
          GMTrace.o(17316771266560L, 129020);
          return;
        }
      }
      AppBrandMainProcessService.a(AppBrandStickyBannerLogic.OperateTask.n(paramString1, ((AppBrandSysConfig)???).hRg.hKB, paramString2));
      GMTrace.o(17316771266560L, 129020);
    }
    
    public static void c(e parame)
    {
      GMTrace.i(17316100177920L, 129015);
      if (parame != null) {
        synchronized (iDI)
        {
          iDI.remove(parame);
          GMTrace.o(17316100177920L, 129015);
          return;
        }
      }
      GMTrace.o(17316100177920L, 129015);
    }
    
    public static void cz(boolean paramBoolean)
    {
      GMTrace.i(17316368613376L, 129017);
      iDJ = paramBoolean;
      GMTrace.o(17316368613376L, 129017);
    }
    
    public static void d(e parame)
    {
      GMTrace.i(17316234395648L, 129016);
      iDH.iDQ = ab.vM();
      AppBrandMainProcessService.a(iDH);
      if (parame != null) {
        synchronized (iDI)
        {
          iDI.add(parame);
          GMTrace.o(17316234395648L, 129016);
          return;
        }
      }
      GMTrace.o(17316234395648L, 129016);
    }
    
    public static void ss(String paramString)
    {
      GMTrace.i(17316502831104L, 129018);
      iDK = "";
      c(iDL);
      w.i("MicroMsg.AppBrandStickyBannerLogic", "release(%s)", new Object[] { paramString });
      GMTrace.o(17316502831104L, 129018);
    }
    
    public static void st(String paramString)
    {
      GMTrace.i(17316637048832L, 129019);
      if (bg.nm(paramString))
      {
        GMTrace.o(17316637048832L, 129019);
        return;
      }
      int i = com.tencent.mm.plugin.appbrand.a.nK(paramString).hRg.hKB;
      if (i < 0)
      {
        GMTrace.o(17316637048832L, 129019);
        return;
      }
      com.tencent.mm.plugin.appbrand.jsapi.h.qg(paramString);
      AppBrandMainProcessService.a(AppBrandStickyBannerLogic.OperateTask.ay(paramString, i));
      GMTrace.o(17316637048832L, 129019);
    }
  }
  
  public static final class b
  {
    static final Set<e> fMZ;
    
    static
    {
      GMTrace.i(17314892218368L, 129006);
      fMZ = new HashSet();
      GMTrace.o(17314892218368L, 129006);
    }
    
    static void aaZ()
    {
      GMTrace.i(17314086912000L, 129000);
      BannerModel localBannerModel = BannerModel.abg();
      String str;
      if (localBannerModel == null)
      {
        str = null;
        if (localBannerModel != null) {
          break label63;
        }
      }
      label63:
      for (int i = -1;; i = localBannerModel.hZb)
      {
        w.i("MicroMsg.AppBrandStickyBannerLogic", "checkAfterProcessRestart stored banner %s, %d", new Object[] { str, Integer.valueOf(i) });
        GMTrace.o(17314086912000L, 129000);
        return;
        str = localBannerModel.appId;
        break;
      }
    }
    
    public static void abf()
    {
      GMTrace.i(17314221129728L, 129001);
      ??? = BannerModel.abg();
      String str1;
      if (??? == null)
      {
        str1 = null;
        if (??? != null) {
          break label80;
        }
      }
      label80:
      for (int i = -1;; i = ((BannerModel)???).hZb)
      {
        synchronized (fMZ)
        {
          Iterator localIterator = fMZ.iterator();
          if (!localIterator.hasNext()) {
            break label88;
          }
          ((e)localIterator.next()).Y(str1, i);
        }
        String str2 = ((BannerModel)???).appId;
        break;
      }
      label88:
      GMTrace.o(17314221129728L, 129001);
    }
    
    public static boolean av(String paramString, int paramInt)
    {
      GMTrace.i(17314623782912L, 129004);
      BannerModel localBannerModel = BannerModel.abh();
      if ((localBannerModel != null) && (!bg.nm(paramString)) && (paramString.equals(localBannerModel.appId)) && (paramInt == localBannerModel.hZb))
      {
        GMTrace.o(17314623782912L, 129004);
        return true;
      }
      GMTrace.o(17314623782912L, 129004);
      return false;
    }
    
    public static void aw(String paramString, int paramInt)
    {
      GMTrace.i(17314758000640L, 129005);
      if (av(paramString, paramInt))
      {
        b.aba();
        abf();
      }
      GMTrace.o(17314758000640L, 129005);
    }
    
    static void b(AppBrandStickyBannerLogic.OperateTask paramOperateTask)
    {
      GMTrace.i(17313952694272L, 128999);
      if (b.a(paramOperateTask)) {
        abf();
      }
      GMTrace.o(17313952694272L, 128999);
    }
    
    public static void c(e parame)
    {
      GMTrace.i(17314489565184L, 129003);
      if (parame != null) {
        synchronized (fMZ)
        {
          fMZ.remove(parame);
          GMTrace.o(17314489565184L, 129003);
          return;
        }
      }
      GMTrace.o(17314489565184L, 129003);
    }
    
    public static void d(e parame)
    {
      GMTrace.i(17314355347456L, 129002);
      if (parame != null) {
        synchronized (fMZ)
        {
          fMZ.add(parame);
          GMTrace.o(17314355347456L, 129002);
          return;
        }
      }
      GMTrace.o(17314355347456L, 129002);
    }
    
    public static void x(Intent paramIntent)
    {
      GMTrace.i(17313818476544L, 128998);
      if ((paramIntent == null) || (!com.tencent.mm.kernel.h.xw().wL()))
      {
        GMTrace.o(17313818476544L, 128998);
        return;
      }
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17313684258816L, 128997);
          if (b.w(this.val$intent)) {
            AppBrandStickyBannerLogic.b.abf();
          }
          GMTrace.o(17313684258816L, 128997);
        }
      });
      GMTrace.o(17313818476544L, 128998);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\banner\AppBrandStickyBannerLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */