package com.tencent.mm.kiss;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;

public abstract class MMPresenterActivity
  extends MMActivity
{
  private c gaw;
  
  public MMPresenterActivity()
  {
    GMTrace.i(452716396544L, 3373);
    this.gaw = new c();
    GMTrace.o(452716396544L, 3373);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(452850614272L, 3374);
    super.onCreate(paramBundle);
    this.gaw.B(getIntent(), this);
    GMTrace.o(452850614272L, 3374);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(453253267456L, 3377);
    super.onDestroy();
    this.gaw.onDestroy();
    GMTrace.o(453253267456L, 3377);
  }
  
  protected void onPause()
  {
    GMTrace.i(453119049728L, 3376);
    super.onPause();
    this.gaw.Ez(3);
    GMTrace.o(453119049728L, 3376);
  }
  
  protected void onResume()
  {
    GMTrace.i(452984832000L, 3375);
    super.onResume();
    this.gaw.Ez(2);
    GMTrace.o(452984832000L, 3375);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\kiss\MMPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */