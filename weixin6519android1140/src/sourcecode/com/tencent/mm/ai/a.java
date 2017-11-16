package com.tencent.mm.ai;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bv;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static boolean ezY;
  public static final c gBy;
  private static Thread thread;
  
  static
  {
    GMTrace.i(20308887076864L, 151313);
    thread = null;
    ezY = false;
    gBy = new c();
    GMTrace.o(20308887076864L, 151313);
  }
  
  public static List<a> GG()
  {
    GMTrace.i(20308350205952L, 151309);
    if (!ab.bPY())
    {
      GMTrace.o(20308350205952L, 151309);
      return null;
    }
    Object localObject2 = gBy.gBM;
    Object localObject1 = (String)localObject2 + "/mm";
    Object localObject4 = (String)localObject2 + "/push";
    try
    {
      localObject2 = (c.b)b.g(new FileInputStream((String)localObject1));
    }
    catch (Exception localException2)
    {
      try
      {
        for (;;)
        {
          localObject1 = (c.b)b.g(new FileInputStream((String)localObject4));
          localObject4 = new ArrayList();
          if (localObject2 == null) {
            break label422;
          }
          localObject5 = ((c.b)localObject2).gBO.iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject6 = a((c.d)((Iterator)localObject5).next(), 0);
            if (localObject6 != null) {
              ((List)localObject4).add(localObject6);
            }
          }
          localException2 = localException2;
          w.e("MicroMsg.ActiveDetector", "%s,read exception:" + localException2.getMessage(), new Object[] { localObject1 });
          localObject3 = null;
        }
      }
      catch (Exception localException1)
      {
        Object localObject6;
        Object localObject3;
        Iterator localIterator;
        for (;;)
        {
          w.e("MicroMsg.ActiveDetector", "%s,read exception:" + localException1.getMessage(), new Object[] { localObject4 });
          localIterator = null;
        }
        Object localObject5 = ((c.b)localObject3).gBQ.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = a((c.a)((Iterator)localObject5).next(), 3);
          if (localObject6 != null) {
            ((List)localObject4).add(localObject6);
          }
        }
        localObject5 = ((c.b)localObject3).gBR.iterator();
        label420:
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (c.c)((Iterator)localObject5).next();
          if (localObject6 == null) {
            localObject3 = null;
          }
          for (;;)
          {
            if (localObject3 == null) {
              break label420;
            }
            ((List)localObject4).add(localObject3);
            break;
            localObject3 = new a();
            ((a)localObject3).pid = ((c.c)localObject6).pid;
            ((a)localObject3).gov = ((c.c)localObject6).gov;
            ((a)localObject3).startTime = ((c.c)localObject6).gBS;
            ((a)localObject3).endTime = ((c.c)localObject6).gBS;
            ((a)localObject3).type = 4;
            ((a)localObject3).gBD = ((c.c)localObject6).gBD;
            ((a)localObject3).gBE = ((c.c)localObject6).gBE;
            ((a)localObject3).gBF = ((c.c)localObject6).gBF;
          }
        }
        label422:
        if (localIterator != null)
        {
          localObject3 = localIterator.gBO.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject5 = a((c.d)((Iterator)localObject3).next(), 1);
            if (localObject5 != null) {
              ((List)localObject4).add(localObject5);
            }
          }
          localIterator = localIterator.gBP.iterator();
          while (localIterator.hasNext())
          {
            localObject3 = a((c.a)localIterator.next(), 2);
            if (localObject3 != null) {
              ((List)localObject4).add(localObject3);
            }
          }
        }
        Collections.sort((List)localObject4);
        GMTrace.o(20308350205952L, 151309);
      }
    }
    return (List<a>)localObject4;
  }
  
  private static a a(c.a parama, int paramInt)
  {
    GMTrace.i(20308752859136L, 151312);
    if (parama == null)
    {
      GMTrace.o(20308752859136L, 151312);
      return null;
    }
    a locala = new a();
    locala.gov = parama.gov;
    locala.startTime = parama.time;
    locala.endTime = parama.time;
    locala.type = paramInt;
    locala.gBC = parama.type;
    GMTrace.o(20308752859136L, 151312);
    return locala;
  }
  
  private static a a(c.d paramd, int paramInt)
  {
    GMTrace.i(20308618641408L, 151311);
    if (paramd == null)
    {
      GMTrace.o(20308618641408L, 151311);
      return null;
    }
    a locala = new a();
    locala.gov = paramd.gBT;
    locala.startTime = paramd.startTime;
    locala.endTime = paramd.endTime;
    locala.type = paramInt;
    locala.pid = paramd.pid;
    locala.gBA = paramd.gBA;
    if (paramInt == 1)
    {
      locala.gBz = paramd.gBz;
      locala.gBB = paramd.gBB;
    }
    GMTrace.o(20308618641408L, 151311);
    return locala;
  }
  
  public static void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    GMTrace.i(20308081770496L, 151307);
    c localc = gBy;
    c.c localc1 = new c.c(Process.myPid(), paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
    w.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]delayed msg[%s]", new Object[] { localc1.toString() });
    localc.gBI.gBR.add(localc1);
    GMTrace.o(20308081770496L, 151307);
  }
  
  static String ak(long paramLong)
  {
    GMTrace.i(20308484423680L, 151310);
    Object localObject = new Date(paramLong);
    localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format((Date)localObject);
    GMTrace.o(20308484423680L, 151310);
    return (String)localObject;
  }
  
  public static final void bs(boolean paramBoolean)
  {
    GMTrace.i(20307679117312L, 151304);
    ezY = paramBoolean;
    if (paramBoolean)
    {
      w.i("MicroMsg.ActiveDetector", "[oneliang]active, time%s, pid:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()) });
      if (thread != null) {
        thread.interrupt();
      }
      thread = null;
      gBy.clear();
      e.b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20380827779072L, 151849);
          a.gBy.GH();
          GMTrace.o(20380827779072L, 151849);
        }
      }, "process_detector_save_data", 1);
      GMTrace.o(20307679117312L, 151304);
      return;
    }
    w.i("MicroMsg.ActiveDetector", "[oneliang]unactive, time%s, pid:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()) });
    if (thread == null)
    {
      Thread localThread = e.b(gBy, "ProcessDetector_" + Process.myPid());
      thread = localThread;
      localThread.start();
    }
    GMTrace.o(20307679117312L, 151304);
  }
  
  public static void fW(int paramInt)
  {
    GMTrace.i(20307813335040L, 151305);
    if (ezY)
    {
      GMTrace.o(20307813335040L, 151305);
      return;
    }
    c localc = gBy;
    c.a locala = new c.a(bv.BT(), System.currentTimeMillis(), paramInt);
    localc.gBI.gBP.add(locala);
    GMTrace.o(20307813335040L, 151305);
  }
  
  public static void fX(int paramInt)
  {
    GMTrace.i(20307947552768L, 151306);
    if (ezY)
    {
      GMTrace.o(20307947552768L, 151306);
      return;
    }
    c localc = gBy;
    c.a locala = new c.a(bv.BT(), System.currentTimeMillis(), paramInt);
    localc.gBI.gBQ.add(locala);
    GMTrace.o(20307947552768L, 151306);
  }
  
  public static void fY(int paramInt)
  {
    GMTrace.i(20308215988224L, 151308);
    gBy.gBG = paramInt;
    GMTrace.o(20308215988224L, 151308);
  }
  
  public static final class a
    implements Comparable<a>
  {
    public long endTime;
    public boolean gBA;
    public boolean gBB;
    public int gBC;
    public long gBD;
    public long gBE;
    public long gBF;
    public int gBz;
    public long gov;
    public int pid;
    public long startTime;
    public int type;
    
    public a()
    {
      GMTrace.i(20309692383232L, 151319);
      this.gov = 0L;
      this.startTime = 0L;
      this.endTime = 0L;
      this.type = 0;
      this.pid = 0;
      this.gBz = 0;
      this.gBA = true;
      this.gBB = false;
      this.gBC = 0;
      this.gBD = 0L;
      this.gBE = 0L;
      this.gBF = 0L;
      GMTrace.o(20309692383232L, 151319);
    }
    
    public final String toString()
    {
      GMTrace.i(20309826600960L, 151320);
      Object localObject = new StringBuilder();
      switch (this.type)
      {
      }
      for (;;)
      {
        ((StringBuilder)localObject).append("\n");
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(20309826600960L, 151320);
        return (String)localObject;
        ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,[mm] pid:%s,normal execute:%s", new Object[] { a.ak(this.gov), a.ak(this.startTime), a.ak(this.endTime), Integer.valueOf(this.pid), Boolean.valueOf(this.gBA) }));
        continue;
        ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,[push] pid:%s,network:%s,normal execute:%s", new Object[] { a.ak(this.gov), a.ak(this.startTime), a.ak(this.endTime), Integer.valueOf(this.pid), Integer.valueOf(this.gBz), Boolean.valueOf(this.gBA) }));
        continue;
        ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,send broadcast type(push):%s", new Object[] { a.ak(this.gov), a.ak(this.startTime), a.ak(this.endTime), Integer.valueOf(this.gBC) }));
        continue;
        ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,receive broadcast type(mm):%s", new Object[] { a.ak(this.gov), a.ak(this.startTime), a.ak(this.endTime), Integer.valueOf(this.gBC) }));
        continue;
        ((StringBuilder)localObject).append(String.format("server time:%s,local start time:%s,local end time:%s,delayed msg pid:%s, msg server time:%s,interval time:%s, msg server id:%s", new Object[] { a.ak(this.gov), a.ak(this.startTime), a.ak(this.endTime), Integer.valueOf(this.pid), a.ak(this.gBD), Long.valueOf(this.gBE), Long.valueOf(this.gBF) }));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ai\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */