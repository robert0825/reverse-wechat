package com.tencent.mm.modelmulti;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bm.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.messenger.foundation.a.g;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.yv;
import com.tencent.mm.protocal.c.yw;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ao;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public final class b
  implements j.a
{
  public Queue<b> gFB;
  public com.tencent.mm.sdk.platformtools.aj gFF;
  public final com.tencent.mm.sdk.platformtools.aj gFG;
  public Map<String, LinkedList<a>> gLC;
  LinkedBlockingQueue<a> gLD;
  public c gLE;
  public Map<Long, ao> gLF;
  public boolean gsb;
  long gsm;
  
  b()
  {
    GMTrace.i(408692981760L, 3045);
    this.gsb = false;
    this.gsm = 0L;
    this.gLC = new HashMap();
    this.gLD = new LinkedBlockingQueue();
    this.gFB = new LinkedList();
    this.gLF = new HashMap();
    this.gFF = new com.tencent.mm.sdk.platformtools.aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(405740191744L, 3023);
        w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr pusherTry onTimerExpired tryStartNetscene");
        b localb = b.this;
        long l1 = t.Pv();
        if ((localb.gsb) && (l1 - localb.gsm > 300000L))
        {
          w.w("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene Not Callback too long:%d . Force Run Now", new Object[] { Long.valueOf(l1 - localb.gsm) });
          localb.gsb = false;
        }
        if (localb.gsb) {
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene netSceneRunning: " + localb.gsb + " ret");
        }
        for (;;)
        {
          GMTrace.o(405740191744L, 3023);
          return false;
          ??? = null;
          b.a locala = null;
          if (!localb.gLD.isEmpty())
          {
            locala = (b.a)localb.gLD.poll();
            ??? = locala.gLI;
          }
          if (locala != null) {
            break label1435;
          }
          synchronized (localb.gLC)
          {
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene needGetInfosMap size[%d], content[%s]", new Object[] { Integer.valueOf(localb.gLC.size()), localb.gLC });
            if ((localb.gLE == null) || (t.nm(localb.gLE.Jx())))
            {
              localb.gLC.clear();
              localb.gLE = null;
              w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene currentListener is or its chatroomid is null ret");
            }
          }
        }
        String str = localb.gLE.Jx();
        Object localObject5 = (LinkedList)localb.gLC.get(str);
        int i;
        label362:
        Object localObject3;
        au localau;
        if ((localObject5 == null) || (((LinkedList)localObject5).size() == 0))
        {
          if (localObject5 == null) {}
          for (i = -1;; i = ((LinkedList)localObject5).size())
          {
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene current talker[%s] no infos and ret infos size:%d", new Object[] { str, Integer.valueOf(i) });
            break;
          }
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene get nextInfo in map in db but not fault: " + localObject3 + " flag:" + localau.field_flag + " seq:" + localau.field_msgSeq);
        }
        Object localObject2;
        if (!((LinkedList)localObject5).isEmpty())
        {
          localObject3 = (b.a)((LinkedList)localObject5).poll();
          if (localObject3 != null)
          {
            at.AR();
            localau = com.tencent.mm.y.c.yM().C(str, ((b.a)localObject3).gLK);
            if (localau.field_msgId == 0L)
            {
              w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene get nextInfo in map not in db:" + localObject3);
              localObject2 = localObject3;
              label491:
              localObject3 = localObject2;
              ??? = str;
              if (localObject2 == null)
              {
                localObject3 = localObject2;
                ??? = str;
                if (!t.nm(str))
                {
                  at.AR();
                  localObject5 = com.tencent.mm.y.c.yP().TO(str);
                  localObject3 = localObject2;
                  ??? = str;
                  if (localObject5 != null)
                  {
                    long l2 = ((com.tencent.mm.g.b.aj)localObject5).field_lastSeq;
                    long l3 = ((com.tencent.mm.g.b.aj)localObject5).field_firstUnDeliverSeq;
                    i = ((com.tencent.mm.g.b.aj)localObject5).field_UnDeliverCount;
                    w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene filterSeq[%d], lastSeq[%d], undeliverCount[%d]", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Integer.valueOf(i) });
                    localObject3 = localObject2;
                    ??? = str;
                    if (l2 != 0L)
                    {
                      at.AR();
                      localObject3 = com.tencent.mm.y.c.yM().C(str, l2);
                      if (((ce)localObject3).field_msgId != 0L) {
                        break label803;
                      }
                      localObject3 = new b.a(str, (int)l3, (int)l2, i, 1);
                      w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene get nextInfo in db:" + localObject3);
                      ??? = str;
                    }
                  }
                }
              }
            }
          }
        }
        for (;;)
        {
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene nextInfo:" + localObject3);
          if (localObject3 == null)
          {
            localb.gFF.z(500L, 500L);
            break;
            if ((localau.field_flag & 0x1) == 0) {
              break label362;
            }
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene get nextInfo in map in db but fault: " + localObject3 + " flag:" + localau.field_flag + " seq:" + localau.field_msgSeq);
            localObject2 = localObject3;
            break label491;
            label803:
            if (i > 0)
            {
              ((ae)localObject5).dz(0);
              at.AR();
              com.tencent.mm.y.c.yP().a((ae)localObject5, str);
            }
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene get nextInfo in db but has get msg id:%d, svrId:%d, undeliverCount[%d]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), Integer.valueOf(((com.tencent.mm.g.b.aj)localObject5).field_UnDeliverCount) });
            localObject3 = localObject2;
            ??? = str;
            continue;
          }
          localb.gsb = true;
          localb.gsm = l1;
          localObject2 = new yv();
          ((yv)localObject2).upI = com.tencent.mm.platformtools.n.ni((String)???);
          ((yv)localObject2).tQe = ((b.a)localObject3).gLK;
          if (((b.a)localObject3).gLK == 0)
          {
            ((yv)localObject2).upJ = 0;
            if (((b.a)localObject3).gLL != 0) {
              w.w("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene msgSeq is 0 but needCount[%d], stack[%s]!", new Object[] { Integer.valueOf(((b.a)localObject3).gLL), t.Py() });
            }
            label978:
            ((yv)localObject2).upK = ((b.a)localObject3).gLM;
            ((yv)localObject2).upM = ((b.a)localObject3).gLJ;
            if (((((yv)localObject2).upK != 0) && (((yv)localObject2).upM > ((yv)localObject2).tQe)) || ((((yv)localObject2).upK == 0) && (((yv)localObject2).upM < ((yv)localObject2).tQe)))
            {
              w.w("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene FilterSeq msgSeq UpDownFlag not match[%d][%d][%d], stack[%s]!", new Object[] { Integer.valueOf(((yv)localObject2).upM), Integer.valueOf(((yv)localObject2).tQe), Integer.valueOf(((yv)localObject2).upK), t.Py() });
              ??? = d.oqe;
              if (((yv)localObject2).upK != 0) {
                break label1397;
              }
              l1 = 0L;
              label1106:
              ((d)???).a(403L, l1, 1L, false);
              if (localb.gLE != null) {
                localb.gLE.gB(1);
              }
            }
            if ((((yv)localObject2).upK != 0) && (((yv)localObject2).upM == 0) && (((b.a)localObject3).gLL < 18))
            {
              if (((b.a)localObject3).gLL <= 0) {
                break label1402;
              }
              ((yv)localObject2).upJ = ((b.a)localObject3).gLL;
              label1180:
              w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene UpDownFlag FilterSeq 0 fix need nextInfo: %d req: %d", new Object[] { Integer.valueOf(((b.a)localObject3).gLL), Integer.valueOf(((yv)localObject2).upJ) });
            }
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr tryStartNetscene FilterSeq[%d], MsgSeq[%d], NeedCount[%d], UpDownFlag[%d], ClearFlag[%d]", new Object[] { Integer.valueOf(((yv)localObject2).upM), Integer.valueOf(((yv)localObject2).tQe), Integer.valueOf(((yv)localObject2).upJ), Integer.valueOf(((yv)localObject2).upK), Integer.valueOf(((yv)localObject2).upL) });
            localObject3 = new com.tencent.mm.ad.b.a();
            ((com.tencent.mm.ad.b.a)localObject3).gtF = ((a)localObject2);
            ((com.tencent.mm.ad.b.a)localObject3).gtG = new yw();
            ((com.tencent.mm.ad.b.a)localObject3).uri = "/cgi-bin/micromsg-bin/getcrmsg";
            ((com.tencent.mm.ad.b.a)localObject3).gtE = 805;
            ((com.tencent.mm.ad.b.a)localObject3).gtH = 0;
            ((com.tencent.mm.ad.b.a)localObject3).gtI = 0;
            ??? = d.oqe;
            if (((yv)localObject2).tQe != 0) {
              break label1425;
            }
          }
          label1397:
          label1402:
          label1425:
          for (l1 = 9L;; l1 = 8L)
          {
            ((d)???).a(403L, l1, 1L, false);
            u.a(((com.tencent.mm.ad.b.a)localObject3).DA(), new b.3(localb), true);
            break;
            ((yv)localObject2).upJ = 18;
            break label978;
            l1 = 1L;
            break label1106;
            ((yv)localObject2).upJ = 1;
            d.oqe.a(403L, 3L, 1L, false);
            break label1180;
          }
          break label491;
          label1435:
          localObject3 = localObject2;
        }
      }
    }, false);
    this.gFG = new com.tencent.mm.sdk.platformtools.aj(at.xB().ngv.getLooper(), new aj.a()
    {
      private g gLH;
      
      public final boolean pM()
      {
        GMTrace.i(411243118592L, 3064);
        at.AR();
        com.tencent.mm.y.c.yM().BW("MicroMsg.GetChatRoomMsgService" + b.this.hashCode());
        if (b.this.gFB.isEmpty())
        {
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler queue maybe this time is null and return!");
          at.AR();
          com.tencent.mm.y.c.yM().BX("MicroMsg.GetChatRoomMsgService" + b.this.hashCode());
          GMTrace.o(411243118592L, 3064);
          return false;
        }
        long l1 = t.Pv();
        int i;
        int m;
        int j;
        label154:
        Object localObject1;
        boolean bool1;
        if (b.this.gsb)
        {
          i = 9;
          m = i + 1;
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler start maxCnt[%d]", new Object[] { Integer.valueOf(m) });
          j = 0;
          if (j >= m) {
            break label1430;
          }
          localObject1 = (b.b)b.this.gFB.peek();
          if (localObject1 != null) {
            break label359;
          }
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler queue maybe this time is null and break! currentListener[%s]", new Object[] { b.this.gLE });
          at.AR();
          com.tencent.mm.y.c.yM().BX("MicroMsg.GetChatRoomMsgService" + b.this.hashCode());
          bool1 = false;
          if (b.this.gLE != null) {
            b.this.gLE.gB(0);
          }
          b.this.gFF.z(0L, 0L);
        }
        for (;;)
        {
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler onTimerExpired netSceneRunning:" + b.this.gsb + " ret:" + bool1 + " maxCnt:" + m + " take:" + (t.Pv() - l1) + "ms");
          GMTrace.o(411243118592L, 3064);
          return bool1;
          i = 18;
          break;
          label359:
          Object localObject2 = ((b.b)localObject1).gLN;
          int n = ((LinkedList)localObject2).size();
          int i1 = n - 1;
          int i2 = ((b.b)localObject1).gFO;
          if (n <= i2)
          {
            b.this.gFB.poll();
            if (b.this.gFB.isEmpty())
            {
              b.d(new HashMap(b.this.gLF), ((b.b)localObject1).gLI);
              at.AR();
              com.tencent.mm.y.c.yM().BX("MicroMsg.GetChatRoomMsgService" + b.this.hashCode());
              localObject1 = b.this.gLE;
              if (b.this.gLE == null) {}
              for (bool1 = false;; bool1 = b.this.gLE.Jy())
              {
                w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break currentListener[%s], needCallBack[%b]", new Object[] { Integer.valueOf(i2), Integer.valueOf(n), localObject1, Boolean.valueOf(bool1) });
                bool1 = false;
                if (b.this.gLE != null) {
                  b.this.gLE.gB(0);
                }
                b.this.gFF.z(0L, 0L);
                break;
              }
            }
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", new Object[] { Integer.valueOf(i2), Integer.valueOf(n) });
            j += 1;
            break label154;
          }
          localObject2 = (bu)((LinkedList)localObject2).get(i2);
          w.d("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process curIdx[%d] last[%d] dealFault[%b] MsgSeq[%d], CreateTime[%d], MsgType[%d]", new Object[] { Integer.valueOf(i2), Integer.valueOf(i1), Boolean.valueOf(((b.b)localObject1).gLO), Integer.valueOf(((bu)localObject2).tQe), Integer.valueOf(((bu)localObject2).nFd), Integer.valueOf(((bu)localObject2).lQc) });
          boolean bool2 = false;
          int k = -1;
          label748:
          Object localObject3;
          label841:
          au localau;
          if ((((b.b)localObject1).gLO) && (i2 == i1)) {
            if (((b.b)localObject1).gLP != 0)
            {
              bool1 = true;
              i = -1;
              w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process fault[%b] curIdx[%d] last[%d], upFlag[%d]，MsgSeq[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf(((b.b)localObject1).gLM), Integer.valueOf(((bu)localObject2).tQe) });
              if (this.gLH == null) {
                this.gLH = ((g)h.h(g.class));
              }
              localObject3 = this.gLH;
              if (((b.b)localObject1).gLM == 0) {
                break label1380;
              }
              bool2 = true;
              ((g)localObject3).a(new d.a((bu)localObject2, true, bool1, bool2), new com.tencent.mm.plugin.bbom.n(true));
              if ((bool1) && (i == 0) && (n > 1) && (((b.b)localObject1).gLM == 0))
              {
                at.AR();
                localObject3 = com.tencent.mm.y.c.yM().C(((b.b)localObject1).gLI, ((bu)localObject2).tQe);
                i = ((ce)localObject3).field_flag;
                long l2 = ((ce)localObject3).field_createTime;
                w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process check fault meet size[%d], seq[%d], flag[%d], creatTime[%d]", new Object[] { Integer.valueOf(n), Integer.valueOf(((bu)localObject2).tQe), Integer.valueOf(i), Long.valueOf(l2) });
                if ((i & 0x4) == 0)
                {
                  at.AR();
                  localau = com.tencent.mm.y.c.yM().C(((b.b)localObject1).gLI, ((bu)localObject2).tQe + 1);
                  if ((localau.field_msgId == 0L) || (localau.field_msgSeq != ((bu)localObject2).tQe + 1)) {
                    break label1386;
                  }
                  w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process check fault meet seq[%d], creatTime[%d], flag[%d]", new Object[] { Long.valueOf(localau.field_msgSeq), Long.valueOf(localau.field_createTime), Integer.valueOf(localau.field_flag) });
                  if ((localau.field_flag & 0x4) != 0)
                  {
                    ((au)localObject3).dL(((ce)localObject3).field_flag & 0xFFFFFFFE);
                    at.AR();
                    com.tencent.mm.y.c.yM().a(((ce)localObject3).field_msgId, (au)localObject3);
                    localau.dL(localau.field_flag & 0xFFFFFFFE);
                    at.AR();
                    com.tencent.mm.y.c.yM().a(localau.field_msgId, localau);
                    w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process check fault meet update succ!");
                    d.oqe.a(403L, 34L, 1L, false);
                  }
                }
              }
            }
          }
          for (;;)
          {
            ((b.b)localObject1).gFO += 1;
            break;
            at.AR();
            localObject3 = com.tencent.mm.y.c.yM().C(((b.b)localObject1).gLI, ((bu)localObject2).tQe);
            if (((ce)localObject3).field_msgId == 0L)
            {
              at.AR();
              localObject3 = com.tencent.mm.y.c.yP().TO(((b.b)localObject1).gLI);
              if (localObject3 == null)
              {
                bool1 = true;
                i = -1;
                break label748;
              }
              if ((((b.b)localObject1).gLM == 0) || (((com.tencent.mm.g.b.aj)localObject3).field_firstUnDeliverSeq == ((bu)localObject2).tQe))
              {
                i = k;
                bool1 = bool2;
                if (((b.b)localObject1).gLM == 0)
                {
                  i = k;
                  bool1 = bool2;
                  if (((com.tencent.mm.g.b.aj)localObject3).field_lastSeq == ((bu)localObject2).tQe) {}
                }
              }
              else
              {
                bool1 = true;
                i = ((com.tencent.mm.g.b.aj)localObject3).field_UnDeliverCount;
              }
              break label748;
            }
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process existed curIdx == last[%d], MsgSeq[%d], flag[%d]", new Object[] { Integer.valueOf(i2), Long.valueOf(((ce)localObject3).field_msgSeq), Integer.valueOf(((ce)localObject3).field_flag) });
            bool1 = false;
            i = -1;
            break label748;
            label1380:
            bool2 = false;
            break label841;
            label1386:
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr respHandler process check fault meet nextinfo is null[%b], id[%d], seq[%d]", new Object[] { Boolean.valueOf(false), Long.valueOf(localau.field_msgId), Long.valueOf(localau.field_msgSeq) });
          }
          label1430:
          bool1 = true;
        }
      }
    }, true);
    GMTrace.o(408692981760L, 3045);
  }
  
  private boolean b(a parama, c paramc)
  {
    GMTrace.i(409229852672L, 3049);
    if ((parama == null) || (paramc == null) || (t.nm(parama.gLI)) || (!parama.gLI.equals(paramc.Jx())))
    {
      GMTrace.o(409229852672L, 3049);
      return false;
    }
    w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr addChatRoomMsg info:%s", new Object[] { parama });
    synchronized (this.gLC)
    {
      LinkedList localLinkedList = (LinkedList)this.gLC.get(parama.gLI);
      if (localLinkedList == null)
      {
        localLinkedList = new LinkedList();
        w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr addChatRoomMsg new infos and add ret:%b, infos[%d], needGetInfosMap[%s]", new Object[] { Boolean.valueOf(localLinkedList.add(parama)), Integer.valueOf(localLinkedList.hashCode()), this.gLC });
        this.gLC.put(parama.gLI, localLinkedList);
        this.gLE = paramc;
        GMTrace.o(409229852672L, 3049);
        return true;
      }
      localLinkedList.addLast(parama);
      w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr addChatRoomMsg to infos first:%b, infos[%d], needGetInfosMap[%s]", new Object[] { Boolean.valueOf(false), Integer.valueOf(localLinkedList.hashCode()), this.gLC });
    }
  }
  
  public static void d(Map<Long, ao> paramMap, String paramString)
  {
    GMTrace.i(16009356378112L, 119279);
    if ((paramMap.size() == 0) || (t.nm(paramString)))
    {
      GMTrace.o(16009356378112L, 119279);
      return;
    }
    paramMap = paramMap.values().iterator();
    if (paramMap != null) {
      while (paramMap.hasNext())
      {
        Object localObject1 = (ao)paramMap.next();
        if ((localObject1 != null) && (paramString.equals(((ao)localObject1).field_fromUserName)))
        {
          at.AR();
          Object localObject2 = com.tencent.mm.y.c.yM().B(paramString, ((ao)localObject1).field_originSvrId);
          if (((ce)localObject2).field_msgId != 0L)
          {
            w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr dealSysCmdMsg msg id[%d], originsvrid[%d]", new Object[] { Long.valueOf(((ce)localObject2).field_msgId), Long.valueOf(((ce)localObject2).field_msgSvrId) });
            localObject2 = new bu();
            ((bu)localObject2).tQd = ((ao)localObject1).field_newMsgId;
            ((bu)localObject2).tPW = com.tencent.mm.platformtools.n.ni(((ao)localObject1).field_fromUserName);
            ((bu)localObject2).tPX = com.tencent.mm.platformtools.n.ni(((ao)localObject1).field_toUserName);
            ((bu)localObject2).nFd = ((int)((ao)localObject1).field_createTime);
            ((bu)localObject2).tPY = com.tencent.mm.platformtools.n.ni(((ao)localObject1).field_content);
            ((bu)localObject2).tQb = ((ao)localObject1).field_msgSource;
            ((bu)localObject2).tQe = ((ao)localObject1).field_msgSeq;
            int i = ((ao)localObject1).field_flag;
            ((bu)localObject2).lQc = 10002;
            d.oqe.a(403L, 35L, 1L, false);
            localObject1 = at.getSysCmdMsgExtension();
            boolean bool1;
            label279:
            boolean bool2;
            if ((i & 0x2) != 0)
            {
              bool1 = true;
              if ((i & 0x1) == 0) {
                break label325;
              }
              bool2 = true;
              label288:
              if ((i & 0x4) == 0) {
                break label331;
              }
            }
            label325:
            label331:
            for (boolean bool3 = true;; bool3 = false)
            {
              ((bt)localObject1).b(new d.a((bu)localObject2, bool1, bool2, bool3));
              break;
              bool1 = false;
              break label279;
              bool2 = false;
              break label288;
            }
          }
        }
      }
    }
    GMTrace.o(16009356378112L, 119279);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(408827199488L, 3046);
    if (!t.nm(paramString)) {
      try
      {
        long l = Long.valueOf(paramString).longValue();
        paramString = new ao();
        paramString.field_originSvrId = l;
        if (at.AR().zw().b(paramString, new String[0]))
        {
          this.gLF.put(Long.valueOf(l), paramString);
          w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr onNotifyChange put info systemRowid[%d], svrId[%d]", new Object[] { Long.valueOf(paramString.vmr), Long.valueOf(l) });
          GMTrace.o(408827199488L, 3046);
          return;
        }
        this.gLF.remove(Long.valueOf(l));
        w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr onNotifyChange remove info svrId[%d]", new Object[] { Long.valueOf(l) });
        GMTrace.o(408827199488L, 3046);
        return;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.GetChatRoomMsgService", paramString, "summerbadcr onNotifyChange:", new Object[0]);
      }
    }
    GMTrace.o(408827199488L, 3046);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(409095634944L, 3048);
    if (parama.gLK != 0)
    {
      GMTrace.o(409095634944L, 3048);
      return false;
    }
    w.i("MicroMsg.GetChatRoomMsgService", "summerbadcr clearChatRoomMsg info:%s, stack[%s]", new Object[] { parama, t.Py() });
    if (this.gLD.add(parama))
    {
      this.gFF.z(0L, 0L);
      GMTrace.o(409095634944L, 3048);
      return true;
    }
    GMTrace.o(409095634944L, 3048);
    return false;
  }
  
  public final boolean a(a parama, c paramc)
  {
    GMTrace.i(408961417216L, 3047);
    if (b(parama, paramc))
    {
      this.gFF.z(0L, 0L);
      GMTrace.o(408961417216L, 3047);
      return true;
    }
    GMTrace.o(408961417216L, 3047);
    return false;
  }
  
  public static final class a
  {
    final String gLI;
    final int gLJ;
    final int gLK;
    final int gLL;
    final int gLM;
    
    public a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(410840465408L, 3061);
      this.gLI = paramString;
      this.gLJ = paramInt1;
      this.gLK = paramInt2;
      this.gLL = paramInt3;
      this.gLM = paramInt4;
      GMTrace.o(410840465408L, 3061);
    }
    
    public final String toString()
    {
      GMTrace.i(410974683136L, 3062);
      String str = "GetChatRoomMsgInfo chatroomId[" + this.gLI + "], filterSeq[" + this.gLJ + "], msgSeq[" + this.gLK + "], needCount[" + this.gLL + "], upDownFlag[" + this.gLM + "], hash[" + hashCode() + "]";
      GMTrace.o(410974683136L, 3062);
      return str;
    }
  }
  
  final class b
  {
    int gFO;
    String gLI;
    int gLM;
    LinkedList<bu> gLN;
    boolean gLO;
    int gLP;
    
    b()
    {
      GMTrace.i(412316860416L, 3072);
      this.gLN = new LinkedList();
      this.gFO = 0;
      this.gLM = 0;
      this.gLO = true;
      this.gLP = 0;
      GMTrace.o(412316860416L, 3072);
    }
  }
  
  public static abstract interface c
  {
    public abstract String Jx();
    
    public abstract boolean Jy();
    
    public abstract void gB(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */