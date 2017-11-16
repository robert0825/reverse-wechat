package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import java.util.ArrayList;

public final class w
  extends o
{
  private Cursor hqX;
  private String wPl;
  
  public w(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, new ArrayList(), false, false);
    GMTrace.i(1755433664512L, 13079);
    this.wPl = paramString;
    com.tencent.mm.kernel.h.xz();
    this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().c(this.wPl, "", this.iVA);
    GMTrace.o(1755433664512L, 13079);
  }
  
  public final void finish()
  {
    GMTrace.i(1755836317696L, 13082);
    super.finish();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SpecialContactAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    GMTrace.o(1755836317696L, 13082);
  }
  
  public final int getCount()
  {
    GMTrace.i(1755567882240L, 13080);
    int i = this.hqX.getCount();
    GMTrace.o(1755567882240L, 13080);
    return i;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(1755702099968L, 13081);
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
      GMTrace.o(1755702099968L, 13081);
      return locald;
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */