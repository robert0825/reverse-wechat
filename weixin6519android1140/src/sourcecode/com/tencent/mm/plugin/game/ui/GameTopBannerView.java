package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class GameTopBannerView
  extends FrameLayout
  implements View.OnClickListener
{
  int lNQ;
  ImageView lUV;
  ImageView lUW;
  Context mContext;
  int mcZ;
  int mda;
  String mdb;
  private String mdc;
  String mdd;
  
  public GameTopBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12780346277888L, 95221);
    this.mdb = "";
    this.mdc = "";
    this.mdd = null;
    this.mContext = paramContext;
    GMTrace.o(12780346277888L, 95221);
  }
  
  final int b(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    GMTrace.i(12780614713344L, 95223);
    int i = c.getScreenWidth(this.mContext);
    ViewGroup.LayoutParams localLayoutParams = paramImageView.getLayoutParams();
    if (localLayoutParams == null)
    {
      w.e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
      GMTrace.o(12780614713344L, 95223);
      return 0;
    }
    float f = paramInt1 / paramInt2;
    localLayoutParams.height = ((int)(i * f));
    paramImageView.setLayoutParams(localLayoutParams);
    paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
    paramInt1 = localLayoutParams.height;
    GMTrace.o(12780614713344L, 95223);
    return paramInt1;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12780748931072L, 95224);
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
    {
      paramView = (String)paramView.getTag();
      if (!bg.nm(paramView))
      {
        int i = c.p(this.mContext, paramView, "game_center_top_banner");
        ai.a(this.mContext, 10, 1017, 1, i, 0, null, this.lNQ, 0, null, null, this.mdd);
      }
    }
    GMTrace.o(12780748931072L, 95224);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12780480495616L, 95222);
    super.onFinishInflate();
    this.lUV = ((ImageView)findViewById(R.h.bgz));
    this.lUW = ((ImageView)findViewById(R.h.cfo));
    w.i("MicroMsg.GameTopBannerView", "initView finished");
    GMTrace.o(12780480495616L, 95222);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameTopBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */