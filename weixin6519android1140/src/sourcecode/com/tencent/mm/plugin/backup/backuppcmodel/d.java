package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.a;
import com.tencent.mm.plugin.backup.b.a.3;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.ag;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.k;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.m;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class d
  implements b.d
{
  long eJe;
  boolean guN;
  boolean iWT;
  private com.tencent.mm.plugin.backup.b.e iXA;
  LinkedList<String> iXB;
  LinkedList<Long> iXC;
  private HashSet<String> iXG;
  long iXH;
  public Set<com.tencent.mm.plugin.backup.a.b.c> jaA;
  public b.a jaB;
  private long jaC;
  private final com.tencent.mm.plugin.backup.f.b.c jaD;
  private Object lock;
  long recvSize;
  
  public d()
  {
    GMTrace.i(9600325648384L, 71528);
    this.eJe = 0L;
    this.recvSize = 0L;
    this.lock = new Object();
    this.guN = false;
    this.jaA = new HashSet();
    this.iXG = new HashSet();
    this.iXH = 0L;
    this.jaC = 0L;
    this.iWT = false;
    this.jaD = new com.tencent.mm.plugin.backup.f.b.c()
    {
      public final void a(boolean paramAnonymousBoolean, final int paramAnonymousInt1, final byte[] paramAnonymousArrayOfByte, final int paramAnonymousInt2)
      {
        GMTrace.i(18810211926016L, 140147);
        if (paramAnonymousArrayOfByte == null)
        {
          i = 0;
          w.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify isLocal[%b], type[%d], seq[%d], buflen[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(i) });
          if ((!paramAnonymousBoolean) || (10011 != paramAnonymousInt1)) {
            break label359;
          }
          paramAnonymousArrayOfByte = d.this;
          paramAnonymousInt1 = b.afh().aei().iVu;
          w.i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify local disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          switch (paramAnonymousInt1)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(18810211926016L, 140147);
          return;
          i = paramAnonymousArrayOfByte.length;
          break;
          b.afh().aeI().stop();
          b.afh().aei().iVu = -100;
          paramAnonymousArrayOfByte.a(b.afh().aei());
          GMTrace.o(18810211926016L, 140147);
          return;
          b.afh().aeI().stop();
          GMTrace.o(18810211926016L, 140147);
          return;
          b.afh().aeI().stop();
          b.afh().aei().iVu = -100;
          paramAnonymousArrayOfByte.a(b.afh().aei());
          GMTrace.o(18810211926016L, 140147);
          return;
          paramAnonymousArrayOfByte.a(true, false, -4);
          b.afh().aeI().stop();
          g.ork.a(400L, 17L, 1L, false);
          paramAnonymousArrayOfByte.kC(3);
          GMTrace.o(18810211926016L, 140147);
          return;
          paramAnonymousArrayOfByte.a(true, false, 0);
        }
        label359:
        if (paramAnonymousInt1 == 5)
        {
          w.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive cancelReq.");
          d.this.a(true, false, -100);
          d.this.kC(5);
          GMTrace.o(18810211926016L, 140147);
          return;
        }
        int i = b.afh().afi().jas;
        if ((2 != i) && (4 != i))
        {
          w.e("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify cmdmode error[%d]", new Object[] { Integer.valueOf(b.afh().afi().jas) });
          GMTrace.o(18810211926016L, 140147);
          return;
        }
        if (paramAnonymousInt1 == 10)
        {
          paramAnonymousArrayOfByte = (com.tencent.mm.plugin.backup.h.f)h.a(new com.tencent.mm.plugin.backup.h.f(), paramAnonymousArrayOfByte);
          if (paramAnonymousArrayOfByte != null) {}
          for (long l = paramAnonymousArrayOfByte.jbP;; l = -1L)
          {
            w.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive heartbeatResp, ack[%d]", new Object[] { Long.valueOf(l) });
            GMTrace.o(18810211926016L, 140147);
            return;
          }
        }
        if (paramAnonymousInt1 == 18)
        {
          paramAnonymousArrayOfByte = (com.tencent.mm.plugin.backup.h.c)h.a(new com.tencent.mm.plugin.backup.h.c(), paramAnonymousArrayOfByte);
          if (paramAnonymousArrayOfByte == null) {}
          for (paramAnonymousInt1 = -1;; paramAnonymousInt1 = paramAnonymousArrayOfByte.jgO)
          {
            w.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandResp, command[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1) });
            GMTrace.o(18810211926016L, 140147);
            return;
          }
        }
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18810077708288L, 140146);
            Object localObject3;
            Object localObject4;
            Object localObject1;
            int i;
            Object localObject5;
            if (paramAnonymousInt1 == 3)
            {
              localObject3 = d.this;
              localObject4 = paramAnonymousArrayOfByte;
              localObject1 = (com.tencent.mm.plugin.backup.h.n)h.a(new com.tencent.mm.plugin.backup.h.n(), (byte[])localObject4);
              if ((localObject1 == null) || (!b.afh().iVm.equals(((com.tencent.mm.plugin.backup.h.n)localObject1).ID)))
              {
                i = bg.br((byte[])localObject4);
                if (localObject1 != null) {}
                for (localObject1 = ((com.tencent.mm.plugin.backup.h.n)localObject1).ID;; localObject1 = "buf is null")
                {
                  w.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify BackupStartRequest parseBuf:%d failed or wrong id[%s,%s]", new Object[] { Integer.valueOf(i), localObject1, b.afh().iVm });
                  d.l(1, 0L);
                  ((d)localObject3).a(false, false, -5);
                  GMTrace.o(18810077708288L, 140146);
                  return;
                }
              }
              b.afh().aei().iVx = ((com.tencent.mm.plugin.backup.h.n)localObject1).jhs;
              if (((com.tencent.mm.plugin.backup.h.n)localObject1).jhx == 3)
              {
                ((d)localObject3).iWT = true;
                g.ork.a(400L, 36L, 1L, false);
                w.i("MicroMsg.BackupPcRecoverServer", "isQuickBackup!!!");
              }
              long l1 = ((com.tencent.mm.plugin.backup.h.n)localObject1).jhw;
              localObject4 = new PLong();
              localObject5 = new PLong();
              at.AR();
              h.a(0L, (PLong)localObject4, (PLong)localObject5, com.tencent.mm.y.c.zo());
              long l2 = ((PLong)localObject5).value;
              if (l1 * 0.1D > 5.24288E8D) {}
              for (double d = 5.24288E8D;; d = l1 * 0.1D)
              {
                l2 = (l2 - d) / 1048576L;
                ((d)localObject3).iXH = System.currentTimeMillis();
                w.i("MicroMsg.BackupPcRecoverServer", "startRequestNotify time:%d SessionCount:%d, MsgCount:%d, DataSize:%d validSize:%d", new Object[] { Long.valueOf(((d)localObject3).iXH), Long.valueOf(((com.tencent.mm.plugin.backup.h.n)localObject1).jht), Long.valueOf(((com.tencent.mm.plugin.backup.h.n)localObject1).jhu), Long.valueOf(l1), Long.valueOf(l2) });
                if (l2 < l1) {
                  break;
                }
                d.l(0, l2);
                com.tencent.mm.plugin.backup.f.b.afv().start();
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              w.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
              d.l(2, l2);
              localObject1 = b.afh().aeI();
              if (((a)localObject1).iVE == null) {
                ((a)localObject1).stop();
              }
              for (;;)
              {
                b.afh().aei().iVu = -13;
                ((d)localObject3).a(b.afh().aei());
                g.ork.a(400L, 6L, 1L, false);
                g.ork.i(13736, new Object[] { Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(b.afh().afi().jaw) });
                GMTrace.o(18810077708288L, 140146);
                return;
                ((a)localObject1).iVE.postDelayed(new a.3((a)localObject1), 10L);
              }
            }
            if (paramAnonymousInt1 == 11)
            {
              localObject1 = d.this;
              localObject3 = paramAnonymousArrayOfByte;
              localObject4 = (com.tencent.mm.plugin.backup.h.i)h.a(new com.tencent.mm.plugin.backup.h.i(), (byte[])localObject3);
              if (localObject4 == null)
              {
                w.e("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject3)) });
                b.afh().aei().iVu = -21;
                ((d)localObject1).a(b.afh().aei());
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              ((d)localObject1).iXB = ((com.tencent.mm.plugin.backup.h.i)localObject4).jhe;
              ((d)localObject1).iXC = ((com.tencent.mm.plugin.backup.h.i)localObject4).jhf;
              if (((d)localObject1).iXC.size() != ((d)localObject1).iXB.size() * 2)
              {
                ((d)localObject1).a(false, false, -21);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              b.afh().aei().x(23, 1, ((d)localObject1).iXB.size());
              ((d)localObject1).a(b.afh().aei());
              localObject3 = new LinkedList();
              localObject4 = new LinkedList();
              at.AR().zy().a(((d)localObject1).iXB, ((d)localObject1).iXC, (LinkedList)localObject3, (LinkedList)localObject4);
              localObject5 = new com.tencent.mm.plugin.backup.h.j();
              ((com.tencent.mm.plugin.backup.h.j)localObject5).jhe = ((LinkedList)localObject3);
              ((com.tencent.mm.plugin.backup.h.j)localObject5).jhf = ((LinkedList)localObject4);
              com.tencent.mm.plugin.backup.f.b.afw().start();
              try
              {
                w.i("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify send requestsession resp, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(((d)localObject1).iXB.size()), Integer.valueOf(((LinkedList)localObject4).size()) });
                com.tencent.mm.plugin.backup.f.b.r(((com.tencent.mm.plugin.backup.h.j)localObject5).toByteArray(), 12);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              catch (Exception localException1)
              {
                w.printErrStackTrace("MicroMsg.BackupPcRecoverServer", localException1, "BackupRequestSessionResponse to buf err.", new Object[0]);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
            }
            Object localObject2;
            if (paramAnonymousInt1 == 6)
            {
              localObject2 = d.this;
              localObject4 = paramAnonymousArrayOfByte;
              i = paramAnonymousInt2;
              localObject3 = (x)h.a(new x(), (byte[])localObject4);
              if (localObject3 == null)
              {
                w.e("MicroMsg.BackupPcRecoverServer", "dataPushNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject4)) });
                d.b("", 0, 0, 0, 1, i);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              w.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive recoverData id:%s, type:%d, start:%d, end:%d, isCancel:%b", new Object[] { ((x)localObject3).jie, Integer.valueOf(((x)localObject3).jif), Integer.valueOf(((x)localObject3).jih), Integer.valueOf(((x)localObject3).jii), Boolean.valueOf(((d)localObject2).guN) });
              if (!((d)localObject2).guN) {
                if ((b.afh().iVs != null) && (((x)localObject3).jgP != null))
                {
                  localObject4 = ((x)localObject3).jgP.tJp;
                  localObject5 = b.afh().iVs;
                  if (((x)localObject3).jii != ((x)localObject3).jig) {
                    break label1439;
                  }
                }
              }
              label1439:
              for (boolean bool = true;; bool = false)
              {
                ((x)localObject3).jgP = new com.tencent.mm.bm.b(AesEcb.aesCryptEcb((byte[])localObject4, (byte[])localObject5, false, bool));
                if ((((x)localObject3).jif == 1) && (((x)localObject3).jgP != null))
                {
                  localObject4 = h.aer() + "backupItem/" + h.ti(((x)localObject3).jie);
                  w.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush text dataid:%s, dir:%s", new Object[] { ((x)localObject3).jie, localObject4 });
                  h.b((String)localObject4, (x)localObject3);
                  ((d)localObject2).recvSize += ((x)localObject3).jgP.tJp.length;
                }
                if (((x)localObject3).jif == 2)
                {
                  localObject4 = h.aer() + "backupMeida/" + h.ti(((x)localObject3).jie);
                  w.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush media dataid:%s, dir:%s", new Object[] { ((x)localObject3).jie, localObject4 });
                  h.a((String)localObject4, (x)localObject3);
                  ((d)localObject2).recvSize += ((x)localObject3).jgP.tJp.length;
                }
                w.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", new Object[] { Long.valueOf(((d)localObject2).recvSize), Long.valueOf(((d)localObject2).eJe) });
                if (((d)localObject2).eJe < ((d)localObject2).recvSize) {
                  ((d)localObject2).eJe = ((d)localObject2).recvSize;
                }
                d.b(((x)localObject3).jie, ((x)localObject3).jif, ((x)localObject3).jih, ((x)localObject3).jii, 0, i);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
            }
            if (paramAnonymousInt1 == 13)
            {
              localObject3 = paramAnonymousArrayOfByte;
              localObject2 = (com.tencent.mm.plugin.backup.h.af)h.a(new com.tencent.mm.plugin.backup.h.af(), (byte[])localObject3);
              if (localObject2 == null)
              {
                w.e("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", new Object[] { Integer.valueOf(bg.br((byte[])localObject3)) });
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              localObject3 = new ag();
              ((ag)localObject3).jiw = ((com.tencent.mm.plugin.backup.h.af)localObject2).jiw;
              ((ag)localObject3).jiy = ((com.tencent.mm.plugin.backup.h.af)localObject2).jiy;
              ((ag)localObject3).jix = ((com.tencent.mm.plugin.backup.h.af)localObject2).jix;
              ((ag)localObject3).jha = ((com.tencent.mm.plugin.backup.h.af)localObject2).jha;
              try
              {
                w.i("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify send SvrID resp");
                com.tencent.mm.plugin.backup.f.b.r(((ag)localObject3).toByteArray(), 14);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
              catch (Exception localException2)
              {
                w.printErrStackTrace("MicroMsg.BackupPcRecoverServer", localException2, "PacketSvrIDResponse to buf err.", new Object[0]);
                GMTrace.o(18810077708288L, 140146);
                return;
              }
            }
            if (paramAnonymousInt1 == 15)
            {
              d.this.T(paramAnonymousArrayOfByte);
              GMTrace.o(18810077708288L, 140146);
              return;
            }
            if (paramAnonymousInt1 == 8)
            {
              d.this.U(paramAnonymousArrayOfByte);
              GMTrace.o(18810077708288L, 140146);
              return;
            }
            GMTrace.o(18810077708288L, 140146);
          }
        });
        GMTrace.o(18810211926016L, 140147);
      }
    };
    GMTrace.o(9600325648384L, 71528);
  }
  
  public static boolean aeM()
  {
    GMTrace.i(9600594083840L, 71530);
    boolean bool = at.AR().zz().bSl();
    GMTrace.o(9600594083840L, 71530);
    return bool;
  }
  
  static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(9601265172480L, 71535);
    y localy = new y();
    localy.jie = paramString;
    localy.jif = paramInt1;
    localy.jih = paramInt2;
    localy.jii = paramInt3;
    localy.jhA = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.f.b.d(localy.toByteArray(), 7, paramInt5);
      GMTrace.o(9601265172480L, 71535);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramString, "sendResp", new Object[0]);
      GMTrace.o(9601265172480L, 71535);
    }
  }
  
  static void l(int paramInt, long paramLong)
  {
    GMTrace.i(9601399390208L, 71536);
    o localo = new o();
    localo.ID = b.afh().iVm;
    localo.jhA = paramInt;
    localo.jhv = h.aP(paramLong);
    try
    {
      w.i("MicroMsg.BackupPcRecoverServer", "send start resp, status[%d]", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.plugin.backup.f.b.r(localo.toByteArray(), 4);
      GMTrace.o(9601399390208L, 71536);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupPcRecoverServer", localException, "buf to BackupStartRequest err.", new Object[0]);
      GMTrace.o(9601399390208L, 71536);
    }
  }
  
  public final void T(byte[] paramArrayOfByte)
  {
    GMTrace.i(18464332840960L, 137570);
    z localz = (z)h.a(new z(), paramArrayOfByte);
    if (localz == null)
    {
      w.e("MicroMsg.BackupPcRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
      GMTrace.o(18464332840960L, 137570);
      return;
    }
    w.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify receive tagReq, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s, isCancel:%b", new Object[] { localz.jin, localz.jha, Long.valueOf(localz.jil), Long.valueOf(localz.jim), localz.jio, Boolean.valueOf(this.guN) });
    if (this.guN)
    {
      GMTrace.o(18464332840960L, 137570);
      return;
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vvR, Boolean.valueOf(true));
    if (at.AR().zz().Ti(localz.jin) != null)
    {
      w.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify the same tag has received, ignore. MsgDataID:%s", new Object[] { localz.jin });
      this.iXG.add(localz.jha);
      paramArrayOfByte = b.afh().aei();
      if (this.iXG.size() >= this.iXB.size()) {
        break label458;
      }
    }
    label458:
    for (int i = this.iXG.size();; i = this.iXB.size())
    {
      paramArrayOfByte.x(23, i, this.iXB.size());
      a(b.afh().aei());
      paramArrayOfByte = new aa();
      paramArrayOfByte.jha = localz.jha;
      paramArrayOfByte.jil = localz.jil;
      paramArrayOfByte.jim = localz.jim;
      paramArrayOfByte.jin = localz.jin;
      try
      {
        w.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify send tag resp");
        com.tencent.mm.plugin.backup.f.b.r(paramArrayOfByte.toByteArray(), 16);
        GMTrace.o(18464332840960L, 137570);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramArrayOfByte, "SendTagNotify buf to PacketBackupDataTagResponse err.", new Object[0]);
        GMTrace.o(18464332840960L, 137570);
      }
      paramArrayOfByte = new k();
      paramArrayOfByte.field_msgListDataId = localz.jin;
      paramArrayOfByte.field_sessionName = localz.jha;
      w.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(at.AR().zz().b(paramArrayOfByte)), Long.valueOf(paramArrayOfByte.vmr) });
      paramArrayOfByte = new m();
      paramArrayOfByte.field_sessionName = localz.jha;
      paramArrayOfByte.field_startTime = localz.jil;
      paramArrayOfByte.field_endTime = localz.jim;
      w.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(at.AR().zy().b(paramArrayOfByte)), Long.valueOf(paramArrayOfByte.vmr) });
      break;
    }
  }
  
  public final void U(byte[] paramArrayOfByte)
  {
    GMTrace.i(18464467058688L, 137571);
    w.i("MicroMsg.BackupPcRecoverServer", "finishReqNotify receive finishReq.");
    if (h.a(new com.tencent.mm.plugin.backup.h.d(), paramArrayOfByte) == null) {
      w.e("MicroMsg.BackupPcRecoverServer", "finishReqNotify buf to BackupFinishRequest error, buflen[%d]", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
    }
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vvR, Boolean.valueOf(false));
    if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
      com.tencent.mm.plugin.backup.f.b.afv().stop();
    }
    if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
      com.tencent.mm.plugin.backup.f.b.afw().stop();
    }
    b.afh().aei().x(24, this.iXG.size(), this.iXB.size());
    a(b.afh().aei());
    g.ork.a(400L, 19L, 1L, false);
    this.jaC = System.currentTimeMillis();
    long l = this.jaC - this.iXH;
    g.ork.a(400L, 20L, l, false);
    g.ork.a(400L, 21L, this.eJe, false);
    g.ork.i(13737, new Object[] { Integer.valueOf(0), Long.valueOf(this.eJe / 1024L), Long.valueOf(l / 1000L), Integer.valueOf(2), Integer.valueOf(b.afh().afi().jaw) });
    w.i("MicroMsg.BackupPcRecoverServer", "recoverFinishNotify recover success. recoverCostTime:%d, recoverStartTime:%d, recoverEndTime:%d, recoverTotalSize:%d", new Object[] { Long.valueOf(l), Long.valueOf(this.iXH), Long.valueOf(this.jaC), Long.valueOf(this.eJe) });
    GMTrace.o(18464467058688L, 137571);
  }
  
  public final void a(final com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14847701942272L, 110624);
    b.afh().aei().b(paramf);
    final HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.jaA);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9597104422912L, 71504);
        Iterator localIterator = localHashSet.iterator();
        while (localIterator.hasNext()) {
          ((com.tencent.mm.plugin.backup.a.b.c)localIterator.next()).a(paramf);
        }
        GMTrace.o(9597104422912L, 71504);
      }
    });
    if (this.jaB != null) {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9597372858368L, 71506);
          if (d.this.jaB != null) {
            d.this.jaB.aed();
          }
          GMTrace.o(9597372858368L, 71506);
        }
      });
    }
    GMTrace.o(14847701942272L, 110624);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    GMTrace.i(18911277875200L, 140900);
    w.i("MicroMsg.BackupPcRecoverServer", "cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), ah.bQk() });
    if (!paramBoolean1)
    {
      b.afh().afi();
      c.aeQ();
      kC(4);
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
          b.afh().aei().iVu = paramInt;
          a(b.afh().aei());
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
        GMTrace.o(18911277875200L, 140900);
        return;
      }
      i = 1;
    }
  }
  
  public final void aeN()
  {
    GMTrace.i(9600862519296L, 71532);
    w.i("MicroMsg.BackupPcRecoverServer", "clearContinueRecoverData");
    this.iXG.clear();
    GMTrace.o(9600862519296L, 71532);
  }
  
  public final void aeg()
  {
    GMTrace.i(18464601276416L, 137572);
    aeN();
    g.ork.a(400L, 27L, 1L, false);
    if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
      com.tencent.mm.plugin.backup.f.b.afv().stop();
    }
    if (com.tencent.mm.plugin.backup.f.b.afw() != null) {
      com.tencent.mm.plugin.backup.f.b.afw().stop();
    }
    GMTrace.o(18464601276416L, 137572);
  }
  
  public final void aew()
  {
    GMTrace.i(9601533607936L, 71537);
    synchronized (this.lock)
    {
      if (this.guN)
      {
        GMTrace.o(9601533607936L, 71537);
        return;
      }
      if (this.iXA != null) {
        this.iXA.h(false, 0);
      }
      if ((this.iXG == null) || (this.iXG.size() <= 0)) {
        this.iXG = at.AR().zz().bSm();
      }
      b.afh().aei().x(26, 1, this.iXG.size());
      a(b.afh().aei());
      if (this.iXB == null) {
        this.iXB = new LinkedList();
      }
      if (this.iXC == null) {
        this.iXC = new LinkedList();
      }
      this.iXA = new com.tencent.mm.plugin.backup.b.e(b.afh(), 1, this, this.iXG.size(), this.iWT, this.iXB, this.iXC);
      this.iXA.aew();
      g.ork.a(400L, 24L, 1L, false);
      GMTrace.o(9601533607936L, 71537);
      return;
    }
  }
  
  public final void cX(final boolean paramBoolean)
  {
    GMTrace.i(9602070478848L, 71541);
    final HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.jaA);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9602338914304L, 71543);
        Iterator localIterator = localHashSet.iterator();
        while (localIterator.hasNext()) {
          ((com.tencent.mm.plugin.backup.a.b.c)localIterator.next()).cX(paramBoolean);
        }
        GMTrace.o(9602338914304L, 71543);
      }
    });
    GMTrace.o(9602070478848L, 71541);
  }
  
  public final void init()
  {
    GMTrace.i(9600459866112L, 71529);
    w.i("MicroMsg.BackupPcRecoverServer", "init");
    com.tencent.mm.plugin.backup.f.b.a(this.jaD);
    this.eJe = 0L;
    this.recvSize = 0L;
    this.guN = false;
    this.iWT = false;
    this.iXG.clear();
    GMTrace.o(9600459866112L, 71529);
  }
  
  public final void kC(int paramInt)
  {
    GMTrace.i(18464198623232L, 137569);
    long l = 0L;
    if (this.iXH != 0L) {
      l = bg.aH(this.iXH);
    }
    g.ork.i(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.eJe / 1024L), Long.valueOf(l / 1000L), Integer.valueOf(2), Integer.valueOf(b.afh().afi().jaw) });
    w.i("MicroMsg.BackupPcRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d], recoverCostTime[%d]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(this.eJe), Long.valueOf(l) });
    GMTrace.o(18464198623232L, 137569);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */