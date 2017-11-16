package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends o
{
  private Cursor hqX;
  private List<String> wRS;
  
  public h(MMBaseSelectContactUI paramMMBaseSelectContactUI, boolean paramBoolean, List<String> paramList)
  {
    super(paramMMBaseSelectContactUI, new ArrayList(), true, paramBoolean);
    GMTrace.i(1778116460544L, 13248);
    this.wRS = paramList;
    com.tencent.mm.kernel.h.xz();
    this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cl(this.wRS);
    GMTrace.o(1778116460544L, 13248);
  }
  
  public final void finish()
  {
    GMTrace.i(1778519113728L, 13251);
    super.finish();
    w.i("MicroMsg.CustomContactAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    GMTrace.o(1778519113728L, 13251);
  }
  
  public final int getCount()
  {
    GMTrace.i(1778250678272L, 13249);
    int i = this.hqX.getCount();
    GMTrace.o(1778250678272L, 13249);
    return i;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(1778384896000L, 13250);
    d locald = null;
    if ((paramInt >= 0) && (this.hqX.moveToPosition(paramInt)))
    {
      locald = new d(paramInt);
      x localx = new x();
      localx.b(this.hqX);
      locald.iBi = localx;
      locald.wSC = bhh();
    }
    for (;;)
    {
      GMTrace.o(1778384896000L, 13250);
      return locald;
      w.e("MicroMsg.CustomContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */