package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcr;
import com.tencent.mm.protocal.c.bcs;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public m(String paramString1, String paramString2)
  {
    GMTrace.i(9059830857728L, 67501);
    b.a locala = new b.a();
    bcr localbcr = new bcr();
    localbcr.ufz = paramString1;
    localbcr.upE = paramString2;
    locala.gtF = localbcr;
    locala.gtG = new bcs();
    locala.uri = "/cgi-bin/micromsg-bin/setchatroomannouncement";
    locala.gtE = 993;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(9059830857728L, 67501);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9060233510912L, 67504);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9060233510912L, 67504);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9059965075456L, 67502);
    w.w("MicroMsg.NetSceneSetChatRoomAnnouncement", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9059965075456L, 67502);
  }
  
  public final int getType()
  {
    GMTrace.i(9060099293184L, 67503);
    GMTrace.o(9060099293184L, 67503);
    return 993;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */