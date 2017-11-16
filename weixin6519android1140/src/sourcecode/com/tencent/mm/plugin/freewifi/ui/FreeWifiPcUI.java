package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
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
import com.tencent.mm.ad.e;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.freewifi.d.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;

public class FreeWifiPcUI
  extends MMActivity
{
  private String appId;
  private String eEU;
  private Button jgH;
  private String lrb;
  private Button ltn;
  private String ltt;
  private TextView lui;
  private int luj;
  private r luk;
  
  public FreeWifiPcUI()
  {
    GMTrace.i(7199036276736L, 53637);
    this.luk = null;
    GMTrace.o(7199036276736L, 53637);
  }
  
  private void goBack()
  {
    GMTrace.i(7199573147648L, 53641);
    Intent localIntent = new Intent();
    g.hnH.i(localIntent, this);
    finish();
    GMTrace.o(7199573147648L, 53641);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7199304712192L, 53639);
    GMTrace.o(7199304712192L, 53639);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7199707365376L, 53642);
    int i = R.i.cxx;
    GMTrace.o(7199707365376L, 53642);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7199170494464L, 53638);
    super.onCreate(paramBundle);
    oM(R.l.dyb);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7197291446272L, 53624);
        FreeWifiPcUI.a(FreeWifiPcUI.this);
        GMTrace.o(7197291446272L, 53624);
        return true;
      }
    });
    this.appId = getIntent().getStringExtra("free_wifi_appid");
    this.luj = getIntent().getIntExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", 0);
    this.eEU = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET");
    this.lrb = getIntent().getStringExtra("free_wifi_app_nickname");
    this.ltt = getIntent().getStringExtra("free_wifi_privacy_url");
    this.lui = ((TextView)findViewById(R.h.bBC));
    this.jgH = ((Button)findViewById(R.h.bBD));
    this.lui.setText("由" + this.lrb + "提供");
    this.jgH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(7233530232832L, 53894);
        FreeWifiPcUI.b(FreeWifiPcUI.this).setClickable(false);
        paramAnonymousView = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(7179306270720L, 53490);
            FreeWifiPcUI.a(FreeWifiPcUI.this, h.a(FreeWifiPcUI.this.vKB.vKW, FreeWifiPcUI.this.getString(R.l.diE), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
              {
                GMTrace.i(7205612945408L, 53686);
                GMTrace.o(7205612945408L, 53686);
              }
            }));
            GMTrace.o(7179306270720L, 53490);
            return true;
          }
        }, false);
        paramAnonymousView.z(2000L, 2000L);
        k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
        locala.lot = String.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this));
        locala.lou = FreeWifiPcUI.d(FreeWifiPcUI.this);
        locala.lov = FreeWifiPcUI.c(FreeWifiPcUI.this);
        locala.lox = k.b.lpe.lpi;
        locala.loy = k.b.lpe.name;
        locala.aAD().aAC();
        w.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=It starts NetSceneSetPcLoginUserInfo.shopid=%d, appid=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(FreeWifiPcUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(FreeWifiPcUI.this.getIntent())), Integer.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this)), FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this) });
        new l(FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.e(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this)).b(new e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
          {
            GMTrace.i(7217826758656L, 53777);
            paramAnonymousView.stopTimer();
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0)) {
              FreeWifiPcUI.this.finish();
            }
            for (;;)
            {
              paramAnonymous2String = com.tencent.mm.plugin.freewifi.k.aAB();
              paramAnonymous2String.lot = String.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this));
              paramAnonymous2String.lou = FreeWifiPcUI.d(FreeWifiPcUI.this);
              paramAnonymous2String.lov = FreeWifiPcUI.c(FreeWifiPcUI.this);
              paramAnonymous2String.lox = k.b.lpf.lpi;
              paramAnonymous2String.loy = k.b.lpf.name;
              paramAnonymous2String.result = paramAnonymous2Int2;
              paramAnonymous2String.aAD().aAC();
              w.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=NetSceneSetPcLoginUserInfo returns.shopid=%d, appid=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(FreeWifiPcUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(FreeWifiPcUI.this.getIntent())), Integer.valueOf(FreeWifiPcUI.e(FreeWifiPcUI.this)), FreeWifiPcUI.d(FreeWifiPcUI.this), FreeWifiPcUI.c(FreeWifiPcUI.this) });
              GMTrace.o(7217826758656L, 53777);
              return;
              if ((com.tencent.mm.plugin.freewifi.m.cg(paramAnonymous2Int1, paramAnonymous2Int2)) && (!com.tencent.mm.plugin.freewifi.m.yp(paramAnonymous2String))) {
                FreeWifiPcUI.a(FreeWifiPcUI.this, paramAnonymous2String + "(" + com.tencent.mm.plugin.freewifi.m.a(com.tencent.mm.plugin.freewifi.m.E(FreeWifiPcUI.this.getIntent()), k.b.lpf, paramAnonymous2Int2) + ")", "");
              } else {
                FreeWifiPcUI.a(FreeWifiPcUI.this, FreeWifiPcUI.this.getString(R.l.dxF), FreeWifiPcUI.this.getString(R.l.dxG));
              }
            }
          }
        });
        GMTrace.o(7233530232832L, 53894);
      }
    });
    this.ltn = ((Button)findViewById(R.h.bBE));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7177427222528L, 53476);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiPcUI.f(FreeWifiPcUI.this));
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        d.b(FreeWifiPcUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7177427222528L, 53476);
      }
    });
    GMTrace.o(7199170494464L, 53638);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7199438929920L, 53640);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7199438929920L, 53640);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7199438929920L, 53640);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */