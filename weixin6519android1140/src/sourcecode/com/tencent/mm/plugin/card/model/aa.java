package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.protocal.c.yg;
import com.tencent.mm.protocal.c.yh;
import com.tencent.mm.sdk.platformtools.w;

public final class aa
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  
  public aa(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, bhb parambhb)
  {
    GMTrace.i(4910489796608L, 36586);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new yg();
    ((b.a)localObject).gtG = new yh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcarditeminfo";
    ((b.a)localObject).gtE = 645;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (yg)this.fUa.gtC.gtK;
    ((yg)localObject).eTJ = paramString1;
    ((yg)localObject).eTL = paramInt1;
    ((yg)localObject).jyR = paramString2;
    ((yg)localObject).eTK = paramString3;
    ((yg)localObject).tNI = paramString4;
    ((yg)localObject).tNH = paramString5;
    ((yg)localObject).tNJ = paramInt2;
    ((yg)localObject).upt = paramString6;
    ((yg)localObject).tNL = parambhb;
    GMTrace.o(4910489796608L, 36586);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4910758232064L, 36588);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4910758232064L, 36588);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4910892449792L, 36589);
    w.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.jzG = ((yh)this.fUa.gtD.gtK).jzG;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4910892449792L, 36589);
  }
  
  public final int getType()
  {
    GMTrace.i(4910624014336L, 36587);
    GMTrace.o(4910624014336L, 36587);
    return 645;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */