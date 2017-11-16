package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjp;
import com.tencent.mm.protocal.c.bjq;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String username;
  
  public n(String paramString1, String paramString2)
  {
    GMTrace.i(9062112559104L, 67518);
    b.a locala = new b.a();
    this.username = paramString2;
    bjp localbjp = new bjp();
    localbjp.ufz = paramString1;
    localbjp.uUC = paramString2;
    locala.gtF = localbjp;
    locala.gtG = new bjq();
    locala.uri = "/cgi-bin/micromsg-bin/transferchatroomowner";
    locala.gtE = 990;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(9062112559104L, 67518);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9062515212288L, 67521);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9062515212288L, 67521);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9062246776832L, 67519);
    w.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9062246776832L, 67519);
  }
  
  public final int getType()
  {
    GMTrace.i(9062380994560L, 67520);
    GMTrace.o(9062380994560L, 67520);
    return 990;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */