package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vg;
import com.tencent.mm.protocal.c.vh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class al
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gXq;
  private String lOu;
  
  public al(int paramInt, String paramString)
  {
    GMTrace.i(815506915328L, 6076);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new vg();
    ((b.a)localObject).gtG = new vh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gamereportkv";
    ((b.a)localObject).gtE = 427;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (vg)this.fUa.gtC.gtK;
    ((vg)localObject).tWD = d.tJw;
    ((vg)localObject).tWE = d.tJv;
    ((vg)localObject).tWF = d.tJy;
    ((vg)localObject).tWG = d.tJz;
    ((vg)localObject).tWH = v.bPK();
    ((vg)localObject).oqP = paramInt;
    ((vg)localObject).tWI = paramString;
    this.gXq = paramInt;
    this.lOu = paramString;
    GMTrace.o(815506915328L, 6076);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(815909568512L, 6079);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(815909568512L, 6079);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(815641133056L, 6077);
    w.d("MircoMsg.NetsceneGameKVReport", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", logId = " + this.gXq + ", logExt = " + this.lOu);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(815641133056L, 6077);
  }
  
  public final int getType()
  {
    GMTrace.i(815775350784L, 6078);
    GMTrace.o(815775350784L, 6078);
    return 427;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */