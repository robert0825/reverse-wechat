package com.tencent.mm.bd;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.blt;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.Set;

public final class d
  extends a
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public String filename;
  public int gVS;
  aj gsj;
  public boolean hdn;
  private long heR;
  private boolean heS;
  private String[] heU;
  private int heW;
  public int retCode;
  
  public d(String paramString, int paramInt)
  {
    GMTrace.i(4384893173760L, 32670);
    this.retCode = 0;
    this.hdn = false;
    this.gVS = 0;
    this.filename = null;
    this.heR = -1L;
    this.heS = false;
    this.heW = 0;
    this.heU = new String[0];
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4400596647936L, 32787);
        long l = com.tencent.mm.a.e.aY(d.this.filename);
        w.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " onTimerExpired: file:" + d.this.filename + " nowlen:" + l + " oldoff:" + d.this.gVS + " isFin:" + d.this.hdn);
        if ((l - d.this.gVS < 3300L) && (!d.this.hdn))
        {
          GMTrace.o(4400596647936L, 32787);
          return true;
        }
        if (d.this.a(d.this.gtW, d.this.fUd) == -1)
        {
          d.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
          d.this.fUd.a(3, -1, "doScene failed", d.this);
        }
        GMTrace.o(4400596647936L, 32787);
        return false;
      }
    }, true);
    this.heR = bg.Pv().hashCode();
    this.filename = paramString;
    this.heW = paramInt;
    GMTrace.o(4384893173760L, 32670);
  }
  
  public final void NS()
  {
    GMTrace.i(4384356302848L, 32666);
    this.hdn = true;
    GMTrace.o(4384356302848L, 32666);
  }
  
  public final String[] NT()
  {
    GMTrace.i(4384490520576L, 32667);
    String[] arrayOfString = this.heU;
    GMTrace.o(4384490520576L, 32667);
    return arrayOfString;
  }
  
  public final long NU()
  {
    GMTrace.i(4384624738304L, 32668);
    long l = this.heR;
    GMTrace.o(4384624738304L, 32668);
    return l;
  }
  
  public final Set<String> NV()
  {
    GMTrace.i(4384758956032L, 32669);
    GMTrace.o(4384758956032L, 32669);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4385027391488L, 32671);
    this.fUd = parame1;
    int k = com.tencent.mm.a.e.aY(this.filename);
    w.d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %d, isFin: %b", new Object[] { this.filename, Integer.valueOf(k), Integer.valueOf(this.gVS), Boolean.valueOf(this.hdn) });
    if (k <= 0)
    {
      w.e("MicroMsg.NetSceneVoiceInput", "read failed :" + this.filename);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
      GMTrace.o(4385027391488L, 32671);
      return -1;
    }
    int j = k - this.gVS;
    if (j > 3960) {
      i = 3960;
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %b, isFin:%b, endFlag: %b", new Object[] { this.filename, Integer.valueOf(k), Boolean.valueOf(this.hdn), Boolean.valueOf(this.hdn), Boolean.valueOf(this.heS) });
      parame1 = com.tencent.mm.a.e.c(this.filename, this.gVS, i);
      if (parame1 != null) {
        break;
      }
      w.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " read failed :" + this.filename + " read:" + i);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
      GMTrace.o(4385027391488L, 32671);
      return -1;
      if ((j < 3300) && (!this.hdn))
      {
        w.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " read failed :" + this.filename + "can read:" + j + " isfinish:" + this.hdn);
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
        GMTrace.o(4385027391488L, 32671);
        return -1;
      }
      i = j;
      if (this.hdn)
      {
        this.heS = true;
        i = j;
      }
    }
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bls();
    ((b.a)localObject).gtG = new blt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).gtE = 349;
    ((b.a)localObject).gtH = 158;
    ((b.a)localObject).gtI = 1000000158;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bls)this.fUa.gtC.gtK;
    ((bls)localObject).jhi = ((String)h.xy().xh().get(2, ""));
    ((bls)localObject).ues = new azp().be(parame1);
    w.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " readlen:" + parame1.length + " datalen:" + ((bls)localObject).ues.uNP.toByteArray().length + " dataiLen:" + ((bls)localObject).ues.uNN + " md5:" + com.tencent.mm.a.g.n(parame1) + " datamd5:" + com.tencent.mm.a.g.n(((bls)localObject).ues.uNP.toByteArray()));
    ((bls)localObject).tWu = this.gVS;
    ((bls)localObject).uVD = this.heR;
    if (this.heS) {}
    for (int i = 1;; i = 0)
    {
      ((bls)localObject).tTL = i;
      ((bls)localObject).uVE = 0;
      ((bls)localObject).tRI = 0;
      ((bls)localObject).uVF = this.heW;
      ((bls)localObject).tRF = 0;
      w.d("MicroMsg.NetSceneVoiceInput", "clientId " + this.heR);
      i = a(parame, this.fUa, this);
      GMTrace.o(4385027391488L, 32671);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4385161609216L, 32672);
    int i = k.b.gum;
    GMTrace.o(4385161609216L, 32672);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4385564262400L, 32675);
    w.d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bls)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (blt)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4385564262400L, 32675);
      return;
    }
    w.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd  file:" + this.filename + " endflag:" + paramq.tTL);
    if (paramArrayOfByte.tTL == 1)
    {
      if ((paramq.uVG != null) && (paramq.uVG.uNP != null)) {
        this.heU = new String[] { paramq.uVG.uNP.bNS() };
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4385564262400L, 32675);
      return;
    }
    paramInt1 = paramArrayOfByte.tWu;
    this.gVS = (paramArrayOfByte.ues.uNN + paramInt1);
    if (this.hdn) {}
    for (long l = 0L;; l = 500L)
    {
      w.d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.gsj.z(l, l);
      GMTrace.o(4385564262400L, 32675);
      return;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(4385430044672L, 32674);
    this.fUd.a(3, com.tencent.mm.compatible.util.g.tA() + 40000, "ecurityCheckError", this);
    GMTrace.o(4385430044672L, 32674);
  }
  
  public final int getType()
  {
    GMTrace.i(4385698480128L, 32676);
    GMTrace.o(4385698480128L, 32676);
    return 349;
  }
  
  protected final int vB()
  {
    GMTrace.i(4385295826944L, 32673);
    GMTrace.o(4385295826944L, 32673);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */