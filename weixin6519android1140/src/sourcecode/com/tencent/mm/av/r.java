package com.tencent.mm.av;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.lg.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.aru;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.arx;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class r
  implements com.tencent.mm.ad.e, d
{
  private final int gFD;
  public aj gFF;
  public f<Integer, Integer> gFy;
  public j gPE;
  public boolean gsb;
  long gsm;
  
  public r(j paramj)
  {
    GMTrace.i(13183804768256L, 98227);
    this.gsb = false;
    this.gFy = new f(200);
    this.gsm = 0L;
    this.gFD = 500;
    this.gFF = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13184475856896L, 98232);
        w.d("MicroMsg.OplogService", "summeroplog pusherTry onTimerExpired tryStartNetscene");
        r localr = r.this;
        long l = bg.Pv();
        if ((localr.gsb) && (l - localr.gsm > 10000L)) {
          localr.gsb = false;
        }
        if (localr.gsb) {
          w.d("MicroMsg.OplogService", "summeroplog tryStartNetscene netSceneRunning, return.");
        }
        for (;;)
        {
          GMTrace.o(13184475856896L, 98232);
          return false;
          Object localObject = localr.gPE;
          ArrayList localArrayList = new ArrayList();
          localObject = ((j)localObject).goN.a("select oplog2.id,oplog2.inserTime,oplog2.cmdId,oplog2.buffer,oplog2.reserved1,oplog2.reserved2,oplog2.reserved3,oplog2.reserved4 from oplog2  order by inserTime asc limit ?", new String[] { "200" }, 0);
          if (localObject == null) {}
          for (;;)
          {
            if (localArrayList.size() != 0) {
              break label310;
            }
            w.d("MicroMsg.OplogService", "summeroplog tryStartNetscene list null ret");
            break;
            int j = ((Cursor)localObject).getCount();
            if (j > 0)
            {
              int i = 0;
              while (i < j)
              {
                ((Cursor)localObject).moveToPosition(i);
                e.b localb = new e.b(0);
                localb.id = ((Cursor)localObject).getInt(0);
                localb.gFw = ((Cursor)localObject).getLong(1);
                localb.cmdId = ((Cursor)localObject).getInt(2);
                localb.buffer = ((Cursor)localObject).getBlob(3);
                localb.mVf = ((Cursor)localObject).getInt(4);
                localb.mVg = ((Cursor)localObject).getLong(4);
                localb.mVh = ((Cursor)localObject).getString(4);
                localb.mVi = ((Cursor)localObject).getString(4);
                localArrayList.add(localb);
                i += 1;
              }
            }
            ((Cursor)localObject).close();
          }
          label310:
          if ((!localr.gsb) && (localArrayList.size() > 0))
          {
            localr.gsm = l;
            localr.gsb = true;
            h.xz();
            h.xx().fYr.a(new a(localArrayList), 0);
          }
          w.d("MicroMsg.OplogService", "summeroplog tryStartNetscene ret ok lastNetscene: %d,  netSceneRunning:%B, take:%d ms. ", new Object[] { Long.valueOf(localr.gsm), Boolean.valueOf(localr.gsb), Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      
      public final String toString()
      {
        GMTrace.i(13184610074624L, 98233);
        String str = super.toString() + "|pusherTry";
        GMTrace.o(13184610074624L, 98233);
        return str;
      }
    }, false);
    this.gPE = paramj;
    h.xz();
    h.xx().fYr.a(681, this);
    GMTrace.o(13183804768256L, 98227);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(13184207421440L, 98230);
    w.i("MicroMsg.OplogService", "oplog onsceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk.getType() != 681)
    {
      GMTrace.o(13184207421440L, 98230);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0) || (((a)paramk).gPi == null))
    {
      w.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd errType:%d, errCode:%d, rr:%s not retry", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ((a)paramk).gPi.toString() });
      this.gsb = false;
      GMTrace.o(13184207421440L, 98230);
      return;
    }
    arw localarw = ((a.c)((a)paramk).gPi.gPl).gPn;
    if ((localarw.tST != 0) || (localarw.uHQ == null) || (localarw.uHQ.uqm == null))
    {
      w.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", new Object[] { Integer.valueOf(localarw.tST) });
      this.gsb = false;
      GMTrace.o(13184207421440L, 98230);
      return;
    }
    lg locallg = new lg();
    locallg.ePA.ret = ((Integer)localarw.uHQ.uqm.getLast()).intValue();
    LinkedList localLinkedList = localarw.uHQ.uHR;
    lg.a locala = locallg.ePA;
    if (localLinkedList.isEmpty())
    {
      paramString = "";
      locala.ePB = paramString;
      locala = locallg.ePA;
      if (!localLinkedList.isEmpty()) {
        break label372;
      }
    }
    label372:
    for (paramString = "";; paramString = ((aru)localLinkedList.getLast()).nIp)
    {
      locala.ePC = paramString;
      com.tencent.mm.sdk.b.a.vgX.m(locallg);
      new a(((a)paramk).gPj, localarw.uHQ.uqm).z(50L, 50L);
      GMTrace.o(13184207421440L, 98230);
      return;
      paramString = ((aru)localLinkedList.getLast()).eBt;
      break;
    }
  }
  
  public final void b(e.b paramb)
  {
    GMTrace.i(13183938985984L, 98228);
    int i;
    if (paramb != null)
    {
      int j = paramb.getCmdId();
      if (paramb.getBuffer() == null)
      {
        i = -1;
        w.i("MicroMsg.OplogService", "summeroplog dealWith option cmdId= %d, buf len:%d, stack=%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), bg.bQW() });
        paramb.gFw = bg.Pv();
        j localj = this.gPE;
        if (paramb != null)
        {
          paramb.eQl = -1;
          ContentValues localContentValues = new ContentValues();
          if ((paramb.eQl & 0x2) != 0) {
            localContentValues.put("inserTime", Long.valueOf(paramb.gFw));
          }
          if ((paramb.eQl & 0x4) != 0) {
            localContentValues.put("cmdId", Integer.valueOf(paramb.getCmdId()));
          }
          if ((paramb.eQl & 0x8) != 0) {
            localContentValues.put("buffer", paramb.getBuffer());
          }
          if ((paramb.eQl & 0x10) != 0) {
            localContentValues.put("reserved1", Integer.valueOf(paramb.mVf));
          }
          if ((paramb.eQl & 0x20) != 0) {
            localContentValues.put("reserved2", Long.valueOf(paramb.mVg));
          }
          if ((paramb.eQl & 0x40) != 0) {
            localContentValues.put("reserved3", paramb.mVh);
          }
          if ((paramb.eQl & 0x80) != 0) {
            localContentValues.put("reserved4", paramb.mVi);
          }
          i = (int)localj.goN.insert("oplog2", "id", localContentValues);
          if (i > 0) {
            paramb.id = i;
          }
        }
      }
    }
    for (;;)
    {
      this.gFF.z(0L, 0L);
      GMTrace.o(13183938985984L, 98228);
      return;
      i = paramb.getBuffer().length;
      break;
      w.i("MicroMsg.OplogService", "summeroplog dealWith option null");
    }
  }
  
  public final void c(e.b paramb)
  {
    GMTrace.i(13184073203712L, 98229);
    h.xz();
    long l = h.xy().fYV.cE(Thread.currentThread().getId());
    this.gPE.a(paramb);
    h.xz();
    h.xy().fYV.aL(l);
    GMTrace.o(13184073203712L, 98229);
  }
  
  private final class a
    extends aj
  {
    public a(final LinkedList<Integer> paramLinkedList)
    {
      super(new aj.a()
      {
        private int gMu;
        private int gPG;
        
        public final boolean pM()
        {
          int j = 0;
          GMTrace.i(13183536332800L, 98225);
          int k = paramLinkedList.size();
          int m = localLinkedList.size();
          int i;
          Object localObject;
          if (k < m)
          {
            i = k;
            if (k != m) {
              w.w("MicroMsg.OplogService", "summeroplog oplogSize[%d] not equal to resultSize[%d]! now size[%d] respIndex[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.gMu) });
            }
            localObject = new ArrayList();
            if (this.gMu < i) {
              break label176;
            }
            r.a.this.gsb = false;
            if (this.gPG > 0)
            {
              localObject = r.a.this.gFF;
              if (r.a.this.gFy.size() <= 0) {
                break label170;
              }
            }
          }
          label170:
          for (long l = 500L;; l = 0L)
          {
            ((aj)localObject).z(l, l);
            GMTrace.o(13183536332800L, 98225);
            return false;
            i = m;
            break;
          }
          label176:
          k = this.gMu + 20;
          if (k > i) {}
          for (;;)
          {
            if (this.gMu < i)
            {
              k = ((Integer)localLinkedList.get(this.gMu)).intValue();
              e.b localb = (e.b)paramLinkedList.get(this.gMu);
              m = localb.id;
              w.d("MicroMsg.OplogService", "summeroplog id:%d, cmd:%d, result:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(localb.getCmdId()), Integer.valueOf(k) });
              if (k == 0)
              {
                this.gPG += 1;
                ((List)localObject).add(localb);
                r.a.this.gFy.remove(Integer.valueOf(m));
              }
              for (;;)
              {
                this.gMu += 1;
                break;
                if (k == 65103)
                {
                  w.e("MicroMsg.OplogService", "oplog not yet process, id:%d, cmd:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(localb.getCmdId()) });
                }
                else
                {
                  Integer localInteger = (Integer)r.a.this.gFy.get(Integer.valueOf(m));
                  w.d("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", new Object[] { Integer.valueOf(m), Long.valueOf(localb.gFw), localInteger });
                  if (localInteger == null)
                  {
                    r.a.this.gFy.m(Integer.valueOf(m), Integer.valueOf(1));
                  }
                  else if (localInteger.intValue() < 2)
                  {
                    r.a.this.gFy.m(Integer.valueOf(m), Integer.valueOf(localInteger.intValue() + 1));
                  }
                  else
                  {
                    w.d("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", new Object[] { Integer.valueOf(m), Long.valueOf(localb.gFw) });
                    ((List)localObject).add(localb);
                  }
                }
              }
            }
            k = ((List)localObject).size();
            if (k > 0)
            {
              h.xz();
              l = h.xy().fYV.cE(Thread.currentThread().getId());
              i = j;
              while (i < k)
              {
                r.a.this.gPE.a((e.b)((List)localObject).get(i));
                i += 1;
              }
              h.xz();
              h.xy().fYV.aL(l);
            }
            GMTrace.o(13183536332800L, 98225);
            return true;
            i = k;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(13183670550528L, 98226);
          String str = super.toString() + "|RespHandler";
          GMTrace.o(13183670550528L, 98226);
          return str;
        }
      }, true);
      GMTrace.i(13185952251904L, 98243);
      GMTrace.o(13185952251904L, 98243);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */