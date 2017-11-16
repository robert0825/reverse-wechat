package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class TipSayingWidget
  extends LinearLayout
{
  private Context context;
  private TextView jPE;
  private ImageView mAY;
  private Chronometer mAZ;
  private int mBa;
  
  public TipSayingWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9645020151808L, 71861);
    this.mBa = 0;
    this.context = paramContext;
    paramContext = View.inflate(this.context, R.i.cGX, this);
    this.mAY = ((ImageView)paramContext.findViewById(R.h.bZv));
    this.jPE = ((TextView)paramContext.findViewById(R.h.bZx));
    this.mAZ = ((Chronometer)findViewById(R.h.chronometer));
    GMTrace.o(9645020151808L, 71861);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\TipSayingWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */