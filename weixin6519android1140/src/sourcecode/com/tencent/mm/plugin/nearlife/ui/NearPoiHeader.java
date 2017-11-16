package com.tencent.mm.plugin.nearlife.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NearPoiHeader
  extends LinearLayout
{
  private ImageView mRX;
  private TextView mrx;
  
  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12561571381248L, 93591);
    init(paramContext);
    GMTrace.o(12561571381248L, 93591);
  }
  
  @TargetApi(11)
  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12561437163520L, 93590);
    init(paramContext);
    GMTrace.o(12561437163520L, 93590);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(12561705598976L, 93592);
    paramContext = View.inflate(paramContext, R.i.cCJ, this);
    this.mRX = ((ImageView)paramContext.findViewById(R.h.bKV));
    this.mrx = ((TextView)paramContext.findViewById(R.h.bJY));
    GMTrace.o(12561705598976L, 93592);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\NearPoiHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */