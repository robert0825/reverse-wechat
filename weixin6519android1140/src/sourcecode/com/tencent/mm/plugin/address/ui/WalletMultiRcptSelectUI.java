package com.tencent.mm.plugin.address.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.Iterator;
import java.util.List;

public class WalletMultiRcptSelectUI
  extends MMPreference
{
  private int eOh;
  private f htU;
  private RcptItem hwt;
  private RcptItem hwu;
  private List<RcptItem> hwv;
  
  public WalletMultiRcptSelectUI()
  {
    GMTrace.i(12804102815744L, 95398);
    this.eOh = 0;
    this.hwt = null;
    this.hwu = null;
    GMTrace.o(12804102815744L, 95398);
  }
  
  private void Rc()
  {
    GMTrace.i(12804237033472L, 95399);
    switch (this.eOh)
    {
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_stage", this.eOh);
      localIntent.putExtra("key_province", this.hwt);
      localIntent.putExtra("key_city", this.hwu);
      setResult(0, localIntent);
      finish();
      GMTrace.o(12804237033472L, 95399);
      return;
      this.hwu = null;
      this.eOh = 1;
      continue;
      this.hwt = null;
      this.eOh = 0;
    }
  }
  
  private void s(Intent paramIntent)
  {
    Object localObject2 = null;
    GMTrace.i(12805042339840L, 95405);
    if (paramIntent == null)
    {
      w.e("MicroMsg.MultiRptSelectUI", "initData intent is null");
      GMTrace.o(12805042339840L, 95405);
      return;
    }
    this.eOh = paramIntent.getIntExtra("key_stage", 0);
    this.hwt = ((RcptItem)paramIntent.getParcelableExtra("key_province"));
    this.hwu = ((RcptItem)paramIntent.getParcelableExtra("key_city"));
    Object localObject3 = paramIntent.getStringExtra("extra_province");
    if (localObject3 != null)
    {
      a.QM();
      localObject1 = a.QO();
      if (bg.nm((String)localObject3)) {
        break label240;
      }
      Iterator localIterator = ((l)localObject1).huu.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (RcptItem)localIterator.next();
      } while (!((RcptItem)localObject1).name.startsWith((String)localObject3));
      this.hwt = ((RcptItem)localObject1);
      if (this.hwt != null) {
        this.eOh = 1;
      }
    }
    Object localObject1 = paramIntent.getStringExtra("extra_city");
    if ((localObject1 != null) && (1 == this.eOh))
    {
      a.QM();
      localObject3 = a.QO().nE(this.hwt.code);
      paramIntent = (Intent)localObject2;
      if (localObject3 != null)
      {
        if (((List)localObject3).size() != 0) {
          break label245;
        }
        paramIntent = (Intent)localObject2;
      }
    }
    for (;;)
    {
      this.hwu = paramIntent;
      if (this.hwu != null) {
        this.eOh = 2;
      }
      GMTrace.o(12805042339840L, 95405);
      return;
      label240:
      localObject1 = null;
      break;
      label245:
      localObject3 = ((List)localObject3).iterator();
      do
      {
        paramIntent = (Intent)localObject2;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        paramIntent = (RcptItem)((Iterator)localObject3).next();
      } while (!paramIntent.name.startsWith((String)localObject1));
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(12804908122112L, 95404);
    Object localObject = getIntent();
    int i = R.l.cRj;
    if (localObject != null) {
      i = ((Intent)localObject).getIntExtra("ui_title", R.l.cRj);
    }
    oM(i);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12799136759808L, 95361);
        WalletMultiRcptSelectUI.a(WalletMultiRcptSelectUI.this);
        GMTrace.o(12799136759808L, 95361);
        return true;
      }
    });
    s((Intent)localObject);
    localObject = a.QO().huu;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      w.e("MicroMsg.MultiRptSelectUI", "list == null || list.isEmpty(), need loadata!");
      a.QO().QP();
    }
    switch (this.eOh)
    {
    default: 
      a.QM();
      localObject = a.QO().huu;
    }
    for (;;)
    {
      this.hwv = ((List)localObject);
      if ((this.hwv != null) && (this.hwv.size() > 0)) {
        break label263;
      }
      w.e("MicroMsg.MultiRptSelectUI", "initZoneItems error ,check zone lists!");
      GMTrace.o(12804908122112L, 95404);
      return;
      a.QM();
      localObject = a.QO().huu;
      continue;
      if ((this.hwt != null) && (!bg.nm(this.hwt.code)))
      {
        a.QM();
        localObject = a.QO().nE(this.hwt.code);
      }
      else
      {
        if ((this.hwu == null) || (bg.nm(this.hwu.code))) {
          break;
        }
        a.QM();
        localObject = a.QO().nF(this.hwu.code);
      }
    }
    label263:
    this.htU.removeAll();
    i = 0;
    if (i < this.hwv.size())
    {
      RcptItem localRcptItem;
      if ((this.hwv.get(i) != null) && (!bg.nm(((RcptItem)this.hwv.get(i)).name)))
      {
        localObject = new RcptPreference(this);
        localRcptItem = (RcptItem)this.hwv.get(i);
        if ((localRcptItem != null) && (!bg.nm(localRcptItem.name))) {
          break label383;
        }
        w.e("MicroMsg.RcptPreference", "setZoneItem item = null");
      }
      for (;;)
      {
        this.htU.a((Preference)localObject);
        i += 1;
        break;
        label383:
        ((RcptPreference)localObject).setKey(localRcptItem.code);
        ((RcptPreference)localObject).hwk = localRcptItem;
      }
    }
    localObject = new PreferenceSmallCategory(this);
    this.htU.a((Preference)localObject);
    GMTrace.o(12804908122112L, 95404);
  }
  
  public final int QI()
  {
    GMTrace.i(12804773904384L, 95403);
    int i = R.o.epg;
    GMTrace.o(12804773904384L, 95403);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(12805176557568L, 95406);
    if ((paramPreference instanceof RcptPreference))
    {
      paramf = ((RcptPreference)paramPreference).hwk;
      if ((paramf == null) || (bg.nm(paramf.name)))
      {
        w.e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
        GMTrace.o(12805176557568L, 95406);
        return false;
      }
      if (!paramf.hus) {
        this.eOh = 2;
      }
      switch (this.eOh)
      {
      default: 
        paramf = getIntent();
        if (paramf == null) {
          break;
        }
      }
    }
    for (int i = paramf.getIntExtra("ui_title", -1);; i = -1)
    {
      paramf = new Intent(this, WalletMultiRcptSelectUI.class);
      paramf.putExtra("key_stage", this.eOh);
      paramf.putExtra("key_province", this.hwt);
      paramf.putExtra("key_city", this.hwu);
      if (-1 != i) {
        paramf.putExtra("ui_title", i);
      }
      startActivityForResult(paramf, 1);
      for (;;)
      {
        GMTrace.o(12805176557568L, 95406);
        return false;
        this.hwt = paramf;
        this.eOh = 1;
        break;
        this.hwu = paramf;
        this.eOh = 2;
        break;
        paramPreference = new StringBuilder();
        if (this.hwt != null) {
          paramPreference.append(this.hwt.name).append(" ");
        }
        if (this.hwu != null) {
          paramPreference.append(this.hwu.name).append(" ");
        }
        paramPreference.append(paramf.name);
        w.d("MicroMsg.MultiRptSelectUI", "area_result: " + paramPreference.toString() + ",item.name: " + paramf.name);
        Intent localIntent = new Intent();
        localIntent.putExtra("karea_result", paramPreference.toString());
        localIntent.putExtra("kpost_code", paramf.hur);
        localIntent.putExtra("kwcode", paramf.code);
        setResult(-1, localIntent);
        finish();
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12805444993024L, 95408);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(12805444993024L, 95408);
      return;
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
        GMTrace.o(12805444993024L, 95408);
        return;
      }
      s(paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(12805310775296L, 95407);
    Rc();
    super.onBackPressed();
    GMTrace.o(12805310775296L, 95407);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12804371251200L, 95400);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(12804371251200L, 95400);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12804639686656L, 95402);
    super.onDestroy();
    GMTrace.o(12804639686656L, 95402);
  }
  
  protected void onResume()
  {
    GMTrace.i(12804505468928L, 95401);
    super.onResume();
    GMTrace.o(12804505468928L, 95401);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\WalletMultiRcptSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */