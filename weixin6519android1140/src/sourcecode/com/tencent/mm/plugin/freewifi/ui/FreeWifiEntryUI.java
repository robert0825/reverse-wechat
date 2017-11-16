package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.freewifi.g.c;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.at;

@a(3)
public class FreeWifiEntryUI
  extends Activity
{
  public FreeWifiEntryUI()
  {
    GMTrace.i(7222658596864L, 53813);
    GMTrace.o(7222658596864L, 53813);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7222792814592L, 53814);
    super.onCreate(paramBundle);
    GMTrace.o(7222792814592L, 53814);
  }
  
  protected void onResume()
  {
    int i = 1;
    GMTrace.i(7222927032320L, 53815);
    super.onResume();
    if (!at.AU()) {
      finish();
    }
    for (;;)
    {
      finish();
      GMTrace.o(7222927032320L, 53815);
      return;
      Intent localIntent = getIntent();
      int j = getIntent().getIntExtra("free_wifi_source", 1);
      w.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "has notified, now scene is : %d", new Object[] { Integer.valueOf(j) });
      Object localObject;
      switch (j)
      {
      default: 
        break;
      case 1: 
        if (1 != i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0)) {
          i.a.loq.aZ("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        }
        m.d(localIntent, localIntent.getStringExtra("free_wifi_mid"));
        localIntent.setClass(this, FreeWifiNetCheckUI.class);
        startActivity(localIntent);
        super.overridePendingTransition(R.a.aMb, R.a.aMa);
        break;
      case 3: 
        localIntent.putExtra("free_wifi_auth_type", 2);
        localIntent.setClass(this, FreeWifiMIGNoAuthStateUI.class);
        startActivity(localIntent);
        break;
      case 2: 
        localObject = j.aBe().yH(com.tencent.mm.plugin.freewifi.model.d.aAY());
        if (localObject == null)
        {
          w.e("MicroMsg.FreeWifi.FreeWifiEntryUI", "what the fuck, how could it be???");
        }
        else
        {
          w.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "banner click, freeWifiInfo.field_action:%d, field_showUrl:%s", new Object[] { Integer.valueOf(((c)localObject).field_action), ((c)localObject).field_showUrl });
          if ((((c)localObject).field_action == 2) && (!bg.nm(((c)localObject).field_showUrl)))
          {
            ((com.tencent.mm.plugin.appbrand.k.d)h.h(com.tencent.mm.plugin.appbrand.k.d.class)).b(this, ((c)localObject).field_showUrl, 1064, null);
          }
          else if ((((c)localObject).field_action == 1) && (!bg.nm(((c)localObject).field_showUrl)))
          {
            localIntent = new Intent();
            String str = v.d(getSharedPreferences(ab.bPU(), 0));
            localIntent.putExtra("rawUrl", Uri.parse(((c)localObject).field_showUrl).buildUpon().appendQueryParameter("lang", str).build().toString());
            localIntent.putExtra("show_bottom", false);
            com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
          }
          else
          {
            localIntent.setClass(this, FreeWifiAuthStateUI.class);
            startActivity(localIntent);
          }
        }
        break;
      case 5: 
        if (1 != i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0)) {
          i.a.loq.aZ("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        }
        localObject = localIntent.getStringExtra("free_wifi_ap_key");
        if (!m.yp((String)localObject))
        {
          getIntent().putExtra("free_wifi_channel_id", 1);
          if ("_p33beta".equalsIgnoreCase((String)localObject))
          {
            m.B(localIntent);
            localIntent.putExtra("free_wifi_auth_type", 33);
            localIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 33);
            localIntent.putExtra("free_wifi_ssid", m.ys("MicroMsg.FreeWifi.FreeWifiEntryUI"));
            localIntent.putExtra("free_wifi_url", (String)localObject);
            localIntent.putExtra("free_wifi_ap_key", (String)localObject);
            localIntent.putExtra("free_wifi_source", 5);
            localIntent.putExtra("free_wifi_channel_id", 1);
            localIntent.setClass(this, FreeWifiFrontPageUI.class);
            startActivity(localIntent);
            super.overridePendingTransition(R.a.aMb, R.a.aMa);
          }
          else if (((String)localObject).startsWith("_"))
          {
            localObject = getString(R.l.dxJ);
            localIntent = new Intent();
            localIntent.putExtra("free_wifi_error_ui_error_msg", (String)localObject);
            localIntent.setClass(this, FreeWifiErrorUI.class);
            startActivity(localIntent);
            super.overridePendingTransition(R.a.aMb, R.a.aMa);
          }
          else
          {
            j = localIntent.getIntExtra("free_wifi_threeone_startup_type", 0);
            if (2 == j) {
              i = 11;
            }
            for (;;)
            {
              localIntent.putExtra("free_wifi_channel_id", i);
              localIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
              m.d(localIntent, localIntent.getStringExtra("free_wifi_schema_ticket"));
              if (j == 4) {
                localIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID", m.C(localIntent) + "_" + m.E(localIntent) + "_" + m.F(localIntent) + "_" + System.currentTimeMillis());
              }
              localIntent.setClass(this, FreeWifiNetCheckUI.class);
              startActivity(localIntent);
              super.overridePendingTransition(R.a.aMb, R.a.aMa);
              break;
              if (3 == j) {
                i = 12;
              } else if (4 == j) {
                i = 13;
              }
            }
          }
        }
        break;
      case 4: 
        if (1 != i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0)) {
          i.a.loq.aZ("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        }
        localIntent.setClass(this, FreeWifiNetCheckUI.class);
        startActivity(localIntent);
        super.overridePendingTransition(R.a.aMb, R.a.aMa);
        break;
      case 6: 
        if (1 != i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0)) {
          i.a.loq.aZ("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        }
        localIntent.setClass(this, FreeWifiNetCheckUI.class);
        startActivity(localIntent);
        super.overridePendingTransition(R.a.aMb, R.a.aMa);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiEntryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */