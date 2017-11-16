package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.h.a;
import com.tencent.mm.plugin.freewifi.model.h.b;
import com.tencent.mm.protocal.c.azx;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.protocal.c.ur;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FreeWifiNetCheckUI
  extends MMActivity
{
  private String amf;
  private int ePH;
  private aj euU;
  private Intent intent;
  ImageView ltO;
  private final int ltR;
  private final int ltS;
  private int[] ltU;
  ae ltV;
  private b luc;
  private int scene;
  
  public FreeWifiNetCheckUI()
  {
    GMTrace.i(7189104164864L, 53563);
    this.ltR = 1;
    this.ltS = 2;
    this.ltU = new int[] { R.g.aWA, R.g.aWB, R.g.aWC, R.g.aWD, R.g.aWE };
    this.ltV = new ae()
    {
      int i;
      
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7206149816320L, 53690);
        if (paramAnonymousMessage.what == 1)
        {
          if (this.i >= FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this).length) {
            this.i = 0;
          }
          FreeWifiNetCheckUI.this.ltO.setImageResource(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this)[this.i]);
          this.i += 1;
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(7206149816320L, 53690);
          return;
          if (paramAnonymousMessage.what == 2) {
            FreeWifiNetCheckUI.this.ltO.setImageResource(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this)[(FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this).length - 1)]);
          }
        }
      }
    };
    GMTrace.o(7189104164864L, 53563);
  }
  
  private void aBZ()
  {
    GMTrace.i(7189506818048L, 53566);
    if (bg.nm(this.amf))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      finish();
      GMTrace.o(7189506818048L, 53566);
      return;
    }
    this.luc = new b(this, this.amf, this.ePH);
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.connectFreewifi, desc=base params are ready and it will connets wifi.apKey=%s, channel=%d", new Object[] { m.C(getIntent()), Integer.valueOf(m.D(this.intent)), this.amf, Integer.valueOf(this.ePH) });
    b localb = this.luc;
    if (bg.nm(localb.eCE))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      localb.activity.finish();
    }
    localb.activity.getIntent().putExtra("free_wifi_url", localb.eCE);
    localb.activity.getIntent().putExtra("free_wifi_ap_key", localb.eCE);
    if (bg.nm(localb.eCE))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ap key is null");
      localb.activity.finish();
      GMTrace.o(7189506818048L, 53566);
      return;
    }
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo, desc=it starts net request [getApInfo] for retrieving protocol type and frontpage info. apKey=%s, channel=%d", new Object[] { m.C(localb.intent), Integer.valueOf(m.D(localb.intent)), localb.eCE, Integer.valueOf(localb.ePH) });
    k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
    locala.eCE = localb.eCE;
    locala.lov = m.C(localb.intent);
    locala.lox = k.b.loF.lpi;
    locala.loy = k.b.loF.name;
    locala.ePH = localb.ePH;
    locala.low = m.E(localb.intent);
    locala.aAD().b(localb.intent, false).aAC();
    new a(localb.eCE, localb.ePH, m.C(localb.intent)).u(localb.activity).b(new b.1(localb));
    GMTrace.o(7189506818048L, 53566);
  }
  
  public void finish()
  {
    GMTrace.i(7189238382592L, 53564);
    if (this.euU != null) {
      this.euU.stopTimer();
    }
    this.ltV.sendEmptyMessage(2);
    super.finish();
    GMTrace.o(7189238382592L, 53564);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7189641035776L, 53567);
    int i = R.i.cxv;
    GMTrace.o(7189641035776L, 53567);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(7189372600320L, 53565);
    super.onCreate(paramBundle);
    oM(R.l.dyb);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7226550910976L, 53842);
        FreeWifiNetCheckUI.this.finish();
        GMTrace.o(7226550910976L, 53842);
        return true;
      }
    });
    this.intent = getIntent();
    m.B(this.intent);
    this.amf = getIntent().getStringExtra("free_wifi_ap_key");
    this.scene = getIntent().getIntExtra("free_wifi_source", 1);
    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.onCreate, desc=it goes into black loading ui and starts to connect. get qrcode key = %s, current connected ssid = %s", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), this.amf, d.aAV() });
    this.ltO = ((ImageView)findViewById(R.h.bBh));
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7163737014272L, 53374);
        FreeWifiNetCheckUI.this.ltV.sendEmptyMessage(1);
        GMTrace.o(7163737014272L, 53374);
        return true;
      }
    }, true);
    this.euU.z(200L, 200L);
    switch (this.scene)
    {
    case 2: 
    case 3: 
    default: 
      w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "unkown scene, just finish");
      finish();
    }
    for (;;)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.handleRequstByScene, desc=it decides the channel. channel=%d", new Object[] { m.C(getIntent()), Integer.valueOf(m.D(this.intent)), Integer.valueOf(this.ePH) });
      GMTrace.o(7189372600320L, 53565);
      return;
      paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
      if ("1".equals(paramBundle))
      {
        getIntent().putExtra("free_wifi_channel_id", 9);
        this.ePH = 9;
      }
      for (;;)
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
        if ((!paramBundle.equals("0")) || (!bg.nm(this.amf))) {
          break label417;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key fail");
        finish();
        break;
        if ("0".equals(paramBundle))
        {
          getIntent().putExtra("free_wifi_channel_id", 8);
          this.ePH = 8;
        }
        else
        {
          getIntent().putExtra("free_wifi_channel_id", 4);
          this.ePH = 4;
        }
      }
      label417:
      if (paramBundle.equals("0"))
      {
        aBZ();
      }
      else if (paramBundle.equals("1"))
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_username");
        if (!d.isWifiEnabled()) {
          d.aAS();
        }
        h.b.lqv.a(new h.a()
        {
          public final void aG(List<ScanResult> paramAnonymousList)
          {
            GMTrace.i(7157697216512L, 53329);
            if ((paramAnonymousList == null) || (paramAnonymousList.size() == 0))
            {
              FreeWifiNetCheckUI.this.finish();
              FreeWifiNetCheckUI.c(FreeWifiNetCheckUI.this);
              GMTrace.o(7157697216512L, 53329);
              return;
            }
            azx localazx = new azx();
            localazx.uNW = new LinkedList();
            paramAnonymousList = paramAnonymousList.iterator();
            while (paramAnonymousList.hasNext())
            {
              ScanResult localScanResult = (ScanResult)paramAnonymousList.next();
              if (localScanResult != null)
              {
                ck localck = new ck();
                localck.mac = localScanResult.BSSID;
                localck.tQu = localScanResult.level;
                localck.ssid = localScanResult.SSID;
                localazx.uNW.add(localck);
              }
            }
            paramAnonymousList = com.tencent.mm.plugin.freewifi.k.aAB();
            paramAnonymousList.lov = m.C(FreeWifiNetCheckUI.b(FreeWifiNetCheckUI.this));
            paramAnonymousList.lox = k.b.loP.lpi;
            paramAnonymousList.loy = k.b.loP.name;
            paramAnonymousList.ePH = 9;
            paramAnonymousList.aAD().aAC();
            new com.tencent.mm.plugin.freewifi.d.k(paramBundle, localazx, 9, m.C(FreeWifiNetCheckUI.this.getIntent())).b(new e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
              {
                GMTrace.i(7162126401536L, 53362);
                paramAnonymous2String = ((com.tencent.mm.plugin.freewifi.d.k)paramAnonymous2k).aBz();
                if (!bg.nm(paramAnonymous2String))
                {
                  FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, paramAnonymous2String);
                  FreeWifiNetCheckUI.this.getIntent().putExtra("free_wifi_ap_key", paramAnonymous2String);
                  FreeWifiNetCheckUI.d(FreeWifiNetCheckUI.this);
                  FreeWifiNetCheckUI.e(FreeWifiNetCheckUI.this);
                  GMTrace.o(7162126401536L, 53362);
                  return;
                }
                FreeWifiNetCheckUI.this.finish();
                FreeWifiNetCheckUI.c(FreeWifiNetCheckUI.this);
                GMTrace.o(7162126401536L, 53362);
              }
            });
            GMTrace.o(7157697216512L, 53329);
          }
        });
      }
      else
      {
        w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "undefined jsapi type");
        finish();
        continue;
        this.ePH = getIntent().getIntExtra("free_wifi_channel_id", 1);
        if (bg.nm(this.amf))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
          finish();
        }
        else
        {
          aBZ();
          continue;
          getIntent().putExtra("free_wifi_channel_id", 2);
          this.ePH = 2;
          if (bg.nm(this.amf))
          {
            w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
            finish();
          }
          else
          {
            paramBundle = null;
            final Object localObject2 = "";
            try
            {
              localObject1 = Uri.parse(this.amf);
              paramBundle = (Bundle)localObject1;
              localObject3 = ((Uri)localObject1).getQueryParameter("q");
              localObject2 = localObject3;
              paramBundle = (Bundle)localObject1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                final Object localObject1;
                Object localObject3;
                finish();
              }
              "_test".equals(localObject2);
              aBZ();
            }
            if ("pc".equalsIgnoreCase((String)localObject2))
            {
              localObject1 = paramBundle.getQueryParameter("appid");
              localObject2 = paramBundle.getQueryParameter("shopid");
              paramBundle = paramBundle.getQueryParameter("ticket");
              m.d(getIntent(), paramBundle);
              localObject3 = com.tencent.mm.plugin.freewifi.k.aAB();
              ((k.a)localObject3).lot = ((String)localObject2);
              ((k.a)localObject3).lou = ((String)localObject1);
              ((k.a)localObject3).lov = paramBundle;
              ((k.a)localObject3).lox = k.b.lpc.lpi;
              ((k.a)localObject3).loy = k.b.lpc.name;
              ((k.a)localObject3).aAD().aAC();
              w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=It starts NetSceneGetPcFrontPage.shopid=%s, appid=%s, ticket=%s", new Object[] { m.C(getIntent()), Integer.valueOf(m.D(getIntent())), localObject2, localObject1, paramBundle });
              new com.tencent.mm.plugin.freewifi.d.h((String)localObject1, Integer.valueOf((String)localObject2).intValue(), paramBundle).b(new e()
              {
                public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
                {
                  GMTrace.i(7172461166592L, 53439);
                  if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                  {
                    paramAnonymousString = ((com.tencent.mm.plugin.freewifi.d.h)paramAnonymousk).aBp();
                    if (paramAnonymousString != null)
                    {
                      paramAnonymousk = FreeWifiNetCheckUI.this.getIntent();
                      paramAnonymousk.putExtra("free_wifi_appid", paramAnonymousString.lTf);
                      paramAnonymousk.putExtra("free_wifi_head_img_url", paramAnonymousString.lQe);
                      paramAnonymousk.putExtra("free_wifi_welcome_msg", paramAnonymousString.umU);
                      paramAnonymousk.putExtra("free_wifi_welcome_sub_title", paramAnonymousString.lPG);
                      paramAnonymousk.putExtra("free_wifi_privacy_url", paramAnonymousString.umV);
                      paramAnonymousk.putExtra("free_wifi_app_nickname", paramAnonymousString.jio);
                      paramAnonymousk.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", localObject2);
                      paramAnonymousk.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET", paramBundle);
                      paramAnonymousk.setClass(FreeWifiNetCheckUI.this, FreeWifiPcUI.class);
                      FreeWifiNetCheckUI.this.finish();
                      FreeWifiNetCheckUI.this.startActivity(paramAnonymousk);
                    }
                  }
                  for (;;)
                  {
                    paramAnonymousString = com.tencent.mm.plugin.freewifi.k.aAB();
                    paramAnonymousString.lot = localObject2;
                    paramAnonymousString.lou = localObject1;
                    paramAnonymousString.lov = paramBundle;
                    paramAnonymousString.lox = k.b.lpd.lpi;
                    paramAnonymousString.loy = k.b.lpd.name;
                    paramAnonymousString.result = paramAnonymousInt2;
                    paramAnonymousString.aAD().aAC();
                    w.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=NetSceneGetPcFrontPage returns.errcode=%d", new Object[] { m.C(FreeWifiNetCheckUI.this.getIntent()), Integer.valueOf(m.D(FreeWifiNetCheckUI.this.getIntent())), Integer.valueOf(paramAnonymousInt2) });
                    GMTrace.o(7172461166592L, 53439);
                    return;
                    if ((m.cg(paramAnonymousInt1, paramAnonymousInt2)) && (!m.yp(paramAnonymousString))) {
                      FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, paramAnonymousString + "(" + m.a(m.E(FreeWifiNetCheckUI.b(FreeWifiNetCheckUI.this)), k.b.lpd, paramAnonymousInt2) + ")", "");
                    } else {
                      FreeWifiNetCheckUI.a(FreeWifiNetCheckUI.this, FreeWifiNetCheckUI.this.getString(R.l.dxD), FreeWifiNetCheckUI.this.getString(R.l.dxE));
                    }
                  }
                }
              });
            }
            else
            {
              continue;
              getIntent().putExtra("free_wifi_channel_id", 10);
              this.ePH = 10;
              if (bg.nm(this.amf))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
                finish();
              }
              else
              {
                aBZ();
              }
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7189775253504L, 53568);
    super.onDestroy();
    if (this.luc != null) {
      this.luc = null;
    }
    this.euU.stopTimer();
    GMTrace.o(7189775253504L, 53568);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7189909471232L, 53569);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      GMTrace.o(7189909471232L, 53569);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7189909471232L, 53569);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiNetCheckUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */