package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  implements View.OnClickListener
{
  int lNQ;
  private c lNY;
  String lTQ;
  private Context mContext;
  private int mcY;
  
  public u(Context paramContext)
  {
    GMTrace.i(12731491024896L, 94857);
    this.lNQ = 0;
    this.lTQ = null;
    this.mContext = paramContext;
    GMTrace.o(12731491024896L, 94857);
  }
  
  private void aGK()
  {
    GMTrace.i(12731759460352L, 94859);
    String str2 = this.lNY.fdW;
    String str1 = str2;
    if (!bg.nm(str2)) {
      str1 = str2.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
    }
    int i;
    if (this.lNY.status == 3)
    {
      ay.aGa();
      ay.startToAuthorized(this.mContext, str1);
      i = 5;
      if (this.lNY.status == 3) {
        i = 10;
      }
      if (this.mcY != 4) {
        break label159;
      }
      i = 8;
    }
    label159:
    for (;;)
    {
      ai.a(this.mContext, this.lNY.scene, this.lNY.eSa, this.lNY.position, i, this.lNY.field_appId, this.lNQ, this.lNY.eBv, this.lTQ);
      GMTrace.o(12731759460352L, 94859);
      return;
      ay.aGa();
      ay.Z(this.mContext, str1);
      break;
    }
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12731625242624L, 94858);
    if (!(paramView.getTag() instanceof c))
    {
      w.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    this.lNY = ((c)paramView.getTag());
    w.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.lNY.field_appId);
    if (g.n(this.mContext, this.lNY.field_appId))
    {
      w.d("MicroMsg.GameTMAssistClickListener", "launchFromWX, appId = " + this.lNY.field_appId + ", pkg = " + this.lNY.field_packageName + ", openId = " + this.lNY.field_openId);
      ai.a(this.mContext, this.lNY.scene, this.lNY.eSa, 1, 3, this.lNY.field_appId, this.lNQ, this.lTQ);
      e.V(this.mContext, this.lNY.field_appId);
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    ay.aGa();
    this.mcY = ay.zM(this.lNY.fdW);
    w.i("MicroMsg.GameTMAssistClickListener", "get download status:[%s]", new Object[] { Integer.valueOf(this.mcY) });
    switch (this.mcY)
    {
    default: 
      aGK();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 1: 
      aGK();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 2: 
      aGK();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 3: 
      aGK();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 4: 
      aGK();
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    aGK();
    GMTrace.o(12731625242624L, 94858);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */