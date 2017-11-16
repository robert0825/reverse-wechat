package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.oi;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public n(String paramString, us paramus, Object paramObject)
  {
    GMTrace.i(4576556089344L, 34098);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new oi();
    ((b.a)localObject).gtG = new oj();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
    ((b.a)localObject).gtE = 1355;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (oi)this.fUa.gtC.gtK;
    ((oi)localObject).tVU = paramString;
    ((oi)localObject).ufl = paramus;
    this.data = paramObject;
    GMTrace.o(4576556089344L, 34098);
  }
  
  public final oj Ga()
  {
    GMTrace.i(4577092960256L, 34102);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      oj localoj = (oj)this.fUa.gtD.gtK;
      GMTrace.o(4577092960256L, 34102);
      return localoj;
    }
    GMTrace.o(4577092960256L, 34102);
    return null;
  }
  
  public final oi Gb()
  {
    GMTrace.i(4577227177984L, 34103);
    if ((this.fUa != null) && (this.fUa.gtC.gtK != null))
    {
      oi localoi = (oi)this.fUa.gtC.gtK;
      GMTrace.o(4577227177984L, 34103);
      return localoi;
    }
    GMTrace.o(4577227177984L, 34103);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4576958742528L, 34101);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4576958742528L, 34101);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4576690307072L, 34099);
    w.d("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4576690307072L, 34099);
  }
  
  public final int getType()
  {
    GMTrace.i(4576824524800L, 34100);
    GMTrace.o(4576824524800L, 34100);
    return 1355;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */