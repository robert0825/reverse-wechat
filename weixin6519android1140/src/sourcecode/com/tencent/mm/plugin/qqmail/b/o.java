package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.blo;
import com.tencent.mm.protocal.c.blp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Random;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eQB;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String filePath;
  private f gIl;
  private int gsL;
  private int gsM;
  
  public o(String paramString1, String paramString2, f paramf)
  {
    GMTrace.i(5463869489152L, 40709);
    this.filePath = null;
    this.gsM = 0;
    this.gsL = 0;
    this.filePath = paramString1;
    this.eQB = (paramString2 + "_" + System.nanoTime() + "_" + Math.abs(new Random().nextInt() / 2));
    this.gIl = paramf;
    w.i("MicroMsg.NetSceneUploadFie", "msgId: %s, filePath: %s", new Object[] { this.eQB, this.filePath });
    GMTrace.o(5463869489152L, 40709);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5464674795520L, 40715);
    this.fUd = parame1;
    if (bg.nm(this.filePath))
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, filePath is null");
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    if (!com.tencent.mm.a.e.aZ(this.filePath))
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, file: %s not exist", new Object[] { this.filePath });
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    if (this.gsL == 0)
    {
      this.gsL = com.tencent.mm.a.e.aY(this.filePath);
      w.i("MicroMsg.NetSceneUploadFie", "doScene, totalLen: %d", new Object[] { Integer.valueOf(this.gsL) });
    }
    int i = Math.min(this.gsL - this.gsM, 32768);
    w.i("MicroMsg.NetSceneUploadFie", "doScene, startPos: %d, dataLen: %d", new Object[] { Integer.valueOf(this.gsM), Integer.valueOf(i) });
    parame1 = com.tencent.mm.a.e.c(this.filePath, this.gsM, i);
    if (parame1 == null)
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, read file buf is null");
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    w.i("MicroMsg.NetSceneUploadFie", "doScene, buf.length: %d", new Object[] { Integer.valueOf(parame1.length) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new blo();
    ((b.a)localObject).gtG = new blp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadfile";
    ((b.a)localObject).gtE = 484;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (blo)this.fUa.gtC.gtK;
    ((blo)localObject).tPP = this.eQB;
    ((blo)localObject).tRC = this.gsL;
    ((blo)localObject).tRD = this.gsM;
    ((blo)localObject).tRE = i;
    ((blo)localObject).ues = n.H(parame1);
    i = a(parame, this.fUa, this);
    w.i("MicroMsg.NetSceneUploadFie", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(5464674795520L, 40715);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(5464272142336L, 40712);
    if ((bg.nm(this.filePath)) || (!com.tencent.mm.a.e.aZ(this.filePath)))
    {
      w.e("MicroMsg.NetSceneUploadFie", "securityVerificationChecked failed, file not exist");
      i = k.b.gun;
      GMTrace.o(5464272142336L, 40712);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(5464272142336L, 40712);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5464003706880L, 40710);
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5464003706880L, 40710);
      return;
    }
    paramq = (blp)((b)paramq).gtD.gtK;
    paramArrayOfByte = paramq.tPP;
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, clientId: %s, totalLen: %d, attachId: %s", new Object[] { paramq.tPP, Integer.valueOf(paramq.tRC), paramq.ueZ });
    if (!paramArrayOfByte.equals(this.eQB))
    {
      GMTrace.o(5464003706880L, 40710);
      return;
    }
    this.gsM = paramq.tRD;
    if (this.gsM < this.gsL)
    {
      w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.gsM), Integer.valueOf(this.gsL) });
      if (a(this.gtW, this.fUd) < 0)
      {
        w.e("MicroMsg.NetSceneUploadFie", "continue to upload fail");
        if (this.fUd != null) {
          this.fUd.a(paramInt2, paramInt3, paramString, this);
        }
        if (this.gIl != null) {
          this.gIl.a(this.gsM, this.gsL, this);
        }
        GMTrace.o(5464003706880L, 40710);
        return;
      }
    }
    paramq = paramq.ueZ;
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, finish upload, startPos: %d, totalLen: %d, attachId: %s", new Object[] { Integer.valueOf(this.gsM), Integer.valueOf(this.gsL), paramq });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gIl != null) {
      this.gIl.a(this.gsM, this.gsL, this);
    }
    GMTrace.o(5464003706880L, 40710);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5464406360064L, 40713);
    GMTrace.o(5464406360064L, 40713);
  }
  
  public final blp aYy()
  {
    GMTrace.i(5464809013248L, 40716);
    if (this.fUa != null)
    {
      blp localblp = (blp)this.fUa.gtD.gtK;
      GMTrace.o(5464809013248L, 40716);
      return localblp;
    }
    GMTrace.o(5464809013248L, 40716);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(5464540577792L, 40714);
    GMTrace.o(5464540577792L, 40714);
    return 484;
  }
  
  protected final int vB()
  {
    GMTrace.i(5464137924608L, 40711);
    GMTrace.o(5464137924608L, 40711);
    return 640;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */