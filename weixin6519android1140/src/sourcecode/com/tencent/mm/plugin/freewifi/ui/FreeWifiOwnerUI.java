package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public class FreeWifiOwnerUI
  extends Activity
{
  public FreeWifiOwnerUI()
  {
    GMTrace.i(7172595384320L, 53440);
    GMTrace.o(7172595384320L, 53440);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7172729602048L, 53441);
    super.onCreate(paramBundle);
    GMTrace.o(7172729602048L, 53441);
  }
  
  protected void onResume()
  {
    GMTrace.i(7172863819776L, 53442);
    super.onResume();
    String str = getIntent().getStringExtra("wifi_owner_name");
    int i = getIntent().getIntExtra("wifi_owner_type", 0);
    com.tencent.mm.plugin.freewifi.j.userName = str;
    com.tencent.mm.plugin.freewifi.j.type = i;
    finish();
    GMTrace.o(7172863819776L, 53442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiOwnerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */