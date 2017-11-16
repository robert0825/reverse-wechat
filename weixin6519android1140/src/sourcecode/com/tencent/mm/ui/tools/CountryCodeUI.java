package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ap.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryCodeUI
  extends MMActivity
{
  private String countryCode;
  private List<c> ePZ;
  private String gLy;
  private String htH;
  private p jQL;
  private ListView mpA;
  private boolean mpi;
  private VerticalScrollBar.a wQf;
  private d xfJ;
  private VerticalScrollBar xfK;
  
  public CountryCodeUI()
  {
    GMTrace.i(1933272154112L, 14404);
    this.htH = "";
    this.mpi = false;
    GMTrace.o(1933272154112L, 14404);
  }
  
  protected final void MP()
  {
    GMTrace.i(1933809025024L, 14408);
    oM(R.l.cRq);
    w.d("MicroMsg.CountryCodeUI", "CHT:initCountryCode start:" + System.currentTimeMillis());
    String[] arrayOfString1 = getString(R.l.bsf).trim().split(",");
    int i;
    String[] arrayOfString2;
    if (!v.bPI())
    {
      i = 0;
      if (i < arrayOfString1.length)
      {
        arrayOfString2 = arrayOfString1[i].trim().split(":");
        if (arrayOfString2.length < 3) {
          w.e("MicroMsg.CountryCodeUI", "this country item has problem %s", new Object[] { arrayOfString1[i] });
        }
        for (;;)
        {
          i += 1;
          break;
          this.ePZ.add(new c(arrayOfString2[1], arrayOfString2[0], arrayOfString2[2].charAt(0), arrayOfString2[2]));
        }
      }
      Collections.sort(this.ePZ, new Comparator() {});
      this.jQL = new p(true, true);
      this.jQL.xiS = new p.b()
      {
        public final void QA()
        {
          GMTrace.i(2015681839104L, 15018);
          GMTrace.o(2015681839104L, 15018);
        }
        
        public final void QB()
        {
          GMTrace.i(16858686160896L, 125607);
          GMTrace.o(16858686160896L, 125607);
        }
        
        public final void Qy()
        {
          GMTrace.i(2015279185920L, 15015);
          GMTrace.o(2015279185920L, 15015);
        }
        
        public final void Qz()
        {
          GMTrace.i(2015413403648L, 15016);
          GMTrace.o(2015413403648L, 15016);
        }
        
        public final boolean nC(String paramAnonymousString)
        {
          GMTrace.i(2015547621376L, 15017);
          GMTrace.o(2015547621376L, 15017);
          return false;
        }
        
        public final void nD(String paramAnonymousString)
        {
          GMTrace.i(2015144968192L, 15014);
          CountryCodeUI.a(CountryCodeUI.this, paramAnonymousString);
          CountryCodeUI.a(CountryCodeUI.this);
          GMTrace.o(2015144968192L, 15014);
        }
      };
      a(this.jQL);
      this.mpA = ((ListView)findViewById(R.h.bcT));
      this.xfJ = new d(this, this.ePZ);
      this.xfJ.mpi = this.mpi;
      this.mpA.setAdapter(this.xfJ);
      this.mpA.setVisibility(0);
      this.xfK = ((VerticalScrollBar)findViewById(R.h.bdc));
      if (v.bPI()) {
        break label499;
      }
    }
    label499:
    for (this.wQf = new VerticalScrollBar.a()
        {
          public final void uW(String paramAnonymousString)
          {
            int i = 0;
            GMTrace.i(1944949096448L, 14491);
            int j = paramAnonymousString.charAt(0);
            if (CountryCodeUI.this.getString(R.l.dVW).equals(paramAnonymousString))
            {
              CountryCodeUI.b(CountryCodeUI.this).setSelection(0);
              GMTrace.o(1944949096448L, 14491);
              return;
            }
            paramAnonymousString = CountryCodeUI.c(CountryCodeUI.this).mph;
            if (paramAnonymousString == null)
            {
              GMTrace.o(1944949096448L, 14491);
              return;
            }
            do
            {
              i += 1;
              if (i >= paramAnonymousString.length) {
                break;
              }
            } while (paramAnonymousString[i] != j);
            CountryCodeUI.b(CountryCodeUI.this).setSelection(i + CountryCodeUI.b(CountryCodeUI.this).getHeaderViewsCount());
            GMTrace.o(1944949096448L, 14491);
            return;
            GMTrace.o(1944949096448L, 14491);
          }
        };; this.wQf = new VerticalScrollBar.a()
        {
          public final void uW(String paramAnonymousString)
          {
            int i = 0;
            GMTrace.i(2059302600704L, 15343);
            if (CountryCodeUI.this.getString(R.l.dVW).equals(paramAnonymousString))
            {
              CountryCodeUI.b(CountryCodeUI.this).setSelection(0);
              GMTrace.o(2059302600704L, 15343);
              return;
            }
            int j = Integer.decode(paramAnonymousString.substring(0, paramAnonymousString.length() - 1)).intValue();
            paramAnonymousString = CountryCodeUI.c(CountryCodeUI.this).mph;
            if (paramAnonymousString == null)
            {
              GMTrace.o(2059302600704L, 15343);
              return;
            }
            do
            {
              i += 1;
              if (i >= paramAnonymousString.length) {
                break;
              }
            } while (paramAnonymousString[i] != j);
            CountryCodeUI.b(CountryCodeUI.this).setSelection(i + CountryCodeUI.b(CountryCodeUI.this).getHeaderViewsCount());
            GMTrace.o(2059302600704L, 15343);
            return;
            GMTrace.o(2059302600704L, 15343);
          }
        })
    {
      this.xfK.wiZ = this.wQf;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1915555414016L, 14272);
          CountryCodeUI.this.aLo();
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("country_name", CountryCodeUI.d(CountryCodeUI.this));
          paramAnonymousMenuItem.putExtra("couttry_code", CountryCodeUI.e(CountryCodeUI.this));
          CountryCodeUI.this.setResult(100, paramAnonymousMenuItem);
          CountryCodeUI.this.finish();
          GMTrace.o(1915555414016L, 14272);
          return true;
        }
      });
      this.mpA.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(1966826586112L, 14654);
          paramAnonymousAdapterView = new Intent();
          if (paramAnonymousInt >= CountryCodeUI.b(CountryCodeUI.this).getHeaderViewsCount())
          {
            paramAnonymousView = (c)CountryCodeUI.c(CountryCodeUI.this).getItem(paramAnonymousInt - CountryCodeUI.b(CountryCodeUI.this).getHeaderViewsCount());
            paramAnonymousAdapterView.putExtra("country_name", paramAnonymousView.gLy);
            paramAnonymousAdapterView.putExtra("couttry_code", paramAnonymousView.countryCode);
            CountryCodeUI.this.setResult(100, paramAnonymousAdapterView);
          }
          CountryCodeUI.this.finish();
          GMTrace.o(1966826586112L, 14654);
        }
      });
      GMTrace.o(1933809025024L, 14408);
      return;
      w.d("MicroMsg.CountryCodeUI", "CHT:initCountryCode t1:" + System.currentTimeMillis());
      i = 0;
      while (i < arrayOfString1.length)
      {
        arrayOfString2 = arrayOfString1[i].trim().split(":");
        int j = a.kx(arrayOfString2[1]);
        this.ePZ.add(new c(arrayOfString2[1], arrayOfString2[0], j, arrayOfString2[1]));
        i += 1;
      }
      w.d("MicroMsg.CountryCodeUI", "CHT:initCountryCode t2:" + System.currentTimeMillis());
      Collections.sort(this.ePZ, new Comparator() {});
      w.d("MicroMsg.CountryCodeUI", "CHT2:initCountryCode t3:" + System.currentTimeMillis());
      break;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1933540589568L, 14406);
    if (v.bPI())
    {
      i = R.i.cui;
      GMTrace.o(1933540589568L, 14406);
      return i;
    }
    int i = R.i.cuh;
    GMTrace.o(1933540589568L, 14406);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1933406371840L, 14405);
    super.onCreate(paramBundle);
    this.ePZ = new ArrayList();
    this.gLy = t.aq(getIntent().getStringExtra("country_name"), "");
    this.countryCode = t.aq(getIntent().getStringExtra("couttry_code"), "");
    this.mpi = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
    MP();
    GMTrace.o(1933406371840L, 14405);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1933943242752L, 14409);
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.gLy);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      setResult(100, paramKeyEvent);
      finish();
      GMTrace.o(1933943242752L, 14409);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1933943242752L, 14409);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1933674807296L, 14407);
    super.onPause();
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(1933674807296L, 14407);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\CountryCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */