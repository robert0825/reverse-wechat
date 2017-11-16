package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  protected int lNQ;
  
  public j()
  {
    GMTrace.i(12676864409600L, 94450);
    this.lNQ = 0;
    GMTrace.o(12676864409600L, 94450);
  }
  
  private void a(Context paramContext, com.tencent.mm.plugin.game.model.c paramc)
  {
    GMTrace.i(12677401280512L, 94454);
    int i = 0;
    if (paramc.type == 1) {
      i = com.tencent.mm.plugin.game.d.c.aa(paramContext, paramc.lLy);
    }
    for (;;)
    {
      ai.a(paramContext, paramc.scene, paramc.eSa, paramc.position, i, paramc.field_appId, this.lNQ, paramc.eBv, paramc.lLN);
      GMTrace.o(12677401280512L, 94454);
      return;
      if (paramc.type == 0) {
        if ((paramc.aFb()) && (!bg.nm(paramc.lLS.lPE)) && (!g.a(paramContext, paramc)))
        {
          i = com.tencent.mm.plugin.game.d.c.aa(paramContext, paramc.lLS.lPE);
        }
        else
        {
          if ((bg.nm(paramc.fdR)) || (paramc.fdU != 4)) {
            break;
          }
          w.i("MicroMsg.GameItemClickListener", "Download via Google Play");
          q.aR(paramContext, paramc.fdR);
          i = 25;
        }
      }
    }
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("game_app_id", paramc.field_appId);
    if (paramc.eSa == 1601) {
      localBundle.putInt("game_report_from_scene", this.lNQ);
    }
    for (;;)
    {
      i = com.tencent.mm.plugin.game.d.c.a(paramContext, paramc.field_appId, paramc.lLy, localBundle);
      break;
      localBundle.putInt("game_report_from_scene", paramc.eSa);
    }
  }
  
  public final void oJ(int paramInt)
  {
    GMTrace.i(12676998627328L, 94451);
    this.lNQ = paramInt;
    GMTrace.o(12676998627328L, 94451);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12677267062784L, 94453);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c)))
    {
      GMTrace.o(12677267062784L, 94453);
      return;
    }
    com.tencent.mm.plugin.game.model.c localc = (com.tencent.mm.plugin.game.model.c)paramView.getTag();
    a(paramView.getContext(), localc);
    GMTrace.o(12677267062784L, 94453);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(12677132845056L, 94452);
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView == null) || (!(paramAdapterView instanceof com.tencent.mm.plugin.game.model.c)))
    {
      GMTrace.o(12677132845056L, 94452);
      return;
    }
    paramAdapterView = (com.tencent.mm.plugin.game.model.c)paramAdapterView;
    if (bg.nm(paramAdapterView.field_appId))
    {
      GMTrace.o(12677132845056L, 94452);
      return;
    }
    a(paramView.getContext(), paramAdapterView);
    GMTrace.o(12677132845056L, 94452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */