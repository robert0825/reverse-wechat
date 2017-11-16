package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NearLifeErrorContent
  extends FrameLayout
{
  private View hqF;
  ListView hvF;
  private Context mContext;
  private TextView nwC;
  private View nwD;
  
  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12557007978496L, 93557);
    this.mContext = paramContext;
    init();
    GMTrace.o(12557007978496L, 93557);
  }
  
  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12556873760768L, 93556);
    this.mContext = paramContext;
    init();
    GMTrace.o(12556873760768L, 93556);
  }
  
  private void init()
  {
    GMTrace.i(12557142196224L, 93558);
    this.hqF = View.inflate(this.mContext, R.i.cCL, this);
    this.nwC = ((TextView)this.hqF.findViewById(R.h.bPz));
    this.nwD = this.hqF.findViewById(R.h.bPU);
    GMTrace.o(12557142196224L, 93558);
  }
  
  public final void rO(int paramInt)
  {
    GMTrace.i(12557276413952L, 93559);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12557276413952L, 93559);
      return;
      this.nwC.setVisibility(8);
      this.nwD.setVisibility(8);
      this.hvF.setVisibility(0);
      GMTrace.o(12557276413952L, 93559);
      return;
      this.nwC.setVisibility(0);
      this.nwD.setVisibility(8);
      this.hvF.setVisibility(8);
      GMTrace.o(12557276413952L, 93559);
      return;
      this.nwC.setVisibility(8);
      this.nwD.setVisibility(0);
      this.hvF.setVisibility(8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\NearLifeErrorContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */