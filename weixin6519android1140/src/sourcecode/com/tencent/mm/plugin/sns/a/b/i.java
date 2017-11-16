package com.tencent.mm.plugin.sns.a.b;

import android.database.Cursor;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.storage.p;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.protocal.c.bff;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class i
  implements com.tencent.mm.ad.e
{
  public static int pnN;
  public static int pnO;
  public static int pnP;
  public static int pnQ;
  public static int pnR;
  public static int pnS;
  int pnM;
  public long pnT;
  public bff pnU;
  public boolean pnV;
  long pnW;
  int pnX;
  private Random random;
  
  static
  {
    GMTrace.i(8172920111104L, 60893);
    pnN = 20480;
    pnO = 30720;
    pnP = 51200;
    pnQ = 60;
    pnR = 1800;
    pnS = 43200;
    GMTrace.o(8172920111104L, 60893);
  }
  
  public i()
  {
    GMTrace.i(8171175280640L, 60880);
    this.pnM = 0;
    this.pnT = 0L;
    this.random = new Random(System.currentTimeMillis());
    this.pnU = new bff();
    this.pnV = false;
    this.pnW = 0L;
    this.pnX = 0;
    GMTrace.o(8171175280640L, 60880);
  }
  
  private void bhJ()
  {
    GMTrace.i(8171577933824L, 60883);
    com.tencent.mm.plugin.sns.model.ae.biQ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8168088272896L, 60857);
        if ((System.currentTimeMillis() - i.this.pnT >= 60000L) || (i.this.pnU.tPB.size() > 1000))
        {
          if ((i.this.pnU != null) && (i.this.pnU.tPB.size() > 0)) {
            i.this.bhL();
          }
          i.this.pnT = 0L;
        }
        GMTrace.o(8168088272896L, 60857);
      }
    });
    GMTrace.o(8171577933824L, 60883);
  }
  
  private void bhK()
  {
    GMTrace.i(8171712151552L, 60884);
    com.tencent.mm.plugin.sns.model.ae.biQ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161511604224L, 60808);
        i locali = i.this;
        if ((bg.aI(locali.pnW) < 100L) && (locali.pnX > 0)) {}
        LinkedList localLinkedList;
        Object localObject2;
        int k;
        for (int j = locali.pnX;; j = locali.pnX)
        {
          localLinkedList = new LinkedList();
          localObject2 = com.tencent.mm.plugin.sns.model.ae.biW().db(j, locali.pnM);
          if (((bff)localObject2).tPB.size() != 0) {
            break;
          }
          str = "read from memery";
          i = 0;
          for (;;)
          {
            k = i;
            localObject1 = str;
            if (locali.pnU.tPB.size() <= 0) {
              break;
            }
            localObject2 = (aks)locali.pnU.tPB.remove();
            k = i;
            localObject1 = str;
            if (((aks)localObject2).uzN.tJp.length + i >= j) {
              break;
            }
            i += ((aks)localObject2).uzN.tJp.length;
            localLinkedList.add(localObject2);
          }
          locali.pnX = i.pnN;
          if (am.isWifi(ab.getContext())) {
            locali.pnX = i.pnP;
          }
          if ((am.is3G(ab.getContext())) || (am.is4G(ab.getContext()))) {
            locali.pnX = i.pnO;
          }
          if (am.is2G(ab.getContext())) {
            locali.pnX = i.pnN;
          }
          locali.pnW = SystemClock.elapsedRealtime();
        }
        String str = "read from db";
        for (int i = 0;; i = ((aks)localObject1).uzN.tJp.length + i)
        {
          k = i;
          localObject1 = str;
          if (((bff)localObject2).tPB.size() <= 0) {
            break;
          }
          localObject1 = (aks)((bff)localObject2).tPB.remove();
          localLinkedList.add(localObject1);
        }
        if (localLinkedList.size() == 0)
        {
          w.i("MicroMsg.SnsLogMgr", "nothing for report");
          GMTrace.o(8161511604224L, 60808);
          return;
        }
        w.i("MicroMsg.SnsLogMgr", "size " + k + " " + localLinkedList.size() + " " + j + " logItemList.LogList.size  " + locali.pnU.tPB.size() + " label:  " + (String)localObject1);
        Object localObject1 = new e(localLinkedList);
        h.xz();
        h.xx().fYr.a((k)localObject1, 0);
        GMTrace.o(8161511604224L, 60808);
      }
    });
    GMTrace.o(8171712151552L, 60884);
  }
  
  public static String l(Object... paramVarArgs)
  {
    GMTrace.i(8171846369280L, 60885);
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      w.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      GMTrace.o(8171846369280L, 60885);
      return paramVarArgs;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8171980587008L, 60886);
    if ((paramk.getType() == 1802) && ((paramk instanceof e)))
    {
      paramString = (e)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.xz();
        h.xy().xh().a(w.a.vrQ, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
        bhK();
        GMTrace.o(8171980587008L, 60886);
        return;
      }
      Object localObject = paramString.pnj;
      paramString = com.tencent.mm.plugin.sns.model.ae.biW();
      paramk = new bff();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        aks localaks = (aks)((Iterator)localObject).next();
        paramk.tPB.add(localaks);
      }
      paramString.a(paramk);
    }
    GMTrace.o(8171980587008L, 60886);
  }
  
  public final void bhI()
  {
    GMTrace.i(8171443716096L, 60882);
    if (!com.tencent.mm.plugin.sns.model.ae.ptG)
    {
      GMTrace.o(8171443716096L, 60882);
      return;
    }
    h.xz();
    int k = ((Integer)h.xy().xh().get(w.a.vrQ, Integer.valueOf(0))).intValue();
    h.xz();
    int j = ((Integer)h.xy().xh().get(w.a.vrP, Integer.valueOf(-1))).intValue();
    if (j <= pnS)
    {
      i = j;
      if (j >= 0) {}
    }
    else
    {
      i = pnR;
      j = pnQ;
      i = this.random.nextInt(i - j + 1) + pnQ;
    }
    if (System.currentTimeMillis() / 1000L - k > i) {}
    for (int i = 1; i == 0; i = 0)
    {
      bhJ();
      w.d("MicroMsg.SnsLogMgr", "pass report ");
      GMTrace.o(8171443716096L, 60882);
      return;
    }
    Object localObject = com.tencent.mm.plugin.sns.model.ae.biW();
    w.i("MicroMsg.SnsKvReportStg", " getLast " + "select rowid from SnsReportKv order by rowid desc  limit 1");
    localObject = ((p)localObject).goN.a("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      this.pnM = i;
      bhK();
      bhJ();
      GMTrace.o(8171443716096L, 60882);
      return;
    }
  }
  
  public final void bhL()
  {
    GMTrace.i(16042373939200L, 119525);
    if (this.pnU.tPB.size() > 0)
    {
      w.i("MicroMsg.SnsLogMgr", "trigerSave " + this.pnU.tPB.size());
      com.tencent.mm.plugin.sns.model.ae.biW().a(this.pnU);
      this.pnU.tPB.clear();
    }
    GMTrace.o(16042373939200L, 119525);
  }
  
  public final void i(final int paramInt, final Object... paramVarArgs)
  {
    GMTrace.i(8171309498368L, 60881);
    com.tencent.mm.plugin.sns.model.ae.biQ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8159498338304L, 60793);
        aks localaks = new aks();
        localaks.uzM = paramInt;
        localaks.uzU = ((int)(System.currentTimeMillis() / 1000L));
        localaks.jhc = 1;
        String str = i.l(paramVarArgs);
        localaks.uzN = new com.tencent.mm.bm.b(str.getBytes());
        i.this.pnU.tPB.add(localaks);
        w.i("MicroMsg.SnsLogMgr", "snsadlog " + paramInt + " " + str);
        if (i.this.pnT == 0L) {
          i.this.pnT = System.currentTimeMillis();
        }
        GMTrace.o(8159498338304L, 60793);
      }
    });
    if (this.pnV)
    {
      GMTrace.o(8171309498368L, 60881);
      return;
    }
    this.pnV = true;
    com.tencent.mm.plugin.sns.model.ae.biQ().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8164867047424L, 60833);
        i.this.pnV = false;
        i.this.bhI();
        GMTrace.o(8164867047424L, 60833);
      }
    }, 2000L);
    GMTrace.o(8171309498368L, 60881);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */