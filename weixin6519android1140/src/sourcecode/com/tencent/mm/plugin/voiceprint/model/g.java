package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.bm.b;
import com.tencent.mm.modelsimple.m;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.aez;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.ax.a;
import com.tencent.mm.y.ax.b;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  private final q guL;
  String qBK;
  int qBL;
  private String qBM;
  
  public g(String paramString)
  {
    GMTrace.i(12496475783168L, 93106);
    this.qBK = "";
    this.qBL = 0;
    this.qBM = "";
    this.guL = new a();
    ax.a locala = (ax.a)this.guL.DC();
    w.i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(73), paramString });
    locala.gny.uuM = 73;
    locala.gny.uuN = paramString;
    GMTrace.o(12496475783168L, 93106);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12496610000896L, 93107);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(12496610000896L, 93107);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12497012654080L, 93110);
    int i = k.b.gum;
    GMTrace.o(12497012654080L, 93110);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12497281089536L, 93112);
    w.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (ax.b)paramq.AZ();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12499831226368L, 93131);
          new m().a(g.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(12488959590400L, 93050);
              w.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                g.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", g.this);
                GMTrace.o(12488959590400L, 93050);
                return;
              }
              g.this.a(g.this.gtW, g.this.fUd);
              GMTrace.o(12488959590400L, 93050);
            }
          });
          GMTrace.o(12499831226368L, 93131);
        }
      });
      GMTrace.o(12497281089536L, 93112);
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12497281089536L, 93112);
      return;
    }
    if (paramArrayOfByte.gnz.uuO != null)
    {
      this.qBK = new String(paramArrayOfByte.gnz.uuO.uNu.uNP.tJp);
      this.qBL = paramArrayOfByte.gnz.uuO.uMG;
      w.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "resid %d mVertifyKey %s mtext %s", new Object[] { Integer.valueOf(this.qBL), this.qBM, this.qBK });
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12497281089536L, 93112);
      return;
      w.e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(12497146871808L, 93111);
    GMTrace.o(12497146871808L, 93111);
  }
  
  public final int getType()
  {
    GMTrace.i(12496744218624L, 93108);
    GMTrace.o(12496744218624L, 93108);
    return 616;
  }
  
  protected final int vB()
  {
    GMTrace.i(12496878436352L, 93109);
    GMTrace.o(12496878436352L, 93109);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */