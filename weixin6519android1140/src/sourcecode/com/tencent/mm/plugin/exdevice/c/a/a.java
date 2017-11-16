package com.tencent.mm.plugin.exdevice.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.c.nv;
import com.tencent.mm.protocal.c.nw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.plugin.exdevice.a.a<nv, nw>
{
  String appId;
  String eEl;
  String esG;
  String kxk;
  private WeakReference<b<a>> kxl;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, b<a> paramb)
  {
    GMTrace.i(10992834576384L, 81903);
    this.esG = bg.nl(paramString1);
    this.eEl = bg.nl(paramString2);
    this.kxk = bg.nl(paramString3);
    this.appId = bg.nl(paramString4);
    this.kxl = new WeakReference(paramb);
    GMTrace.o(10992834576384L, 81903);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10993103011840L, 81905);
    w.d("MicroMsg.NetSceneConnectedRouter", "ap: connected router end. errType: %d, errCode: %d, errMsg: %s, resp: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.kxl.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10993103011840L, 81905);
  }
  
  public final int getType()
  {
    GMTrace.i(10992968794112L, 81904);
    GMTrace.o(10992968794112L, 81904);
    return 1799;
  }
  
  protected final String getUri()
  {
    GMTrace.i(10993237229568L, 81906);
    GMTrace.o(10993237229568L, 81906);
    return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */