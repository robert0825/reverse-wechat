package com.tencent.mm.plugin.webview.stub;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ry;
import com.tencent.mm.g.a.ry.a;
import com.tencent.mm.g.a.ry.b;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.plugin.base.model.d.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.pluginsdk.p.h;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(7)
public class WebViewStubProxyUI
  extends MMActivity
{
  public static boolean rHt;
  private aj euU;
  private int leu;
  private e rEM;
  private boolean rHu;
  private int rHv;
  private final e rHw;
  private DialogInterface.OnDismissListener rHx;
  private aj rHy;
  
  static
  {
    GMTrace.i(12451647062016L, 92772);
    rHt = false;
    GMTrace.o(12451647062016L, 92772);
  }
  
  public WebViewStubProxyUI()
  {
    GMTrace.i(12449902231552L, 92759);
    this.rEM = null;
    this.rHu = false;
    this.rHw = new e()
    {
      public final void LF(String paramAnonymousString)
      {
        GMTrace.i(12427622088704L, 92593);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).LF(paramAnonymousString);
        GMTrace.o(12427622088704L, 92593);
      }
      
      public final void Q(Bundle paramAnonymousBundle)
      {
        GMTrace.i(12427487870976L, 92592);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).Q(paramAnonymousBundle);
        GMTrace.o(12427487870976L, 92592);
      }
      
      public final void R(Bundle paramAnonymousBundle)
      {
        GMTrace.i(12428293177344L, 92598);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).R(paramAnonymousBundle);
        GMTrace.o(12428293177344L, 92598);
      }
      
      public final String Zi()
      {
        GMTrace.i(12426682564608L, 92586);
        String str = WebViewStubProxyUI.a(WebViewStubProxyUI.this).Zi();
        GMTrace.o(12426682564608L, 92586);
        return str;
      }
      
      public final boolean a(c paramAnonymousc)
      {
        GMTrace.i(12426279911424L, 92583);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).a(paramAnonymousc);
        GMTrace.o(12426279911424L, 92583);
        return false;
      }
      
      public final boolean a(final String paramAnonymousString1, final String paramAnonymousString2, final Bundle paramAnonymousBundle, final boolean paramAnonymousBoolean)
      {
        GMTrace.i(12426414129152L, 92584);
        w.i("MicroMsg.callbackerWrapper", "onHandleEnd in callbackerWrapper");
        WebViewStubProxyUI.rHt = WebViewStubProxyUI.LE(paramAnonymousString2);
        WebViewStubProxyUI.this.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12428964265984L, 92603);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(WebViewStubProxyUI.b(WebViewStubProxyUI.this)).a(null, null, null);
            WebViewStubProxyUI.this.finish();
            try
            {
              WebViewStubProxyUI.a(WebViewStubProxyUI.this).a(paramAnonymousString1, paramAnonymousString2, paramAnonymousBundle, paramAnonymousBoolean);
              GMTrace.o(12428964265984L, 92603);
              return;
            }
            catch (Exception localException)
            {
              w.w("MicroMsg.callbackerWrapper", "wrapper onHandleEnd, ex = " + localException.getMessage());
              GMTrace.o(12428964265984L, 92603);
            }
          }
        });
        GMTrace.o(12426414129152L, 92584);
        return false;
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12425877258240L, 92580);
        GMTrace.o(12425877258240L, 92580);
        return null;
      }
      
      public final String bDg()
      {
        GMTrace.i(12426548346880L, 92585);
        String str = WebViewStubProxyUI.a(WebViewStubProxyUI.this).bDg();
        GMTrace.o(12426548346880L, 92585);
        return str;
      }
      
      public final String bDh()
      {
        GMTrace.i(12426816782336L, 92587);
        String str = WebViewStubProxyUI.a(WebViewStubProxyUI.this).bDh();
        GMTrace.o(12426816782336L, 92587);
        return str;
      }
      
      public final void bDi()
      {
        GMTrace.i(12427353653248L, 92591);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).bDi();
        GMTrace.o(12427353653248L, 92591);
      }
      
      public final void bDj()
      {
        GMTrace.i(12427756306432L, 92594);
        if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) == null)
        {
          GMTrace.o(12427756306432L, 92594);
          return;
        }
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).bDj();
        GMTrace.o(12427756306432L, 92594);
      }
      
      public final Bundle d(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(12428158959616L, 92597);
        paramAnonymousBundle = WebViewStubProxyUI.a(WebViewStubProxyUI.this).d(paramAnonymousInt, paramAnonymousBundle);
        GMTrace.o(12428158959616L, 92597);
        return paramAnonymousBundle;
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(12427890524160L, 92595);
        GMTrace.o(12427890524160L, 92595);
      }
      
      public final void ei(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(12428024741888L, 92596);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).ei(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(12428024741888L, 92596);
      }
      
      public final void ej(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(16003048144896L, 119232);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).ej(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(16003048144896L, 119232);
      }
      
      public final void jt(boolean paramAnonymousBoolean)
      {
        GMTrace.i(12426951000064L, 92588);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).jt(paramAnonymousBoolean);
        GMTrace.o(12426951000064L, 92588);
      }
      
      public final void ju(boolean paramAnonymousBoolean)
      {
        GMTrace.i(12427085217792L, 92589);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).ju(paramAnonymousBoolean);
        GMTrace.o(12427085217792L, 92589);
      }
      
      public final void jv(boolean paramAnonymousBoolean)
      {
        GMTrace.i(12428427395072L, 92599);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).jv(paramAnonymousBoolean);
        GMTrace.o(12428427395072L, 92599);
      }
      
      public final boolean m(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(12426145693696L, 92582);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).m(paramAnonymousInt, paramAnonymousBundle);
        GMTrace.o(12426145693696L, 92582);
        return false;
      }
      
      public final void o(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(12427219435520L, 92590);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).o(paramAnonymousInt, paramAnonymousBundle);
        GMTrace.o(12427219435520L, 92590);
      }
      
      public final boolean xC(int paramAnonymousInt)
      {
        GMTrace.i(12426011475968L, 92581);
        WebViewStubProxyUI.a(WebViewStubProxyUI.this).xC(paramAnonymousInt);
        GMTrace.o(12426011475968L, 92581);
        return false;
      }
    };
    this.rHx = new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12465471488000L, 92875);
        if (!WebViewStubProxyUI.this.isFinishing()) {
          WebViewStubProxyUI.this.finish();
        }
        GMTrace.o(12465471488000L, 92875);
      }
    };
    this.leu = 0;
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12453391892480L, 92785);
        if ((WebViewStubProxyUI.this.getWindow() == null) || (WebViewStubProxyUI.this.getWindow().getDecorView() == null) || (WebViewStubProxyUI.this.getWindow().getDecorView().getWindowToken() == null))
        {
          if (WebViewStubProxyUI.c(WebViewStubProxyUI.this) < 10)
          {
            WebViewStubProxyUI.d(WebViewStubProxyUI.this);
            GMTrace.o(12453391892480L, 92785);
            return true;
          }
          w.e("MicroMsg.WebViewStubProxyUI", "timer reach max retry time, finish ProxyUI");
          WebViewStubProxyUI.this.finish();
          GMTrace.o(12453391892480L, 92785);
          return false;
        }
        WebViewStubProxyUI.e(WebViewStubProxyUI.this);
        WebViewStubProxyUI.f(WebViewStubProxyUI.this);
        GMTrace.o(12453391892480L, 92785);
        return false;
      }
    }, true);
    this.rHy = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12446815223808L, 92736);
        if (!WebViewStubProxyUI.this.isFinishing()) {
          WebViewStubProxyUI.this.finish();
        }
        GMTrace.o(12446815223808L, 92736);
        return false;
      }
    }, true);
    GMTrace.o(12449902231552L, 92759);
  }
  
  protected final int Qf()
  {
    GMTrace.i(12450170667008L, 92761);
    int i = getIntent().getIntExtra("screen_orientation", -1);
    GMTrace.o(12450170667008L, 92761);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12450304884736L, 92762);
    GMTrace.o(12450304884736L, 92762);
    return -1;
  }
  
  @TargetApi(21)
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12450036449280L, 92760);
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.et(21)) {
      getWindow().setStatusBarColor(0);
    }
    paramBundle = (WebViewStubCallbackWrapper)getIntent().getParcelableExtra("webview_stub_callbacker_key");
    if (paramBundle != null) {
      this.rEM = paramBundle.rKr;
    }
    paramBundle = getIntent();
    int i = paramBundle.getIntExtra("proxyui_action_code_key", 0);
    this.rHv = paramBundle.getIntExtra("webview_binder_id", 0);
    w.i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.rHv) });
    if ("startMonitoringBeacons".equals(paramBundle.getStringExtra("proxyui_function_key"))) {
      rHt = true;
    }
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(12450036449280L, 92760);
      return;
      if (!this.rHu) {
        this.euU.z(100L, 100L);
      }
      if (rHt)
      {
        this.rHy.z(5000L, 5000L);
        GMTrace.o(12450036449280L, 92760);
        return;
        final Object localObject = new ry();
        ((ry)localObject).eDO = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12453660327936L, 92787);
            if (!localObject.eWL.eWM)
            {
              WebViewStubProxyUI.this.finish();
              GMTrace.o(12453660327936L, 92787);
              return;
            }
            if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) != null) {}
            try
            {
              WebViewStubProxyUI.a(WebViewStubProxyUI.this).m(1001, null);
              WebViewStubProxyUI.this.finish();
              p.e locale = p.a.tlX;
              if (locale != null) {
                locale.am(WebViewStubProxyUI.this);
              }
              GMTrace.o(12453660327936L, 92787);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              for (;;)
              {
                w.w("MicroMsg.WebViewStubProxyUI", "dealUpdate fail, ex = " + localRemoteException.getMessage());
              }
            }
          }
        };
        ((ry)localObject).eWK.context = this;
        ((ry)localObject).eWK.type = paramBundle.getIntExtra("update_type_key", 0);
        if (((ry)localObject).eWK.type <= 0)
        {
          w.e("MicroMsg.WebViewStubProxyUI", "doUpdate fail, invalid type = " + ((ry)localObject).eWK.type);
          finish();
          GMTrace.o(12450036449280L, 92760);
          return;
        }
        com.tencent.mm.sdk.b.a.vgX.a((b)localObject, Looper.myLooper());
        GMTrace.o(12450036449280L, 92760);
        return;
        at.AR();
        paramBundle = com.tencent.mm.y.c.yS().CB("@t.qq.com");
        if (!q.Al()) {
          paramBundle = com.tencent.mm.ui.base.h.a(this, R.l.djU, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12420374331392L, 92539);
              com.tencent.mm.plugin.webview.a.a.hnH.h(new Intent(), WebViewStubProxyUI.this);
              GMTrace.o(12420374331392L, 92539);
            }
          }, null);
        }
        while (paramBundle == null)
        {
          finish();
          GMTrace.o(12450036449280L, 92760);
          return;
          if ((paramBundle == null) || (bg.nm(paramBundle.name)))
          {
            paramBundle = com.tencent.mm.ui.base.h.h(this, R.l.eaW, R.l.cUG);
          }
          else
          {
            paramBundle = bg.nl(getIntent().getStringExtra("shortUrl"));
            paramBundle = new ac(getIntent().getIntExtra("type", 0), paramBundle);
            at.wS().a(paramBundle, 0);
            try
            {
              this.rEM.xC(0);
              paramBundle = null;
            }
            catch (Exception paramBundle)
            {
              w.w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + paramBundle.getMessage());
              paramBundle = null;
            }
          }
        }
        paramBundle.setOnDismissListener(this.rHx);
        GMTrace.o(12450036449280L, 92760);
        return;
        this.euU.z(100L, 100L);
        GMTrace.o(12450036449280L, 92760);
        return;
        if (p.a.tmf != null)
        {
          p.a.tmf.a(this, paramBundle.getStringExtra("proxyui_handle_event_url"), this.rHx);
          GMTrace.o(12450036449280L, 92760);
          return;
          i = getIntent().getIntExtra("proxyui_expired_errtype", 0);
          int j = getIntent().getIntExtra("proxyui_expired_errcode", 0);
          if ((i == 0) && (j == 0))
          {
            w.e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
            GMTrace.o(12450036449280L, 92760);
            return;
          }
          paramBundle = new com.tencent.mm.g.a.c();
          paramBundle.ezQ.ezR = this;
          paramBundle.ezQ.errType = i;
          paramBundle.ezQ.errCode = j;
          com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
          GMTrace.o(12450036449280L, 92760);
          return;
          paramBundle = getIntent().getStringExtra("proxyui_phone");
          if (bg.nm(paramBundle))
          {
            w.e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
            finish();
            GMTrace.o(12450036449280L, 92760);
            return;
          }
          localObject = new Bundle();
          ((Bundle)localObject).putInt("fromScene", 3);
          j.a(this, paramBundle, this.rHx, (Bundle)localObject);
          GMTrace.o(12450036449280L, 92760);
          return;
          paramBundle = (Intent)getIntent().getExtras().getParcelable("proxyui_next_intent_key");
          paramBundle.setFlags(603979776);
          com.tencent.mm.bj.d.a(this, "accountsync", "com.tencent.mm.ui.account.SimpleLoginUI", null, paramBundle);
          finish();
          GMTrace.o(12450036449280L, 92760);
          return;
          paramBundle = getIntent().getStringExtra("KAppId");
          localObject = getIntent().getStringExtra("shortcut_user_name");
          if ((!bg.nm(paramBundle)) && (!bg.nm((String)localObject)))
          {
            getString(R.l.cUG);
            final r localr = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(12424535080960L, 92570);
                w.i("MicroMsg.WebViewStubProxyUI", "addshortcut, user cancel");
                WebViewStubProxyUI.this.finish();
                GMTrace.o(12424535080960L, 92570);
              }
            });
            localr.show();
            com.tencent.mm.plugin.base.model.d.a(ab.getContext(), (String)localObject, paramBundle, new d.a()
            {
              public final void dk(boolean paramAnonymousBoolean)
              {
                GMTrace.i(12425608822784L, 92578);
                if (localr != null) {
                  localr.dismiss();
                }
                if (paramAnonymousBoolean)
                {
                  Bundle localBundle1;
                  if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) != null)
                  {
                    localBundle1 = new Bundle();
                    localBundle1.putBoolean("add_shortcut_status", true);
                  }
                  try
                  {
                    WebViewStubProxyUI.a(WebViewStubProxyUI.this).d(54, localBundle1);
                    com.tencent.mm.ui.base.h.a(WebViewStubProxyUI.this, R.l.elc, R.l.cUG, false, new DialogInterface.OnClickListener()
                    {
                      public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                      {
                        GMTrace.i(12451915497472L, 92774);
                        WebViewStubProxyUI.this.finish();
                        GMTrace.o(12451915497472L, 92774);
                      }
                    });
                    GMTrace.o(12425608822784L, 92578);
                    return;
                  }
                  catch (Exception localException1)
                  {
                    for (;;)
                    {
                      w.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + localException1.getMessage());
                    }
                  }
                }
                Toast.makeText(WebViewStubProxyUI.this.vKB.vKW, WebViewStubProxyUI.this.vKB.vKW.getString(R.l.elb), 0).show();
                Bundle localBundle2;
                if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) != null)
                {
                  localBundle2 = new Bundle();
                  localBundle2.putBoolean("add_shortcut_status", false);
                }
                try
                {
                  WebViewStubProxyUI.a(WebViewStubProxyUI.this).d(54, localBundle2);
                  WebViewStubProxyUI.this.finish();
                  GMTrace.o(12425608822784L, 92578);
                  return;
                }
                catch (Exception localException2)
                {
                  for (;;)
                  {
                    w.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + localException2.getMessage());
                  }
                }
              }
            });
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12450439102464L, 92763);
    super.onDestroy();
    if (!rHt) {
      this.rEM = null;
    }
    w.i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
    GMTrace.o(12450439102464L, 92763);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12450573320192L, 92764);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12450573320192L, 92764);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(this.rHv).a(paramInt, -1, null);
        GMTrace.o(12450573320192L, 92764);
        return;
      }
      com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(this.rHv).a(paramInt, 0, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\WebViewStubProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */