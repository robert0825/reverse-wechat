package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.t;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.l;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.protocal.c.bmu;
import com.tencent.mm.protocal.c.bug;
import com.tencent.mm.protocal.c.bur;
import com.tencent.mm.protocal.c.dt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandAuthorizeUI
  extends MMPreference
{
  private String hyD;
  protected f iAA;
  private boolean iAB;
  private boolean iAC;
  private boolean iAD;
  private com.tencent.mm.plugin.appbrand.widget.k iAE;
  private String iAx;
  List<dt> iAy;
  private t iAz;
  
  public AppBrandAuthorizeUI()
  {
    GMTrace.i(10542131445760L, 78545);
    this.iAy = new ArrayList();
    this.iAB = false;
    this.iAC = true;
    this.iAD = false;
    this.iAE = null;
    GMTrace.o(10542131445760L, 78545);
  }
  
  private void aaz()
  {
    GMTrace.i(10543205187584L, 78553);
    if (!this.iAD)
    {
      GMTrace.o(10543205187584L, 78553);
      return;
    }
    JSONArray localJSONArray = new JSONArray();
    Object localObject = this.iAy.iterator();
    while (((Iterator)localObject).hasNext())
    {
      dt localdt = (dt)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("scope", localdt.scope);
        localJSONObject.put("state", localdt.state);
        localJSONObject.put("desc", localdt.tRY);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", localJSONException, "", new Object[0]);
      }
    }
    w.d("MicroMsg.AppBrandAuthorizeUI", "authInfo %s", new Object[] { localJSONArray });
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_app_authorize_state", localJSONArray.toString());
    setResult(-1, (Intent)localObject);
    GMTrace.o(10543205187584L, 78553);
  }
  
  private void cv(final boolean paramBoolean)
  {
    GMTrace.i(10542668316672L, 78549);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10500926603264L, 78238);
        Preference localPreference = new Preference(AppBrandAuthorizeUI.this);
        localPreference.wlc = false;
        if (paramBoolean)
        {
          localPreference.setLayoutResource(o.g.hCJ);
          localPreference.setTitle(AppBrandAuthorizeUI.this.getString(o.i.hEd, new Object[] { AppBrandAuthorizeUI.e(AppBrandAuthorizeUI.this).eCQ }));
        }
        for (;;)
        {
          AppBrandAuthorizeUI.this.iAA.a(localPreference);
          AppBrandAuthorizeUI.this.iAA.notifyDataSetChanged();
          GMTrace.o(10500926603264L, 78238);
          return;
          localPreference.setLayoutResource(o.g.hCK);
          localPreference.setTitle(AppBrandAuthorizeUI.this.getString(o.i.hEe, new Object[] { AppBrandAuthorizeUI.e(AppBrandAuthorizeUI.this).eCQ }));
        }
      }
    });
    GMTrace.o(10542668316672L, 78549);
  }
  
  public final int QI()
  {
    GMTrace.i(10542265663488L, 78546);
    int i = o.l.hHE;
    GMTrace.o(10542265663488L, 78546);
    return i;
  }
  
  public final boolean a(final f paramf, final Preference paramPreference)
  {
    GMTrace.i(10542534098944L, 78548);
    w.d("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.hiu });
    if (this.iAy == null)
    {
      w.w("MicroMsg.AppBrandAuthorizeUI", "mAuthItem == null");
      GMTrace.o(10542534098944L, 78548);
      return false;
    }
    String str = paramPreference.hiu;
    if (bg.nm(str))
    {
      w.e("MicroMsg.AppBrandAuthorizeUI", "key is null");
      GMTrace.o(10542534098944L, 78548);
      return false;
    }
    Iterator localIterator = this.iAy.iterator();
    while (localIterator.hasNext())
    {
      final Object localObject = (dt)localIterator.next();
      if (str.equals(bg.nl(((dt)localObject).scope)))
      {
        this.iAB = true;
        if (((CheckBoxPreference)paramPreference).isChecked())
        {
          ((dt)localObject).state = 1;
        }
        else if (this.iAC)
        {
          this.iAC = false;
          i.a locala = new i.a(this);
          locala.VA(getString(o.i.hEc));
          locala.VC(getString(o.i.hEb));
          locala.a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10539312873472L, 78524);
              localObject.state = 2;
              w.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state close");
              GMTrace.o(10539312873472L, 78524);
            }
          });
          locala.VD(getString(o.i.cSk));
          locala.b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10547097501696L, 78582);
              w.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state open");
              localObject.state = 1;
              ((CheckBoxPreference)paramPreference).sdM = true;
              paramf.notifyDataSetChanged();
              GMTrace.o(10547097501696L, 78582);
            }
          });
          locala.d(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(10522133004288L, 78396);
              w.d("MicroMsg.AppBrandAuthorizeUI", "on cancel click!");
              localObject.state = 1;
              ((CheckBoxPreference)paramPreference).sdM = true;
              paramf.notifyDataSetChanged();
              GMTrace.o(10522133004288L, 78396);
            }
          });
          localObject = locala.aax();
          ((i)localObject).setCanceledOnTouchOutside(false);
          ((i)localObject).show();
        }
        else
        {
          ((dt)localObject).state = 2;
        }
      }
    }
    GMTrace.o(10542534098944L, 78548);
    return false;
  }
  
  protected final void aay()
  {
    GMTrace.i(19702222946304L, 146793);
    super.aay();
    if ((this.vMl != null) && (this.vMl.getChildCount() > 0))
    {
      View localView = this.vMl.getChildAt(0);
      this.vMl.removeView(localView);
      this.iAE = new com.tencent.mm.plugin.appbrand.widget.k(this);
      this.iAE.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      this.iAE.setStatusBarColor(getResources().getColor(o.c.aPb));
      this.vMl.addView(this.iAE);
      this.vMl.Hw = this.iAE;
    }
    GMTrace.o(19702222946304L, 146793);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(10542936752128L, 78551);
    w.d("MicroMsg.AppBrandAuthorizeUI", "onBackPressed !");
    aaz();
    super.onBackPressed();
    GMTrace.o(10542936752128L, 78551);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10542399881216L, 78547);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10513274634240L, 78330);
        AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this);
        AppBrandAuthorizeUI.this.finish();
        GMTrace.o(10513274634240L, 78330);
        return false;
      }
    });
    oM(o.i.hEl);
    this.iAA = this.wky;
    paramBundle = getIntent().getStringExtra("key_username");
    this.iAx = paramBundle;
    if (bg.nm(paramBundle))
    {
      finish();
      GMTrace.o(10542399881216L, 78547);
      return;
    }
    this.iAD = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
    this.iAz = q.pq(this.iAx);
    if (this.iAz == null)
    {
      w.e("MicroMsg.AppBrandAuthorizeUI", "AppBrandBizInfo is Null");
      GMTrace.o(10542399881216L, 78547);
      return;
    }
    this.hyD = this.iAz.appId;
    d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10533809946624L, 78483);
        AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this));
        GMTrace.o(10533809946624L, 78483);
      }
    });
    GMTrace.o(10542399881216L, 78547);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10543070969856L, 78552);
    super.onDestroy();
    GMTrace.o(10543070969856L, 78552);
  }
  
  protected void onPause()
  {
    GMTrace.i(10542802534400L, 78550);
    if (this.iAB)
    {
      w.d("MicroMsg.AppBrandAuthorizeUI", "onPause key change!");
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10525891100672L, 78424);
          if (AppBrandAuthorizeUI.f(AppBrandAuthorizeUI.this))
          {
            AppBrandAuthorizeUI.g(AppBrandAuthorizeUI.this);
            AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this), AppBrandAuthorizeUI.this.iAy);
          }
          GMTrace.o(10525891100672L, 78424);
        }
      });
    }
    super.onPause();
    GMTrace.o(10542802534400L, 78550);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandAuthorizeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */