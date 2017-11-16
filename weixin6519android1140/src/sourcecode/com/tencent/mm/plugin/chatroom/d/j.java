package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ago;
import com.tencent.mm.protocal.c.agp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public j(String paramString)
  {
    GMTrace.i(9068018139136L, 67562);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new ago();
    locala.gtG = new agp();
    locala.uri = "/cgi-bin/micromsg-bin/grantbigchatroom";
    locala.gtE = 339;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((ago)this.fUa.gtC.gtK).lSX = paramString;
    w.d("MicroMsg.NetSceneGrantBigChatRoom", "grant to userName :" + paramString);
    GMTrace.o(9068018139136L, 67562);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9068152356864L, 67563);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9068152356864L, 67563);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9068286574592L, 67564);
    w.d("MicroMsg.NetSceneGrantBigChatRoom", "onGYNetEnd " + paramInt2 + " " + paramInt3 + "  " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9068286574592L, 67564);
      return;
    }
    at.AR();
    paramInt1 = ((Integer)c.xh().get(135176, Integer.valueOf(0))).intValue();
    if (paramInt1 - 1 >= 0)
    {
      at.AR();
      c.xh().set(135176, Integer.valueOf(paramInt1 - 1));
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9068286574592L, 67564);
  }
  
  public final int getType()
  {
    GMTrace.i(9067883921408L, 67561);
    GMTrace.o(9067883921408L, 67561);
    return 339;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */