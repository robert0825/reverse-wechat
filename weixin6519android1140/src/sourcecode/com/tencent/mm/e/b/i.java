package com.tencent.mm.e.b;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelvoice.f;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class i
  implements com.tencent.mm.ad.e
{
  public static int ezb;
  public static boolean ezc;
  Queue<String> eyU;
  Queue<p> eyV;
  Map<String, g.a> eyW;
  public boolean eyX;
  public boolean eyY;
  public int eyZ;
  public long eza;
  g.a ezd;
  public aj eze;
  public boolean running;
  
  static
  {
    GMTrace.i(4488106606592L, 33439);
    ezb = 0;
    ezc = true;
    GMTrace.o(4488106606592L, 33439);
  }
  
  public i()
  {
    GMTrace.i(4485422252032L, 33419);
    this.eyU = new LinkedList();
    this.eyV = new LinkedList();
    this.eyW = new HashMap();
    this.eyX = false;
    this.eyY = false;
    this.running = false;
    this.eyZ = 0;
    this.eza = 0L;
    this.ezd = new g.a();
    this.eze = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4482737897472L, 33399);
        w.d("MicroMsg.SceneVoiceService", "onTimerExpired");
        i.this.qG();
        GMTrace.o(4482737897472L, 33399);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(4482872115200L, 33400);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(4482872115200L, 33400);
        return str;
      }
    }, false);
    com.tencent.mm.kernel.h.wS().a(127, this);
    com.tencent.mm.kernel.h.wS().a(128, this);
    GMTrace.o(4485422252032L, 33419);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(4485556469760L, 33420);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4488643477504L, 33443);
        i.ezb += 1;
        Object localObject;
        int i;
        if (paramk.getType() == 128)
        {
          i.this.eyX = false;
          localObject = ((com.tencent.mm.modelvoice.e)paramk).euR;
          i = ((com.tencent.mm.modelvoice.e)paramk).retCode;
          long l2 = 0L;
          long l1 = l2;
          if (localObject != null)
          {
            l1 = l2;
            if (i.this.eyW.get(localObject) != null)
            {
              l1 = ((g.a)i.this.eyW.get(localObject)).tD();
              i.this.eyW.remove(localObject);
            }
          }
          w.i("MicroMsg.SceneVoiceService", "onSceneEnd SceneType:" + paramk.getType() + " errtype:" + paramInt1 + " errCode:" + paramInt2 + " retCode:" + i + " file:" + (String)localObject + " time:" + l1);
          if ((paramInt1 != 3) || (i == 0)) {
            break label443;
          }
          localObject = i.this;
          ((i)localObject).eyZ -= 1;
          label236:
          w.i("MicroMsg.SceneVoiceService", "onSceneEnd  inCnt:" + i.ezb + " stop:" + i.this.eyZ + " running:" + i.this.running + " recving:" + i.this.eyX + " sending:" + i.this.eyY);
          if (i.this.eyZ <= 0) {
            break label461;
          }
          i.this.qG();
        }
        for (;;)
        {
          i.ezb -= 1;
          GMTrace.o(4488643477504L, 33443);
          return;
          if (paramk.getType() == 127)
          {
            i.this.eyY = false;
            localObject = ((f)paramk).euR;
            i = ((f)paramk).retCode;
            break;
          }
          w.e("MicroMsg.SceneVoiceService", "onSceneEnd Error SceneType:" + paramk.getType());
          i.ezb -= 1;
          GMTrace.o(4488643477504L, 33443);
          return;
          label443:
          if (paramInt1 == 0) {
            break label236;
          }
          i.this.eyZ = 0;
          break label236;
          label461:
          if ((!i.this.eyY) && (!i.this.eyX))
          {
            i.this.qH();
            w.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try next delay 3s [%d, %d] [%b]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Boolean.valueOf(i.ezc) });
            if ((i.ezc) && (paramInt1 == 4)) {
              com.tencent.mm.kernel.h.xB().h(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(16692121960448L, 124366);
                  w.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try run");
                  i.this.run();
                  GMTrace.o(16692121960448L, 124366);
                }
              }, 10000L);
            }
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(4488777695232L, 33444);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(4488777695232L, 33444);
        return str;
      }
    });
    GMTrace.o(4485556469760L, 33420);
  }
  
  public final void qG()
  {
    GMTrace.i(16085323612160L, 119845);
    this.eza = System.currentTimeMillis();
    Object localObject2;
    if (((!this.eyX) && (this.eyV.size() == 0)) || ((!this.eyY) && (this.eyU.size() == 0)))
    {
      localObject2 = q.NP();
      if ((localObject2 != null) && (((List)localObject2).size() != 0)) {
        break label131;
      }
    }
    label131:
    Object localObject1;
    while ((!this.eyX) && (this.eyV.size() == 0) && (!this.eyY) && (this.eyU.size() == 0))
    {
      qH();
      w.i("MicroMsg.SceneVoiceService", "No Data Any More , Stop Service");
      GMTrace.o(16085323612160L, 119845);
      return;
      long l = System.currentTimeMillis() / 1000L;
      localObject1 = bg.eK(l);
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        p localp = (p)((Iterator)localObject2).next();
        if (this.eyW.containsKey(localp.euR))
        {
          w.d("MicroMsg.SceneVoiceService", "File is Already running:" + localp.euR);
        }
        else
        {
          w.i("MicroMsg.SceneVoiceService", "Get file:" + localp.euR + " status:" + localp.status + " user" + localp.eQu + " human:" + localp.hcn + " create:" + bg.eK(localp.hcs) + " last:" + bg.eK(localp.hct) + " now:" + bg.eK(l) + " " + (l - localp.hct));
          if (localp.NN())
          {
            if ((l - localp.hct > 80L) && (localp.status == 5))
            {
              w.e("MicroMsg.SceneVoiceService", "time out file: " + localp.euR + " last:" + bg.eK(localp.hct) + " now:" + (String)localObject1 + " msgLocalId:" + localp.hcw + " status:" + localp.status);
              if (localp.hcw == 0)
              {
                localp.hct = (System.currentTimeMillis() / 1000L);
                localp.eQl = 320;
                m.NK().a(localp.euR, localp);
              }
            }
            else
            {
              if ((l - localp.hct > 300L) && (localp.status == 6))
              {
                w.e("MicroMsg.SceneVoiceService", "time out file: " + localp.euR + " last:" + bg.eK(localp.hct) + " now:" + (String)localObject1 + " msgLocalId:" + localp.hcw + " status:" + localp.status);
                if (localp.hcw != 0) {
                  break label741;
                }
                localp.hct = (System.currentTimeMillis() / 1000L);
                localp.eQl = 320;
                m.NK().a(localp.euR, localp);
              }
              if (localp.hcp < localp.hbc) {
                break label753;
              }
              w.i("MicroMsg.SceneVoiceService", "file: " + localp.euR + " stat:" + localp.status + " now:" + localp.hcp + " net:" + localp.hbc);
              continue;
            }
            q.mp(localp.euR);
            continue;
            label741:
            q.mp(localp.euR);
            continue;
            label753:
            this.eyV.offer(localp);
            this.eyW.put(localp.euR, null);
          }
          else if (localp.NO())
          {
            w.i("MicroMsg.SceneVoiceService", "now " + l + "info.getLastModifyTime()  " + localp.hct + "  info.getStatus() " + localp.status + "  info.getCreateTime() " + localp.hcs);
            if ((l - localp.hct > 10L) && ((localp.status == 2) || (localp.status == 1)))
            {
              w.e("MicroMsg.SceneVoiceService", "time out file: " + localp.euR + " last:" + bg.eK(localp.hct) + " now:" + (String)localObject1);
              q.mp(localp.euR);
            }
            else if ((l - localp.hcs > 600L) && (localp.status == 3))
            {
              w.e("MicroMsg.SceneVoiceService", "time out file: " + localp.euR + " last:" + bg.eK(localp.hct) + " now:" + (String)localObject1);
              q.mp(localp.euR);
            }
            else if (localp.eQu.length() <= 0)
            {
              w.e("MicroMsg.SceneVoiceService", "Create a new ChatRoom? , set username first :" + localp.euR);
            }
            else
            {
              this.eyU.offer(localp.euR);
              this.eyW.put(localp.euR, null);
            }
          }
        }
      }
      w.i("MicroMsg.SceneVoiceService", "GetNeedRun procing:" + this.eyW.size() + " [recv:" + this.eyV.size() + ",send:" + this.eyU.size() + "]");
      this.eyV.size();
      this.eyU.size();
    }
    if ((!this.eyX) && (this.eyV.size() > 0))
    {
      localObject1 = (p)this.eyV.poll();
      localObject2 = ((p)localObject1).euR;
      int i;
      if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cO(((p)localObject1).eSf))
      {
        w.i("MicroMsg.SceneVoiceService", "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info", new Object[] { Long.valueOf(((p)localObject1).eSf) });
        i = 1;
      }
      while (i != 0) {
        if (bg.nl(((p)localObject1).euR).length() > 0)
        {
          m.NK().hB(((p)localObject1).euR);
          GMTrace.o(16085323612160L, 119845);
          return;
          i = 0;
        }
        else
        {
          w.i("MicroMsg.SceneVoiceService", "[oneliang] the length of voice info file name is zero");
          GMTrace.o(16085323612160L, 119845);
          return;
        }
      }
      w.i("MicroMsg.SceneVoiceService", "Start Recv :" + (String)localObject2);
      if (localObject2 != null)
      {
        this.eyW.put(localObject2, new g.a());
        this.eyX = true;
        localObject1 = new com.tencent.mm.modelvoice.e((p)localObject1);
        com.tencent.mm.kernel.h.wS().a((k)localObject1, 0);
      }
    }
    if ((!this.eyY) && (this.eyU.size() > 0))
    {
      localObject1 = (String)this.eyU.poll();
      w.i("MicroMsg.SceneVoiceService", "Start Send :" + (String)localObject1);
      if (localObject1 != null)
      {
        this.eyW.put(localObject1, new g.a());
        this.eyY = true;
        localObject1 = new f((String)localObject1);
        com.tencent.mm.kernel.h.wS().a((k)localObject1, 0);
      }
    }
    GMTrace.o(16085323612160L, 119845);
  }
  
  public final void qH()
  {
    GMTrace.i(4485690687488L, 33421);
    this.eyW.clear();
    this.eyU.clear();
    this.eyV.clear();
    this.eyY = false;
    this.eyX = false;
    this.running = false;
    w.i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.ezd.tD());
    GMTrace.o(4485690687488L, 33421);
  }
  
  public final void run()
  {
    GMTrace.i(4485824905216L, 33422);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4485153816576L, 33417);
        long l = System.currentTimeMillis() - i.this.eza;
        w.i("MicroMsg.SceneVoiceService", "Try Run service runningFlag:" + i.this.running + " timeWait:" + l + " sending:" + i.this.eyY + " recving:" + i.this.eyX);
        if (i.this.running)
        {
          if (l < 60000L)
          {
            GMTrace.o(4485153816576L, 33417);
            return;
          }
          w.e("MicroMsg.SceneVoiceService", "ERR: Try Run service runningFlag:" + i.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + i.this.eyY + " recving:" + i.this.eyX);
        }
        i.this.running = true;
        i.this.eyY = false;
        i.this.eyZ = 3;
        i.this.eyX = false;
        i.this.ezd.fSo = SystemClock.elapsedRealtime();
        i.this.eze.z(10L, 10L);
        GMTrace.o(4485153816576L, 33417);
      }
      
      public final String toString()
      {
        GMTrace.i(4485288034304L, 33418);
        String str = super.toString() + "|run";
        GMTrace.o(4485288034304L, 33418);
        return str;
      }
    });
    GMTrace.o(4485824905216L, 33422);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */