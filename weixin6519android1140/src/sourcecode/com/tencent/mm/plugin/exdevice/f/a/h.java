package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.oz;
import com.tencent.mm.protocal.c.pa;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class h
  extends com.tencent.mm.plugin.exdevice.a.a<oz, pa>
{
  private final WeakReference<b<h>> kxl;
  String username;
  
  public h(String paramString, b<h> paramb)
  {
    GMTrace.i(11188792459264L, 83363);
    this.username = paramString;
    this.kxl = new WeakReference(paramb);
    GMTrace.o(11188792459264L, 83363);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11189060894720L, 83365);
    w.d("MicroMsg.NetSceneDelFollow", "hy: del follow end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      ad.atT().wO(this.username);
    }
    paramq = (b)this.kxl.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11189060894720L, 83365);
  }
  
  public final int getType()
  {
    GMTrace.i(11188926676992L, 83364);
    GMTrace.o(11188926676992L, 83364);
    return 1792;
  }
  
  protected final String getUri()
  {
    GMTrace.i(11189195112448L, 83366);
    GMTrace.o(11189195112448L, 83366);
    return "/cgi-bin/mmoc-bin/hardware/delfollow";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */