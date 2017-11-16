package com.tencent.mm.plugin.exdevice.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class ExdeviceExpireUI
  extends MMActivity
{
  public ExdeviceExpireUI()
  {
    GMTrace.i(11056990650368L, 82381);
    GMTrace.o(11056990650368L, 82381);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11057259085824L, 82383);
    int i = R.i.cvH;
    GMTrace.o(11057259085824L, 82383);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11057124868096L, 82382);
    super.onCreate(paramBundle);
    oM(R.l.drT);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11038871257088L, 82246);
        ExdeviceExpireUI.this.finish();
        GMTrace.o(11038871257088L, 82246);
        return false;
      }
    });
    GMTrace.o(11057124868096L, 82382);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceExpireUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */