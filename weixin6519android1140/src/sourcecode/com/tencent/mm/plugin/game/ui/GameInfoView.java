package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.w;

public class GameInfoView
  extends RelativeLayout
  implements View.OnClickListener
{
  private int fKA;
  int lNQ;
  String lYA;
  String lYB;
  String lYC;
  ImageView lYD;
  String lYE;
  private int lYF;
  private int lYG;
  private int lYH;
  int lYI;
  String lYJ;
  FrameLayout lYp;
  ImageView lYq;
  private TextView lYr;
  FrameLayout lYs;
  ImageView lYt;
  ImageView lYu;
  ImageView lYv;
  RelativeLayout lYw;
  ImageView lYx;
  TextView lYy;
  ImageView lYz;
  Context mContext;
  
  public GameInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12771622125568L, 95156);
    this.lYA = "";
    this.lYB = "";
    this.lYC = "";
    this.lNQ = 0;
    this.fKA = 0;
    this.lYE = "";
    this.lYF = 1;
    this.lYG = 2;
    this.lYH = 3;
    this.lYI = 4;
    this.mContext = paramContext;
    GMTrace.o(12771622125568L, 95156);
  }
  
  public final void aGA()
  {
    GMTrace.i(12771890561024L, 95158);
    this.fKA = SubCoreGameCenter.aGf().aFC();
    if ((this.fKA > 0) && (this.fKA <= 99))
    {
      this.lYr.setVisibility(0);
      this.lYr.setText(this.fKA);
      GMTrace.o(12771890561024L, 95158);
      return;
    }
    if (this.fKA > 99)
    {
      this.lYr.setVisibility(0);
      this.lYr.setText("99+");
      this.lYr.setTextSize(1, 9.0F);
      GMTrace.o(12771890561024L, 95158);
      return;
    }
    this.lYr.setVisibility(8);
    GMTrace.o(12771890561024L, 95158);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12772024778752L, 95159);
    int i = paramView.getId();
    if (i == R.h.bCK)
    {
      if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
      {
        GMTrace.o(12772024778752L, 95159);
        return;
      }
      paramView = (String)paramView.getTag();
      i = c.p(this.mContext, paramView, "game_center_profile");
      ai.a(this.mContext, 10, 1001, this.lYI, i, this.lNQ, this.lYJ);
      GMTrace.o(12772024778752L, 95159);
      return;
    }
    if (i == R.h.bEH)
    {
      if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
      {
        paramView = (String)paramView.getTag();
        i = c.p(this.mContext, paramView, "game_center_msgcenter");
      }
      for (;;)
      {
        paramView = null;
        if (this.lYr.getVisibility() == 0) {
          paramView = ai.ct("resource", "5");
        }
        ai.a(this.mContext, 10, 1001, this.lYG, i, 0, null, this.lNQ, 0, null, null, paramView);
        GMTrace.o(12772024778752L, 95159);
        return;
        paramView = a.aEZ();
        if (paramView.eQl == 2)
        {
          i = c.p(this.mContext, paramView.url, "game_center_msgcenter");
        }
        else
        {
          paramView = new Intent(this.mContext, GameMessageUI.class);
          paramView.putExtra("game_report_from_scene", 1001);
          paramView.putExtra("game_unread_msg_count", this.fKA);
          paramView.putExtra("game_manage_url", this.lYE);
          this.mContext.startActivity(paramView);
          i = 6;
        }
      }
    }
    if (i == R.h.bDZ)
    {
      if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
      {
        paramView = (String)paramView.getTag();
        i = c.p(this.mContext, paramView, "game_center_giftcenter");
        paramView = null;
        if (this.lYu.getVisibility() == 0) {
          paramView = ai.ct("resource", "5");
        }
        ai.a(this.mContext, 10, 1001, this.lYH, i, 0, null, this.lNQ, 0, null, null, paramView);
      }
      GMTrace.o(12772024778752L, 95159);
      return;
    }
    if (i == R.h.cav)
    {
      if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String))) {
        break label462;
      }
      paramView = (String)paramView.getTag();
      i = c.p(this.mContext, paramView, "game_center_msgcenter");
    }
    for (;;)
    {
      ai.a(this.mContext, 14, 1401, 1, i, 0, null, this.lNQ, 0, null, null, null);
      GMTrace.o(12772024778752L, 95159);
      return;
      label462:
      paramView = a.aEZ();
      if (paramView.eQl == 2)
      {
        i = c.p(this.mContext, paramView.url, "game_center_msgcenter");
      }
      else
      {
        paramView = new Intent(this.mContext, GameSearchUI.class);
        paramView.putExtra("game_report_from_scene", 1001);
        this.mContext.startActivity(paramView);
        i = 6;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12771756343296L, 95157);
    super.onFinishInflate();
    this.lYw = ((RelativeLayout)findViewById(R.h.bCK));
    this.lYw.setOnClickListener(this);
    this.lYx = ((ImageView)findViewById(R.h.bUj));
    this.lYy = ((TextView)findViewById(R.h.bUt));
    this.lYz = ((ImageView)findViewById(R.h.bfR));
    this.lYp = ((FrameLayout)findViewById(R.h.bEH));
    this.lYp.setOnClickListener(this);
    this.lYq = ((ImageView)findViewById(R.h.bMY));
    this.lYr = ((TextView)findViewById(R.h.bEJ));
    this.lYs = ((FrameLayout)findViewById(R.h.bDZ));
    this.lYs.setOnClickListener(this);
    this.lYt = ((ImageView)findViewById(R.h.bFo));
    this.lYu = ((ImageView)findViewById(R.h.bFp));
    this.lYD = ((ImageView)findViewById(R.h.cap));
    this.lYv = ((ImageView)findViewById(R.h.cav));
    this.lYv.setOnClickListener(this);
    w.i("MicroMsg.GameInfoView", "initView finished");
    GMTrace.o(12771756343296L, 95157);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */