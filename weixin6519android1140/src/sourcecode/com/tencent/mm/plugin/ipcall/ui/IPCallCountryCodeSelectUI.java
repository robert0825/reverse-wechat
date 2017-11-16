package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.ipcall.a.c;
import com.tencent.mm.plugin.ipcall.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.tools.p.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class IPCallCountryCodeSelectUI
  extends MMActivity
{
  private String countryCode;
  private List<a> ePZ;
  private String gLy;
  private String htH;
  private p jQL;
  public LinearLayout moX;
  private ListView mpA;
  private f mpB;
  private IPCallCountryCodeScrollbar mpC;
  private IPCallCountryCodeScrollbar.a mpD;
  private boolean mpE;
  private boolean mpi;
  
  public IPCallCountryCodeSelectUI()
  {
    GMTrace.i(11703249010688L, 87196);
    this.htH = "";
    this.mpi = false;
    this.mpE = false;
    GMTrace.o(11703249010688L, 87196);
  }
  
  private void aJl()
  {
    GMTrace.i(11704188534784L, 87203);
    Iterator localIterator;
    b localb;
    Object localObject2;
    label181:
    int i;
    if (v.bPG())
    {
      localIterator = com.tencent.mm.plugin.ipcall.b.a.aJC().entrySet().iterator();
      if (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        ((Map.Entry)localObject1).getKey();
        localb = (b)((Map.Entry)localObject1).getValue();
        localObject2 = localb.muF;
        localObject1 = localObject2;
        if (localObject2 != null) {
          if (!"".equals(((String)localObject2).trim())) {
            break label181;
          }
        }
        for (localObject1 = localObject2;; localObject1 = ((StringBuffer)localObject2).toString())
        {
          localObject2 = ((String)localObject1).toUpperCase();
          localObject1 = localObject2;
          if (bg.nm((String)localObject2)) {
            localObject1 = " ";
          }
          if (c.aIa().pk(bg.getInt(localb.muE, 0))) {
            break;
          }
          this.ePZ.add(new a(localb.muF, localb.muE, ((String)localObject1).charAt(0), (String)localObject1));
          break;
          localObject1 = ((String)localObject2).toCharArray();
          localObject2 = new StringBuffer();
          int j = localObject1.length;
          i = 0;
          if (i < j)
          {
            String str = SpellMap.f(localObject1[i]);
            if (!bg.nm(str)) {
              ((StringBuffer)localObject2).append(str);
            }
            for (;;)
            {
              i += 1;
              break;
              ((StringBuffer)localObject2).append(localObject1[i]);
            }
          }
        }
      }
    }
    else
    {
      localIterator = com.tencent.mm.plugin.ipcall.b.a.aJC().entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        ((Map.Entry)localObject1).getKey();
        localb = (b)((Map.Entry)localObject1).getValue();
        localObject2 = localb.muF.toUpperCase();
        localObject1 = localObject2;
        if (bg.nm((String)localObject2)) {
          localObject1 = " ";
        }
        if (!c.aIa().pk(bg.getInt(localb.muE, 0))) {
          this.ePZ.add(new a(localb.muF, localb.muE, ((String)localObject1).charAt(0), (String)localObject1));
        }
      }
    }
    Collections.sort(this.ePZ, new Comparator() {});
    Object localObject1 = this.ePZ.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      i = ((a)((Iterator)localObject1).next()).aIZ();
      if (i != 0)
      {
        char c = (char)i;
        this.mpC.Ay(String.valueOf(c));
      }
    }
    GMTrace.o(11704188534784L, 87203);
  }
  
  protected final void MP()
  {
    GMTrace.i(11704054317056L, 87202);
    oM(R.l.cRq);
    this.jQL = new p(true, true);
    this.jQL.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(11662044168192L, 86889);
        GMTrace.o(11662044168192L, 86889);
      }
      
      public final void QB()
      {
        GMTrace.i(17093969838080L, 127360);
        GMTrace.o(17093969838080L, 127360);
      }
      
      public final void Qy()
      {
        GMTrace.i(11661641515008L, 86886);
        IPCallCountryCodeSelectUI.a(IPCallCountryCodeSelectUI.this, "");
        IPCallCountryCodeSelectUI.a(IPCallCountryCodeSelectUI.this);
        GMTrace.o(11661641515008L, 86886);
      }
      
      public final void Qz()
      {
        GMTrace.i(11661775732736L, 86887);
        GMTrace.o(11661775732736L, 86887);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(11661909950464L, 86888);
        GMTrace.o(11661909950464L, 86888);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(11661507297280L, 86885);
        IPCallCountryCodeSelectUI.a(IPCallCountryCodeSelectUI.this, paramAnonymousString);
        IPCallCountryCodeSelectUI.a(IPCallCountryCodeSelectUI.this);
        GMTrace.o(11661507297280L, 86885);
      }
    };
    a(this.jQL);
    this.mpC = ((IPCallCountryCodeScrollbar)findViewById(R.h.bdc));
    long l = System.currentTimeMillis();
    Iterator localIterator = c.aIa().aId().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (i < 5)
      {
        String str = com.tencent.mm.plugin.ipcall.b.a.AJ(String.valueOf(j));
        if ((bg.nm(str)) || (c.aIa().pk(j))) {
          break label357;
        }
        this.ePZ.add(new a(str, String.valueOf(j), 0, "0"));
        i += 1;
      }
    }
    label357:
    for (;;)
    {
      break;
      if (i > 0) {
        this.mpE = true;
      }
      aJl();
      w.d("MicroMsg.IPCallCountryCodeSelectUI", "initCountryCode used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.moX = ((LinearLayout)findViewById(R.h.bde));
      this.mpA = ((ListView)findViewById(R.h.bcT));
      this.mpB = new f(this, this.ePZ);
      this.mpB.mpi = this.mpi;
      this.mpB.mpj = this.mpE;
      this.mpA.setAdapter(this.mpB);
      this.mpA.setVisibility(0);
      this.mpD = new IPCallCountryCodeScrollbar.a()
      {
        public final void uW(String paramAnonymousString)
        {
          int i = 0;
          GMTrace.i(11672110497792L, 86964);
          int j = paramAnonymousString.charAt(0);
          if ("↑".equals(paramAnonymousString))
          {
            IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(0);
            GMTrace.o(11672110497792L, 86964);
            return;
          }
          paramAnonymousString = IPCallCountryCodeSelectUI.c(IPCallCountryCodeSelectUI.this).mph;
          if (paramAnonymousString == null)
          {
            GMTrace.o(11672110497792L, 86964);
            return;
          }
          do
          {
            i += 1;
            if (i >= paramAnonymousString.length) {
              break;
            }
          } while (paramAnonymousString[i] != j);
          IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(i + IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).getHeaderViewsCount());
          GMTrace.o(11672110497792L, 86964);
          return;
          GMTrace.o(11672110497792L, 86964);
        }
      };
      this.mpC.mpw = this.mpD;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11625805381632L, 86619);
          IPCallCountryCodeSelectUI.this.aLo();
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("country_name", IPCallCountryCodeSelectUI.d(IPCallCountryCodeSelectUI.this));
          paramAnonymousMenuItem.putExtra("couttry_code", IPCallCountryCodeSelectUI.e(IPCallCountryCodeSelectUI.this));
          IPCallCountryCodeSelectUI.this.setResult(100, paramAnonymousMenuItem);
          IPCallCountryCodeSelectUI.this.finish();
          GMTrace.o(11625805381632L, 86619);
          return true;
        }
      });
      this.mpA.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(11631308308480L, 86660);
          paramAnonymousAdapterView = new Intent();
          if (paramAnonymousInt >= IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).getHeaderViewsCount())
          {
            paramAnonymousView = (a)IPCallCountryCodeSelectUI.c(IPCallCountryCodeSelectUI.this).getItem(paramAnonymousInt - IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).getHeaderViewsCount());
            paramAnonymousAdapterView.putExtra("country_name", paramAnonymousView.gLy);
            paramAnonymousAdapterView.putExtra("couttry_code", paramAnonymousView.countryCode);
            IPCallCountryCodeSelectUI.this.setResult(100, paramAnonymousAdapterView);
          }
          IPCallCountryCodeSelectUI.this.finish();
          GMTrace.o(11631308308480L, 86660);
        }
      });
      GMTrace.o(11704054317056L, 87202);
      return;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11703383228416L, 87197);
    GMTrace.o(11703383228416L, 87197);
    return 1;
  }
  
  public void finish()
  {
    GMTrace.i(11703651663872L, 87199);
    super.finish();
    overridePendingTransition(-1, R.a.aLE);
    GMTrace.o(11703651663872L, 87199);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11703785881600L, 87200);
    int i = R.i.cAf;
    GMTrace.o(11703785881600L, 87200);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11703517446144L, 87198);
    super.onCreate(paramBundle);
    this.ePZ = new ArrayList();
    this.gLy = bg.aq(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bg.aq(getIntent().getStringExtra("couttry_code"), "");
    this.mpi = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11716670783488L, 87296);
        IPCallCountryCodeSelectUI.this.finish();
        GMTrace.o(11716670783488L, 87296);
        return false;
      }
    });
    MP();
    GMTrace.o(11703517446144L, 87198);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11704322752512L, 87204);
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.gLy);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      setResult(100, paramKeyEvent);
      finish();
      GMTrace.o(11704322752512L, 87204);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11704322752512L, 87204);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11703920099328L, 87201);
    super.onPause();
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(11703920099328L, 87201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallCountryCodeSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */