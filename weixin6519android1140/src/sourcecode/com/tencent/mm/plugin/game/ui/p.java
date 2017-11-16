package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class p
  implements View.OnClickListener
{
  int jtE;
  private com.tencent.mm.plugin.game.model.c lMw;
  protected Context mContext;
  String maQ;
  
  public p(Context paramContext)
  {
    GMTrace.i(12746791845888L, 94971);
    this.mContext = paramContext;
    this.maQ = null;
    GMTrace.o(12746791845888L, 94971);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12746926063616L, 94972);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      w.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    this.lMw = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
    w.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.lMw.field_appId);
    if (g.n(this.mContext, this.lMw.field_appId))
    {
      w.d("MicroMsg.GamePreemptiveCliclListener", "launchFromWX, appId = " + this.lMw.field_appId + ", pkg = " + this.lMw.field_packageName + ", openId = " + this.lMw.field_openId);
      e.V(this.mContext, this.lMw.field_appId);
      ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 3, this.lMw.field_appId, this.jtE, this.lMw.eBv, this.lMw.lLN);
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    w.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", new Object[] { this.maQ });
    if (!bg.nm(this.maQ))
    {
      com.tencent.mm.plugin.game.d.c.aa(this.mContext, this.maQ);
      ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 11, this.lMw.field_appId, this.jtE, this.lMw.eBv, this.lMw.lLN);
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    w.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
    GMTrace.o(12746926063616L, 94972);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */