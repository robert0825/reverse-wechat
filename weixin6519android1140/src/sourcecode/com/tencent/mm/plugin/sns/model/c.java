package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.protocal.c.ut;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public static int a(long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8076686000128L, 60176);
    paramString = ae.bjh().Iu(paramString);
    Object localObject = paramString.umX;
    w.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", new Object[] { Integer.valueOf(paramString.umX.size()) });
    if (((LinkedList)localObject).isEmpty())
    {
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = (tf)((LinkedList)localObject).getFirst();
    if ((paramLong1 == 0L) || (u(paramString.ujh, paramLong1) > 0L))
    {
      w.e("MicroMsg.FaultLogic", "has a fault  minId:" + paramLong2 + " fault.min:" + paramString.ujh);
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    if ((paramLong2 != 0L) && (u(paramString.ujg, paramLong2) < 0L))
    {
      w.e("MicroMsg.FaultLogic", ":" + paramLong2 + " fault.max:" + paramString.ujg);
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = paramString.uji;
    if (paramString.isEmpty())
    {
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = paramString.iterator();
    int i = Integer.MAX_VALUE;
    while (paramString.hasNext())
    {
      localObject = (bja)paramString.next();
      if ((paramLong2 == 0L) || (u(paramLong2, ((bja)localObject).uUl) >= 0L))
      {
        int j = i;
        if (((bja)localObject).uUm < i) {
          j = ((bja)localObject).uUm;
        }
        i = j;
        if (u(paramLong1, ((bja)localObject).uUl) >= 0L)
        {
          if (j == Integer.MAX_VALUE)
          {
            GMTrace.o(8076686000128L, 60176);
            return 0;
          }
          GMTrace.o(8076686000128L, 60176);
          return j;
        }
      }
    }
    w.i("MicroMsg.FaultLogic", "should not to hear  minId:" + paramLong1);
    GMTrace.o(8076686000128L, 60176);
    return 0;
  }
  
  private static tf a(tf paramtf1, tf paramtf2)
  {
    GMTrace.i(8076283346944L, 60173);
    tf localtf = new tf();
    if (u(paramtf1.ujg, paramtf2.ujg) > 0L)
    {
      localtf.ujg = paramtf1.ujg;
      if (u(paramtf1.ujh, paramtf2.ujh) >= 0L) {
        break label135;
      }
      localtf.ujh = paramtf1.ujh;
      label67:
      paramtf1 = paramtf1.uji;
      paramtf2 = paramtf2.uji.iterator();
    }
    bja localbja1;
    label135:
    long l1;
    int i;
    label161:
    label186:
    int j;
    label195:
    label250:
    label257:
    label265:
    bja localbja2;
    bja localbja3;
    for (;;)
    {
      if (paramtf2.hasNext())
      {
        localbja1 = (bja)paramtf2.next();
        if (paramtf1.isEmpty())
        {
          w.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
          paramtf1.addFirst(localbja1);
          continue;
          localtf.ujg = paramtf2.ujg;
          break;
          localtf.ujh = paramtf2.ujh;
          break label67;
        }
        l1 = localbja1.uUl;
        i = paramtf1.size() - 1;
        if (i >= 0) {
          if (u(l1, ((bja)paramtf1.get(i)).uUk) <= 0L)
          {
            l1 = localbja1.uUk;
            j = 0;
            if (j >= paramtf1.size()) {
              break label257;
            }
            if (u(l1, ((bja)paramtf1.get(j)).uUl) < 0L) {
              break label250;
            }
          }
        }
        for (;;)
        {
          if (i != -1) {
            break label265;
          }
          paramtf1.addFirst(localbja1);
          break;
          i -= 1;
          break label161;
          i = -1;
          break label186;
          j += 1;
          break label195;
          j = paramtf1.size();
        }
        if (j == paramtf1.size())
        {
          paramtf1.addLast(localbja1);
        }
        else
        {
          localbja2 = (bja)paramtf1.get(j);
          if (u(localbja1.uUk, localbja2.uUk) >= 0L) {
            break label650;
          }
          localbja3 = new bja();
          localbja3.uUk = localbja2.uUk;
          l1 = localbja1.uUk;
          if (l1 == Long.MAX_VALUE)
          {
            l1 = Long.MIN_VALUE;
            localbja3.uUl = l1;
            localbja3.uUm = localbja2.uUm;
            paramtf1.add(j, localbja3);
            i += 1;
            j += 1;
          }
        }
      }
    }
    label549:
    label647:
    label650:
    for (;;)
    {
      localbja2 = (bja)paramtf1.get(i);
      int k = i;
      if (u(localbja1.uUl, localbja2.uUl) > 0L)
      {
        localbja3 = new bja();
        localbja3.uUl = localbja2.uUl;
        localbja3.uUk = dx(localbja1.uUl);
        localbja3.uUm = localbja2.uUm;
        paramtf1.add(i + 1, localbja3);
        k = i;
      }
      for (;;)
      {
        if (k >= j)
        {
          paramtf1.remove(k);
          k -= 1;
          continue;
          l1 += 1L;
          break;
        }
      }
      paramtf1.add(j, localbja1);
      if (paramtf1.size() <= 100) {
        break;
      }
      long l2 = ((bja)paramtf1.getLast()).uUl;
      l1 = ((bja)paramtf1.getLast()).uUk;
      i = ((bja)paramtf1.getLast()).uUm;
      if (paramtf1.size() >= 100)
      {
        localbja1 = (bja)paramtf1.removeLast();
        l1 = localbja1.uUk;
        if (localbja1.uUm >= i) {
          break label647;
        }
        i = localbja1.uUm;
      }
      for (;;)
      {
        break label549;
        localbja1 = new bja();
        localbja1.uUk = l1;
        localbja1.uUl = l2;
        localbja1.uUm = i;
        paramtf1.addLast(localbja1);
        break;
        localtf.uji = paramtf1;
        GMTrace.o(8076283346944L, 60173);
        return localtf;
      }
    }
  }
  
  public static void c(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(8076149129216L, 60172);
    if (paramLong2 == 0L)
    {
      GMTrace.o(8076149129216L, 60172);
      return;
    }
    Object localObject1 = ae.bjh().Iu(paramString);
    if (localObject1 == null) {
      localObject1 = new ut();
    }
    for (;;)
    {
      if ((paramLong1 == 0L) && (((ut)localObject1).umX.isEmpty()))
      {
        GMTrace.o(8076149129216L, 60172);
        return;
      }
      long l = paramLong1;
      if (paramLong1 == 0L) {
        l = ((tf)((ut)localObject1).umX.getFirst()).ujg;
      }
      Object localObject2 = new tf();
      ((tf)localObject2).ujg = l;
      ((tf)localObject2).ujh = paramLong2;
      Object localObject3 = new bja();
      ((bja)localObject3).uUk = l;
      ((bja)localObject3).uUl = paramLong2;
      ((bja)localObject3).uUm = paramInt;
      ((tf)localObject2).uji.add(localObject3);
      for (;;)
      {
        if (!((ut)localObject1).umX.isEmpty())
        {
          localObject3 = (tf)((ut)localObject1).umX.getFirst();
          if (u(((tf)localObject2).ujh, ((tf)localObject3).ujg) > 0L) {
            w.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + ((tf)localObject2).ujh + " fault.Max" + ((tf)localObject3).ujg);
          }
        }
        else
        {
          ((ut)localObject1).umX.addFirst(localObject2);
          while (((ut)localObject1).umX.size() > 100) {
            ((ut)localObject1).umX.removeLast();
          }
        }
        ((ut)localObject1).umX.removeFirst();
        localObject2 = a((tf)localObject3, (tf)localObject2);
      }
      if (((ut)localObject1).umX.size() > 0) {
        w.d("MicroMsg.FaultLogic", "min " + ((tf)((ut)localObject1).umX.get(0)).ujh + " max " + ((tf)((ut)localObject1).umX.get(0)).ujg);
      }
      localObject2 = ae.bjh().Iw(paramString);
      try
      {
        ((k)localObject2).field_userName = paramString;
        ((k)localObject2).field_faultS = ((ut)localObject1).toByteArray();
        ae.bjh().c((k)localObject2);
        if (((ut)localObject1).umX.size() > 1)
        {
          w.d("MicroMsg.FaultLogic", "fault size : " + ((ut)localObject1).umX.size());
          paramString = ((ut)localObject1).umX.iterator();
          while (paramString.hasNext())
          {
            localObject1 = (tf)paramString.next();
            w.d("MicroMsg.FaultLogic", "min - max " + ((tf)localObject1).ujh + " " + ((tf)localObject1).ujg);
          }
        }
        GMTrace.o(8076149129216L, 60172);
        return;
      }
      catch (Exception paramString)
      {
        for (;;) {}
      }
    }
  }
  
  public static long dx(long paramLong)
  {
    GMTrace.i(8076551782400L, 60175);
    if (paramLong == Long.MIN_VALUE)
    {
      GMTrace.o(8076551782400L, 60175);
      return Long.MAX_VALUE;
    }
    GMTrace.o(8076551782400L, 60175);
    return paramLong - 1L;
  }
  
  private static long u(long paramLong1, long paramLong2)
  {
    GMTrace.i(8076417564672L, 60174);
    if (((paramLong1 > 0L) && (paramLong2 > 0L)) || ((paramLong1 < 0L) && (paramLong2 < 0L)))
    {
      GMTrace.o(8076417564672L, 60174);
      return paramLong1 - paramLong2;
    }
    if (paramLong1 < 0L)
    {
      GMTrace.o(8076417564672L, 60174);
      return 1L;
    }
    GMTrace.o(8076417564672L, 60174);
    return -1L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */