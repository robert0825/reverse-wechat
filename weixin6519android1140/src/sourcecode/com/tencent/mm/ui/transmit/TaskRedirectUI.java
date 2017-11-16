package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.a;

@a(7)
public class TaskRedirectUI
  extends Activity
{
  public TaskRedirectUI()
  {
    GMTrace.i(3018556702720L, 22490);
    GMTrace.o(3018556702720L, 22490);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3018690920448L, 22491);
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, LauncherUI.class);
    paramBundle.addFlags(268435456);
    paramBundle.addFlags(67108864);
    startActivity(paramBundle);
    finish();
    GMTrace.o(3018690920448L, 22491);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\transmit\TaskRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */