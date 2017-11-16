package com.tencent.mm.ax;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.acy;
import com.tencent.mm.protocal.c.acz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gQu;
  public String gQv;
  public byte[] gQw;
  
  public a()
  {
    this(com.tencent.mm.y.q.zE(), bg.e((Integer)h.xy().xh().get(66561, null)), 0);
    GMTrace.i(12953621364736L, 96512);
    GMTrace.o(12953621364736L, 96512);
  }
  
  public a(String paramString, int paramInt)
  {
    this(paramString, paramInt, 0);
    GMTrace.i(12953755582464L, 96513);
    GMTrace.o(12953755582464L, 96513);
  }
  
  public a(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(16867007660032L, 125669);
    this.fUd = null;
    this.gQu = null;
    this.gQv = null;
    this.gQw = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new acy();
    ((b.a)localObject).gtG = new acz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqrcode";
    ((b.a)localObject).gtE = 168;
    ((b.a)localObject).gtH = 67;
    ((b.a)localObject).gtI = 1000000067;
    this.fUa = ((b.a)localObject).DA();
    localObject = (acy)this.fUa.gtC.gtK;
    ((acy)localObject).ufy = n.ni(paramString);
    ((acy)localObject).usX = paramInt1;
    ((acy)localObject).tMX = paramInt2;
    w.i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(16867007660032L, 125669);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12953889800192L, 96514);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12953889800192L, 96514);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12954158235648L, 96516);
    w.d("MicroMsg.NetSceneGetQRCode", "onGYNetEnd errType:" + paramInt2 + " errCode" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (acy)this.fUa.gtC.gtK;
      paramq = (acz)this.fUa.gtD.gtK;
      paramArrayOfByte = n.a(paramArrayOfByte.ufy);
      this.gQw = n.a(paramq.usY, new byte[0]);
      this.gQu = paramq.usZ;
      w.i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s", new Object[] { this.gQu, paramq.uta, paramq.utb });
      if (com.tencent.mm.y.q.zE().equals(paramArrayOfByte))
      {
        paramArrayOfByte = paramq.uta;
        String str = (String)h.xy().xh().get(66563, "");
        if ((paramArrayOfByte != null) && (!str.equals(paramArrayOfByte)))
        {
          h.xy().xh().set(66563, paramArrayOfByte);
          this.gQv = paramq.utb;
        }
        h.xy().xh().set(66561, Integer.valueOf(paramq.usX));
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12954158235648L, 96516);
  }
  
  public final int getType()
  {
    GMTrace.i(12954024017920L, 96515);
    GMTrace.o(12954024017920L, 96515);
    return 168;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ax\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */