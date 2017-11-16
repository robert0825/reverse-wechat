package com.tencent.mm.plugin.auto.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ag;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.a.c;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.sdk.platformtools.w;

public class MMAutoMessageReplyReceiver
  extends BroadcastReceiver
{
  public MMAutoMessageReplyReceiver()
  {
    GMTrace.i(5211540160512L, 38829);
    GMTrace.o(5211540160512L, 38829);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(5211674378240L, 38830);
    String str = com.tencent.mm.sdk.platformtools.s.i(paramIntent, "key_username");
    if (str == null)
    {
      GMTrace.o(5211674378240L, 38830);
      return;
    }
    paramContext = ag.getResultsFromIntent(paramIntent);
    if (paramContext != null) {}
    for (paramContext = paramContext.getCharSequence("key_voice_reply_text"); paramContext == null; paramContext = null)
    {
      w.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply null", new Object[] { str });
      GMTrace.o(5211674378240L, 38830);
      return;
    }
    w.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply %s", new Object[] { str, paramContext.toString() });
    d.aOe().A(str, paramContext.toString(), com.tencent.mm.y.s.go(str));
    GMTrace.o(5211674378240L, 38830);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\auto\service\MMAutoMessageReplyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */