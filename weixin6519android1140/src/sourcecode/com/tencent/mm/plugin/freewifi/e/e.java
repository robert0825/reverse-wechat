package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.w;

public class e
{
  protected String appId;
  protected int cfz;
  protected String eCE;
  protected int eqV;
  protected final Intent intent;
  protected FreeWifiFrontPageUI lqY;
  protected String lqZ;
  protected int lra;
  protected String lrb;
  protected String ssid;
  
  public e(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    GMTrace.i(7244401868800L, 53975);
    this.lqY = paramFreeWifiFrontPageUI;
    this.intent = paramFreeWifiFrontPageUI.getIntent();
    this.ssid = this.intent.getStringExtra("free_wifi_ssid");
    this.lqZ = this.intent.getStringExtra("free_wifi_url");
    this.eCE = this.intent.getStringExtra("free_wifi_ap_key");
    this.cfz = this.intent.getIntExtra("free_wifi_source", 1);
    this.eqV = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.lrb = this.intent.getStringExtra("free_wifi_app_nickname");
    this.lra = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    w.i("MicroMsg.FreeWifi.ProtocolBase", "sessionKey=%s, step=%d, desc=Data retrieved. ssid=%s, fullUrl=%s, apKey=%s, source=%s, channelId=%d, appid=%s, appNickName=%s, protocolNumber=%d", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), this.ssid, this.lqZ, this.eCE, Integer.valueOf(this.cfz), Integer.valueOf(this.eqV), this.appId, this.lrb, Integer.valueOf(this.lra) });
    GMTrace.o(7244401868800L, 53975);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */