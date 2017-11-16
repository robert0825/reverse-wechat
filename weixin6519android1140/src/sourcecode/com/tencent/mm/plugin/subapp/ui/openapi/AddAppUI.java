package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;

public class AddAppUI
  extends MMPreference
  implements e
{
  private com.tencent.mm.ui.base.preference.f htU;
  private AppPreference qts;
  private AppPreference qtt;
  
  public AddAppUI()
  {
    GMTrace.i(5799816462336L, 43212);
    GMTrace.o(5799816462336L, 43212);
  }
  
  protected final void MP()
  {
    GMTrace.i(5800487550976L, 43217);
    oM(R.l.cQB);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5804782518272L, 43249);
        AddAppUI.this.finish();
        GMTrace.o(5804782518272L, 43249);
        return true;
      }
    });
    this.htU = this.wky;
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.eom);
    this.qts = ((AppPreference)this.htU.VG("addapp_added"));
    this.qts.qtw = 1;
    this.qts.qtA = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5810822316032L, 43294);
        paramAnonymousAdapterView = AddAppUI.a(AddAppUI.this).vQ(paramAnonymousInt);
        AddAppUI.a(AddAppUI.this, paramAnonymousAdapterView.field_appId);
        GMTrace.o(5810822316032L, 43294);
      }
    };
    this.qts.qtB = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5804245647360L, 43245);
        AddAppUI.f(AddAppUI.a(AddAppUI.this).vQ(paramAnonymousInt));
        AddAppUI.this.MP();
        GMTrace.o(5804245647360L, 43245);
      }
    };
    this.qtt = ((AppPreference)this.htU.VG("addapp_available"));
    this.qtt.qtw = 0;
    this.qtt.qtA = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5802098163712L, 43229);
        paramAnonymousAdapterView = AddAppUI.b(AddAppUI.this).vQ(paramAnonymousInt);
        AddAppUI.a(AddAppUI.this, paramAnonymousAdapterView.field_appId);
        GMTrace.o(5802098163712L, 43229);
      }
    };
    GMTrace.o(5800487550976L, 43217);
  }
  
  public final int QI()
  {
    GMTrace.i(5799950680064L, 43213);
    int i = R.o.eom;
    GMTrace.o(5799950680064L, 43213);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5800755986432L, 43219);
    w.d("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      GMTrace.o(5800755986432L, 43219);
      return;
    }
    w.e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    GMTrace.o(5800755986432L, 43219);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5800621768704L, 43218);
    if (paramPreference.hiu.equals("addapp_recommend"))
    {
      paramf = this.vKB.vKW.getSharedPreferences(ab.bPU(), 0);
      paramPreference = this.vKB.vKW;
      paramf = v.d(paramf);
      paramf = getString(R.l.cQC, new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), paramf, v.bPJ() });
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
      GMTrace.o(5800621768704L, 43218);
      return true;
    }
    GMTrace.o(5800621768704L, 43218);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5800084897792L, 43214);
    super.onCreate(paramBundle);
    GMTrace.o(5800084897792L, 43214);
  }
  
  protected void onPause()
  {
    GMTrace.i(5800353333248L, 43216);
    super.onPause();
    if (this.qts != null) {
      this.qts.onPause();
    }
    if (this.qtt != null) {
      this.qtt.onPause();
    }
    GMTrace.o(5800353333248L, 43216);
  }
  
  protected void onResume()
  {
    GMTrace.i(5800219115520L, 43215);
    super.onResume();
    MP();
    if (this.qts != null) {
      this.qts.onResume();
    }
    if (this.qtt != null) {
      this.qtt.onResume();
    }
    GMTrace.o(5800219115520L, 43215);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\AddAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */