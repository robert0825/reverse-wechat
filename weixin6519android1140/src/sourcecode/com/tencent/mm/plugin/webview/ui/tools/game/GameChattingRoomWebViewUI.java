package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.applet.e;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.w;

public class GameChattingRoomWebViewUI
  extends WebViewUI
{
  private String jumpUrl;
  private int rQo;
  private int rQp;
  final o.a rQq;
  final o.a rQr;
  
  public GameChattingRoomWebViewUI()
  {
    GMTrace.i(12331522195456L, 91877);
    this.jumpUrl = "";
    this.rQo = 4;
    this.rQp = 5;
    this.rQq = new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(12328703623168L, 91856);
        GameChattingRoomWebViewUI.this.setResult(GameChattingRoomWebViewUI.a(GameChattingRoomWebViewUI.this), new Intent());
        GameChattingRoomWebViewUI.this.finish();
        GMTrace.o(12328703623168L, 91856);
      }
    };
    this.rQr = new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(12339038388224L, 91933);
        paramAnonymousString = new Intent();
        paramAnonymousString.putExtra("rawUrl", GameChattingRoomWebViewUI.b(GameChattingRoomWebViewUI.this));
        GameChattingRoomWebViewUI.this.setResult(GameChattingRoomWebViewUI.c(GameChattingRoomWebViewUI.this), paramAnonymousString);
        GameChattingRoomWebViewUI.this.finish();
        GMTrace.o(12339038388224L, 91933);
      }
    };
    GMTrace.o(12331522195456L, 91877);
  }
  
  protected final void Mi(String paramString)
  {
    GMTrace.i(12331790630912L, 91879);
    w.i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", new Object[] { paramString });
    this.jumpUrl = paramString;
    String str1 = getIntent().getStringExtra("action");
    if (str1 != null)
    {
      paramString = getIntent().getStringExtra("app_name");
      if (paramString == null) {}
      String str2;
      for (paramString = getString(R.l.cRO);; paramString = getString(R.l.dir, new Object[] { paramString }))
      {
        str2 = getString(R.l.diy);
        if (!str1.equals("action_create")) {
          break;
        }
        e.a(this.vKB, getString(R.l.dmc), paramString, str2, this.rQq, this.rQr);
        GMTrace.o(12331790630912L, 91879);
        return;
      }
      if (str1.equals("action_join")) {
        e.a(this.vKB, getString(R.l.dFU), paramString, str2, this.rQq, this.rQr);
      }
    }
    GMTrace.o(12331790630912L, 91879);
  }
  
  protected final boolean zF(String paramString)
  {
    GMTrace.i(12331656413184L, 91878);
    GMTrace.o(12331656413184L, 91878);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\GameChattingRoomWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */