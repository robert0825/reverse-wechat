package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.appcache.g.a;
import com.tencent.mm.plugin.appbrand.appcache.g.b;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.appcache.z;
import com.tencent.mm.pluginsdk.j.a.d.l;
import java.util.ArrayList;

public final class d
  implements g.b
{
  public d()
  {
    GMTrace.i(19915092262912L, 148379);
    GMTrace.o(19915092262912L, 148379);
  }
  
  public final g.a a(r paramr)
  {
    GMTrace.i(19915226480640L, 148380);
    if (z.class == paramr.getClass())
    {
      paramr = new a(paramr);
      GMTrace.o(19915226480640L, 148380);
      return paramr;
    }
    GMTrace.o(19915226480640L, 148380);
    return null;
  }
  
  private static final class a
    implements g.a
  {
    private final r hIC;
    private ArrayList<IDKey> hIE;
    private long hIF;
    private long hIG;
    private int hTl;
    
    public a(r paramr)
    {
      GMTrace.i(19912676343808L, 148361);
      this.hIF = 0L;
      this.hIG = 0L;
      this.hIC = paramr;
      GMTrace.o(19912676343808L, 148361);
    }
    
    private void Sz()
    {
      GMTrace.i(19912944779264L, 148363);
      try
      {
        com.tencent.mm.plugin.report.d.oqe.b(this.hIE, false);
        this.hIE.clear();
        GMTrace.o(19912944779264L, 148363);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(19912944779264L, 148363);
      }
    }
    
    private void is(int paramInt)
    {
      GMTrace.i(19912810561536L, 148362);
      if (this.hIE == null) {
        this.hIE = new ArrayList();
      }
      this.hIE.add(new IDKey(640, paramInt, 1));
      GMTrace.o(19912810561536L, 148362);
    }
    
    public final void St()
    {
      GMTrace.i(19913078996992L, 148364);
      int i;
      if (c.a.hX(this.hIC.eII)) {
        if (((a)h.h(a.class)).RZ() == null)
        {
          i = 1;
          if (i <= 1) {
            break label141;
          }
          i = a.hTn;
          label48:
          this.hTl = i;
          label53:
          switch (d.1.hTk[(this.hTl - 1)])
          {
          default: 
            i = 0;
          }
        }
      }
      for (;;)
      {
        is(i);
        this.hIF = SystemClock.elapsedRealtime();
        GMTrace.o(19913078996992L, 148364);
        return;
        i = ((a)h.h(a.class)).RZ().V(this.hIC.appId, this.hIC.eII);
        break;
        label141:
        i = a.hTm;
        break label48;
        this.hTl = a.hTm;
        break label53;
        i = 1;
        continue;
        i = 10;
      }
    }
    
    public final void Su()
    {
      GMTrace.i(20770864496640L, 154755);
      is(32);
      GMTrace.o(20770864496640L, 154755);
    }
    
    public final void Sv()
    {
      GMTrace.i(19913213214720L, 148365);
      is(31);
      GMTrace.o(19913213214720L, 148365);
    }
    
    public final void Sw()
    {
      GMTrace.i(19913481650176L, 148367);
      GMTrace.o(19913481650176L, 148367);
    }
    
    public final void Sx()
    {
      GMTrace.i(19913750085632L, 148369);
      GMTrace.o(19913750085632L, 148369);
    }
    
    public final void Sy()
    {
      GMTrace.i(19913884303360L, 148370);
      this.hIG = SystemClock.elapsedRealtime();
      switch (d.1.hTk[(this.hTl - 1)])
      {
      }
      for (;;)
      {
        GMTrace.o(19913884303360L, 148370);
        return;
        is(5);
        GMTrace.o(19913884303360L, 148370);
        return;
        is(14);
      }
    }
    
    public final void a(l paraml)
    {
      int k = 1;
      int j = 2;
      GMTrace.i(19913347432448L, 148366);
      long l = SystemClock.elapsedRealtime() - this.hIF;
      if (l <= 1000L)
      {
        i = 0;
        label34:
        com.tencent.mm.plugin.report.d.oqe.a(665L, i, 1L, false);
        if ((paraml == null) || (paraml.status != 2)) {
          break label170;
        }
      }
      label170:
      for (int i = k;; i = 0) {
        switch (d.1.hTk[(this.hTl - 1)])
        {
        default: 
          Sz();
          GMTrace.o(19913347432448L, 148366);
          return;
          if (l <= 2000L)
          {
            i = 1;
            break label34;
          }
          if (l <= 3000L)
          {
            i = 2;
            break label34;
          }
          if (l <= 4000L)
          {
            i = 3;
            break label34;
          }
          if (l <= 5000L)
          {
            i = 4;
            break label34;
          }
          i = 5;
          break label34;
        }
      }
      if (i != 0) {}
      for (i = j;; i = 3)
      {
        is(i);
        break;
      }
      if (i != 0) {}
      for (i = 11;; i = 12)
      {
        is(i);
        break;
      }
    }
    
    public final void bV(boolean paramBoolean)
    {
      GMTrace.i(19914018521088L, 148371);
      SystemClock.elapsedRealtime();
      int i;
      switch (d.1.hTk[(this.hTl - 1)])
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        is(i);
        Sz();
        GMTrace.o(19914018521088L, 148371);
        return;
        if (paramBoolean)
        {
          i = 6;
        }
        else
        {
          i = 7;
          continue;
          if (paramBoolean) {
            i = 15;
          } else {
            i = 16;
          }
        }
      }
    }
    
    public final void hY(int paramInt)
    {
      GMTrace.i(19913615867904L, 148368);
      GMTrace.o(19913615867904L, 148368);
    }
    
    private static enum a
    {
      static
      {
        GMTrace.i(19911871037440L, 148355);
        hTm = 1;
        hTn = 2;
        hTo = new int[] { hTm, hTn };
        GMTrace.o(19911871037440L, 148355);
      }
      
      public static int[] Va()
      {
        GMTrace.i(19911736819712L, 148354);
        int[] arrayOfInt = (int[])hTo.clone();
        GMTrace.o(19911736819712L, 148354);
        return arrayOfInt;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */