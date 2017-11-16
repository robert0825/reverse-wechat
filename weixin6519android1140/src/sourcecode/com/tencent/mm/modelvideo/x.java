package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import junit.framework.Assert;

public final class x
{
  public static String hcY;
  
  static
  {
    GMTrace.i(331920441344L, 2473);
    hcY = null;
    GMTrace.o(331920441344L, 2473);
  }
  
  public static final class a
    implements com.tencent.mm.ad.e
  {
    public static int ezb;
    Queue<String> eyU;
    Queue<String> eyV;
    Map<String, g.a> eyW;
    public boolean eyX;
    public boolean eyY;
    public int eyZ;
    public long eza;
    g.a ezd;
    public aj eze;
    HandlerThread hcZ;
    ae hda;
    boolean hdb;
    public List<v> hdc;
    Queue<String> hdd;
    Queue<String> hde;
    public d hdf;
    public g hdg;
    public boolean running;
    
    static
    {
      GMTrace.i(344671125504L, 2568);
      ezb = 0;
      GMTrace.o(344671125504L, 2568);
    }
    
    public a()
    {
      GMTrace.i(341584117760L, 2545);
      this.hcZ = com.tencent.mm.sdk.f.e.cK("VideoService_runThread", 0);
      this.hdb = false;
      this.eze = null;
      this.hdc = new ArrayList();
      this.eyU = new LinkedList();
      this.eyV = new LinkedList();
      this.hdd = new LinkedList();
      this.hde = new LinkedList();
      this.eyW = new HashMap();
      this.eyX = false;
      this.eyY = false;
      this.running = false;
      this.eyZ = 0;
      this.eza = 0L;
      this.hdf = null;
      this.hdg = null;
      this.ezd = new g.a();
      com.tencent.mm.kernel.h.wS().a(149, this);
      com.tencent.mm.kernel.h.wS().a(150, this);
      this.hcZ.start();
      this.hdb = true;
      this.hda = new ae(this.hcZ.getLooper());
      this.eze = new aj(this.hcZ.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(350710923264L, 2613);
          x.a.this.qG();
          GMTrace.o(350710923264L, 2613);
          return false;
        }
        
        public final String toString()
        {
          GMTrace.i(350845140992L, 2614);
          String str = super.toString() + "|scenePusher";
          GMTrace.o(350845140992L, 2614);
          return str;
        }
      }, false);
      w.i("MicroMsg.VideoService", "create VideoService, start video send thread");
      GMTrace.o(341584117760L, 2545);
    }
    
    public final boolean NF()
    {
      GMTrace.i(342120988672L, 2549);
      boolean bool;
      if (this.hdf != null)
      {
        com.tencent.mm.kernel.h.wS().c(this.hdf);
        bool = true;
        this.running = false;
      }
      for (;;)
      {
        this.eyW.clear();
        this.eyU.clear();
        this.eyV.clear();
        this.hdd.clear();
        this.hde.clear();
        GMTrace.o(342120988672L, 2549);
        return bool;
        bool = false;
      }
    }
    
    public final void a(final int paramInt1, final int paramInt2, String paramString, final k paramk)
    {
      GMTrace.i(341718335488L, 2546);
      if ((this.hcZ == null) || (!this.hdb) || (this.hda == null))
      {
        w.e("MicroMsg.VideoService", "onSceneEnd error!, handler or thread is null!");
        GMTrace.o(341718335488L, 2546);
        return;
      }
      this.hda.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(326551732224L, 2433);
          x.a.ezb += 1;
          Object localObject;
          int i;
          if (paramk.getType() == 150)
          {
            x.a.this.eyX = false;
            localObject = ((d)paramk).euR;
            x.hcY = (String)localObject;
            i = ((d)paramk).retCode;
            x.a.this.hdf = null;
          }
          for (;;)
          {
            long l2 = 0L;
            long l1 = l2;
            if (localObject != null)
            {
              l1 = l2;
              if (x.a.this.eyW.get(localObject) != null)
              {
                l1 = ((g.a)x.a.this.eyW.get(localObject)).tD();
                x.a.this.eyW.remove(localObject);
              }
            }
            w.d("MicroMsg.VideoService", "onSceneEnd SceneType:" + paramk.getType() + " errtype:" + paramInt1 + " errCode:" + paramInt2 + " retCode:" + i + " file:" + (String)localObject + " time:" + l1);
            if ((paramInt1 == 3) && (i != 0))
            {
              localObject = x.a.this;
              ((x.a)localObject).eyZ -= 1;
              label250:
              w.d("MicroMsg.VideoService", "onSceneEnd  inCnt:" + x.a.ezb + " stop:" + x.a.this.eyZ + " running:" + x.a.this.running + " recving:" + x.a.this.eyX + " sending:" + x.a.this.eyY);
              if (x.a.this.eyZ <= 0) {
                break label523;
              }
              x.a.this.qG();
            }
            for (;;)
            {
              x.a.ezb -= 1;
              GMTrace.o(326551732224L, 2433);
              return;
              if (paramk.getType() == 149)
              {
                x.a.this.eyY = false;
                x.a.this.hdg = null;
                if ((paramk instanceof g))
                {
                  localObject = ((g)paramk).euR;
                  i = ((g)paramk).retCode;
                  break;
                }
                if (!(paramk instanceof h)) {
                  break label553;
                }
                localObject = ((h)paramk).euR;
                i = 0;
                break;
              }
              w.e("MicroMsg.VideoService", "onSceneEnd Error SceneType:" + paramk.getType());
              x.a.ezb -= 1;
              GMTrace.o(326551732224L, 2433);
              return;
              if (paramInt1 == 0) {
                break label250;
              }
              x.a.this.eyZ = 0;
              break label250;
              label523:
              if ((!x.a.this.eyY) && (!x.a.this.eyX)) {
                x.a.this.qH();
              }
            }
            label553:
            localObject = null;
            i = 0;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(326685949952L, 2434);
          String str = super.toString() + "|onSceneEnd";
          GMTrace.o(326685949952L, 2434);
          return str;
        }
      });
      GMTrace.o(341718335488L, 2546);
    }
    
    public final void qG()
    {
      GMTrace.i(16008551071744L, 119273);
      this.eza = System.currentTimeMillis();
      Object localObject2;
      Object localObject1;
      if (((!this.eyX) && (this.eyV.size() + this.hdd.size() == 0)) || ((!this.eyY) && (this.eyU.size() == 0)))
      {
        long l = bg.Pw();
        Object localObject4 = o.Nh().ND();
        Object localObject3 = o.Nh().NA();
        localObject2 = o.Nh().NB();
        localObject1 = o.Nh().NC();
        if (localObject4 != null)
        {
          w.d("MicroMsg.VideoService", "getNeedRunInfo needSendList size: " + ((List)localObject4).size());
          localObject4 = ((List)localObject4).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            String str = (String)((Iterator)localObject4).next();
            if (this.eyW.containsKey(str))
            {
              w.d("MicroMsg.VideoService", "need sendList File is Already running:" + str);
            }
            else
            {
              this.eyU.offer(str);
              this.eyW.put(str, null);
            }
          }
        }
        if (localObject3 != null)
        {
          w.d("MicroMsg.VideoService", "getNeedRunInfo needRecvList size: " + ((List)localObject3).size());
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (String)((Iterator)localObject3).next();
            if (this.eyW.containsKey(localObject4))
            {
              w.d("MicroMsg.VideoService", "need recvList File is Already running:" + (String)localObject4);
            }
            else
            {
              this.eyV.offer(localObject4);
              this.eyW.put(localObject4, null);
            }
          }
        }
        if (localObject2 != null)
        {
          w.d("MicroMsg.VideoService", "getNeedRunInfo online video list size: " + ((List)localObject2).size());
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (String)((Iterator)localObject2).next();
            if (this.eyW.containsKey(localObject3))
            {
              w.d("MicroMsg.VideoService", "online videoList File is Already running:" + (String)localObject3);
            }
            else
            {
              this.hdd.offer(localObject3);
              this.eyW.put(localObject3, null);
            }
          }
        }
        if (localObject1 != null)
        {
          w.d("MicroMsg.VideoService", "getNeedRunInfo hevc video list size: " + ((List)localObject1).size());
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (this.eyW.containsKey(localObject2))
            {
              w.d("MicroMsg.VideoService", "hevc videoList File is Already running:" + (String)localObject2);
            }
            else
            {
              this.hde.offer(localObject2);
              this.eyW.put(localObject2, null);
            }
          }
        }
        w.i("MicroMsg.VideoService", "GetNeedRun cost time[%d] procing[%d] [recv:%d, online:%d, send:%d hevc:%d]", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.eyW.size()), Integer.valueOf(this.eyV.size()), Integer.valueOf(this.hdd.size()), Integer.valueOf(this.eyU.size()), Integer.valueOf(this.hde.size()) });
        this.eyV.size();
        this.eyU.size();
        this.hdd.size();
        this.hde.size();
      }
      if ((this.hde.size() == 0) || (!com.tencent.mm.modelcontrol.d.GD())) {}
      for (int i = 1; (!this.eyX) && (this.eyV.size() + this.hdd.size() == 0) && (i != 0) && (!this.eyY) && (this.eyU.size() == 0); i = 0)
      {
        qH();
        w.d("MicroMsg.VideoService", "No Data Any More , Stop Service");
        GMTrace.o(16008551071744L, 119273);
        return;
      }
      boolean bool;
      if ((!this.eyX) && ((this.eyV.size() > 0) || (this.hdd.size() > 0) || (i == 0)))
      {
        if (this.hdd.size() > 0)
        {
          localObject1 = (String)this.hdd.poll();
          w.i("MicroMsg.VideoService", "Start Recv :" + (String)localObject1);
          if (!bg.nm((String)localObject1))
          {
            this.eyW.put(localObject1, new g.a());
            this.eyX = true;
            if (this.hdf != null) {
              break label1433;
            }
            bool = true;
            Assert.assertTrue("sceneDown should null", bool);
            this.hdf = new d((String)localObject1, true);
            com.tencent.mm.kernel.h.wS().a(this.hdf, 0);
          }
        }
        if ((!this.eyX) && (this.eyV.size() > 0))
        {
          localObject1 = (String)this.eyV.poll();
          w.i("MicroMsg.VideoService", "Start Recv :" + (String)localObject1);
          if (localObject1 != null)
          {
            this.eyW.put(localObject1, new g.a());
            this.eyX = true;
            if (this.hdf != null) {
              break label1439;
            }
            bool = true;
            label1117:
            Assert.assertTrue("sceneDown should null", bool);
            this.hdf = new d((String)localObject1);
            com.tencent.mm.kernel.h.wS().a(this.hdf, 0);
          }
        }
        if (!this.eyX)
        {
          localObject1 = (String)this.hde.poll();
          w.i("MicroMsg.VideoService", "Start recv hecv: " + (String)localObject1);
          if (!bg.nm((String)localObject1))
          {
            this.eyW.put(localObject1, new g.a());
            this.eyX = true;
            if (this.hdf != null) {
              break label1445;
            }
            bool = true;
            label1236:
            Assert.assertTrue("sceneDown should null", bool);
            this.hdf = new d((String)localObject1, true);
            com.tencent.mm.kernel.h.wS().a(this.hdf, 0);
          }
        }
      }
      if ((!this.eyY) && (this.eyU.size() > 0))
      {
        localObject1 = (String)this.eyU.poll();
        w.i("MicroMsg.VideoService", "Start Send :" + (String)localObject1);
        if (localObject1 != null)
        {
          this.eyW.put(localObject1, new g.a());
          this.eyY = true;
          if (this.hdg == null) {}
          for (bool = true;; bool = false)
          {
            Assert.assertTrue("sceneUp should null", bool);
            if ((this.hdc == null) || (this.hdc.size() <= 0)) {
              break label1457;
            }
            localObject2 = this.hdc.iterator();
            while (((Iterator)localObject2).hasNext()) {
              ((v)((Iterator)localObject2).next()).mB((String)localObject1);
            }
            label1433:
            bool = false;
            break;
            label1439:
            bool = false;
            break label1117;
            label1445:
            bool = false;
            break label1236;
          }
          label1457:
          this.hdg = new g((String)localObject1);
          com.tencent.mm.kernel.h.wS().a(this.hdg, 0);
        }
      }
      GMTrace.o(16008551071744L, 119273);
    }
    
    public final void qH()
    {
      GMTrace.i(341852553216L, 2547);
      this.eyW.clear();
      this.eyU.clear();
      this.eyV.clear();
      this.hdd.clear();
      this.hde.clear();
      this.eyY = false;
      this.eyX = false;
      this.running = false;
      w.i("MicroMsg.VideoService", "Finish service use time(ms):" + this.ezd.tD());
      GMTrace.o(341852553216L, 2547);
    }
    
    public final void run()
    {
      GMTrace.i(341986770944L, 2548);
      if ((this.hcZ == null) || (!this.hdb) || (this.hda == null))
      {
        w.e("MicroMsg.VideoService", "run error!, handler or thread is null!");
        GMTrace.o(341986770944L, 2548);
        return;
      }
      this.hda.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(352053100544L, 2623);
          long l = System.currentTimeMillis() - x.a.this.eza;
          w.d("MicroMsg.VideoService", "Try Run service runningFlag:" + x.a.this.running + " timeWait:" + l + " sending:" + x.a.this.eyY + " recving:" + x.a.this.eyX);
          if (x.a.this.running)
          {
            if (l < 60000L)
            {
              GMTrace.o(352053100544L, 2623);
              return;
            }
            w.e("MicroMsg.VideoService", "ERR: Try Run service runningFlag:" + x.a.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + x.a.this.eyY + " recving:" + x.a.this.eyX);
          }
          x.a.this.eyZ = 3;
          x.a.this.running = true;
          x.a.this.eyY = false;
          x.a.this.eyX = false;
          x.a.this.hdg = null;
          x.a.this.hdf = null;
          x.a.this.ezd.fSo = SystemClock.elapsedRealtime();
          x.a.this.eze.z(10L, 10L);
          GMTrace.o(352053100544L, 2623);
        }
        
        public final String toString()
        {
          GMTrace.i(352187318272L, 2624);
          String str = super.toString() + "|run";
          GMTrace.o(352187318272L, 2624);
          return str;
        }
      });
      GMTrace.o(341986770944L, 2548);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */