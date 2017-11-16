package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletCardSelectUI
  extends WalletBaseUI
{
  private int qWW;
  private int raX;
  private List<ElementQuery> rlZ;
  private List<ElementQuery> rma;
  private CheckedTextView rmb;
  private CheckedTextView rmc;
  private String rmd;
  private int rme;
  private int rmf;
  private int rmg;
  private a rmh;
  private MaxListView rmi;
  
  public WalletCardSelectUI()
  {
    GMTrace.i(6942277763072L, 51724);
    this.rlZ = new LinkedList();
    this.rma = new LinkedList();
    this.raX = 3;
    this.rmf = -1;
    this.rmg = -1;
    this.qWW = -1;
    GMTrace.o(6942277763072L, 51724);
  }
  
  private void iW(boolean paramBoolean)
  {
    GMTrace.i(6942680416256L, 51727);
    this.rmi.setVisibility(0);
    if (paramBoolean)
    {
      this.rmb.setChecked(true);
      this.rmc.setChecked(false);
      this.rmh.gpU = this.rlZ;
      this.rmh.notifyDataSetChanged();
      this.rmi.clearChoices();
      if (this.rmf >= 0)
      {
        this.rmi.setItemChecked(this.rmf, true);
        lf(true);
        GMTrace.o(6942680416256L, 51727);
        return;
      }
      lf(false);
      GMTrace.o(6942680416256L, 51727);
      return;
    }
    this.rmb.setChecked(false);
    this.rmc.setChecked(true);
    this.rmh.gpU = this.rma;
    this.rmh.notifyDataSetChanged();
    this.rmi.clearChoices();
    if (this.rmg >= 0)
    {
      this.rmi.setItemChecked(this.rmg, true);
      lf(true);
      GMTrace.o(6942680416256L, 51727);
      return;
    }
    lf(false);
    GMTrace.o(6942680416256L, 51727);
  }
  
  public final void MP()
  {
    GMTrace.i(6942546198528L, 51726);
    this.rmd = this.ui.getString("key_bank_type");
    this.rme = this.ui.getInt("key_bankcard_type", 1);
    this.raX = this.ui.getInt("key_support_bankcard", 1);
    this.qWW = this.ui.getInt("key_bind_scene", -1);
    this.rmi = ((MaxListView)findViewById(a.f.sHe));
    this.rmb = ((CheckedTextView)findViewById(a.f.ste));
    this.rmc = ((CheckedTextView)findViewById(a.f.stf));
    this.rmh = new a(this);
    this.rmi.setAdapter(this.rmh);
    this.rmi.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6983079952384L, 52028);
        paramAnonymousAdapterView = WalletCardSelectUI.a(WalletCardSelectUI.this).wV(paramAnonymousInt);
        if (!bg.nm(paramAnonymousAdapterView.rga))
        {
          h.a(WalletCardSelectUI.this, paramAnonymousAdapterView.rga, null, true, null);
          GMTrace.o(6983079952384L, 52028);
          return;
        }
        if (paramAnonymousAdapterView.bym()) {
          WalletCardSelectUI.a(WalletCardSelectUI.this, paramAnonymousInt);
        }
        for (;;)
        {
          WalletCardSelectUI.this.lf(true);
          GMTrace.o(6983079952384L, 52028);
          return;
          WalletCardSelectUI.b(WalletCardSelectUI.this, paramAnonymousInt);
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6956639059968L, 51831);
        WalletCardSelectUI.this.finish();
        GMTrace.o(6956639059968L, 51831);
        return true;
      }
    });
    a(0, getString(a.i.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6998112337920L, 52140);
        Object localObject = null;
        Intent localIntent = new Intent();
        if ((WalletCardSelectUI.b(WalletCardSelectUI.this).isChecked()) && (WalletCardSelectUI.c(WalletCardSelectUI.this) >= 0))
        {
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.d(WalletCardSelectUI.this).get(WalletCardSelectUI.c(WalletCardSelectUI.this));
          if (paramAnonymousMenuItem == null) {
            break label155;
          }
          localIntent.putExtra("elemt_query", paramAnonymousMenuItem);
          WalletCardSelectUI.this.setResult(-1, localIntent);
        }
        for (;;)
        {
          WalletCardSelectUI.this.finish();
          GMTrace.o(6998112337920L, 52140);
          return true;
          paramAnonymousMenuItem = (MenuItem)localObject;
          if (!WalletCardSelectUI.e(WalletCardSelectUI.this).isChecked()) {
            break;
          }
          paramAnonymousMenuItem = (MenuItem)localObject;
          if (WalletCardSelectUI.f(WalletCardSelectUI.this) < 0) {
            break;
          }
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.g(WalletCardSelectUI.this).get(WalletCardSelectUI.f(WalletCardSelectUI.this));
          break;
          label155:
          WalletCardSelectUI.this.setResult(0);
        }
      }
    }, p.b.vLG);
    lf(false);
    this.rmb.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6942143545344L, 51723);
        WalletCardSelectUI.a(WalletCardSelectUI.this, true);
        GMTrace.o(6942143545344L, 51723);
      }
    });
    this.rmc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6945364770816L, 51747);
        WalletCardSelectUI.a(WalletCardSelectUI.this, false);
        GMTrace.o(6945364770816L, 51747);
      }
    });
    GMTrace.o(6942546198528L, 51726);
  }
  
  protected final int Qf()
  {
    GMTrace.i(6943217287168L, 51731);
    GMTrace.o(6943217287168L, 51731);
    return 1;
  }
  
  public final boolean aNk()
  {
    GMTrace.i(6943083069440L, 51730);
    GMTrace.o(6943083069440L, 51730);
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6942948851712L, 51729);
    GMTrace.o(6942948851712L, 51729);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6942814633984L, 51728);
    int i = a.g.sPd;
    GMTrace.o(6942814633984L, 51728);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6942411980800L, 51725);
    super.onCreate(paramBundle);
    oM(a.i.taL);
    MP();
    this.rma.clear();
    this.rlZ.clear();
    if (n.byF().rcu != null)
    {
      paramBundle = n.byF().rcu.iterator();
      while (paramBundle.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)paramBundle.next();
        if ((this.qWW == 5) && (!localElementQuery.rgn)) {
          localElementQuery.rga = getString(a.i.thw);
        }
        if (2 == localElementQuery.rfU) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label147;
          }
          this.rma.add(localElementQuery);
          break;
        }
        label147:
        if (localElementQuery.bym()) {
          this.rlZ.add(localElementQuery);
        }
      }
    }
    if ((this.raX == 3) && (!this.rma.isEmpty()))
    {
      if (!n.byx().byX()) {
        break label271;
      }
      Collections.sort(this.rma, new Comparator() {});
    }
    while (!this.rlZ.isEmpty()) {
      if (bg.nm(this.rmd))
      {
        this.rmb.setChecked(false);
        this.rmc.setChecked(false);
        this.rmi.setVisibility(8);
        GMTrace.o(6942411980800L, 51725);
        return;
        label271:
        Collections.sort(this.rma, new Comparator() {});
      }
      else
      {
        if (this.rme == 2)
        {
          j = this.rma.size();
          i = 0;
          for (;;)
          {
            if (i < j)
            {
              if (((ElementQuery)this.rma.get(i)).nDt.equals(this.rmd))
              {
                this.rmg = i;
                iW(false);
                lf(true);
              }
            }
            else
            {
              if (this.rmg < 0)
              {
                iW(false);
                lf(false);
              }
              GMTrace.o(6942411980800L, 51725);
              return;
            }
            i += 1;
          }
        }
        j = this.rlZ.size();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            if (((ElementQuery)this.rlZ.get(i)).nDt.equals(this.rmd))
            {
              this.rmf = i;
              iW(true);
              lf(true);
            }
          }
          else
          {
            if (this.rmf < 0)
            {
              iW(false);
              lf(false);
            }
            GMTrace.o(6942411980800L, 51725);
            return;
          }
          i += 1;
        }
      }
    }
    int j = this.rma.size();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        if (((ElementQuery)this.rma.get(i)).nDt.equals(this.rmd))
        {
          this.rmg = i;
          iW(false);
          lf(true);
        }
      }
      else
      {
        if (this.rmg < 0)
        {
          iW(false);
          lf(false);
        }
        this.rmb.setVisibility(8);
        this.rmc.setBackgroundResource(a.e.aVO);
        this.rmc.setCheckMarkDrawable(a.e.aZz);
        GMTrace.o(6942411980800L, 51725);
        return;
      }
      i += 1;
    }
  }
  
  public final class a
    extends BaseAdapter
  {
    private Context context;
    List<ElementQuery> gpU;
    
    public a(Context paramContext)
    {
      GMTrace.i(6994756894720L, 52115);
      this.gpU = new ArrayList();
      this.context = paramContext;
      GMTrace.o(6994756894720L, 52115);
    }
    
    public final int getCount()
    {
      GMTrace.i(6995159547904L, 52118);
      int i = this.gpU.size();
      GMTrace.o(6995159547904L, 52118);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6995427983360L, 52120);
      long l = paramInt;
      GMTrace.o(6995427983360L, 52120);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6995025330176L, 52117);
      paramViewGroup = new a();
      View localView = View.inflate(this.context, a.g.sOP, null);
      paramViewGroup.rmk = ((CheckedTextView)localView.findViewById(a.f.std));
      ElementQuery localElementQuery = (ElementQuery)this.gpU.get(paramInt);
      paramView = bg.aq(localElementQuery.mhU, "");
      if (!bg.nm(localElementQuery.rga))
      {
        paramView = paramView + "[" + localElementQuery.rga + "]";
        paramViewGroup.rmk.setEnabled(false);
      }
      for (;;)
      {
        paramViewGroup.rmk.setText(paramView);
        GMTrace.o(6995025330176L, 52117);
        return localView;
        paramViewGroup.rmk.setEnabled(true);
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(6994891112448L, 52116);
      boolean bool = bg.nm(((ElementQuery)this.gpU.get(paramInt)).rga);
      GMTrace.o(6994891112448L, 52116);
      return bool;
    }
    
    public final ElementQuery wV(int paramInt)
    {
      GMTrace.i(6995293765632L, 52119);
      ElementQuery localElementQuery = (ElementQuery)this.gpU.get(paramInt);
      GMTrace.o(6995293765632L, 52119);
      return localElementQuery;
    }
    
    final class a
    {
      CheckedTextView rmk;
      
      a()
      {
        GMTrace.i(6984824782848L, 52041);
        GMTrace.o(6984824782848L, 52041);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletCardSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */