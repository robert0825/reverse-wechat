package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.v;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SnsAddressUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> hqM;
  private List<String> iVA;
  
  public SnsAddressUI()
  {
    GMTrace.i(1789927620608L, 13336);
    GMTrace.o(1789927620608L, 13336);
  }
  
  private void Qe()
  {
    GMTrace.i(1791135580160L, 13345);
    String str;
    if (this.hqM.size() == 0)
    {
      str = String.format("%s", new Object[] { getString(R.l.cTM) });
      aH(1, str);
      if (this.hqM.size() < 0) {
        break label118;
      }
    }
    label118:
    for (boolean bool = true;; bool = false)
    {
      Y(1, bool);
      GMTrace.o(1791135580160L, 13345);
      return;
      str = String.format("%s(%d/%d)", new Object[] { getString(R.l.cTM), Integer.valueOf(this.hqM.size()), Integer.valueOf(v.vpA) });
      break;
    }
  }
  
  protected final void BT(String paramString)
  {
    GMTrace.i(1791538233344L, 13348);
    Intent localIntent = new Intent();
    localIntent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
    localIntent.putExtra("label", paramString);
    paramString = new HashSet();
    paramString.addAll(this.hqM);
    localIntent.putExtra("always_select_contact", bg.c(new ArrayList(paramString), ","));
    localIntent.putExtra("list_attr", s.q(new int[] { 16384, 64 }));
    startActivityForResult(localIntent, 3);
    GMTrace.o(1791538233344L, 13348);
  }
  
  protected final void PY()
  {
    GMTrace.i(1790061838336L, 13337);
    super.PY();
    this.iVA = new ArrayList();
    Object localObject = bg.g(bg.aq(getIntent().getStringExtra("Block_list"), "").split(","));
    HashSet localHashSet = s.cgI();
    localHashSet.addAll((Collection)localObject);
    this.iVA.addAll(localHashSet);
    this.iVA.addAll(s.cgJ());
    this.hqM = new HashSet();
    localObject = bg.aq(getIntent().getStringExtra("Select_Contact"), "");
    if (!bg.nm((String)localObject)) {
      this.hqM.addAll(bg.g(((String)localObject).split(",")));
    }
    GMTrace.o(1790061838336L, 13337);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(1790464491520L, 13340);
    GMTrace.o(1790464491520L, 13340);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(1790598709248L, 13341);
    GMTrace.o(1790598709248L, 13341);
    return true;
  }
  
  protected final String Qb()
  {
    GMTrace.i(1790732926976L, 13342);
    String str = bg.aq(getIntent().getStringExtra("Add_address_titile"), "");
    GMTrace.o(1790732926976L, 13342);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(1790867144704L, 13343);
    Object localObject = new c.a();
    ((c.a)localObject).wQA = true;
    ((c.a)localObject).wQH = true;
    ((c.a)localObject).wQJ = getString(R.l.cRd);
    ((c.a)localObject).wQI = bg.aq(getIntent().getStringExtra("Add_get_from_sns"), "");
    localObject = new c(this, this.iVA, true, (c.a)localObject);
    GMTrace.o(1790867144704L, 13343);
    return (o)localObject;
  }
  
  protected final m Qd()
  {
    GMTrace.i(1791001362432L, 13344);
    q localq = new q(this, this.iVA, true, this.scene);
    GMTrace.o(1791001362432L, 13344);
    return localq;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(1791672451072L, 13349);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.hqM.contains(parama.iBi.field_username);
      GMTrace.o(1791672451072L, 13349);
      return bool;
    }
    GMTrace.o(1791672451072L, 13349);
    return false;
  }
  
  public final int[] aMW()
  {
    GMTrace.i(1791806668800L, 13350);
    GMTrace.o(1791806668800L, 13350);
    return new int[] { 131072 };
  }
  
  protected final boolean aNZ()
  {
    GMTrace.i(1791404015616L, 13347);
    GMTrace.o(1791404015616L, 13347);
    return true;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(1790330273792L, 13339);
    n localn = cgy();
    Object localObject = localn.DC(paramInt - this.nVC.getHeaderViewsCount());
    if (localObject == null)
    {
      GMTrace.o(1790330273792L, 13339);
      return;
    }
    if (((a)localObject).iBi == null)
    {
      GMTrace.o(1790330273792L, 13339);
      return;
    }
    w.i("MicroMsg.SnsAddressUI", "ClickUser=%s", new Object[] { ((a)localObject).iBi.field_username });
    localObject = ((a)localObject).iBi.field_username;
    cgE();
    if (this.hqM.contains(localObject))
    {
      this.hqM.remove(localObject);
      this.mUn.OY((String)localObject);
    }
    for (;;)
    {
      Qe();
      localn.notifyDataSetChanged();
      GMTrace.o(1790330273792L, 13339);
      return;
      if (this.hqM.size() < v.vpA)
      {
        this.hqM.add(localObject);
        this.mUn.OY((String)localObject);
      }
      else
      {
        Toast.makeText(this, R.l.edn, 0).show();
        w.i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", new Object[] { Integer.valueOf(v.vpA) });
      }
    }
  }
  
  public final void nw(String paramString)
  {
    GMTrace.i(1791940886528L, 13351);
    this.hqM.remove(paramString);
    cgy().notifyDataSetChanged();
    Qe();
    GMTrace.o(1791940886528L, 13351);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(1791269797888L, 13346);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(1791269797888L, 13346);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(1791269797888L, 13346);
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bg.nm(paramIntent))
      {
        w.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
        GMTrace.o(1791269797888L, 13346);
        return;
      }
      w.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
      paramIntent = paramIntent.split(",");
      paramInt2 = paramIntent.length;
      paramInt1 = i;
      while (paramInt1 < paramInt2)
      {
        Object localObject = paramIntent[paramInt1];
        if (this.hqM.add(localObject)) {
          this.mUn.OY((String)localObject);
        }
        paramInt1 += 1;
      }
      Qe();
      cgy().notifyDataSetChanged();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1790196056064L, 13338);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SnsAddressUI", "Create!");
    a(1, getString(R.l.cTM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1739193319424L, 12958);
        paramAnonymousMenuItem = new Intent();
        List localList = bg.g((String[])SnsAddressUI.a(SnsAddressUI.this).toArray(new String[0]));
        if ((localList == null) || (localList.size() == 0)) {
          paramAnonymousMenuItem.putExtra("Select_Contact", "");
        }
        for (;;)
        {
          SnsAddressUI.this.setResult(-1, paramAnonymousMenuItem);
          SnsAddressUI.this.finish();
          com.tencent.mm.sdk.platformtools.af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1830729809920L, 13640);
              if (!SnsAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                SnsAddressUI.this.moveTaskToBack(true);
              }
              GMTrace.o(1830729809920L, 13640);
            }
          }, 100L);
          GMTrace.o(1739193319424L, 12958);
          return true;
          paramAnonymousMenuItem.putExtra("Select_Contact", bg.c(localList, ","));
        }
      }
    }, p.b.vLG);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1844554235904L, 13743);
        SnsAddressUI.this.finish();
        if (!SnsAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
          SnsAddressUI.this.moveTaskToBack(true);
        }
        GMTrace.o(1844554235904L, 13743);
        return true;
      }
    });
    paramBundle = this.hqM.iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      this.mUn.OY(str);
    }
    this.mUn.ttY = new MultiSelectContactView.a()
    {
      public final void nw(String paramAnonymousString)
      {
        GMTrace.i(1760802373632L, 13119);
        if (paramAnonymousString != null)
        {
          SnsAddressUI.a(SnsAddressUI.this).remove(paramAnonymousString);
          SnsAddressUI.b(SnsAddressUI.this);
        }
        GMTrace.o(1760802373632L, 13119);
      }
    };
    Qe();
    GMTrace.o(1790196056064L, 13338);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\SnsAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */