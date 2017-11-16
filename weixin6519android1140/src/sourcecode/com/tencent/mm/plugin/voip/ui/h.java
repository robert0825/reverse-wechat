package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.widget.BaseSmallView;

public final class h
  extends BaseSmallView
{
  private TextView kHx;
  
  public h(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(5352066121728L, 39876);
    LayoutInflater.from(paramContext).inflate(R.i.cHJ, this);
    this.kHx = ((TextView)findViewById(R.h.cnj));
    GMTrace.o(5352066121728L, 39876);
  }
  
  public final void JQ(String paramString)
  {
    GMTrace.i(14283450613760L, 106420);
    this.kHx.setTextSize(1, 12.0F);
    this.kHx.setText(paramString);
    GMTrace.o(14283450613760L, 106420);
  }
  
  public final void JR(String paramString)
  {
    GMTrace.i(14283316396032L, 106419);
    this.kHx.setTextSize(1, 14.0F);
    this.kHx.setText(paramString);
    GMTrace.o(14283316396032L, 106419);
  }
  
  public final void a(CaptureView paramCaptureView)
  {
    GMTrace.i(5352200339456L, 39877);
    GMTrace.o(5352200339456L, 39877);
  }
  
  protected final void bvG()
  {
    GMTrace.i(5352334557184L, 39878);
    GMTrace.o(5352334557184L, 39878);
  }
  
  protected final void bvH()
  {
    GMTrace.i(5352468774912L, 39879);
    GMTrace.o(5352468774912L, 39879);
  }
  
  protected final void onAnimationEnd()
  {
    GMTrace.i(5352602992640L, 39880);
    GMTrace.o(5352602992640L, 39880);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */