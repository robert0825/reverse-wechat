package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.od;
import com.tencent.mm.protocal.c.oe;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gyM;
  
  public m(String paramString1, String paramString2, String paramString3, Object paramObject)
  {
    GMTrace.i(4579508879360L, 34120);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new od();
    ((b.a)localObject).gtG = new oe();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/convertbizchat";
    ((b.a)localObject).gtE = 1315;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (od)this.fUa.gtC.gtK;
    ((od)localObject).ufb = paramString1;
    ((od)localObject).ufd = paramString2;
    ((od)localObject).ufc = paramString3;
    this.data = paramObject;
    GMTrace.o(4579508879360L, 34120);
  }
  
  public final oe FZ()
  {
    GMTrace.i(4580045750272L, 34124);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      oe localoe = (oe)this.fUa.gtD.gtK;
      GMTrace.o(4580045750272L, 34124);
      return localoe;
    }
    GMTrace.o(4580045750272L, 34124);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4579911532544L, 34123);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneConvertBizChat", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4579911532544L, 34123);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4579643097088L, 34121);
    w.d("MicroMsg.NetSceneConvertBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4579643097088L, 34121);
  }
  
  public final int getType()
  {
    GMTrace.i(4579777314816L, 34122);
    GMTrace.o(4579777314816L, 34122);
    return 1315;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */