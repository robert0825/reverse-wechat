package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.c.cn;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MyGameVideoRecomStyleView
  extends LinearLayout
  implements View.OnClickListener
{
  String hyD;
  ImageView iCN;
  TextView kHZ;
  int lNQ;
  Context mContext;
  TextView mdA;
  TextView mdB;
  TextView mdC;
  TextView mdD;
  TextView mdE;
  RelativeLayout mdF;
  private FrameLayout mdG;
  ImageView mdH;
  
  public MyGameVideoRecomStyleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19280108191744L, 143648);
    this.mContext = paramContext;
    GMTrace.o(19280108191744L, 143648);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(19280376627200L, 143650);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof x)))
    {
      w.w("MicroMsg.MyGameVideoRecomStyleView", "getTag is null");
      GMTrace.o(19280376627200L, 143650);
      return;
    }
    paramView = (x)paramView.getTag();
    if (bg.nm(paramView.lQu.lPE))
    {
      w.w("MicroMsg.MyGameVideoRecomStyleView", "jumpUrl is null");
      GMTrace.o(19280376627200L, 143650);
      return;
    }
    int i = c.p(this.mContext, paramView.lQu.lPE, "game_center_mygame_comm");
    ai.a(this.mContext, 10, 1002, paramView.lQp, i, this.hyD, this.lNQ, ai.zJ(paramView.lPF));
    GMTrace.o(19280376627200L, 143650);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(19280242409472L, 143649);
    super.onFinishInflate();
    this.mdA = ((TextView)findViewById(R.h.bOk));
    this.mdB = ((TextView)findViewById(R.h.bOj));
    this.kHZ = ((TextView)findViewById(R.h.title));
    this.mdC = ((TextView)findViewById(R.h.bdV));
    this.mdD = ((TextView)findViewById(R.h.bdU));
    this.mdE = ((TextView)findViewById(R.h.btC));
    this.mdF = ((RelativeLayout)findViewById(R.h.bGp));
    this.mdG = ((FrameLayout)findViewById(R.h.bGq));
    this.iCN = ((ImageView)findViewById(R.h.icon));
    this.mdH = ((ImageView)findViewById(R.h.bst));
    w.i("MicroMsg.MyGameVideoRecomStyleView", "initView finished");
    GMTrace.o(19280242409472L, 143649);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\MyGameVideoRecomStyleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */