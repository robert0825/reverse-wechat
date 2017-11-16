package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.protocal.c.ahh;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static final ThreadLocal<HashMap<String, Long>> pqr;
  
  static
  {
    GMTrace.i(8797166764032L, 65544);
    pqr = new ThreadLocal();
    GMTrace.o(8797166764032L, 65544);
  }
  
  public static boolean He(String paramString)
  {
    GMTrace.i(8796361457664L, 65538);
    paramString = ae.bjd().Is(paramString);
    boolean bool = a(paramString, ai.n(paramString));
    GMTrace.o(8796361457664L, 65538);
    return bool;
  }
  
  public static boolean a(com.tencent.mm.plugin.sns.storage.m paramm, bfh parambfh)
  {
    GMTrace.i(8796629893120L, 65540);
    anv localanv = paramm.blQ();
    if (paramm.field_type != 21)
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (localanv.eYn == 1)
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (q.zE().equals(paramm.field_userName))
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (parambfh.uRe != null)
    {
      parambfh = parambfh.uRe.uRH;
      if ((parambfh == null) || (parambfh.size() == 0))
      {
        GMTrace.o(8796629893120L, 65540);
        return false;
      }
      paramm = q.zE();
      parambfh = parambfh.iterator();
      while (parambfh.hasNext()) {
        if (paramm.equals(((bfd)parambfh.next()).tRz))
        {
          GMTrace.o(8796629893120L, 65540);
          return true;
        }
      }
    }
    GMTrace.o(8796629893120L, 65540);
    return false;
  }
  
  public static long b(com.tencent.mm.plugin.sns.storage.m paramm, bfh parambfh)
  {
    long l = 0L;
    GMTrace.i(8797032546304L, 65543);
    if (paramm == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    Object localObject1 = parambfh;
    if (parambfh == null) {
      localObject1 = ai.n(paramm);
    }
    if (localObject1 == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    parambfh = ((bfh)localObject1).uRe;
    if (parambfh == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    Object localObject2 = parambfh.uRH;
    if (localObject2 == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    parambfh = paramm.pMd;
    if (bg.nm(parambfh)) {}
    for (paramm = g.n(paramm.field_content) + g.n(paramm.field_attrBuf);; paramm = parambfh)
    {
      localObject1 = (HashMap)pqr.get();
      if ((localObject1 != null) && (((HashMap)localObject1).containsKey(paramm)))
      {
        l = ((Long)((HashMap)localObject1).get(paramm)).longValue();
        GMTrace.o(8797032546304L, 65543);
        return l;
      }
      parambfh = ((List)localObject2).iterator();
      for (;;)
      {
        if (parambfh.hasNext())
        {
          bfd localbfd = (bfd)parambfh.next();
          localObject2 = new ahh();
          try
          {
            ((ahh)localObject2).aD(com.tencent.mm.platformtools.n.a(localbfd.uQq));
            l += ((ahh)localObject2).eYB;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicrMsg.SnsLuckyUtil", localException.getMessage() + "hbBuffer is error");
            }
          }
        }
      }
      parambfh = (bfh)localObject1;
      if (localObject1 == null) {
        parambfh = new HashMap();
      }
      parambfh.put(paramm, Long.valueOf(l));
      pqr.set(parambfh);
      GMTrace.o(8797032546304L, 65543);
      return l;
    }
  }
  
  public static boolean h(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796495675392L, 65539);
    boolean bool = a(paramm, ai.n(paramm));
    GMTrace.o(8796495675392L, 65539);
    return bool;
  }
  
  public static int i(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796764110848L, 65541);
    if (paramm == null)
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    paramm = ai.n(paramm);
    if (paramm == null)
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    paramm = paramm.uRe;
    if ((paramm == null) || (paramm.uRH.size() == 0))
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    int i = paramm.uRH.size();
    GMTrace.o(8796764110848L, 65541);
    return i;
  }
  
  public static long j(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796898328576L, 65542);
    long l = b(paramm, null);
    GMTrace.o(8796898328576L, 65542);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */