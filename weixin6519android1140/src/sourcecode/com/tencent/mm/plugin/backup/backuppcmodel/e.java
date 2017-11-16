package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.b;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.f.i;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class e
{
  public static boolean iWT;
  private static boolean iYu;
  private b.b iVU;
  final com.tencent.mm.ad.e iYd;
  LinkedList<String> iYn;
  private com.tencent.mm.plugin.backup.b.b iYo;
  public com.tencent.mm.plugin.backup.b.c iYp;
  long iYq;
  long iYr;
  public Set<com.tencent.mm.plugin.backup.a.b.c> jaA;
  public b.a jaB;
  public boolean jaH;
  public boolean jaI;
  final com.tencent.mm.ad.e jaJ;
  private final com.tencent.mm.plugin.backup.f.b.c jaK;
  
  static
  {
    GMTrace.i(18463930187776L, 137567);
    iWT = false;
    iYu = false;
    GMTrace.o(18463930187776L, 137567);
  }
  
  public e()
  {
    GMTrace.i(9598178164736L, 71512);
    this.jaA = new HashSet();
    this.iYq = 0L;
    this.iYr = 0L;
    this.jaH = false;
    this.jaI = false;
    this.iYd = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(9596835987456L, 71502);
        com.tencent.mm.plugin.backup.f.b.b(3, e.this.iYd);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          com.tencent.mm.plugin.report.service.g.ork.a(400L, 107L, 1L, false);
          b.afh().aei().iVu = -5;
          e.this.c(b.afh().aei());
          GMTrace.o(9596835987456L, 71502);
          return;
        }
        w.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", new Object[] { paramAnonymousString });
        paramAnonymousString = ((com.tencent.mm.plugin.backup.f.g)paramAnonymousk).jbK;
        if (!b.afh().iVm.equals(paramAnonymousString.ID))
        {
          w.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
          com.tencent.mm.plugin.report.service.g.ork.a(400L, 107L, 1L, false);
          b.afh().aei().iVu = -5;
          e.this.c(b.afh().aei());
          GMTrace.o(9596835987456L, 71502);
          return;
        }
        b.afh().aei().iVx = paramAnonymousString.jhs;
        w.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", new Object[] { Long.valueOf(paramAnonymousString.jhs) });
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vvW, Boolean.valueOf(false));
        com.tencent.mm.plugin.backup.f.b.afv().start();
        paramAnonymousString = e.this;
        com.tencent.mm.plugin.backup.f.b.a(11, paramAnonymousString.jaJ);
        paramAnonymousk = new com.tencent.mm.plugin.backup.f.f(paramAnonymousString.iYn, paramAnonymousString.iYq, paramAnonymousString.iYr);
        w.i("MicroMsg.BackupPcServer", "backupPcSendRequestSession, chooseConvNames size[%d]", new Object[] { Integer.valueOf(paramAnonymousString.iYn.size()) });
        paramAnonymousk.afx();
        GMTrace.o(9596835987456L, 71502);
      }
    };
    this.jaJ = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(18462722228224L, 137558);
        com.tencent.mm.plugin.backup.f.b.b(11, e.this.jaJ);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.BackupPcServer", "requestSessionSceneEnd sessionName or timeInterval null or request session resp number error, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          com.tencent.mm.plugin.report.service.g.ork.a(400L, 108L, 1L, false);
          e.this.bK(false);
          b.afh().aei().iVu = -5;
          e.this.c(b.afh().aei());
          GMTrace.o(18462722228224L, 137558);
          return;
        }
        paramAnonymousk = (com.tencent.mm.plugin.backup.f.f)paramAnonymousk;
        paramAnonymousString = paramAnonymousk.jbI.jhe;
        Object localObject = paramAnonymousk.jbI.jhf;
        paramAnonymousk = new LinkedList();
        HashSet localHashSet = new HashSet();
        localObject = ((LinkedList)localObject).iterator();
        long l3 = 0L;
        long l1 = 0L;
        paramAnonymousInt1 = 0;
        while (paramAnonymousInt1 < paramAnonymousString.size())
        {
          long l2 = l1;
          if (((Iterator)localObject).hasNext())
          {
            long l4 = ((Long)((Iterator)localObject).next()).longValue();
            l3 = l4;
            l2 = l1;
            if (((Iterator)localObject).hasNext())
            {
              l2 = ((Long)((Iterator)localObject).next()).longValue();
              l3 = l4;
            }
          }
          localHashSet.add(paramAnonymousString.get(paramAnonymousInt1));
          paramAnonymousk.add(new com.tencent.mm.plugin.backup.a.g(localHashSet.size() - 1, (String)paramAnonymousString.get(paramAnonymousInt1), l3, l2));
          paramAnonymousInt1 += 1;
          l1 = l2;
        }
        w.i("MicroMsg.BackupPcServer", "requestSessionSceneEnd receive requestsessionResp, backupSessionList size[%d]", new Object[] { Integer.valueOf(paramAnonymousk.size()) });
        e.this.iYp.a(paramAnonymousk, b.afh().afi().jaw, b.afh().aei().iVx, e.iWT);
        GMTrace.o(18462722228224L, 137558);
      }
    };
    this.jaK = new com.tencent.mm.plugin.backup.f.b.c()
    {
      public final void a(boolean paramAnonymousBoolean, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte, int paramAnonymousInt2)
      {
        GMTrace.i(18468762025984L, 137603);
        int i;
        if (paramAnonymousArrayOfByte == null)
        {
          i = -1;
          w.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify isLocal[%b], type[%d], seq[%d], buf[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(i) });
          if ((!paramAnonymousBoolean) || (paramAnonymousArrayOfByte == null)) {
            break label385;
          }
          if (10011 == paramAnonymousInt1)
          {
            paramAnonymousInt1 = b.afh().aei().iVu;
            w.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify local disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            switch (paramAnonymousInt1)
            {
            }
          }
        }
        for (;;)
        {
          GMTrace.o(18468762025984L, 137603);
          return;
          i = paramAnonymousArrayOfByte.length;
          break;
          b.afh().aeI().stop();
          b.afh().aei().iVu = -100;
          e.this.c(b.afh().aei());
          GMTrace.o(18468762025984L, 137603);
          return;
          b.afh().aeI().stop();
          GMTrace.o(18468762025984L, 137603);
          return;
          b.afh().aeI().stop();
          b.afh().aei().iVu = -100;
          e.this.c(b.afh().aei());
          GMTrace.o(18468762025984L, 137603);
          return;
          e.this.bK(true);
          b.afh().aeI().stop();
          b.afh().aei().iVu = -4;
          e.this.c(b.afh().aei());
          com.tencent.mm.plugin.report.service.g.ork.a(400L, 9L, 1L, false);
          e.this.kC(3);
          GMTrace.o(18468762025984L, 137603);
          return;
          e.this.bK(true);
        }
        label385:
        if ((1 == b.afh().afi().jas) || (3 == b.afh().afi().jas))
        {
          if (paramAnonymousInt1 == 10)
          {
            w.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive heartbeatResp");
            com.tencent.mm.plugin.backup.h.f localf = new com.tencent.mm.plugin.backup.h.f();
            try
            {
              localf.aD(paramAnonymousArrayOfByte);
              GMTrace.o(18468762025984L, 137603);
              return;
            }
            catch (Exception paramAnonymousArrayOfByte)
            {
              w.printErrStackTrace("MicroMsg.BackupPcServer", paramAnonymousArrayOfByte, "onBackupPcServerNotify buf to BackupHeartBeatResponse error.", new Object[0]);
              GMTrace.o(18468762025984L, 137603);
              return;
            }
          }
          if (paramAnonymousInt1 == 5)
          {
            w.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive cancelReq");
            e.this.bK(true);
            b.afh().aei().iVu = -100;
            e.this.c(b.afh().aei());
            e.this.kC(5);
            GMTrace.o(18468762025984L, 137603);
            return;
          }
          if (paramAnonymousInt1 == 18)
          {
            w.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandResp");
            GMTrace.o(18468762025984L, 137603);
            return;
          }
        }
        GMTrace.o(18468762025984L, 137603);
      }
    };
    this.iVU = new b.b()
    {
      public final void a(final com.tencent.mm.plugin.backup.a.f paramAnonymousf)
      {
        GMTrace.i(18469298896896L, 137607);
        b.afh().aei().b(paramAnonymousf);
        final HashSet localHashSet = new HashSet();
        localHashSet.addAll(e.this.jaA);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18466614542336L, 137587);
            Iterator localIterator = localHashSet.iterator();
            while (localIterator.hasNext()) {
              ((com.tencent.mm.plugin.backup.a.b.c)localIterator.next()).a(paramAnonymousf);
            }
            GMTrace.o(18466614542336L, 137587);
          }
        });
        if (e.this.jaB != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18467151413248L, 137591);
              if (e.this.jaB != null) {
                e.this.jaB.aed();
              }
              GMTrace.o(18467151413248L, 137591);
            }
          });
        }
        GMTrace.o(18469298896896L, 137607);
      }
      
      public final void aee()
      {
        GMTrace.i(18469433114624L, 137608);
        w.i("MicroMsg.BackupPcServer", "onBackupPackAndSendCallback onCancel, isSelf[%b]", new Object[] { Boolean.valueOf(false) });
        e.this.bK(false);
        GMTrace.o(18469433114624L, 137608);
      }
    };
    GMTrace.o(9598178164736L, 71512);
  }
  
  public static void d(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    GMTrace.i(18463527534592L, 137564);
    w.i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong1 = 0L;
      paramLong2 = 0L;
    }
    b.afh();
    SharedPreferences.Editor localEditor = b.aen().edit();
    if (1 == b.afh().afi().jas)
    {
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", paramInt1);
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", paramLong1);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", paramLong2);
    }
    localEditor.commit();
    GMTrace.o(18463527534592L, 137564);
  }
  
  public final void A(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18463393316864L, 137563);
    this.iYn = paramLinkedList;
    b.afh();
    label97:
    int i;
    label103:
    SharedPreferences.Editor localEditor;
    if (b.aen().getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1)
    {
      iYu = true;
      b.afh();
      this.iYq = b.aen().getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      b.afh();
      this.iYr = b.aen().getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      b.afh();
      if (b.aen().getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) != 1) {
        break label251;
      }
      iWT = true;
      if (paramLinkedList != null) {
        break label258;
      }
      i = -1;
      w.i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", new Object[] { Integer.valueOf(i), Boolean.valueOf(iYu), Boolean.valueOf(iWT), Long.valueOf(this.iYq), Long.valueOf(this.iYr) });
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvQ, Boolean.valueOf(true));
      if (1 == b.afh().afi().jas)
      {
        b.afh();
        localEditor = b.aen().edit();
        if (paramLinkedList != null) {
          break label266;
        }
      }
    }
    label251:
    label258:
    label266:
    for (paramLinkedList = new String[0];; paramLinkedList = (String[])paramLinkedList.toArray(new String[paramLinkedList.size()]))
    {
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", h.a("", ",", paramLinkedList));
      localEditor.commit();
      GMTrace.o(18463393316864L, 137563);
      return;
      iYu = false;
      break;
      iWT = false;
      break label97;
      i = paramLinkedList.size();
      break label103;
    }
  }
  
  public final void aQ(long paramLong)
  {
    int i = 3;
    GMTrace.i(9598715035648L, 71516);
    w.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
    com.tencent.mm.plugin.backup.f.b.a(3, this.iYd);
    com.tencent.mm.plugin.backup.f.g localg = new com.tencent.mm.plugin.backup.f.g(b.afh().iVm);
    Object localObject = new PLong();
    PLong localPLong = new PLong();
    at.AR();
    h.a(0L, (PLong)localObject, localPLong, com.tencent.mm.y.c.zo());
    if (iWT) {}
    for (;;)
    {
      localObject = h.aP(localPLong.value);
      localg.jbJ.jhs = 0L;
      localg.jbJ.jht = paramLong;
      localg.jbJ.jhu = 0L;
      localg.jbJ.jhv = ((m)localObject);
      localg.jbJ.jhw = 0L;
      localg.jbJ.jhx = i;
      w.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      localg.afx();
      GMTrace.o(9598715035648L, 71516);
      return;
      at.AR();
      if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vvW, Boolean.valueOf(false))).booleanValue()) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  public final void aef()
  {
    GMTrace.i(9598983471104L, 71518);
    final HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.jaA);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9604754833408L, 71561);
        Iterator localIterator = localHashSet.iterator();
        while (localIterator.hasNext()) {
          ((com.tencent.mm.plugin.backup.a.b.c)localIterator.next()).aef();
        }
        GMTrace.o(9604754833408L, 71561);
      }
    });
    GMTrace.o(9598983471104L, 71518);
  }
  
  public final void bK(boolean paramBoolean)
  {
    GMTrace.i(9598446600192L, 71514);
    w.i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", new Object[] { Boolean.valueOf(paramBoolean), ah.bQk() });
    if (!paramBoolean)
    {
      b.afh().afi();
      c.aeQ();
      kC(4);
    }
    this.iYp.iVT = true;
    if (this.iYo != null)
    {
      this.iYo.cancel();
      this.iYo = null;
    }
    if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
      com.tencent.mm.plugin.backup.f.b.afv().stop();
    }
    if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
      com.tencent.mm.plugin.backup.f.b.afw().stop();
    }
    Boolean localBoolean = com.tencent.mm.plugin.backup.g.a.afG().afH().jcJ;
    if (localBoolean == null) {}
    for (Object localObject = "null";; localObject = localBoolean)
    {
      w.i("MicroMsg.BackupPcServer", "cancel, isTempDb[%s]", new Object[] { localObject });
      if (localBoolean != null) {
        com.tencent.mm.plugin.backup.g.a.afG().n(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18466211889152L, 137584);
            w.i("MicroMsg.BackupPcServer", "backupChatRunnable backupcloseTempDB end");
            w.bPM();
            GMTrace.o(18466211889152L, 137584);
          }
        });
      }
      GMTrace.o(9598446600192L, 71514);
      return;
    }
  }
  
  public final void c(com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(18463795970048L, 137566);
    this.iVU.a(paramf);
    GMTrace.o(18463795970048L, 137566);
  }
  
  public final void init()
  {
    GMTrace.i(9598312382464L, 71513);
    w.i("MicroMsg.BackupPcServer", "init.");
    com.tencent.mm.plugin.backup.f.b.a(this.jaK);
    this.iYp = new com.tencent.mm.plugin.backup.b.c(b.afh(), 1, this.iVU);
    this.iYp.iVT = false;
    GMTrace.o(9598312382464L, 71513);
  }
  
  public final void kC(int paramInt)
  {
    GMTrace.i(18463661752320L, 137565);
    long l1 = 0L;
    if (this.iYp != null) {
      if (this.iYp.iVX != 0L) {
        l1 = bg.aH(this.iYp.iVX);
      }
    }
    for (long l2 = this.iYp.iVW;; l2 = 0L)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l2 / 1024L), Long.valueOf(l1 / 1000L), Integer.valueOf(1), Integer.valueOf(b.afh().afi().jaw) });
      w.i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d], backupCostTime[%d]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(l2), Long.valueOf(l1) });
      GMTrace.o(18463661752320L, 137565);
      return;
      l1 = 0L;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */