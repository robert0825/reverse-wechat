package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.qh;
import com.tencent.mm.protocal.c.qi;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.am;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static am hdl;
  private static List<c> hdm;
  private String eQu;
  public String euR;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private aj gsj;
  private String hdk;
  private boolean hdn;
  private boolean hdo;
  public int retCode;
  
  static
  {
    GMTrace.i(564385546240L, 4205);
    hdl = null;
    hdm = new ArrayList();
    GMTrace.o(564385546240L, 4205);
  }
  
  public e(p paramp)
  {
    GMTrace.i(563043368960L, 4195);
    this.retCode = 0;
    this.hdn = false;
    this.hdo = false;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(551097991168L, 4106);
        if (e.this.a(e.a(e.this), e.this.fUd) == -1) {
          e.this.fUd.a(3, -1, "doScene failed", e.this);
        }
        GMTrace.o(551097991168L, 4106);
        return false;
      }
    }, false);
    if (paramp != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.euR = paramp.euR;
      if (this.euR == null) {
        break label142;
      }
    }
    label142:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.hdk = paramp.hdk;
      this.eQu = paramp.eQu;
      w.i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice:  file[%s] voiceFormat[%s] user[%s]", new Object[] { this.euR, this.hdk, this.eQu });
      GMTrace.o(563043368960L, 4195);
      return;
      bool = false;
      break;
    }
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(562640715776L, 4192);
    if (!hdm.contains(paramc)) {
      hdm.add(paramc);
    }
    GMTrace.o(562640715776L, 4192);
  }
  
  public static void a(am paramam)
  {
    GMTrace.i(562506498048L, 4191);
    if (hdl == null) {
      hdl = paramam;
    }
    GMTrace.o(562506498048L, 4191);
  }
  
  public static void b(c paramc)
  {
    GMTrace.i(562774933504L, 4193);
    hdm.remove(paramc);
    GMTrace.o(562774933504L, 4193);
  }
  
  private void doNotify()
  {
    GMTrace.i(562909151232L, 4194);
    final au localau = q.mR(this.euR);
    if (localau != null)
    {
      if (hdl != null) {
        hdl.a(localau);
      }
      Iterator localIterator = hdm.iterator();
      while (localIterator.hasNext()) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(542642274304L, 4043);
            this.hdp.z(localau);
            GMTrace.o(542642274304L, 4043);
          }
        });
      }
    }
    GMTrace.o(562909151232L, 4194);
  }
  
  public final boolean DF()
  {
    GMTrace.i(563714457600L, 4200);
    boolean bool = super.DF();
    if (bool) {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 232L, 1L, false);
    }
    GMTrace.o(563714457600L, 4200);
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(563177586688L, 4196);
    this.fUd = parame1;
    if (this.euR == null)
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(563177586688L, 4196);
      return -1;
    }
    parame1 = q.mS(this.euR);
    if ((parame1 == null) || (!parame1.NN()))
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:" + this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(563177586688L, 4196);
      return -1;
    }
    w.i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.euR + " netTimes:" + parame1.hcx);
    if (!q.mJ(this.euR))
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:" + this.euR);
      q.mp(this.euR);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(563177586688L, 4196);
      return -1;
    }
    int i = parame1.hbc - parame1.hcp;
    if (i <= 0)
    {
      if (parame1.status == 5)
      {
        this.hdo = true;
        w.e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.euR + " Net:" + parame1.hbc + " Local:" + parame1.hcp);
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
        GMTrace.o(563177586688L, 4196);
        return -1;
      }
      q.a(this.euR, parame1.hcp, null);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 10000);
      GMTrace.o(563177586688L, 4196);
      return -1;
    }
    if (parame1.gsL == parame1.hbc) {
      this.hdn = true;
    }
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new qh();
    ((b.a)localObject).gtG = new qi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/downloadvoice";
    ((b.a)localObject).gtE = 128;
    ((b.a)localObject).gtH = 20;
    ((b.a)localObject).gtI = 1000000020;
    this.fUa = ((b.a)localObject).DA();
    localObject = (qh)this.fUa.gtC.gtK;
    ((qh)localObject).tQN = parame1.clientId;
    ((qh)localObject).tQd = parame1.eSf;
    ((qh)localObject).ugl = i;
    ((qh)localObject).tWu = parame1.hcp;
    if (s.eb(this.eQu))
    {
      ((qh)localObject).ufz = this.eQu;
      ((qh)localObject).ugm = parame1.het;
    }
    w.i("MicroMsg.NetSceneDownloadVoice", "doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", new Object[] { ((qh)localObject).tQN, Integer.valueOf(((qh)localObject).tPV), Long.valueOf(((qh)localObject).tQd), Integer.valueOf(((qh)localObject).ugl), Integer.valueOf(((qh)localObject).tWu), ((qh)localObject).ufz, Long.valueOf(((qh)localObject).ugm) });
    i = a(parame, this.fUa, this);
    GMTrace.o(563177586688L, 4196);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(563311804416L, 4197);
    paramq = (qh)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    if ((paramq.tQd == 0L) || (paramq.tQN == null) || (paramq.tQN.length() == 0) || (paramq.ugl <= 0) || (paramq.tWu < 0))
    {
      q.mp(this.euR);
      i = k.b.gun;
      GMTrace.o(563311804416L, 4197);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(563311804416L, 4197);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(563848675328L, 4201);
    w.i("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.euR + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (qi)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramArrayOfByte.ugo == 1)
    {
      w.v("MicroMsg.NetSceneDownloadVoice", this.euR + " cancelFlag = 1");
      q.mO(this.euR);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    if (paramInt3 == -22)
    {
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 231L, 1L, false);
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 230L, 1L, false);
      w.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " resp:" + paramq.AZ().tKs);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    w.d("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.euR + " Recv:" + paramArrayOfByte.ues.uNN + " fileOff:" + paramArrayOfByte.tWu);
    if (paramArrayOfByte.ues.uNP == null)
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    paramq = paramArrayOfByte.ues.uNP.toByteArray();
    if (paramq.length == 0)
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    paramInt1 = q.ap(this.hdk, this.euR).write(paramq, paramq.length, paramArrayOfByte.tWu);
    if (paramInt1 < 0)
    {
      w.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + this.euR + " ret:" + paramInt1);
      q.mp(this.euR);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    w.i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + this.euR + " filesize:" + paramInt1 + " voiceFormat:" + this.hdk);
    paramInt1 = q.a(this.euR, paramInt1, null);
    if (paramInt1 < 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 229L, 1L, false);
      w.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.euR + "updateAfterRecv Ret:" + paramInt1);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    if (paramInt1 == 1)
    {
      doNotify();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(563848675328L, 4201);
      return;
    }
    long l = 1000L;
    if (this.hdn) {
      l = 0L;
    }
    this.gsj.z(l, l);
    GMTrace.o(563848675328L, 4201);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(563580239872L, 4199);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 233L, 1L, false);
    q.mp(this.euR);
    GMTrace.o(563580239872L, 4199);
  }
  
  public final int getType()
  {
    GMTrace.i(563982893056L, 4202);
    GMTrace.o(563982893056L, 4202);
    return 128;
  }
  
  protected final int vB()
  {
    GMTrace.i(563446022144L, 4198);
    GMTrace.o(563446022144L, 4198);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */