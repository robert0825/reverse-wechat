package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends c
{
  public o(Context paramContext, int paramInt)
  {
    super(paramContext);
    GMTrace.i(12756858175488L, 95046);
    this.lNQ = paramInt;
    GMTrace.o(12756858175488L, 95046);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12756992393216L, 95047);
    paramView = paramView.getTag();
    if (paramView == null)
    {
      w.e("MicroMsg.GameMessageOnClickListener", "Tag is null.");
      paramView = null;
    }
    while (paramView == null)
    {
      w.e("MicroMsg.GameMessageContentClickListener", "The game message is null.");
      GMTrace.o(12756992393216L, 95047);
      return;
      if (!(paramView instanceof Long))
      {
        w.e("MicroMsg.GameMessageOnClickListener", "The tag of action listener is not instance of Long");
        paramView = null;
      }
      else
      {
        paramView = SubCoreGameCenter.aGf().cA(((Long)paramView).longValue());
        if (paramView != null) {
          paramView.aFr();
        }
      }
    }
    switch (paramView.field_msgType)
    {
    case 7: 
    case 8: 
    case 9: 
    default: 
      i = a(this.mContext, paramView);
      ai.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
    }
    do
    {
      do
      {
        GMTrace.o(12756992393216L, 95047);
        return;
        if (!bg.nm(paramView.lME))
        {
          i = com.tencent.mm.plugin.game.d.c.aa(this.mContext, paramView.lME);
          ai.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
          GMTrace.o(12756992393216L, 95047);
          return;
        }
        i = a(this.mContext, paramView);
        ai.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
        GMTrace.o(12756992393216L, 95047);
        return;
      } while (bg.nm(paramView.lNg));
      i = com.tencent.mm.plugin.game.d.c.aa(this.mContext, paramView.lNg);
      ai.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
      GMTrace.o(12756992393216L, 95047);
      return;
    } while (bg.nm(paramView.lNj));
    int i = com.tencent.mm.plugin.game.d.c.aa(this.mContext, paramView.lNj);
    ai.a(this.mContext, 13, 1301, 3, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
    GMTrace.o(12756992393216L, 95047);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */