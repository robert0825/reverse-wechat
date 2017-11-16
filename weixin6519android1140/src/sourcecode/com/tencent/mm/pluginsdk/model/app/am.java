package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class am
{
  public static final class a
    implements com.tencent.mm.ad.e
  {
    public static int ezb;
    Queue<Long> eyU;
    Queue<Long> eyV;
    Map<Long, g.a> eyW;
    public boolean eyX;
    public boolean eyY;
    public int eyZ;
    public long eza;
    g.a ezd;
    public com.tencent.mm.sdk.platformtools.aj eze;
    public boolean running;
    public HashMap<Long, String> toM;
    
    static
    {
      GMTrace.i(801279836160L, 5970);
      ezb = 0;
      GMTrace.o(801279836160L, 5970);
    }
    
    public a()
    {
      GMTrace.i(797790175232L, 5944);
      this.toM = new HashMap();
      this.eyU = new LinkedList();
      this.eyV = new LinkedList();
      this.eyW = new HashMap();
      this.eyX = false;
      this.eyY = false;
      this.running = false;
      this.eyZ = 0;
      this.eza = 0L;
      this.ezd = new g.a();
      this.eze = new com.tencent.mm.sdk.platformtools.aj(at.xB().ngv.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(796179562496L, 5932);
          am.a.this.qG();
          GMTrace.o(796179562496L, 5932);
          return false;
        }
        
        public final String toString()
        {
          GMTrace.i(796313780224L, 5933);
          String str = super.toString() + "|scenePusher";
          GMTrace.o(796313780224L, 5933);
          return str;
        }
      }, false);
      at.wS().a(220, this);
      at.wS().a(221, this);
      at.wS().a(222, this);
      GMTrace.o(797790175232L, 5944);
    }
    
    private boolean bJF()
    {
      GMTrace.i(17854044831744L, 133023);
      for (;;)
      {
        try
        {
          localObject2 = an.afP().rawQuery("select *  , rowid  from appattach where status = 101", new String[0]);
          if (localObject2 != null) {
            continue;
          }
          localArrayList = null;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          ArrayList localArrayList;
          int j;
          int i;
          w.printErrStackTrace("MicroMsg.SceneAppMsg", localIllegalStateException, "", new Object[0]);
          Object localObject1 = an.afP();
          Object localObject2 = " update appattach set status = 198 , lastModifyTime = " + bg.Pu() + " where status = 101";
          ((c)localObject1).fTZ.eZ("appattach", (String)localObject2);
          ((c)localObject1).doNotify();
          localObject1 = null;
          continue;
          long l = System.currentTimeMillis() / 1000L;
          localObject2 = bg.eK(l);
          localObject1 = ((List)localObject1).iterator();
          if (!((Iterator)localObject1).hasNext()) {
            continue;
          }
          b localb = (b)((Iterator)localObject1).next();
          if (!this.eyW.containsKey(Long.valueOf(localb.vmr))) {
            continue;
          }
          w.d("MicroMsg.SceneAppMsg", "summerbig File is Already running:" + localb.vmr);
          continue;
          w.d("MicroMsg.SceneAppMsg", "summerbig Get file:" + localb.field_fileFullPath + " status:" + localb.field_status + " create:(" + bg.eK(localb.field_createTime) + "," + bg.eK(localb.field_createTime / 1000L) + ", last:" + bg.eK(localb.field_lastModifyTime) + " now:" + bg.eK(l) + " " + (l - localb.field_lastModifyTime));
          if (!localb.field_isUpload) {
            continue;
          }
          if ((l - localb.field_lastModifyTime <= 600L) || (localb.field_status != 101L)) {
            continue;
          }
          w.e("MicroMsg.SceneAppMsg", "summerbig time out file: " + localb.field_fileFullPath + " last:" + bg.eK(localb.field_lastModifyTime) + " now:" + (String)localObject2);
          l.et(localb.vmr);
          continue;
          this.eyU.offer(Long.valueOf(localb.vmr));
          this.eyW.put(Long.valueOf(localb.vmr), null);
          continue;
          w.d("MicroMsg.SceneAppMsg", "summerbig GetNeedRun procing:" + this.eyW.size() + " [recv:" + this.eyV.size() + ",send:" + this.eyU.size() + "]");
          if (this.eyV.size() + this.eyU.size() != 0) {
            continue;
          }
          GMTrace.o(17854044831744L, 133023);
          return false;
          GMTrace.o(17854044831744L, 133023);
        }
        if ((localArrayList != null) && (localArrayList.size() != 0)) {
          continue;
        }
        GMTrace.o(17854044831744L, 133023);
        return false;
        j = ((Cursor)localObject2).getCount();
        w.d("MicroMsg.AppAttachInfoStorage", "getUnfinishInfo resCount:" + j);
        if (j == 0)
        {
          ((Cursor)localObject2).close();
          localArrayList = null;
        }
        else
        {
          localArrayList = new ArrayList();
          i = 0;
          if (i < j)
          {
            ((Cursor)localObject2).moveToPosition(i);
            localb = new b();
            localb.b((Cursor)localObject2);
            localArrayList.add(localb);
            i += 1;
          }
          else
          {
            ((Cursor)localObject2).close();
          }
        }
      }
      return true;
    }
    
    public static void c(long paramLong, String paramString1, String paramString2)
    {
      GMTrace.i(798461263872L, 5949);
      at.wS().a(new ah(paramLong, paramString1, paramString2), 0);
      GMTrace.o(798461263872L, 5949);
    }
    
    public static void ev(long paramLong)
    {
      GMTrace.i(798192828416L, 5947);
      at.wS().a(new ah(paramLong, null, null), 0);
      GMTrace.o(798192828416L, 5947);
    }
    
    public static void u(long paramLong, String paramString)
    {
      GMTrace.i(798327046144L, 5948);
      at.wS().a(new ah(paramLong, paramString, null), 0);
      GMTrace.o(798327046144L, 5948);
    }
    
    public final void a(final int paramInt1, final int paramInt2, String paramString, final k paramk)
    {
      GMTrace.i(798595481600L, 5950);
      w.d("MicroMsg.SceneAppMsg", "summersafecdn onSceneEnd type:%d errType:%d errCode:%d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(829465559040L, 6180);
          am.a.ezb += 1;
          long l1;
          int i;
          long l2;
          Object localObject1;
          if (paramk.getType() == 222)
          {
            w.d("MicroMsg.SceneAppMsg", "onSceneEnd  SendAppMsg errtype:" + paramInt1 + " errCode:" + paramInt2);
            l1 = -1L;
            i = 0;
            long l3 = 0L;
            l2 = l3;
            if (l1 != -1L)
            {
              l2 = l3;
              if (am.a.this.eyW.get(Long.valueOf(l1)) != null)
              {
                l2 = ((g.a)am.a.this.eyW.get(Long.valueOf(l1))).tD();
                am.a.this.eyW.remove(Long.valueOf(l1));
              }
            }
            w.d("MicroMsg.SceneAppMsg", "onSceneEnd SceneType:" + paramk.getType() + " errtype:" + paramInt1 + " errCode:" + paramInt2 + " retCode:" + i + " rowid:" + l1 + " time:" + l2);
            if ((paramInt1 != 3) || (i == 0)) {
              break label699;
            }
            localObject1 = am.a.this;
            ((am.a)localObject1).eyZ -= 1;
            label260:
            w.d("MicroMsg.SceneAppMsg", "onSceneEnd  inCnt:" + am.a.ezb + " stop:" + am.a.this.eyZ + " running:" + am.a.this.running + " recving:" + am.a.this.eyX + " sending:" + am.a.this.eyY);
            if (am.a.this.eyZ <= 0) {
              break label717;
            }
            am.a.this.qG();
          }
          for (;;)
          {
            am.a.ezb -= 1;
            GMTrace.o(829465559040L, 6180);
            return;
            if (paramk.getType() == 221)
            {
              am.a.this.eyX = false;
              l1 = ((ab)paramk).tol;
              i = ((ab)paramk).retCode;
              break;
            }
            if (paramk.getType() == 220)
            {
              am.a.this.eyY = false;
              l2 = ((ak)paramk).tol;
              int j = ((ak)paramk).retCode;
              localObject1 = (ak)paramk;
              label488:
              Object localObject2;
              if (((ak)localObject1).toi == null)
              {
                localObject1 = null;
                localObject2 = (ak)paramk;
                if (((ak)localObject2).toi != null) {
                  break label637;
                }
                l1 = 0L;
                label507:
                localObject2 = (String)am.a.this.toM.remove(Long.valueOf(l1));
                if (bg.nm(((ak)paramk).gIp)) {
                  break label649;
                }
              }
              label637:
              label649:
              for (i = 1;; i = 0)
              {
                if ((i == 0) && (!bg.nm((String)localObject1)))
                {
                  b localb = new b();
                  an.afP().b(l2, localb);
                  if (localb.vmr == l2)
                  {
                    l.a(localb.field_msgInfoId, (String)localObject1, null);
                    w.d("MicroMsg.SceneAppMsg", "onSceneEnd, finish update app attach, start send app msg");
                    am.a.u(localb.field_msgInfoId, (String)localObject2);
                  }
                }
                i = j;
                l1 = l2;
                break;
                localObject1 = ((ak)localObject1).toi.field_mediaSvrId;
                break label488;
                l1 = ((ak)localObject2).toi.field_msgInfoId;
                break label507;
              }
            }
            w.e("MicroMsg.SceneAppMsg", "onSceneEnd Error SceneType:" + paramk.getType());
            am.a.ezb -= 1;
            GMTrace.o(829465559040L, 6180);
            return;
            label699:
            if (paramInt1 == 0) {
              break label260;
            }
            am.a.this.eyZ = 0;
            break label260;
            label717:
            if ((!am.a.this.eyY) && (!am.a.this.eyX)) {
              am.a.this.qH();
            }
          }
        }
        
        public final String toString()
        {
          GMTrace.i(829599776768L, 6181);
          String str = super.toString() + "|onSceneEnd";
          GMTrace.o(829599776768L, 6181);
          return str;
        }
      });
      GMTrace.o(798595481600L, 5950);
    }
    
    protected final void finalize()
    {
      GMTrace.i(797924392960L, 5945);
      at.wS().b(220, this);
      at.wS().b(221, this);
      at.wS().b(222, this);
      this.toM.clear();
      super.finalize();
      GMTrace.o(797924392960L, 5945);
    }
    
    public final void qG()
    {
      GMTrace.i(16011503861760L, 119295);
      w.d("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene recving[%b][%d], sending[%b][%d]", new Object[] { Boolean.valueOf(this.eyX), Integer.valueOf(this.eyV.size()), Boolean.valueOf(this.eyY), Integer.valueOf(this.eyU.size()) });
      this.eza = System.currentTimeMillis();
      if (((!this.eyX) && (this.eyV.size() == 0)) || ((!this.eyY) && (this.eyU.size() == 0))) {
        bJF();
      }
      if ((!this.eyX) && (this.eyV.size() == 0) && (!this.eyY) && (this.eyU.size() == 0))
      {
        qH();
        w.d("MicroMsg.SceneAppMsg", "summerbig No Data Any More , Stop Service");
        GMTrace.o(16011503861760L, 119295);
        return;
      }
      long l;
      b localb;
      Object localObject;
      if ((!this.eyY) && (this.eyU.size() > 0))
      {
        l = bg.a((Long)this.eyU.poll(), -1L);
        w.i("MicroMsg.SceneAppMsg", "summerbig Start Send :" + l);
        if (l != -1L)
        {
          this.eyW.put(Long.valueOf(l), new g.a());
          this.eyY = true;
          localb = new b();
          if (!an.afP().b(l, localb))
          {
            w.e("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene fail, getAttachInfo fail, infoId = " + l);
            at.AR();
            localObject = com.tencent.mm.y.c.yM().cM(localb.field_msgInfoId);
            ((au)localObject).dB(5);
            at.AR();
            com.tencent.mm.y.c.yM().a(((ce)localObject).field_msgId, (au)localObject);
            this.eyY = false;
            GMTrace.o(16011503861760L, 119295);
            return;
          }
          if (localb.field_type != 8L) {
            break label591;
          }
          at.AR();
          localObject = com.tencent.mm.y.c.yM().cM(localb.field_msgInfoId);
          if (((ce)localObject).field_msgId == 0L)
          {
            w.e("MicroMsg.SceneAppMsg", "getEmoticonMd5 fail, msg is null :" + localb.field_msgInfoId);
            localObject = null;
          }
          while (localObject == null)
          {
            w.e("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene fail, send emoji, emoticonMd5 can not be null");
            at.AR();
            localObject = com.tencent.mm.y.c.yM().cM(localb.field_msgInfoId);
            ((au)localObject).dB(5);
            at.AR();
            com.tencent.mm.y.c.yM().a(((ce)localObject).field_msgId, (au)localObject);
            this.eyY = false;
            GMTrace.o(16011503861760L, 119295);
            return;
            f.a locala = f.a.eS(((ce)localObject).field_content);
            if (locala != null) {
              localObject = locala.gix;
            } else {
              localObject = com.tencent.mm.storage.aj.Uf(((ce)localObject).field_content).eDW;
            }
          }
        }
      }
      for (;;)
      {
        localObject = new ak(l, (String)localObject, (String)this.toM.get(Long.valueOf(localb.field_msgInfoId)));
        at.wS().a((k)localObject, 0);
        GMTrace.o(16011503861760L, 119295);
        return;
        label591:
        localObject = null;
      }
    }
    
    public final void qH()
    {
      GMTrace.i(798729699328L, 5951);
      this.eyW.clear();
      this.eyU.clear();
      this.eyV.clear();
      this.eyY = false;
      this.eyX = false;
      this.running = false;
      w.d("MicroMsg.SceneAppMsg", "Finish service use time(ms):" + this.ezd.tD());
      GMTrace.o(798729699328L, 5951);
    }
    
    public final void run()
    {
      GMTrace.i(798863917056L, 5952);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(820875624448L, 6116);
          long l = System.currentTimeMillis() - am.a.this.eza;
          w.d("MicroMsg.SceneAppMsg", "summerbig Try Run service runningFlag:" + am.a.this.running + " timeWait:" + l + " sending:" + am.a.this.eyY + " recving:" + am.a.this.eyX);
          if (am.a.this.running)
          {
            if (l < 180000L)
            {
              GMTrace.o(820875624448L, 6116);
              return;
            }
            w.e("MicroMsg.SceneAppMsg", "summerbig ERR: Try Run service runningFlag:" + am.a.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + am.a.this.eyY + " recving:" + am.a.this.eyX);
          }
          am.a.this.running = true;
          am.a.this.eyY = false;
          am.a.this.eyZ = 4;
          am.a.this.eyX = false;
          am.a.this.ezd.fSo = SystemClock.elapsedRealtime();
          am.a.this.eze.z(10L, 10L);
          GMTrace.o(820875624448L, 6116);
        }
        
        public final String toString()
        {
          GMTrace.i(821009842176L, 6117);
          String str = super.toString() + "|run";
          GMTrace.o(821009842176L, 6117);
          return str;
        }
      });
      GMTrace.o(798863917056L, 5952);
    }
    
    public final void t(long paramLong, String paramString)
    {
      GMTrace.i(798058610688L, 5946);
      this.toM.put(Long.valueOf(paramLong), paramString);
      GMTrace.o(798058610688L, 5946);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */