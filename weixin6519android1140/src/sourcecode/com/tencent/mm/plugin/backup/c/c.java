package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.a.a;
import com.tencent.mm.plugin.backup.f.b.b;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.f.j.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.ag;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c
  implements b.d, b.c
{
  public static int gsq;
  public static boolean iYa;
  public long eJe;
  String esG;
  public boolean guN;
  public b.d iWP;
  public boolean iWT;
  private com.tencent.mm.plugin.backup.b.e iXA;
  LinkedList<String> iXB;
  LinkedList<Long> iXC;
  private LinkedList<String> iXD;
  private LinkedList<Long> iXE;
  public b.a iXF;
  HashSet<String> iXG;
  public long iXH;
  public long iXI;
  int iXJ;
  long iXK;
  int iXL;
  long iXM;
  int iXN;
  boolean iXO;
  HashSet<String> iXP;
  public int iXQ;
  public boolean iXR;
  public boolean iXS;
  public boolean iXT;
  public boolean iXU;
  boolean iXV;
  public String iXW;
  String iXX;
  int iXY;
  public aj iXZ;
  public final com.tencent.mm.ad.e iYb;
  public final com.tencent.mm.ad.e iYc;
  public final com.tencent.mm.ad.e iYd;
  public long iYe;
  int iYf;
  b.b iYg;
  public final i.a iYh;
  public final j.a iYi;
  private Object lock;
  long recvSize;
  
  static
  {
    GMTrace.i(9552946790400L, 71175);
    iYa = false;
    gsq = 0;
    GMTrace.o(9552946790400L, 71175);
  }
  
  public c()
  {
    GMTrace.i(9546504339456L, 71127);
    this.eJe = 0L;
    this.recvSize = 0L;
    this.lock = new Object();
    this.guN = false;
    this.iXG = new HashSet();
    this.iXH = 0L;
    this.iXI = 0L;
    this.iXJ = 0;
    this.iXK = 0L;
    this.iXL = 0;
    this.iXM = 0L;
    this.iXN = 0;
    this.iXO = true;
    this.iXP = new HashSet();
    this.iXQ = 0;
    this.iXR = false;
    this.iXS = true;
    this.iXT = true;
    this.iWT = false;
    this.iXU = false;
    this.iXV = false;
    this.iYb = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(18805111652352L, 140109);
        at.wS().b(595, c.this.iYb);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info other error [%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 4) && (paramAnonymousInt2 == 63525)) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info: INVALID URL");
          }
          b.aeH().aei().iVu = -5;
          c.this.a(b.aeH().aei());
          GMTrace.o(18805111652352L, 140109);
          return;
        }
        paramAnonymousk = ((com.tencent.mm.plugin.backup.f.e)paramAnonymousk).afC();
        at.AR();
        if (!bg.nl((String)com.tencent.mm.y.c.xh().get(2, null)).equals(paramAnonymousk.tSQ))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnectinfo not the same account");
          b.aeH().aei().iVu = -5;
          c.this.a(b.aeH().aei());
          GMTrace.o(18805111652352L, 140109);
          return;
        }
        b.aeH().iVm = paramAnonymousk.ID;
        b.aeH().iVn = paramAnonymousk.tSX;
        b.aeH().iVo = paramAnonymousk.tSY;
        com.tencent.mm.plugin.backup.f.b.a(c.this.iYg);
        b.aeH().aej();
        com.tencent.mm.plugin.backup.f.b.a(b.aeH().aeK());
        com.tencent.mm.plugin.backup.f.b.a(b.aeH().aeI());
        com.tencent.mm.plugin.backup.f.b.ku(2);
        com.tencent.mm.plugin.backup.f.b.a(c.this.iYi);
        com.tencent.mm.plugin.backup.f.b.a(c.this.iYh);
        paramAnonymousInt1 = 0;
        Object localObject;
        if (paramAnonymousk.tSN > 0)
        {
          localObject = (nu)paramAnonymousk.tSO.getFirst();
          paramAnonymousString = ((nu)localObject).uez;
          paramAnonymousInt1 = ((Integer)((nu)localObject).ueA.getFirst()).intValue();
        }
        for (;;)
        {
          localObject = c.this;
          ((c)localObject).iXW = paramAnonymousk.tSR;
          ((c)localObject).iXX = paramAnonymousString;
          ((c)localObject).iXY = paramAnonymousInt1;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", new Object[] { Integer.valueOf(paramAnonymousk.jib), Integer.valueOf(paramAnonymousk.tOG), paramAnonymousk.tSR, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
          com.tencent.mm.plugin.backup.a.e.ku(22);
          b.aeH().aei().iVu = 1;
          localObject = new Intent().setClassName(ab.getContext(), "com.tencent.mm.ui.LauncherUI");
          ((Intent)localObject).addFlags(335544320);
          ((Intent)localObject).putExtra("nofification_type", "backup_move_notification");
          ab.getContext().startActivity((Intent)localObject);
          com.tencent.mm.plugin.report.service.g.ork.a(485L, 41L, 1L, false);
          c.iYa = false;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak try connct old phone, oldphone ip:%s, oldphone wifi:%s, newphone wifi:%s", new Object[] { paramAnonymousString, paramAnonymousk.tSR, h.bY(ab.getContext()) });
          c.gsq = 2;
          c.this.aB(paramAnonymousString, paramAnonymousInt1);
          GMTrace.o(18805111652352L, 140109);
          return;
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak address convMsgCount is empty");
          paramAnonymousString = null;
        }
      }
    };
    this.iYc = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(18805648523264L, 140113);
        c.iYa = true;
        com.tencent.mm.plugin.report.service.g.ork.a(485L, 42L, 1L, false);
        com.tencent.mm.plugin.backup.f.b.b(1, c.this.iYc);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak auth failed");
          b.aeH().aei().iVu = -5;
          c.this.a(b.aeH().aei());
          GMTrace.o(18805648523264L, 140113);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak auth success");
        paramAnonymousk = (com.tencent.mm.plugin.backup.f.a)paramAnonymousk;
        if (paramAnonymousk.jbh.jia < com.tencent.mm.plugin.backup.a.c.iUZ)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak start old move, version:%d", new Object[] { Integer.valueOf(paramAnonymousk.jbh.jia) });
          com.tencent.mm.plugin.report.service.g.ork.a(485L, 102L, 1L, false);
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVm = b.aeH().iVm;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVn = b.aeH().iVn;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVo = b.aeH().iVo;
          com.tencent.mm.plugin.backup.a.e.ku(-22);
          com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afY());
          b.aeH().aei().iVu = 3;
          c.this.a(b.aeH().aei());
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afY().a(false, c.this.iXW, c.this.iXX, c.this.iXY);
          paramAnonymousString = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afY();
          paramAnonymousString.iXS = paramAnonymousk.afu();
          paramAnonymousString.jef = true;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "auth ok and request bakStart");
          com.tencent.mm.plugin.backup.f.b.a(3, paramAnonymousString);
          com.tencent.mm.plugin.backup.g.a.afG().afJ();
          paramAnonymousk = new PLong();
          PLong localPLong1 = new PLong();
          PLong localPLong2 = new PLong();
          at.AR();
          paramAnonymousInt1 = com.tencent.mm.a.e.aY(com.tencent.mm.y.c.xe());
          at.AR();
          paramAnonymousk.value = (paramAnonymousInt1 + com.tencent.mm.a.e.aY(com.tencent.mm.y.c.xf()));
          long l = paramAnonymousk.value;
          at.AR();
          com.tencent.mm.plugin.backup.bakoldlogic.a.d.a(l, localPLong1, localPLong2, com.tencent.mm.y.c.zo());
          paramAnonymousString.jeq = (localPLong2.value - paramAnonymousk.value);
          paramAnonymousString.jer = localPLong1.value;
          new com.tencent.mm.plugin.backup.bakoldlogic.b.b(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVm).afx();
          GMTrace.o(18805648523264L, 140113);
          return;
        }
        paramAnonymousInt1 = paramAnonymousk.jbh.jib;
        c.this.iXS = paramAnonymousk.afu();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak start new move, version:%d, type:%d, isServerSupportKv:%b", new Object[] { Integer.valueOf(paramAnonymousk.jbh.jia), Integer.valueOf(paramAnonymousInt1), Boolean.valueOf(c.this.iXS) });
        if (paramAnonymousInt1 == com.tencent.mm.plugin.backup.a.c.iVa)
        {
          c.this.aeN();
          c.this.iXU = false;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak is Normal move.");
        }
        for (;;)
        {
          paramAnonymousString = c.this;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover init");
          paramAnonymousString.eJe = 0L;
          paramAnonymousString.recvSize = 0L;
          paramAnonymousString.guN = false;
          paramAnonymousString.iXG.clear();
          paramAnonymousString.iXO = true;
          paramAnonymousString.iXK = 0L;
          paramAnonymousString.iXP.clear();
          com.tencent.mm.plugin.backup.f.b.a(3, c.this.iYd);
          new com.tencent.mm.plugin.backup.f.g(b.aeH().iVm).afx();
          b.aeH().aei().iVu = 22;
          c.this.a(b.aeH().aei());
          GMTrace.o(18805648523264L, 140113);
          return;
          if (paramAnonymousInt1 == com.tencent.mm.plugin.backup.a.c.iVb)
          {
            c.this.iXU = true;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak is Resume Move!!!.");
          }
        }
      }
    };
    this.iYd = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(14820992614400L, 110425);
        com.tencent.mm.plugin.backup.f.b.b(3, c.this.iYd);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:" + paramAnonymousString);
          b.aeH().aei().iVu = -5;
          c.this.a(b.aeH().aei());
          GMTrace.o(14820992614400L, 110425);
          return;
        }
        paramAnonymousString = (com.tencent.mm.plugin.backup.f.g)paramAnonymousk;
        paramAnonymousk = paramAnonymousString.jbK;
        if (!b.aeH().iVm.equals(paramAnonymousk.ID))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
          b.aeH().aei().iVu = -5;
          c.this.a(b.aeH().aei());
          GMTrace.o(14820992614400L, 110425);
          return;
        }
        b.aeH().aei().iVx = paramAnonymousk.jhs;
        c.this.esG = paramAnonymousString.jbK.jhv.jhl;
        c.this.eJe = paramAnonymousString.jbK.jhz;
        c.this.iXI = paramAnonymousString.jbK.jhy;
        c.this.iXQ = paramAnonymousString.jbK.jhB;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover total:%d, convDataSize:%d, and wait old mobile's pushData", new Object[] { Long.valueOf(paramAnonymousString.jbK.jhy), Long.valueOf(paramAnonymousString.jbK.jhz) });
        label363:
        label382:
        long l;
        if ((c.this.iXT) && (c.this.iXS))
        {
          paramAnonymousk = com.tencent.mm.plugin.report.service.g.ork;
          if ((c.this.iXR) || (c.this.iXQ == 1))
          {
            paramAnonymousInt1 = 66;
            paramAnonymousk.a(485L, paramAnonymousInt1, 1L, false);
          }
        }
        else
        {
          if (paramAnonymousString.jbK.jhx != 3) {
            break label580;
          }
          paramAnonymousInt1 = 1;
          if (paramAnonymousInt1 == 0) {
            break label585;
          }
          c.this.iWT = true;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
          paramAnonymousString = new PLong();
          paramAnonymousk = new PLong();
          at.AR();
          h.a(0L, paramAnonymousString, paramAnonymousk, com.tencent.mm.y.c.zo());
          l = c.this.eJe;
          if (c.this.eJe * 0.1D <= 5.24288E8D) {
            break label596;
          }
        }
        label580:
        label585:
        label596:
        for (double d = 5.24288E8D;; d = c.this.eJe * 0.1D)
        {
          l = d + l;
          c.this.iYe = l;
          if (paramAnonymousk.value >= l) {
            break label613;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", new Object[] { Long.valueOf(paramAnonymousk.value), Long.valueOf(l), Long.valueOf(c.this.eJe) });
          b.aeH().aeI().stop();
          b.aeH().aei().iVu = -13;
          c.this.a(b.aeH().aei());
          com.tencent.mm.plugin.report.service.g.ork.a(485L, 5L, 1L, false);
          GMTrace.o(14820992614400L, 110425);
          return;
          paramAnonymousInt1 = 65;
          break;
          paramAnonymousInt1 = 0;
          break label363;
          c.this.iWT = false;
          break label382;
        }
        label613:
        c.this.iXH = bg.Pv();
        GMTrace.o(14820992614400L, 110425);
      }
    };
    this.iYg = new b.b()
    {
      public final void aeS()
      {
        GMTrace.i(18806319611904L, 140118);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "stopCallback ");
        if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
          com.tencent.mm.plugin.backup.f.b.afv().stop();
        }
        b.aeH().aek();
        GMTrace.o(18806319611904L, 140118);
      }
    };
    this.iYh = new i.a()
    {
      public final void xC()
      {
        GMTrace.i(18806453829632L, 140119);
        if (b.aeH().aei().iVu <= 0)
        {
          GMTrace.o(18806453829632L, 140119);
          return;
        }
        c.this.a(true, false, -4);
        b.aeH().aeI().stop();
        GMTrace.o(18806453829632L, 140119);
      }
    };
    this.iYi = new j.a()
    {
      public final void aeR()
      {
        GMTrace.i(18805245870080L, 140110);
        c.this.a(b.aeH().aei());
        GMTrace.o(18805245870080L, 140110);
      }
    };
    GMTrace.o(9546504339456L, 71127);
  }
  
  public static void R(byte[] paramArrayOfByte)
  {
    GMTrace.i(16049621696512L, 119579);
    com.tencent.mm.plugin.backup.h.af localaf = (com.tencent.mm.plugin.backup.h.af)h.a(new com.tencent.mm.plugin.backup.h.af(), paramArrayOfByte);
    if (localaf == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
      GMTrace.o(16049621696512L, 119579);
      return;
    }
    paramArrayOfByte = new ag();
    paramArrayOfByte.jiw = localaf.jiw;
    paramArrayOfByte.jiy = localaf.jiy;
    paramArrayOfByte.jix = localaf.jix;
    paramArrayOfByte.jha = localaf.jha;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "send SvrID resp");
      com.tencent.mm.plugin.backup.f.b.r(paramArrayOfByte.toByteArray(), 14);
      GMTrace.o(16049621696512L, 119579);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "buf to PacketSvrIDResponse err.", new Object[0]);
      GMTrace.o(16049621696512L, 119579);
    }
  }
  
  public static boolean aeM()
  {
    GMTrace.i(9546772774912L, 71129);
    boolean bool = at.AR().zz().bSl();
    GMTrace.o(9546772774912L, 71129);
    return bool;
  }
  
  public static String aeP()
  {
    GMTrace.i(9548114952192L, 71139);
    String str = com.tencent.mm.plugin.backup.f.b.afw().afF();
    GMTrace.o(9548114952192L, 71139);
    return str;
  }
  
  static void aeQ()
  {
    GMTrace.i(9548249169920L, 71140);
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.aeH().iVm;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      GMTrace.o(9548249169920L, 71140);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
      GMTrace.o(9548249169920L, 71140);
    }
  }
  
  static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(9547846516736L, 71137);
    y localy = new y();
    localy.jie = paramString;
    localy.jif = paramInt1;
    localy.jih = paramInt2;
    localy.jii = paramInt3;
    localy.jhA = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.f.b.d(localy.toByteArray(), 7, paramInt5);
      GMTrace.o(9547846516736L, 71137);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "sendResp", new Object[0]);
      GMTrace.o(9547846516736L, 71137);
    }
  }
  
  public final void a(final com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14825421799424L, 110458);
    if (this.iWP != null) {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18805916958720L, 140115);
          if (c.this.iWP != null) {
            c.this.iWP.a(paramf);
          }
          GMTrace.o(18805916958720L, 140115);
        }
      });
    }
    if (this.iXF != null) {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14829448331264L, 110488);
          if (c.this.iXF != null) {
            c.this.iXF.aed();
          }
          GMTrace.o(14829448331264L, 110488);
        }
      });
    }
    GMTrace.o(14825421799424L, 110458);
  }
  
  public final void a(boolean paramBoolean, final int paramInt1, final byte[] paramArrayOfByte, final int paramInt2)
  {
    GMTrace.i(9547578081280L, 71135);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (10011 != paramInt1)) {
        break label392;
      }
      paramInt1 = b.aeH().aei().iVu;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(paramInt1) });
      switch (paramInt1)
      {
      }
    }
    long l;
    for (;;)
    {
      GMTrace.o(9547578081280L, 71135);
      return;
      i = paramArrayOfByte.length;
      break;
      b.aeH().aeI().stop();
      if (!iYa)
      {
        if (this.iXZ != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "stop backupConnectTimerHandler.");
          this.iXZ.stopTimer();
        }
        aeO();
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      b.aeH().aei().iVu = -4;
      a(b.aeH().aei());
      GMTrace.o(9547578081280L, 71135);
      return;
      b.aeH().aeI().stop();
      GMTrace.o(9547578081280L, 71135);
      return;
      a(true, false, -4);
      b.aeH().aeI().stop();
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 43L, 1L, false);
      l = 0L;
      if (this.iXH != 0L) {
        l = bg.aH(this.iXH);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", new Object[] { Long.valueOf(this.eJe), Long.valueOf(l) });
      GMTrace.o(9547578081280L, 71135);
      return;
      a(true, false, 0);
    }
    label392:
    if (paramInt1 == 9)
    {
      com.tencent.mm.plugin.backup.h.e locale = (com.tencent.mm.plugin.backup.h.e)h.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
      if (locale == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat req, req:%s ack:%d", new Object[] { locale, Long.valueOf(locale.jbP) });
      paramArrayOfByte = new com.tencent.mm.plugin.backup.h.f();
      paramArrayOfByte.jbP = locale.jbP;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send heartbeat resp");
        com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 10, paramInt2);
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
        GMTrace.o(9547578081280L, 71135);
        return;
      }
    }
    if (paramInt1 == 10)
    {
      paramArrayOfByte = (com.tencent.mm.plugin.backup.h.f)h.a(new com.tencent.mm.plugin.backup.h.f(), paramArrayOfByte);
      if (paramArrayOfByte != null) {}
      for (l = paramArrayOfByte.jbP;; l = -1L)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat response, resp:%s ack:%d", new Object[] { paramArrayOfByte, Long.valueOf(l) });
        GMTrace.o(9547578081280L, 71135);
        return;
      }
    }
    if (paramInt1 == 5) {
      a(true, false, -100);
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18806722265088L, 140121);
        Object localObject1;
        Object localObject2;
        int i;
        Object localObject3;
        if (paramInt1 == 11)
        {
          localObject1 = c.this;
          localObject2 = paramArrayOfByte;
          i = paramInt2;
          if (b.aeH().aei().iVu == -13)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "receive requestSession request, but no enough space for recover, quit.");
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          localObject3 = (com.tencent.mm.plugin.backup.h.i)h.a(new com.tencent.mm.plugin.backup.h.i(), (byte[])localObject2);
          if (localObject3 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "requestSessionListNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject2)) });
            b.aeH().aei().iVu = -21;
            ((c)localObject1).a(b.aeH().aei());
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive requestSession request, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.h.i)localObject3).jhe.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.h.i)localObject3).jhf.size()) });
          ((c)localObject1).iXB = ((com.tencent.mm.plugin.backup.h.i)localObject3).jhe;
          ((c)localObject1).iXC = ((com.tencent.mm.plugin.backup.h.i)localObject3).jhf;
          if (((c)localObject1).iXC.size() != ((c)localObject1).iXB.size() * 2)
          {
            c.aeQ();
            b.aeH().aei().iVu = -21;
            ((c)localObject1).a(b.aeH().aei());
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          ((c)localObject1).iYf = i;
          if (!((c)localObject1).iXU)
          {
            localObject3 = at.AR().zx();
            localObject2 = ((c)localObject1).esG;
            String str = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + (String)localObject2 + "\"";
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BackupMoveTimeStorage", "getCountByDevice:" + str);
            localObject3 = ((com.tencent.mm.storage.j)localObject3).fTZ.rawQuery(str, null);
            if (localObject3 == null)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveTimeStorage", "getCountByDevice failed, deviceid:%s", new Object[] { localObject2 });
              l1 = 0L;
            }
            while (l1 > 0L)
            {
              b.aeH().aei().iVu = 52;
              ((c)localObject1).a(b.aeH().aei());
              GMTrace.o(18806722265088L, 140121);
              return;
              l1 = ((Cursor)localObject3).getCount();
              ((Cursor)localObject3).close();
            }
            ((c)localObject1).cZ(true);
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          ((c)localObject1).cZ(((c)localObject1).iXV);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        long l2;
        if (paramInt1 == 6)
        {
          localObject1 = c.this;
          localObject3 = paramArrayOfByte;
          i = paramInt2;
          if (((c)localObject1).iXO)
          {
            ((c)localObject1).iXM = bg.Pv();
            ((c)localObject1).iXO = false;
          }
          ((c)localObject1).iXK += localObject3.length;
          localObject2 = (x)h.a(new x(), (byte[])localObject3);
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "dataPushNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject3)) });
            c.b("", 0, 0, 0, 1, i);
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify recoverData id:%s, type:%d, start:%d, end:%d", new Object[] { ((x)localObject2).jie, Integer.valueOf(((x)localObject2).jif), Integer.valueOf(((x)localObject2).jih), Integer.valueOf(((x)localObject2).jii) });
          l1 = bg.Pv();
          if ((((x)localObject2).jif == 1) && (((x)localObject2).jgP != null))
          {
            localObject3 = h.aer() + "backupItem/" + h.ti(((x)localObject2).jie);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify text dataid:%s, dir:%s", new Object[] { ((x)localObject2).jie, localObject3 });
            h.b((String)localObject3, (x)localObject2);
            ((c)localObject1).recvSize += ((x)localObject2).jgP.tJp.length;
          }
          l2 = ((c)localObject1).iXJ;
          ((c)localObject1).iXJ = ((int)(bg.aH(l1) + l2));
          l1 = bg.Pv();
          if (((x)localObject2).jif == 2)
          {
            localObject3 = h.aer() + "backupMeida/" + h.ti(((x)localObject2).jie);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify datapush media dataid:%s, dir:%s", new Object[] { ((x)localObject2).jie, localObject3 });
            h.a((String)localObject3, (x)localObject2);
            ((c)localObject1).recvSize += ((x)localObject2).jgP.tJp.length;
            ((c)localObject1).iXP.add(((x)localObject2).jie);
          }
          l2 = ((c)localObject1).iXL;
          ((c)localObject1).iXL = ((int)(bg.aH(l1) + l2));
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", new Object[] { Long.valueOf(((c)localObject1).recvSize), Long.valueOf(((c)localObject1).eJe) });
          if (((c)localObject1).eJe < ((c)localObject1).recvSize) {
            ((c)localObject1).eJe = ((c)localObject1).recvSize;
          }
          c.b(((x)localObject2).jie, ((x)localObject2).jif, ((x)localObject2).jih, ((x)localObject2).jii, 0, i);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        if (paramInt1 == 13)
        {
          c.R(paramArrayOfByte);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        if (paramInt1 == 15)
        {
          localObject2 = c.this;
          localObject3 = paramArrayOfByte;
          int j = paramInt2;
          localObject1 = (z)h.a(new z(), (byte[])localObject3);
          if (localObject1 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject3)) });
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive tag, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s", new Object[] { ((z)localObject1).jin, ((z)localObject1).jha, Long.valueOf(((z)localObject1).jil), Long.valueOf(((z)localObject1).jim), ((z)localObject1).jio });
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vvU, Boolean.valueOf(true));
          if (at.AR().zz().Ti(((z)localObject1).jin) != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak the same tag has received, ignore. MsgDataID:%s", new Object[] { ((z)localObject1).jin });
            ((c)localObject2).iXG.add(((z)localObject1).jha);
            localObject3 = b.aeH().aei();
            if (((c)localObject2).iXG.size() >= ((c)localObject2).iXB.size()) {
              break label1514;
            }
          }
          label1514:
          for (i = ((c)localObject2).iXG.size();; i = ((c)localObject2).iXB.size())
          {
            ((com.tencent.mm.plugin.backup.a.f)localObject3).x(23, i, ((c)localObject2).iXB.size());
            ((c)localObject2).a(b.aeH().aei());
            localObject2 = new aa();
            ((aa)localObject2).jha = ((z)localObject1).jha;
            ((aa)localObject2).jil = ((z)localObject1).jil;
            ((aa)localObject2).jim = ((z)localObject1).jim;
            ((aa)localObject2).jin = ((z)localObject1).jin;
            try
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send tag resp");
              com.tencent.mm.plugin.backup.f.b.d(((aa)localObject2).toByteArray(), 16, j);
              GMTrace.o(18806722265088L, 140121);
              return;
            }
            catch (Exception localException)
            {
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "summerbak buf to PacketBackupDataTagResponse err.", new Object[0]);
              GMTrace.o(18806722265088L, 140121);
              return;
            }
            localObject3 = new com.tencent.mm.storage.k();
            ((com.tencent.mm.storage.k)localObject3).field_msgListDataId = ((z)localObject1).jin;
            ((com.tencent.mm.storage.k)localObject3).field_sessionName = ((z)localObject1).jha;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(at.AR().zz().b((com.tencent.mm.sdk.e.c)localObject3)), Long.valueOf(((com.tencent.mm.storage.k)localObject3).vmr) });
            localObject3 = new com.tencent.mm.storage.m();
            ((com.tencent.mm.storage.m)localObject3).field_sessionName = ((z)localObject1).jha;
            ((com.tencent.mm.storage.m)localObject3).field_startTime = ((z)localObject1).jil;
            ((com.tencent.mm.storage.m)localObject3).field_endTime = ((z)localObject1).jim;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(at.AR().zy().b((com.tencent.mm.sdk.e.c)localObject3)), Long.valueOf(((com.tencent.mm.storage.m)localObject3).vmr) });
            break;
          }
        }
        c localc;
        if (paramInt1 == 8)
        {
          localc = c.this;
          localObject2 = paramArrayOfByte;
          localObject3 = (com.tencent.mm.plugin.backup.h.d)h.a(new com.tencent.mm.plugin.backup.h.d(), (byte[])localObject2);
          if (localObject3 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "recoverFinishNotify BackupFinishRequest parse failed buf:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject2)) });
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive finish request. NewBakMoveInfoKvstat, Client receive Server data, ServerSessionCount:%d, ServerMessageCount:%d, ServerFileCount:%d, CalculateSize:%d, ServerDataPushSize:%d, ServerReadDBTotalTime:%d, ServerReadFileTotalTime:%d, ServerCostTotalTime:%d, ServerVersion:%x", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgR), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgS), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgT), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgU), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgV), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgW), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgX), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgY), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jgZ) });
          localc.iXN = ((int)bg.aH(localc.iXM));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vvU, Boolean.valueOf(false));
          b.aeH().aeI().iVF = null;
          if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
            com.tencent.mm.plugin.backup.f.b.afv().stop();
          }
          if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
            com.tencent.mm.plugin.backup.f.b.afw().stop();
          }
          b.aeH().aei().x(24, localc.iXG.size(), localc.iXB.size());
          localc.a(b.aeH().aei());
          l2 = bg.aH(localc.iXH);
          if (l2 == 0L) {
            break label2064;
          }
        }
        label2049:
        label2064:
        for (long l1 = localc.eJe / l2;; l1 = 0L)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(485L, 45L, 1L, false);
          localObject2 = com.tencent.mm.plugin.report.service.g.ork;
          if ((localc.iXR) || (localc.iXQ == 1))
          {
            i = 68;
            ((com.tencent.mm.plugin.report.service.g)localObject2).a(485L, i, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.a(485L, 61L, l2 / 1000L, false);
            com.tencent.mm.plugin.report.service.g.ork.a(485L, 62L, localc.eJe / 1024L, false);
            localObject2 = com.tencent.mm.plugin.report.service.g.ork;
            if ((!localc.iXR) && (localc.iXQ != 1)) {
              break label2049;
            }
          }
          for (i = 70;; i = 69)
          {
            ((com.tencent.mm.plugin.report.service.g)localObject2).a(485L, i, l1 / 1024L, false);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "recoverFinishNotify recover success. recoverCostTime[%d], recoverTotalSize[%d]", new Object[] { Long.valueOf(l2), Long.valueOf(localc.eJe) });
            GMTrace.o(18806722265088L, 140121);
            return;
            i = 67;
            break;
          }
          GMTrace.o(18806722265088L, 140121);
          return;
        }
      }
    });
    GMTrace.o(9547578081280L, 71135);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    GMTrace.i(18910875222016L, 140897);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), ah.bQk() });
    if (!paramBoolean1) {
      aeQ();
    }
    synchronized (this.lock)
    {
      this.guN = true;
      if (this.iXA != null)
      {
        this.iXA.h(paramBoolean2, paramInt);
        this.iXA = null;
        if ((i != 0) && (paramInt != 0))
        {
          b.aeH().aei().iVu = paramInt;
          a(b.aeH().aei());
        }
        if (paramBoolean2) {
          aeN();
        }
        if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
          com.tencent.mm.plugin.backup.f.b.afv().stop();
        }
        if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
          com.tencent.mm.plugin.backup.f.b.afw().stop();
        }
        b.aeH().aeI().iVF = null;
        GMTrace.o(18910875222016L, 140897);
        return;
      }
      i = 1;
    }
  }
  
  public final void aB(String paramString, int paramInt)
  {
    GMTrace.i(9547309645824L, 71133);
    b.aeH().aeI().connect(paramString, paramInt);
    com.tencent.mm.plugin.backup.f.b.a(1, this.iYc);
    for (;;)
    {
      try
      {
        if (bg.getInt(com.tencent.mm.k.g.ut().getValue("ChattingRecordsKvstatDisable"), 0) != 0) {
          continue;
        }
        bool = true;
        this.iXT = bool;
      }
      catch (Exception paramString)
      {
        boolean bool;
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "getInt", new Object[0]);
        continue;
      }
      paramString = new com.tencent.mm.plugin.backup.f.a(b.aeH().iVn, b.aeH().iVo, com.tencent.mm.plugin.backup.a.e.aem(), b.aeH().iVm, com.tencent.mm.plugin.backup.a.c.iUZ, 22);
      paramString.de(this.iXT);
      paramString.afx();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak tryConnect start connect timehandler.");
      if (this.iXZ == null) {
        this.iXZ = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(18806856482816L, 140122);
            if (!c.iYa)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak try connect overtime failed.");
              if (c.this.iXZ != null) {
                c.this.iXZ.stopTimer();
              }
              c.this.aeO();
            }
            GMTrace.o(18806856482816L, 140122);
            return true;
          }
        }, false);
      }
      this.iXZ.z(3000L, 3000L);
      GMTrace.o(9547309645824L, 71133);
      return;
      bool = false;
    }
  }
  
  public final void aeN()
  {
    GMTrace.i(9547041210368L, 71131);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
    this.iXG.clear();
    GMTrace.o(9547041210368L, 71131);
  }
  
  public final void aeO()
  {
    GMTrace.i(9547443863552L, 71134);
    String str1 = this.iXW;
    String str2 = this.iXX;
    String str3 = h.bY(ab.getContext());
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", new Object[] { str3, str1, str2, Integer.valueOf(gsq) });
    if ((str3 == null) || (str3.equals("")))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 1L, 1L, false);
      b.aeH().aei().iVu = -1;
      a(b.aeH().aei());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if ((str1 == null) || (!str1.equals(str3)))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 2L, 1L, false);
      b.aeH().aei().iVu = -2;
      a(b.aeH().aei());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if (!h.tf(str2))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 3L, 1L, false);
      b.aeH().aei().iVu = -3;
      a(b.aeH().aei());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if (gsq <= 0)
    {
      b.aeH().aei().iVu = -5;
      a(b.aeH().aei());
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 4L, 1L, false);
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    gsq -= 1;
    aB(this.iXX, this.iXY);
    GMTrace.o(9547443863552L, 71134);
  }
  
  public final void aeg()
  {
    GMTrace.i(18449971544064L, 137463);
    com.tencent.mm.plugin.report.service.g.ork.a(485L, 49L, 1L, false);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vvW, Boolean.valueOf(true));
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS.");
    Object localObject;
    LinkedList localLinkedList;
    if (!this.iWT)
    {
      localObject = at.AR().zy();
      localLinkedList = new LinkedList();
      localObject = ((com.tencent.mm.storage.n)localObject).Mx();
      if (localObject != null) {
        break label141;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
      if (localLinkedList.size() > 0) {
        break label181;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
    }
    for (;;)
    {
      aeN();
      if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
        com.tencent.mm.plugin.backup.f.b.afv().stop();
      }
      if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
        com.tencent.mm.plugin.backup.f.b.afw().stop();
      }
      GMTrace.o(18449971544064L, 137463);
      return;
      label141:
      while (((Cursor)localObject).moveToNext())
      {
        com.tencent.mm.storage.m localm = new com.tencent.mm.storage.m();
        localm.b((Cursor)localObject);
        localLinkedList.add(localm);
      }
      ((Cursor)localObject).close();
      break;
      label181:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
      at.AR().zx().d(this.esG, localLinkedList);
    }
  }
  
  public final void aew()
  {
    GMTrace.i(9547980734464L, 71138);
    synchronized (this.lock)
    {
      if (this.guN)
      {
        GMTrace.o(9547980734464L, 71138);
        return;
      }
      if (this.iXA != null) {
        this.iXA.h(false, 0);
      }
      if ((this.iXG == null) || (this.iXG.size() <= 0)) {
        this.iXG = at.AR().zz().bSm();
      }
      b.aeH().aei().x(26, 1, this.iXG.size());
      a(b.aeH().aei());
      this.iXA = new com.tencent.mm.plugin.backup.b.e(b.aeH(), 22, this, this.iXG.size(), false, new LinkedList(), new LinkedList());
      this.iXA.aew();
      com.tencent.mm.plugin.report.service.g.ork.a(485L, 46L, 1L, false);
      GMTrace.o(9547980734464L, 71138);
      return;
    }
  }
  
  public final void cX(final boolean paramBoolean)
  {
    GMTrace.i(9548517605376L, 71142);
    if (this.iWP != null) {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14830387855360L, 110495);
          if (c.this.iWP != null) {
            c.this.iWP.cX(paramBoolean);
          }
          GMTrace.o(14830387855360L, 110495);
        }
      });
    }
    GMTrace.o(9548517605376L, 71142);
  }
  
  public final void cZ(boolean paramBoolean)
  {
    GMTrace.i(9547712299008L, 71136);
    this.iXV = paramBoolean;
    final Object localObject = new LinkedBlockingQueue();
    b.aeH().aeI().iVF = new a.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(18805514305536L, 140112);
        for (;;)
        {
          if (!c.this.guN) {}
          try
          {
            boolean bool = localObject.offer(new c.a(c.this, false, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousArrayOfByte), 500L, TimeUnit.MILLISECONDS);
            if (bool)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak offer datapushQueue, datapushQueue size:%d", new Object[] { Integer.valueOf(localObject.size()) });
              GMTrace.o(18805514305536L, 140112);
              return;
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "onBackupMoveRecoverDatapushCallback e:%s", new Object[] { localException.getMessage() });
          }
        }
      }
    };
    com.tencent.mm.sdk.f.e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18806990700544L, 140123);
        for (;;)
        {
          if (!c.this.guN) {
            try
            {
              c.a locala = (c.a)localObject.poll(500L, TimeUnit.MILLISECONDS);
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BackupMoveRecoverServer", "datapushQueue size:%d, startNext receiveData:%s", new Object[] { Integer.valueOf(localObject.size()), locala });
              if (locala != null) {
                c.this.a(locala.imD, locala.type, locala.buf, locala.gVC);
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                Object localObject = null;
              }
            }
          }
        }
        GMTrace.o(18806990700544L, 140123);
      }
    }, "onNotifyWorker").start();
    this.iXD = new LinkedList();
    this.iXE = new LinkedList();
    at.AR().zy().a(this.iXB, this.iXC, this.iXD, this.iXE);
    if ((!this.iWT) && (!paramBoolean))
    {
      localObject = this.iXD;
      LinkedList localLinkedList = this.iXE;
      this.iXD = new LinkedList();
      this.iXE = new LinkedList();
      at.AR().zx().a(this.esG, (LinkedList)localObject, localLinkedList, this.iXD, this.iXE);
    }
    localObject = new com.tencent.mm.plugin.backup.h.j();
    ((com.tencent.mm.plugin.backup.h.j)localObject).jhe = this.iXD;
    ((com.tencent.mm.plugin.backup.h.j)localObject).jhf = this.iXE;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send requestsession resp, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(this.iXB.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.h.j)localObject).jhf.size()) });
      com.tencent.mm.plugin.backup.f.b.d(((com.tencent.mm.plugin.backup.h.j)localObject).toByteArray(), 12, this.iYf);
      com.tencent.mm.plugin.backup.f.b.afw().start();
      b.aeH().aei().x(23, 1, this.iXB.size());
      a(b.aeH().aei());
      GMTrace.o(9547712299008L, 71136);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupRequestSessionResponse err.", new Object[0]);
      }
    }
  }
  
  private final class a
  {
    byte[] buf;
    int gVC;
    boolean imD;
    int type;
    
    a(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      GMTrace.i(9541806718976L, 71092);
      this.imD = false;
      this.gVC = paramInt1;
      this.type = paramInt2;
      this.buf = ((byte[])paramArrayOfByte.clone());
      GMTrace.o(9541806718976L, 71092);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */