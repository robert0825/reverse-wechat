package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;

public class IPCallAddressCountView
  extends FrameLayout
{
  private View kJj;
  private TextView moB;
  
  private IPCallAddressCountView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11682847916032L, 87044);
    init();
    GMTrace.o(11682847916032L, 87044);
  }
  
  public IPCallAddressCountView(Context paramContext, int paramInt)
  {
    this(paramContext);
    GMTrace.i(11682982133760L, 87045);
    ps(paramInt);
    GMTrace.o(11682982133760L, 87045);
  }
  
  public IPCallAddressCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11682713698304L, 87043);
    init();
    GMTrace.o(11682713698304L, 87043);
  }
  
  private void init()
  {
    GMTrace.i(11683116351488L, 87046);
    inflate(getContext(), R.i.cAa, this);
    this.kJj = findViewById(R.h.bqo);
    this.moB = ((TextView)findViewById(R.h.bqn));
    GMTrace.o(11683116351488L, 87046);
  }
  
  public final void ps(int paramInt)
  {
    GMTrace.i(11683250569216L, 87047);
    this.moB.setText(getContext().getResources().getQuantityString(R.j.cIf, paramInt, new Object[] { Integer.valueOf(paramInt) }));
    GMTrace.o(11683250569216L, 87047);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallAddressCountView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */