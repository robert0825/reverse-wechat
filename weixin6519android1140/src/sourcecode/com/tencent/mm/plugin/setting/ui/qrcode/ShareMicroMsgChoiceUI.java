package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class ShareMicroMsgChoiceUI
  extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f htU;
  
  public ShareMicroMsgChoiceUI()
  {
    GMTrace.i(4729832734720L, 35240);
    GMTrace.o(4729832734720L, 35240);
  }
  
  protected final void MP()
  {
    GMTrace.i(4730503823360L, 35245);
    oM(R.l.dXB);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4728893210624L, 35233);
        ShareMicroMsgChoiceUI.this.aLo();
        ShareMicroMsgChoiceUI.this.finish();
        GMTrace.o(4728893210624L, 35233);
        return true;
      }
    });
    ((IconPreference)this.htU.VG("share_micromsg_to_sina")).drawable = a.b(this, R.g.bal);
    at.AR();
    c.yS().CB("@t.qq.com");
    at.AR();
    int i;
    IconPreference localIconPreference;
    if (bg.e((Integer)c.xh().get(9, null)) != 0)
    {
      i = 1;
      localIconPreference = (IconPreference)this.htU.VG("share_micromsg_qzone");
      if (i != 0) {
        break label174;
      }
      this.htU.c(localIconPreference);
    }
    for (;;)
    {
      localIconPreference = (IconPreference)this.htU.VG("share_micromsg_to_fuckbook");
      if (!q.Ad()) {
        break label188;
      }
      localIconPreference.drawable = a.b(this, R.g.bak);
      GMTrace.o(4730503823360L, 35245);
      return;
      i = 0;
      break;
      label174:
      localIconPreference.drawable = a.b(this, R.g.aZP);
    }
    label188:
    this.htU.c(localIconPreference);
    GMTrace.o(4730503823360L, 35245);
  }
  
  protected final boolean QH()
  {
    GMTrace.i(4729966952448L, 35241);
    GMTrace.o(4729966952448L, 35241);
    return false;
  }
  
  public final int QI()
  {
    GMTrace.i(4730369605632L, 35244);
    int i = R.o.epD;
    GMTrace.o(4730369605632L, 35244);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(4730638041088L, 35246);
    paramf = paramPreference.hiu;
    if (paramf.equals("share_micromsg_qzone"))
    {
      at.AR();
      if (bg.e((Integer)c.xh().get(9, null)) != 0)
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 2);
        startActivity(paramf);
      }
    }
    for (;;)
    {
      GMTrace.o(4730638041088L, 35246);
      return false;
      h.h(this, R.l.dXl, R.l.cUG);
      continue;
      if (paramf.equals("share_micromsg_to_sina"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 3);
        startActivity(paramf);
      }
      else if (paramf.equals("share_micromsg_to_fuckbook"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 4);
        startActivity(paramf);
      }
    }
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(4730101170176L, 35242);
    int i = R.i.cGx;
    GMTrace.o(4730101170176L, 35242);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4730235387904L, 35243);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4730235387904L, 35243);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\qrcode\ShareMicroMsgChoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */