package com.tencent.mm.bb;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.blw;
import com.tencent.mm.protocal.c.blx;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private String filemd5;
  public String filename;
  private String gVP;
  private int gVQ;
  private int gVR;
  public int gVS;
  private int gVT;
  aj gsj;
  private int sampleRate;
  
  public a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3497982427136L, 26062);
    this.gVP = null;
    this.filemd5 = null;
    this.filename = null;
    this.sampleRate = 0;
    this.gVQ = 0;
    this.gVR = 0;
    this.gVS = 0;
    this.gVT = 5;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3501740523520L, 26090);
        long l = com.tencent.mm.a.e.aY(a.this.filename);
        w.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.tC() + " onTimerExpired: file:" + a.this.filename + " nowlen:" + l + " oldoff:" + a.this.gVS);
        if (a.this.a(a.this.gtW, a.this.fUd) == -1) {
          a.this.fUd.a(3, -1, "doScene failed", a.this);
        }
        GMTrace.o(3501740523520L, 26090);
        return false;
      }
    }, true);
    this.gVP = bg.Pv();
    this.filename = paramString;
    this.gVT = paramInt1;
    this.sampleRate = paramInt2;
    this.gVQ = paramInt3;
    this.gVR = paramInt4;
    paramInt1 = com.tencent.mm.a.e.aY(this.filename);
    this.filemd5 = com.tencent.mm.a.g.n(com.tencent.mm.a.e.c(this.filename, 0, paramInt1));
    GMTrace.o(3497982427136L, 26062);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int i = 3960;
    GMTrace.i(3498116644864L, 26063);
    this.fUd = parame1;
    int k = com.tencent.mm.a.e.aY(this.filename);
    w.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.gVS + "this.filemd5 " + this.filemd5);
    if (k <= 0)
    {
      w.e("MicroMsg.NetSceneUploadMedia", "read failed :" + this.filename);
      GMTrace.o(3498116644864L, 26063);
      return -1;
    }
    int j = k - this.gVS;
    if (j > 3960) {}
    for (;;)
    {
      w.i("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.tC() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.gVS + "  canReadLen " + i);
      parame1 = com.tencent.mm.a.e.c(this.filename, this.gVS, i);
      if (parame1 == null)
      {
        w.e("MicroMsg.NetSceneUploadMedia", "read data error");
        GMTrace.o(3498116644864L, 26063);
        return -1;
      }
      Object localObject = new b.a();
      ((b.a)localObject).gtF = new blw();
      ((b.a)localObject).gtG = new blx();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmuploadmedia";
      ((b.a)localObject).gtE = 240;
      ((b.a)localObject).gtH = 111;
      ((b.a)localObject).gtI = 1000000111;
      this.fUa = ((b.a)localObject).DA();
      localObject = (blw)this.fUa.gtC.gtK;
      ((blw)localObject).uVK = new azq().Rq(this.gVP);
      ((blw)localObject).ues = new azp().be(parame1);
      ((blw)localObject).tRE = parame1.length;
      ((blw)localObject).uVL = new azq().Rq(this.filemd5);
      ((blw)localObject).tRC = k;
      ((blw)localObject).tRD = this.gVS;
      ((blw)localObject).lSq = this.gVT;
      ((blw)localObject).uVM = 1;
      ((blw)localObject).uVN = this.sampleRate;
      ((blw)localObject).uVO = this.gVQ;
      ((blw)localObject).uVP = this.gVR;
      i = a(parame, this.fUa, this);
      GMTrace.o(3498116644864L, 26063);
      return i;
      i = j;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(3498519298048L, 26066);
    int i = k.b.gum;
    GMTrace.o(3498519298048L, 26066);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(3498385080320L, 26065);
    w.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (blw)((b)paramq).gtC.gtK;
    paramq = ((blx)((b)paramq).gtD.gtK).ugf;
    w.i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", new Object[] { this.filename, paramq, Integer.valueOf(paramArrayOfByte.tRC), Integer.valueOf(paramArrayOfByte.tRE), Integer.valueOf(paramArrayOfByte.tRD) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(3498385080320L, 26065);
      return;
    }
    if ((paramArrayOfByte.tRC <= paramArrayOfByte.tRE + paramArrayOfByte.tRD) && (paramq != null) && (!paramq.equals("0")))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(3498385080320L, 26065);
      return;
    }
    paramInt1 = paramArrayOfByte.tRD;
    this.gVS = (paramArrayOfByte.ues.uNN + paramInt1);
    w.d("MicroMsg.NetSceneUploadMedia", "onGYNetEnd file:" + this.filename + " delay:500");
    this.gsj.z(500L, 500L);
    GMTrace.o(3498385080320L, 26065);
  }
  
  public final int getType()
  {
    GMTrace.i(3498250862592L, 26064);
    GMTrace.o(3498250862592L, 26064);
    return 240;
  }
  
  protected final int vB()
  {
    GMTrace.i(3498653515776L, 26067);
    GMTrace.o(3498653515776L, 26067);
    return 60;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bb\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */