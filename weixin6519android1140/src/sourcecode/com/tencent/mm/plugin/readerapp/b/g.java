package com.tencent.mm.plugin.readerapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.r.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bh;
import com.tencent.mm.y.bi;
import com.tencent.mm.y.br;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public final class g
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private a ocA;
  private d ocB;
  private f ocC;
  private bi ocy;
  private c ocz;
  
  static
  {
    GMTrace.i(11747138207744L, 87523);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("READERAPPINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11748748820480L, 87535);
        String[] arrayOfString = bi.fTX;
        GMTrace.o(11748748820480L, 87535);
        return arrayOfString;
      }
    });
    GMTrace.o(11747138207744L, 87523);
  }
  
  public g()
  {
    GMTrace.i(11744990724096L, 87507);
    this.ocz = new c();
    this.ocA = new a();
    this.ocB = new d();
    this.ocC = new f();
    GMTrace.o(11744990724096L, 87507);
  }
  
  private static void a(final int paramInt, a parama)
  {
    GMTrace.i(11746601336832L, 87519);
    if (!at.AU())
    {
      c(parama);
      GMTrace.o(11746601336832L, 87519);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(11749956780032L, 87544);
        at.AR();
        Object localObject = new File(com.tencent.mm.y.c.yU());
        if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
        {
          g.c(this.ocD);
          GMTrace.o(11749956780032L, 87544);
          return;
        }
        localObject = ((File)localObject).listFiles();
        if ((localObject == null) || (localObject.length <= 0))
        {
          g.c(this.ocD);
          GMTrace.o(11749956780032L, 87544);
          return;
        }
        String str1 = String.format("reader_%d_", new Object[] { Integer.valueOf(paramInt) });
        String str2 = String.format("ReaderApp_%d", new Object[] { Integer.valueOf(paramInt) });
        while (i < localObject.length)
        {
          if (localObject[i].getName().startsWith(str1)) {
            localObject[i].delete();
          }
          if (localObject[i].getName().startsWith(str2)) {
            localObject[i].delete();
          }
          i += 1;
        }
        g.c(this.ocD);
        GMTrace.o(11749956780032L, 87544);
      }
      
      public final String toString()
      {
        GMTrace.i(11750090997760L, 87545);
        String str = super.toString() + "|deleteAllPic";
        GMTrace.o(11750090997760L, 87545);
        return str;
      }
    });
    GMTrace.o(11746601336832L, 87519);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(11745796030464L, 87513);
    bah().fz(20);
    at.AR();
    com.tencent.mm.y.c.yP().TN("newsapp");
    a(20, parama);
    GMTrace.o(11745796030464L, 87513);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(11745930248192L, 87514);
    bah().fz(11);
    at.AR();
    com.tencent.mm.y.c.yP().TN("blogapp");
    a(11, parama);
    GMTrace.o(11745930248192L, 87514);
  }
  
  private static g bag()
  {
    GMTrace.i(11745124941824L, 87508);
    g localg2 = (g)at.AK().gZ("plugin.readerapp");
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      at.AK().a("plugin.readerapp", localg1);
    }
    GMTrace.o(11745124941824L, 87508);
    return localg1;
  }
  
  public static bi bah()
  {
    GMTrace.i(11745259159552L, 87509);
    h.xw().wG();
    if (bag().ocy == null)
    {
      localObject = bag();
      at.AR();
      ((g)localObject).ocy = new bi(com.tencent.mm.y.c.yH());
    }
    Object localObject = bag().ocy;
    GMTrace.o(11745259159552L, 87509);
    return (bi)localObject;
  }
  
  public static void c(a parama)
  {
    GMTrace.i(11746467119104L, 87518);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11747406643200L, 87525);
        if (this.ocD != null) {
          this.ocD.bae();
        }
        GMTrace.o(11747406643200L, 87525);
      }
    });
    GMTrace.o(11746467119104L, 87518);
  }
  
  public static void dd(long paramLong)
  {
    GMTrace.i(11746064465920L, 87515);
    h(bah().a(paramLong, 20), 20);
    GMTrace.o(11746064465920L, 87515);
  }
  
  private static void h(List<bh> paramList, int paramInt)
  {
    GMTrace.i(11746332901376L, 87517);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(11746332901376L, 87517);
      return;
    }
    int i = 0;
    if (i < paramList.size())
    {
      if (i == 0) {
        bg.deleteFile(s.s(((bh)paramList.get(i)).Bz(), paramInt, "@T"));
      }
      for (;;)
      {
        i += 1;
        break;
        bg.deleteFile(s.s(((bh)paramList.get(i)).Bz(), paramInt, "@S"));
      }
    }
    GMTrace.o(11746332901376L, 87517);
  }
  
  public static void t(long paramLong, int paramInt)
  {
    GMTrace.i(11746198683648L, 87516);
    h(bah().b(paramLong, paramInt), paramInt);
    GMTrace.o(11746198683648L, 87516);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11746735554560L, 87520);
    d.c.a(Integer.valueOf(12399999), this.ocz);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11749017255936L, 87537);
        if (!at.AU())
        {
          GMTrace.o(11749017255936L, 87537);
          return;
        }
        at.AR();
        bg.d(com.tencent.mm.y.c.yU(), "ReaderApp_", 604800000L);
        GMTrace.o(11749017255936L, 87537);
      }
      
      public final String toString()
      {
        GMTrace.i(11749151473664L, 87538);
        String str = super.toString() + "|onAccountPostReset";
        GMTrace.o(11749151473664L, 87538);
        return str;
      }
    });
    com.tencent.mm.sdk.b.a.vgX.b(this.ocA);
    com.tencent.mm.sdk.b.a.vgX.b(this.ocB);
    com.tencent.mm.sdk.b.a.vgX.b(this.ocC);
    i.b(e.ocx);
    GMTrace.o(11746735554560L, 87520);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11746869772288L, 87521);
    GMTrace.o(11746869772288L, 87521);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11745661812736L, 87512);
    if ((0x80000 & paramInt) != 0) {
      a(null);
    }
    if ((0x40000 & paramInt) != 0) {
      b(null);
    }
    GMTrace.o(11745661812736L, 87512);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11745393377280L, 87510);
    d.c.aE(Integer.valueOf(12399999));
    com.tencent.mm.sdk.b.a.vgX.c(this.ocA);
    com.tencent.mm.sdk.b.a.vgX.c(this.ocB);
    com.tencent.mm.sdk.b.a.vgX.c(this.ocC);
    i.a(e.ocx);
    GMTrace.o(11745393377280L, 87510);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11745527595008L, 87511);
    HashMap localHashMap = fIv;
    GMTrace.o(11745527595008L, 87511);
    return localHashMap;
  }
  
  public static abstract interface a
  {
    public abstract void bae();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */