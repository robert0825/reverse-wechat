package com.tencent.mm.plugin.multitalk.ui;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
  extends q
{
  private String chatroomName;
  private String eQb;
  private String[] hqW;
  private Cursor hqX;
  
  public b(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    GMTrace.i(4791975542784L, 35703);
    this.chatroomName = paramString;
    at.AR();
    paramMMBaseSelectContactUI = c.yT().gG(this.chatroomName);
    if (paramMMBaseSelectContactUI != null) {
      this.hqW = bg.cb(paramMMBaseSelectContactUI);
    }
    GMTrace.o(4791975542784L, 35703);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(4792109760512L, 35704);
    w.i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.eQb = paramString;
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    if ((!bg.nm(this.eQb)) && (this.hqW != null))
    {
      at.AR();
      this.hqX = c.yK().a(this.hqW, "@all.chatroom", this.eQb, null, null);
    }
    notifyDataSetChanged();
    bg(paramString, true);
    GMTrace.o(4792109760512L, 35704);
  }
  
  public final void finish()
  {
    GMTrace.i(4792378195968L, 35706);
    super.finish();
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    GMTrace.o(4792378195968L, 35706);
  }
  
  public final int getCount()
  {
    GMTrace.i(4792512413696L, 35707);
    if (this.hqX == null)
    {
      GMTrace.o(4792512413696L, 35707);
      return 0;
    }
    int i = this.hqX.getCount();
    GMTrace.o(4792512413696L, 35707);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(4792243978240L, 35705);
    com.tencent.mm.plugin.multitalk.ui.widget.a locala = null;
    if (this.hqX.moveToPosition(paramInt))
    {
      x localx = new x();
      localx.b(this.hqX);
      locala = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
      locala.iBi = localx;
      locala.wSC = bhh();
      locala.eQb = this.eQb;
    }
    GMTrace.o(4792243978240L, 35705);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */