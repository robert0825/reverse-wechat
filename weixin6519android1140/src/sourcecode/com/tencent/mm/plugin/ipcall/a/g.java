package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.c.b;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.f.e;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.aus;
import com.tencent.mm.protocal.c.auw;
import com.tencent.mm.protocal.c.auy;
import com.tencent.mm.protocal.c.auz;
import com.tencent.mm.protocal.c.ava;
import com.tencent.mm.protocal.c.avb;
import com.tencent.mm.protocal.c.avc;
import com.tencent.mm.protocal.c.avf;
import com.tencent.mm.protocal.c.avh;
import com.tencent.mm.protocal.c.avi;
import com.tencent.mm.protocal.c.avj;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  implements a.a, b.a
{
  public boolean eQN;
  public int miK;
  public int miL;
  public int miM;
  public boolean miN;
  public boolean miO;
  public a miP;
  public com.tencent.mm.plugin.ipcall.a.f.d miQ;
  com.tencent.mm.plugin.ipcall.a.f.i miR;
  com.tencent.mm.plugin.ipcall.a.f.a miS;
  com.tencent.mm.plugin.ipcall.a.f.h miT;
  com.tencent.mm.plugin.ipcall.a.f.c miU;
  public e miV;
  com.tencent.mm.plugin.ipcall.a.f.g miW;
  public com.tencent.mm.plugin.ipcall.a.f.f miX;
  public com.tencent.mm.plugin.ipcall.a.a.c miY;
  public boolean miZ;
  public boolean mja;
  com.tencent.mm.network.n mjb;
  
  public g()
  {
    GMTrace.i(11589298159616L, 86347);
    this.miK = 0;
    this.miL = 0;
    this.miM = 0;
    this.miN = false;
    this.miO = false;
    this.miZ = false;
    this.eQN = false;
    this.mja = false;
    this.mjb = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(11589163941888L, 86346);
        w.i("MicroMsg.IPCallSvrLogic", "onNetworkChange, st: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (i.aIp().mkR)
        {
          f localf = i.aIs();
          if ((localf.miI == 4) || (localf.miI == 5)) {
            i = 1;
          }
          if ((i != 0) && (paramAnonymousInt == 4) && (g.this.miX != null)) {
            g.this.miX.a(g.this.miY);
          }
        }
        GMTrace.o(11589163941888L, 86346);
      }
    };
    this.miQ = new com.tencent.mm.plugin.ipcall.a.f.d();
    this.miR = new com.tencent.mm.plugin.ipcall.a.f.i();
    this.miS = new com.tencent.mm.plugin.ipcall.a.f.a();
    this.miT = new com.tencent.mm.plugin.ipcall.a.f.h();
    this.miU = new com.tencent.mm.plugin.ipcall.a.f.c();
    this.miV = new e();
    this.miW = new com.tencent.mm.plugin.ipcall.a.f.g();
    this.miX = new com.tencent.mm.plugin.ipcall.a.f.f();
    GMTrace.o(11589298159616L, 86347);
  }
  
  private boolean c(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591311425536L, 86362);
    if ((this.miY == null) || (paramObject == null))
    {
      w.e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
      GMTrace.o(11591311425536L, 86362);
      return true;
    }
    Object localObject1;
    label503:
    label635:
    label693:
    label874:
    label1474:
    label1563:
    Object localObject2;
    switch (paramInt1)
    {
    case 7: 
    default: 
    case 1: 
    case 3: 
    case 4: 
    case 8: 
      do
      {
        for (;;)
        {
          GMTrace.o(11591311425536L, 86362);
          return false;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.i))
          {
            w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          localObject1 = (com.tencent.mm.plugin.ipcall.a.d.i)paramObject;
          paramObject = ((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mlO;
          if (this.miY.mjI != ((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mlN.uKf)
          {
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.miY.mjI), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mlN.uKf) });
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", new Object[] { Integer.valueOf(this.miY.mjI) });
          localObject1 = i.aIq();
          paramInt1 = this.miY.mjI;
          if (((b)localObject1).mjI == paramInt1)
          {
            w.d("MicroMsg.IPCallReportHelper", "setInviteCgiRet: %d", new Object[] { Integer.valueOf(paramInt3) });
            ((b)localObject1).mlg = paramInt3;
          }
          if ((paramInt2 == 0) && (paramInt3 == 0))
          {
            if (this.miY != null)
            {
              this.miY.mjF = ((auz)paramObject).uhU;
              this.miY.mjG = ((auz)paramObject).uhV;
              this.miY.mjH = ((auz)paramObject).uKh;
              this.miY.mjN = ((auz)paramObject).uKq;
              this.miY.mjP = (((auz)paramObject).uKr * 1000);
              this.miY.mjW = ((auz)paramObject).mjW;
              this.miY.mjX = ((auz)paramObject).mjX;
              this.miY.iYB = ((auz)paramObject).tSO;
              this.miY.mkd = ((auz)paramObject).uKs;
              this.miY.mki = ((auz)paramObject).uKt;
              if (((auz)paramObject).mke > 0) {
                this.miY.mke = ((auz)paramObject).mke;
              }
              this.miY.mjY = ((auz)paramObject).mjY;
              this.miY.mjZ = ((auz)paramObject).mjZ;
              this.miY.mjV = ((auz)paramObject).uKv;
              if (((auz)paramObject).mkb > 0)
              {
                this.miY.mkb = (((auz)paramObject).mkb - 1);
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.miY.mkb + "] from Invite resp");
                this.miY.mkc = ((auz)paramObject).uKu;
                w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo NextInvite:%d", new Object[] { Integer.valueOf(((auz)paramObject).mjQ) });
                if (((auz)paramObject).mjQ <= 0) {
                  break label635;
                }
                this.miY.mjU = false;
              }
              for (this.miY.mjQ = ((auz)paramObject).mjQ;; this.miY.mjQ = 0)
              {
                this.miY.mjM = ((auz)paramObject).mjM;
                this.miY.mjL = ((auz)paramObject).mjL;
                this.miY.kBk = paramInt3;
                this.miY.kBl = bg.nl(com.tencent.mm.platformtools.n.a(((auz)paramObject).uND.tTE));
                break;
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                this.miY.mkb = 2;
                break label503;
                this.miY.mjU = true;
              }
            }
          }
          else
          {
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
            if (((auz)paramObject).uND != null)
            {
              if (paramInt3 == 433)
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                this.miY.mjR = true;
                if (((auz)paramObject).mjQ <= 0) {
                  break label874;
                }
                this.miY.mjU = false;
              }
              for (this.miY.mjQ = ((auz)paramObject).mjQ;; this.miY.mjQ = 0)
              {
                this.miY.mjM = ((auz)paramObject).mjM;
                this.miY.mjL = ((auz)paramObject).mjL;
                this.miY.kBk = paramInt3;
                if (((azh)paramObject).uND == null) {
                  break;
                }
                this.miY.kBl = bg.nl(com.tencent.mm.platformtools.n.a(((auz)paramObject).uND.tTE));
                w.d("MicroMsg.IPCallSvrLogic", "ErrLevel:%d,ErrCode:%d,ErrMsg:%s", new Object[] { Integer.valueOf(((auz)paramObject).mjL), Integer.valueOf(paramInt3), this.miY.kBl });
                break;
                if (paramInt3 == 434)
                {
                  w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                  this.miY.mjS = true;
                  break label693;
                }
                if (paramInt3 != 435) {
                  break label693;
                }
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                this.miY.mjT = true;
                break label693;
                this.miY.mjU = true;
              }
            }
            this.miY.mjM = "";
            this.miY.mjL = 2;
            this.miY.kBl = ab.getContext().getString(R.l.dbJ);
            this.miY.kBk = paramInt3;
            continue;
            if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.a))
            {
              w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
              GMTrace.o(11591311425536L, 86362);
              return true;
            }
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
            paramObject = (com.tencent.mm.plugin.ipcall.a.d.a)paramObject;
            if (this.miY.mjI != ((com.tencent.mm.plugin.ipcall.a.d.a)paramObject).mlw.uKf)
            {
              w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.miY.mjI), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.a)paramObject).mlw.uKf) });
              GMTrace.o(11591311425536L, 86362);
              return true;
              if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.n))
              {
                w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                GMTrace.o(11591311425536L, 86362);
                return true;
              }
              paramObject = (com.tencent.mm.plugin.ipcall.a.d.n)paramObject;
              if (this.miY.mjF != ((com.tencent.mm.plugin.ipcall.a.d.n)paramObject).mlX.uhU)
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.n)paramObject).mlX.uhU) });
                GMTrace.o(11591311425536L, 86362);
                return true;
              }
              if ((paramInt2 == 0) && (paramInt3 == 0))
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                this.miY.idN = 5;
              }
              else
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
              }
            }
          }
        }
        if (!(paramObject instanceof ava))
        {
          w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
        paramObject = (ava)paramObject;
        if (this.miY.mjF != ((ava)paramObject).uhU)
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(((ava)paramObject).uhU) });
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
      } while ((paramInt2 != 0) || (paramInt3 != 0));
      this.miY.mka = ((ava)paramObject).mka;
      w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo updateNotifyCallInfo, UserStatuslist.size: %d", new Object[] { Integer.valueOf(((ava)paramObject).uKw.size()) });
      paramObject = ((ava)paramObject).uKw.iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject1 = (avj)((Iterator)paramObject).next();
        if (this.miY.mjN != ((avj)localObject1).uKF) {
          break label1563;
        }
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(this.miY.mjN), Integer.valueOf(((avj)localObject1).uJk), Integer.valueOf(((avj)localObject1).uKG) });
        if (((avj)localObject1).uKG > this.miY.mjO)
        {
          this.miY.mjO = ((avj)localObject1).uKG;
          if (((avj)localObject1).uJk != 0) {
            this.miY.idN = ((avj)localObject1).uJk;
          }
        }
        if ((((avj)localObject1).kBk == 404) || (((avj)localObject1).kBk == 484))
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
          this.miY.mjT = true;
        }
        this.miY.kBl = ((avj)localObject1).kBl;
        this.miY.kBk = ((avj)localObject1).kBk;
        this.miY.mjL = ((avj)localObject1).mjL;
        this.miY.mjM = ((avj)localObject1).mjM;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(((avj)localObject1).uKF), Integer.valueOf(((avj)localObject1).uJk), Integer.valueOf(((avj)localObject1).uKG) });
      paramInt1 = 0;
      localObject2 = this.miY.mkf.iterator();
      label1622:
      if (((Iterator)localObject2).hasNext())
      {
        com.tencent.mm.plugin.ipcall.a.a.d locald = (com.tencent.mm.plugin.ipcall.a.a.d)((Iterator)localObject2).next();
        if (locald.mkl != ((avj)localObject1).uKF) {
          break label2577;
        }
        if (((avj)localObject1).uKG > locald.mjO)
        {
          locald.mjO = ((avj)localObject1).uKG;
          if (((avj)localObject1).uJk != 0) {
            locald.fYb = ((avj)localObject1).uJk;
          }
        }
        paramInt1 = 1;
      }
      break;
    }
    label2204:
    label2320:
    label2574:
    label2575:
    label2577:
    for (;;)
    {
      break label1622;
      if (paramInt1 != 0) {
        break label1474;
      }
      localObject2 = new com.tencent.mm.plugin.ipcall.a.a.d();
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mkl = ((avj)localObject1).uKF;
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).fYb = ((avj)localObject1).uJk;
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mjO = ((avj)localObject1).uKG;
      this.miY.mkf.add(localObject2);
      break label1474;
      if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.k))
      {
        w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      paramObject = (com.tencent.mm.plugin.ipcall.a.d.k)paramObject;
      localObject1 = ((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mlS;
      if (this.miY.mjF != ((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mlR.uhU)
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mlR.uhU) });
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
        this.miY.iYB = ((avc)localObject1).tSO;
        this.miY.mkd = ((avc)localObject1).uKs;
        break;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
      break;
      if (!(paramObject instanceof o))
      {
        w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localObject1 = (o)paramObject;
      paramObject = ((o)localObject1).mma;
      if (this.miY.mjF != ((o)localObject1).mlZ.uhU)
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(((o)localObject1).mlZ.uhU) });
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        break;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", new Object[] { Integer.valueOf(((avi)paramObject).uhU), Integer.valueOf(((avi)paramObject).uKE), Integer.valueOf(((avi)paramObject).uKF), Integer.valueOf(((avi)paramObject).uKC) });
      if ((((avi)paramObject).uhU != this.miY.mjF) || (((avi)paramObject).uhV != this.miY.mjG)) {
        break;
      }
      if (((avi)paramObject).uKF == this.miY.mjN)
      {
        w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync update self status");
        if (((avi)paramObject).uKC > this.miY.mjO)
        {
          this.miY.mjO = ((avi)paramObject).uKC;
          if (((avi)paramObject).uKE != 0) {
            this.miY.idN = ((avi)paramObject).uKE;
          }
        }
      }
      for (;;)
      {
        if ((((avi)paramObject).kBk == 404) || (((avi)paramObject).kBk == 484))
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
          this.miY.mjT = true;
        }
        this.miY.kBl = ((avi)paramObject).kBl;
        this.miY.kBk = ((avi)paramObject).kBk;
        this.miY.mjL = ((avi)paramObject).mjL;
        this.miY.mjM = ((avi)paramObject).mjM;
        this.miY.mka = ((avi)paramObject).mka;
        break;
        w.d("MicroMsg.IPCallSvrLogic", " handleServiceResultCallInfosync update others status");
        localObject1 = this.miY.mkf.iterator();
        paramInt1 = 0;
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.ipcall.a.a.d)((Iterator)localObject1).next();
          if (((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mkl != ((avi)paramObject).uKF) {
            break label2574;
          }
          if (((avi)paramObject).uKC > ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mjO)
          {
            ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mjO = ((avi)paramObject).uKC;
            if (((avi)paramObject).uKE != 0) {
              ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).fYb = ((avi)paramObject).uKE;
            }
          }
          paramInt1 = 1;
        }
        for (;;)
        {
          break label2320;
          if (paramInt1 != 0) {
            break label2575;
          }
          localObject1 = new com.tencent.mm.plugin.ipcall.a.a.d();
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).mkl = ((avi)paramObject).uKF;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).fYb = ((avi)paramObject).uKE;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).mjO = ((avi)paramObject).uKC;
          this.miY.mkf.add(localObject1);
          break label2204;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.h))
          {
            w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramObject = (com.tencent.mm.plugin.ipcall.a.d.h)paramObject;
          if (this.miY.mjF == ((com.tencent.mm.plugin.ipcall.a.d.h)paramObject).mlL.uhU) {
            break;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.h)paramObject).mlL.uhU) });
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
      }
    }
  }
  
  private void fi(boolean paramBoolean)
  {
    GMTrace.i(11589700812800L, 86350);
    w.i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.miN), Boolean.valueOf(this.miO) });
    if ((this.miN) || (this.miO))
    {
      w.i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
      GMTrace.o(11589700812800L, 86350);
      return;
    }
    if (paramBoolean)
    {
      if (this.miP != null)
      {
        if (this.miY.mjU) {
          break label160;
        }
        this.miP.y(this.miY.mjM, this.miY.kBl, this.miY.mjL);
      }
      for (;;)
      {
        w.i("MicroMsg.IPCallSvrLogic", "start sync");
        this.miR.a(this.miY);
        GMTrace.o(11589700812800L, 86350);
        return;
        label160:
        this.miP.aHF();
      }
    }
    if (this.miP != null)
    {
      if (this.miY.mjR)
      {
        this.miP.v(this.miY.mjM, this.miY.kBl, this.miY.mjL);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (this.miY.mjS)
      {
        this.miP.w(this.miY.mjM, this.miY.kBl, this.miY.mjL);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (this.miY.mjT)
      {
        this.miP.x(this.miY.mjM, this.miY.kBl, this.miY.mjL);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (!this.miY.mjU)
      {
        this.miP.y(this.miY.mjM, this.miY.kBl, this.miY.mjL);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      this.miP.u(this.miY.mjM, this.miY.kBl, this.miY.mjL);
    }
    GMTrace.o(11589700812800L, 86350);
  }
  
  private void fj(boolean paramBoolean)
  {
    GMTrace.i(11589835030528L, 86351);
    w.i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      this.miK += 1;
      if (this.miK >= 2)
      {
        w.e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
        this.miU.stop();
        if ((i.aIs().aIl()) && (this.miP != null))
        {
          this.miP.aHJ();
          GMTrace.o(11589835030528L, 86351);
        }
      }
    }
    else
    {
      this.miK = 0;
    }
    GMTrace.o(11589835030528L, 86351);
  }
  
  private void fk(boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(11590237683712L, 86354);
    w.i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.aIp().mkR)) {
      i.aIp().pp(this.miY.mka);
    }
    if (!paramBoolean)
    {
      w.e("MicroMsg.IPCallSvrLogic", "sync failed!");
      this.miR.stop();
      if (i.aIs().miI == 3) {}
      for (;;)
      {
        if ((i != 0) && (this.miP != null)) {
          this.miP.bh(this.miY.kBl, this.miY.mjL);
        }
        GMTrace.o(11590237683712L, 86354);
        return;
        i = 0;
      }
    }
    if ((this.miY != null) && (paramBoolean)) {
      pn(this.miY.aIG());
    }
    GMTrace.o(11590237683712L, 86354);
  }
  
  private void fl(boolean paramBoolean)
  {
    GMTrace.i(11590371901440L, 86355);
    w.i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.aIp().mkR)) {
      i.aIp().pp(this.miY.mka);
    }
    if ((this.miY != null) && (paramBoolean))
    {
      int i = this.miY.aIG();
      if ((i == 2) || (i == 1))
      {
        if (!this.mja)
        {
          o localo = new o(this.miY.mjF, this.miY.mjG, this.miY.aIF(), this.miY.mjH, false);
          at.wS().a(localo, 0);
        }
      }
      else {
        pn(this.miY.aIG());
      }
    }
    else
    {
      GMTrace.o(11590371901440L, 86355);
      return;
    }
    w.i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
    GMTrace.o(11590371901440L, 86355);
  }
  
  private void fm(boolean paramBoolean)
  {
    Object localObject2 = null;
    GMTrace.i(11590640336896L, 86357);
    w.i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.ipcall.a.c.a locala;
    com.tencent.mm.plugin.ipcall.a.a.c localc;
    if (paramBoolean)
    {
      locala = i.aIp();
      localc = this.miY;
      w.i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
      if ((localc == null) || (localc.iYB == null) || (localc.iYB.size() <= 0)) {
        break label154;
      }
    }
    label154:
    for (bof localbof = com.tencent.mm.plugin.ipcall.b.c.Y(localc.iYB);; localbof = null)
    {
      Object localObject1 = localObject2;
      if (localc != null)
      {
        localObject1 = localObject2;
        if (localc.mkd != null)
        {
          localObject1 = localObject2;
          if (localc.mkd.size() > 0) {
            localObject1 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.mkd);
          }
        }
      }
      locala.mkO.a(localbof, localbof, (bof)localObject1, 0, 0);
      GMTrace.o(11590640336896L, 86357);
      return;
    }
  }
  
  private void l(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11589969248256L, 86352);
    w.i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (paramInt < 0) && (this.miM <= 0))
    {
      this.miM += 1;
      w.i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", new Object[] { Integer.valueOf(this.miM) });
      this.miS.a(this.miY);
      GMTrace.o(11589969248256L, 86352);
      return;
    }
    GMTrace.o(11589969248256L, 86352);
  }
  
  private void m(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11590103465984L, 86353);
    w.i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.miT.mmJ) });
    if ((!paramBoolean) && (paramInt < 0) && (this.miL <= 0))
    {
      this.miL += 1;
      w.i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", new Object[] { Integer.valueOf(this.miL), Boolean.valueOf(this.miT.mmJ) });
      this.miT.a(this.miY);
      GMTrace.o(11590103465984L, 86353);
      return;
    }
    GMTrace.o(11590103465984L, 86353);
  }
  
  public final void a(int paramInt1, com.tencent.mm.ad.k paramk, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591042990080L, 86360);
    if (c(paramInt1, paramk, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
      GMTrace.o(11591042990080L, 86360);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11591042990080L, 86360);
      return;
      fk(true);
      GMTrace.o(11591042990080L, 86360);
      return;
      fj(true);
    }
  }
  
  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11590774554624L, 86358);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
      GMTrace.o(11590774554624L, 86358);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11590774554624L, 86358);
      return;
      fi(true);
      GMTrace.o(11590774554624L, 86358);
      return;
      l(true, paramInt3);
      GMTrace.o(11590774554624L, 86358);
      return;
      m(true, paramInt3);
      GMTrace.o(11590774554624L, 86358);
      return;
      fl(true);
      GMTrace.o(11590774554624L, 86358);
      return;
      fm(true);
    }
  }
  
  public final void aIm()
  {
    GMTrace.i(11589432377344L, 86348);
    if (this.miY.mkk) {
      w.e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
    }
    this.miN = true;
    w.i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(this.miY.mjI) });
    this.miU.stop();
    this.miR.stop();
    this.miS.a(this.miY);
    this.miW.a(this.miY);
    GMTrace.o(11589432377344L, 86348);
  }
  
  public final void b(int paramInt1, com.tencent.mm.ad.k paramk, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591177207808L, 86361);
    if (c(paramInt1, paramk, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
      GMTrace.o(11591177207808L, 86361);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11591177207808L, 86361);
      return;
      fk(false);
      GMTrace.o(11591177207808L, 86361);
      return;
      fj(false);
    }
  }
  
  public final void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11590908772352L, 86359);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
      GMTrace.o(11590908772352L, 86359);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11590908772352L, 86359);
      return;
      fi(false);
      GMTrace.o(11590908772352L, 86359);
      return;
      l(false, paramInt3);
      GMTrace.o(11590908772352L, 86359);
      return;
      m(false, paramInt3);
      GMTrace.o(11590908772352L, 86359);
      return;
      fl(false);
      GMTrace.o(11590908772352L, 86359);
      return;
      fm(false);
    }
  }
  
  public final void pm(int paramInt)
  {
    GMTrace.i(11589566595072L, 86349);
    if (!this.miY.mkk) {
      w.e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
    }
    w.i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.miY.mjF), Integer.valueOf(this.miY.mjI) });
    this.miO = true;
    this.miU.stop();
    this.miR.stop();
    this.miT.mmJ = false;
    this.miT.mmI = paramInt;
    this.miT.a(this.miY);
    this.miW.a(this.miY);
    GMTrace.o(11589566595072L, 86349);
  }
  
  public final boolean pn(int paramInt)
  {
    GMTrace.i(11590506119168L, 86356);
    switch (paramInt)
    {
    default: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11590506119168L, 86356);
      return false;
    case 2: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(this.miN), Boolean.valueOf(this.miO) });
      if ((this.miN) || (this.miO))
      {
        GMTrace.o(11590506119168L, 86356);
        return true;
      }
      this.miR.stop();
      if (!this.eQN)
      {
        this.eQN = true;
        if (this.miY != null) {
          this.miY.mkk = true;
        }
        if (this.miP != null) {
          this.miP.aHH();
        }
        this.miU.a(this.miY);
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 3: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
      this.miR.stop();
      this.miU.stop();
      if (this.miP != null) {
        this.miP.bg(this.miY.kBl, this.miY.mjL);
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 1: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
      if (!this.miZ)
      {
        this.miZ = true;
        if (this.miP != null) {
          this.miP.aHG();
        }
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 5: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
      if (this.miP != null) {
        this.miP.aHI();
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 4: 
    case 7: 
    case 8: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
      if (this.miY.mjT) {
        if (this.miP != null) {
          this.miP.x(this.miY.mjM, this.miY.kBl, this.miY.mjL);
        }
      }
      for (;;)
      {
        GMTrace.o(11590506119168L, 86356);
        return true;
        if (this.miP != null) {
          this.miP.bf(this.miY.kBl, this.miY.mjL);
        }
      }
    }
    w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
    this.miY.mjR = true;
    if (this.miP != null) {
      this.miP.v(this.miY.mjM, this.miY.kBl, this.miY.mjL);
    }
    GMTrace.o(11590506119168L, 86356);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void aHF();
    
    public abstract void aHG();
    
    public abstract void aHH();
    
    public abstract void aHI();
    
    public abstract void aHJ();
    
    public abstract void bf(String paramString, int paramInt);
    
    public abstract void bg(String paramString, int paramInt);
    
    public abstract void bh(String paramString, int paramInt);
    
    public abstract void u(String paramString1, String paramString2, int paramInt);
    
    public abstract void v(String paramString1, String paramString2, int paramInt);
    
    public abstract void w(String paramString1, String paramString2, int paramInt);
    
    public abstract void x(String paramString1, String paramString2, int paramInt);
    
    public abstract void y(String paramString1, String paramString2, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */