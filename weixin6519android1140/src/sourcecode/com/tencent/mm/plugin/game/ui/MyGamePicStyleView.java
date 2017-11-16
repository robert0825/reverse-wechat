package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.c.be;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.w;

public class MyGamePicStyleView
  extends LinearLayout
  implements View.OnClickListener
{
  String appId;
  int lNQ;
  Context mContext;
  TextView mdm;
  TextView mdn;
  ImageView mdo;
  
  public MyGamePicStyleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12687736045568L, 94531);
    this.mContext = paramContext;
    GMTrace.o(12687736045568L, 94531);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12688004481024L, 94533);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof x)))
    {
      w.w("MicroMsg.MyGamePicStyleView", "jumpURL is null");
      GMTrace.o(12688004481024L, 94533);
      return;
    }
    paramView = (x)paramView.getTag();
    int i = c.p(this.mContext, paramView.lQs.lPE, "game_center_mygame_comm");
    ai.a(this.mContext, 10, 1002, paramView.lQp, i, this.appId, this.lNQ, ai.zJ(paramView.lPF));
    GMTrace.o(12688004481024L, 94533);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12687870263296L, 94532);
    super.onFinishInflate();
    this.mdm = ((TextView)findViewById(R.h.bOk));
    this.mdn = ((TextView)findViewById(R.h.bOj));
    this.mdo = ((ImageView)findViewById(R.h.bTj));
    w.i("MicroMsg.MyGamePicStyleView", "initView finished");
    GMTrace.o(12687870263296L, 94532);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\MyGamePicStyleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */