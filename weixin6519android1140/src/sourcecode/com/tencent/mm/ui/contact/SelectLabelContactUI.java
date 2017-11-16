package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.HashSet;

public class SelectLabelContactUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> hqM;
  private int jRc;
  private String label;
  private HashSet<String> wTQ;
  
  public SelectLabelContactUI()
  {
    GMTrace.i(1716510523392L, 12789);
    GMTrace.o(1716510523392L, 12789);
  }
  
  private void Qe()
  {
    GMTrace.i(1717047394304L, 12793);
    if ((s.ew(this.jRc, 64)) && (this.hqM.size() > 0))
    {
      aH(1, getString(R.l.cTM) + "(" + this.hqM.size() + ")");
      Y(1, true);
      GMTrace.o(1717047394304L, 12793);
      return;
    }
    aH(1, getString(R.l.cTM));
    Y(1, false);
    GMTrace.o(1717047394304L, 12793);
  }
  
  private void WA(String paramString)
  {
    GMTrace.i(1717181612032L, 12794);
    if (s.ew(this.jRc, 16384))
    {
      localIntent = new Intent();
      localIntent.putExtra("Select_Contact", paramString);
      setResult(-1, localIntent);
      finish();
      GMTrace.o(1717181612032L, 12794);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this, En_5b8fbb1e.class);
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", true);
    startActivity(localIntent);
    finish();
    GMTrace.o(1717181612032L, 12794);
  }
  
  protected final void PY()
  {
    GMTrace.i(1716644741120L, 12790);
    super.PY();
    this.label = getIntent().getStringExtra("label");
    this.jRc = getIntent().getIntExtra("list_attr", 0);
    this.hqM = new HashSet();
    this.wTQ = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bg.nm(str)) {
      this.wTQ.addAll(bg.g(str.split(",")));
    }
    str = getIntent().getStringExtra("already_select_contact");
    if (!bg.nm(str)) {
      this.hqM.addAll(bg.g(str.split(",")));
    }
    GMTrace.o(1716644741120L, 12790);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(1717315829760L, 12795);
    GMTrace.o(1717315829760L, 12795);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(1717450047488L, 12796);
    GMTrace.o(1717450047488L, 12796);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(1717584265216L, 12797);
    String str = this.label;
    GMTrace.o(1717584265216L, 12797);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(1717718482944L, 12798);
    Object localObject = com.tencent.mm.plugin.label.a.a.aJP().AV(this.label);
    localObject = new h(this, s.ew(this.jRc, 64), com.tencent.mm.plugin.label.a.a.aJP().AY((String)localObject));
    GMTrace.o(1717718482944L, 12798);
    return (o)localObject;
  }
  
  protected final m Qd()
  {
    GMTrace.i(1717852700672L, 12799);
    GMTrace.o(1717852700672L, 12799);
    return null;
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1717986918400L, 12800);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqM.contains(parama.iBi.field_username);
      GMTrace.o(1717986918400L, 12800);
      return bool;
    }
    GMTrace.o(1717986918400L, 12800);
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1718121136128L, 12801);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.wTQ.contains(parama.iBi.field_username);
      GMTrace.o(1718121136128L, 12801);
      return bool;
    }
    GMTrace.o(1718121136128L, 12801);
    return false;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(1716913176576L, 12792);
    int i = this.nVC.getHeaderViewsCount();
    n localn = cgy();
    Object localObject = localn.DC(paramInt - i);
    if (localObject == null)
    {
      GMTrace.o(1716913176576L, 12792);
      return;
    }
    if (((com.tencent.mm.ui.contact.a.a)localObject).iBi == null)
    {
      GMTrace.o(1716913176576L, 12792);
      return;
    }
    localObject = ((com.tencent.mm.ui.contact.a.a)localObject).iBi.field_username;
    w.i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", new Object[] { localObject });
    if (s.ew(this.jRc, 64))
    {
      if ((!this.wTQ.contains(localObject)) && (!this.hqM.contains(localObject)) && (s.ew(this.jRc, 131072)) && (this.wTQ.size() + this.hqM.size() >= getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)))
      {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dWM, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) }), getString(R.l.cUl), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1736911618048L, 12941);
            GMTrace.o(1736911618048L, 12941);
          }
        });
        GMTrace.o(1716913176576L, 12792);
        return;
      }
      if (!this.wTQ.contains(localObject))
      {
        if (!this.hqM.contains(localObject)) {
          break label290;
        }
        this.hqM.remove(localObject);
      }
      for (;;)
      {
        Qe();
        localn.notifyDataSetChanged();
        GMTrace.o(1716913176576L, 12792);
        return;
        label290:
        this.hqM.add(localObject);
      }
    }
    WA((String)localObject);
    GMTrace.o(1716913176576L, 12792);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1716778958848L, 12791);
    super.onCreate(paramBundle);
    if (s.ew(this.jRc, 64)) {
      a(1, getString(R.l.cTM), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1780666597376L, 13267);
          paramAnonymousMenuItem = new ArrayList(SelectLabelContactUI.a(SelectLabelContactUI.this));
          w.i("MicroMsg.SelectLabelContactUI", "SelectUser: %s", new Object[] { paramAnonymousMenuItem.toString() });
          SelectLabelContactUI.a(SelectLabelContactUI.this, bg.c(paramAnonymousMenuItem, ","));
          GMTrace.o(1780666597376L, 13267);
          return true;
        }
      }, p.b.vLG);
    }
    Qe();
    GMTrace.o(1716778958848L, 12791);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\SelectLabelContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */