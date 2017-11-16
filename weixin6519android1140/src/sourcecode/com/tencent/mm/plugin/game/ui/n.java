package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.sdk.platformtools.bg;

public final class n
  extends c
{
  public n(Context paramContext, int paramInt)
  {
    super(paramContext);
    GMTrace.i(12659281887232L, 94319);
    this.lNQ = paramInt;
    GMTrace.o(12659281887232L, 94319);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12659416104960L, 94320);
    if (!(paramView.getTag() instanceof q))
    {
      GMTrace.o(12659416104960L, 94320);
      return;
    }
    paramView = (q)paramView.getTag();
    switch (paramView.field_msgType)
    {
    default: 
      Bundle localBundle = new Bundle();
      localBundle.putCharSequence("game_app_id", paramView.field_appId);
      localBundle.putInt("game_report_from_scene", 1301);
      i = com.tencent.mm.plugin.game.d.c.a(this.mContext, paramView.field_appId, null, localBundle);
      ai.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
    }
    do
    {
      GMTrace.o(12659416104960L, 94320);
      return;
    } while (bg.nm(paramView.lML));
    int i = com.tencent.mm.plugin.game.d.c.aa(this.mContext, paramView.lML);
    ai.a(this.mContext, 13, 1301, 5, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
    GMTrace.o(12659416104960L, 94320);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */