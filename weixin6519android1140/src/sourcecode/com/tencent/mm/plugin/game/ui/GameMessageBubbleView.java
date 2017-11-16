package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.b;
import com.tencent.mm.plugin.game.model.q.d;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public class GameMessageBubbleView
  extends LinearLayout
  implements View.OnClickListener
{
  private Context mContext;
  private boolean mHasInit;
  private q maA;
  private final long maB;
  private long maC;
  View maw;
  private TextView may;
  private ImageView maz;
  
  public GameMessageBubbleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12748268240896L, 94982);
    this.mHasInit = false;
    this.maB = 500L;
    this.maC = 0L;
    this.mContext = paramContext;
    GMTrace.o(12748268240896L, 94982);
  }
  
  public final void aGF()
  {
    GMTrace.i(12748536676352L, 94984);
    SubCoreGameCenter.aGg();
    this.maA = t.aFw();
    if (this.maA == null)
    {
      this.maw.setOnClickListener(null);
      setVisibility(8);
      GMTrace.o(12748536676352L, 94984);
      return;
    }
    this.maA.aFr();
    if ((this.maA.field_msgType == 100) && ((bg.nm(this.maA.lMQ.fLH)) || (bg.nm(this.maA.lMQ.lNB)) || (bg.nm(this.maA.lMQ.lNC)) || (!this.maA.lMR.containsKey(this.maA.lMQ.lNC))))
    {
      w.w("MicroMsg.GameMessageHeaderView", "bubble is invalid");
      this.maw.setOnClickListener(null);
      setVisibility(8);
      GMTrace.o(12748536676352L, 94984);
      return;
    }
    this.may.setText(this.maA.lMQ.fLH);
    n.Jd().a(this.maA.lMQ.lNB, this.maz);
    this.maw.setOnClickListener(this);
    setVisibility(0);
    GMTrace.o(12748536676352L, 94984);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12748670894080L, 94985);
    if (System.currentTimeMillis() - this.maC <= 500L)
    {
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    if (this.maA == null)
    {
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    SubCoreGameCenter.aGg();
    t.aFx();
    if (this.maA.field_msgType == 100)
    {
      if (!bg.nm(this.maA.lMQ.lNC))
      {
        paramView = (q.d)this.maA.lMR.get(this.maA.lMQ.lNC);
        if (paramView != null)
        {
          i = r.a(this.mContext, this.maA, paramView, this.maA.field_appId, 1007);
          if (i != 0) {
            ai.a(this.mContext, 10, 1007, 1, i, 0, this.maA.field_appId, 0, this.maA.lNv, this.maA.field_gameMsgId, this.maA.lNw, null);
          }
          if (paramView.lNE != 4)
          {
            this.maA.field_isRead = true;
            SubCoreGameCenter.aGf().c(this.maA, new String[0]);
          }
        }
      }
      this.maC = System.currentTimeMillis();
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    if ((this.maA != null) && (this.maA.lMT != 3))
    {
      this.maA.field_isRead = true;
      SubCoreGameCenter.aGf().c(this.maA, new String[0]);
    }
    int i = 0;
    switch (this.maA.lMT)
    {
    default: 
      w.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.maA.lMT);
      GMTrace.o(12748670894080L, 94985);
      return;
    case 1: 
      paramView = this.maA.lMF;
      if (!bg.nm(paramView)) {
        i = c.p(this.mContext, paramView, "game_center_bubble");
      }
      break;
    }
    for (;;)
    {
      ai.a(this.mContext, 10, 1007, 1, i, 0, this.maA.field_appId, 0, this.maA.field_msgType, this.maA.field_gameMsgId, this.maA.lNw, null);
      this.maC = System.currentTimeMillis();
      GMTrace.o(12748670894080L, 94985);
      return;
      if (!bg.nm(this.maA.field_appId))
      {
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", this.maA.field_appId);
        paramView.putInt("game_report_from_scene", 1007);
        i = c.a(this.mContext, this.maA.field_appId, null, paramView);
      }
      else
      {
        w.e("MicroMsg.GameMessageHeaderView", "message type : " + this.maA.field_msgType + " ,message.field_appId is null.");
        continue;
        paramView = new Intent(this.mContext, GameMessageUI.class);
        paramView.putExtra("game_report_from_scene", 1007);
        this.mContext.startActivity(paramView);
        i = 6;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12748402458624L, 94983);
    super.onFinishInflate();
    if (!this.mHasInit)
    {
      this.maz = ((ImageView)findViewById(R.h.bED));
      this.may = ((TextView)findViewById(R.h.bEC));
      this.maw = findViewById(R.h.bEE);
      setVisibility(8);
      this.mHasInit = true;
    }
    GMTrace.o(12748402458624L, 94983);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameMessageBubbleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */