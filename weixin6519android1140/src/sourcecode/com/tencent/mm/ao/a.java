package com.tencent.mm.ao;

import android.net.TrafficStats;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.a.v;
import com.tencent.mm.g.a.v.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Stack;

public final class a
  implements c.a
{
  private a gGl;
  public Stack<Long> gGm;
  long gGn;
  public int gGo;
  boolean gGp;
  public long gGq;
  public int gGr;
  public boolean gGs;
  public long gGt;
  public long gGu;
  public int gGv;
  public int gGw;
  public aj gGx;
  com.tencent.mm.sdk.b.c gGy;
  com.tencent.mm.sdk.b.c gGz;
  
  public a(Looper paramLooper)
  {
    GMTrace.i(3511001546752L, 26159);
    this.gGn = 0L;
    this.gGo = 0;
    this.gGp = false;
    this.gGq = 0L;
    this.gGr = 0;
    this.gGs = false;
    this.gGt = 0L;
    this.gGu = 0L;
    this.gGx = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3539187269632L, 26369);
        long l1 = TrafficStats.getUidRxBytes(a.this.gGv);
        long l2 = TrafficStats.getUidTxBytes(a.this.gGv);
        long l3 = l1 - a.this.gGt + (l2 - a.this.gGu);
        w.d("MicroMsg.AutoGetBigImgLogic", "delta of data: " + l3 / 1024L);
        if (l3 <= 20480L)
        {
          a.this.gGs = false;
          a.this.start();
        }
        for (;;)
        {
          GMTrace.o(3539187269632L, 26369);
          return true;
          a.this.gGt = l1;
          a.this.gGu = l2;
          a.this.gGx.z(1000L, 1000L);
        }
      }
    }, false);
    this.gGy = new com.tencent.mm.sdk.b.c() {};
    this.gGz = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(v arg1)
      {
        GMTrace.i(3540261011456L, 26377);
        a.this.gGw = ???.eAS.mode;
        w.d("MicroMsg.AutoGetBigImgLogic", "mode = " + a.this.gGw);
        com.tencent.mm.modelcontrol.c.Gs();
        if (!com.tencent.mm.modelcontrol.c.Gt()) {}
        synchronized (a.this.gGm)
        {
          a.this.gGm.clear();
          GMTrace.o(3540261011456L, 26377);
          return false;
        }
      }
    };
    this.gGl = new a(this, paramLooper);
    this.gGm = new Stack();
    this.gGv = Process.myUid();
    paramLooper = (Integer)com.tencent.mm.kernel.h.xy().xh().get(327681, null);
    if ((paramLooper == null) || (3 == paramLooper.intValue())) {}
    for (int i = 1;; i = paramLooper.intValue())
    {
      this.gGw = i;
      com.tencent.mm.sdk.b.a.vgX.b(this.gGy);
      com.tencent.mm.sdk.b.a.vgX.b(this.gGz);
      GMTrace.o(3511001546752L, 26159);
      return;
    }
  }
  
  public static void a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    GMTrace.i(3511538417664L, 26163);
    if (paramBoolean)
    {
      if (am.isWifi(ab.getContext()))
      {
        w.v("MicroMsg.AutoGetBigImgLogic", "is wifi pass count");
        GMTrace.o(3511538417664L, 26163);
        return;
      }
      long l1 = bg.a((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqP, null), 0L);
      long l2 = bg.Sz((String)DateFormat.format("M", System.currentTimeMillis()));
      w.d("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + " msgLocalId: " + paramLong2 + " has been downloaded current %d month %d", new Object[] { Long.valueOf(1L + l1), Long.valueOf(l2) });
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vqP, Long.valueOf(l1 + 1L));
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vqQ, Long.valueOf(l2));
      GMTrace.o(3511538417664L, 26163);
      return;
    }
    w.i("MicroMsg.AutoGetBigImgLogic", "imglocalId " + paramLong1 + " msglocalid " + paramLong2 + " false");
    GMTrace.o(3511538417664L, 26163);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(3511806853120L, 26165);
    w.i("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + " has been canceled");
    GMTrace.o(3511806853120L, 26165);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, k paramk)
  {
    GMTrace.i(3511404199936L, 26162);
    GMTrace.o(3511404199936L, 26162);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object arg7, int paramInt3, int paramInt4, String paramString, k paramk)
  {
    GMTrace.i(3511672635392L, 26164);
    if ((paramInt3 != 0) || (paramInt4 != 0)) {
      w.e("MicroMsg.AutoGetBigImgLogic", "img " + paramLong1 + "msgLocalId " + paramLong2 + " download failed");
    }
    for (;;)
    {
      this.gGn = 0L;
      com.tencent.mm.modelcontrol.c.Gs();
      if (!com.tencent.mm.modelcontrol.c.Gt())
      {
        w.d("MicroMsg.AutoGetBigImgLogic", "don't allow auto download, clear task list");
        synchronized (this.gGm)
        {
          this.gGm.clear();
          GMTrace.o(3511672635392L, 26164);
          return;
          a(paramLong1, paramLong2, true);
        }
      }
    }
    this.gGt = TrafficStats.getUidRxBytes(this.gGv);
    this.gGu = TrafficStats.getUidTxBytes(this.gGv);
    this.gGx.z(1000L, 1000L);
    GMTrace.o(3511672635392L, 26164);
  }
  
  public final void bk(boolean paramBoolean)
  {
    GMTrace.i(3511269982208L, 26161);
    w.d("MicroMsg.AutoGetBigImgLogic", "is foreground: " + paramBoolean);
    this.gGp = paramBoolean;
    this.gGq = System.currentTimeMillis();
    GMTrace.o(3511269982208L, 26161);
  }
  
  public final void start()
  {
    GMTrace.i(3511135764480L, 26160);
    this.gGl.sendEmptyMessage(1);
    GMTrace.o(3511135764480L, 26160);
  }
  
  static final class a
    extends ae
  {
    private WeakReference<a> gGB;
    
    public a(a parama, Looper paramLooper)
    {
      super();
      GMTrace.i(3530999988224L, 26308);
      this.gGB = new WeakReference(parama);
      GMTrace.o(3530999988224L, 26308);
    }
    
    public final void handleMessage(Message arg1)
    {
      GMTrace.i(3531134205952L, 26309);
      a locala = (a)this.gGB.get();
      if ((locala != null) && (1 == ???.what))
      {
        if ((!locala.gGp) && (System.currentTimeMillis() - locala.gGq > 1200000L))
        {
          w.d("MicroMsg.AutoGetBigImgLogic", "running to long in blackground");
          GMTrace.o(3531134205952L, 26309);
          return;
        }
        if ((locala.gGn != 0L) || (locala.gGm.size() <= 0) || (locala.gGr != 0) || (locala.gGs))
        {
          w.d("MicroMsg.AutoGetBigImgLogic", "curMsgId: " + locala.gGn + " size: " + locala.gGm.size() + " cnt: " + locala.gGr + " pauseOnMonitor: " + locala.gGs);
          GMTrace.o(3531134205952L, 26309);
          return;
        }
        d locald;
        synchronized (locala.gGm)
        {
          locala.gGn = ((Long)locala.gGm.pop()).longValue();
          ??? = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(locala.gGn);
          locald = n.IZ().ap(???.field_msgSvrId);
          if (locald.fwA == 1)
          {
            w.d("MicroMsg.AutoGetBigImgLogic", locala.gGn + " already has hd thumb");
            locala.gGn = 0L;
            locala.start();
            GMTrace.o(3531134205952L, 26309);
            return;
          }
        }
        w.d("MicroMsg.AutoGetBigImgLogic", "start download cdnautostart " + locala1.gGn + "  image_" + ???.field_msgId);
        g.Gk().gzL.add("image_" + ???.field_msgId);
        n.Ja().a(locald.gGR, ???.field_msgId, 0, Long.valueOf(locala1.gGn), locala1.gGo, locala1);
      }
      GMTrace.o(3531134205952L, 26309);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */