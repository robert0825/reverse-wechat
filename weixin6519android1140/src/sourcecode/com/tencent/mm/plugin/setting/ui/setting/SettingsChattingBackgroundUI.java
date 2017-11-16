package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aw.b;
import com.tencent.mm.aw.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class SettingsChattingBackgroundUI
  extends MMPreference
{
  private f htU;
  private boolean oIT;
  private String username;
  
  public SettingsChattingBackgroundUI()
  {
    GMTrace.i(4622190116864L, 34438);
    GMTrace.o(4622190116864L, 34438);
  }
  
  private void ahJ()
  {
    GMTrace.i(4623129640960L, 34445);
    if (!k.c(this, e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(R.l.dWY), 1).show();
    }
    GMTrace.o(4623129640960L, 34445);
  }
  
  private String hh(boolean paramBoolean)
  {
    GMTrace.i(4623398076416L, 34447);
    com.tencent.mm.aw.t.Kj();
    if (this.oIT)
    {
      str = n.y("default", paramBoolean);
      GMTrace.o(4623398076416L, 34447);
      return str;
    }
    String str = n.y(this.username, paramBoolean);
    GMTrace.o(4623398076416L, 34447);
    return str;
  }
  
  protected final void MP()
  {
    GMTrace.i(4622861205504L, 34443);
    oM(R.l.dYD);
    this.htU = this.wky;
    this.oIT = getIntent().getBooleanExtra("isApplyToAll", true);
    if (!this.oIT)
    {
      Preference localPreference = this.htU.VG("settings_chatting_bg_apply_to_all");
      if (localPreference != null) {
        this.htU.c(localPreference);
      }
    }
    this.username = getIntent().getStringExtra("username");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4613197529088L, 34371);
        SettingsChattingBackgroundUI.this.aLo();
        SettingsChattingBackgroundUI.this.finish();
        GMTrace.o(4613197529088L, 34371);
        return true;
      }
    });
    GMTrace.o(4622861205504L, 34443);
  }
  
  public final int QI()
  {
    GMTrace.i(4622324334592L, 34439);
    int i = R.o.epl;
    GMTrace.o(4622324334592L, 34439);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4622995423232L, 34444);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.SettingsChattingBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_chatting_bg_select_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsSelectBgUI.class);
      paramf.putExtra("isApplyToAll", this.oIT);
      paramf.putExtra("username", this.username);
      startActivityForResult(paramf, 3);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_select_from_album"))
    {
      k.a(this, 1, null);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_take_photo"))
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.vKB.vKW, "android.permission.CAMERA", 16, "", "");
      w.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.vKB.vKW });
      if (!bool)
      {
        GMTrace.o(4622995423232L, 34444);
        return false;
      }
      ahJ();
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_apply_to_all"))
    {
      h.a(this.vKB.vKW, getString(R.l.dYE), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4592259563520L, 34215);
          SettingsChattingBackgroundUI.bey();
          GMTrace.o(4592259563520L, 34215);
        }
      }, null);
      GMTrace.o(4622995423232L, 34444);
      return true;
    }
    GMTrace.o(4622995423232L, 34444);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4622726987776L, 34442);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      for (;;)
      {
        if (!this.oIT)
        {
          setResult(-1);
          finish();
        }
        GMTrace.o(4622726987776L, 34442);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(4622726987776L, 34442);
          return;
        }
        Object localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", hh(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", hh(false));
        m localm = com.tencent.mm.plugin.setting.a.hnH;
        at.AR();
        localm.a(this, paramIntent, (Intent)localObject, c.yU(), 4, null);
        GMTrace.o(4622726987776L, 34442);
        return;
        localObject = getApplicationContext();
        at.AR();
        paramIntent = k.b((Context)localObject, paramIntent, c.yU());
        if (paramIntent == null)
        {
          GMTrace.o(4622726987776L, 34442);
          return;
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", hh(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", hh(false));
        com.tencent.mm.plugin.setting.a.hnH.a(this, (Intent)localObject, 4);
        GMTrace.o(4622726987776L, 34442);
        return;
        if (paramInt2 == -1)
        {
          at.AR();
          c.xh().set(66820, Integer.valueOf(-1));
          g.ork.i(10198, new Object[] { Integer.valueOf(-1) });
          w.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", new Object[] { Integer.valueOf(-1) });
          if (this.oIT)
          {
            at.AR();
            c.xh().set(12311, Integer.valueOf(-1));
            com.tencent.mm.aw.t.Kj().gH(1);
          }
          else
          {
            paramIntent = com.tencent.mm.aw.t.Kk();
            localObject = paramIntent.kE(this.username);
            if (localObject == null)
            {
              localObject = new com.tencent.mm.aw.a();
              ((com.tencent.mm.aw.a)localObject).username = this.username;
              ((com.tencent.mm.aw.a)localObject).gPK = -1;
              paramIntent.a((com.tencent.mm.aw.a)localObject);
            }
            else
            {
              ((com.tencent.mm.aw.a)localObject).gPK = -1;
              paramIntent.b((com.tencent.mm.aw.a)localObject);
            }
          }
        }
      }
    } while (paramInt2 == -1);
    GMTrace.o(4622726987776L, 34442);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4622458552320L, 34440);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4622458552320L, 34440);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4622592770048L, 34441);
    super.onDestroy();
    GMTrace.o(4622592770048L, 34441);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(4623263858688L, 34446);
    w.i("MicroMsg.SettingsChattingBackgroundUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4623263858688L, 34446);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(4623263858688L, 34446);
        return;
      }
      h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4671045369856L, 34802);
          SettingsChattingBackgroundUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(4671045369856L, 34802);
        }
      }, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsChattingBackgroundUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */