package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;

public class SnsNotifyBanner
  extends RelativeLayout
{
  private LayoutInflater CJ;
  private View Hw;
  private TextView qdr;
  private ImageView qds;
  int qdt;
  
  public SnsNotifyBanner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8463635709952L, 63059);
    this.qdt = 0;
    init();
    GMTrace.o(8463635709952L, 63059);
  }
  
  public SnsNotifyBanner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8463501492224L, 63058);
    this.qdt = 0;
    init();
    GMTrace.o(8463501492224L, 63058);
  }
  
  private void init()
  {
    GMTrace.i(8463769927680L, 63060);
    this.CJ = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    this.Hw = this.CJ.inflate(i.g.pfY, this, true);
    this.qdr = ((TextView)this.Hw.findViewById(i.f.pcE));
    this.qds = ((ImageView)this.Hw.findViewById(i.f.pcD));
    this.qds.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8765491380224L, 65308);
        SnsNotifyBanner.this.setVisibility(8);
        GMTrace.o(8765491380224L, 65308);
      }
    });
    GMTrace.o(8463769927680L, 63060);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsNotifyBanner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */