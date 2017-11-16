package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;

public final class b
  extends e
{
  public String aDn;
  public int qPV;
  private boolean wUL;
  
  public b(int paramInt)
  {
    super(paramInt);
    GMTrace.i(1768318566400L, 13175);
    this.qPV = 0;
    GMTrace.o(1768318566400L, 13175);
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(1768452784128L, 13176);
    if ((this.qPV != 0) && (this.aDn != null))
    {
      this.wUV = this.qPV;
      this.wUU = this.aDn;
      GMTrace.o(1768452784128L, 13176);
      return;
    }
    x localx = this.iBi;
    if (!this.wUL)
    {
      com.tencent.mm.kernel.h.xz();
      localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.username);
      this.iBi = localx;
      this.wUL = true;
    }
    if (localx == null)
    {
      this.hqB = "";
      GMTrace.o(1768452784128L, 13176);
      return;
    }
    this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).c(localx), com.tencent.mm.br.a.V(paramContext, a.c.aQF));
    this.username = localx.field_username;
    GMTrace.o(1768452784128L, 13176);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */