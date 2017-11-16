package com.tencent.mm.plugin.subapp.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bmn;
import com.tencent.mm.protocal.c.bmo;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public final class b
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
  public long hds;
  public int retCode;
  
  public b(String paramString)
  {
    GMTrace.i(5836457902080L, 43485);
    this.retCode = 0;
    this.hcV = 0;
    this.hdn = false;
    this.endFlag = 0;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5844242530304L, 43543);
        g localg = h.Jx(b.this.euR);
        if ((localg == null) || (!localg.NO()))
        {
          w.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + b.this.euR);
          b.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          b.this.fUd.a(3, -1, "doScene failed", b.this);
          GMTrace.o(5844242530304L, 43543);
          return false;
        }
        if ((3 != localg.field_status) && (8 != localg.field_status))
        {
          long l = System.currentTimeMillis();
          if (l / 1000L - localg.field_lastmodifytime > 30L)
          {
            w.e("MicroMsg.NetSceneUploadVoiceRemind", "Error ModifyTime in Read file:" + b.this.euR);
            b.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
            b.this.fUd.a(3, -1, "doScene failed", b.this);
            GMTrace.o(5844242530304L, 43543);
            return false;
          }
          if (l - b.this.hds < 2000L)
          {
            w.d("MicroMsg.NetSceneUploadVoiceRemind", "TimerExpired :" + b.this.euR + " but last send time:" + (l - b.this.hds));
            GMTrace.o(5844242530304L, 43543);
            return true;
          }
          c.a locala = h.Jy(b.this.euR).vP(localg.field_offset);
          w.d("MicroMsg.NetSceneUploadVoiceRemind", "pusher doscene:" + b.this.euR + " readByte:" + locala.eyw + " stat:" + localg.field_status);
          if (locala.eyw < 2000)
          {
            GMTrace.o(5844242530304L, 43543);
            return true;
          }
        }
        if (b.this.a(b.this.gtW, b.this.fUd) == -1)
        {
          b.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          b.this.fUd.a(3, -1, "doScene failed", b.this);
        }
        GMTrace.o(5844242530304L, 43543);
        return false;
      }
    }, true);
    if (paramString != null) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      w.d("MicroMsg.NetSceneUploadVoiceRemind", "NetSceneUploadVoice:  file:" + paramString);
      this.euR = paramString;
      GMTrace.o(5836457902080L, 43485);
      return;
      bool = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5836592119808L, 43486);
    this.fUd = parame1;
    this.hdn = false;
    if (this.euR == null)
    {
      w.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(5836592119808L, 43486);
      return -1;
    }
    g localg = h.Jx(this.euR);
    if ((localg == null) || (!localg.NO()))
    {
      w.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(5836592119808L, 43486);
      return -1;
    }
    w.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene file:" + this.euR + " netTimes:" + localg.field_nettimes);
    parame1 = this.euR;
    boolean bool;
    if (parame1 == null) {
      bool = false;
    }
    while (!bool)
    {
      w.e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:" + this.euR);
      h.mp(this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(5836592119808L, 43486);
      return -1;
      parame1 = h.Jx(parame1);
      if (parame1 == null)
      {
        bool = false;
      }
      else if (parame1.field_nettimes >= 80)
      {
        bool = false;
      }
      else
      {
        parame1.field_nettimes += 1;
        parame1.eQl = 16384;
        bool = h.a(parame1);
      }
    }
    parame1 = new c.a();
    int i;
    int j;
    if (localg.field_status == 8)
    {
      w.v("MicroMsg.NetSceneUploadVoiceRemind", this.euR + " cancelFlag = 1");
      this.endFlag = 1;
      h.mP(localg.field_filename);
      i = 1;
      j = localg.field_voicelenght;
      if (j != 0) {
        break label1634;
      }
      j = (this.hcV - 6) / 32 * 20;
    }
    label1634:
    for (;;)
    {
      w.d("MicroMsg.NetSceneUploadVoiceRemind", "info.getMsgSvrId() " + localg.field_msgid);
      Object localObject = new b.a();
      ((b.a)localObject).gtF = new bmn();
      ((b.a)localObject).gtG = new bmo();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
      ((b.a)localObject).gtE = 329;
      ((b.a)localObject).gtH = 157;
      ((b.a)localObject).gtI = 1000000157;
      this.fUa = ((b.a)localObject).DA();
      localObject = (bmn)this.fUa.gtC.gtK;
      ((bmn)localObject).lSY = com.tencent.mm.y.q.zE();
      ((bmn)localObject).lSX = localg.field_user;
      ((bmn)localObject).tWu = localg.field_offset;
      ((bmn)localObject).tQN = localg.field_clientid;
      ((bmn)localObject).ugn = j;
      ((bmn)localObject).tTL = this.endFlag;
      ((bmn)localObject).tQd = localg.field_msgid;
      ((bmn)localObject).ugo = i;
      ((bmn)localObject).uWx = ((int)(localg.field_createtime / 1000L));
      ((bmn)localObject).uCG = 1;
      if (i != 1) {
        ((bmn)localObject).ues = new azp().z(parame1.buf, parame1.eyw);
      }
      for (((bmn)localObject).ugl = parame1.eyw;; ((bmn)localObject).ugl = 1)
      {
        w.v("MicroMsg.NetSceneUploadVoiceRemind", "cancelFlag:" + i + " endFlag:" + this.endFlag + " svrId:" + localg.field_msgid);
        w.v("MicroMsg.NetSceneUploadVoiceRemind", "doscene msgId:" + ((bmn)localObject).tQd + " user:" + ((bmn)localObject).lSX + " offset:" + ((bmn)localObject).tWu + " dataLen:" + ((bmn)localObject).ues.uNN + " endFlag:" + ((bmn)localObject).tTL);
        w.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene MsgId:" + localg.field_msgid + " file:" + this.euR + " readBytes:" + parame1.eyw + " neTTTOff:" + localg.field_offset + " neWWWOff:" + this.hcV + " endFlag:" + this.endFlag + " cancelFlag:" + i + " status:" + localg.field_status);
        w.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log " + localObject.toString());
        this.hds = System.currentTimeMillis();
        i = a(parame, this.fUa, this);
        GMTrace.o(5836592119808L, 43486);
        return i;
        if (localg.field_status == 3) {
          this.hdn = true;
        }
        parame1 = h.Jy(this.euR);
        if (parame1 == null)
        {
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(5836592119808L, 43486);
          return -1;
        }
        parame1 = parame1.vP(localg.field_offset);
        w.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene READ file[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localg.field_offset + " line:" + com.tencent.mm.compatible.util.g.tA());
        if (parame1.ret < 0)
        {
          w.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.euR + "] read ret:" + parame1.ret + " readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localg.field_offset);
          h.mp(this.euR);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(5836592119808L, 43486);
          return -1;
        }
        this.hcV = parame1.hcV;
        if ((this.hcV < localg.field_offset) || (this.hcV >= 469000))
        {
          w.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.euR + "] newOff:" + this.hcV + " OldtOff:" + localg.field_offset);
          h.mp(this.euR);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(5836592119808L, 43486);
          return -1;
        }
        this.endFlag = 0;
        if ((parame1.eyw == 0) && (!this.hdn))
        {
          w.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + this.euR + " No Data temperature , will be retry");
          h.mp(this.euR);
          this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
          GMTrace.o(5836592119808L, 43486);
          return -1;
        }
        if (this.hdn)
        {
          if (localg.field_totallen <= 0)
          {
            w.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.euR + "] read totalLen:" + localg.field_totallen);
            h.mp(this.euR);
            this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
            GMTrace.o(5836592119808L, 43486);
            return -1;
          }
          if ((localg.field_totallen > this.hcV) && (parame1.eyw < 6000))
          {
            w.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.euR + "] readlen:" + parame1.eyw + " newOff:" + parame1.hcV + " netOff:" + localg.field_offset + " totalLen:" + localg.field_totallen);
            h.mp(this.euR);
            this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
            GMTrace.o(5836592119808L, 43486);
            return -1;
          }
          if (localg.field_totallen <= this.hcV) {
            this.endFlag = 1;
          }
        }
        i = 0;
        break;
        ((bmn)localObject).ues = new azp().b(com.tencent.mm.bm.b.aX(new byte[1]));
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(5836726337536L, 43487);
    paramq = (bmn)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    w.v("MicroMsg.NetSceneUploadVoiceRemind", "check : offset:" + paramq.tWu + " dataLen:" + paramq.ues.uNN + " endFlag:" + paramq.tTL);
    int i = k.b.gum;
    GMTrace.o(5836726337536L, 43487);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5837128990720L, 43490);
    w.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.euR + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bmn)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (bmo)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log resp " + paramq.toString());
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      paramq = h.Jx(this.euR);
      if (paramq != null)
      {
        if (paramq.field_status == 3)
        {
          at.AR();
          paramArrayOfByte = com.tencent.mm.y.c.yM().cM(paramq.field_msglocalid);
          paramArrayOfByte.setContent(f.b(paramq.field_human, paramq.field_voicelenght, false));
          paramArrayOfByte.dB(2);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramq.field_msglocalid, paramArrayOfByte);
        }
        paramq.field_status = 97;
        paramq.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        paramq.eQl = 320;
        h.a(paramq);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5837128990720L, 43490);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      h.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5837128990720L, 43490);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.euR + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5837128990720L, 43490);
      return;
    }
    w.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd msgId:" + paramq.tQd + " toUser:" + paramArrayOfByte.lSX);
    paramArrayOfByte = this.euR;
    int j = this.hcV;
    long l = paramq.tQd;
    Object localObject = paramq.tQN;
    int k = this.endFlag;
    if (paramArrayOfByte == null) {
      paramInt1 = -1;
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.euR + " MsgSvrId:" + paramq.tQd + " clientId:" + paramq.tQN + " neWWOff:" + this.hcV + " neTTTT:" + paramq.ugl);
      if (paramInt1 >= 0) {
        break;
      }
      h.mp(this.euR);
      w.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.euR + "UpdateAfterSend Ret:" + paramInt1);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5837128990720L, 43490);
      return;
      w.d("MicroMsg.VoiceRemindLogic", "UpdateAfterSend file:[" + paramArrayOfByte + "] newOff:" + j + " SvrID:" + l + " clientID:" + (String)localObject + " hasSendEndFlag " + k);
      g localg = h.Jx(paramArrayOfByte);
      if (localg == null)
      {
        paramInt1 = -1;
      }
      else
      {
        localg.field_offset = j;
        localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        localg.eQl = 264;
        if ((bg.nm(localg.field_clientid)) && (localObject != null))
        {
          localg.field_clientid = ((String)localObject);
          localg.eQl |= 0x200;
        }
        if ((localg.field_msgid == 0L) && (l != 0L))
        {
          localg.field_msgid = l;
          localg.eQl |= 0x4;
        }
        int i = 0;
        w.d("MicroMsg.VoiceRemindLogic", "info.getTotalLen() " + localg.field_totallen + "  newOffset " + j + "  " + localg.field_status);
        paramInt1 = i;
        if (localg.field_totallen <= j)
        {
          paramInt1 = i;
          if (localg.field_status == 3)
          {
            paramInt1 = i;
            if (k == 1)
            {
              localg.field_status = 99;
              localg.eQl |= 0x40;
              at.AR();
              localObject = com.tencent.mm.y.c.yM().cM(localg.field_msglocalid);
              ((au)localObject).db(localg.field_user);
              ((au)localObject).D(localg.field_msgid);
              ((au)localObject).dB(2);
              ((au)localObject).setContent(f.b(localg.field_human, localg.field_voicelenght, false));
              at.AR();
              com.tencent.mm.y.c.yM().a(localg.field_msglocalid, (au)localObject);
              w.d("MicroMsg.VoiceRemindLogic", "END!!! updateSend  file:" + paramArrayOfByte + " total:" + localg.field_totallen + " status:" + localg.field_status + " netTimes:" + localg.field_nettimes);
              paramInt1 = 1;
              h.mL(paramArrayOfByte);
            }
          }
        }
        if (!h.a(localg)) {
          paramInt1 = -4;
        }
      }
    }
    if (paramInt1 == 1)
    {
      w.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd finish file:" + this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5837128990720L, 43490);
      return;
    }
    if (this.hdn) {}
    for (l = 0L;; l = 500L)
    {
      w.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.euR + " delay:" + l);
      this.gsj.z(l, l);
      GMTrace.o(5837128990720L, 43490);
      return;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5836994772992L, 43489);
    h.mp(this.euR);
    GMTrace.o(5836994772992L, 43489);
  }
  
  public final int getType()
  {
    GMTrace.i(5837263208448L, 43491);
    GMTrace.o(5837263208448L, 43491);
    return 329;
  }
  
  protected final int vB()
  {
    GMTrace.i(5836860555264L, 43488);
    GMTrace.o(5836860555264L, 43488);
    return 240;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */