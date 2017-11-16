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
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bnt;
import com.tencent.mm.protocal.c.bnu;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.LinkedList;
import java.util.Set;

public final class c
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
  private int heT;
  private String[] heU;
  public int retCode;
  
  public c(String paramString, int paramInt)
  {
    GMTrace.i(4392006713344L, 32723);
    this.retCode = 0;
    this.gVS = 0;
    this.filename = null;
    this.heR = -1L;
    this.heS = false;
    this.hdn = false;
    this.heU = new String[0];
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4389188141056L, 32702);
        long l = com.tencent.mm.a.e.aY(c.this.filename);
        w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " onTimerExpired: file:" + c.this.filename + " nowlen:" + l + " oldoff:" + c.this.gVS + " isFin:" + c.this.hdn);
        if ((l - c.this.gVS < 3300L) && (!c.this.hdn))
        {
          GMTrace.o(4389188141056L, 32702);
          return true;
        }
        if (c.this.a(c.this.gtW, c.this.fUd) == -1)
        {
          c.this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
          c.this.fUd.a(3, -1, "doScene failed", c.this);
        }
        GMTrace.o(4389188141056L, 32702);
        return false;
      }
    }, true);
    this.heR = bg.Pv();
    this.filename = paramString;
    this.heT = paramInt;
    GMTrace.o(4392006713344L, 32723);
  }
  
  public final void NS()
  {
    GMTrace.i(4391469842432L, 32719);
    this.hdn = true;
    GMTrace.o(4391469842432L, 32719);
  }
  
  public final String[] NT()
  {
    GMTrace.i(4391604060160L, 32720);
    String[] arrayOfString = this.heU;
    GMTrace.o(4391604060160L, 32720);
    return arrayOfString;
  }
  
  public final long NU()
  {
    GMTrace.i(4391738277888L, 32721);
    long l = this.heR;
    GMTrace.o(4391738277888L, 32721);
    return l;
  }
  
  public final Set<String> NV()
  {
    GMTrace.i(4391872495616L, 32722);
    GMTrace.o(4391872495616L, 32722);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4392140931072L, 32724);
    this.fUd = parame1;
    int k = com.tencent.mm.a.e.aY(this.filename);
    w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.gVS + " isFin:" + this.hdn);
    if (k <= 0)
    {
      w.e("MicroMsg.NetSceneVoiceAddr", "read failed :" + this.filename);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
      GMTrace.o(4392140931072L, 32724);
      return -1;
    }
    int j = k - this.gVS;
    if (j > 3960) {
      i = 3960;
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.gVS + " isFin:" + this.hdn + " endFlag:" + this.heS);
      parame1 = com.tencent.mm.a.e.c(this.filename, this.gVS, i);
      if (parame1 != null) {
        break;
      }
      w.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " read failed :" + this.filename + " read:" + i);
      this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
      GMTrace.o(4392140931072L, 32724);
      return -1;
      if ((j < 3300) && (!this.hdn))
      {
        w.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " read failed :" + this.filename + "can read:" + j + " isfinish:" + this.hdn);
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
        GMTrace.o(4392140931072L, 32724);
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
    ((b.a)localObject).gtF = new bnt();
    ((b.a)localObject).gtG = new bnu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voiceaddr";
    ((b.a)localObject).gtE = 206;
    ((b.a)localObject).gtH = 94;
    ((b.a)localObject).gtI = 1000000094;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bnt)this.fUa.gtC.gtK;
    ((bnt)localObject).ues = new azp().be(parame1);
    w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " readlen:" + parame1.length + " datalen:" + ((bnt)localObject).ues.uNP.toByteArray().length + " dataiLen:" + ((bnt)localObject).ues.uNN + " md5:" + com.tencent.mm.a.g.n(parame1) + " datamd5:" + com.tencent.mm.a.g.n(((bnt)localObject).ues.uNP.toByteArray()));
    ((bnt)localObject).jhi = ((String)h.xy().xh().get(2, ""));
    ((bnt)localObject).tWu = this.gVS;
    ((bnt)localObject).uVD = this.heR;
    if (this.heS) {}
    for (int i = 1;; i = 0)
    {
      ((bnt)localObject).tTL = i;
      ((bnt)localObject).uVE = 0;
      ((bnt)localObject).tRI = 0;
      ((bnt)localObject).uVF = 0;
      ((bnt)localObject).tRF = 0;
      ((bnt)localObject).uXB = this.heT;
      w.d("MicroMsg.NetSceneVoiceAddr", "clientId " + this.heR);
      i = a(parame, this.fUa, this);
      GMTrace.o(4392140931072L, 32724);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4392275148800L, 32725);
    int i = k.b.gum;
    GMTrace.o(4392275148800L, 32725);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4392677801984L, 32728);
    w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bnt)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (bnu)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4392677801984L, 32728);
      return;
    }
    w.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd  file:" + this.filename + " endflag:" + paramq.tTL + " lst:" + paramq.tTO);
    if (paramArrayOfByte.tTL == 1)
    {
      this.heU = new String[paramq.tTO.size()];
      paramInt1 = 0;
      while (paramInt1 < paramq.tTO.size())
      {
        this.heU[paramInt1] = ((azq)paramq.tTO.get(paramInt1)).uNR;
        paramInt1 += 1;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4392677801984L, 32728);
      return;
    }
    paramInt1 = paramArrayOfByte.tWu;
    this.gVS = (paramArrayOfByte.ues.uNN + paramInt1);
    if (this.hdn) {}
    for (long l = 0L;; l = 500L)
    {
      w.d("MicroMsg.NetSceneVoiceAddr", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.gsj.z(l, l);
      GMTrace.o(4392677801984L, 32728);
      return;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(4392543584256L, 32727);
    this.fUd.a(3, com.tencent.mm.compatible.util.g.tA() + 40000, "ecurityCheckError", this);
    GMTrace.o(4392543584256L, 32727);
  }
  
  public final int getType()
  {
    GMTrace.i(4392812019712L, 32729);
    GMTrace.o(4392812019712L, 32729);
    return 206;
  }
  
  protected final int vB()
  {
    GMTrace.i(4392409366528L, 32726);
    GMTrace.o(4392409366528L, 32726);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */