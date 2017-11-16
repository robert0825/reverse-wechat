package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.ahb;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bbn;
import com.tencent.mm.protocal.c.bbo;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  public com.tencent.mm.ad.b kzP;
  String kzY;
  
  public w(long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(10961964498944L, 81673);
    this.kzP = null;
    this.fXo = null;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", new Object[] { paramString1, paramString2, Long.valueOf(paramLong2), Long.valueOf(paramLong3), Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    this.kzY = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bbn();
    ((b.a)localObject).gtG = new bbo();
    ((b.a)localObject).gtE = 538;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendharddevicemsg";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (bbn)this.kzP.gtC.gtK;
    agx localagx = new agx();
    localagx.tSz = paramString1;
    localagx.jhl = paramString2;
    ((bbn)localObject).tUt = localagx;
    paramString1 = new ahb();
    paramString1.uwB = paramLong2;
    paramString1.nFd = ((int)paramLong3);
    paramString1.tTe = new azp().be(paramArrayOfByte);
    paramString1.jib = paramInt;
    ((bbn)localObject).uOL = paramString1;
    if (paramLong1 != 0L)
    {
      ((bbn)localObject).uww = new azp().be(u.aus().l(paramLong1, 2));
      GMTrace.o(10961964498944L, 81673);
      return;
    }
    paramString1 = ad.atR().wT(paramString2);
    if (paramString1 != null) {
      ((bbn)localObject).uww = new azp().be(paramString1.field_sessionBuf);
    }
    GMTrace.o(10961964498944L, 81673);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10962367152128L, 81676);
    this.fXo = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(10962367152128L, 81676);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10962098716672L, 81674);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10962098716672L, 81674);
  }
  
  public final int getType()
  {
    GMTrace.i(10962232934400L, 81675);
    GMTrace.o(10962232934400L, 81675);
    return 538;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */