package com.tencent.mm.ui.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  protected static String xaQ;
  protected static String xaR;
  protected static String xaS;
  private String hyD;
  public String wlZ;
  private long xaT;
  public long xaU;
  public Activity xaV;
  private String[] xaW;
  private int xaX;
  public a xaY;
  private final long xaZ;
  
  static
  {
    GMTrace.i(2913598439424L, 21708);
    xaQ = "https://m.facebook.com/dialog/";
    xaR = "https://graph.facebook.com/";
    xaS = "https://api.facebook.com/restserver.php";
    GMTrace.o(2913598439424L, 21708);
  }
  
  public c(String paramString)
  {
    GMTrace.i(2912122044416L, 21697);
    this.wlZ = null;
    this.xaT = 0L;
    this.xaU = 0L;
    this.xaZ = 86400000L;
    this.hyD = paramString;
    GMTrace.o(2912122044416L, 21697);
  }
  
  private void a(Activity paramActivity, String[] paramArrayOfString)
  {
    GMTrace.i(2912390479872L, 21699);
    Bundle localBundle = new Bundle();
    if (paramArrayOfString.length > 0) {
      localBundle.putString("scope", TextUtils.join(",", paramArrayOfString));
    }
    com.tencent.xweb.c.io(paramActivity);
    a(paramActivity, "oauth", localBundle, new a()
    {
      public final void a(b paramAnonymousb)
      {
        GMTrace.i(2909840343040L, 21680);
        w.d("Facebook-authorize", "Login failed: " + paramAnonymousb);
        c.this.xaY.a(paramAnonymousb);
        GMTrace.o(2909840343040L, 21680);
      }
      
      public final void a(d paramAnonymousd)
      {
        GMTrace.i(2909974560768L, 21681);
        w.d("Facebook-authorize", "Login failed: " + paramAnonymousd);
        c.this.xaY.a(paramAnonymousd);
        GMTrace.o(2909974560768L, 21681);
      }
      
      public final void m(Bundle paramAnonymousBundle)
      {
        GMTrace.i(2909706125312L, 21679);
        com.tencent.xweb.c.crU();
        com.tencent.xweb.c.sync();
        c.this.WG(paramAnonymousBundle.getString("access_token"));
        c.this.WH(paramAnonymousBundle.getString("expires_in"));
        if (c.this.chr())
        {
          w.d("Facebook-authorize", "Login Success! access_token=" + c.this.wlZ + " expires=" + c.this.xaU);
          c.this.xaY.m(paramAnonymousBundle);
          GMTrace.o(2909706125312L, 21679);
          return;
        }
        c.this.xaY.a(new d("Failed to receive access token."));
        GMTrace.o(2909706125312L, 21679);
      }
      
      public final void onCancel()
      {
        GMTrace.i(2910108778496L, 21682);
        w.d("Facebook-authorize", "Login canceled");
        c.this.xaY.onCancel();
        GMTrace.o(2910108778496L, 21682);
      }
    });
    GMTrace.o(2912390479872L, 21699);
  }
  
  public final void WG(String paramString)
  {
    GMTrace.i(2913195786240L, 21705);
    this.wlZ = paramString;
    this.xaT = System.currentTimeMillis();
    GMTrace.o(2913195786240L, 21705);
  }
  
  public final void WH(String paramString)
  {
    GMTrace.i(2913330003968L, 21706);
    if (paramString != null) {
      if (!paramString.equals("0")) {
        break label39;
      }
    }
    label39:
    for (long l = 0L;; l = System.currentTimeMillis() + bg.Sz(paramString) * 1000L)
    {
      this.xaU = l;
      GMTrace.o(2913330003968L, 21706);
      return;
    }
  }
  
  public final String a(String paramString1, Bundle paramBundle, String paramString2)
  {
    GMTrace.i(2912793133056L, 21702);
    paramBundle.putString("format", "json");
    if (chr()) {
      paramBundle.putString("access_token", this.wlZ);
    }
    if (paramString1 != null) {}
    for (paramString1 = xaR + paramString1;; paramString1 = xaS)
    {
      paramString1 = e.e(paramString1, paramString2, paramBundle);
      GMTrace.o(2912793133056L, 21702);
      return paramString1;
    }
  }
  
  public final void a(Activity paramActivity, String[] paramArrayOfString, a parama)
  {
    GMTrace.i(2912256262144L, 21698);
    this.xaY = parama;
    a(paramActivity, paramArrayOfString);
    g.ork.a(582L, 0L, 1L, false);
    GMTrace.o(2912256262144L, 21698);
  }
  
  public final void a(Context paramContext, String paramString, Bundle paramBundle, a parama)
  {
    GMTrace.i(2912927350784L, 21703);
    String str = xaQ + paramString;
    paramBundle.putString("display", "touch");
    paramBundle.putString("redirect_uri", "fbconnect://success");
    if (paramString.equals("oauth"))
    {
      paramBundle.putString("type", "user_agent");
      paramBundle.putString("client_id", this.hyD);
    }
    for (;;)
    {
      if (chr()) {
        paramBundle.putString("access_token", this.wlZ);
      }
      paramString = str + "?" + e.ak(paramBundle);
      if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
        break;
      }
      e.B(paramContext, "Error", "Application requires permission to access the Internet");
      GMTrace.o(2912927350784L, 21703);
      return;
      paramBundle.putString("app_id", this.hyD);
    }
    new f(paramContext, paramString, parama).show();
    GMTrace.o(2912927350784L, 21703);
  }
  
  public final boolean chr()
  {
    GMTrace.i(2913061568512L, 21704);
    if ((this.wlZ != null) && ((this.xaU == 0L) || (System.currentTimeMillis() < this.xaU)))
    {
      GMTrace.o(2913061568512L, 21704);
      return true;
    }
    GMTrace.o(2913061568512L, 21704);
    return false;
  }
  
  public final void e(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2912524697600L, 21700);
    if (paramInt1 == this.xaX)
    {
      if (paramInt2 == -1)
      {
        String str2 = paramIntent.getStringExtra("error");
        String str1 = str2;
        if (str2 == null) {
          str1 = paramIntent.getStringExtra("error_type");
        }
        if (str1 != null)
        {
          if ((str1.equals("service_disabled")) || (str1.equals("AndroidAuthKillSwitchException")))
          {
            w.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
            a(this.xaV, this.xaW);
            GMTrace.o(2912524697600L, 21700);
            return;
          }
          if ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException")))
          {
            w.d("Facebook-authorize", "Login canceled by user.");
            this.xaY.onCancel();
            GMTrace.o(2912524697600L, 21700);
            return;
          }
          str2 = paramIntent.getStringExtra("error_description");
          paramIntent = str1;
          if (str2 != null) {
            paramIntent = str1 + ":" + str2;
          }
          w.d("Facebook-authorize", "Login failed: " + paramIntent);
          this.xaY.a(new d(paramIntent));
          GMTrace.o(2912524697600L, 21700);
          return;
        }
        WG(paramIntent.getStringExtra("access_token"));
        WH(paramIntent.getStringExtra("expires_in"));
        if (chr())
        {
          w.d("Facebook-authorize", "Login Success! access_token=" + this.wlZ + " expires=" + this.xaU);
          this.xaY.m(paramIntent.getExtras());
          GMTrace.o(2912524697600L, 21700);
          return;
        }
        this.xaY.a(new d("Failed to receive access token."));
        GMTrace.o(2912524697600L, 21700);
        return;
      }
      if (paramInt2 == 0)
      {
        if (paramIntent != null)
        {
          w.d("Facebook-authorize", "Login failed: " + paramIntent.getStringExtra("error"));
          this.xaY.a(new b(paramIntent.getStringExtra("error"), paramIntent.getIntExtra("error_code", -1), paramIntent.getStringExtra("failing_url")));
          GMTrace.o(2912524697600L, 21700);
          return;
        }
        w.d("Facebook-authorize", "Login canceled by user.");
        this.xaY.onCancel();
      }
    }
    GMTrace.o(2912524697600L, 21700);
  }
  
  public final String fC(Context paramContext)
  {
    GMTrace.i(2912658915328L, 21701);
    com.tencent.xweb.c.io(paramContext);
    com.tencent.xweb.b.crS().removeAllCookie();
    WG(null);
    this.xaU = 0L;
    GMTrace.o(2912658915328L, 21701);
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public abstract void a(d paramd);
    
    public abstract void m(Bundle paramBundle);
    
    public abstract void onCancel();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */