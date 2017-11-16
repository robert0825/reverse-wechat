package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.c;
import com.tencent.mm.af.a.j;
import com.tencent.mm.api.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class p
  extends q
{
  private String eQb;
  private ae handler;
  private Cursor hqX;
  private String juZ;
  private m.a wSA;
  private List<String> wST;
  
  public p(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, 0);
    GMTrace.i(1840527704064L, 13713);
    this.handler = new ae(Looper.getMainLooper());
    this.wST = null;
    this.juZ = paramString;
    w.i("MicroMsg.MMSearchContactAdapter", "Create!");
    PY();
    GMTrace.o(1840527704064L, 13713);
  }
  
  private void PY()
  {
    GMTrace.i(1840930357248L, 13716);
    w.i("MicroMsg.MMSearchContactAdapter", "initData!");
    this.eQb = null;
    clearCache();
    GMTrace.o(1840930357248L, 13716);
  }
  
  public final void a(m.a parama)
  {
    GMTrace.i(1840661921792L, 13714);
    this.wSA = parama;
    GMTrace.o(1840661921792L, 13714);
  }
  
  public final void bg(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1840796139520L, 13715);
    if (this.wSA != null) {
      this.wSA.r(paramString, getCount(), paramBoolean);
    }
    GMTrace.o(1840796139520L, 13715);
  }
  
  protected final boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1841467228160L, 13720);
    GMTrace.o(1841467228160L, 13720);
    return true;
  }
  
  public final void finish()
  {
    GMTrace.i(1841333010432L, 13719);
    super.finish();
    w.i("MicroMsg.MMSearchContactAdapter", "finish!");
    PY();
    GMTrace.o(1841333010432L, 13719);
  }
  
  public final int getCount()
  {
    GMTrace.i(1841064574976L, 13717);
    if (this.hqX == null)
    {
      GMTrace.o(1841064574976L, 13717);
      return 0;
    }
    int i = this.hqX.getCount();
    GMTrace.o(1841064574976L, 13717);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(1841198792704L, 13718);
    com.tencent.mm.ui.bizchat.a locala = null;
    c localc;
    if ((paramInt >= 0) && (this.hqX.moveToPosition(paramInt)))
    {
      locala = new com.tencent.mm.ui.bizchat.a(paramInt);
      localc = new c();
      localc.b(this.hqX);
      if (locala.juT == -1L)
      {
        locala.juT = localc.field_bizChatLocalId;
        if (!localc.FU()) {
          break label164;
        }
        locala.hqB = localc.field_chatName;
        locala.woF = localc.field_headImageUrl;
        locala.username = localc.field_brandUserName;
        if (bg.L(locala.hqB)) {
          locala.hqB = this.wSB.getActivity().getResources().getString(a.h.oFN);
        }
        if (bg.nm(locala.username)) {
          locala.username = localc.field_brandUserName;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(1841198792704L, 13718);
      return locala;
      label164:
      j localj = ((g)h.h(g.class)).bl(localc.field_bizChatServId);
      if (localj == null) {
        break;
      }
      locala.hqB = localj.field_userName;
      locala.woF = localj.field_headImageUrl;
      locala.username = localj.field_brandUserName;
      break;
      w.e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */