package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;

public class CleanLocationHeaderView
  extends LinearLayout
{
  private ImageView iDp;
  private TextView ntC;
  
  public CleanLocationHeaderView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6709946875904L, 49993);
    cm(paramContext);
    GMTrace.o(6709946875904L, 49993);
  }
  
  public CleanLocationHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6709812658176L, 49992);
    cm(paramContext);
    GMTrace.o(6709812658176L, 49992);
  }
  
  private void cm(Context paramContext)
  {
    GMTrace.i(6710081093632L, 49994);
    paramContext = View.inflate(paramContext, R.i.cCO, this);
    this.ntC = ((TextView)paramContext.findViewById(R.h.bPT));
    this.ntC.setSingleLine(false);
    this.iDp = ((ImageView)paramContext.findViewById(R.h.bPB));
    this.ntC.setText(R.l.dhY);
    this.iDp.setImageResource(R.k.cOg);
    GMTrace.o(6710081093632L, 49994);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\CleanLocationHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */