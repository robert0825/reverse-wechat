package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountInputPassUI
  extends MMActivity
{
  public SettingDeleteAccountInputPassUI()
  {
    GMTrace.i(4624203382784L, 34453);
    GMTrace.o(4624203382784L, 34453);
  }
  
  protected final void MP()
  {
    GMTrace.i(4624606035968L, 34456);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4687017279488L, 34921);
        SettingDeleteAccountInputPassUI.this.aLo();
        SettingDeleteAccountInputPassUI.this.finish();
        GMTrace.o(4687017279488L, 34921);
        return true;
      }
    });
    a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4706478850048L, 35066);
        SettingDeleteAccountInputPassUI.this.aLo();
        SettingDeleteAccountInputPassUI.this.startActivity(new Intent(SettingDeleteAccountInputPassUI.this, SettingDeleteAccountUI.class));
        GMTrace.o(4706478850048L, 35066);
        return true;
      }
    });
    GMTrace.o(4624606035968L, 34456);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4624337600512L, 34454);
    int i = R.i.cFY;
    GMTrace.o(4624337600512L, 34454);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4624471818240L, 34455);
    super.onCreate(paramBundle);
    oM(R.l.dXM);
    MP();
    GMTrace.o(4624471818240L, 34455);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingDeleteAccountInputPassUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */