package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.yx;
import com.tencent.mm.protocal.c.yy;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jNb;
  public int jNc;
  public int jNd;
  public int status;
  
  public h(String paramString)
  {
    GMTrace.i(9062649430016L, 67522);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new yx();
    locala.gtG = new yy();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
    locala.gtE = 519;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.chatroomName = paramString;
    ((yx)this.fUa.gtC.gtK).ufz = paramString;
    GMTrace.o(9062649430016L, 67522);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9062783647744L, 67523);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9062783647744L, 67523);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9063052083200L, 67525);
    paramq = (yy)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneGetChatRoomUpgradeStatus", "NetSceneGetChatRoomUpgradeStatus onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.status = paramq.jhA;
    this.jNb = paramq.upS;
    this.jNd = paramq.upT;
    this.jNb = paramq.upS;
    this.jNc = paramq.upR;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9063052083200L, 67525);
  }
  
  public final int getType()
  {
    GMTrace.i(9062917865472L, 67524);
    GMTrace.o(9062917865472L, 67524);
    return 519;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */