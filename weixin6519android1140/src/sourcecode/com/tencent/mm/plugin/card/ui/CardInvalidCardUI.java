package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.ui.base.h;

public class CardInvalidCardUI
  extends CardBaseUI
{
  public CardInvalidCardUI()
  {
    GMTrace.i(4971156209664L, 37038);
    GMTrace.o(4971156209664L, 37038);
  }
  
  protected final void MP()
  {
    GMTrace.i(15360413663232L, 114444);
    super.MP();
    GMTrace.o(15360413663232L, 114444);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4971961516032L, 37044);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof r)))
    {
      if (!this.jwy) {
        break label69;
      }
      h.bm(this, getResources().getString(R.l.dcl));
    }
    for (;;)
    {
      this.jwy = false;
      GMTrace.o(4971961516032L, 37044);
      return;
      label69:
      h.bm(this, getResources().getString(R.l.dcv));
    }
  }
  
  protected final void aiM()
  {
    GMTrace.i(4971693080576L, 37042);
    oM(R.l.dcO);
    a(0, getString(R.l.dcj), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5017863979008L, 37386);
        CardInvalidCardUI.a(CardInvalidCardUI.this);
        GMTrace.o(5017863979008L, 37386);
        return true;
      }
    });
    if (this.jwu.getCount() > 0)
    {
      lf(true);
      GMTrace.o(4971693080576L, 37042);
      return;
    }
    lf(false);
    GMTrace.o(4971693080576L, 37042);
  }
  
  protected final int aiN()
  {
    GMTrace.i(4971558862848L, 37041);
    int i = n.a.jzA;
    GMTrace.o(4971558862848L, 37041);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4971827298304L, 37043);
    int i = R.i.crd;
    GMTrace.o(4971827298304L, 37043);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4971290427392L, 37039);
    super.onCreate(paramBundle);
    super.MP();
    GMTrace.o(4971290427392L, 37039);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardInvalidCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */