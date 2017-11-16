package com.tencent.mm.plugin.sns.a.b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.ax;
import com.tencent.mm.protocal.c.ay;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  
  private c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, int paramInt5)
  {
    GMTrace.i(20071321698304L, 149543);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ax();
    ((b.a)localObject).gtG = new ay();
    if (paramInt5 != 2) {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/click";
    }
    for (((b.a)localObject).gtE = 1232;; ((b.a)localObject).gtE = 1817)
    {
      ((b.a)localObject).gtH = 0;
      ((b.a)localObject).gtI = 0;
      this.fUa = ((b.a)localObject).DA();
      w.i("MicroMsg.NetSceneAdClick", "uri %s", new Object[] { this.fUa.uri });
      w.i("MicroMsg.NetSceneAdClick", "NetSceneAdClick clickPos: " + paramInt1 + " viewId: " + paramString1 + " sceneType: " + paramInt2 + " adtype " + paramInt3 + ", clickAction " + paramInt4 + ",source " + paramInt5 + ", descXml " + paramString2);
      if (!bg.nm(paramString2)) {
        w.i("MicroMsg.NetSceneAdClick", "descXml: " + paramString2);
      }
      localObject = (ax)this.fUa.gtC.gtK;
      ((ax)localObject).gVv = paramInt1;
      ((ax)localObject).gVs = paramString1;
      ((ax)localObject).scene = paramInt2;
      ((ax)localObject).tPe = paramString2;
      paramString1 = (WifiManager)ab.getContext().getSystemService("wifi");
      if (paramString1 != null)
      {
        paramString1 = paramString1.getConnectionInfo();
        if (paramString1 != null)
        {
          ((ax)localObject).bssid = bg.aq(paramString1.getBSSID(), "");
          ((ax)localObject).ssid = bg.aq(paramString1.getSSID(), "");
        }
      }
      ((ax)localObject).tPf = System.currentTimeMillis();
      ((ax)localObject).tPh = paramInt3;
      ((ax)localObject).tPi = paramInt4;
      ((ax)localObject).cfz = paramInt5;
      ((ax)localObject).tPj = paramString3;
      GMTrace.o(20071321698304L, 149543);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adclick";
    }
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, String paramString4)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, paramInt4, paramString3, n.poU.GK(paramString4));
    GMTrace.i(20071455916032L, 149544);
    GMTrace.o(20071455916032L, 149544);
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, long paramLong)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, "", paramLong);
    GMTrace.i(20070919045120L, 149540);
    GMTrace.o(20070919045120L, 149540);
  }
  
  public c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, String paramString3)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, 0, "", paramString3);
    GMTrace.i(20071053262848L, 149541);
    GMTrace.o(20071053262848L, 149541);
  }
  
  private c(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, String paramString3, long paramLong)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramInt3, 0, paramString3, n.poU.dq(paramLong));
    GMTrace.i(20071187480576L, 149542);
    GMTrace.o(20071187480576L, 149542);
  }
  
  public c(String paramString1, String paramString2)
  {
    this(paramString1, 18, 5, paramString2, 2, -1L);
    GMTrace.i(20070784827392L, 149539);
    GMTrace.o(20070784827392L, 149539);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8159900991488L, 60796);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8159900991488L, 60796);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8160169426944L, 60798);
    w.d("MicroMsg.NetSceneAdClick", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8160169426944L, 60798);
  }
  
  public final int getType()
  {
    GMTrace.i(8160035209216L, 60797);
    GMTrace.o(8160035209216L, 60797);
    return 1232;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */