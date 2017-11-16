package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Vector;

public final class c
{
  private static Vector<n> keI;
  public static n keJ;
  
  static
  {
    GMTrace.i(18596000432128L, 138551);
    keI = new Vector();
    GMTrace.o(18596000432128L, 138551);
  }
  
  c()
  {
    GMTrace.i(18594389819392L, 138539);
    GMTrace.o(18594389819392L, 138539);
  }
  
  public static void a(n paramn)
  {
    GMTrace.i(18594524037120L, 138540);
    if ((paramn != null) && (!keI.contains(paramn))) {
      keI.add(paramn);
    }
    GMTrace.o(18594524037120L, 138540);
  }
  
  public static void apH()
  {
    GMTrace.i(18594926690304L, 138543);
    keJ = null;
    GMTrace.o(18594926690304L, 138543);
  }
  
  public static n[] apI()
  {
    GMTrace.i(20092930752512L, 149704);
    n[] arrayOfn = new n[keI.size()];
    arrayOfn = (n[])keI.toArray(arrayOfn);
    GMTrace.o(20092930752512L, 149704);
    return arrayOfn;
  }
  
  public static void b(n paramn)
  {
    GMTrace.i(18594658254848L, 138541);
    if (paramn != null) {
      keI.remove(paramn);
    }
    GMTrace.o(18594658254848L, 138541);
  }
  
  public static void c(n paramn)
  {
    GMTrace.i(18594792472576L, 138542);
    keJ = paramn;
    GMTrace.o(18594792472576L, 138542);
  }
  
  public final void b(final long paramLong, int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(18595597778944L, 138548);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18598416351232L, 138569);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].c(paramLong, paramBoolean, this.keL);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.c(paramLong, paramBoolean, this.keL);
        }
        GMTrace.o(18598416351232L, 138569);
      }
    });
    GMTrace.o(18595597778944L, 138548);
  }
  
  public final void b(final long paramLong, String paramString, final boolean paramBoolean)
  {
    GMTrace.i(18595463561216L, 138547);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", new Object[] { Long.valueOf(paramLong) });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18603785060352L, 138609);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].c(paramLong, paramBoolean, this.keL);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.c(paramLong, paramBoolean, this.keL);
        }
        GMTrace.o(18603785060352L, 138609);
      }
    });
    GMTrace.o(18595463561216L, 138547);
  }
  
  public final void bj(final long paramLong)
  {
    GMTrace.i(18595329343488L, 138546);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", new Object[] { Long.valueOf(paramLong) });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18604858802176L, 138617);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].onTaskRemoved(paramLong);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.onTaskRemoved(paramLong);
        }
        GMTrace.o(18604858802176L, 138617);
      }
    });
    GMTrace.o(18595329343488L, 138546);
  }
  
  public final void bk(final long paramLong)
  {
    GMTrace.i(18595731996672L, 138549);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", new Object[] { Long.valueOf(paramLong) });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18592779206656L, 138527);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].onTaskPaused(paramLong);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.onTaskPaused(paramLong);
        }
        GMTrace.o(18592779206656L, 138527);
      }
    });
    GMTrace.o(18595731996672L, 138549);
  }
  
  public final void bl(final long paramLong)
  {
    GMTrace.i(18595866214400L, 138550);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18598953222144L, 138573);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].bs(paramLong);
          i += 1;
        }
        GMTrace.o(18598953222144L, 138573);
      }
    });
    GMTrace.o(18595866214400L, 138550);
  }
  
  public final void i(final long paramLong, String paramString)
  {
    GMTrace.i(18595060908032L, 138544);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18609153769472L, 138649);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].onTaskStarted(paramLong, this.fMt);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.onTaskStarted(paramLong, this.fMt);
        }
        GMTrace.o(18609153769472L, 138649);
      }
    });
    GMTrace.o(18595060908032L, 138544);
  }
  
  public final void j(final long paramLong, String paramString)
  {
    GMTrace.i(18595195125760L, 138545);
    w.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18615193567232L, 138694);
        n[] arrayOfn = c.apI();
        int j = arrayOfn.length;
        int i = 0;
        while (i < j)
        {
          arrayOfn[i].k(paramLong, this.fMt);
          i += 1;
        }
        if (c.keJ != null) {
          c.keJ.k(paramLong, this.fMt);
        }
        GMTrace.o(18615193567232L, 138694);
      }
    });
    GMTrace.o(18595195125760L, 138545);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */