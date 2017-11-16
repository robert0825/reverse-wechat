package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ahz;
import com.tencent.mm.protocal.c.aib;
import com.tencent.mm.protocal.c.xc;
import com.tencent.mm.protocal.c.xd;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b gMj;
  
  public e(List<ahz> paramList, long paramLong, aib paramaib)
  {
    GMTrace.i(406411280384L, 3028);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xc();
    ((b.a)localObject).gtG = new xd();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
    ((b.a)localObject).gtE = 1708;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gMj = ((b.a)localObject).DA();
    localObject = (xc)this.gMj.gtC.gtK;
    ((xc)localObject).uoQ.addAll(paramList);
    ((xc)localObject).uoT = paramLong;
    ((xc)localObject).uoS = paramaib;
    w.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", new Object[] { Integer.valueOf(((xc)localObject).uoQ.size()) });
    GMTrace.o(406411280384L, 3028);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(406813933568L, 3031);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(406813933568L, 3031);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(406545498112L, 3029);
    w.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    Object localObject = (xc)this.gMj.gtC.gtK;
    paramString = ((xc)localObject).uoQ;
    paramArrayOfByte = (ahz)paramString.get(0);
    localObject = ((xc)localObject).uoS;
    paramq = (xd)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (paramq.result != 0) {
        g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramString.size()), paramArrayOfByte.lOv, Integer.valueOf(paramArrayOfByte.major), Integer.valueOf(paramArrayOfByte.minor), String.valueOf(((aib)localObject).latitude), String.valueOf(((aib)localObject).longitude), Integer.valueOf(2), Integer.valueOf(paramq.result) });
      }
      w.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end ok");
      GMTrace.o(406545498112L, 3029);
      return;
    }
    g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramString.size()), paramArrayOfByte.lOv, Integer.valueOf(paramArrayOfByte.major), Integer.valueOf(paramArrayOfByte.minor), String.valueOf(((aib)localObject).latitude), String.valueOf(((aib)localObject).longitude), Integer.valueOf(1), Integer.valueOf(paramq.result) });
    w.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end not ok");
    GMTrace.o(406545498112L, 3029);
  }
  
  public final int getType()
  {
    GMTrace.i(406679715840L, 3030);
    GMTrace.o(406679715840L, 3030);
    return 1708;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelmulti\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */