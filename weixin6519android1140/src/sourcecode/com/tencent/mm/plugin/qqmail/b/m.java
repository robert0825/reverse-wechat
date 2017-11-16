package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.nr;
import com.tencent.mm.protocal.c.ns;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Random;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String clientId;
  private String eMI;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private f gIl;
  private int gsL;
  private int gsM;
  private String nSM;
  private String nSN;
  private int nSO;
  
  public m(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt, f paramf)
  {
    GMTrace.i(5460379828224L, 40683);
    this.nSM = null;
    this.gsL = 0;
    this.clientId = null;
    this.gsM = 0;
    this.nSO = 0;
    this.nSM = paramString1;
    this.nSO = paramInt;
    this.gIl = paramf;
    if (!bg.nm(paramString1))
    {
      this.clientId = (g.n(paramString1.getBytes()) + "_" + System.nanoTime() + "_" + new Random().nextInt());
      this.gsL = paramString1.getBytes().length;
      this.gsM = 0;
    }
    if (!bg.nm(paramString2)) {
      this.eMI = paramString2;
    }
    if (paramArrayOfString != null)
    {
      this.nSN = "";
      int i = paramArrayOfString.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramString1 = paramArrayOfString[paramInt];
        this.nSN = (this.nSN + paramString1 + ",");
        paramInt += 1;
      }
      this.nSN = this.nSN.substring(0, this.nSN.length() - 1);
    }
    w.i("MicroMsg.NetSceneComposeSend", "NetSceneComposeSend, clientId: %s, totalLen: %d", new Object[] { this.clientId, Integer.valueOf(this.gsL) });
    GMTrace.o(5460379828224L, 40683);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5461185134592L, 40689);
    this.fUd = parame1;
    if (bg.nm(this.nSM))
    {
      w.e("MicroMsg.NetSceneComposeSend", "doScene, sendContent is null");
      GMTrace.o(5461185134592L, 40689);
      return -1;
    }
    int k = Math.min(this.gsL - this.gsM, 32768);
    w.i("MicroMsg.NetSceneComposeSend", "doScene, dataLen: %d", new Object[] { Integer.valueOf(k) });
    parame1 = new byte[k];
    Object localObject = this.nSM.getBytes();
    int i = this.gsM;
    int j = 0;
    while (i < this.gsM + k)
    {
      parame1[j] = localObject[i];
      j += 1;
      i += 1;
    }
    if (bg.bq(parame1))
    {
      w.e("MicroMsg.NetSceneComposeSend", "doScene, sendData is null");
      GMTrace.o(5461185134592L, 40689);
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).gtF = new nr();
    ((b.a)localObject).gtG = new ns();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/composesend";
    ((b.a)localObject).gtE = 485;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (nr)this.fUa.gtC.gtK;
    ((nr)localObject).tPP = this.clientId;
    ((nr)localObject).tRC = this.gsL;
    ((nr)localObject).tRD = this.gsM;
    ((nr)localObject).tRE = k;
    ((nr)localObject).uet = this.eMI;
    ((nr)localObject).ueu = this.nSN;
    ((nr)localObject).uev = ((int)(this.gsL + this.nSO * 1.3333334F));
    w.i("MicroMsg.NetSceneComposeSend", "doScene, realSize: %d", new Object[] { Integer.valueOf(((nr)localObject).uev) });
    ((nr)localObject).ues = n.H(parame1);
    i = a(parame, this.fUa, this);
    w.i("MicroMsg.NetSceneComposeSend", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(5461185134592L, 40689);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(5460648263680L, 40685);
    if (bg.nm(this.nSM))
    {
      w.e("MicroMsg.NetSceneComposeSend", "securityVerificationChecked failed, content is null");
      i = k.b.gun;
      GMTrace.o(5460648263680L, 40685);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(5460648263680L, 40685);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5460916699136L, 40687);
    w.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5460916699136L, 40687);
      return;
    }
    this.gsM = ((ns)((b)paramq).gtD.gtK).tRD;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gIl != null) {
      this.gIl.a(this.gsM, this.gsL, this);
    }
    if (this.gsM < this.gsL)
    {
      w.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.gsM), Integer.valueOf(this.gsL) });
      if (a(this.gtW, this.fUd) < 0)
      {
        w.e("MicroMsg.NetSceneComposeSend", "continue to upload fail");
        GMTrace.o(5460916699136L, 40687);
      }
    }
    else
    {
      w.i("MicroMsg.NetSceneComposeSend", "finished upload");
    }
    GMTrace.o(5460916699136L, 40687);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5460782481408L, 40686);
    GMTrace.o(5460782481408L, 40686);
  }
  
  public final int getType()
  {
    GMTrace.i(5461050916864L, 40688);
    GMTrace.o(5461050916864L, 40688);
    return 485;
  }
  
  protected final int vB()
  {
    GMTrace.i(5460514045952L, 40684);
    GMTrace.o(5460514045952L, 40684);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */