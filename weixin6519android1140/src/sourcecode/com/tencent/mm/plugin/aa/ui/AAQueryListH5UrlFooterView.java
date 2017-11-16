package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.v;

public class AAQueryListH5UrlFooterView
  extends LinearLayout
{
  TextView hqn;
  
  public AAQueryListH5UrlFooterView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5645734510592L, 42064);
    init(paramContext);
    GMTrace.o(5645734510592L, 42064);
  }
  
  public AAQueryListH5UrlFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5645868728320L, 42065);
    init(paramContext);
    GMTrace.o(5645868728320L, 42065);
  }
  
  public AAQueryListH5UrlFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5646002946048L, 42066);
    init(paramContext);
    GMTrace.o(5646002946048L, 42066);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5646137163776L, 42067);
    this.hqn = ((TextView)v.fb(paramContext).inflate(a.g.sLx, this, true).findViewById(a.f.spv));
    GMTrace.o(5646137163776L, 42067);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\AAQueryListH5UrlFooterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */