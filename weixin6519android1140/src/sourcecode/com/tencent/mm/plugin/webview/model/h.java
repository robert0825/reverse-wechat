package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahz;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b gMj;
  
  public h(List<ahz> paramList, String paramString)
  {
    GMTrace.i(12018392236032L, 89544);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xa();
    ((b.a)localObject).gtG = new xb();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/getbeaconsingroup";
    ((b.a)localObject).gtE = 1704;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gMj = ((b.a)localObject).DA();
    localObject = (xa)this.gMj.gtC.gtK;
    ((xa)localObject).uoQ.addAll(paramList);
    ((xa)localObject).eSd = paramString;
    w.i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang]getBeaconsInGroupRequest.beacons.size:%d", new Object[] { Integer.valueOf(((xa)localObject).uoQ.size()) });
    GMTrace.o(12018392236032L, 89544);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12018660671488L, 89546);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(12018660671488L, 89546);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12018794889216L, 89547);
    w.i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end ok");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12018794889216L, 89547);
      return;
      w.d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end not ok");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12018526453760L, 89545);
    GMTrace.o(12018526453760L, 89545);
    return 1704;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */