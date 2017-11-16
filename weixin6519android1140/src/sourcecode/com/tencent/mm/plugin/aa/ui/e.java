package com.tencent.mm.plugin.aa.ui;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.y.ae;

public final class e
  extends q
{
  private String chatroomName;
  private String eQb;
  private String[] hqW;
  private Cursor hqX;
  
  public e(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    GMTrace.i(5642781720576L, 42042);
    this.chatroomName = paramString;
    paramMMBaseSelectContactUI = ((b)com.tencent.mm.kernel.h.h(b.class)).yT().gG(this.chatroomName);
    if (paramMMBaseSelectContactUI != null) {
      this.hqW = bg.cb(paramMMBaseSelectContactUI);
    }
    GMTrace.o(5642781720576L, 42042);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(5642915938304L, 42043);
    w.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.eQb = paramString;
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    if ((!bg.nm(this.eQb)) && (this.hqW != null))
    {
      com.tencent.mm.kernel.h.xz();
      this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this.hqW, "@all.chatroom", this.eQb, null, null);
    }
    notifyDataSetChanged();
    bg(paramString, true);
    GMTrace.o(5642915938304L, 42043);
  }
  
  public final void finish()
  {
    GMTrace.i(5643184373760L, 42045);
    super.finish();
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    GMTrace.o(5643184373760L, 42045);
  }
  
  public final int getCount()
  {
    GMTrace.i(5643318591488L, 42046);
    if (this.hqX == null)
    {
      GMTrace.o(5643318591488L, 42046);
      return 0;
    }
    int i = this.hqX.getCount();
    GMTrace.o(5643318591488L, 42046);
    return i;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(5643050156032L, 42044);
    d locald = null;
    if (this.hqX.moveToPosition(paramInt))
    {
      x localx = new x();
      localx.b(this.hqX);
      locald = new d(paramInt);
      locald.iBi = localx;
      locald.wSC = true;
    }
    GMTrace.o(5643050156032L, 42044);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */