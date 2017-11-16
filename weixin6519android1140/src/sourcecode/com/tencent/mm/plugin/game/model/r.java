package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.ui.GameMessageUI;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class r
  implements View.OnClickListener
{
  public int lNQ;
  private Context mContext;
  
  public r(Context paramContext)
  {
    GMTrace.i(12616197996544L, 93998);
    this.mContext = paramContext;
    GMTrace.o(12616197996544L, 93998);
  }
  
  public r(Context paramContext, int paramInt)
  {
    GMTrace.i(12616332214272L, 93999);
    this.mContext = paramContext;
    this.lNQ = paramInt;
    GMTrace.o(12616332214272L, 93999);
  }
  
  public static int a(Context paramContext, q paramq, q.d paramd, String paramString, int paramInt)
  {
    int i = 3;
    int j = 0;
    GMTrace.i(12616600649728L, 94001);
    switch (paramd.lNE)
    {
    default: 
      w.i("MicroMsg.GameMessageClickListener", "unknown msg jump type = " + paramd.lNE);
      paramInt = 0;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
      for (;;)
      {
        GMTrace.o(12616600649728L, 94001);
        return paramInt;
        if (g.n(paramContext, paramString))
        {
          e.V(paramContext, paramString);
          paramInt = i;
        }
        else
        {
          paramInt = f(paramContext, paramString, paramInt);
          continue;
          if (g.n(paramContext, paramString))
          {
            e.V(paramContext, paramString);
            paramInt = i;
          }
          else
          {
            paramInt = 0;
            continue;
            paramInt = f(paramContext, paramString, paramInt);
            continue;
            if (paramq != null)
            {
              paramq.field_isRead = true;
              SubCoreGameCenter.aGf().c(paramq, new String[0]);
            }
            paramq = new Intent(paramContext, GameMessageUI.class);
            paramq.putExtra("game_report_from_scene", paramInt);
            paramContext.startActivity(paramq);
            paramInt = 6;
          }
        }
      }
    }
    paramq = paramd.kHd;
    if (bg.nm(paramq)) {}
    for (paramInt = j;; paramInt = c.aa(paramContext, paramq)) {
      break;
    }
  }
  
  private static int f(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(12616734867456L, 94002);
    if (bg.nm(paramString))
    {
      GMTrace.o(12616734867456L, 94002);
      return 0;
    }
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("game_app_id", paramString);
    localBundle.putInt("game_report_from_scene", paramInt);
    paramInt = c.a(paramContext, paramString, null, localBundle);
    GMTrace.o(12616734867456L, 94002);
    return paramInt;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12616466432000L, 94000);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      w.e("MicroMsg.GameMessageClickListener", "v.getTag is null");
      GMTrace.o(12616466432000L, 94000);
      return;
    }
    paramView = (a)paramView.getTag();
    if (paramView.lLX == null)
    {
      w.e("MicroMsg.GameMessageClickListener", "message is null");
      GMTrace.o(12616466432000L, 94000);
      return;
    }
    if (paramView.lNN == null)
    {
      w.e("MicroMsg.GameMessageClickListener", "jumpId is null");
      GMTrace.o(12616466432000L, 94000);
      return;
    }
    q.d locald = (q.d)paramView.lLX.lMR.get(paramView.lNN);
    if (locald == null)
    {
      w.e("MicroMsg.GameMessageClickListener", "jumpInfo is null");
      GMTrace.o(12616466432000L, 94000);
      return;
    }
    int i = a(this.mContext, paramView.lLX, locald, paramView.lLX.field_appId, paramView.eSa);
    if (i != 0) {
      ai.a(this.mContext, 13, paramView.eSa, paramView.position, i, 0, paramView.lLX.field_appId, this.lNQ, paramView.lLX.lNv, paramView.lLX.field_gameMsgId, paramView.lLX.lNw, null);
    }
    GMTrace.o(12616466432000L, 94000);
  }
  
  public static final class a
  {
    public int eSa;
    public q lLX;
    public String lNN;
    public int position;
    
    public a(q paramq, String paramString, int paramInt)
    {
      GMTrace.i(12592307240960L, 93820);
      this.lLX = paramq;
      this.lNN = paramString;
      this.eSa = 1301;
      this.position = paramInt;
      GMTrace.o(12592307240960L, 93820);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */