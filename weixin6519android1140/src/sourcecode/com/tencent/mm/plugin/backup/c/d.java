package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveOldUI;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.f.j.a;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
  implements com.tencent.mm.plugin.backup.a.b.b, b.c
{
  public static boolean iWT;
  public static boolean iYu;
  public byte[] bitmapData;
  public b.d iWP;
  public boolean iXR;
  public com.tencent.mm.plugin.backup.f.b.b iYg;
  private final i.a iYh;
  public final j.a iYi;
  public LinkedList<String> iYn;
  private com.tencent.mm.plugin.backup.b.b iYo;
  private com.tencent.mm.plugin.backup.b.c iYp;
  public long iYq;
  public long iYr;
  public boolean iYs;
  public int iYt;
  private boolean iYv;
  private int iYw;
  private int iYx;
  private int iYy;
  public e iYz;
  
  static
  {
    GMTrace.i(18449434673152L, 137459);
    iWT = false;
    iYu = false;
    GMTrace.o(18449434673152L, 137459);
  }
  
  public d()
  {
    GMTrace.i(9540330323968L, 71081);
    this.iYq = 0L;
    this.iYr = 0L;
    this.iYs = false;
    this.iYt = 0;
    this.iYv = false;
    this.iXR = false;
    this.iYy = 0;
    this.iYg = new com.tencent.mm.plugin.backup.f.b.b()
    {
      public final void aeS()
      {
        GMTrace.i(18447287189504L, 137443);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "stopCallback ");
        if (com.tencent.mm.plugin.backup.f.b.afv() != null) {
          com.tencent.mm.plugin.backup.f.b.afv().stop();
        }
        b.aeH().aek();
        GMTrace.o(18447287189504L, 137443);
      }
    };
    this.iYh = new i.a()
    {
      public final void xC()
      {
        GMTrace.i(18449703108608L, 137461);
        if (b.aeH().aei().iVu <= 0)
        {
          GMTrace.o(18449703108608L, 137461);
          return;
        }
        d.this.bK(true);
        b.aeH().aeI().stop();
        b.aeH().aei().iVu = -4;
        d.this.a(b.aeH().aei());
        GMTrace.o(18449703108608L, 137461);
      }
    };
    this.iYi = new j.a()
    {
      public final void aeR()
      {
        GMTrace.i(18450105761792L, 137464);
        d.this.a(b.aeH().aei());
        GMTrace.o(18450105761792L, 137464);
      }
    };
    this.iYz = new e(new e.a()
    {
      public final void a(com.tencent.mm.plugin.backup.a.f paramAnonymousf, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(18449568890880L, 137460);
        if (paramAnonymousArrayOfByte != null) {
          d.this.bitmapData = paramAnonymousArrayOfByte;
        }
        d.this.a(paramAnonymousf);
        GMTrace.o(18449568890880L, 137460);
      }
    }, b.aeH().aei());
    GMTrace.o(9540330323968L, 71081);
  }
  
  private static void aeQ()
  {
    GMTrace.i(9541135630336L, 71087);
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.aeH().iVm;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "send cancel req.");
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      GMTrace.o(9541135630336L, 71087);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
      GMTrace.o(9541135630336L, 71087);
    }
  }
  
  public static String aeU()
  {
    GMTrace.i(18449300455424L, 137458);
    String str = com.tencent.mm.plugin.backup.f.b.afw().afF();
    GMTrace.o(18449300455424L, 137458);
    return str;
  }
  
  private static LinkedList<com.tencent.mm.plugin.backup.a.g> b(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    long l1 = 0L;
    GMTrace.i(9541672501248L, 71091);
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList.isEmpty()) || (paramLinkedList.size() * 2 != paramLinkedList1.size()))
    {
      GMTrace.o(9541672501248L, 71091);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList1 = paramLinkedList1.iterator();
    int i = 0;
    long l3 = 0L;
    while (i < paramLinkedList.size())
    {
      long l2 = l1;
      if (paramLinkedList1.hasNext())
      {
        long l4 = ((Long)paramLinkedList1.next()).longValue();
        l3 = l4;
        l2 = l1;
        if (paramLinkedList1.hasNext())
        {
          l2 = ((Long)paramLinkedList1.next()).longValue();
          l3 = l4;
        }
      }
      localLinkedList.add(new com.tencent.mm.plugin.backup.a.g(i, (String)paramLinkedList.get(i), l3, l2));
      i += 1;
      l1 = l2;
    }
    GMTrace.o(9541672501248L, 71091);
    return localLinkedList;
  }
  
  public static void c(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    long l = 0L;
    GMTrace.i(18449032019968L, 137456);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = l;
    }
    for (;;)
    {
      b.aeH();
      SharedPreferences.Editor localEditor = b.aen().edit();
      localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", paramInt1);
      localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", paramLong1);
      localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", paramLong2);
      localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
      localEditor.commit();
      GMTrace.o(18449032019968L, 137456);
      return;
    }
  }
  
  public final void a(final com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14820724178944L, 110423);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "updateBackupMoveRecoverUI state:%d, transferSession:%d, totalSession:%d", new Object[] { Integer.valueOf(paramf.iVu), Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) });
    b.aeH().aei().b(paramf);
    if (this.iWP != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18447555624960L, 137445);
          if (d.this.iWP != null) {
            d.this.iWP.a(paramf);
          }
          GMTrace.o(18447555624960L, 137445);
        }
      });
    }
    GMTrace.o(14820724178944L, 110423);
  }
  
  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    GMTrace.i(9540732977152L, 71084);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak onNotify isLocal:%b type:%d seq:%d buf:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((paramBoolean) && (paramArrayOfByte != null) && (10011 == paramInt1))
      {
        i = b.aeH().aei().iVu;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
        switch (i)
        {
        }
      }
    }
    Object localObject;
    for (;;)
    {
      if (paramInt1 == 1)
      {
        localObject = (v)h.a(new v(), paramArrayOfByte);
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "authReq parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
          b.aeH().aei().iVu = -5;
          a(b.aeH().aei());
          GMTrace.o(9540732977152L, 71084);
          return;
          i = paramArrayOfByte.length;
          break;
          b.aeH().aeI().stop();
          b.aeH().aei().iVu = -100;
          a(b.aeH().aei());
          continue;
          b.aeH().aeI().stop();
          continue;
          bK(true);
          b.aeH().aeI().stop();
          b.aeH().aei().iVu = -4;
          a(b.aeH().aei());
          com.tencent.mm.plugin.report.service.g.ork.a(485L, 24L, 1L, false);
          if ((this.iYp == null) || (this.iYp.iVX == 0L)) {
            continue;
          }
          long l = bg.aH(this.iYp.iVX);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak backup transfer disconnect, backupDataSize:%d, backupCostTime:%d", new Object[] { Long.valueOf(this.iYp.iVW), Long.valueOf(l) });
          continue;
          bK(true);
          continue;
        }
        if (bg.nm(b.aeH().iVm)) {
          b.aeH().iVm = ((v)localObject).ID;
        }
        if (!((v)localObject).ID.equals(b.aeH().iVm))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "id not equel:self:%s, authReq.id:%s", new Object[] { b.aeH().iVm, ((v)localObject).ID });
          bK(false);
          b.aeH().aei().iVu = -5;
          a(b.aeH().aei());
          GMTrace.o(9540732977152L, 71084);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "authReq info, id:%s, step:%d", new Object[] { ((v)localObject).ID, Integer.valueOf(((v)localObject).jhZ) });
        if (((v)localObject).jhZ == 0)
        {
          paramArrayOfByte = ((v)localObject).jgP.tJp;
          if (!b.aeH().iVn.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.e.aem()))))
          {
            paramArrayOfByte = new com.tencent.mm.plugin.backup.h.w();
            paramArrayOfByte.jhZ = 0;
            paramArrayOfByte.ID = b.aeH().iVm;
            paramArrayOfByte.jhA = 1;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "get authReq step 0, but hello failed");
          }
          try
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send authFailResp.");
            com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 2, paramInt2);
            b.aeH().aei().iVu = -5;
            a(b.aeH().aei());
            if (((v)localObject).jia < com.tencent.mm.plugin.backup.a.c.iUZ)
            {
              this.iYv = true;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak old move, version:%d", new Object[] { Integer.valueOf(((v)localObject).jia) });
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak start move, isOldVersion:%b", new Object[] { Boolean.valueOf(this.iYv) });
              this.iYx = paramInt2;
              if ((!iYu) && (!iWT)) {
                break label966;
              }
              if ((!iYu) || (!iWT) || ((((v)localObject).jic & com.tencent.mm.plugin.backup.a.c.iVe) != 0) || ((((v)localObject).jic & com.tencent.mm.plugin.backup.a.c.iVf) != 0)) {
                break label858;
              }
              b.aeH().aei().iVu = -31;
              a(b.aeH().aei());
              this.iYy = 1;
              GMTrace.o(9540732977152L, 71084);
            }
          }
          catch (Exception paramArrayOfByte)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
              continue;
              this.iYv = false;
            }
            label858:
            if ((iYu) && ((((v)localObject).jic & com.tencent.mm.plugin.backup.a.c.iVe) == 0))
            {
              b.aeH().aei().iVu = -32;
              a(b.aeH().aei());
              this.iYy = 2;
              GMTrace.o(9540732977152L, 71084);
              return;
            }
            if ((iWT) && ((((v)localObject).jic & com.tencent.mm.plugin.backup.a.c.iVf) == 0))
            {
              b.aeH().aei().iVu = -33;
              a(b.aeH().aei());
              this.iYy = 3;
              GMTrace.o(9540732977152L, 71084);
              return;
            }
            label966:
            da(false);
            GMTrace.o(9540732977152L, 71084);
            return;
          }
        }
        if (((v)localObject).jhZ == 1)
        {
          paramArrayOfByte = ((v)localObject).jgP.tJp;
          if (!b.aeH().iVo.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.e.aem()))))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok failed");
            b.aeH().aei().iVu = -5;
            a(b.aeH().aei());
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok success");
          if (this.iYv)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(485L, 101L, 1L, false);
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW();
            paramArrayOfByte = new Intent(ab.getContext(), BakMoveOldUI.class);
            paramArrayOfByte.addFlags(335544320);
            ab.getContext().startActivity(paramArrayOfByte);
            GMTrace.o(9540732977152L, 71084);
            return;
          }
          b.aeH().aei().iVu = 2;
          a(b.aeH().aei());
        }
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 3)
    {
      this.iYw = paramInt2;
      if (b.aeH().aeL().iXr)
      {
        aeT();
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      this.iYs = true;
      GMTrace.o(9540732977152L, 71084);
      return;
    }
    if (paramInt1 == 9)
    {
      localObject = (com.tencent.mm.plugin.backup.h.e)h.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive heartbeatReq,req:%s ack:%d", new Object[] { localObject, Long.valueOf(((com.tencent.mm.plugin.backup.h.e)localObject).jbP) });
      paramArrayOfByte = (com.tencent.mm.plugin.backup.h.f)h.a(new com.tencent.mm.plugin.backup.h.f(), paramArrayOfByte);
      paramArrayOfByte.jbP = ((com.tencent.mm.plugin.backup.h.e)localObject).jbP;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send heartbeatResp");
        com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 10, paramInt2);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 10)
    {
      localObject = new com.tencent.mm.plugin.backup.h.f();
      try
      {
        ((com.tencent.mm.plugin.backup.h.f)localObject).aD(paramArrayOfByte);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak heartbeatResp parse from buf error.", new Object[0]);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 5)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive command cancel");
      bK(true);
      b.aeH().aei().iVu = -100;
      a(b.aeH().aei());
      GMTrace.o(9540732977152L, 71084);
      return;
    }
    if (paramInt1 == 12)
    {
      localObject = (com.tencent.mm.plugin.backup.h.j)h.a(new com.tencent.mm.plugin.backup.h.j(), paramArrayOfByte);
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "requestSessionResp parseBuf failed:%d", new Object[] { Integer.valueOf(bg.br(paramArrayOfByte)) });
        b.aeH().aei().iVu = -5;
        a(b.aeH().aei());
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      paramArrayOfByte = b(((com.tencent.mm.plugin.backup.h.j)localObject).jhe, ((com.tencent.mm.plugin.backup.h.j)localObject).jhf);
      if (paramArrayOfByte == null) {}
      for (paramInt1 = -1;; paramInt1 = paramArrayOfByte.size())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak backup receive requestsession response. backupSessionList:%d ", new Object[] { Integer.valueOf(paramInt1) });
        if (paramArrayOfByte != null) {
          break;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "requestSessionResp sessionName or timeInterval null or requestSessionResp number error.");
        aeQ();
        b.aeH().aei().iVu = -21;
        a(b.aeH().aei());
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      com.tencent.mm.plugin.backup.f.b.a(this.iYh);
      com.tencent.mm.plugin.backup.f.b.afv().start();
      this.iYp = new com.tencent.mm.plugin.backup.b.c(b.aeH(), 2, this);
      this.iYp.iVT = false;
      this.iYp.cY(false);
      this.iYp.a(paramArrayOfByte, 0, b.aeH().aei().iVx, iWT);
    }
    GMTrace.o(9540732977152L, 71084);
  }
  
  public final void aeT()
  {
    GMTrace.i(9540867194880L, 71085);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive start request.");
    this.iYs = false;
    if (this.iYv)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak start old move");
      com.tencent.mm.plugin.backup.a.e.ku(-21);
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().bK(true);
      com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW());
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().a(h.t(b.aeH().aeL().aeD()), new PLong(b.aeH().aeL().aeG()), new PInt());
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().kE(this.iYw);
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    b.aeH().aei().iVu = 12;
    a(b.aeH().aei());
    com.tencent.mm.plugin.backup.g.a.afG().afJ();
    if (this.iYn == null)
    {
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "transfer conversation size:%d", new Object[] { Integer.valueOf(this.iYn.size()) });
    Object localObject1 = new o();
    ((o)localObject1).ID = b.aeH().iVm;
    ((o)localObject1).jhy = this.iYn.size();
    ((o)localObject1).jhz = b.aeH().aeL().aeG();
    ((o)localObject1).jhA = 0;
    int i;
    if (this.iXR) {
      i = com.tencent.mm.plugin.backup.a.c.iUX;
    }
    for (;;)
    {
      ((o)localObject1).jhB = i;
      if (iWT) {
        ((o)localObject1).jhx = 3;
      }
      Object localObject2 = new m();
      ((m)localObject2).jhl = p.ta();
      ((m)localObject2).jhm = Build.MANUFACTURER;
      ((m)localObject2).jhn = Build.MODEL;
      ((m)localObject2).jho = "Android";
      ((m)localObject2).jhp = Build.VERSION.RELEASE;
      ((m)localObject2).jhq = com.tencent.mm.protocal.d.tJC;
      ((m)localObject2).jhr = 0L;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak generalinfo wechatversion:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC) });
      ((o)localObject1).jhv = ((m)localObject2);
      try
      {
        com.tencent.mm.plugin.backup.f.b.d(((o)localObject1).toByteArray(), 4, this.iYw);
        long l1 = this.iYq;
        long l2 = this.iYr;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "backupSendRequestSession sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(this.iYn.size()), Long.valueOf(l1), Long.valueOf(l2) });
        localObject1 = new com.tencent.mm.plugin.backup.h.i();
        ((com.tencent.mm.plugin.backup.h.i)localObject1).jhe = this.iYn;
        ((com.tencent.mm.plugin.backup.h.i)localObject1).jhf = new LinkedList();
        localObject2 = this.iYn.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ((Iterator)localObject2).next();
          ((com.tencent.mm.plugin.backup.h.i)localObject1).jhf.add(Long.valueOf(l1));
          ((com.tencent.mm.plugin.backup.h.i)localObject1).jhf.add(Long.valueOf(l2));
          continue;
          i = com.tencent.mm.plugin.backup.a.c.iUW;
        }
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "prase startResp error!!");
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localIOException, "", new Object[0]);
        GMTrace.o(9540867194880L, 71085);
        return;
      }
    }
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send request session, chooseConvNames size:%d", new Object[] { Integer.valueOf(this.iYn.size()) });
      com.tencent.mm.plugin.backup.f.b.r(localIOException.toByteArray(), 11);
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "summerbak BackupRequestSession parse req failed.", new Object[0]);
      GMTrace.o(9540867194880L, 71085);
    }
  }
  
  public final void aee()
  {
    GMTrace.i(9541538283520L, 71090);
    bK(false);
    GMTrace.o(9541538283520L, 71090);
  }
  
  public final void bK(boolean paramBoolean)
  {
    GMTrace.i(9540598759424L, 71083);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "summerbak BackupMoveServer CANCEL, Caller:%s", new Object[] { ah.bQk() });
    if (!paramBoolean) {
      aeQ();
    }
    if (this.iYp != null) {
      this.iYp.iVT = true;
    }
    if (this.iYo != null)
    {
      this.iYo.cancel();
      this.iYo = null;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
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
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "cancel, isTempDb[%s]", new Object[] { localObject });
      if (localBoolean != null) {
        com.tencent.mm.plugin.backup.g.a.afG().n(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9544356855808L, 71111);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "backupChatRunnable backupcloseTempDB end");
            com.tencent.mm.sdk.platformtools.w.bPM();
            GMTrace.o(9544356855808L, 71111);
          }
        });
      }
      GMTrace.o(9540598759424L, 71083);
      return;
    }
  }
  
  public final void da(boolean paramBoolean)
  {
    GMTrace.i(18449166237696L, 137457);
    if (paramBoolean) {
      switch (this.iYy)
      {
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.backup.h.w localw = new com.tencent.mm.plugin.backup.h.w();
      localw.jhZ = 0;
      localw.ID = b.aeH().iVm;
      localw.jia = com.tencent.mm.plugin.backup.a.c.iUZ;
      localw.jhA = 0;
      localw.jib = this.iYt;
      localw.jgP = new com.tencent.mm.bm.b(k.b(b.aeH().iVo.getBytes(), com.tencent.mm.plugin.backup.a.e.aem()));
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("ChattingRecordsKvstatDisable"), 0) == 0) {
        localw.jic |= com.tencent.mm.plugin.backup.a.c.iVd;
      }
      localw.jic |= com.tencent.mm.plugin.backup.a.c.iVe;
      localw.jic |= com.tencent.mm.plugin.backup.a.c.iVf;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send authSuccessResp.");
        com.tencent.mm.plugin.backup.f.b.d(localw.toByteArray(), 2, this.iYx);
        GMTrace.o(18449166237696L, 137457);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
        GMTrace.o(18449166237696L, 137457);
      }
      iYu = false;
      iWT = false;
      this.iYq = 0L;
      this.iYr = 0L;
      continue;
      iYu = false;
      this.iYq = 0L;
      this.iYr = 0L;
      continue;
      iWT = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */