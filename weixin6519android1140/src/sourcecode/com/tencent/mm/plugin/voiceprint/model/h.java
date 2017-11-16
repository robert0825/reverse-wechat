package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnr;
import com.tencent.mm.protocal.c.bnw;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.az.a;
import com.tencent.mm.y.az.b;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  private String filename;
  private final q guL;
  public boolean qBP;
  private boolean qBQ;
  private Handler qBR;
  private int qBS;
  int qBV;
  String qBY;
  private int vq;
  
  public h(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(12500904968192L, 93139);
    this.vq = 0;
    this.qBP = false;
    this.qBQ = false;
    this.qBR = null;
    this.qBS = 0;
    this.qBV = 0;
    this.qBY = "";
    w.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "resid %d vertifyTicket %s", new Object[] { Integer.valueOf(paramInt), bg.aq(paramString2, "") });
    this.guL = new c();
    az.a locala = (az.a)this.guL.DC();
    this.filename = paramString1;
    this.vq = 0;
    locala.gnC.uMG = paramInt;
    locala.gnC.uuN = paramString2;
    this.qBS = 0;
    locala.gnC.uME = 0;
    w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.qBP = true;
    btb();
    GMTrace.o(12500904968192L, 93139);
  }
  
  private int btb()
  {
    GMTrace.i(12501441839104L, 93143);
    az.a locala = (az.a)this.guL.DC();
    bnw localbnw = new bnw();
    new g();
    locala.gnC.uXz = localbnw;
    Object localObject = new l(m.aA(this.filename, false));
    int i = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
    if (i - this.vq >= 6000) {}
    for (localObject = ((l)localObject).bd(this.vq, 6000);; localObject = ((l)localObject).bd(this.vq, i - this.vq))
    {
      w.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.vq), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).eyw), Integer.valueOf(i), Boolean.valueOf(this.qBP) });
      if (((g)localObject).eyw != 0) {
        break;
      }
      GMTrace.o(12501441839104L, 93143);
      return -2;
    }
    if (((g)localObject).ret < 0)
    {
      w.w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
      GMTrace.o(12501441839104L, 93143);
      return -1;
    }
    if (this.vq >= 469000)
    {
      w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.vq) });
      GMTrace.o(12501441839104L, 93143);
      return -1;
    }
    localbnw.uXI = new azp().be(((g)localObject).buf);
    localbnw.tRD = this.vq;
    localbnw.uXG = ((g)localObject).eyw;
    localbnw.uXH = 0;
    locala.gnC.uME = this.qBS;
    if (this.qBP)
    {
      int j = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
      if (((g)localObject).hcV >= j)
      {
        localbnw.uXH = 1;
        this.qBQ = true;
        w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
      }
    }
    this.vq = ((g)localObject).hcV;
    locala.gnC.uXz = localbnw;
    GMTrace.o(12501441839104L, 93143);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12501307621376L, 93142);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(12501307621376L, 93142);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12501039185920L, 93140);
    int i = k.b.gum;
    GMTrace.o(12501039185920L, 93140);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12501710274560L, 93145);
    w.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (az.b)paramq.AZ();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12499562790912L, 93129);
          new com.tencent.mm.modelsimple.m().a(h.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(12504126193664L, 93163);
              w.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                h.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", h.this);
                GMTrace.o(12504126193664L, 93163);
                return;
              }
              h.this.a(h.this.gtW, h.this.fUd);
              GMTrace.o(12504126193664L, 93163);
            }
          });
          GMTrace.o(12499562790912L, 93129);
        }
      });
      GMTrace.o(12501710274560L, 93145);
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12501710274560L, 93145);
      return;
    }
    this.qBS = paramArrayOfByte.gnD.uME;
    this.qBV = paramArrayOfByte.gnD.ucS;
    this.qBY = paramArrayOfByte.gnD.uXA;
    int i = paramArrayOfByte.gnD.uME;
    int j = this.qBV;
    boolean bool = bg.nm(this.qBY);
    if (bg.nm(this.qBY)) {}
    for (paramInt1 = 0;; paramInt1 = this.qBY.length())
    {
      w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
      if (!this.qBQ) {
        break;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12501710274560L, 93145);
      return;
    }
    w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(btb()) });
    a(this.gtW, this.fUd);
    w.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
    GMTrace.o(12501710274560L, 93145);
  }
  
  public final int getType()
  {
    GMTrace.i(12501576056832L, 93144);
    GMTrace.o(12501576056832L, 93144);
    return 617;
  }
  
  protected final int vB()
  {
    GMTrace.i(12501173403648L, 93141);
    GMTrace.o(12501173403648L, 93141);
    return 240;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */