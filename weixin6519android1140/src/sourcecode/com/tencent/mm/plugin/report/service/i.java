package com.tencent.mm.plugin.report.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.platformtools.g.a;
import com.tencent.mm.plugin.report.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class i
  implements aq
{
  private static HashMap<Integer, g.d> jvQ;
  private g.a jvS;
  private c orz;
  
  static
  {
    GMTrace.i(13110790324224L, 97683);
    HashMap localHashMap = new HashMap();
    jvQ = localHashMap;
    localHashMap.put(Integer.valueOf("DUPLICATEKVLOG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(13115085291520L, 97715);
        String[] arrayOfString = b.fTX;
        GMTrace.o(13115085291520L, 97715);
        return arrayOfString;
      }
    });
    GMTrace.o(13110790324224L, 97683);
  }
  
  public i()
  {
    GMTrace.i(13109850800128L, 97676);
    this.orz = new c() {};
    GMTrace.o(13109850800128L, 97676);
  }
  
  private static i bcb()
  {
    GMTrace.i(13110656106496L, 97682);
    i locali = (i)p.o(i.class);
    GMTrace.o(13110656106496L, 97682);
    return locali;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(13110387671040L, 97680);
    long l = System.currentTimeMillis();
    String str = h.xy().cachePath + "CommonOneMicroMsg.db";
    this.jvS = g.a(hashCode(), str, jvQ, false);
    w.i("MicroMsg.SubCoreReport", "summeranrt onAccountPostReset tid[%d] [%d]ms, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l), bg.bQW() });
    com.tencent.mm.sdk.b.a.vgX.b(this.orz);
    h.xz();
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13111058759680L, 97685);
        if (!h.xw().wL())
        {
          GMTrace.o(13111058759680L, 97685);
          return;
        }
        bg.d(h.xy().cachePath + "logcat/", "temp_", 10800000L);
        GMTrace.o(13111058759680L, 97685);
      }
      
      public final String toString()
      {
        GMTrace.i(13111192977408L, 97686);
        String str = super.toString() + "|onAccountPostReset";
        GMTrace.o(13111192977408L, 97686);
        return str;
      }
    });
    GMTrace.o(13110387671040L, 97680);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(13110521888768L, 97681);
    GMTrace.o(13110521888768L, 97681);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(13110253453312L, 97679);
    GMTrace.o(13110253453312L, 97679);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(13109985017856L, 97677);
    if (bcb() != null)
    {
      i locali = bcb();
      if (locali.jvS != null)
      {
        locali.jvS.hA(locali.hashCode());
        locali.jvS = null;
      }
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.orz);
    GMTrace.o(13109985017856L, 97677);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(13110119235584L, 97678);
    GMTrace.o(13110119235584L, 97678);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */