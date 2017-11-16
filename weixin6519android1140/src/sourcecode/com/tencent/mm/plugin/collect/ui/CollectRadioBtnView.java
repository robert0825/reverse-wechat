package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.v;

public class CollectRadioBtnView
  extends LinearLayout
{
  private TextView izE;
  private ImageView kaZ;
  
  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5420114509824L, 40383);
    init(paramContext);
    GMTrace.o(5420114509824L, 40383);
  }
  
  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5420248727552L, 40384);
    init(paramContext);
    GMTrace.o(5420248727552L, 40384);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5420382945280L, 40385);
    paramContext = v.fb(paramContext).inflate(a.g.sLZ, this);
    this.kaZ = ((ImageView)paramContext.findViewById(a.f.sFq));
    this.izE = ((TextView)paramContext.findViewById(a.f.chT));
    GMTrace.o(5420382945280L, 40385);
  }
  
  public final void mq(int paramInt)
  {
    GMTrace.i(5420651380736L, 40387);
    this.kaZ.setImageResource(paramInt);
    GMTrace.o(5420651380736L, 40387);
  }
  
  public final void vl(String paramString)
  {
    GMTrace.i(5420517163008L, 40386);
    this.izE.setText(paramString);
    GMTrace.o(5420517163008L, 40386);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectRadioBtnView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */