package com.tencent.mm.plugin.freewifi.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiNoWifiUI
  extends MMActivity
{
  public FreeWifiNoWifiUI()
  {
    GMTrace.i(7186554028032L, 53544);
    GMTrace.o(7186554028032L, 53544);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7186822463488L, 53546);
    GMTrace.o(7186822463488L, 53546);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7186956681216L, 53547);
    int i = R.i.cxw;
    GMTrace.o(7186956681216L, 53547);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7186688245760L, 53545);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7168703070208L, 53411);
        FreeWifiNoWifiUI.this.finish();
        GMTrace.o(7168703070208L, 53411);
        return true;
      }
    });
    GMTrace.o(7186688245760L, 53545);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiNoWifiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */