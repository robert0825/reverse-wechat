package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.pluginsdk.i.c;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.pb.common.c.h;

public class FreeWifiCopyPwdUI
  extends MMActivity
{
  public static int lsS;
  private String appId;
  private String eCE;
  private int eqV;
  private ae ghS;
  private Intent intent;
  private int lra;
  private int lsT;
  private int lsU;
  protected TextView lsV;
  protected TextView lsW;
  protected TextView lsX;
  private String ssid;
  
  static
  {
    GMTrace.i(7232053837824L, 53883);
    lsS = 111;
    GMTrace.o(7232053837824L, 53883);
  }
  
  public FreeWifiCopyPwdUI()
  {
    GMTrace.i(7230309007360L, 53870);
    this.lsT = 1;
    this.lsU = 2;
    this.ghS = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7184540762112L, 53529);
        paramAnonymousMessage = (FreeWifiCopyPwdUI.b)paramAnonymousMessage.obj;
        if (paramAnonymousMessage.ltd == FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this))
        {
          FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this, paramAnonymousMessage.data);
          GMTrace.o(7184540762112L, 53529);
          return;
        }
        FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this, paramAnonymousMessage.data);
        GMTrace.o(7184540762112L, 53529);
      }
    };
    GMTrace.o(7230309007360L, 53870);
  }
  
  private void goBack()
  {
    GMTrace.i(7230845878272L, 53874);
    l.r(d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = com.tencent.mm.plugin.freewifi.k.aAB();
    ((k.a)localObject).eCE = this.eCE;
    ((k.a)localObject).lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
    ((k.a)localObject).lox = k.b.lph.lpi;
    ((k.a)localObject).loy = k.b.lph.name;
    ((k.a)localObject).ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
    ((k.a)localObject).low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).jNb = "";
    ((k.a)localObject).aAD().b(this.intent, true).aAC();
    localObject = new Intent();
    com.tencent.mm.plugin.freewifi.g.hnH.i((Intent)localObject, this);
    finish();
    GMTrace.o(7230845878272L, 53874);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7230980096000L, 53875);
    int i = R.i.cxr;
    GMTrace.o(7230980096000L, 53875);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7230577442816L, 53872);
    if ((paramInt1 == lsS) && (com.tencent.mm.plugin.freewifi.m.aAI()) && (!h.isNullOrEmpty(this.ssid)) && (this.ssid.equals(d.aAY())))
    {
      w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(this.intent)) });
      paramIntent = com.tencent.mm.plugin.freewifi.k.aAB();
      paramIntent.ssid = this.ssid;
      paramIntent.bssid = com.tencent.mm.plugin.freewifi.m.yt("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.eCF = com.tencent.mm.plugin.freewifi.m.yu("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.eCE = this.eCE;
      paramIntent.lou = this.appId;
      paramIntent.lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
      paramIntent.low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
      paramIntent.lox = k.b.loI.lpi;
      paramIntent.loy = k.b.loI.name;
      paramIntent.result = 0;
      paramIntent.ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
      paramIntent.aAD().aAC();
      com.tencent.mm.plugin.freewifi.m.a(this.intent, this.eCE, this.lra, this.eqV, new m.a()
      {
        public final void h(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(7174205997056L, 53452);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if (!(paramAnonymousk instanceof a))
            {
              GMTrace.o(7174205997056L, 53452);
              return;
            }
            paramAnonymousString = ((a)paramAnonymousk).aBs();
            if (paramAnonymousString != null)
            {
              w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymousString.lTf, paramAnonymousString.jio, paramAnonymousString.jhi, Integer.valueOf(paramAnonymousString.tSG), paramAnonymousString.tSH, paramAnonymousString.gCA, paramAnonymousString.tSI });
              FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this, new FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this, FreeWifiCopyPwdUI.b(FreeWifiCopyPwdUI.this), paramAnonymousString));
              GMTrace.o(7174205997056L, 53452);
              return;
            }
            w.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo is null");
            paramAnonymousString = FreeWifiCopyPwdUI.this;
            paramAnonymousk = FreeWifiCopyPwdUI.this;
            paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
            localObject = new FreeWifiCopyPwdUI.a();
            ((FreeWifiCopyPwdUI.a)localObject).ltc = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.loK, 21);
            FreeWifiCopyPwdUI.a(paramAnonymousString, new FreeWifiCopyPwdUI.b(paramAnonymousk, paramAnonymousInt1, localObject));
            GMTrace.o(7174205997056L, 53452);
            return;
          }
          if ((com.tencent.mm.plugin.freewifi.m.cg(paramAnonymousInt1, paramAnonymousInt2)) && (!com.tencent.mm.plugin.freewifi.m.yp(paramAnonymousString)))
          {
            paramAnonymousk = FreeWifiCopyPwdUI.this;
            localObject = FreeWifiCopyPwdUI.this;
            paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
            FreeWifiCopyPwdUI.a locala = new FreeWifiCopyPwdUI.a();
            locala.text = paramAnonymousString;
            locala.ltc = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.loK, paramAnonymousInt2);
            FreeWifiCopyPwdUI.a(paramAnonymousk, new FreeWifiCopyPwdUI.b((FreeWifiCopyPwdUI)localObject, paramAnonymousInt1, locala));
            GMTrace.o(7174205997056L, 53452);
            return;
          }
          paramAnonymousString = FreeWifiCopyPwdUI.this;
          paramAnonymousk = FreeWifiCopyPwdUI.this;
          paramAnonymousInt1 = FreeWifiCopyPwdUI.c(FreeWifiCopyPwdUI.this);
          Object localObject = new FreeWifiCopyPwdUI.a();
          ((FreeWifiCopyPwdUI.a)localObject).ltc = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(FreeWifiCopyPwdUI.this), k.b.loK, paramAnonymousInt2);
          FreeWifiCopyPwdUI.a(paramAnonymousString, new FreeWifiCopyPwdUI.b(paramAnonymousk, paramAnonymousInt1, localObject));
          GMTrace.o(7174205997056L, 53452);
        }
      }, "MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
    }
    GMTrace.o(7230577442816L, 53872);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7230443225088L, 53871);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7233261797376L, 53892);
        FreeWifiCopyPwdUI.a(FreeWifiCopyPwdUI.this);
        GMTrace.o(7233261797376L, 53892);
        return true;
      }
    });
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.eCE = this.intent.getStringExtra("free_wifi_ap_key");
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.eqV = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.lra = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    ((TextView)findViewById(R.h.bBF)).setText(this.ssid);
    paramBundle = getIntent().getStringExtra("free_wifi_passowrd");
    c.a(this.vKB.vKW, "wifi password", paramBundle);
    ((Button)findViewById(R.h.bBp)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7201586413568L, 53656);
        paramAnonymousView = new Intent("android.settings.WIFI_SETTINGS");
        FreeWifiCopyPwdUI.this.startActivityForResult(paramAnonymousView, FreeWifiCopyPwdUI.lsS);
        GMTrace.o(7201586413568L, 53656);
      }
    });
    this.lsV = ((TextView)findViewById(R.h.bBr));
    this.lsW = ((TextView)findViewById(R.h.bBq));
    this.lsX = ((TextView)findViewById(R.h.bBs));
    paramBundle = d.aAX();
    String str = getIntent().getStringExtra("free_wifi_ap_key");
    int i = getIntent().getIntExtra("free_wifi_protocol_type", 0);
    com.tencent.mm.plugin.report.service.g.ork.i(12651, new Object[] { Integer.valueOf(6), paramBundle, Integer.valueOf(0), str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i) });
    GMTrace.o(7230443225088L, 53871);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7230711660544L, 53873);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7230711660544L, 53873);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7230711660544L, 53873);
    return bool;
  }
  
  public static final class a
  {
    public static a lta;
    public int ltb;
    public String ltc;
    public String text;
    
    static
    {
      GMTrace.i(7186419810304L, 53543);
      lta = new a();
      GMTrace.o(7186419810304L, 53543);
    }
    
    public a()
    {
      GMTrace.i(7185748721664L, 53538);
      GMTrace.o(7185748721664L, 53538);
    }
  }
  
  public final class b
  {
    Object data;
    int ltd;
    
    public b(int paramInt, Object paramObject)
    {
      GMTrace.i(7196486139904L, 53618);
      this.ltd = paramInt;
      this.data = paramObject;
      GMTrace.o(7196486139904L, 53618);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiCopyPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */