package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class d
{
  public static String eTu;
  public static int eZk;
  public static String rQU;
  
  public d(Intent paramIntent)
  {
    GMTrace.i(18091073339392L, 134789);
    if (paramIntent == null)
    {
      GMTrace.o(18091073339392L, 134789);
      return;
    }
    eTu = bg.nl(paramIntent.getStringExtra("KPublisherId"));
    rQU = bg.nl(paramIntent.getStringExtra("geta8key_username"));
    eZk = bg.e(Integer.valueOf(paramIntent.getIntExtra("geta8key_scene", 0)));
    GMTrace.o(18091073339392L, 134789);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */