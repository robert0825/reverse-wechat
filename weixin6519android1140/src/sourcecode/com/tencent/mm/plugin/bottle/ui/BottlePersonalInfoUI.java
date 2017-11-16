package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.av.g;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BottlePersonalInfoUI
  extends MMPreference
  implements d.a
{
  private SharedPreferences ghC;
  private com.tencent.mm.ui.base.preference.f htU;
  private c jqB;
  private HashMap<Integer, Integer> jqC;
  private int status;
  
  public BottlePersonalInfoUI()
  {
    GMTrace.i(7606252863488L, 56671);
    this.jqC = new HashMap();
    GMTrace.o(7606252863488L, 56671);
  }
  
  protected final void MP()
  {
    boolean bool = true;
    GMTrace.i(7606655516672L, 56674);
    oM(R.l.eaM);
    this.htU = this.wky;
    this.htU.addPreferencesFromResource(R.o.eor);
    this.ghC = this.ghC;
    this.status = q.zI();
    Object localObject;
    if (getIntent().getBooleanExtra("is_allow_set", true))
    {
      this.jqB = new c(this, this.htU);
      localObject = (CheckBoxPreference)this.htU.VG("bottle_settings_show_at_main");
      if ((this.status & 0x8000) == 0) {
        break label176;
      }
    }
    for (;;)
    {
      ((CheckBoxPreference)localObject).sdM = bool;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7627996135424L, 56833);
          BottlePersonalInfoUI.this.finish();
          GMTrace.o(7627996135424L, 56833);
          return true;
        }
      });
      GMTrace.o(7606655516672L, 56674);
      return;
      localObject = this.htU;
      ((com.tencent.mm.ui.base.preference.f)localObject).VH("settings_sex");
      ((com.tencent.mm.ui.base.preference.f)localObject).VH("settings_district");
      ((com.tencent.mm.ui.base.preference.f)localObject).VH("settings_signature");
      ((com.tencent.mm.ui.base.preference.f)localObject).VH("bottle_settings_change_avatar_alert");
      break;
      label176:
      bool = false;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(7607058169856L, 56677);
    int i = R.o.eoq;
    GMTrace.o(7607058169856L, 56677);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 2;
    GMTrace.i(7607192387584L, 56678);
    paramf = paramPreference.hiu;
    if (paramf.equals("bottle_settings_change_avatar"))
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        u.fo(this);
        GMTrace.o(7607192387584L, 56678);
        return false;
      }
      k.a(this, 2, null);
      GMTrace.o(7607192387584L, 56678);
      return true;
    }
    boolean bool;
    if (paramf.equals("settings_district"))
    {
      bool = this.jqB.ahH();
      GMTrace.o(7607192387584L, 56678);
      return bool;
    }
    if (paramf.equals("settings_signature"))
    {
      bool = this.jqB.ahG();
      GMTrace.o(7607192387584L, 56678);
      return bool;
    }
    if (paramf.equals("bottle_settings_show_at_main"))
    {
      bool = this.ghC.getBoolean("bottle_settings_show_at_main", true);
      w.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch change : open = " + bool + " item value = 32768 functionId = 14");
      if (bool) {}
      for (this.status |= 0x8000;; this.status &= 0xFFFF7FFF)
      {
        if (bool) {
          i = 1;
        }
        this.jqC.put(Integer.valueOf(14), Integer.valueOf(i));
        GMTrace.o(7607192387584L, 56678);
        return true;
      }
    }
    if (paramf.equals("bottle_settings_clear_data"))
    {
      h.a(this.vKB.vKW, this.vKB.vKW.getString(R.l.diY), "", this.vKB.vKW.getString(R.l.cSl), this.vKB.vKW.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7652826415104L, 57018);
          i.ahA();
          GMTrace.o(7652826415104L, 57018);
        }
      }, null);
      GMTrace.o(7607192387584L, 56678);
      return true;
    }
    GMTrace.o(7607192387584L, 56678);
    return false;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(7607460823040L, 56680);
    if ((paramString != null) && (paramString.equals(x.Tt(q.zE()))))
    {
      Bitmap localBitmap = b.a(paramString, false, -1);
      paramString = localBitmap;
      if (localBitmap == null) {
        paramString = b.a(q.zE(), false, -1);
      }
      if (paramString != null) {
        break label91;
      }
      paramString = BitmapFactory.decodeResource(getResources(), R.g.aVS);
    }
    label91:
    for (;;)
    {
      ((HeadImgPreference)this.htU.VG("bottle_settings_change_avatar")).M(paramString);
      GMTrace.o(7607460823040L, 56680);
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7607326605312L, 56679);
    Object localObject;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(7607326605312L, 56679);
      return;
    case 3: 
      localObject = getApplicationContext();
      at.AR();
      paramIntent = k.b((Context)localObject, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 1);
      ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
      ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
      a.hnH.a(this, (Intent)localObject, 4);
      GMTrace.o(7607326605312L, 56679);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      localObject = getApplicationContext();
      at.AR();
      localObject = k.b((Context)localObject, paramIntent, com.tencent.mm.y.c.yU());
      if (localObject == null)
      {
        GMTrace.o(7607326605312L, 56679);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      n.Dh();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.ac.d.t(x.Tt(q.zE()), true));
      localIntent.putExtra("CropImage_ImgPath", (String)localObject);
      a.hnH.a(localIntent, 4, this, paramIntent);
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      w.e("MicroMsg.BottleSettignsPersonalInfoUI", "crop picture failed");
      GMTrace.o(7607326605312L, 56679);
      return;
    }
    new o(this.vKB.vKW, paramIntent).b(2, null);
    GMTrace.o(7607326605312L, 56679);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7606387081216L, 56672);
    super.onCreate(paramBundle);
    n.Dh().d(this);
    MP();
    GMTrace.o(7606387081216L, 56672);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7606521298944L, 56673);
    a.hnI.pr();
    n.Dh().e(this);
    super.onDestroy();
    GMTrace.o(7606521298944L, 56673);
  }
  
  public void onPause()
  {
    GMTrace.i(7606923952128L, 56676);
    c.ahF();
    at.AR();
    com.tencent.mm.y.c.xh().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.jqC.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      at.AR();
      com.tencent.mm.y.c.yJ().b(new g(i, j));
      w.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch  " + i + " " + j);
    }
    this.jqC.clear();
    super.onPause();
    GMTrace.o(7606923952128L, 56676);
  }
  
  public void onResume()
  {
    GMTrace.i(7606789734400L, 56675);
    HeadImgPreference localHeadImgPreference = (HeadImgPreference)this.htU.VG("bottle_settings_change_avatar");
    Bitmap localBitmap2 = b.a(x.Tt(q.zE()), false, -1);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = b.a(q.zE(), false, -1);
    }
    if (localBitmap1 != null) {
      localHeadImgPreference.M(localBitmap1);
    }
    localHeadImgPreference.slu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7623432732672L, 56799);
        paramAnonymousView = x.Tt(q.zE());
        new com.tencent.mm.pluginsdk.ui.f(BottlePersonalInfoUI.this.vKB.vKW, paramAnonymousView).bKN();
        GMTrace.o(7623432732672L, 56799);
      }
    };
    if (this.jqB != null) {
      this.jqB.update();
    }
    super.onResume();
    GMTrace.o(7606789734400L, 56675);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottlePersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */