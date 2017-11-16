package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bmz;
import com.tencent.mm.protocal.c.bna;
import com.tencent.mm.sdk.platformtools.w;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b gMj;
  
  public x(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12010607607808L, 89486);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bmz();
    ((b.a)localObject).gtG = new bna();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/verifybeaconjspermission";
    ((b.a)localObject).gtE = 1702;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gMj = ((b.a)localObject).DA();
    localObject = (bmz)this.gMj.gtC.gtK;
    ((bmz)localObject).lPM = paramString1;
    ((bmz)localObject).eSd = paramString2;
    ((bmz)localObject).eEU = paramString3;
    GMTrace.o(12010607607808L, 89486);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12010876043264L, 89488);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(12010876043264L, 89488);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12011010260992L, 89489);
    w.i("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.d("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:net end ok");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12011010260992L, 89489);
      return;
      w.d("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:net end not ok");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12010741825536L, 89487);
    GMTrace.o(12010741825536L, 89487);
    return 1702;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */