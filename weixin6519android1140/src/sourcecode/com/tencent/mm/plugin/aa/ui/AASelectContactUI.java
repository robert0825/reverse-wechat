package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AASelectContactUI
  extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> hqL;
  private HashSet<String> hqM;
  private long hqN;
  private int hqO;
  private CheckBox hqP;
  private View hqQ;
  private String title;
  
  public AASelectContactUI()
  {
    GMTrace.i(5639694712832L, 42019);
    GMTrace.o(5639694712832L, 42019);
  }
  
  private void Qe()
  {
    GMTrace.i(5641305325568L, 42031);
    if (this.hqM.size() > 0) {
      aH(1, getString(a.i.sRi, new Object[] { Integer.valueOf(this.hqM.size()) }));
    }
    while ((this.hqM.size() == 1) && (this.hqM.contains(q.zE())))
    {
      Y(1, false);
      GMTrace.o(5641305325568L, 42031);
      return;
      aH(1, getString(a.i.cTM));
    }
    Y(1, true);
    GMTrace.o(5641305325568L, 42031);
  }
  
  protected final void MP()
  {
    GMTrace.i(5639963148288L, 42021);
    super.MP();
    a(1, getString(a.i.cTM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5627078246400L, 41925);
        if (AASelectContactUI.b(AASelectContactUI.this).size() > AASelectContactUI.d(AASelectContactUI.this))
        {
          com.tencent.mm.ui.base.h.b(AASelectContactUI.this.vKB.vKW, AASelectContactUI.this.getString(a.i.sTM, new Object[] { Long.valueOf(AASelectContactUI.d(AASelectContactUI.this)) }), "", true);
          g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(8) });
          g.ork.i(13722, new Object[] { Integer.valueOf(3) });
          GMTrace.o(5627078246400L, 41925);
          return true;
        }
        if (AASelectContactUI.b(AASelectContactUI.this).size() <= 0)
        {
          com.tencent.mm.ui.base.h.b(AASelectContactUI.this.vKB.vKW, AASelectContactUI.this.getString(a.i.sRE, new Object[] { Integer.valueOf(1) }), "", true);
          g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(9) });
          GMTrace.o(5627078246400L, 41925);
          return true;
        }
        paramAnonymousMenuItem = new LinkedList();
        paramAnonymousMenuItem.addAll(AASelectContactUI.b(AASelectContactUI.this));
        paramAnonymousMenuItem = bg.c(paramAnonymousMenuItem, ",");
        AASelectContactUI.this.setResult(-1, AASelectContactUI.this.getIntent().putExtra("Select_Contact", paramAnonymousMenuItem));
        AASelectContactUI.this.finish();
        AASelectContactUI.this.aLo();
        g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(8) });
        GMTrace.o(5627078246400L, 41925);
        return true;
      }
    }, p.b.vLG);
    Qe();
    this.mUn.ttY = this;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5650834784256L, 42102);
        if ((AASelectContactUI.b(AASelectContactUI.this) != null) && (AASelectContactUI.b(AASelectContactUI.this).size() > 0) && (AASelectContactUI.b(AASelectContactUI.this).size() <= AASelectContactUI.d(AASelectContactUI.this)) && ((AASelectContactUI.b(AASelectContactUI.this).size() != 1) || (!AASelectContactUI.b(AASelectContactUI.this).contains(q.zE())))) {
          com.tencent.mm.ui.base.h.a(AASelectContactUI.this, AASelectContactUI.this.getString(a.i.sRA), null, AASelectContactUI.this.getString(a.i.sRD), AASelectContactUI.this.getString(a.i.sRC), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5639023624192L, 42014);
              if (AASelectContactUI.b(AASelectContactUI.this).size() > AASelectContactUI.d(AASelectContactUI.this))
              {
                com.tencent.mm.ui.base.h.b(AASelectContactUI.this.vKB.vKW, AASelectContactUI.this.getString(a.i.sTM, new Object[] { Long.valueOf(AASelectContactUI.d(AASelectContactUI.this)) }), "", true);
                g.ork.i(13722, new Object[] { Integer.valueOf(3) });
                GMTrace.o(5639023624192L, 42014);
                return;
              }
              paramAnonymous2DialogInterface = new LinkedList();
              paramAnonymous2DialogInterface.addAll(AASelectContactUI.b(AASelectContactUI.this));
              paramAnonymous2DialogInterface = bg.c(paramAnonymous2DialogInterface, ",");
              AASelectContactUI.this.setResult(-1, AASelectContactUI.this.getIntent().putExtra("Select_Contact", paramAnonymous2DialogInterface));
              AASelectContactUI.this.finish();
              g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(11) });
              GMTrace.o(5639023624192L, 42014);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5633789132800L, 41975);
              AASelectContactUI.this.finish();
              g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(10) });
              GMTrace.o(5633789132800L, 41975);
            }
          });
        }
        for (;;)
        {
          g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(7) });
          GMTrace.o(5650834784256L, 42102);
          return true;
          AASelectContactUI.this.finish();
        }
      }
    });
    GMTrace.o(5639963148288L, 42021);
  }
  
  protected final void PY()
  {
    GMTrace.i(5639828930560L, 42020);
    super.PY();
    this.title = getIntent().getStringExtra("titile");
    this.hqN = getIntent().getLongExtra("max_select_num", 20L);
    this.hqO = getIntent().getIntExtra("select_type", 1);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!s.eb(this.chatroomName)) {
      w.i("MicroMsg.AASelectContactUI", "is single chat");
    }
    this.hqM = new HashSet();
    this.hqL = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bg.nm(str)) {
      this.hqL.addAll(Arrays.asList(str.split(",")));
    }
    str = getIntent().getStringExtra("already_select_contact");
    if (!bg.nm(str))
    {
      this.hqM.addAll(bg.g(str.split(",")));
      Qe();
    }
    this.hqP = ((CheckBox)findViewById(a.f.sHS));
    this.hqQ = findViewById(a.f.sHT);
    this.hqQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(5632983826432L, 41969);
        if (AASelectContactUI.a(AASelectContactUI.this).isChecked()) {
          if (AASelectContactUI.b(AASelectContactUI.this) != null)
          {
            AASelectContactUI.b(AASelectContactUI.this).clear();
            AASelectContactUI.a(AASelectContactUI.this).setChecked(false);
            AASelectContactUI.this.cgy().notifyDataSetChanged();
          }
        }
        for (;;)
        {
          g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(6) });
          GMTrace.o(5632983826432L, 41969);
          return;
          AASelectContactUI.a(AASelectContactUI.this, new HashSet());
          break;
          paramAnonymousView = com.tencent.mm.plugin.aa.a.h.ns(AASelectContactUI.c(AASelectContactUI.this));
          if (paramAnonymousView.size() > AASelectContactUI.d(AASelectContactUI.this)) {
            com.tencent.mm.ui.base.h.a(AASelectContactUI.this.vKB.vKW, AASelectContactUI.this.getString(a.i.sRB, new Object[] { Long.valueOf(AASelectContactUI.d(AASelectContactUI.this)) }), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(5651371655168L, 42106);
                AASelectContactUI.a(AASelectContactUI.this, paramAnonymousView);
                GMTrace.o(5651371655168L, 42106);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(5636339269632L, 41994);
                GMTrace.o(5636339269632L, 41994);
              }
            });
          } else {
            AASelectContactUI.a(AASelectContactUI.this, paramAnonymousView);
          }
        }
      }
    });
    if (this.hqM.size() == com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName).size()) {
      this.hqP.setChecked(true);
    }
    for (;;)
    {
      this.hqP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(5620233142272L, 41874);
          AASelectContactUI.e(AASelectContactUI.this);
          GMTrace.o(5620233142272L, 41874);
        }
      });
      GMTrace.o(5639828930560L, 42020);
      return;
      this.hqP.setChecked(false);
    }
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(5640231583744L, 42023);
    GMTrace.o(5640231583744L, 42023);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(5640365801472L, 42024);
    GMTrace.o(5640365801472L, 42024);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(5640500019200L, 42025);
    String str = this.title;
    GMTrace.o(5640500019200L, 42025);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(5640634236928L, 42026);
    d locald = new d(this, this.chatroomName);
    GMTrace.o(5640634236928L, 42026);
    return locald;
  }
  
  protected final m Qd()
  {
    GMTrace.i(5640768454656L, 42027);
    e locale = new e(this, this.chatroomName);
    GMTrace.o(5640768454656L, 42027);
    return locale;
  }
  
  protected final int Qf()
  {
    GMTrace.i(5641439543296L, 42032);
    GMTrace.o(5641439543296L, 42032);
    return 1;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(5641036890112L, 42029);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqM.contains(parama.iBi.field_username);
      GMTrace.o(5641036890112L, 42029);
      return bool;
    }
    GMTrace.o(5641036890112L, 42029);
    return false;
  }
  
  public final boolean b(a parama)
  {
    GMTrace.i(5641171107840L, 42030);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqL.contains(parama.iBi.field_username);
      GMTrace.o(5641171107840L, 42030);
      return bool;
    }
    GMTrace.o(5641171107840L, 42030);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5641707978752L, 42034);
    int i = a.g.sLz;
    GMTrace.o(5641707978752L, 42034);
    return i;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(5640902672384L, 42028);
    n localn = cgy();
    Object localObject = localn.DC(paramInt - this.nVC.getHeaderViewsCount());
    if (localObject == null)
    {
      GMTrace.o(5640902672384L, 42028);
      return;
    }
    if (((a)localObject).iBi == null)
    {
      GMTrace.o(5640902672384L, 42028);
      return;
    }
    w.i("MicroMsg.AASelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).iBi.field_username });
    localObject = ((a)localObject).iBi.field_username;
    if (((String)localObject).equals(q.zE()))
    {
      g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(4) });
      cgE();
      if (!this.hqM.contains(localObject)) {
        break label228;
      }
      this.hqM.remove(localObject);
      label150:
      if (this.hqM.size() != com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName).size()) {
        break label240;
      }
      this.hqP.setChecked(true);
    }
    for (;;)
    {
      localn.notifyDataSetChanged();
      Qe();
      GMTrace.o(5640902672384L, 42028);
      return;
      g.ork.i(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(5) });
      break;
      label228:
      this.hqM.add(localObject);
      break label150;
      label240:
      this.hqP.setChecked(false);
    }
  }
  
  public final void nw(String paramString)
  {
    GMTrace.i(5641573761024L, 42033);
    this.hqM.remove(paramString);
    cgy().notifyDataSetChanged();
    GMTrace.o(5641573761024L, 42033);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5640097366016L, 42022);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bg.nm(paramBundle)) {
      this.hqL.addAll(bg.g(paramBundle.split(",")));
    }
    GMTrace.o(5640097366016L, 42022);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\AASelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */