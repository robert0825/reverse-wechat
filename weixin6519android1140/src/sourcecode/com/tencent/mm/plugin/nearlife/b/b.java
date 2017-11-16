package com.tencent.mm.plugin.nearlife.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.om;
import com.tencent.mm.protocal.c.on;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b gtx;
  private com.tencent.mm.ad.e nuY;
  public String nuZ;
  
  public b(String paramString1, String paramString2, String paramString3, alk paramalk, int paramInt, LinkedList<azq> paramLinkedList, String paramString4)
  {
    GMTrace.i(12542109810688L, 93446);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new om();
    ((b.a)localObject).gtG = new on();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createpoi";
    ((b.a)localObject).gtE = 650;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gtx = ((b.a)localObject).DA();
    paramString4 = bg.aq(paramString4, "");
    localObject = bg.aq(null, "");
    om localom = (om)this.gtx.gtC.gtK;
    localom.lPi = paramString1;
    localom.ufq = paramString2;
    localom.ufs = paramalk;
    localom.jhc = paramInt;
    if (paramLinkedList != null) {
      localom.uft = paramLinkedList;
    }
    localom.ufu = paramString4;
    localom.ufv = ((String)localObject);
    localom.ufr = paramString3;
    w.d("MicroMsg.NetSceneCreatePoi", "[req] name:%s, district:%s, Street: %s lat:%f, long:%f, count:%d, tel:%s, url:%s", new Object[] { paramString1, paramString2, paramString3, Float.valueOf(paramalk.tYz), Float.valueOf(paramalk.tYy), Integer.valueOf(paramInt), paramString4, localObject });
    GMTrace.o(12542109810688L, 93446);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12542378246144L, 93448);
    this.nuY = parame1;
    int i = a(parame, this.gtx, this);
    GMTrace.o(12542378246144L, 93448);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12542512463872L, 93449);
    w.d("MicroMsg.NetSceneCreatePoi", "netId:%d, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (on)this.gtx.gtD.gtK;
    if (this.gtx.gtD.tKs != 0)
    {
      this.nuY.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12542512463872L, 93449);
      return;
    }
    this.nuZ = paramq.ufw;
    w.d("MicroMsg.NetSceneCreatePoi", "poi:" + this.nuZ);
    this.nuY.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12542512463872L, 93449);
  }
  
  public final int getType()
  {
    GMTrace.i(12542244028416L, 93447);
    GMTrace.o(12542244028416L, 93447);
    return 650;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */