package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.selectcontact.a.g;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.b;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.g;
import java.util.List;

public final class t
  extends o
  implements m.b
{
  private Cursor hqX;
  private int ooT;
  private List<String> wTD;
  private int wTE;
  private boolean wTF;
  private int wTG;
  
  public t(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList)
  {
    this(paramMMBaseSelectContactUI, paramList, true, false, false, 0);
    GMTrace.i(1812744634368L, 13506);
    GMTrace.o(1812744634368L, 13506);
  }
  
  public t(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean1, paramBoolean2);
    GMTrace.i(1812878852096L, 13507);
    this.wTG = 0;
    w.i("MicroMsg.RecentConversationAdapter", "create!");
    this.wTF = paramBoolean3;
    this.wTG = paramInt;
    ayE();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(this);
    GMTrace.o(1812878852096L, 13507);
  }
  
  private void ayE()
  {
    int j = 0;
    GMTrace.i(1813013069824L, 13508);
    w.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    if (s.ew(this.wTG, 4))
    {
      this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(com.tencent.mm.y.s.gmA, this.iVA, this.wSS, "");
      if (!this.wTF) {
        break label228;
      }
    }
    label228:
    for (int i = 2;; i = 0)
    {
      if (this.wTD != null) {
        j = this.wTD.size();
      }
      this.wTE = j;
      this.ooT = (i + this.wTE);
      clearCache();
      GMTrace.o(1813013069824L, 13508);
      return;
      if (s.ew(this.wTG, 16))
      {
        this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(com.tencent.mm.y.s.gmC, this.iVA, this.wSS, "");
        break;
      }
      this.hqX = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(com.tencent.mm.y.s.gmw, this.iVA, this.wSS, "");
      break;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(1813549940736L, 13512);
    ayE();
    notifyDataSetChanged();
    GMTrace.o(1813549940736L, 13512);
  }
  
  public final void finish()
  {
    GMTrace.i(1813415723008L, 13511);
    super.finish();
    w.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(this);
    GMTrace.o(1813415723008L, 13511);
  }
  
  public final int getCount()
  {
    GMTrace.i(1813147287552L, 13509);
    int i = this.hqX.getCount();
    int j = this.ooT;
    GMTrace.o(1813147287552L, 13509);
    return i + j + 1;
  }
  
  protected final a hG(int paramInt)
  {
    ae localae = null;
    GMTrace.i(1813281505280L, 13510);
    Object localObject;
    if (this.ooT > this.wTE) {
      if (paramInt == this.wTE)
      {
        localObject = new g(paramInt);
        ((g)localObject).lAh = this.wSB.getActivity().getResources().getString(a.h.oFM);
      }
    }
    for (;;)
    {
      if (paramInt == this.ooT)
      {
        localObject = new g(paramInt);
        ((g)localObject).lAh = this.wSB.getActivity().getResources().getString(a.h.oFH);
      }
      for (;;)
      {
        GMTrace.o(1813281505280L, 13510);
        return (a)localObject;
        if (paramInt != this.wTE + 1) {
          break label386;
        }
        localObject = new b(paramInt);
        String str = this.wSB.getActivity().getResources().getString(a.h.oFM);
        ((b)localObject).qPV = a.g.kbO;
        ((b)localObject).aDn = str;
        break;
        if (paramInt < this.wTE)
        {
          localObject = localae;
          if (this.wTD != null)
          {
            localObject = localae;
            if (paramInt >= 0)
            {
              localObject = localae;
              if (paramInt < this.wTD.size())
              {
                localObject = new b(paramInt);
                ((b)localObject).username = ((String)this.wTD.get(paramInt));
              }
            }
          }
        }
        else if ((paramInt > this.ooT) && (this.hqX.moveToPosition(paramInt - this.ooT - 1)))
        {
          localObject = new e(paramInt);
          localae = new ae();
          localae.b(this.hqX);
          com.tencent.mm.kernel.h.xz();
          ((a)localObject).iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(localae.field_username);
          if (((a)localObject).iBi == null)
          {
            com.tencent.mm.kernel.h.xz();
            ((a)localObject).iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(localae.field_username);
          }
          ((a)localObject).wSC = bhh();
        }
        else
        {
          w.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
      label386:
      localObject = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */