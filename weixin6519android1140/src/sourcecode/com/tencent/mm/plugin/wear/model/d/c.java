package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.blt;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.UUID;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String clientId;
  public String eDs;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public String filename;
  aj gsj;
  public boolean hdn;
  private boolean heS;
  private int heW;
  public int otj;
  public int rAq;
  public String rAr;
  public boolean rAs;
  
  public c(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9180761030656L, 68402);
    this.filename = null;
    this.heW = 0;
    this.hdn = false;
    this.rAq = 0;
    this.heS = false;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9181968990208L, 68411);
        long l1 = com.tencent.mm.a.e.aY(c.this.filename);
        long l2 = l1 - c.this.rAq;
        w.d("MicroMsg.Wear.NetSceneVoiceToText", "onTimerExpired: filename=%s | fileLength=%d | readOffset=%d | isRecordFinished=%b | canReadLength=%d", new Object[] { c.this.filename, Long.valueOf(l1), Integer.valueOf(c.this.rAq), Boolean.valueOf(c.this.hdn), Long.valueOf(l2) });
        if ((l2 < 3300L) && (!c.this.hdn))
        {
          GMTrace.o(9181968990208L, 68411);
          return true;
        }
        if ((c.this.hdn) && (l2 <= 0L))
        {
          GMTrace.o(9181968990208L, 68411);
          return false;
        }
        if (c.this.a(c.this.gtW, c.this.fUd) == -1) {
          c.this.fUd.a(3, -1, "doScene failed", c.this);
        }
        GMTrace.o(9181968990208L, 68411);
        return false;
      }
    }, true);
    this.otj = paramInt;
    this.eDs = paramString2;
    this.filename = paramString1;
    this.heW = 0;
    this.clientId = UUID.randomUUID().toString();
    GMTrace.o(9180761030656L, 68402);
  }
  
  private static String d(azp paramazp)
  {
    GMTrace.i(9181566337024L, 68408);
    if ((paramazp != null) && (paramazp.uNP != null))
    {
      paramazp = paramazp.uNP.bNS();
      GMTrace.o(9181566337024L, 68408);
      return paramazp;
    }
    GMTrace.o(9181566337024L, 68408);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9180895248384L, 68403);
    this.fUd = parame1;
    int k = com.tencent.mm.a.e.aY(this.filename);
    if (k <= 0)
    {
      w.e("MicroMsg.Wear.NetSceneVoiceToText", "doScene file length is zero: %s", new Object[] { this.filename });
      GMTrace.o(9180895248384L, 68403);
      return -1;
    }
    int j = k - this.rAq;
    int i;
    if (j > 3960) {
      i = 3960;
    }
    for (;;)
    {
      w.i("MicroMsg.Wear.NetSceneVoiceToText", "fileLength: %d | readOffset: %d | isRecordFinish=%b | endFlag=%b | filename=%s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.rAq), Boolean.valueOf(this.hdn), Boolean.valueOf(this.heS), this.filename });
      parame1 = com.tencent.mm.a.e.c(this.filename, this.rAq, i);
      if (parame1 != null) {
        break label289;
      }
      if (!this.heS) {
        break;
      }
      GMTrace.o(9180895248384L, 68403);
      return 0;
      if ((j < 3300) && (!this.hdn))
      {
        w.e("MicroMsg.Wear.NetSceneVoiceToText", "try to send a buf less than MIN_SEND_BYTE_PER_PACK: canReadLen=%d | isRecordFinished=%b", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.hdn) });
        GMTrace.o(9180895248384L, 68403);
        return -1;
      }
      i = j;
      if (this.hdn)
      {
        this.heS = true;
        i = j;
      }
    }
    w.e("MicroMsg.Wear.NetSceneVoiceToText", "Can not read file: canReadLen=%d | isRecordFinish=%b | endFlag=%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.hdn), Boolean.valueOf(this.heS) });
    GMTrace.o(9180895248384L, 68403);
    return -1;
    label289:
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bls();
    ((b.a)localObject).gtG = new blt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).gtE = 349;
    ((b.a)localObject).gtH = 158;
    ((b.a)localObject).gtI = 1000000158;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bls)this.fUa.gtC.gtK;
    at.AR();
    ((bls)localObject).jhi = ((String)com.tencent.mm.y.c.xh().get(2, ""));
    ((bls)localObject).ues = new azp().be(parame1);
    ((bls)localObject).tWu = this.rAq;
    ((bls)localObject).uVD = this.clientId;
    if (this.heS)
    {
      i = 1;
      ((bls)localObject).tTL = i;
      ((bls)localObject).uVE = 0;
      ((bls)localObject).tRI = 0;
      ((bls)localObject).uVF = this.heW;
      ((bls)localObject).tRF = 0;
      i = a(parame, this.fUa, this);
      j = ((bls)localObject).tWu;
      this.rAq = (((bls)localObject).ues.uNN + j);
      if (!this.hdn) {
        break label579;
      }
    }
    label579:
    for (long l = 0L;; l = 500L)
    {
      w.i("MicroMsg.Wear.NetSceneVoiceToText", "doScene filename=%s | delay=%d | ret=%d", new Object[] { this.filename, Long.valueOf(l), Integer.valueOf(i) });
      this.gsj.z(l, l);
      GMTrace.o(9180895248384L, 68403);
      return i;
      i = 0;
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(9181029466112L, 68404);
    int i = k.b.gum;
    GMTrace.o(9181029466112L, 68404);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9181432119296L, 68407);
    w.i("MicroMsg.Wear.NetSceneVoiceToText", "onGYNetEnd errorType=%d | errorCode=%d |filename=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.filename });
    paramq = (blt)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9181432119296L, 68407);
      return;
    }
    w.i("MicroMsg.Wear.NetSceneVoiceToText", "resp EndFlag=%d | Text=%s", new Object[] { Integer.valueOf(paramq.tTL), d(paramq.uVG) });
    if (paramq.tTL == 1)
    {
      this.rAs = true;
      paramq = d(paramq.uVG);
      if (paramq != null) {
        this.rAr = paramq;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9181432119296L, 68407);
      return;
    }
    GMTrace.o(9181432119296L, 68407);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(9181297901568L, 68406);
    this.fUd.a(3, 0, "securityCheckError", this);
    GMTrace.o(9181297901568L, 68406);
  }
  
  public final int getType()
  {
    GMTrace.i(9181700554752L, 68409);
    GMTrace.o(9181700554752L, 68409);
    return 349;
  }
  
  protected final int vB()
  {
    GMTrace.i(9181163683840L, 68405);
    GMTrace.o(9181163683840L, 68405);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */