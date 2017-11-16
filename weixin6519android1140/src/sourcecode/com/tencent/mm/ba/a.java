package com.tencent.mm.ba;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.protocal.c.bcf;
import com.tencent.mm.protocal.c.bcg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  String gSr;
  
  public a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4, String paramString3)
  {
    GMTrace.i(4401804607488L, 32796);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcf();
    ((b.a)localObject).gtG = new bcg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sensewhere";
    ((b.a)localObject).gtE = 752;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = new alk();
    ((alk)localObject).ujd = paramString2;
    ((alk)localObject).uje = paramInt2;
    ((alk)localObject).tYz = paramFloat2;
    ((alk)localObject).tYy = paramFloat1;
    ((alk)localObject).ujc = paramString1;
    ((alk)localObject).ujb = paramInt1;
    paramString1 = (bcf)this.fUa.gtC.gtK;
    paramString1.ufs = ((alk)localObject);
    paramString1.uOW = paramInt3;
    paramString1.tOG = paramInt4;
    paramString1.nIp = paramString3;
    GMTrace.o(4401804607488L, 32796);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4402207260672L, 32799);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4402207260672L, 32799);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4401938825216L, 32797);
    w.i("MicroMsg.NetSceneUploadSenseWhere", "upload sense where info. errType[%d] errCode[%d] errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.gSr = ((bcg)((b)paramq).gtD.gtK).nIp;
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4401938825216L, 32797);
      return;
      w.w("MicroMsg.NetSceneUploadSenseWhere", "upload sense where error");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4402073042944L, 32798);
    GMTrace.o(4402073042944L, 32798);
    return 752;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ba\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */