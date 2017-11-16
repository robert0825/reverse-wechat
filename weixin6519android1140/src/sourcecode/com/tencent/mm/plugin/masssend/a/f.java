package com.tencent.mm.plugin.masssend.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.b;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.protocal.c.anq;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import junit.framework.Assert;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gGV;
  g.a gMa;
  boolean guN;
  int hcx;
  private a mTj;
  int retCode;
  
  public f(a parama, boolean paramBoolean)
  {
    this(parama, paramBoolean, 0);
    GMTrace.i(11211743690752L, 83534);
    GMTrace.o(11211743690752L, 83534);
  }
  
  public f(a parama, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11211877908480L, 83535);
    this.mTj = null;
    this.gMa = null;
    this.retCode = 0;
    this.hcx = 0;
    this.guN = false;
    this.mTj = parama;
    this.gGV = paramInt;
    parama.hcs = bg.Pv();
    if (parama.msgType == 43)
    {
      parama.status = 104;
      com.tencent.mm.modelvideo.o.Nh();
      parama.mTe = s.mm(s.ml(parama.aNu()));
      com.tencent.mm.modelvideo.o.Nh();
      parama.eqU = s.mm(s.mk(parama.aNu()));
      this.hcx = 2500;
      if (parama.mTf == 2) {
        this.hcx = 2500;
      }
    }
    Object localObject;
    for (;;)
    {
      localObject = new b.a();
      ((b.a)localObject).gtF = new anp();
      ((b.a)localObject).gtG = new anq();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/masssend";
      ((b.a)localObject).gtE = 193;
      ((b.a)localObject).gtH = 84;
      ((b.a)localObject).gtI = 1000000084;
      this.fUa = ((b.a)localObject).DA();
      localObject = (anp)this.fUa.gtC.gtK;
      ((anp)localObject).uCt = com.tencent.mm.a.g.n(parama.aNw().getBytes());
      ((anp)localObject).uCE = parama.mTb;
      ((anp)localObject).uCs = parama.aNw();
      parama.gVP = bg.Pv();
      ((anp)localObject).uCu = parama.aNt();
      ((anp)localObject).lQc = parama.msgType;
      ((anp)localObject).uCv = parama.mTc;
      if (!paramBoolean) {
        break label553;
      }
      i = j;
      label304:
      ((anp)localObject).uCF = i;
      ((anp)localObject).usj = paramInt;
      this.gMa = new g.a();
      GMTrace.o(11211877908480L, 83535);
      return;
      if (parama.msgType != 34) {
        break;
      }
      this.hcx = 40;
      parama.status = 104;
      parama.eqU = com.tencent.mm.modelvoice.o.mm(parama.aNu());
      parama.mTe = 0;
    }
    if (parama.msgType == 3)
    {
      this.hcx = 40;
      if (paramInt != 1) {
        break label559;
      }
      this.hcx = 1250;
    }
    label553:
    label559:
    for (int i = 1;; i = 0)
    {
      parama.mTg = i;
      parama.status = 104;
      parama.mTe = 0;
      localObject = new StringBuilder();
      at.AR();
      parama.eqU = com.tencent.mm.a.e.aY(c.yU() + parama.aNu());
      break;
      if (parama.msgType == 1)
      {
        this.hcx = 1;
        parama.status = 104;
        parama.eqU = parama.aNu().getBytes().length;
        parama.mTe = 0;
        break;
      }
      w.d("MicroMsg.NetSceneMasSend", "error msgtype:" + parama.msgType);
      Assert.assertTrue("error msgtype:" + parama.msgType, false);
      break;
      i = 0;
      break label304;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(11212146343936L, 83537);
    this.fUd = parame1;
    if (this.guN)
    {
      w.d("MicroMsg.NetSceneMasSend", "isCancel");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    this.hcx -= 1;
    if (this.hcx < 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "MAX_SEND_TIMES");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.mTj == null)
    {
      w.d("MicroMsg.NetSceneMasSend", "MasSendInfo is null");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (bg.nm(this.mTj.aNw()))
    {
      w.d("MicroMsg.NetSceneMasSend", "MasSendInfo.toList is null");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.mTj.mTb == 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "getTolistCount is 0");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.mTj.eqU <= 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "getDataLen is 0");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if ((this.mTj.status == 103) && (this.mTj.mTe <= 0))
    {
      w.d("MicroMsg.NetSceneMasSend", "getThumbTotalLen is 0");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if ((this.mTj.status != 103) && (this.mTj.status != 104))
    {
      w.d("MicroMsg.NetSceneMasSend", "msg type :" + this.mTj.msgType);
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    parame1 = (anp)this.fUa.gtC.gtK;
    Object localObject1;
    Object localObject2;
    if (this.mTj.msgType == 43)
    {
      localObject1 = this.mTj.aNu();
      if (bg.nm((String)localObject1))
      {
        w.d("MicroMsg.NetSceneMasSend", "MasSendInfo.fileName is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        i = -1;
      }
      for (;;)
      {
        if (i == 0) {
          break label2284;
        }
        GMTrace.o(11212146343936L, 83537);
        return i;
        parame1.uCw = new azp();
        parame1.uCx = 0;
        parame1.uCB = new azp();
        parame1.uCA = 0;
        parame1.uCC = 2;
        parame1.uCv = this.mTj.mTc;
        if (this.mTj.mTf > 0) {}
        for (i = 2;; i = 0)
        {
          parame1.uCD = i;
          parame1.uCz = this.mTj.mTe;
          parame1.uCy = this.mTj.eqU;
          if (this.mTj.status != 103) {
            break label909;
          }
          com.tencent.mm.modelvideo.o.Nh();
          localObject2 = s.h(s.ml((String)localObject1), this.mTj.hcq, 8000);
          if ((((s.b)localObject2).ret >= 0) && (((s.b)localObject2).eyw != 0)) {
            break label677;
          }
          w.e("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "]  Error ");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
          break;
        }
        label677:
        w.d("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).eyw + " newOff:" + ((s.b)localObject2).hcV + " netOff:" + this.mTj.hcq);
        if (((s.b)localObject2).hcV >= this.mTj.hcq) {
          break;
        }
        w.e("MicroMsg.NetSceneMasSend", "Err doScene READ THUMB[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).hcV + " OldtOff:" + this.mTj.hcq);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        i = -1;
      }
      localObject1 = new byte[((s.b)localObject2).eyw];
      System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).eyw);
      parame1.uCA = this.mTj.hcq;
      localObject2 = new azp();
      ((azp)localObject2).be((byte[])localObject1);
      parame1.uCB = ((azp)localObject2);
      for (;;)
      {
        i = 0;
        break;
        label909:
        com.tencent.mm.modelvideo.o.Nh();
        localObject2 = s.h(s.mk((String)localObject1), this.mTj.mTd, 8000);
        if ((((s.b)localObject2).ret < 0) || (((s.b)localObject2).eyw == 0))
        {
          w.e("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "]  Error ");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
          break;
        }
        w.d("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).eyw + " newOff:" + ((s.b)localObject2).hcV + " netOff:" + this.mTj.mTd);
        if (((s.b)localObject2).hcV < this.mTj.mTd)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).hcV + " OldtOff:" + this.mTj.mTd);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
          break;
        }
        if (((s.b)localObject2).hcV >= 20971520)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] maxsize:20971520");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
          break;
        }
        localObject1 = new byte[((s.b)localObject2).eyw];
        System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).eyw);
        parame1.uCx = this.mTj.mTd;
        parame1.uCA = this.mTj.hcq;
        localObject2 = new azp();
        ((azp)localObject2).be((byte[])localObject1);
        parame1.uCw = ((azp)localObject2);
      }
    }
    if (this.mTj.msgType == 34)
    {
      parame1.uCC = 0;
      parame1.uCD = 0;
      parame1.uCw = new azp().be(new byte[0]);
      parame1.uCx = 0;
      parame1.uCB = new azp().be(new byte[0]);
      parame1.uCA = 0;
      parame1.uCz = 0;
      parame1.uCy = this.mTj.eqU;
      localObject1 = com.tencent.mm.modelvoice.q.mK(this.mTj.aNu());
      if (localObject1 == null)
      {
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        w.d("MicroMsg.NetSceneMasSend", "fileop is null");
        i = -1;
      }
      while (i != 0)
      {
        GMTrace.o(11212146343936L, 83537);
        return -1;
        localObject2 = ((com.tencent.mm.modelvoice.b)localObject1).bd(this.mTj.mTd, 8000);
        if (((com.tencent.mm.modelvoice.g)localObject2).ret < 0)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ file[" + this.mTj.aNu() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).eyw + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).hcV + " netOff:" + this.mTj.mTd);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
        }
        else if ((((com.tencent.mm.modelvoice.g)localObject2).hcV < this.mTj.mTd) || (((com.tencent.mm.modelvoice.g)localObject2).hcV >= 469000))
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ offseterror file[" + this.mTj.aNu() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).eyw + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).hcV + " netOff:" + this.mTj.mTd);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
        }
        else if (this.mTj.eqU <= 0)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ datalen file[" + this.mTj.aNu() + "] read totalLen:" + this.mTj.eqU);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          i = -1;
        }
        else
        {
          byte[] arrayOfByte = new byte[((com.tencent.mm.modelvoice.g)localObject2).eyw];
          System.arraycopy(((com.tencent.mm.modelvoice.g)localObject2).buf, 0, arrayOfByte, 0, ((com.tencent.mm.modelvoice.g)localObject2).eyw);
          parame1.uCw = new azp().be(arrayOfByte);
          parame1.uCv = this.mTj.mTc;
          parame1.uCx = this.mTj.mTd;
          parame1.uCG = ((com.tencent.mm.modelvoice.b)localObject1).getFormat();
        }
      }
    }
    if (this.mTj.msgType == 3)
    {
      if (bg.nm(this.mTj.aNu()))
      {
        w.d("MicroMsg.NetSceneMasSend", "getFilename is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
        i = -1;
      }
      while (i != 0)
      {
        GMTrace.o(11212146343936L, 83537);
        return -1;
        parame1.uCC = 0;
        parame1.uCD = 0;
        parame1.uCw = new azp().be(new byte[0]);
        parame1.uCx = 0;
        parame1.uCB = new azp().be(new byte[0]);
        parame1.uCA = 0;
        parame1.uCz = 0;
        parame1.uCv = 0;
        parame1.uCz = this.mTj.mTe;
        parame1.uCy = this.mTj.eqU;
        parame1.usj = this.gGV;
        localObject1 = new StringBuilder();
        at.AR();
        localObject1 = c.yU() + this.mTj.aNu();
        int k = this.mTj.eqU - this.mTj.mTd;
        i = k;
        if (k > 8000) {
          i = 8000;
        }
        localObject1 = com.tencent.mm.a.e.c((String)localObject1, this.mTj.mTd, i);
        if (bg.bq((byte[])localObject1))
        {
          w.e("MicroMsg.NetSceneMasSend", "doScene READ data[" + this.mTj.aNu() + "]  Error ");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
          i = -1;
        }
        else
        {
          parame1.uCx = this.mTj.mTd;
          parame1.uCA = this.mTj.hcq;
          localObject2 = new azp();
          ((azp)localObject2).be((byte[])localObject1);
          parame1.uCw = ((azp)localObject2);
          i = j;
        }
      }
    }
    if (this.mTj.msgType == 1)
    {
      parame1.uCw = new azp().be(this.mTj.aNu().getBytes());
      parame1.uCy = this.mTj.eqU;
      parame1.uCv = 0;
      parame1.uCx = 0;
      parame1.uCB = new azp().be(new byte[0]);
      parame1.uCA = 0;
      parame1.uCz = 0;
      parame1.uCC = 0;
      parame1.uCD = 0;
      label2284:
      i = a(parame, this.fUa, this);
      GMTrace.o(11212146343936L, 83537);
      return i;
    }
    w.d("MicroMsg.NetSceneMasSend", "error msgtype:" + this.mTj.msgType);
    this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
    GMTrace.o(11212146343936L, 83537);
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(11212280561664L, 83538);
    int i = k.b.gum;
    GMTrace.o(11212280561664L, 83538);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11212683214848L, 83541);
    w.d("MicroMsg.NetSceneMasSend", "onGYNetEnd  errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if (this.mTj == null)
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if ((this.mTj.status != 104) && (this.mTj.status != 103))
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + this.mTj.status);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    paramArrayOfByte = (anq)this.fUa.gtD.gtK;
    paramq = (anp)this.fUa.gtC.gtK;
    if ((paramq.uCz > 0) && (paramq.uCB != null) && (paramq.uCB.uNP != null) && (!bg.bq(paramq.uCB.uNP.toByteArray())) && (paramq.uCA != paramArrayOfByte.uCA - paramq.uCB.uNN))
    {
      w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if ((paramq.uCy > 0) && (paramq.uCw != null) && (paramq.uCw.uNP != null) && (!bg.bq(paramq.uCw.uNP.toByteArray())) && (paramq.uCx != paramArrayOfByte.uCx - paramq.uCw.uNN))
    {
      w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
      this.fUd.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    this.mTj.hct = bg.Pu();
    paramInt1 = this.mTj.status;
    if (paramInt1 == 103)
    {
      paramArrayOfByte = this.mTj;
      paramInt1 = paramq.uCA;
      paramArrayOfByte.hcq = (paramq.uCB.uNN + paramInt1);
      if (this.mTj.hcq >= this.mTj.mTe) {
        this.mTj.status = 199;
      }
    }
    while (this.mTj.status != 199)
    {
      if (a(this.gtW, this.fUd) != -1) {
        break label1559;
      }
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.tA() + 10000));
      this.fUd.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
      if (paramInt1 == 104)
      {
        paramArrayOfByte = this.mTj;
        paramInt1 = paramq.uCx;
        paramArrayOfByte.mTd = (paramq.uCw.uNN + paramInt1);
        if (this.mTj.mTd >= this.mTj.eqU) {
          if (this.mTj.mTe > 0) {
            this.mTj.status = 103;
          } else {
            this.mTj.status = 199;
          }
        }
      }
      else
      {
        w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + paramInt1);
        this.retCode = (0 - com.tencent.mm.compatible.util.g.tA() - 10000);
        this.fUd.a(3, -1, "doScene failed", this);
        GMTrace.o(11212683214848L, 83541);
        return;
      }
    }
    paramArrayOfByte = h.aNB();
    a locala = this.mTj;
    if (locala != null)
    {
      locala.eQl = -1;
      ContentValues localContentValues = new ContentValues();
      if ((locala.eQl & 0x1) != 0) {
        localContentValues.put("clientid", locala.aNt());
      }
      if ((locala.eQl & 0x2) != 0) {
        localContentValues.put("status", Integer.valueOf(locala.status));
      }
      if ((locala.eQl & 0x4) != 0) {
        localContentValues.put("createtime", Long.valueOf(locala.hcs));
      }
      if ((locala.eQl & 0x8) != 0) {
        localContentValues.put("lastmodifytime", Long.valueOf(locala.hct));
      }
      if ((locala.eQl & 0x10) != 0) {
        localContentValues.put("filename", locala.aNu());
      }
      if ((locala.eQl & 0x20) != 0) {
        localContentValues.put("thumbfilename", locala.aNv());
      }
      if ((locala.eQl & 0x40) != 0) {
        localContentValues.put("tolist", locala.aNw());
      }
      if ((locala.eQl & 0x80) != 0) {
        localContentValues.put("tolistcount", Integer.valueOf(locala.mTb));
      }
      if ((locala.eQl & 0x100) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(locala.msgType));
      }
      if ((locala.eQl & 0x200) != 0) {
        localContentValues.put("mediatime", Integer.valueOf(locala.mTc));
      }
      if ((locala.eQl & 0x400) != 0) {
        localContentValues.put("datanetoffset", Integer.valueOf(locala.mTd));
      }
      if ((locala.eQl & 0x800) != 0) {
        localContentValues.put("datalen", Integer.valueOf(locala.eqU));
      }
      if ((locala.eQl & 0x1000) != 0) {
        localContentValues.put("thumbnetoffset", Integer.valueOf(locala.hcq));
      }
      if ((locala.eQl & 0x2000) != 0) {
        localContentValues.put("thumbtotallen", Integer.valueOf(locala.mTe));
      }
      if ((locala.eQl & 0x4000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(locala.mTf));
      }
      if ((locala.eQl & 0x8000) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(locala.mTg));
      }
      if ((locala.eQl & 0x10000) != 0)
      {
        if (locala.goL != null) {
          break label1507;
        }
        paramq = "";
        localContentValues.put("reserved3", paramq);
      }
      if ((locala.eQl & 0x20000) != 0)
      {
        if (locala.goM != null) {
          break label1517;
        }
        paramq = "";
        label1320:
        localContentValues.put("reserved4", paramq);
      }
      if ((int)paramArrayOfByte.goN.insert("massendinfo", "clientid", localContentValues) != -1)
      {
        at.AR();
        if (c.yP().TO("masssendapp") != null) {
          break label1527;
        }
        paramInt1 = 1;
        label1371:
        paramq = new ae();
        paramq.setUsername("masssendapp");
        paramq.setContent(b.a(locala));
        paramq.x(locala.hcs);
        paramq.dC(0);
        paramq.dz(0);
        if (paramInt1 == 0) {
          break label1532;
        }
        at.AR();
        c.yP().d(paramq);
        label1439:
        paramArrayOfByte.doNotify();
      }
    }
    if (this.gMa != null) {}
    for (long l = this.gMa.tD();; l = 0L)
    {
      w.d("MicroMsg.NetSceneMasSend", "!!!FIN: useTime:" + l);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
      label1507:
      paramq = locala.goL;
      break;
      label1517:
      paramq = locala.goM;
      break label1320;
      label1527:
      paramInt1 = 0;
      break label1371;
      label1532:
      at.AR();
      c.yP().a(paramq, "masssendapp");
      break label1439;
    }
    label1559:
    GMTrace.o(11212683214848L, 83541);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(11212548997120L, 83540);
    GMTrace.o(11212548997120L, 83540);
  }
  
  public final void cancel()
  {
    GMTrace.i(11212012126208L, 83536);
    this.guN = true;
    GMTrace.o(11212012126208L, 83536);
  }
  
  public final int getType()
  {
    GMTrace.i(11212817432576L, 83542);
    GMTrace.o(11212817432576L, 83542);
    return 193;
  }
  
  protected final int vB()
  {
    GMTrace.i(11212414779392L, 83539);
    GMTrace.o(11212414779392L, 83539);
    return 2500;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */