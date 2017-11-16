package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akj;
import com.tencent.mm.protocal.c.akk;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gxy;
  
  public t(String paramString1, String paramString2)
  {
    GMTrace.i(4543538528256L, 33852);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new akj();
    ((b.a)localObject).gtG = new akk();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetbindlist";
    ((b.a)localObject).gtE = 674;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (akj)this.fUa.gtC.gtK;
    ((akj)localObject).uzI = paramString1;
    ((akj)localObject).uzJ = paramString2;
    this.gxy = paramString1;
    GMTrace.o(4543538528256L, 33852);
  }
  
  public final akk FB()
  {
    GMTrace.i(4544075399168L, 33856);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      akk localakk = (akk)this.fUa.gtD.gtK;
      GMTrace.o(4544075399168L, 33856);
      return localakk;
    }
    GMTrace.o(4544075399168L, 33856);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4543941181440L, 33855);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneKFGetBindList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4543941181440L, 33855);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4543672745984L, 33853);
    w.i("MicroMsg.NetSceneKFGetBindList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4543672745984L, 33853);
  }
  
  public final int getType()
  {
    GMTrace.i(4543806963712L, 33854);
    GMTrace.o(4543806963712L, 33854);
    return 674;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */