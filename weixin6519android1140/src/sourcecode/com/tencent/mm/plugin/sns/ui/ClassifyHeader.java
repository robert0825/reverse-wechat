package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;

public class ClassifyHeader
  extends LinearLayout
{
  private Context mContext;
  private ImageView mRX;
  private TextView mrx;
  
  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8725897150464L, 65013);
    init(paramContext);
    GMTrace.o(8725897150464L, 65013);
  }
  
  @TargetApi(11)
  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8725762932736L, 65012);
    init(paramContext);
    GMTrace.o(8725762932736L, 65012);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8726031368192L, 65014);
    this.mContext = paramContext;
    paramContext = View.inflate(this.mContext, i.g.peN, this);
    this.mRX = ((ImageView)paramContext.findViewById(i.f.pbg));
    this.mrx = ((TextView)paramContext.findViewById(i.f.paP));
    GMTrace.o(8726031368192L, 65014);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ClassifyHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */