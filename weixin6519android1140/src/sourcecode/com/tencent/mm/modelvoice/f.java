package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.j.a;
import com.tencent.mm.j.a.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bmn;
import com.tencent.mm.protocal.c.bmo;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.be;
import junit.framework.Assert;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int endFlag;
  public String euR;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  aj gsj;
  private int hcV;
  private boolean hdn;
  private int hdr;
  public long hds;
  public int retCode;
  
  public f(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(551634862080L, 4110);
    GMTrace.o(551634862080L, 4110);
  }
  
  public f(String paramString, int paramInt)
  {
    GMTrace.i(551769079808L, 4111);
    this.retCode = 0;
    this.hcV = 0;
    this.hdn = false;
    this.endFlag = 0;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(571767521280L, 4260);
        p localp = q.mS(f.this.euR);
        if ((localp == null) || (!localp.NO()))
        {
          w.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + f.this.euR);
          f.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          f.this.fUd.a(3, -1, "doScene failed", f.this);
          GMTrace.o(571767521280L, 4260);
          return false;
        }
        if ((3 != localp.status) && (8 != localp.status))
        {
          long l = System.currentTimeMillis();
          if (l / 1000L - localp.hct > 30L)
          {
            w.e("MicroMsg.NetSceneUploadVoice", "Error ModifyTime in Read file:" + f.this.euR);
            f.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
            f.this.fUd.a(3, -1, "doScene failed", f.this);
            GMTrace.o(571767521280L, 4260);
            return false;
          }
          if (l - f.this.hds < 2000L)
          {
            w.d("MicroMsg.NetSceneUploadVoice", "TimerExpired :" + f.this.euR + " but last send time:" + (l - f.this.hds));
            GMTrace.o(571767521280L, 4260);
            return true;
          }
          g localg = q.mK(f.this.euR).bd(localp.hbc, 6000);
          w.d("MicroMsg.NetSceneUploadVoice", "pusher doscene:" + f.this.euR + " readByte:" + localg.eyw + " stat:" + localp.status);
          if (localg.eyw < 2000)
          {
            GMTrace.o(571767521280L, 4260);
            return true;
          }
        }
        if (f.this.a(f.this.gtW, f.this.fUd) == -1)
        {
          f.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          f.this.fUd.a(3, -1, "doScene failed", f.this);
        }
        GMTrace.o(571767521280L, 4260);
        return false;
      }
    }, true);
    if (paramString != null) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      w.d("MicroMsg.NetSceneUploadVoice", "NetSceneUploadVoice:  file:" + paramString);
      this.euR = paramString;
      this.hdr = paramInt;
      GMTrace.o(551769079808L, 4111);
      return;
      bool = false;
    }
  }
  
  public final boolean DF()
  {
    GMTrace.i(552305950720L, 4115);
    boolean bool = super.DF();
    if (bool) {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 239L, 1L, false);
    }
    GMTrace.o(552305950720L, 4115);
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(551903297536L, 4112);
    this.fUd = parame1;
    this.hdn = false;
    if (this.euR == null)
    {
      w.e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(551903297536L, 4112);
      return -1;
    }
    p localp = q.mS(this.euR);
    if ((localp == null) || (!localp.NO()))
    {
      w.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(551903297536L, 4112);
      return -1;
    }
    w.d("MicroMsg.NetSceneUploadVoice", "doScene file:" + this.euR + " netTimes:" + localp.hcx);
    if (!q.mJ(this.euR))
    {
      w.e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.euR);
      q.mp(this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(551903297536L, 4112);
      return -1;
    }
    parame1 = new g();
    int k;
    int j;
    int i;
    Object localObject;
    if (localp.status == 8)
    {
      w.v("MicroMsg.NetSceneUploadVoice", this.euR + " cancelFlag = 1");
      this.endFlag = 0;
      q.mP(localp.euR);
      k = 1;
      j = 0;
      int m = localp.hes;
      w.i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", new Object[] { Integer.valueOf(m) });
      i = m;
      if (m == 0)
      {
        m = q.mT(this.euR);
        w.i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", new Object[] { Integer.valueOf(m) });
        i = m;
        if (m < 0)
        {
          i = q.hp(this.hcV);
          w.i("MicroMsg.NetSceneUploadVoice", "fuck getMinTimeByOffset: %s", new Object[] { Integer.valueOf(i) });
        }
      }
      localObject = new b.a();
      ((b.a)localObject).gtF = new bmn();
      ((b.a)localObject).gtG = new bmo();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadvoice";
      ((b.a)localObject).gtE = 127;
      ((b.a)localObject).gtH = 19;
      ((b.a)localObject).gtI = 1000000019;
      this.fUa = ((b.a)localObject).DA();
      localObject = (bmn)this.fUa.gtC.gtK;
      ((bmn)localObject).lSY = com.tencent.mm.y.q.zE();
      ((bmn)localObject).lSX = localp.eQu;
      ((bmn)localObject).tWu = localp.hbc;
      ((bmn)localObject).tQN = localp.clientId;
      ((bmn)localObject).ugn = i;
      ((bmn)localObject).tTL = this.endFlag;
      ((bmn)localObject).tQd = localp.eSf;
      ((bmn)localObject).ugo = k;
      ((bmn)localObject).uWy = this.hdr;
      ((bmn)localObject).tQb = be.Bs();
      ((bmn)localObject).tQb = a.a.sa().q(localp.eQu, localp.hcw);
      ((bmn)localObject).uCG = j;
      if (k == 1) {
        break label1698;
      }
      ((bmn)localObject).ues = new azp().z(parame1.buf, parame1.eyw);
    }
    for (((bmn)localObject).ugl = parame1.eyw;; ((bmn)localObject).ugl = 1)
    {
      w.d("MicroMsg.NetSceneUploadVoice", "cancelFlag:" + k + " endFlag:" + this.endFlag + " svrId:" + localp.eSf);
      w.v("MicroMsg.NetSceneUploadVoice", "doscene msgId:" + ((bmn)localObject).tQd + " user:" + ((bmn)localObject).lSX + " offset:" + ((bmn)localObject).tWu + " dataLen:" + ((bmn)localObject).ues.uNN + " endFlag:" + ((bmn)localObject).tTL);
      w.i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + localp.eSf + " voiceFormat:" + j + " file:" + this.euR + " readBytes:" + parame1.eyw + " neTTTOff:" + localp.hbc + " neWWWOff:" + this.hcV + " endFlag:" + this.endFlag + " cancelFlag:" + k + " status:" + localp.status + " voiceLen:" + i);
      this.hds = System.currentTimeMillis();
      i = a(parame, this.fUa, this);
      GMTrace.o(551903297536L, 4112);
      return i;
      if (localp.status == 3) {
        this.hdn = true;
      }
      parame1 = q.mK(this.euR);
      if (parame1 == null)
      {
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
        w.e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", new Object[] { this.euR });
        GMTrace.o(551903297536L, 4112);
        return -1;
      }
      j = parame1.getFormat();
      w.d("MicroMsg.NetSceneUploadVoice", "format " + j);
      parame1 = parame1.bd(localp.hbc, 6000);
      w.d("MicroMsg.NetSceneUploadVoice", "doScene READ file[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localp.hbc + " line:" + com.tencent.mm.compatible.util.g.tA());
      if (parame1.ret < 0)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 241L, 1L, false);
        w.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localp.hbc);
        q.mp(this.euR);
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
        GMTrace.o(551903297536L, 4112);
        return -1;
      }
      this.hcV = parame1.hcV;
      if ((this.hcV < localp.hbc) || (this.hcV >= 469000))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 240L, 1L, false);
        w.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.euR + "] newOff:" + this.hcV + " OldtOff:" + localp.hbc);
        q.mp(this.euR);
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
        GMTrace.o(551903297536L, 4112);
        return -1;
      }
      this.endFlag = 0;
      if ((parame1.eyw == 0) && (!this.hdn))
      {
        w.e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.euR + " No Data temperature , will be retry");
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
        GMTrace.o(551903297536L, 4112);
        return -1;
      }
      if (this.hdn)
      {
        if (localp.gsL <= 0)
        {
          w.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.euR + "] read totalLen:" + localp.gsL);
          q.mp(this.euR);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(551903297536L, 4112);
          return -1;
        }
        if ((localp.gsL > this.hcV) && (parame1.eyw < 6000))
        {
          w.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.euR + "] readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localp.hbc + " totalLen:" + localp.gsL);
          q.mp(this.euR);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(551903297536L, 4112);
          return -1;
        }
        if (localp.gsL <= this.hcV) {
          this.endFlag = 1;
        }
      }
      k = 0;
      break;
      label1698:
      ((bmn)localObject).ues = new azp().b(com.tencent.mm.bm.b.aX(new byte[1]));
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(552037515264L, 4113);
    paramq = (bmn)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    w.v("MicroMsg.NetSceneUploadVoice", "check msgId:" + paramq.tQd + " offset:" + paramq.tWu + " dataLen:" + paramq.ues.uNN + " endFlag:" + paramq.tTL);
    if (((paramq.tQd == 0L) && (paramq.tWu != 0)) || (((paramq.ues == null) || (paramq.ues.uNN == 0)) && (paramq.tTL != 1) && (paramq.ugo != 1)))
    {
      i = k.b.gun;
      GMTrace.o(552037515264L, 4113);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(552037515264L, 4113);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(552574386176L, 4117);
    w.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.euR + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bmn)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (bmo)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      q.mq(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      q.mp(this.euR);
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 237L, 1L, false);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 236L, 1L, false);
      w.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.euR + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    w.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd msgId:" + paramq.tQd + " toUser:" + paramArrayOfByte.lSX);
    if ((paramq.tQd <= 0L) && (!x.fw(paramArrayOfByte.lSX)))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 235L, 1L, false);
      w.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.euR + " getMsgId:" + paramq.tQd + " netoff:" + paramq.tWu);
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    w.d("MicroMsg.NetSceneUploadVoice", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(paramq.tQd), Integer.valueOf(r.hkk) });
    if ((10007 == r.hkj) && (r.hkk != 0))
    {
      paramq.tQd = r.hkk;
      r.hkk = 0;
    }
    paramInt1 = q.a(this.euR, this.hcV, paramq.tQd, paramq.tQN, this.endFlag, this.hdr);
    w.d("MicroMsg.NetSceneUploadVoice", "dkmsgid onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.euR + " MsgSvrId:" + paramq.tQd + " clientId:" + paramq.tQN + " neWWOff:" + this.hcV + " neTTTT:" + paramq.ugl + " forwardflag:" + this.hdr);
    if (paramInt1 < 0)
    {
      q.mp(this.euR);
      w.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.euR + "UpdateAfterSend Ret:" + paramInt1);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    if (paramInt1 == 1)
    {
      w.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd finish file:" + this.euR);
      paramq = q.mS(this.euR);
      paramq = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramq.hcw);
      com.tencent.mm.modelstat.b.gWv.f(paramq);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(552574386176L, 4117);
      return;
    }
    if (this.hdn) {}
    for (long l = 0L;; l = 500L)
    {
      w.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.euR + " delay:" + l);
      this.gsj.z(l, l);
      GMTrace.o(552574386176L, 4117);
      return;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(552440168448L, 4116);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 238L, 1L, false);
    q.mp(this.euR);
    GMTrace.o(552440168448L, 4116);
  }
  
  public final int getType()
  {
    GMTrace.i(552708603904L, 4118);
    GMTrace.o(552708603904L, 4118);
    return 127;
  }
  
  protected final int vB()
  {
    GMTrace.i(552171732992L, 4114);
    GMTrace.o(552171732992L, 4114);
    return 60;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */