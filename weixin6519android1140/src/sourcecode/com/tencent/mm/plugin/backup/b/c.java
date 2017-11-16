package com.tencent.mm.plugin.backup.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.a.b.b;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.e.a.a;
import com.tencent.mm.plugin.backup.e.a.c;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.plugin.backup.f.h;
import com.tencent.mm.plugin.backup.f.h.a;
import com.tencent.mm.plugin.backup.f.i;
import com.tencent.mm.plugin.backup.f.j;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import junit.framework.Assert;

public final class c
{
  public boolean iVT;
  public b.b iVU;
  public com.tencent.mm.plugin.backup.a.e iVV;
  public long iVW;
  public long iVX;
  private int iVq;
  
  public c(com.tencent.mm.plugin.backup.a.e parame, int paramInt, b.b paramb)
  {
    GMTrace.i(18451045285888L, 137471);
    this.iVT = false;
    this.iVW = 0L;
    this.iVX = 0L;
    this.iVV = parame;
    this.iVq = paramInt;
    this.iVU = paramb;
    GMTrace.o(18451045285888L, 137471);
  }
  
  public static int w(LinkedList<com.tencent.mm.plugin.backup.a.g> paramLinkedList)
  {
    GMTrace.i(16048816390144L, 119573);
    HashSet localHashSet = new HashSet();
    if (paramLinkedList == null)
    {
      GMTrace.o(16048816390144L, 119573);
      return 0;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      localHashSet.add(((com.tencent.mm.plugin.backup.a.g)paramLinkedList.next()).iVy);
    }
    int i = localHashSet.size();
    GMTrace.o(16048816390144L, 119573);
    return i;
  }
  
  public final void a(final LinkedList<com.tencent.mm.plugin.backup.a.g> paramLinkedList, final int paramInt, final long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18451179503616L, 137472);
    if (paramLinkedList == null) {}
    for (int i = -1;; i = paramLinkedList.size())
    {
      w.i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], bigFileSize[%d], isOnlyText[%b]", new Object[] { Integer.valueOf(i), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean) });
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9474026766336L, 70587);
          if (paramLinkedList == null)
          {
            w.e("MicroMsg.BackupPackAndSend", "backupChatRunnable backupSessionList is null.");
            if (c.this.iVU != null)
            {
              c.this.iVU.aee();
              c.this.iVV.aei().iVu = -21;
              c.this.iVU.a(c.this.iVV.aei());
            }
            GMTrace.o(9474026766336L, 70587);
            return;
          }
          b.afw().start();
          c.this.iVV.aei().x(14, 1, c.w(paramLinkedList));
          c.this.iVU.a(c.this.iVV.aei());
          Object localObject1 = (String)a.afG().afH().xh().get(2, null);
          long l1 = bg.Pv();
          c.this.iVX = l1;
          Object localObject2 = new c.c(c.this);
          int i = 0;
          while (i < paramLinkedList.size())
          {
            c.this.a((com.tencent.mm.plugin.backup.a.g)paramLinkedList.get(i), (c.c)localObject2, (String)localObject1, paramLong, paramInt);
            if (c.this.iVT) {
              break;
            }
            i += 1;
          }
          if (c.this.iVT)
          {
            w.e("MicroMsg.BackupPackAndSend", "backupChatRunnable canceled!");
            GMTrace.o(9474026766336L, 70587);
            return;
          }
          long l2 = bg.Pv();
          long l3 = bg.Pv();
          ((c.c)localObject2).iWD.offer(((c.c)localObject2).iWE);
          ((c.c)localObject2).iWE.block();
          w.i("MicroMsg.BackupPackAndSend", "TagQueue waitFinish Finish Now:%d", new Object[] { Long.valueOf(bg.aH(l3)) });
          Assert.assertTrue(((c.c)localObject2).iWD.isEmpty());
          w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable finish cancel[%b], Session[%d], loopTime[%d], waitSendTime:%d", new Object[] { Boolean.valueOf(c.this.iVT), Integer.valueOf(paramLinkedList.size()), Long.valueOf(bg.aH(l1)), Long.valueOf(bg.aH(l2)) });
          c.this.aeu();
          i = c.w(paramLinkedList);
          c.this.iVV.aei().x(15, i, c.w(paramLinkedList));
          c.this.iVU.a(c.this.iVV.aei());
          c.this.cY(true);
          if (b.afv() != null) {
            b.afv().stop();
          }
          if (b.afw() != null) {
            b.afw().stop();
          }
          if (com.tencent.mm.plugin.backup.a.e.ael() == 1)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(400L, 12L, bg.aH(l1), false);
            com.tencent.mm.plugin.report.service.g.ork.a(400L, 11L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.a(400L, 13L, c.this.iVW, false);
            com.tencent.mm.plugin.report.service.g.ork.i(13737, new Object[] { Integer.valueOf(0), Long.valueOf(c.this.iVW / 1024L), Long.valueOf(bg.aH(l1) / 1000L), Integer.valueOf(1), Integer.valueOf(this.iWb) });
          }
          w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable backupfinish, backupDataSize[%d], backupCostTime[%d], backupStartTime[%d], backupEndTime[%d]", new Object[] { Long.valueOf(c.this.iVW), Long.valueOf(bg.aH(l1)), Long.valueOf(l1), Long.valueOf(bg.Pv()) });
          localObject2 = a.afG().afH().jcJ;
          if (localObject2 == null) {}
          for (localObject1 = "null";; localObject1 = localObject2)
          {
            w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable send finish, isTempDb[%s]", new Object[] { localObject1 });
            if (localObject2 != null) {
              a.afG().n(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(9469463363584L, 70553);
                  w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable backupcloseTempDB end");
                  w.bPM();
                  GMTrace.o(9469463363584L, 70553);
                }
              });
            }
            GMTrace.o(9474026766336L, 70587);
            return;
          }
        }
      }, "backupPackThread", 10).start();
      GMTrace.o(18451179503616L, 137472);
      return;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.backup.a.g paramg, c paramc, String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18451313721344L, 137473);
    localObject1 = a.afG().afH().yP().TO(paramg.iVy);
    int i;
    long l5;
    int k;
    long l2;
    long l1;
    int j;
    if (localObject1 != null)
    {
      i = ((aj)localObject1).field_unReadCount;
      w.i("MicroMsg.BackupPackAndSend", "backupChatMsg index[%d], convName[%s], startTime[%d], endTime[%d], unReadCount[%d]", new Object[] { Integer.valueOf(paramg.iVz), paramg.iVy, Long.valueOf(paramg.startTime), Long.valueOf(paramg.endTime), Integer.valueOf(i) });
      l5 = bg.Pv();
      k = 0;
      l2 = 0L;
      l3 = 0L;
      l1 = 0L;
      j = i;
      i = k;
    }
    long l4;
    for (;;)
    {
      LinkedList localLinkedList1 = new LinkedList();
      l4 = bg.Pv();
      localObject1 = a.afG().afH().yM().a(paramg.iVy, paramg.startTime, paramg.endTime, i);
      Object localObject2;
      for (;;)
      {
        if (!((Cursor)localObject1).moveToNext()) {
          break label260;
        }
        k = i + 1;
        if (this.iVT)
        {
          ((Cursor)localObject1).close();
          GMTrace.o(18451313721344L, 137473);
          return false;
          i = 0;
          break;
        }
        localObject2 = new au();
        ((au)localObject2).b((Cursor)localObject1);
        if (paramBoolean)
        {
          i = k;
          if (((ce)localObject2).field_type != 1) {}
        }
        else
        {
          localLinkedList1.add(localObject2);
          i = k;
        }
      }
      label260:
      ((Cursor)localObject1).close();
      l4 = l3 - l4 + bg.Pv();
      if (localLinkedList1.size() == 0) {
        break label679;
      }
      k = 0;
      l3 = l2;
      l2 = l1;
      l1 = l3;
      if (k < localLinkedList1.size())
      {
        Object localObject3 = (au)localLinkedList1.get(k);
        PLong localPLong = new PLong();
        LinkedList localLinkedList2 = new LinkedList();
        HashMap localHashMap = new HashMap();
        for (;;)
        {
          try
          {
            l3 = bg.Pv();
            l1 -= l3;
            if (j > 0) {
              bool = true;
            }
          }
          catch (Exception localException1)
          {
            boolean bool;
            int m;
            localObject1 = null;
          }
          try
          {
            localObject1 = a.a.a((au)localObject3, false, paramString, localPLong, localLinkedList2, localHashMap, bool, false, paramLong);
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              label643:
              localObject1 = null;
            }
          }
          try
          {
            l3 = bg.Pv();
            l1 = l3 + l1;
            w.i("MicroMsg.BackupPackAndSend", "backupChatMsg bakitem[%s], mediaList[%d], addupSize[%d], bigfile[%d], msgSvrId[%d], type[%d], creatTime[%d], talker[%s]", new Object[] { localObject1, Integer.valueOf(localLinkedList2.size()), Long.valueOf(localPLong.value), Integer.valueOf(localHashMap.size()), Long.valueOf(((ce)localObject3).field_msgSvrId), Integer.valueOf(((ce)localObject3).field_type), Long.valueOf(((ce)localObject3).field_createTime), ((ce)localObject3).field_talker });
            l3 = l2;
            m = j;
            if (localObject1 != null)
            {
              l3 = bg.Pv();
              long l6 = localPLong.value;
              long l7 = ((ce)localObject3).field_createTime;
              if (paramc.iWF == null)
              {
                localObject2 = paramc.iWD;
                localObject3 = new b(paramc.iWc, paramc.iWi, paramg);
                paramc.iWF = ((b)localObject3);
                ((LinkedBlockingQueue)localObject2).offer(localObject3);
              }
              if (paramc.iWF.a((ek)localObject1, l6, l7, localLinkedList2, localHashMap)) {
                paramc.iWF = null;
              }
              l3 = l2 - l3 + bg.Pv();
              m = j - 1;
            }
            k += 1;
            l2 = l3;
            j = m;
          }
          catch (Exception localException3)
          {
            break label643;
          }
          bool = false;
          continue;
          w.printErrStackTrace("MicroMsg.BackupPackAndSend", localException1, "backupChatMsg packedMsg", new Object[0]);
        }
      }
      l3 = l4;
      l4 = l1;
      l1 = l2;
      l2 = l4;
    }
    label679:
    paramLong = bg.Pv();
    if (paramc.iWF == null)
    {
      paramString = paramc.iWD;
      localObject1 = new b(paramc.iWc, paramc.iWi, paramg);
      paramc.iWF = ((b)localObject1);
      paramString.offer(localObject1);
    }
    paramc.iWF.aev();
    paramc.iWF = null;
    long l3 = bg.Pv();
    w.i("MicroMsg.BackupPackAndSend", "backupChatMsg finish Cursor Session[%d], convName[%s], msgCnt[%d], time[%d], [%d,%d,%d]", new Object[] { Integer.valueOf(paramg.iVz), paramg.iVy, Integer.valueOf(i), Long.valueOf(bg.aH(l5)), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l1 - paramLong + l3) });
    GMTrace.o(18451313721344L, 137473);
    return true;
  }
  
  public final void aeu()
  {
    GMTrace.i(9470134452224L, 70558);
    w.i("MicroMsg.BackupPackAndSend", "backupSendFinishRequest.");
    com.tencent.mm.plugin.backup.h.d locald = new com.tencent.mm.plugin.backup.h.d();
    locald.ID = this.iVV.iVm;
    try
    {
      b.r(locald.toByteArray(), 8);
      GMTrace.o(9470134452224L, 70558);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupPackAndSend", localException, "BackupFinishRequest to buf err.", new Object[0]);
      GMTrace.o(9470134452224L, 70558);
    }
  }
  
  public final void cY(boolean paramBoolean)
  {
    GMTrace.i(14728516599808L, 109736);
    w.i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
    SharedPreferences.Editor localEditor;
    if (this.iVq == 1)
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvQ, Boolean.valueOf(false));
      localEditor = com.tencent.mm.plugin.backup.a.e.aen().edit();
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", null);
      if (paramBoolean)
      {
        if (this.iVq != 1) {
          break label163;
        }
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
    for (;;)
    {
      localEditor.commit();
      GMTrace.o(14728516599808L, 109736);
      return;
      if (this.iVq != 2) {
        break;
      }
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvT, Boolean.valueOf(false));
      break;
      label163:
      if (this.iVq == 2)
      {
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
  }
  
  private final class a
  {
    volatile AtomicLong iWe;
    ac iWf;
    ac iWg;
    
    public a()
    {
      GMTrace.i(9481811394560L, 70645);
      this.iWe = new AtomicLong(0L);
      this.iWf = new ac(true);
      this.iWg = new ac(true);
      GMTrace.o(9481811394560L, 70645);
    }
  }
  
  private final class b
  {
    public String TAG;
    public String aDn;
    public String eDs;
    public long iVi;
    public long iVj;
    public int iVz;
    public LinkedBlockingQueue<Runnable> iWh;
    public c.a iWi;
    long iWj;
    public String iWk;
    public Vector<String> iWl;
    Vector<ek> iWm;
    public HashMap<Long, a.c> iWn;
    public long iWo;
    public boolean iWp;
    private final com.tencent.mm.plugin.backup.f.c.b iWq;
    private final Runnable iWr;
    public final Runnable iWs;
    
    public b(c.a parama, com.tencent.mm.plugin.backup.a.g paramg)
    {
      GMTrace.i(18452655898624L, 137483);
      this.TAG = "";
      this.iWh = new LinkedBlockingQueue();
      this.iWi = null;
      this.iVi = 0L;
      this.iVj = 0L;
      this.iWj = 0L;
      this.iWk = "";
      this.iWl = new Vector();
      this.iWm = new Vector();
      this.iWn = new HashMap();
      this.iWo = 0L;
      this.iWp = false;
      this.iWq = new com.tencent.mm.plugin.backup.f.c.b()
      {
        public final void c(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(9479663910912L, 70629);
          c.a locala = c.b.this.iWi;
          long l1 = paramAnonymousInt;
          locala.iWe.addAndGet(0L - l1);
          if (locala.iWe.get() < 8388608L) {
            locala.iWf.open();
          }
          if (locala.iWe.get() < 16777216L) {
            locala.iWg.open();
          }
          long l2 = locala.iWe.get();
          boolean bool1;
          if (locala.iWe.get() >= 8388608L)
          {
            bool1 = true;
            if (locala.iWe.get() < 16777216L) {
              break label270;
            }
          }
          label270:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.release size:%d sum:%d [%b,%b] [%b,%b]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(locala.iWf.vip), Boolean.valueOf(locala.iWg.vip) });
            c.this.iVW += paramAnonymousInt;
            w.i(c.b.this.TAG, "OnfinishIdCallback size:%d finishid:%b [%s] ", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString });
            GMTrace.o(9479663910912L, 70629);
            return;
            bool1 = false;
            break;
          }
        }
      };
      this.iWr = new Runnable()
      {
        public final void run()
        {
          boolean bool = true;
          GMTrace.i(9464363089920L, 70515);
          Assert.assertTrue(toString() + ", check running. ", c.b.this.iWp);
          w.i(c.b.this.TAG, "requestBigFileList svrIdCnt:%d timeDiff:%d caller:%s", new Object[] { Integer.valueOf(c.b.this.iWn.size()), Long.valueOf(bg.aH(c.b.this.iWo)), ah.bQk() });
          if (!c.b.this.iWn.isEmpty()) {}
          for (;;)
          {
            Assert.assertTrue("BigFileMap should not Empty", bool);
            h.a local1 = new h.a()
            {
              public final void x(final LinkedList<Long> paramAnonymous2LinkedList)
              {
                GMTrace.i(9481140305920L, 70640);
                com.tencent.mm.sdk.f.e.b(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(9476040032256L, 70602);
                    int i = 0;
                    if ((paramAnonymous2LinkedList != null) && (i < paramAnonymous2LinkedList.size()))
                    {
                      Long localLong = (Long)paramAnonymous2LinkedList.get(i);
                      a.c localc = (a.c)c.b.this.iWn.get(localLong);
                      String str3 = c.b.this.TAG;
                      int j = paramAnonymous2LinkedList.size();
                      String str1;
                      if (localc == null)
                      {
                        str1 = "null";
                        label95:
                        if (localc != null) {
                          break label222;
                        }
                      }
                      label222:
                      for (String str2 = "null";; str2 = localc.iZF.path)
                      {
                        w.i(str3, "backupBigDataFiles svrIdIndex:%d(%d), svrId:%d media:%s item:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLong, str1, str2 });
                        if (localc != null)
                        {
                          c.b.this.iWl.add(localc.iZF.mediaId);
                          c.b.this.g(localc.iZF.mediaId, localc.iZF.path, true);
                        }
                        i += 1;
                        break;
                        str1 = localc.iZF.mediaId;
                        break label95;
                      }
                    }
                    c.b.this.iWh.offer(c.b.this.iWs);
                    GMTrace.o(9476040032256L, 70602);
                  }
                }, "AddBigFileToQueue").start();
                GMTrace.o(9481140305920L, 70640);
              }
            };
            new h(c.b.this.eDs, c.b.this.iWn, local1).afx();
            GMTrace.o(9464363089920L, 70515);
            return;
            bool = false;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(9464228872192L, 70514);
          String str = c.b.this.TAG + ".reqBigFile";
          GMTrace.o(9464228872192L, 70514);
          return str;
        }
      };
      this.iWs = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9481542959104L, 70643);
          Assert.assertTrue(toString() + ", check running. ", c.b.this.iWp);
          final boolean bool1;
          switch (com.tencent.mm.plugin.backup.a.e.ael())
          {
          default: 
            if (c.b.this.iVz == c.this.iVV.aei().iVw - 1)
            {
              bool1 = true;
              label106:
              if (bool1) {
                break label763;
              }
            }
            break;
          }
          label763:
          for (boolean bool2 = true;; bool2 = false)
          {
            final Object localObject = new ac(bool2);
            com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
              {
                GMTrace.i(9464631525376L, 70517);
                paramAnonymous2k = ((aa)((com.tencent.mm.plugin.backup.f.d)paramAnonymous2k).jbG).jin;
                w.i(c.b.this.TAG, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", new Object[] { Boolean.valueOf(bool1), localObject, Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String, c.b.this.iWk, paramAnonymous2k });
                if ((bool1) && (c.b.this.iWk.equals(paramAnonymous2k))) {
                  localObject.open();
                }
                GMTrace.o(9464631525376L, 70517);
              }
            };
            new com.tencent.mm.plugin.backup.f.d(c.b.this.eDs, c.b.this.iVi, c.b.this.iVj, c.b.this.iWk, c.b.this.aDn, new LinkedList(c.b.this.iWl), local1).afx();
            if (bool1)
            {
              w.w(c.b.this.TAG, "sendTag last Session :[%d/%d] wait tag resp callback .", new Object[] { Integer.valueOf(c.b.this.iVz), Integer.valueOf(c.this.iVV.aei().iVw - 1) });
              ((ac)localObject).block();
            }
            c.b.this.iWp = false;
            GMTrace.o(9481542959104L, 70643);
            return;
            w.i(c.b.this.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(c.this.iVV.aei().iVv), Long.valueOf(c.b.this.iVi), Long.valueOf(c.b.this.iVj), Integer.valueOf(c.b.this.iWl.size()), c.b.this.aDn, c.b.this.iWk, Long.valueOf(bg.aH(c.b.this.iWo)) });
            if (c.this.iVV.aei().iVv >= c.b.this.iVz + 1) {
              break;
            }
            int i = c.this.iVV.aei().iVw;
            localObject = c.this.iVV.aei();
            if (c.b.this.iVz + 1 > i) {}
            for (;;)
            {
              ((f)localObject).iVv = i;
              c.this.iVU.a(c.this.iVV.aei());
              break;
              i = c.b.this.iVz + 1;
            }
            w.i(c.b.this.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(c.this.iVV.aei().iVv), Long.valueOf(c.b.this.iVi), Long.valueOf(c.b.this.iVj), Integer.valueOf(c.b.this.iWl.size()), c.b.this.aDn, c.b.this.iWk, Long.valueOf(bg.aH(c.b.this.iWo)) });
            if (c.this.iVV.aei().iVv >= c.b.this.iVz + 1) {
              break;
            }
            i = c.this.iVV.aei().iVw;
            localObject = c.this.iVV.aei();
            if (c.b.this.iVz + 1 > i) {}
            for (;;)
            {
              ((f)localObject).iVv = i;
              c.this.iVU.a(c.this.iVV.aei());
              break;
              i = c.b.this.iVz + 1;
            }
            bool1 = false;
            break label106;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(9481408741376L, 70642);
          String str = c.b.this.TAG + ".sendTag";
          GMTrace.o(9481408741376L, 70642);
          return str;
        }
      };
      this.iWo = bg.Pv();
      this.iWi = parama;
      this.eDs = paramg.iVy;
      this.iVz = paramg.iVz;
      if (s.eb(this.eDs))
      {
        this$1 = r.F(this.eDs, this.eDs);
        this.aDn = c.this;
        parama = new StringBuilder("MicroMsg.BackupPackAndSend.tag");
        if (!this.iWp) {
          break label308;
        }
      }
      label308:
      for (this$1 = "S.";; this$1 = "W.")
      {
        this.TAG = (c.this + this.iVz + "." + this.aDn);
        w.i(this.TAG, "initTagNow [%d,%s,%s] [%s]", new Object[] { Integer.valueOf(this.iVz), this.aDn, this.eDs, ah.bQk() });
        GMTrace.o(18452655898624L, 137483);
        return;
        this$1 = r.fs(this.eDs);
        break;
      }
    }
    
    public final boolean a(ek paramek, long paramLong1, long paramLong2, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap)
    {
      GMTrace.i(9466779009024L, 70533);
      this.iWm.add(paramek);
      long l2 = this.iWj;
      if (paramLong1 > 0L) {}
      for (long l1 = paramLong1;; l1 = 0L)
      {
        this.iWj = (l1 + l2);
        if (this.iVi == 0L) {
          this.iVi = paramLong2;
        }
        this.iVj = paramLong2;
        this.iWn.putAll(paramHashMap);
        paramek = paramLinkedList.iterator();
        while (paramek.hasNext())
        {
          paramHashMap = (u)paramek.next();
          g(paramHashMap.mediaId, paramHashMap.path, false);
        }
      }
      w.i(this.TAG, "addToTag msgtime[%d,%d] size[%d,%d] baklist:%d media:%d timeDiff:%d", new Object[] { Long.valueOf(this.iVi), Long.valueOf(this.iVj), Long.valueOf(paramLong1), Long.valueOf(this.iWj), Integer.valueOf(this.iWm.size()), Integer.valueOf(paramLinkedList.size()), Long.valueOf(bg.aH(this.iWo)) });
      if ((this.iWj > 83886080L) || (this.iWm.size() > 80))
      {
        aev();
        GMTrace.o(9466779009024L, 70533);
        return true;
      }
      GMTrace.o(9466779009024L, 70533);
      return false;
    }
    
    public final void aev()
    {
      GMTrace.i(9466913226752L, 70534);
      this.iWk = ("MSG_" + this.iWm.size() + "_" + this.eDs + "_" + bg.Pv());
      w.i(this.TAG, "setTagEnd msgtime[%d,%d] size:%d baklist:%d bigfile:%d id:%s timeDiff:%d", new Object[] { Long.valueOf(this.iVi), Long.valueOf(this.iVj), Long.valueOf(this.iWj), Integer.valueOf(this.iWm.size()), Integer.valueOf(this.iWn.size()), this.iWk, Long.valueOf(bg.aH(this.iWo)) });
      if (this.iWm.size() > 0)
      {
        g(this.iWk, null, false);
        if (this.iWn.isEmpty())
        {
          this.iWh.offer(this.iWs);
          GMTrace.o(9466913226752L, 70534);
          return;
        }
        this.iWh.offer(this.iWr);
        GMTrace.o(9466913226752L, 70534);
        return;
      }
      w.w(this.TAG, "setTagEnd NoFileSend, Go Send Tag: Direct. baklist:%d media:%d bigFileMap:%d ", new Object[] { Integer.valueOf(this.iWm.size()), Integer.valueOf(this.iWl.size()), Integer.valueOf(this.iWn.size()) });
      Assert.assertTrue("cursorEnd NOMsg, chatMsgList should empty", this.iWm.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, MediaList should empty", this.iWl.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, BigFileList should empyt", this.iWn.isEmpty());
      this.iWh.offer(this.iWs);
      GMTrace.o(9466913226752L, 70534);
    }
    
    public final void g(String paramString1, String paramString2, boolean paramBoolean)
    {
      boolean bool = true;
      GMTrace.i(9467047444480L, 70535);
      com.tencent.mm.plugin.backup.f.c.c local2 = new com.tencent.mm.plugin.backup.f.c.c()
      {
        public final void a(final com.tencent.mm.plugin.backup.f.c paramAnonymousc)
        {
          GMTrace.i(9480469217280L, 70635);
          final long l2 = bg.Pv();
          c.a locala = c.b.this.iWi;
          long l3 = paramAnonymousc.afB();
          boolean bool3 = c.b.this.iWp;
          long l1 = locala.iWe.get();
          boolean bool1;
          label83:
          long l4;
          if (locala.iWe.get() >= 8388608L)
          {
            bool1 = true;
            if (locala.iWe.get() < 16777216L) {
              break label383;
            }
            bool2 = true;
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid %b inSize:%d sum:%d  [%b,%b]", new Object[] { Boolean.valueOf(bool3), Long.valueOf(l3), Long.valueOf(l1), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            if (locala.iWe.get() + l3 >= 8388608L) {
              locala.iWf.close();
            }
            if (locala.iWe.get() >= 16777216L) {
              locala.iWg.close();
            }
            l4 = bg.Pv();
            if (!locala.iWc.iVT)
            {
              long l5 = locala.iWe.get();
              if (!bool3) {
                break label389;
              }
              l1 = 16777216L;
              label217:
              if (l5 >= l1) {
                break label408;
              }
              locala.iWe.addAndGet(l3);
              l1 = bg.aH(l4);
              l4 = locala.iWe.get();
              if (locala.iWe.get() < 8388608L) {
                break label396;
              }
              bool1 = true;
              label269:
              if (locala.iWe.get() < 16777216L) {
                break label402;
              }
            }
          }
          label383:
          label389:
          label396:
          label402:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid Out:%d %b inSize:%d sum:%d  [%b,%b]", new Object[] { Long.valueOf(l1), Boolean.valueOf(bool3), Long.valueOf(l3), Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            c.b.this.iWh.offer(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9468121186304L, 70543);
                Assert.assertTrue(toString() + ", check running. ", c.b.this.iWp);
                long l1 = bg.Pv();
                paramAnonymousc.afx();
                long l2 = bg.Pv();
                w.i(c.b.this.TAG, "SendFileScene size:%d waitTime:%d netTime:%d [%s]", new Object[] { Integer.valueOf(paramAnonymousc.afB()), Long.valueOf(l2 - l2), Long.valueOf(l2 - l1), paramAnonymousc.jbv.jie });
                GMTrace.o(9468121186304L, 70543);
              }
              
              public final String toString()
              {
                GMTrace.i(9467986968576L, 70542);
                String str = c.b.this.TAG + ".sendFile";
                GMTrace.o(9467986968576L, 70542);
                return str;
              }
            });
            GMTrace.o(9480469217280L, 70635);
            return;
            bool1 = false;
            break;
            bool2 = false;
            break label83;
            l1 = 8388608L;
            break label217;
            bool1 = false;
            break label269;
          }
          label408:
          if (bool3) {}
          for (ac localac = locala.iWg;; localac = locala.iWf)
          {
            localac.bQd();
            break;
          }
        }
      };
      w.i(this.TAG, "postSendFile BIG:%b  baklst:%d Id:%s path:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.iWm.size()), paramString1, paramString2 });
      if (!TextUtils.isEmpty(paramString2))
      {
        this.iWl.add(paramString1);
        if (paramString1 != null)
        {
          com.tencent.mm.plugin.backup.f.c.a(this.iWq, local2, paramString1, paramString2, c.this.iVV.iVs);
          GMTrace.o(9467047444480L, 70535);
        }
      }
      else
      {
        if (this.iWm.isEmpty()) {
          break label180;
        }
      }
      label180:
      for (paramBoolean = bool;; paramBoolean = false)
      {
        Assert.assertTrue("chatMsgList should not empty", paramBoolean);
        if (paramString1 != null) {
          com.tencent.mm.plugin.backup.f.c.a(this.iWq, local2, paramString1, new LinkedList(this.iWm), c.this.iVV.iVs);
        }
        GMTrace.o(9467047444480L, 70535);
        return;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(9466510573568L, 70531);
      String str = this.TAG;
      GMTrace.o(9466510573568L, 70531);
      return str;
    }
  }
  
  private final class c
  {
    public LinkedBlockingQueue<Object> iWD;
    public ac iWE;
    public c.b iWF;
    private Runnable iWG;
    public c.a iWi;
    
    public c()
    {
      GMTrace.i(9468523839488L, 70546);
      this.iWD = new LinkedBlockingQueue();
      this.iWi = new c.a(c.this);
      this.iWE = new ac();
      this.iWF = null;
      this.iWG = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9479932346368L, 70631);
          while (!c.this.iVT)
          {
            Object localObject1 = null;
            try
            {
              localObject2 = c.c.this.iWD.poll(500L, TimeUnit.MILLISECONDS);
              localObject1 = localObject2;
            }
            catch (Exception localException2)
            {
              Object localObject2;
              c.b localb1;
              label150:
              label186:
              label277:
              label288:
              label439:
              label444:
              label449:
              for (;;) {}
            }
            w.d("MicroMsg.BackupPackAndSend", "TagQueue(%d)startNext obj:%s", new Object[] { Integer.valueOf(c.c.this.iWD.size()), localObject1 });
            if (localObject1 != null)
            {
              if (localObject1 == c.c.this.iWE)
              {
                c.c.this.iWE.open();
                GMTrace.o(9479932346368L, 70631);
                return;
              }
              localb1 = (c.b)localObject1;
              localb1.iWp = true;
              localObject2 = new StringBuilder("MicroMsg.BackupPackAndSend.tag");
              if (localb1.iWp)
              {
                localObject1 = "S.";
                localb1.TAG = ((String)localObject1 + localb1.iVz + "." + localb1.aDn);
                while (!c.this.iVT)
                {
                  localObject1 = null;
                  try
                  {
                    localObject2 = (Runnable)localb1.iWh.poll(500L, TimeUnit.MILLISECONDS);
                    localObject1 = localObject2;
                  }
                  catch (Exception localException1)
                  {
                    long l1;
                    int k;
                    long l2;
                    int i;
                    int j;
                    String str;
                    c.b localb2;
                    for (;;) {}
                  }
                  if (localObject1 != null)
                  {
                    l1 = bg.Pv();
                    ((Runnable)localObject1).run();
                    k = localb1.iWh.size();
                    l2 = c.c.this.iWi.iWe.get();
                    if (l2 < 8388608L) {
                      break label439;
                    }
                    i = 1;
                    if (l2 < 16777216L) {
                      break label444;
                    }
                    j = 1;
                    str = String.format("[%s,%s,%s]", new Object[] { Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j) });
                    l1 = bg.aH(l1);
                    localb2 = c.c.this.iWF;
                    if (c.c.this.iWF == null) {
                      break label449;
                    }
                  }
                }
              }
              for (localObject2 = Integer.valueOf(c.c.this.iWF.iWh.size());; localObject2 = "null")
              {
                w.d("MicroMsg.BackupPackAndSend", "workerQueue poll q:%d mem:%s rt:%d [%s,%s,%s,%s]", new Object[] { Integer.valueOf(k), str, Long.valueOf(l1), localObject1, localb1, localb2, localObject2 });
                if (localb1.iWp) {
                  break label186;
                }
                System.gc();
                break;
                localObject1 = "W.";
                break label150;
                i = 0;
                break label277;
                j = 0;
                break label288;
              }
            }
          }
          GMTrace.o(9479932346368L, 70631);
        }
      };
      com.tencent.mm.sdk.f.e.b(this.iWG, "TagWorker").start();
      GMTrace.o(9468523839488L, 70546);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */