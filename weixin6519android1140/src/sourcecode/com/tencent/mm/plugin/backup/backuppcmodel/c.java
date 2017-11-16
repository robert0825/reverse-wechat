package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.f.b.b;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.f.j;
import com.tencent.mm.plugin.backup.f.j.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class c
{
  static int gsq;
  public static boolean iYa;
  public aj iXZ;
  public final com.tencent.mm.ad.e iYb;
  public final com.tencent.mm.ad.e iYc;
  b.b iYg;
  final i.a iYh;
  final j.a iYi;
  public int jas;
  public String jat;
  String jau;
  int jav;
  public int jaw;
  public boolean jax;
  final b.c jay;
  
  static
  {
    GMTrace.i(9609720889344L, 71598);
    iYa = false;
    gsq = 2;
    GMTrace.o(9609720889344L, 71598);
  }
  
  public c()
  {
    GMTrace.i(9605962792960L, 71570);
    this.jas = 0;
    this.jax = true;
    this.iYb = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(18463124881408L, 137561);
        at.wS().b(595, c.this.iYb);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: other error[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          g.ork.a(400L, 101L, 1L, false);
          if ((paramAnonymousInt1 == 4) && (paramAnonymousInt2 == 63525)) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: INVALID URL");
          }
          b.afh().aei().iVu = -5;
          b.afh().afj().c(b.afh().aei());
          GMTrace.o(18463124881408L, 137561);
          return;
        }
        paramAnonymousString = ((com.tencent.mm.plugin.backup.f.e)paramAnonymousk).afC();
        at.AR();
        if (!bg.nl((String)com.tencent.mm.y.c.xh().get(2, null)).equals(paramAnonymousString.tSQ))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: not the same account");
          b.afh().aei().iVu = -5;
          b.afh().afj().c(b.afh().aei());
          g.ork.a(400L, 102L, 1L, false);
          GMTrace.o(18463124881408L, 137561);
          return;
        }
        if ((paramAnonymousString.tSO == null) || (paramAnonymousString.tSO.size() <= 0) || (paramAnonymousString.tSO.getFirst() == null))
        {
          paramAnonymousInt1 = paramAnonymousString.tSN;
          if (paramAnonymousString.tSO == null) {}
          for (paramAnonymousString = "null";; paramAnonymousString = paramAnonymousString.tSO.size())
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd AddrList is empty! AddrCount[%d], AddrList size[%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString });
            b.afh().aei().iVu = -5;
            b.afh().afj().c(b.afh().aei());
            g.ork.a(400L, 103L, 1L, false);
            GMTrace.o(18463124881408L, 137561);
            return;
          }
        }
        Object localObject = (nu)paramAnonymousString.tSO.getFirst();
        paramAnonymousk = ((nu)localObject).uez;
        paramAnonymousInt1 = ((Integer)((nu)localObject).ueA.getFirst()).intValue();
        localObject = c.this;
        ((c)localObject).jat = paramAnonymousString.tSR;
        ((c)localObject).jau = paramAnonymousk;
        ((c)localObject).jav = paramAnonymousInt1;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", new Object[] { Integer.valueOf(paramAnonymousString.jib), Integer.valueOf(paramAnonymousString.tOG), paramAnonymousString.tSR, paramAnonymousk, Integer.valueOf(paramAnonymousInt1) });
        b.afh().iVm = paramAnonymousString.ID;
        b.afh().iVn = paramAnonymousString.tSX;
        b.afh().iVo = paramAnonymousString.tSY;
        b.afh().iVs = paramAnonymousString.tSB.uNP.tJp;
        paramAnonymousString = c.this;
        com.tencent.mm.plugin.backup.f.b.ku(1);
        b.afh().aej();
        com.tencent.mm.plugin.backup.f.b.a(paramAnonymousString.iYg);
        com.tencent.mm.plugin.backup.f.b.a(paramAnonymousString.jay);
        com.tencent.mm.plugin.backup.f.b.a(b.afh().aeI());
        com.tencent.mm.plugin.backup.f.b.a(paramAnonymousString.iYi);
        com.tencent.mm.plugin.backup.f.b.a(paramAnonymousString.iYh);
        b.afh().aei().iVu = 1;
        paramAnonymousk = new Intent().setClassName(ab.getContext(), "com.tencent.mm.ui.LauncherUI");
        paramAnonymousk.addFlags(335544320);
        paramAnonymousk.putExtra("nofification_type", "back_to_pcmgr_notification");
        ab.getContext().startActivity(paramAnonymousk);
        c.iYa = false;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "startConnectPc, PC ip:%s, PC wifi:%s, Phone wifi:%s", new Object[] { paramAnonymousString.jau, paramAnonymousString.jat, h.bY(ab.getContext()) });
        c.gsq = 2;
        paramAnonymousString.afm();
        GMTrace.o(18463124881408L, 137561);
      }
    };
    this.iYc = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(18467285630976L, 137592);
        c.iYa = true;
        g.ork.i(13736, new Object[] { Integer.valueOf(0), c.this.jat, h.bY(ab.getContext()), Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
        com.tencent.mm.plugin.backup.f.b.b(1, c.this.iYc);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth failed, errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          switch (paramAnonymousInt2)
          {
          case -2: 
          default: 
            g.ork.a(400L, 106L, 1L, false);
          }
          for (;;)
          {
            g.ork.i(13737, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(c.this.jaw) });
            b.afh().aei().iVu = -5;
            b.afh().afj().c(b.afh().aei());
            GMTrace.o(18467285630976L, 137592);
            return;
            g.ork.a(400L, 104L, 1L, false);
            continue;
            g.ork.a(400L, 105L, 1L, false);
          }
        }
        paramAnonymousString = (com.tencent.mm.plugin.backup.f.a)paramAnonymousk;
        boolean bool1;
        if ((paramAnonymousString.jbh.jic & com.tencent.mm.plugin.backup.a.c.iVe) == 0)
        {
          bool1 = false;
          if ((paramAnonymousString.jbh.jic & com.tencent.mm.plugin.backup.a.c.iVf) != 0) {
            break label389;
          }
        }
        label389:
        for (boolean bool2 = false;; bool2 = true)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth success, pcSupportTimeSelect[%b], pcSupportQuickBackup[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          b.afh().afj().jaH = bool1;
          b.afh().afj().jaI = bool2;
          GMTrace.o(18467285630976L, 137592);
          return;
          bool1 = true;
          break;
        }
      }
    };
    this.jay = new b.c()
    {
      public final void a(boolean paramAnonymousBoolean, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte, int paramAnonymousInt2)
      {
        GMTrace.i(18467688284160L, 137595);
        int i;
        if (paramAnonymousArrayOfByte == null)
        {
          i = -1;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify isLocal[%b], type[%d], seq[%d], buf[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(i) });
          if ((!paramAnonymousBoolean) || (paramAnonymousArrayOfByte == null)) {
            break label273;
          }
          if (10011 == paramAnonymousInt1)
          {
            paramAnonymousInt1 = b.afh().aei().iVu;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify local disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            switch (paramAnonymousInt1)
            {
            }
          }
        }
        for (;;)
        {
          GMTrace.o(18467688284160L, 137595);
          return;
          i = paramAnonymousArrayOfByte.length;
          break;
          if (!c.iYa)
          {
            if (c.this.iXZ != null)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify stop backupConnectTimerHandler.");
              c.this.iXZ.stopTimer();
            }
            c.this.aeO();
            GMTrace.o(18467688284160L, 137595);
            return;
          }
          b.afh().aeI().stop();
          b.afh().aei().iVu = -4;
          b.afh().afj().c(b.afh().aei());
          GMTrace.o(18467688284160L, 137595);
          return;
          b.afh().aeI().stop();
        }
        label273:
        com.tencent.mm.plugin.backup.h.b localb;
        if (paramAnonymousInt1 == 17) {
          localb = new com.tencent.mm.plugin.backup.h.b();
        }
        for (;;)
        {
          try
          {
            localb.aD(paramAnonymousArrayOfByte);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive commandReq, command[%d]", new Object[] { Integer.valueOf(localb.jgO) });
            paramAnonymousInt2 = localb.jgO;
            switch (paramAnonymousInt2)
            {
            }
          }
          catch (Exception paramAnonymousArrayOfByte)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupPcProcessMgr", paramAnonymousArrayOfByte, "onBackupPcProcessMgrNotify buf to BackupCommandRequest error.", new Object[0]);
            continue;
            at.AR();
            if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vvQ, Boolean.valueOf(false))).booleanValue()) {
              continue;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not backuping, start new backup.");
            c.this.ky(5);
            continue;
            b.afh();
            paramAnonymousArrayOfByte = b.aen().getString("BACKUP_PC_CHOOSE_SESSION", null);
            if (paramAnonymousArrayOfByte != null) {
              continue;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify sessionString is null, start new backup.");
            c.this.ky(5);
            continue;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify start continue Backup.");
            g.ork.a(400L, 29L, 1L, false);
            c.this.jas = 3;
            paramAnonymousArrayOfByte = new LinkedList(Arrays.asList(h.bq(paramAnonymousArrayOfByte, ",")));
            b.afh().afj().init();
            b.afh().afj().A(paramAnonymousArrayOfByte);
            c.kB(5);
            b.afh().afj().aef();
            c.kA(6);
            paramAnonymousArrayOfByte = b.afh().afj();
            com.tencent.mm.plugin.backup.g.a.afG().afJ();
            paramAnonymousArrayOfByte.aQ(paramAnonymousArrayOfByte.iYn.size());
            continue;
            c.this.kz(3);
            continue;
            at.AR();
            if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vvR, Boolean.valueOf(false))).booleanValue()) {
              continue;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not recovering, start new recover.");
            c.this.kz(7);
            continue;
            b.afh().afk();
            if (d.aeM()) {
              continue;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify MsgDataIdList not exist, start new recover.");
            c.this.kz(7);
            continue;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify continue Recover.");
            g.ork.a(400L, 30L, 1L, false);
            c.this.jas = 4;
            b.afh().afk().init();
            c.kB(7);
            b.afh().afj().aef();
            c.kA(8);
            continue;
            GMTrace.o(18467688284160L, 137595);
          }
          if (paramAnonymousInt1 != 5) {
            continue;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive cancelReq");
          g.ork.i(13737, new Object[] { Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
          b.afh().aei().iVu = -100;
          b.afh().afj().c(b.afh().aei());
          GMTrace.o(18467688284160L, 137595);
          return;
          c.this.ky(1);
        }
      }
    };
    this.iYh = new i.a()
    {
      public final void xC()
      {
        GMTrace.i(18468225155072L, 137599);
        if (b.afh().aei().iVu <= 0)
        {
          GMTrace.o(18468225155072L, 137599);
          return;
        }
        b.afh().aeI().stop();
        if (1 == c.this.jas)
        {
          b.afh().afj().bK(true);
          b.afh().afj().kC(18);
          b.afh().aei().iVu = -4;
          b.afh().afj().c(b.afh().aei());
          GMTrace.o(18468225155072L, 137599);
          return;
        }
        if (2 == c.this.jas)
        {
          b.afh().afk().a(true, false, -4);
          b.afh().afk().kC(18);
        }
        GMTrace.o(18468225155072L, 137599);
      }
    };
    this.iYi = new j.a()
    {
      public final void aeR()
      {
        GMTrace.i(18463259099136L, 137562);
        f localf = b.afh().aei();
        if (localf.iVu == 14)
        {
          b.afh().afj().c(localf);
          GMTrace.o(18463259099136L, 137562);
          return;
        }
        if (localf.iVu == 23) {
          b.afh().afk().a(localf);
        }
        GMTrace.o(18463259099136L, 137562);
      }
    };
    this.iYg = new b.b()
    {
      public final void aeS()
      {
        GMTrace.i(18466346106880L, 137585);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "engineStopCallback ");
        if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
          com.tencent.mm.plugin.backup.f.b.afv().stop();
        }
        b.afh().aek();
        GMTrace.o(18466346106880L, 137585);
      }
    };
    GMTrace.o(9605962792960L, 71570);
  }
  
  public static void aeQ()
  {
    GMTrace.i(9606902317056L, 71577);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.afh().iVm;
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      GMTrace.o(9606902317056L, 71577);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCancelRequest to buf err.", new Object[0]);
      GMTrace.o(9606902317056L, 71577);
    }
  }
  
  public static String afn()
  {
    GMTrace.i(9607170752512L, 71579);
    if (com.tencent.mm.plugin.backup.f.b.afw() == null)
    {
      GMTrace.o(9607170752512L, 71579);
      return "0B";
    }
    String str = com.tencent.mm.plugin.backup.f.b.afw().afF();
    GMTrace.o(9607170752512L, 71579);
    return str;
  }
  
  public static void kA(int paramInt)
  {
    GMTrace.i(9606633881600L, 71575);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.backup.h.b localb = new com.tencent.mm.plugin.backup.h.b();
    localb.jgO = paramInt;
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(localb.toByteArray(), 17);
      GMTrace.o(9606633881600L, 71575);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandRequest to buf err.", new Object[0]);
      GMTrace.o(9606633881600L, 71575);
    }
  }
  
  public static void kB(int paramInt)
  {
    GMTrace.i(9606768099328L, 71576);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.backup.h.c localc = new com.tencent.mm.plugin.backup.h.c();
    localc.jgO = paramInt;
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(localc.toByteArray(), 18);
      GMTrace.o(9606768099328L, 71576);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandResponse to buf err.", new Object[0]);
      GMTrace.o(9606768099328L, 71576);
    }
  }
  
  public final void aeO()
  {
    GMTrace.i(16050024349696L, 119582);
    String str1 = this.jat;
    String str2 = this.jau;
    String str3 = h.bY(ab.getContext());
    b.afh().aeI().stop();
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "tryConnectFailed thisWifiName:%s, pcWifiName:%s, pcIpAddress:%s, tryCount:%d", new Object[] { str3, str1, str2, Integer.valueOf(gsq) });
    if ((str3 == null) || (str3.equals("")))
    {
      g.ork.a(400L, 1L, 1L, false);
      g.ork.i(13736, new Object[] { Integer.valueOf(1), str1, str3, Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
      b.afh().aei().iVu = -1;
      b.afh().afj().c(b.afh().aei());
      GMTrace.o(16050024349696L, 119582);
      return;
    }
    if ((str1 == null) || (!str1.equals(str3)))
    {
      g.ork.a(400L, 2L, 1L, false);
      g.ork.i(13736, new Object[] { Integer.valueOf(2), str1, str3, Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
      b.afh().aei().iVu = -2;
      b.afh().afj().c(b.afh().aei());
      GMTrace.o(16050024349696L, 119582);
      return;
    }
    if (!h.tf(str2))
    {
      g.ork.a(400L, 3L, 1L, false);
      g.ork.i(13736, new Object[] { Integer.valueOf(3), str1, str3, Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
      b.afh().aei().iVu = -3;
      b.afh().afj().c(b.afh().aei());
      GMTrace.o(16050024349696L, 119582);
      return;
    }
    if (gsq <= 0)
    {
      g.ork.a(400L, 63L, 1L, false);
      g.ork.i(13736, new Object[] { Integer.valueOf(6), str1, str3, Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
      b.afh().aei().iVu = -5;
      b.afh().afj().c(b.afh().aei());
      GMTrace.o(16050024349696L, 119582);
      return;
    }
    gsq -= 1;
    afm();
    GMTrace.o(16050024349696L, 119582);
  }
  
  final void afm()
  {
    GMTrace.i(18466882977792L, 137589);
    b.afh().aeI().connect(this.jau, this.jav);
    com.tencent.mm.plugin.backup.f.b.a(1, this.iYc);
    com.tencent.mm.plugin.backup.f.a locala = new com.tencent.mm.plugin.backup.f.a(b.afh().iVn, b.afh().iVo, com.tencent.mm.plugin.backup.a.e.aem(), b.afh().iVm, 0, 1);
    locala.de(true);
    locala.afx();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
    if (this.iXZ == null) {
      this.iXZ = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(18467822501888L, 137596);
          if (!c.iYa)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
            if (c.this.iXZ != null) {
              c.this.iXZ.stopTimer();
            }
            c.this.aeO();
          }
          GMTrace.o(18467822501888L, 137596);
          return true;
        }
      }, false);
    }
    this.iXZ.z(3000L, 3000L);
    GMTrace.o(18466882977792L, 137589);
  }
  
  public final void ky(int paramInt)
  {
    GMTrace.i(16050158567424L, 119583);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "newBackup, command[%d]", new Object[] { Integer.valueOf(paramInt) });
    this.jas = 1;
    b.afh().iVp = null;
    b.afh().afj().init();
    e locale = b.afh().afj();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcServer", "clearContinueBackupData.");
    locale.iYp.cY(false);
    kB(paramInt);
    b.afh().afj().aef();
    GMTrace.o(16050158567424L, 119583);
  }
  
  public final void kz(int paramInt)
  {
    GMTrace.i(16050292785152L, 119584);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupPcProcessMgr", "newRecover, command[%d]", new Object[] { Integer.valueOf(paramInt) });
    this.jas = 2;
    b.afh().iVp = null;
    b.afh().afk().init();
    b.afh().afk().aeN();
    kB(paramInt);
    d locald = b.afh().afk();
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(locald.jaA);
    af.t(new d.2(locald, localHashSet));
    GMTrace.o(16050292785152L, 119584);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */