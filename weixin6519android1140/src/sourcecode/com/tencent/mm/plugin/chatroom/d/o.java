package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.blc;
import com.tencent.mm.protocal.c.bld;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  public int fMw;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jNb;
  public String jNk;
  public int jNl;
  
  public o(String paramString)
  {
    GMTrace.i(9063991607296L, 67532);
    this.fUd = null;
    this.chatroomName = null;
    this.jNb = null;
    this.jNk = null;
    this.fMw = 0;
    this.jNl = 0;
    b.a locala = new b.a();
    locala.gtF = new blc();
    locala.gtG = new bld();
    locala.uri = "/cgi-bin/micromsg-bin/upgradechatroom";
    locala.gtE = 482;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.chatroomName = paramString;
    ((blc)this.fUa.gtC.gtK).ufz = paramString;
    GMTrace.o(9063991607296L, 67532);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9064125825024L, 67533);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9064125825024L, 67533);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9064394260480L, 67535);
    bld localbld = (bld)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneUpgradeChatroom", "NetSceneUpgradeChatroom onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.jNk = localbld.uEs;
    if (!bg.nm(this.jNk))
    {
      at.AR();
      paramArrayOfByte = c.yT().gC(this.chatroomName);
      paramq = paramArrayOfByte;
      if (paramArrayOfByte == null) {
        paramq = new com.tencent.mm.storage.q();
      }
      paramq.fe(com.tencent.mm.y.q.zE(), this.jNk);
      m.a(paramq);
    }
    this.jNb = localbld.upS;
    this.fMw = localbld.upR;
    this.jNl = localbld.upT;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9064394260480L, 67535);
  }
  
  public final int getType()
  {
    GMTrace.i(9064260042752L, 67534);
    GMTrace.o(9064260042752L, 67534);
    return 482;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */