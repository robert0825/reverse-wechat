package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.p.d;

public final class g
  extends RelativeLayout
{
  private Context mContext;
  public boolean mzg;
  private ImageView mzy;
  public d mzz;
  
  public g(Context paramContext, d paramd)
  {
    super(paramContext);
    GMTrace.i(9717229289472L, 72399);
    this.mzg = false;
    this.mzz = paramd;
    this.mContext = paramContext;
    this.mzy = ((ImageView)View.inflate(this.mContext, R.i.cDt, this).findViewById(R.h.bTB));
    GMTrace.o(9717229289472L, 72399);
  }
  
  public final void remove()
  {
    GMTrace.i(9717363507200L, 72400);
    this.mzz.removeView(this);
    this.mzg = false;
    GMTrace.o(9717363507200L, 72400);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */