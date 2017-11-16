package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.safedevice.a.b;
import com.tencent.mm.plugin.safedevice.a.c;
import com.tencent.mm.plugin.safedevice.a.d;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText.b;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.y.at;

public class ModSafeDeviceNameUI
  extends MMActivity
  implements e
{
  private String eEl;
  private long hcs;
  private ProgressDialog htG;
  private String jNQ;
  private EditText orJ;
  private String orK;
  private String orL;
  
  public ModSafeDeviceNameUI()
  {
    GMTrace.i(12873627598848L, 95916);
    this.htG = null;
    GMTrace.o(12873627598848L, 95916);
  }
  
  protected final void MP()
  {
    GMTrace.i(12874164469760L, 95920);
    this.orK = getIntent().getStringExtra("safe_device_name");
    this.orL = getIntent().getStringExtra("safe_device_uid");
    this.eEl = getIntent().getStringExtra("safe_device_type");
    sq(com.tencent.mm.br.a.X(this, R.l.dUv));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12877385695232L, 95944);
        ModSafeDeviceNameUI.this.finish();
        GMTrace.o(12877385695232L, 95944);
        return true;
      }
    });
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12871077462016L, 95897);
        ModSafeDeviceNameUI.a(ModSafeDeviceNameUI.this, ModSafeDeviceNameUI.a(ModSafeDeviceNameUI.this).getText().toString());
        if (bg.nm(ModSafeDeviceNameUI.b(ModSafeDeviceNameUI.this)))
        {
          GMTrace.o(12871077462016L, 95897);
          return true;
        }
        ModSafeDeviceNameUI.this.aLo();
        paramAnonymousMenuItem = new b(ModSafeDeviceNameUI.c(ModSafeDeviceNameUI.this), ModSafeDeviceNameUI.b(ModSafeDeviceNameUI.this), ModSafeDeviceNameUI.d(ModSafeDeviceNameUI.this));
        at.wS().a(paramAnonymousMenuItem, 0);
        ModSafeDeviceNameUI.a(ModSafeDeviceNameUI.this, h.a(ModSafeDeviceNameUI.this, com.tencent.mm.br.a.X(ModSafeDeviceNameUI.this, R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(12875506647040L, 95930);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(12875506647040L, 95930);
          }
        }));
        GMTrace.o(12871077462016L, 95897);
        return true;
      }
    });
    MMEditText.b local3 = new MMEditText.b()
    {
      public final void bcg()
      {
        GMTrace.i(12872688074752L, 95909);
        if (ModSafeDeviceNameUI.a(ModSafeDeviceNameUI.this).getText().toString().trim().length() > 0)
        {
          ModSafeDeviceNameUI.this.lf(true);
          GMTrace.o(12872688074752L, 95909);
          return;
        }
        ModSafeDeviceNameUI.this.lf(false);
        GMTrace.o(12872688074752L, 95909);
      }
    };
    this.orJ = ((EditText)findViewById(R.h.bOd));
    MMEditText.c localc = new MMEditText.c(this.orJ, null, 32);
    localc.xqs = local3;
    this.orJ.addTextChangedListener(localc);
    if (!bg.nm(this.orK))
    {
      this.orJ.setText(this.orK);
      GMTrace.o(12874164469760L, 95920);
      return;
    }
    lf(false);
    GMTrace.o(12874164469760L, 95920);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12874432905216L, 95922);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = new c();
      paramString.field_devicetype = this.eEl;
      paramString.field_name = this.jNQ;
      paramString.field_uid = this.orL;
      paramString.field_createtime = this.hcs;
      f.bcf().c(paramString, new String[0]);
      h.bm(this, com.tencent.mm.br.a.X(this, R.l.dUz));
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12870406373376L, 95892);
          ModSafeDeviceNameUI.this.finish();
          GMTrace.o(12870406373376L, 95892);
        }
      }, 1000L);
      GMTrace.o(12874432905216L, 95922);
      return;
    }
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(12874432905216L, 95922);
      return;
    }
    GMTrace.o(12874432905216L, 95922);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12874298687488L, 95921);
    int i = R.i.bOd;
    GMTrace.o(12874298687488L, 95921);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12873761816576L, 95917);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(12873761816576L, 95917);
  }
  
  protected void onPause()
  {
    GMTrace.i(12874030252032L, 95919);
    at.wS().b(361, this);
    super.onPause();
    GMTrace.o(12874030252032L, 95919);
  }
  
  protected void onResume()
  {
    GMTrace.i(12873896034304L, 95918);
    at.wS().a(361, this);
    super.onResume();
    GMTrace.o(12873896034304L, 95918);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\ModSafeDeviceNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */