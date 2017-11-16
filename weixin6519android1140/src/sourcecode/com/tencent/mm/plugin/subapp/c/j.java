package com.tencent.mm.plugin.subapp.c;

import android.database.Cursor;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class j
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
  public boolean running;
  
  static
  {
    GMTrace.i(5832431370240L, 43455);
    ezb = 0;
    GMTrace.o(5832431370240L, 43455);
  }
  
  public j()
  {
    GMTrace.i(5829747015680L, 43435);
    this.eyU = new LinkedList();
    this.eyV = new LinkedList();
    this.eyW = new HashMap();
    this.eyX = false;
    this.eyY = false;
    this.running = false;
    this.eyZ = 0;
    this.eza = 0L;
    this.ezd = new g.a();
    this.eze = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5839142256640L, 43505);
        w.d("MicroMsg.VoiceRemindService", "onTimerExpired");
        try
        {
          j.this.qG();
          GMTrace.o(5839142256640L, 43505);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.VoiceRemindService", localException, "", new Object[0]);
          }
        }
      }
    }, false);
    at.wS().a(329, this);
    GMTrace.o(5829747015680L, 43435);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5829881233408L, 43436);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5839947563008L, 43511);
        j.ezb += 1;
        Object localObject;
        int i;
        if (paramk.getType() == 128)
        {
          j.this.eyX = false;
          localObject = ((com.tencent.mm.modelvoice.e)paramk).euR;
          i = ((com.tencent.mm.modelvoice.e)paramk).retCode;
          long l2 = 0L;
          long l1 = l2;
          if (localObject != null)
          {
            l1 = l2;
            if (j.this.eyW.get(localObject) != null)
            {
              l1 = ((g.a)j.this.eyW.get(localObject)).tD();
              j.this.eyW.remove(localObject);
            }
          }
          w.d("MicroMsg.VoiceRemindService", "onSceneEnd SceneType:" + paramk.getType() + " errtype:" + paramInt1 + " errCode:" + paramInt2 + " retCode:" + i + " file:" + (String)localObject + " time:" + l1);
          if ((paramInt1 != 3) || (i == 0)) {
            break label444;
          }
          localObject = j.this;
          ((j)localObject).eyZ -= 1;
          label236:
          w.d("MicroMsg.VoiceRemindService", "onSceneEnd  inCnt:" + j.ezb + " stop:" + j.this.eyZ + " running:" + j.this.running + " recving:" + j.this.eyX + " sending:" + j.this.eyY);
          if (j.this.eyZ <= 0) {
            break label462;
          }
          j.this.qG();
        }
        for (;;)
        {
          j.ezb -= 1;
          GMTrace.o(5839947563008L, 43511);
          return;
          if (paramk.getType() == 329)
          {
            j.this.eyY = false;
            localObject = ((b)paramk).euR;
            i = ((b)paramk).retCode;
            break;
          }
          w.e("MicroMsg.VoiceRemindService", "onSceneEnd Error SceneType:" + paramk.getType());
          j.ezb -= 1;
          GMTrace.o(5839947563008L, 43511);
          return;
          label444:
          if (paramInt1 == 0) {
            break label236;
          }
          j.this.eyZ = 0;
          break label236;
          label462:
          if ((!j.this.eyY) && (!j.this.eyX)) {
            j.this.qH();
          }
        }
      }
    });
    GMTrace.o(5829881233408L, 43436);
  }
  
  public final void qG()
  {
    GMTrace.i(16029757472768L, 119431);
    this.eza = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    int i;
    g localg;
    if (((!this.eyX) && (this.eyV.size() == 0)) || ((!this.eyY) && (this.eyU.size() == 0)))
    {
      localObject1 = d.brE();
      localObject2 = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo";
      localObject2 = (String)localObject2 + " WHERE status<97  order by createtime";
      localObject2 = ((k)localObject1).fTZ.a((String)localObject2, null, 2);
      localObject1 = null;
      int j = 0;
      i = 0;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localg = new g();
          localg.b((Cursor)localObject2);
          ((List)localObject1).add(localg);
          j = i + 1;
          i = j;
        } while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      w.d("MicroMsg.VoiceRemindStorage", "getUnfinishInfo resCount:" + j);
      if (localObject1 != null) {
        break label299;
      }
      w.d("MicroMsg.VoiceRemindService", "getNeedRunInfo null ");
      if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
        break label329;
      }
    }
    for (;;)
    {
      if ((this.eyX) || (this.eyV.size() != 0) || (this.eyY) || (this.eyU.size() != 0)) {
        break label1303;
      }
      qH();
      w.d("MicroMsg.VoiceRemindService", "No Data Any More , Stop Service");
      GMTrace.o(16029757472768L, 119431);
      return;
      label299:
      w.d("MicroMsg.VoiceRemindService", "getNeedRunInfo " + ((List)localObject1).size());
      break;
      label329:
      long l = System.currentTimeMillis() / 1000L;
      localObject2 = bg.eK(l);
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localg = (g)((Iterator)localObject1).next();
        if (this.eyW.containsKey(localg.field_filename))
        {
          w.d("MicroMsg.VoiceRemindService", "File is Already running:" + localg.field_filename);
        }
        else
        {
          w.d("MicroMsg.VoiceRemindService", "Get file:" + localg.field_filename + " status:" + localg.field_status + " user" + localg.field_user + " human:" + localg.field_human + " create:" + bg.eK(localg.field_createtime) + " last:" + bg.eK(localg.field_lastmodifytime) + " now:" + bg.eK(l) + " " + (l - localg.field_lastmodifytime));
          if ((localg.field_status == 5) || (localg.field_status == 6)) {
            i = 1;
          }
          for (;;)
          {
            if (i != 0)
            {
              if ((l - localg.field_lastmodifytime > 80L) && (localg.field_status == 5))
              {
                w.e("MicroMsg.VoiceRemindService", "time out file: " + localg.field_filename + " last:" + bg.eK(localg.field_lastmodifytime) + " now:" + (String)localObject2);
                h.mp(localg.field_filename);
                break;
                i = 0;
                continue;
              }
              if ((l - localg.field_lastmodifytime > 300L) && (localg.field_status == 6))
              {
                w.e("MicroMsg.VoiceRemindService", "time out file: " + localg.field_filename + " last:" + bg.eK(localg.field_lastmodifytime) + " now:" + (String)localObject2);
                h.mp(localg.field_filename);
                break;
              }
              if (localg.field_filenowsize >= localg.field_offset)
              {
                w.d("MicroMsg.VoiceRemindService", "file: " + localg.field_filename + " stat:" + localg.field_status + " now:" + localg.field_filenowsize + " net:" + localg.field_offset);
                break;
              }
              this.eyV.offer(localg.field_filename);
              this.eyW.put(localg.field_filename, null);
            }
          }
          if (localg.NO())
          {
            w.d("MicroMsg.VoiceRemindService", "now " + l + "info.getLastModifyTime()  " + localg.field_lastmodifytime + "  info.getStatus() " + localg.field_status + "  info.getCreateTime() " + localg.field_createtime);
            if ((l - localg.field_lastmodifytime > 10L) && ((localg.field_status == 2) || (localg.field_status == 1)))
            {
              w.e("MicroMsg.VoiceRemindService", "time out file: " + localg.field_filename + " last:" + bg.eK(localg.field_lastmodifytime) + " now:" + (String)localObject2);
              h.mp(localg.field_filename);
            }
            else if ((l - localg.field_createtime > 600L) && (localg.field_status == 3))
            {
              w.e("MicroMsg.VoiceRemindService", "time out file: " + localg.field_filename + " last:" + bg.eK(localg.field_lastmodifytime) + " now:" + (String)localObject2);
              h.mp(localg.field_filename);
            }
            else if (localg.field_user.length() <= 0)
            {
              w.e("MicroMsg.VoiceRemindService", "Create a new ChatRoom? , set username first :" + localg.field_filename);
            }
            else
            {
              this.eyU.offer(localg.field_filename);
              this.eyW.put(localg.field_filename, null);
            }
          }
        }
      }
      w.d("MicroMsg.VoiceRemindService", "GetNeedRun procing:" + this.eyW.size() + " [recv:" + this.eyV.size() + ",send:" + this.eyU.size() + "]");
      this.eyV.size();
      this.eyU.size();
    }
    label1303:
    if ((!this.eyX) && (this.eyV.size() > 0))
    {
      localObject1 = (String)this.eyV.poll();
      w.d("MicroMsg.VoiceRemindService", "Start Recv :" + (String)localObject1);
      if (localObject1 != null)
      {
        this.eyW.put(localObject1, new g.a());
        this.eyX = true;
        w.d("MicroMsg.VoiceRemindService", "tiger download voice");
      }
    }
    if ((!this.eyY) && (this.eyU.size() > 0))
    {
      localObject1 = (String)this.eyU.poll();
      w.d("MicroMsg.VoiceRemindService", "Start Send :" + (String)localObject1);
      if (localObject1 != null)
      {
        this.eyW.put(localObject1, new g.a());
        this.eyY = true;
        localObject1 = new b((String)localObject1);
        at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      }
    }
    GMTrace.o(16029757472768L, 119431);
  }
  
  public final void qH()
  {
    GMTrace.i(5830015451136L, 43437);
    this.eyW.clear();
    this.eyU.clear();
    this.eyV.clear();
    this.eyY = false;
    this.eyX = false;
    this.running = false;
    w.d("MicroMsg.VoiceRemindService", "Finish service use time(ms):" + this.ezd.tD());
    GMTrace.o(5830015451136L, 43437);
  }
  
  public final void run()
  {
    GMTrace.i(5830149668864L, 43438);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5846255796224L, 43558);
        long l = System.currentTimeMillis() - j.this.eza;
        w.d("MicroMsg.VoiceRemindService", "Try Run service runningFlag:" + j.this.running + " timeWait:" + l + " sending:" + j.this.eyY + " recving:" + j.this.eyX);
        if (j.this.running)
        {
          if (l < 60000L)
          {
            GMTrace.o(5846255796224L, 43558);
            return;
          }
          w.e("MicroMsg.VoiceRemindService", "ERR: Try Run service runningFlag:" + j.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + j.this.eyY + " recving:" + j.this.eyX);
        }
        j.this.running = true;
        j.this.eyY = false;
        j.this.eyZ = 3;
        j.this.eyX = false;
        j.this.ezd.fSo = SystemClock.elapsedRealtime();
        j.this.eze.z(10L, 10L);
        GMTrace.o(5846255796224L, 43558);
      }
    });
    GMTrace.o(5830149668864L, 43438);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */