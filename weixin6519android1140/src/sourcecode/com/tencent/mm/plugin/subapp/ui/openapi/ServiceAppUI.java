package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
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
import com.tencent.mm.g.b.n;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public class ServiceAppUI
  extends MMPreference
  implements e
{
  private String eDs;
  private com.tencent.mm.ui.base.preference.f htU;
  private ServicePreference qtJ;
  private ServicePreference qtK;
  private PreferenceTitleCategory qtL;
  private PreferenceTitleCategory qtM;
  private List<com.tencent.mm.pluginsdk.model.app.f> qtN;
  private List<com.tencent.mm.pluginsdk.model.app.f> qtO;
  private AdapterView.OnItemClickListener qtP;
  private AdapterView.OnItemClickListener qtQ;
  
  public ServiceAppUI()
  {
    GMTrace.i(5797803196416L, 43197);
    this.qtN = new ArrayList();
    this.qtO = new ArrayList();
    GMTrace.o(5797803196416L, 43197);
  }
  
  protected final void MP()
  {
    GMTrace.i(5798474285056L, 43202);
    oM(R.l.dXJ);
    this.eDs = getIntent().getStringExtra("service_app_talker_user");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5804514082816L, 43247);
        ServiceAppUI.this.finish();
        GMTrace.o(5804514082816L, 43247);
        return true;
      }
    });
    this.qtN.clear();
    this.qtO.clear();
    Cursor localCursor;
    if (s.eb(this.eDs))
    {
      localCursor = an.aWy().cJ(0, 2);
      if (localCursor != null) {
        if (!localCursor.moveToFirst()) {}
      }
    }
    label474:
    for (;;)
    {
      com.tencent.mm.pluginsdk.model.app.f localf = new com.tencent.mm.pluginsdk.model.app.f();
      localf.b(localCursor);
      if (localf.field_serviceAppType == 1) {
        this.qtN.add(localf);
      }
      for (;;)
      {
        if (localCursor.moveToNext()) {
          break label474;
        }
        localCursor.close();
        if (this.qtP == null) {
          this.qtP = new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(5810017009664L, 43288);
              if (ServiceAppUI.a(ServiceAppUI.this) == null)
              {
                w.e("MicroMsg.ServiceAppUI", "wx onItemClick wxServicePref null");
                GMTrace.o(5810017009664L, 43288);
                return;
              }
              paramAnonymousAdapterView = ServiceAppUI.a(ServiceAppUI.this).vQ(paramAnonymousInt);
              if (paramAnonymousAdapterView == null)
              {
                w.e("MicroMsg.ServiceAppUI", "wx onItemClick app is null");
                GMTrace.o(5810017009664L, 43288);
                return;
              }
              w.i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", new Object[] { Integer.valueOf(paramAnonymousAdapterView.feg), paramAnonymousAdapterView.field_packageName, paramAnonymousAdapterView.field_appId });
              ServiceAppUI.a(ServiceAppUI.this, paramAnonymousAdapterView);
              GMTrace.o(5810017009664L, 43288);
            }
          };
        }
        if (this.qtQ == null) {
          this.qtQ = new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(5801829728256L, 43227);
              if (ServiceAppUI.b(ServiceAppUI.this) == null)
              {
                w.e("MicroMsg.ServiceAppUI", "biz onItemClick bizServicePref null");
                GMTrace.o(5801829728256L, 43227);
                return;
              }
              paramAnonymousAdapterView = ServiceAppUI.b(ServiceAppUI.this).vQ(paramAnonymousInt);
              if (paramAnonymousAdapterView == null)
              {
                w.e("MicroMsg.ServiceAppUI", "biz onItemClick app is null");
                GMTrace.o(5801829728256L, 43227);
                return;
              }
              w.i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", new Object[] { Integer.valueOf(paramAnonymousAdapterView.feg), paramAnonymousAdapterView.field_packageName, paramAnonymousAdapterView.field_appId });
              ServiceAppUI.a(ServiceAppUI.this, paramAnonymousAdapterView);
              GMTrace.o(5801829728256L, 43227);
            }
          };
        }
        this.htU = this.wky;
        this.htU.removeAll();
        if (this.qtN.size() > 0)
        {
          this.qtJ = new ServicePreference(this);
          this.qtJ.qtx = this.qtN;
          if (this.qtP != null) {
            this.qtJ.qtA = this.qtP;
          }
          if (this.qtL == null)
          {
            this.qtL = new PreferenceTitleCategory(this);
            this.qtL.setTitle(R.l.elR);
          }
          this.htU.a(this.qtL);
          this.htU.a(this.qtJ);
        }
        if (this.qtO.size() > 0)
        {
          this.qtK = new ServicePreference(this);
          this.qtK.qtx = this.qtO;
          if (this.qtQ != null) {
            this.qtK.qtA = this.qtQ;
          }
          if (this.qtM == null)
          {
            this.qtM = new PreferenceTitleCategory(this);
            this.qtM.setTitle(R.l.daJ);
          }
          this.htU.a(this.qtM);
          this.htU.a(this.qtK);
        }
        GMTrace.o(5798474285056L, 43202);
        return;
        if (s.fD(this.eDs))
        {
          localCursor = an.aWy().cJ(0, 4);
          break;
        }
        localCursor = an.aWy().cJ(0, 1);
        break;
        if (localf.field_serviceAppType == 2) {
          this.qtO.add(localf);
        }
      }
    }
  }
  
  public final int QI()
  {
    GMTrace.i(5797937414144L, 43198);
    int i = R.o.epi;
    GMTrace.o(5797937414144L, 43198);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5798742720512L, 43204);
    w.d("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      GMTrace.o(5798742720512L, 43204);
      return;
    }
    w.e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    GMTrace.o(5798742720512L, 43204);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5798608502784L, 43203);
    GMTrace.o(5798608502784L, 43203);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5798071631872L, 43199);
    super.onCreate(paramBundle);
    GMTrace.o(5798071631872L, 43199);
  }
  
  protected void onPause()
  {
    GMTrace.i(5798340067328L, 43201);
    super.onPause();
    if (this.qtJ != null) {
      this.qtJ.onPause();
    }
    if (this.qtK != null) {
      this.qtK.onPause();
    }
    GMTrace.o(5798340067328L, 43201);
  }
  
  protected void onResume()
  {
    GMTrace.i(5798205849600L, 43200);
    super.onResume();
    MP();
    if (this.qtJ != null) {
      this.qtJ.onResume();
    }
    if (this.qtK != null) {
      this.qtK.onResume();
    }
    GMTrace.o(5798205849600L, 43200);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\ServiceAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */