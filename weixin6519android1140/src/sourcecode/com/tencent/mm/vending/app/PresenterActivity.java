package com.tencent.mm.vending.app;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.e.b;

public abstract class PresenterActivity
  extends Activity
  implements b
{
  private c gaw;
  
  public PresenterActivity()
  {
    GMTrace.i(254208376832L, 1894);
    this.gaw = new c();
    GMTrace.o(254208376832L, 1894);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(254342594560L, 1895);
    super.onCreate(paramBundle);
    this.gaw.B(getIntent(), this);
    GMTrace.o(254342594560L, 1895);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(254745247744L, 1898);
    this.gaw.onDestroy();
    super.onDestroy();
    GMTrace.o(254745247744L, 1898);
  }
  
  protected void onPause()
  {
    GMTrace.i(254611030016L, 1897);
    this.gaw.Ez(3);
    super.onPause();
    GMTrace.o(254611030016L, 1897);
  }
  
  protected void onResume()
  {
    GMTrace.i(254476812288L, 1896);
    super.onResume();
    this.gaw.Ez(2);
    GMTrace.o(254476812288L, 1896);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\vending\app\PresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */