package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.util.Date;

public final class t
  extends c<sm>
  implements com.tencent.mm.ad.e
{
  private sm riN;
  private String riO;
  
  public t()
  {
    GMTrace.i(6901207138304L, 51418);
    this.riO = null;
    this.vhf = sm.class.getName().hashCode();
    GMTrace.o(6901207138304L, 51418);
  }
  
  private void byG()
  {
    GMTrace.i(6901341356032L, 51419);
    d locald = n.byB();
    q localq = new q();
    localq.field_bulletin_scene = this.riO;
    if (!locald.b(localq, new String[0])) {
      w.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
    }
    for (;;)
    {
      this.riN.eDO.run();
      this.riN = null;
      GMTrace.o(6901341356032L, 51419);
      return;
      this.riN.eXq.eXs = localq.field_bulletin_scene;
      this.riN.eXq.content = localq.field_bulletin_content;
      this.riN.eXq.url = localq.field_bulletin_url;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6901475573760L, 51420);
    w.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + paramInt1 + ";errCode=" + paramInt2);
    h.xz();
    h.xx().fYr.b(385, this);
    h.xz();
    h.xy().xh().a(w.a.vtr, Long.valueOf(new Date().getTime()));
    byG();
    GMTrace.o(6901475573760L, 51420);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */