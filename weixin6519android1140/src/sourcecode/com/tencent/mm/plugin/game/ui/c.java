package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class c
  implements View.OnClickListener
{
  protected int kRx;
  protected int lNQ;
  protected Context mContext;
  
  public c(Context paramContext)
  {
    GMTrace.i(12772561649664L, 95163);
    this.mContext = paramContext;
    this.kRx = 1301;
    if (paramContext == null) {
      throw new IllegalArgumentException("context is null.");
    }
    GMTrace.o(12772561649664L, 95163);
  }
  
  protected static int a(Context paramContext, q paramq)
  {
    GMTrace.i(12772695867392L, 95164);
    if (paramq == null)
    {
      w.e("MicroMsg.GameMessageOnClickListener", "game message is null.");
      GMTrace.o(12772695867392L, 95164);
      return 0;
    }
    if (!bg.nm(paramq.field_appId))
    {
      Bundle localBundle = new Bundle();
      localBundle.putCharSequence("game_app_id", paramq.field_appId);
      localBundle.putInt("game_report_from_scene", 1301);
      int i = com.tencent.mm.plugin.game.d.c.a(paramContext, paramq.field_appId, null, localBundle);
      GMTrace.o(12772695867392L, 95164);
      return i;
    }
    w.e("MicroMsg.GameMessageOnClickListener", "message type : " + paramq.field_msgType + " ,message.field_appId is null.");
    GMTrace.o(12772695867392L, 95164);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */