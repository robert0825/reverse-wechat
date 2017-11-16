package com.tencent.mm.plugin.appbrand.report;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.aym;
import com.tencent.mm.protocal.c.bum;
import com.tencent.mm.protocal.c.bun;
import com.tencent.mm.protocal.c.bus;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public final class AppBrandIDKeyBatchReport
{
  private static volatile IDKeyBatchReportTask ixX;
  
  public static IDKeyBatchReportTask ZT()
  {
    GMTrace.i(10628836098048L, 79191);
    if (ixX == null) {
      ixX = new IDKeyBatchReportTask();
    }
    IDKeyBatchReportTask localIDKeyBatchReportTask = ixX;
    GMTrace.o(10628836098048L, 79191);
    return localIDKeyBatchReportTask;
  }
  
  public static String ZU()
  {
    GMTrace.i(16166122684416L, 120447);
    String str2 = com.tencent.mm.kernel.h.xy().cachePath;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "appbrand/report/";
    com.tencent.mm.sdk.platformtools.h.Nj(str1);
    GMTrace.o(16166122684416L, 120447);
    return str1;
  }
  
  public static String ZV()
  {
    GMTrace.i(16166256902144L, 120448);
    String str = ZU() + "WxaAppRecord";
    GMTrace.o(16166256902144L, 120448);
    return str;
  }
  
  public static void a(bus parambus)
  {
    GMTrace.i(16166391119872L, 120449);
    if (ab.bPY())
    {
      b.c(parambus);
      GMTrace.o(16166391119872L, 120449);
      return;
    }
    a.b(parambus);
    GMTrace.o(16166391119872L, 120449);
  }
  
  private static final class IDKeyBatchReportTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<IDKeyBatchReportTask> CREATOR;
    public int ixZ;
    int iya;
    bus iyb;
    
    static
    {
      GMTrace.i(10624541130752L, 79159);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10624541130752L, 79159);
    }
    
    IDKeyBatchReportTask()
    {
      GMTrace.i(10622393647104L, 79143);
      GMTrace.o(10622393647104L, 79143);
    }
    
    IDKeyBatchReportTask(Parcel paramParcel)
    {
      GMTrace.i(10622527864832L, 79144);
      f(paramParcel);
      GMTrace.o(10622527864832L, 79144);
    }
    
    public final void RY()
    {
      GMTrace.i(10622662082560L, 79145);
      if (1 == this.ixZ)
      {
        AppBrandIDKeyBatchReport.b.jw(0);
        AppBrandIDKeyBatchReport.b.ZW();
        GMTrace.o(10622662082560L, 79145);
        return;
      }
      if (2 == this.ixZ)
      {
        AppBrandIDKeyBatchReport.b.ZX();
        GMTrace.o(10622662082560L, 79145);
        return;
      }
      if (3 == this.ixZ) {
        AppBrandIDKeyBatchReport.b.c(this.iyb);
      }
      GMTrace.o(10622662082560L, 79145);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10622796300288L, 79146);
      this.ixZ = paramParcel.readInt();
      this.iya = paramParcel.readInt();
      if (3 == this.ixZ) {
        try
        {
          this.iyb = new bus();
          this.iyb.aD(paramParcel.createByteArray());
          GMTrace.o(10622796300288L, 79146);
          return;
        }
        catch (Exception paramParcel)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", new Object[] { paramParcel });
          this.iyb = null;
        }
      }
      GMTrace.o(10622796300288L, 79146);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10622930518016L, 79147);
      paramParcel.writeInt(this.ixZ);
      paramParcel.writeInt(this.iya);
      if (3 == this.ixZ) {
        try
        {
          paramParcel.writeByteArray(this.iyb.toByteArray());
          GMTrace.o(10622930518016L, 79147);
          return;
        }
        catch (Exception paramParcel)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", new Object[] { paramParcel });
        }
      }
      GMTrace.o(10622930518016L, 79147);
    }
  }
  
  private static final class a
  {
    private static final byte[] ixY;
    
    static
    {
      GMTrace.i(16165451595776L, 120442);
      ixY = new byte[0];
      GMTrace.o(16165451595776L, 120442);
    }
    
    public static void b(bus parambus)
    {
      GMTrace.i(16165317378048L, 120441);
      synchronized (ixY)
      {
        AppBrandIDKeyBatchReport.ZT().iyb = parambus;
        AppBrandIDKeyBatchReport.ZT().ixZ = 3;
        AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.ZT());
        GMTrace.o(16165317378048L, 120441);
        return;
      }
    }
  }
  
  private static final class b
  {
    private static volatile aj ido;
    private static final ReentrantReadWriteLock iyc;
    private static volatile aj iyd;
    public static volatile int iye;
    
    static
    {
      GMTrace.i(16164780507136L, 120437);
      iyc = new ReentrantReadWriteLock();
      ido = null;
      iyd = null;
      GMTrace.o(16164780507136L, 120437);
    }
    
    public static void ZW()
    {
      GMTrace.i(16163840983040L, 120430);
      Object localObject1 = ZY();
      if (bg.cc((List)localObject1))
      {
        i = 0;
        if (i != 0)
        {
          i = iye;
          if (i > 0) {
            break label308;
          }
        }
      }
      label308:
      for (int i = 300000;; i = (i + 5) * 60000)
      {
        if (iyd != null)
        {
          iyd.stopTimer();
          iyd = null;
        }
        localObject1 = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(16165048942592L, 120439);
            AppBrandIDKeyBatchReport.b.ZX();
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "on timer expired in monitor timer!");
            GMTrace.o(16165048942592L, 120439);
            return true;
          }
        }, false);
        iyd = (aj)localObject1;
        long l = i;
        ((aj)localObject1).z(l, l);
        GMTrace.o(16163840983040L, 120430);
        return;
        Object localObject2 = new b.a();
        ((b.a)localObject2).gtF = new bum();
        ((b.a)localObject2).gtG = new bun();
        ((b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport";
        ((b.a)localObject2).gtE = 1009;
        ((b.a)localObject2).gtH = 0;
        ((b.a)localObject2).gtI = 0;
        localObject2 = ((b.a)localObject2).DA();
        aym localaym = new aym();
        localaym.jhN = Build.MANUFACTURER;
        localaym.uMO = 2;
        localaym.tWD = com.tencent.mm.protocal.d.tJw;
        localaym.tWE = com.tencent.mm.protocal.d.tJv;
        localaym.oWm = ab.getResources().getDisplayMetrics().widthPixels;
        localaym.uMP = ab.getResources().getDisplayMetrics().heightPixels;
        localaym.tWF = com.tencent.mm.protocal.d.tJy;
        localaym.tWG = com.tencent.mm.protocal.d.tJz;
        localaym.uMQ = ab.getResources().getConfiguration().locale.getLanguage();
        ((bum)((com.tencent.mm.ad.b)localObject2).gtC.gtK).vcQ = localaym;
        ((bum)((com.tencent.mm.ad.b)localObject2).gtC.gtK).vcP = ((LinkedList)localObject1);
        u.a((com.tencent.mm.ad.b)localObject2, new u.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
          {
            GMTrace.i(16167330643968L, 120456);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              paramAnonymousInt1 = ((bun)paramAnonymousb.gtD.gtK).vcR;
              AppBrandIDKeyBatchReport.b.iye = paramAnonymousInt1;
              AppBrandIDKeyBatchReport.b.jw(paramAnonymousInt1);
            }
            for (;;)
            {
              GMTrace.o(16167330643968L, 120456);
              return 0;
              paramAnonymousString = this.iyf.iterator();
              while (paramAnonymousString.hasNext()) {
                AppBrandIDKeyBatchReport.b.b((bus)paramAnonymousString.next());
              }
            }
          }
        }, true);
        i = 1;
        break;
      }
    }
    
    public static void ZX()
    {
      GMTrace.i(16163975200768L, 120431);
      if (ido != null)
      {
        ido.stopTimer();
        ido = null;
      }
      GMTrace.o(16163975200768L, 120431);
    }
    
    private static LinkedList<bus> ZY()
    {
      GMTrace.i(16164512071680L, 120435);
      iyc.readLock().lock();
      for (;;)
      {
        try
        {
          Object localObject2 = new File(AppBrandIDKeyBatchReport.ZV());
          if (!((File)localObject2).exists())
          {
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "reportFile not exist!");
            iyc.readLock().unlock();
            ZZ();
            GMTrace.o(16164512071680L, 120435);
            return null;
          }
          LinkedList localLinkedList = new LinkedList();
          long l = ((File)localObject2).length();
          int i = 0;
          localObject2 = com.tencent.mm.a.e.c(AppBrandIDKeyBatchReport.ZV(), i, 4);
          if (localObject2 == null)
          {
            w.e("MicroMsg.AppBrandIDKeyBatchReport", "preData is null!");
            iyc.readLock().unlock();
            ZZ();
            GMTrace.o(16164512071680L, 120435);
            return null;
          }
          int j = new DataInputStream(new ByteArrayInputStream((byte[])localObject2)).readInt();
          localObject2 = com.tencent.mm.a.e.c(AppBrandIDKeyBatchReport.ZV(), i + 4, j);
          localLinkedList.add((bus)new bus().aD((byte[])localObject2));
          i = j + 4 + i;
          if (i >= l)
          {
            iyc.readLock().unlock();
            ZZ();
            GMTrace.o(16164512071680L, 120435);
            return localLinkedList;
          }
        }
        catch (IOException localIOException)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "read file error %s", new Object[] { localIOException.getMessage() });
          w.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", localIOException, "", new Object[0]);
          iyc.readLock().unlock();
          ZZ();
          GMTrace.o(16164512071680L, 120435);
          return null;
        }
        finally
        {
          iyc.readLock().unlock();
          ZZ();
        }
      }
    }
    
    private static void ZZ()
    {
      GMTrace.i(16164646289408L, 120436);
      iyc.writeLock().lock();
      com.tencent.mm.loader.stub.b.deleteFile(AppBrandIDKeyBatchReport.ZV());
      iyc.writeLock().unlock();
      GMTrace.o(16164646289408L, 120436);
    }
    
    public static void b(bus parambus)
    {
      GMTrace.i(16164377853952L, 120434);
      iyc.writeLock().lock();
      try
      {
        parambus = parambus.toByteArray();
        Object localObject = new File(AppBrandIDKeyBatchReport.ZU());
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
        localObject = new File(AppBrandIDKeyBatchReport.ZV());
        if (!((File)localObject).exists()) {
          ((File)localObject).createNewFile();
        }
        int i = parambus.length;
        localObject = new ByteArrayOutputStream();
        new DataOutputStream((OutputStream)localObject).writeInt(i);
        localObject = ((ByteArrayOutputStream)localObject).toByteArray();
        com.tencent.mm.a.e.d(AppBrandIDKeyBatchReport.ZV(), (byte[])localObject);
        com.tencent.mm.a.e.d(AppBrandIDKeyBatchReport.ZV(), parambus);
        iyc.writeLock().unlock();
        GMTrace.o(16164377853952L, 120434);
        return;
      }
      catch (Exception parambus)
      {
        w.e("MicroMsg.AppBrandIDKeyBatchReport", "appendToFile exception:%s", new Object[] { parambus.getMessage() });
        w.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", parambus, "", new Object[0]);
        iyc.writeLock().unlock();
        GMTrace.o(16164377853952L, 120434);
        return;
      }
      finally
      {
        iyc.writeLock().unlock();
      }
    }
    
    public static void c(bus parambus)
    {
      GMTrace.i(16164243636224L, 120433);
      if (parambus == null)
      {
        GMTrace.o(16164243636224L, 120433);
        return;
      }
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16165988466688L, 120446);
          AppBrandIDKeyBatchReport.b.b(this.iyg);
          GMTrace.o(16165988466688L, 120446);
        }
      });
      GMTrace.o(16164243636224L, 120433);
    }
    
    public static void jw(int paramInt)
    {
      int i = 60000;
      GMTrace.i(16164109418496L, 120432);
      if (paramInt <= 0) {}
      for (paramInt = i;; paramInt = 60000 * paramInt)
      {
        ZX();
        aj localaj = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(16165720031232L, 120444);
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "startReport run in TimerTask!");
            AppBrandIDKeyBatchReport.b.ZW();
            GMTrace.o(16165720031232L, 120444);
            return true;
          }
        }, true);
        ido = localaj;
        long l = paramInt;
        localaj.z(l, l);
        GMTrace.o(16164109418496L, 120432);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\AppBrandIDKeyBatchReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */