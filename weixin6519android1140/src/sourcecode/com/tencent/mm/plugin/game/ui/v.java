package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class v
  implements View.OnClickListener
{
  private int gRb;
  private int jP;
  private int lNQ;
  private Context mContext;
  private int mde;
  
  public v(Context paramContext)
  {
    GMTrace.i(12772158996480L, 95160);
    this.mContext = paramContext;
    this.gRb = 13;
    GMTrace.o(12772158996480L, 95160);
  }
  
  public final void cm(int paramInt1, int paramInt2)
  {
    GMTrace.i(12772293214208L, 95161);
    this.lNQ = paramInt1;
    this.mde = 1301;
    this.jP = paramInt2;
    GMTrace.o(12772293214208L, 95161);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12772427431936L, 95162);
    if (paramView.getTag() == null)
    {
      GMTrace.o(12772427431936L, 95162);
      return;
    }
    int i;
    if ((paramView.getTag() instanceof q))
    {
      paramView = (q)paramView.getTag();
      if (!bg.cc(paramView.lMM))
      {
        String str = ((q.h)paramView.lMM.get(0)).lNL;
        if (!bg.nm(str))
        {
          i = c.aa(this.mContext, str);
          ai.a(this.mContext, this.gRb, this.mde, this.jP, i, 0, paramView.field_appId, this.lNQ, paramView.field_msgType, paramView.field_gameMsgId, paramView.lNw, null);
          GMTrace.o(12772427431936L, 95162);
          return;
        }
        w.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
      }
      GMTrace.o(12772427431936L, 95162);
      return;
    }
    if ((paramView.getTag() instanceof String))
    {
      paramView = (String)paramView.getTag();
      if (bg.nm(paramView))
      {
        GMTrace.o(12772427431936L, 95162);
        return;
      }
      i = c.aa(this.mContext, paramView);
      ai.a(this.mContext, this.gRb, this.mde, this.jP, i, this.lNQ, null);
    }
    GMTrace.o(12772427431936L, 95162);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */