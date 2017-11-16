package com.tencent.mm.plugin.sns.a.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bb;
import com.tencent.mm.protocal.c.bc;
import com.tencent.mm.protocal.c.bd;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  
  public d(String paramString1, int paramInt1, int paramInt2, int paramInt3, bb parambb, be parambe, int paramInt4, String paramString2, int paramInt5, int paramInt6)
  {
    GMTrace.i(20053336522752L, 149409);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bc();
    ((b.a)localObject).gtG = new bd();
    if (paramInt6 != 2) {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/exposure";
    }
    for (((b.a)localObject).gtE = 1231;; ((b.a)localObject).gtE = 1875)
    {
      ((b.a)localObject).gtH = 0;
      ((b.a)localObject).gtI = 0;
      this.fUa = ((b.a)localObject).DA();
      w.i("MicroMsg.NetSceneAdExposure", "uri %s", new Object[] { this.fUa.uri });
      localObject = (bc)this.fUa.gtC.gtK;
      ((bc)localObject).tPs = paramInt3;
      ((bc)localObject).type = paramInt2;
      ((bc)localObject).scene = paramInt1;
      ((bc)localObject).gVs = paramString1;
      ((bc)localObject).tPv = paramInt5;
      if (parambb != null)
      {
        ((bc)localObject).tPt = parambb;
        w.i("MicroMsg.NetSceneAdExposure", "exposure_info " + parambb.tPq);
      }
      if (parambe != null)
      {
        ((bc)localObject).tPu = parambe;
        w.i("MicroMsg.NetSceneAdExposure", "social_info " + parambe.tPw + " " + parambe.bKc);
      }
      parambb = (WifiManager)ab.getContext().getSystemService("wifi");
      if (parambb != null)
      {
        parambb = parambb.getConnectionInfo();
        if (parambb != null)
        {
          ((bc)localObject).bssid = bg.aq(parambb.getBSSID(), "");
          ((bc)localObject).ssid = bg.aq(parambb.getSSID(), "");
        }
      }
      ((bc)localObject).tPf = System.currentTimeMillis();
      ((bc)localObject).tPh = paramInt4;
      if (paramString2 != null) {
        ((bc)localObject).tPe = paramString2;
      }
      w.i("MicroMsg.NetSceneAdExposure", "##time viewid " + paramString1 + " sceneType " + paramInt1 + " type: " + paramInt2 + " duration " + paramInt3 + " ad_type " + paramInt4 + " exposureCount " + paramInt5 + " descXml:" + paramString2);
      GMTrace.o(20053336522752L, 149409);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adexposure";
    }
  }
  
  public d(String paramString, int paramInt1, be parambe, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramString, paramInt1, 1, 0, null, parambe, paramInt2, "", paramInt3, paramInt4);
    GMTrace.i(20053202305024L, 149408);
    GMTrace.o(20053202305024L, 149408);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8167014531072L, 60849);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8167014531072L, 60849);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8167282966528L, 60851);
    w.i("MicroMsg.NetSceneAdExposure", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (bd)this.fUa.gtD.gtK;
    w.i("MicroMsg.NetSceneAdExposure", "resp " + paramq.ret + " msg: " + paramq.eCh);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8167282966528L, 60851);
  }
  
  public final int getType()
  {
    GMTrace.i(8167148748800L, 60850);
    GMTrace.o(8167148748800L, 60850);
    return 1231;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */