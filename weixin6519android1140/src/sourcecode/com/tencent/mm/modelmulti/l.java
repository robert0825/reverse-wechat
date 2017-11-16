package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.booter.f;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.w.a;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.lang.reflect.Method;
import java.util.LinkedList;
import junit.framework.Assert;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected static int cbU;
  private static boolean gMN;
  private static int gMQ;
  public String TAG;
  private String eAR;
  private int errCode;
  private int errType;
  private com.tencent.mm.ad.e fUd;
  public boolean gLX;
  private int gLZ;
  public s gMM;
  private boolean gMO;
  private aj gMP;
  public int gMR;
  private boolean gMS;
  public String gMT;
  public w.b gMU;
  public long gMV;
  private g.a gMa;
  private long gMc;
  public boolean gMd;
  private aj gsj;
  
  static
  {
    GMTrace.i(13432510218240L, 100080);
    cbU = 7;
    gMN = false;
    gMQ = 0;
    GMTrace.o(13432510218240L, 100080);
  }
  
  public l(int paramInt)
  {
    GMTrace.i(13429557428224L, 100058);
    this.TAG = "MicroMsg.NetSceneSync";
    this.errType = 0;
    this.errCode = 0;
    this.eAR = "";
    this.gMM = null;
    this.gMO = false;
    this.gLZ = 0;
    this.gsj = null;
    this.gMP = null;
    this.gMc = -1L;
    this.gMd = false;
    this.gMS = false;
    this.gLX = false;
    this.gMT = "";
    this.gMU = null;
    this.gMV = 0L;
    this.TAG = (this.TAG + "[" + hashCode() + "]");
    w.i(this.TAG, "dkpush NetSceneSync scene:%d stack:%s", new Object[] { Integer.valueOf(paramInt), bg.bQW() });
    this.gMT = ah.bQk();
    this.gMa = new g.a();
    if (this.gMM == null) {
      this.gMM = new s();
    }
    this.gMM.gOG = paramInt;
    com.tencent.mm.kernel.h.xz();
    if ((com.tencent.mm.kernel.h.xy() != null) && (com.tencent.mm.kernel.h.xw().wL()))
    {
      com.tencent.mm.kernel.h.xz();
      if ((com.tencent.mm.kernel.h.xy().xh() != null) && (!com.tencent.mm.kernel.a.wF()))
      {
        com.tencent.mm.kernel.h.xz();
        long l = bg.a((Long)com.tencent.mm.kernel.h.xy().xh().get(8196, null), 0L);
        if (l != 0L)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(8196, Long.valueOf(0L));
          int i = (int)(l | cbU);
          cbU = i;
          cbU = i & 0x5F;
        }
      }
    }
    if (paramInt == 1) {
      gMN = true;
    }
    if (paramInt == 1010)
    {
      cbU |= 0x10;
      gMN = true;
      this.gMR = 7;
    }
    for (;;)
    {
      if (gMQ == 0) {
        JA();
      }
      GMTrace.o(13429557428224L, 100058);
      return;
      if (paramInt == 1011)
      {
        cbU |= 0x40;
        gMN = true;
        this.gMR = 7;
      }
      else if (paramInt == 3)
      {
        cbU |= 0x40000;
        gMN = true;
        this.gMR = 3;
        w.i(this.TAG, "summerbadcr NetSceneSync aiScene[%d], selector[%d], syncScene[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(cbU), Integer.valueOf(this.gMR) });
      }
      else
      {
        this.gMR = paramInt;
      }
    }
  }
  
  public l(final w.b paramb, int paramInt, long paramLong)
  {
    this(8);
    GMTrace.i(13429691645952L, 100059);
    this.gMT = ah.bQk();
    w.i(this.TAG, "dkpush NOTIFYDATA resp size:%d pushSyncFlag:%d  recvTime:%d", new Object[] { Long.valueOf(paramb.tKr), Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    this.gLZ = paramInt;
    this.gMc = paramLong;
    this.gsj = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13429423210496L, 100057);
        l.this.gMd = true;
        l.a locala = new l.a(paramb);
        com.tencent.mm.plugin.report.d.oqe.a(99L, 230L, 1L, false);
        l.this.a(-1, 0, 0, "", locala, null);
        GMTrace.o(13429423210496L, 100057);
        return false;
      }
    }, false);
    if (gMQ == 0) {
      JA();
    }
    GMTrace.o(13429691645952L, 100059);
  }
  
  private boolean JA()
  {
    GMTrace.i(13430899605504L, 100068);
    Object localObject2 = new PInt();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    final Object localObject1 = f.a((PInt)localObject2, com.tencent.mm.kernel.a.ww());
    String str = this.TAG;
    int j = ((PInt)localObject2).value;
    int k = hashCode();
    if (localObject1 != null) {}
    for (int i = localObject1.length;; i = 0)
    {
      w.i(str, "dealWithRespData index:%d, hashcode:%d, buf.len:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
      gMQ = ((PInt)localObject2).value;
      if ((((PInt)localObject2).value != 0) && (!bg.bq((byte[])localObject1))) {
        break;
      }
      gMQ = 0;
      GMTrace.o(13430899605504L, 100068);
      return false;
    }
    localObject2 = new w.b();
    try
    {
      ((w.b)localObject2).y((byte[])localObject1);
      localObject1 = new a((w.b)localObject2);
      this.gMP = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(13446468861952L, 100184);
          l.this.gMd = true;
          com.tencent.mm.plugin.report.d.oqe.a(99L, 231L, 1L, false);
          l.this.a(-1, 0, 0, "", localObject1, null);
          GMTrace.o(13446468861952L, 100184);
          return false;
        }
      }, false);
      GMTrace.o(13430899605504L, 100068);
      return true;
    }
    catch (Exception localException)
    {
      com.tencent.mm.plugin.report.d.oqe.a(99L, 226L, 1L, false);
      w.e(this.TAG, "dealWithRespData SyncResp fromProtoBuf failed");
      i = gMQ;
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      f.ay(i, com.tencent.mm.kernel.a.ww());
      gMQ = 0;
      GMTrace.o(13430899605504L, 100068);
      return false;
    }
    catch (Error localError)
    {
      long l1 = Runtime.getRuntime().freeMemory() / 1000L;
      long l2 = Runtime.getRuntime().totalMemory() / 1000L;
      w.i(this.TAG, "dealWithRespData memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1) });
      Assert.assertTrue("dealWithRespData error", false);
      GMTrace.o(13430899605504L, 100068);
    }
    return false;
  }
  
  private boolean JB()
  {
    GMTrace.i(13431302258688L, 100071);
    try
    {
      boolean bool = ((Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)ab.getContext().getSystemService("power"), new Object[0])).booleanValue();
      GMTrace.o(13431302258688L, 100071);
      return bool;
    }
    catch (Exception localException)
    {
      w.e(this.TAG, "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { Boolean.valueOf(true), bg.f(localException) });
      GMTrace.o(13431302258688L, 100071);
    }
    return true;
  }
  
  public final boolean DE()
  {
    GMTrace.i(13429960081408L, 100061);
    GMTrace.o(13429960081408L, 100061);
    return true;
  }
  
  public final boolean DF()
  {
    int i = 1;
    GMTrace.i(13430362734592L, 100064);
    boolean bool = super.DF();
    com.tencent.mm.plugin.report.d locald;
    if (bool)
    {
      com.tencent.mm.plugin.report.d.oqe.a(99L, 228L, 1L, false);
      locald = com.tencent.mm.plugin.report.d.oqe;
      if (!com.tencent.mm.sdk.a.b.foreground) {
        break label132;
      }
    }
    for (;;)
    {
      locald.i(12063, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), "9999" });
      GMTrace.o(13430362734592L, 100064);
      return bool;
      label132:
      i = 2;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13430765387776L, 100067);
    if (m.JC())
    {
      gMQ = 0;
      w.e(this.TAG, "dkinit never do sync before init done");
      GMTrace.o(13430765387776L, 100067);
      return -1;
    }
    this.fUd = parame1;
    if (this.gMM == null) {
      this.gMM = new s();
    }
    this.gMM.gOF = com.tencent.mm.sdk.a.b.foreground;
    if (this.gMP != null)
    {
      w.i(this.TAG, "pushSyncRespHandler not null");
      c(parame);
      this.gMP.z(0L, 0L);
      GMTrace.o(13430765387776L, 100067);
      return 0;
    }
    if (gMQ > 0)
    {
      w.w(this.TAG, "other sync is dealing with resp data :%d", new Object[] { Integer.valueOf(gMQ) });
      GMTrace.o(13430765387776L, 100067);
      return -1;
    }
    if (this.gsj != null)
    {
      w.i(this.TAG, "pusher not null");
      c(parame);
      this.gsj.z(0L, 0L);
      GMTrace.o(13430765387776L, 100067);
      return 0;
    }
    parame1 = new a();
    aqj localaqj = ((w.a)parame1.DC()).tKT;
    if (this.gMR == 3)
    {
      localaqj.uGF = 1;
      if (!this.gMS) {
        break label401;
      }
    }
    label401:
    for (int i = 6;; i = this.gMR)
    {
      this.gMR = i;
      localaqj.tZz = cbU;
      com.tencent.mm.kernel.h.xz();
      byte[] arrayOfByte = bg.St(bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, new byte[0])));
      localaqj.tZA = com.tencent.mm.platformtools.n.H(arrayOfByte);
      localaqj.tOG = this.gMR;
      localaqj.uGE = new nl();
      localaqj.tSz = com.tencent.mm.protocal.d.DEVICE_TYPE;
      w.i(this.TAG, "doScene Selector:%d Scene:%d key[%s]", new Object[] { Integer.valueOf(localaqj.tZz), Integer.valueOf(localaqj.tOG), ad.bd(arrayOfByte) });
      gMN = false;
      i = a(parame, parame1, this);
      GMTrace.o(13430765387776L, 100067);
      return i;
      localaqj.uGF = 0;
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13430228516864L, 100063);
    int i = k.b.gum;
    GMTrace.o(13430228516864L, 100063);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13431033823232L, 100069);
    if ((paramq == null) || (paramq.getType() != 138))
    {
      paramString = this.TAG;
      if (paramq == null) {}
      for (paramInt1 = -2;; paramInt1 = paramq.getType())
      {
        w.e(paramString, "onGYNetEnd error type:%d", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(13431033823232L, 100069);
        return;
      }
    }
    w.b localb = (w.b)paramq.AZ();
    paramArrayOfByte = this.TAG;
    long l = this.gMa.tD();
    boolean bool = this.gMd;
    if (localb.tKU.tZD == null)
    {
      paramInt1 = -1;
      w.i(paramArrayOfByte, "onGYNetEnd:[%d,%d,%s] time:%d  isnotifydata:%b count:%d pusher:%s pushSyncRespHandler:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(l), Boolean.valueOf(bool), Integer.valueOf(paramInt1), this.gsj, this.gMP });
      if (localb.tKU.tZD != null) {
        break label390;
      }
      paramInt1 = -1;
      label211:
      if (paramInt1 <= 0) {
        break label405;
      }
      paramInt1 = 1;
      label217:
      if (JB()) {
        break label418;
      }
      paramArrayOfByte = com.tencent.mm.plugin.report.d.oqe;
      if (paramInt1 == 0) {
        break label410;
      }
      l = 221L;
      label238:
      paramArrayOfByte.a(99L, l, 1L, false);
      this.gsj = null;
      this.gMO = true;
      if ((paramInt2 != 4) || (paramInt3 != 63530)) {
        break label875;
      }
      bool = true;
      paramInt2 = 0;
      paramInt3 = 0;
      com.tencent.mm.plugin.report.d.oqe.a(99L, 227L, 1L, false);
    }
    for (;;)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (this.gMU != null)
        {
          w.i(this.TAG, "oreh sync mIRH.processingResp is not null, and simulate not continue");
          this.errType = paramInt2;
          this.errCode = paramInt3;
          this.eAR = paramString;
          ((w.b)paramq.AZ()).tKU.tXv = 0;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.d.oqe.a(99L, 232L, 1L, false);
          GMTrace.o(13431033823232L, 100069);
          return;
          paramInt1 = localb.tKU.tZD.jhc;
          break;
          label390:
          paramInt1 = localb.tKU.tZD.jhc;
          break label211;
          label405:
          paramInt1 = 0;
          break label217;
          label410:
          l = 218L;
          break label238;
          label418:
          if (!com.tencent.mm.sdk.a.b.foreground)
          {
            paramArrayOfByte = com.tencent.mm.plugin.report.d.oqe;
            if (paramInt1 != 0) {}
            for (l = 220L;; l = 217L)
            {
              paramArrayOfByte.a(99L, l, 1L, false);
              break;
            }
          }
          paramArrayOfByte = com.tencent.mm.plugin.report.d.oqe;
          if (paramInt1 != 0) {}
          for (l = 219L;; l = 216L)
          {
            paramArrayOfByte.a(99L, l, 1L, false);
            break;
          }
          this.fUd.a(paramInt2, paramInt3, paramString, this);
        }
      }
      com.tencent.mm.plugin.report.d.oqe.a(99L, 233L, 1L, false);
      paramArrayOfByte = com.tencent.mm.platformtools.n.a(((w.a)paramq.DC()).tKT.tZA);
      paramq = com.tencent.mm.platformtools.n.a(localb.tKU.tZA);
      w.i(this.TAG, "onGYNetEnd replace key:%b req :%s", new Object[] { Boolean.valueOf(bool), ad.bd(paramArrayOfByte) });
      w.i(this.TAG, "onGYNetEnd replace key:%b resp:%s", new Object[] { Boolean.valueOf(bool), ad.bd(paramq) });
      if (!bool)
      {
        paramString = paramArrayOfByte;
        if (bg.bq(paramArrayOfByte))
        {
          com.tencent.mm.kernel.h.xz();
          paramString = bg.St(bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, new byte[0])));
          w.d(this.TAG, "dkpush userinfo key : %d[%s]", new Object[] { Integer.valueOf(paramString.length), bg.bp(paramString) });
        }
        paramArrayOfByte = ad.g(paramString, paramq);
        if (paramArrayOfByte != null)
        {
          paramString = paramArrayOfByte;
          if (paramArrayOfByte.length > 0) {}
        }
        else
        {
          w.w(this.TAG, "merge key failed, use server side instead");
          paramString = paramq;
        }
        localb.tKU.tZA = com.tencent.mm.platformtools.n.H(paramString);
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw().aG(localb.tKU.jhA, localb.tKU.uGG);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      com.tencent.mm.kernel.a.ff(localb.tKU.jhA);
      if (this.gMU == null) {}
      for (bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.gMU = localb;
        this.gMV = bg.Pv();
        new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
        {
          private int gMY;
          private long gMZ;
          private int gNa;
          
          public final boolean pM()
          {
            GMTrace.i(13437342056448L, 100116);
            Object localObject2 = new c();
            if (!com.tencent.mm.kernel.h.xw().wL())
            {
              w.e(l.this.TAG, "syncRespHandler acc is not ready STOP :%s", new Object[] { l.this.gMU });
              l.this.gMU = null;
              GMTrace.o(13437342056448L, 100116);
              return false;
            }
            if (l.this.gLX)
            {
              ((c)localObject2).be(l.this);
              l.this.gMU = null;
              GMTrace.o(13437342056448L, 100116);
              return false;
            }
            if ((l.this.gMU == null) || (l.this.gMU.tKU.tZD == null) || (l.this.gMU.tKU.tZD.jhd == null))
            {
              w.e(l.this.TAG, "syncRespHandler CmdList is null! Stop Processing :%s", new Object[] { l.this.gMU });
              ((c)localObject2).be(l.this);
              l.this.gMU = null;
              GMTrace.o(13437342056448L, 100116);
              return false;
            }
            Object localObject1 = l.this.gMU.tKU.tZD.jhd;
            ((c)localObject2).bc(l.this);
            this.gNa += 1;
            long l1 = bg.Pv();
            int i = 0;
            while (i < 5)
            {
              if (this.gMY < ((LinkedList)localObject1).size())
              {
                w.v(l.this.TAG, "syncRespHandler i:%d curidx:%d size:%d cmdid:%d cmdbuf:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.gMY), Integer.valueOf(((LinkedList)localObject1).size()), Integer.valueOf(((nk)((LinkedList)localObject1).get(this.gMY)).uei), Integer.valueOf(((nk)((LinkedList)localObject1).get(this.gMY)).uej.uNN) });
                ((LinkedList)localObject1).size();
                if (!((c)localObject2).a((nk)((LinkedList)localObject1).get(this.gMY), false)) {
                  w.w(l.this.TAG, "DoCmd Failed index:%d", new Object[] { Integer.valueOf(this.gMY) });
                }
                this.gMY += 1;
              }
              if (this.gMY >= ((LinkedList)localObject1).size())
              {
                this.gMZ += bg.aH(l1);
                l2 = bg.aH(l.this.gMV);
                w.i(l.this.TAG, "syncRespHandler process DONE idx:%d size:%d time[%d,%d] count:%d %s", new Object[] { Integer.valueOf(this.gMY), Integer.valueOf(((LinkedList)localObject1).size()), Long.valueOf(l2), Long.valueOf(this.gMZ), Integer.valueOf(this.gNa), l.this.gMU });
                l.this.a(l.this.gMU);
                ((c)localObject2).bd(l.this);
                i = bg.e((Integer)com.tencent.mm.plugin.report.d.a((int)this.gMZ, new int[] { 100, 300, 1000, 3000 }, new Integer[] { Integer.valueOf(240), Integer.valueOf(239), Integer.valueOf(238), Integer.valueOf(237), Integer.valueOf(236) }));
                com.tencent.mm.plugin.report.d.oqe.a(99L, i, 1L, false);
                i = bg.e((Integer)com.tencent.mm.plugin.report.d.a(((LinkedList)localObject1).size(), new int[] { 0, 1, 2, 3, 5, 10 }, new Integer[] { Integer.valueOf(249), Integer.valueOf(248), Integer.valueOf(247), Integer.valueOf(246), Integer.valueOf(245), Integer.valueOf(244), Integer.valueOf(243) }));
                com.tencent.mm.plugin.report.d.oqe.a(99L, i, 1L, false);
                localObject2 = com.tencent.mm.plugin.report.d.oqe;
                int j;
                int k;
                int m;
                int n;
                if (com.tencent.mm.sdk.a.b.foreground)
                {
                  l1 = 241L;
                  ((com.tencent.mm.plugin.report.d)localObject2).a(99L, l1, 1L, false);
                  com.tencent.mm.plugin.report.d.oqe.a(99L, l.this.gMR, 1L, false);
                  com.tencent.mm.plugin.report.d.oqe.a(99L, 0L, 1L, false);
                  localObject2 = com.tencent.mm.plugin.report.d.oqe;
                  j = ((LinkedList)localObject1).size();
                  k = l.this.gMR;
                  m = l.this.gMU.tKU.tXv;
                  l1 = this.gMZ;
                  n = this.gNa;
                  localObject1 = l.this.gMT;
                  if (!com.tencent.mm.sdk.a.b.foreground) {
                    break label1005;
                  }
                }
                label1005:
                for (i = 1;; i = 2)
                {
                  ((com.tencent.mm.plugin.report.d)localObject2).i(12063, new Object[] { Integer.valueOf(j), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l1), Integer.valueOf(n), localObject1, Integer.valueOf(i) });
                  l.this.gMU = null;
                  GMTrace.o(13437342056448L, 100116);
                  return false;
                  l1 = 242L;
                  break;
                }
              }
              long l2 = bg.aH(l1);
              if (l2 > 500L)
              {
                w.d(l.this.TAG, "syncRespHandler PAUSE by 500ms  time:%d  processcount:%d sum:%d ,%s", new Object[] { Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(this.gMY), l.this.gMU });
                this.gMZ += bg.aH(l1);
                GMTrace.o(13437342056448L, 100116);
                return true;
              }
              i += 1;
            }
            this.gMZ += bg.aH(l1);
            GMTrace.o(13437342056448L, 100116);
            return true;
          }
        }, true).z(50L, 50L);
        GMTrace.o(13431033823232L, 100069);
        return;
      }
      label875:
      bool = false;
    }
  }
  
  protected final void a(w.b paramb)
  {
    GMTrace.i(15700924039168L, 116981);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().set(8195, bg.bs(com.tencent.mm.platformtools.n.a(paramb.tKU.tZA)));
    ab.getContext().getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", bg.bs(com.tencent.mm.platformtools.n.a(paramb.tKU.tZA))).commit();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().set(8196, Long.valueOf(paramb.tKU.tXv));
    boolean bool;
    Object localObject;
    if (((paramb.tKU.tXv & cbU) != 0) && (!super.DF()))
    {
      bool = true;
      w.i(this.TAG, "canContinue cont:%b ContinueFlag:%d selector:%d securityLimitCountReach:%b", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramb.tKU.tXv), Integer.valueOf(cbU), Boolean.valueOf(super.DF()) });
      if ((!bool) && ((paramb.tKU.tXv & 0x100) != 0))
      {
        localObject = new pz();
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
      localObject = com.tencent.mm.plugin.report.d.oqe;
      if (!bool) {
        break label371;
      }
    }
    label371:
    for (long l = 234L;; l = 235L)
    {
      ((com.tencent.mm.plugin.report.d)localObject).a(99L, l, 1L, false);
      w.i(this.TAG, "onRespHandled continueFlag:%d isNotifyData:%b conCont:%b notifyPending:%b pushSyncFlag:%d isContinueScene:%b respHandler:%s ", new Object[] { Integer.valueOf(paramb.tKU.tXv), Boolean.valueOf(this.gMd), Boolean.valueOf(bool), Boolean.valueOf(gMN), Integer.valueOf(this.gLZ), Boolean.valueOf(this.gMS), this.gMP });
      if ((this.gMd) || (!bool)) {
        break label379;
      }
      this.gMS = true;
      a(this.gtW, this.fUd);
      GMTrace.o(15700924039168L, 116981);
      return;
      bool = false;
      break;
    }
    label379:
    int i;
    if (gMN)
    {
      w.i(this.TAG, "dkpush new notify pending, sync now");
      if (gMQ != 0)
      {
        i = gMQ;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xw();
        f.ay(i, com.tencent.mm.kernel.a.ww());
      }
      gMQ = 0;
      this.gMP = null;
      gMN = false;
      this.gMS = true;
      a(this.gtW, this.fUd);
      GMTrace.o(15700924039168L, 116981);
      return;
    }
    if (this.gMP != null)
    {
      i = gMQ;
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xw();
      f.ay(i, com.tencent.mm.kernel.a.ww());
      this.gMP = null;
      JA();
      a(this.gtW, this.fUd);
      GMTrace.o(15700924039168L, 116981);
      return;
    }
    if ((this.gLZ & 0x1) > 0)
    {
      com.tencent.mm.kernel.h.xz();
      paramb = bg.St(bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(8195, null)));
      com.tencent.mm.kernel.h.wS().a(new h(this.gMc, paramb), 0);
    }
    w.d(this.TAG, "sync or init end: reset selector : now = " + cbU + " default = 7");
    cbU = 7;
    this.fUd.a(this.errType, this.errCode, this.eAR, this);
    GMTrace.o(15700924039168L, 116981);
  }
  
  protected final boolean a(com.tencent.mm.ad.k paramk)
  {
    boolean bool = true;
    GMTrace.i(13429825863680L, 100060);
    if (!(paramk instanceof l))
    {
      GMTrace.o(13429825863680L, 100060);
      return false;
    }
    paramk = (l)paramk;
    if ((!paramk.gMO) && (gMN))
    {
      w.e(this.TAG, "old not busy and notified, maybe cancel old scene, last dispatch=%d", new Object[] { Long.valueOf(paramk.gtX) });
      if (bg.aI(paramk.gtX) > 360000L) {}
      while (bool)
      {
        w.i(this.TAG, "summerworker NetSceneSync timeout");
        paramk = com.tencent.mm.kernel.h.xB().bQi().findTaskByRunTime(0L);
        if (paramk == null) {
          break;
        }
        w.e(this.TAG, "summerworker worker is just blocked by task: " + ae.dump(paramk, false));
        GMTrace.o(13429825863680L, 100060);
        return false;
        bool = false;
      }
      GMTrace.o(13429825863680L, 100060);
      return bool;
    }
    GMTrace.o(13429825863680L, 100060);
    return false;
  }
  
  protected final void cancel()
  {
    GMTrace.i(13430631170048L, 100066);
    super.cancel();
    com.tencent.mm.plugin.report.d.oqe.a(99L, 229L, 1L, false);
    this.gLX = true;
    GMTrace.o(13430631170048L, 100066);
  }
  
  public final int getType()
  {
    GMTrace.i(13430496952320L, 100065);
    GMTrace.o(13430496952320L, 100065);
    return 138;
  }
  
  protected final int vB()
  {
    GMTrace.i(13430094299136L, 100062);
    GMTrace.o(13430094299136L, 100062);
    return 100;
  }
  
  public static final class a
    extends i
  {
    private final w.a gMg;
    private final w.b gMh;
    private final boolean gMi;
    
    public a()
    {
      GMTrace.i(13449153216512L, 100204);
      this.gMg = new w.a();
      this.gMh = new w.b();
      this.gMi = false;
      GMTrace.o(13449153216512L, 100204);
    }
    
    public a(w.b paramb)
    {
      GMTrace.i(13449287434240L, 100205);
      this.gMg = new w.a();
      this.gMh = paramb;
      this.gMi = true;
      GMTrace.o(13449287434240L, 100205);
    }
    
    public final k.d AY()
    {
      GMTrace.i(13449421651968L, 100206);
      w.a locala = this.gMg;
      GMTrace.o(13449421651968L, 100206);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13449555869696L, 100207);
      w.b localb = this.gMh;
      GMTrace.o(13449555869696L, 100207);
      return localb;
    }
    
    public final int getType()
    {
      GMTrace.i(13449690087424L, 100208);
      GMTrace.o(13449690087424L, 100208);
      return 138;
    }
    
    public final String getUri()
    {
      GMTrace.i(13449824305152L, 100209);
      GMTrace.o(13449824305152L, 100209);
      return "/cgi-bin/micromsg-bin/newsync";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */