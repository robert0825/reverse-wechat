package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azk;
import com.tencent.mm.protocal.c.azl;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public l(String paramString1, String paramString2)
  {
    GMTrace.i(9064796913664L, 67538);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new azk();
    ((b.a)localObject).gtG = new azl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/revokechatroomqrcode";
    ((b.a)localObject).gtE = 700;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (azk)this.fUa.gtC.gtK;
    ((azk)localObject).uNF = paramString1;
    ((azk)localObject).uNG = paramString2;
    GMTrace.o(9064796913664L, 67538);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9064931131392L, 67539);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9064931131392L, 67539);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9065199566848L, 67541);
    w.d("MicroMsg.RevokeChatRoomQRCodeRequest", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9065199566848L, 67541);
  }
  
  public final int getType()
  {
    GMTrace.i(9065065349120L, 67540);
    GMTrace.o(9065065349120L, 67540);
    return 700;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */