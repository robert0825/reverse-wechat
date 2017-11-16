package com.tencent.mm.plugin.multitalk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.multitalk.a.e;
import com.tencent.mm.plugin.multitalk.a.i;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkSelectContactUI
  extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> hqL;
  private HashSet<String> hqM;
  private c nmF;
  private boolean nnV;
  private com.tencent.mm.plugin.multitalk.ui.widget.d nnW;
  private boolean nnX;
  
  public MultiTalkSelectContactUI()
  {
    GMTrace.i(4788620099584L, 35678);
    this.nnX = false;
    this.nmF = new c() {};
    GMTrace.o(4788620099584L, 35678);
  }
  
  private void Qe()
  {
    GMTrace.i(4790633365504L, 35693);
    if (this.hqM.size() > 0)
    {
      Y(1, true);
      GMTrace.o(4790633365504L, 35693);
      return;
    }
    Y(1, false);
    GMTrace.o(4790633365504L, 35693);
  }
  
  protected void MP()
  {
    GMTrace.i(4788888535040L, 35680);
    super.MP();
    this.nnW = new com.tencent.mm.plugin.multitalk.ui.widget.d(this);
    if (this.nnV) {
      this.nnW.setVisible(true);
    }
    for (;;)
    {
      int i = R.l.cTM;
      if (this.nnV) {
        i = R.l.dKg;
      }
      a(1, getString(i), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4792780849152L, 35709);
          if (!am.isNetworkConnected(ab.getContext())) {
            com.tencent.mm.as.a.a(MultiTalkSelectContactUI.this, R.l.eiM, null);
          }
          for (;;)
          {
            MultiTalkSelectContactUI.this.aLo();
            GMTrace.o(4792780849152L, 35709);
            return true;
            paramAnonymousMenuItem = new LinkedList();
            paramAnonymousMenuItem.addAll(MultiTalkSelectContactUI.a(MultiTalkSelectContactUI.this));
            paramAnonymousMenuItem.add(q.zE());
            paramAnonymousMenuItem = bg.c(paramAnonymousMenuItem, ",");
            if (MultiTalkSelectContactUI.b(MultiTalkSelectContactUI.this))
            {
              com.tencent.mm.plugin.multitalk.a.d.a(MultiTalkSelectContactUI.a(MultiTalkSelectContactUI.this).size(), MultiTalkSelectContactUI.c(MultiTalkSelectContactUI.this), 1, "", MultiTalkSelectContactUI.d(MultiTalkSelectContactUI.this).noC);
              com.tencent.mm.plugin.multitalk.a.o.aRR().a(MultiTalkSelectContactUI.this, paramAnonymousMenuItem, MultiTalkSelectContactUI.e(MultiTalkSelectContactUI.this));
            }
            else
            {
              com.tencent.mm.plugin.multitalk.a.d.a(MultiTalkSelectContactUI.a(MultiTalkSelectContactUI.this).size(), MultiTalkSelectContactUI.c(MultiTalkSelectContactUI.this), 2, i.aRH(), 0);
              MultiTalkSelectContactUI.this.setResult(-1, MultiTalkSelectContactUI.this.getIntent().putExtra("Select_Contact", paramAnonymousMenuItem));
              MultiTalkSelectContactUI.this.finish();
            }
          }
        }
      }, p.b.vLG);
      Qe();
      this.mUn.setBackgroundResource(R.e.aOw);
      this.mUn.ttU.setTextColor(-1);
      GMTrace.o(4788888535040L, 35680);
      return;
      this.nnW.setVisible(false);
    }
  }
  
  protected final void PY()
  {
    GMTrace.i(4788754317312L, 35679);
    super.PY();
    this.nnV = getIntent().getBooleanExtra("key_need_gallery", false);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!s.eb(this.chatroomName)) {
      finish();
    }
    this.hqM = new HashSet();
    this.hqL = new HashSet();
    GMTrace.o(4788754317312L, 35679);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(4789425405952L, 35684);
    GMTrace.o(4789425405952L, 35684);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(4789559623680L, 35685);
    GMTrace.o(4789559623680L, 35685);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(4789693841408L, 35686);
    String str = getIntent().getStringExtra("titile");
    GMTrace.o(4789693841408L, 35686);
    return str;
  }
  
  protected final com.tencent.mm.ui.contact.o Qc()
  {
    GMTrace.i(4789828059136L, 35687);
    a locala = new a(this, this.chatroomName);
    GMTrace.o(4789828059136L, 35687);
    return locala;
  }
  
  protected final m Qd()
  {
    GMTrace.i(4789962276864L, 35688);
    b localb = new b(this, this.chatroomName);
    GMTrace.o(4789962276864L, 35688);
    return localb;
  }
  
  protected final int Qf()
  {
    GMTrace.i(4790767583232L, 35694);
    GMTrace.o(4790767583232L, 35694);
    return 1;
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(4790364930048L, 35691);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqM.contains(parama.iBi.field_username);
      GMTrace.o(4790364930048L, 35691);
      return bool;
    }
    GMTrace.o(4790364930048L, 35691);
    return false;
  }
  
  protected final void aMX()
  {
    GMTrace.i(4790230712320L, 35690);
    super.aMX();
    aLo();
    GMTrace.o(4790230712320L, 35690);
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(4790499147776L, 35692);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqL.contains(parama.iBi.field_username);
      GMTrace.o(4790499147776L, 35692);
      return bool;
    }
    GMTrace.o(4790499147776L, 35692);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4789291188224L, 35683);
    int i = R.i.cCF;
    GMTrace.o(4789291188224L, 35683);
    return i;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(4790096494592L, 35689);
    n localn = cgy();
    Object localObject = localn.DC(paramInt - this.nVC.getHeaderViewsCount());
    if (localObject == null)
    {
      GMTrace.o(4790096494592L, 35689);
      return;
    }
    if (((com.tencent.mm.ui.contact.a.a)localObject).iBi == null)
    {
      GMTrace.o(4790096494592L, 35689);
      return;
    }
    w.i("MicroMsg.multitalk.MultiTalkSelectContactUI", "ClickUser=%s", new Object[] { ((com.tencent.mm.ui.contact.a.a)localObject).iBi.field_username });
    localObject = ((com.tencent.mm.ui.contact.a.a)localObject).iBi.field_username;
    if (q.zE().equals(localObject))
    {
      GMTrace.o(4790096494592L, 35689);
      return;
    }
    cgE();
    com.tencent.mm.plugin.multitalk.ui.widget.d locald;
    int i;
    int j;
    if (this.hqM.contains(localObject)) {
      if (this.nnV)
      {
        locald = this.nnW;
        if (locald.size != 0)
        {
          i = -1;
          paramInt = 0;
          if (paramInt >= locald.nov.getChildCount()) {
            break label500;
          }
          if (!locald.nov.getChildAt(paramInt).getTag().equals(localObject)) {
            break label346;
          }
          j = 1;
        }
      }
    }
    for (;;)
    {
      if (paramInt < 0)
      {
        i = 0;
        label200:
        if (i < locald.now.getChildCount()) {
          if (!locald.now.getChildAt(i).getTag().equals(localObject)) {}
        }
      }
      label297:
      label346:
      int k;
      for (paramInt = 1;; paramInt = k)
      {
        if (i >= 0)
        {
          if (paramInt != 0)
          {
            locald.now.removeViewAt(i);
            locald.size -= 1;
          }
          if (j != 0)
          {
            if (locald.size <= 5)
            {
              locald.nov.removeViewAt(i);
              locald.size -= 1;
            }
          }
          else
          {
            locald.rg(locald.size);
            locald.rh(locald.size);
          }
        }
        else
        {
          this.hqM.remove(localObject);
        }
        for (;;)
        {
          localn.notifyDataSetChanged();
          Qe();
          GMTrace.o(4790096494592L, 35689);
          return;
          paramInt += 1;
          break;
          i += 1;
          break label200;
          locald.nov.removeViewAt(i);
          View localView = locald.now.getChildAt(0);
          locald.now.removeViewAt(0);
          locald.nov.addView(localView);
          locald.size -= 1;
          break label297;
          if (this.hqL.size() + this.hqM.size() == 9)
          {
            this.nnX = true;
            Toast.makeText(this, R.l.dKd, 0).show();
            GMTrace.o(4790096494592L, 35689);
            return;
          }
          if (this.nnV) {
            this.nnW.Dg((String)localObject);
          }
          this.hqM.add(localObject);
        }
        k = 0;
        i = paramInt;
      }
      label500:
      j = 0;
      paramInt = i;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4789022752768L, 35681);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bg.nm(paramBundle)) {
      this.hqL.addAll(bg.g(paramBundle.split(",")));
    }
    this.hqL.add(q.zE());
    if (this.nnV) {
      this.nnW.Dg(q.zE());
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.nmF);
    GMTrace.o(4789022752768L, 35681);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4789156970496L, 35682);
    com.tencent.mm.sdk.b.a.vgX.c(this.nmF);
    super.onDestroy();
    GMTrace.o(4789156970496L, 35682);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\MultiTalkSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */