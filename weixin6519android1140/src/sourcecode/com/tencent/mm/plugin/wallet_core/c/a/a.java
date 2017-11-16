package com.tencent.mm.plugin.wallet_core.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.asl;
import com.tencent.mm.protocal.c.asm;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(19316615413760L, 143920);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new asl();
    ((b.a)localObject).gtG = new asm();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
    ((b.a)localObject).gtE = 1767;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (asl)this.fUa.gtC.gtK;
    ((asl)localObject).lQa = paramString1;
    ((asl)localObject).udg = paramString4;
    ((asl)localObject).udf = paramString2;
    ((asl)localObject).udh = paramString5;
    ((asl)localObject).udi = paramString6;
    ((asl)localObject).tUz = paramString3;
    ((asl)localObject).ucv = paramString7;
    GMTrace.o(19316615413760L, 143920);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19317018066944L, 143923);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19317018066944L, 143923);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19316749631488L, 143921);
    w.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramArrayOfByte = (asm)((b)paramq).gtD.gtK;
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        paramInt1 = paramArrayOfByte.kBk;
        paramq = paramArrayOfByte.kBl;
      }
    }
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(19316749631488L, 143921);
  }
  
  public final int getType()
  {
    GMTrace.i(19316883849216L, 143922);
    GMTrace.o(19316883849216L, 143922);
    return 1767;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */