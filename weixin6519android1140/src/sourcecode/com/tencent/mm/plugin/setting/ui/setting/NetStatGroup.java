package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NetStatGroup
  extends LinearLayout
{
  LinearLayout oGF;
  final TextView odi;
  
  public NetStatGroup(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(4722719195136L, 35187);
    GMTrace.o(4722719195136L, 35187);
  }
  
  public NetStatGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4722853412864L, 35188);
    View.inflate(paramContext, R.i.cCW, this);
    this.oGF = ((LinearLayout)findViewById(R.h.bFE));
    this.odi = ((TextView)findViewById(R.h.bsU));
    this.odi.setTextSize(0, paramContext.getResources().getDimensionPixelSize(R.f.aQo));
    GMTrace.o(4722853412864L, 35188);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\NetStatGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */