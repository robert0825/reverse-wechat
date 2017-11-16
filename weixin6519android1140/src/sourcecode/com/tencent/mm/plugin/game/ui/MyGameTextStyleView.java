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
import com.tencent.mm.plugin.game.c.bf;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MyGameTextStyleView
  extends LinearLayout
  implements View.OnClickListener
{
  String appId;
  TextView ikm;
  int lNQ;
  Context mContext;
  TextView mdm;
  TextView mdn;
  EllipsizingTextView mdp;
  LinearLayout mdq;
  ImageView mdr;
  ImageView mds;
  ImageView mdt;
  LinearLayout mdu;
  ImageView mdv;
  RelativeLayout mdw;
  FrameLayout mdx;
  ImageView mdy;
  ImageView mdz;
  
  public MyGameTextStyleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12730551500800L, 94850);
    this.mContext = paramContext;
    GMTrace.o(12730551500800L, 94850);
  }
  
  static void f(ImageView paramImageView, String paramString)
  {
    GMTrace.i(19281047715840L, 143655);
    if (bg.nm(paramString))
    {
      paramImageView.setVisibility(8);
      GMTrace.o(19281047715840L, 143655);
      return;
    }
    paramImageView.setVisibility(0);
    e.aGQ().g(paramImageView, paramString);
    GMTrace.o(19281047715840L, 143655);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12730819936256L, 94852);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof x)))
    {
      w.w("MicroMsg.MyGameTextStyleView", "getTag is null");
      GMTrace.o(12730819936256L, 94852);
      return;
    }
    paramView = (x)paramView.getTag();
    if (bg.nm(paramView.lQr.lPE))
    {
      w.w("MicroMsg.MyGameTextStyleView", "jumpUrl is null");
      GMTrace.o(12730819936256L, 94852);
      return;
    }
    int i = c.p(this.mContext, paramView.lQr.lPE, "game_center_mygame_comm");
    ai.a(this.mContext, 10, 1002, paramView.lQp, i, this.appId, this.lNQ, ai.zJ(paramView.lPF));
    GMTrace.o(12730819936256L, 94852);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12730685718528L, 94851);
    super.onFinishInflate();
    this.mdm = ((TextView)findViewById(R.h.bOk));
    this.mdn = ((TextView)findViewById(R.h.bOj));
    this.ikm = ((TextView)findViewById(R.h.title));
    this.mdp = ((EllipsizingTextView)findViewById(R.h.btg));
    this.mdp.setMaxLines(2);
    this.mdq = ((LinearLayout)findViewById(R.h.cfm));
    this.mdr = ((ImageView)findViewById(R.h.bsO));
    this.mds = ((ImageView)findViewById(R.h.cfk));
    this.mdt = ((ImageView)findViewById(R.h.cfi));
    this.mdu = ((LinearLayout)findViewById(R.h.bXR));
    this.mdv = ((ImageView)findViewById(R.h.bXQ));
    this.mdw = ((RelativeLayout)findViewById(R.h.bgw));
    this.mdx = ((FrameLayout)findViewById(R.h.bgx));
    this.mdy = ((ImageView)findViewById(R.h.bgu));
    this.mdz = ((ImageView)findViewById(R.h.bgt));
    w.i("MicroMsg.MyGameTextStyleView", "initView finished");
    GMTrace.o(12730685718528L, 94851);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\MyGameTextStyleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */