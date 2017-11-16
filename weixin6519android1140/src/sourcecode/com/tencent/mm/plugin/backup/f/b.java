package com.tencent.mm.plugin.backup.f;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.e.c;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public abstract class b
  extends k
{
  public static final Map<Integer, Set<com.tencent.mm.ad.e>> guw;
  private static final ae handler;
  static int iVq;
  public static c jbn;
  static a jbo;
  private static final Map<Integer, b> jbp;
  private static int jbq;
  private static i jbr;
  private static j jbs;
  private static b jbt;
  
  static
  {
    GMTrace.i(9509326028800L, 70850);
    iVq = -1;
    guw = new HashMap();
    jbp = new HashMap();
    handler = new ae(Looper.getMainLooper());
    jbq = new Random(System.currentTimeMillis()).nextInt(1147483648);
    jbr = null;
    jbs = null;
    jbt = null;
    GMTrace.o(9509326028800L, 70850);
  }
  
  public b()
  {
    GMTrace.i(9505165279232L, 70819);
    GMTrace.o(9505165279232L, 70819);
  }
  
  public static void a(int paramInt, com.tencent.mm.ad.e parame)
  {
    GMTrace.i(9508118069248L, 70841);
    synchronized (guw)
    {
      if (!guw.containsKey(Integer.valueOf(paramInt))) {
        guw.put(Integer.valueOf(paramInt), new HashSet());
      }
      if (!((Set)guw.get(Integer.valueOf(paramInt))).contains(parame)) {
        ((Set)guw.get(Integer.valueOf(paramInt))).add(parame);
      }
      GMTrace.o(9508118069248L, 70841);
      return;
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(9505433714688L, 70821);
    jbo = parama;
    GMTrace.o(9505433714688L, 70821);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(9508520722432L, 70844);
    jbt = paramb;
    GMTrace.o(9508520722432L, 70844);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(9505299496960L, 70820);
    jbn = paramc;
    GMTrace.o(9505299496960L, 70820);
  }
  
  public static void a(i.a parama)
  {
    GMTrace.i(9505702150144L, 70823);
    jbr = new i(parama);
    GMTrace.o(9505702150144L, 70823);
  }
  
  public static void a(j.a parama)
  {
    GMTrace.i(9505970585600L, 70825);
    jbs = new j(parama);
    GMTrace.o(9505970585600L, 70825);
  }
  
  public static void aeS()
  {
    GMTrace.i(9508654940160L, 70845);
    if (jbt != null) {
      jbt.aeS();
    }
    GMTrace.o(9508654940160L, 70845);
  }
  
  public static int ael()
  {
    GMTrace.i(14811328937984L, 110353);
    int i = iVq;
    GMTrace.o(14811328937984L, 110353);
    return i;
  }
  
  public static i afv()
  {
    GMTrace.i(9505567932416L, 70822);
    i locali = jbr;
    GMTrace.o(9505567932416L, 70822);
    return locali;
  }
  
  public static j afw()
  {
    GMTrace.i(9505836367872L, 70824);
    j localj = jbs;
    GMTrace.o(9505836367872L, 70824);
    return localj;
  }
  
  public static void b(int paramInt, com.tencent.mm.ad.e parame)
  {
    GMTrace.i(9508252286976L, 70842);
    try
    {
      synchronized (guw)
      {
        if (guw.get(Integer.valueOf(paramInt)) != null) {
          ((Set)guw.get(Integer.valueOf(paramInt))).remove(parame);
        }
        GMTrace.o(9508252286976L, 70842);
        return;
      }
    }
    catch (Exception parame)
    {
      for (;;) {}
    }
  }
  
  public static void b(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(9507849633792L, 70839);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      w.i("MicroMsg.BackupBaseScene", "BackupBaseScene callback isLocal: %b,  seq:%d   type:%d,  bufLen:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!paramBoolean) {}
    }
    else
    {
      for (;;)
      {
        try
        {
          ??? = new StringBuilder("callback error buf content : ");
          if (paramArrayOfByte != null) {
            continue;
          }
          str = "null";
          w.w("MicroMsg.BackupBaseScene", str);
        }
        catch (Exception localException1)
        {
          String str;
          continue;
        }
        b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
        GMTrace.o(9507849633792L, 70839);
        return;
        i = paramArrayOfByte.length;
        break;
        str = new String(paramArrayOfByte);
      }
    }
    if (jbr != null)
    {
      jbr.afD();
      w.d("MicroMsg.BackupBaseScene", "updateHeartBeatTimeStamp type:%d, current time stamp:%d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
    }
    synchronized (jbp)
    {
      ??? = (b)jbp.remove(Integer.valueOf(paramInt1));
      if (??? == null) {
        break label291;
      }
      if (paramArrayOfByte == null) {
        try
        {
          throw new Exception("buf is null");
        }
        catch (Exception paramArrayOfByte)
        {
          ((b)???).f(3, -1, "buf to resq fail");
          w.printErrStackTrace("MicroMsg.BackupBaseScene", paramArrayOfByte, "%s ", new Object[] { paramArrayOfByte.toString() });
          GMTrace.o(9507849633792L, 70839);
          return;
        }
      }
    }
    ((b)???).afr().aD(paramArrayOfByte);
    ((b)???).aft();
    GMTrace.o(9507849633792L, 70839);
    return;
    label291:
    w.i("MicroMsg.BackupBaseScene", "notify scene null type:%d", new Object[] { Integer.valueOf(paramInt2) });
    if ((??? == null) && (paramInt2 == 16))
    {
      for (;;)
      {
        b localb;
        synchronized (jbp)
        {
          Iterator localIterator = new HashSet(jbp.keySet()).iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          Integer localInteger2 = (Integer)localIterator.next();
          localb = (b)jbp.get(localInteger2);
          if (localb == null)
          {
            ??? = "null";
            w.d("MicroMsg.BackupBaseScene", "notify sceneMap seq:%d scene:%s type:%s", new Object[] { localInteger2, localb, ??? });
            if ((localb == null) || (localb.getType() != 15)) {
              continue;
            }
            jbp.remove(localInteger2);
            try
            {
              localb.afr().aD(paramArrayOfByte);
              localb.aft();
            }
            catch (Exception localException2)
            {
              localb.f(3, -1, "buf to resp fail");
              w.printErrStackTrace("MicroMsg.BackupBaseScene", localException2, " type:%d %s ", new Object[] { Integer.valueOf(localb.getType()), localException2.toString() });
            }
          }
        }
        Integer localInteger1 = Integer.valueOf(localb.getType());
      }
      GMTrace.o(9507849633792L, 70839);
      return;
    }
    w.i("MicroMsg.BackupBaseScene", "notify globalSeq:%d, type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
    GMTrace.o(9507849633792L, 70839);
  }
  
  private static void b(boolean paramBoolean, final int paramInt1, final byte[] paramArrayOfByte, final int paramInt2)
  {
    GMTrace.i(9507983851520L, 70840);
    handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9512547254272L, 70874);
        if (b.jbn != null)
        {
          b.jbn.a(this.iVJ, paramInt1, paramArrayOfByte, paramInt2);
          GMTrace.o(9512547254272L, 70874);
          return;
        }
        w.i("MicroMsg.BackupBaseScene", "onNotify is null");
        GMTrace.o(9512547254272L, 70874);
      }
    });
    GMTrace.o(9507983851520L, 70840);
  }
  
  public static void clear()
  {
    GMTrace.i(9506910109696L, 70832);
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
    synchronized (jbp)
    {
      jbp.clear();
    }
    synchronized (guw)
    {
      guw.clear();
      GMTrace.o(9506910109696L, 70832);
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
  
  public static boolean d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(9507715416064L, 70838);
    PByteArray localPByteArray = new PByteArray();
    c.a(paramArrayOfByte, paramInt2, (short)paramInt1, localPByteArray, iVq);
    if (jbo != null) {
      jbo.i(paramInt2, localPByteArray.value);
    }
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene sendResp globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(localPByteArray.value.length) });
    GMTrace.o(9507715416064L, 70838);
    return true;
  }
  
  public static void kD(int paramInt)
  {
    GMTrace.i(9508789157888L, 70846);
    if (jbs != null)
    {
      j localj = jbs;
      localj.jbV = (paramInt + localj.jbV);
    }
    GMTrace.o(9508789157888L, 70846);
  }
  
  public static void ku(int paramInt)
  {
    GMTrace.i(14811194720256L, 110352);
    iVq = paramInt;
    GMTrace.o(14811194720256L, 110352);
  }
  
  public static boolean r(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(9507581198336L, 70837);
    PByteArray localPByteArray = new PByteArray();
    synchronized (jbp)
    {
      c.a(paramArrayOfByte, jbq, (short)paramInt, localPByteArray, iVq);
      if (jbo != null) {
        jbo.i(jbq, localPByteArray.value);
      }
      w.i("MicroMsg.BackupBaseScene", "BackupBaseScene sendBuf globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(jbq), Integer.valueOf(paramInt), Integer.valueOf(localPByteArray.value.length) });
      jbq += 1;
      GMTrace.o(9507581198336L, 70837);
      return true;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9508923375616L, 70847);
    GMTrace.o(9508923375616L, 70847);
    return 0;
  }
  
  public abstract a afr();
  
  public abstract a afs();
  
  public abstract void aft();
  
  public boolean afx()
  {
    GMTrace.i(9507044327424L, 70833);
    boolean bool = df(false);
    GMTrace.o(9507044327424L, 70833);
    return bool;
  }
  
  public final boolean afy()
  {
    GMTrace.i(9507312762880L, 70835);
    PByteArray localPByteArray = new PByteArray();
    try
    {
      byte[] arrayOfByte = afs().toByteArray();
      synchronized (jbp)
      {
        c.a(arrayOfByte, jbq, (short)getType(), localPByteArray, iVq);
        if (jbo != null) {
          jbo.j(jbq, localPByteArray.value);
        }
        w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(jbq), Integer.valueOf(getType()), Integer.valueOf(localPByteArray.value.length) });
        jbp.put(Integer.valueOf(jbq), this);
        jbq += 1;
        GMTrace.o(9507312762880L, 70835);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9507312762880L, 70835);
    }
  }
  
  public final int afz()
  {
    GMTrace.i(9507446980608L, 70836);
    synchronized (jbp)
    {
      int i = jbq;
      jbp.put(Integer.valueOf(i), this);
      jbq += 1;
      GMTrace.o(9507446980608L, 70836);
      return i;
    }
  }
  
  public final boolean df(boolean paramBoolean)
  {
    GMTrace.i(9507178545152L, 70834);
    PByteArray localPByteArray = new PByteArray();
    try
    {
      byte[] arrayOfByte = afs().toByteArray();
      synchronized (jbp)
      {
        c.a(arrayOfByte, jbq, (short)getType(), localPByteArray, iVq);
        if (jbo != null) {
          jbo.i(jbq, localPByteArray.value);
        }
        w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene globalSeq:%d, isDirect:%b, type:%d, len:%d", new Object[] { Integer.valueOf(jbq), Boolean.valueOf(paramBoolean), Integer.valueOf(getType()), Integer.valueOf(localPByteArray.value.length) });
        if (!paramBoolean) {
          jbp.put(Integer.valueOf(jbq), this);
        }
        jbq += 1;
        GMTrace.o(9507178545152L, 70834);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9507178545152L, 70834);
    }
  }
  
  public final void f(final int paramInt1, final int paramInt2, final String paramString)
  {
    GMTrace.i(9508386504704L, 70843);
    handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9502749360128L, 70801);
        synchronized (b.guw)
        {
          Set localSet = (Set)b.guw.get(Integer.valueOf(b.this.getType()));
          if ((localSet != null) && (localSet.size() > 0))
          {
            ??? = new HashSet();
            ((Set)???).addAll(localSet);
            ??? = ((Set)???).iterator();
            while (((Iterator)???).hasNext())
            {
              com.tencent.mm.ad.e locale = (com.tencent.mm.ad.e)((Iterator)???).next();
              if ((locale != null) && (localSet.contains(locale))) {
                locale.a(paramInt1, paramInt2, paramString, b.this);
              }
            }
          }
        }
        GMTrace.o(9502749360128L, 70801);
      }
    });
    GMTrace.o(9508386504704L, 70843);
  }
  
  public abstract int getType();
  
  public static abstract interface a
  {
    public abstract void i(int paramInt, byte[] paramArrayOfByte);
    
    public abstract int j(int paramInt, byte[] paramArrayOfByte);
  }
  
  public static abstract interface b
  {
    public abstract void aeS();
  }
  
  public static abstract interface c
  {
    public abstract void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */