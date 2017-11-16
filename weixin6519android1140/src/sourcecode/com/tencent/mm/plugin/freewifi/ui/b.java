package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.d.i;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.protocal.c.awa;
import com.tencent.mm.protocal.c.ur;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public Activity activity;
  public String eCE;
  public int ePH;
  public Intent intent;
  
  public b(Activity paramActivity, String paramString, int paramInt)
  {
    GMTrace.i(7164542320640L, 53380);
    if ((paramActivity == null) || (bg.nm(paramString))) {
      throw new IllegalArgumentException("acitvity or apKey cannot be null.");
    }
    this.activity = paramActivity;
    this.intent = paramActivity.getIntent();
    this.eCE = paramString;
    this.ePH = paramInt;
    GMTrace.o(7164542320640L, 53380);
  }
  
  public final void yJ(String paramString)
  {
    GMTrace.i(7164676538368L, 53381);
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_error_ui_error_msg", paramString);
    localIntent.setClass(this.activity, FreeWifiErrorUI.class);
    this.activity.finish();
    this.activity.startActivity(localIntent);
    GMTrace.o(7164676538368L, 53381);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */