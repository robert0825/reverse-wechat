package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  implements c
{
  public boolean eHl;
  private boolean isVisible;
  private String mwD;
  private double mwH;
  private double mwI;
  private String myL;
  private boolean mzl;
  private View mzm;
  private d mzn;
  public String mzo;
  private TextView mzp;
  private TextView mzq;
  public ImageButton mzr;
  
  public f(d paramd, Context paramContext)
  {
    GMTrace.i(9654012739584L, 71928);
    this.eHl = false;
    this.mzl = true;
    this.mwH = 1000000.0D;
    this.mwI = 1000000.0D;
    this.isVisible = true;
    this.myL = "";
    paramContext = ((Activity)paramContext).findViewById(R.h.bKY);
    this.mzp = ((TextView)paramContext.findViewById(R.h.bKW));
    this.mzq = ((TextView)paramContext.findViewById(R.h.bKX));
    this.mzr = ((ImageButton)paramContext.findViewById(R.h.bLe));
    this.mzn = paramd;
    this.mzm = paramContext;
    GMTrace.o(9654012739584L, 71928);
  }
  
  public final String aKF()
  {
    GMTrace.i(9654281175040L, 71930);
    String str = this.myL;
    GMTrace.o(9654281175040L, 71930);
    return str;
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(9654146957312L, 71929);
    this.mwD = paramString;
    paramString = this.mwD;
    w.d("NewItemOverlay", "popView " + this.mzm.getWidth() + " " + this.mzm.getHeight());
    if ((paramString != null) && (!paramString.equals(""))) {
      this.mzq.setText(paramString);
    }
    if ((this.mzo != null) && (!this.mzo.equals(""))) {
      this.mzp.setText(this.mzo);
    }
    for (;;)
    {
      if (this.mzl)
      {
        this.mzm.setVisibility(0);
        this.mzm.invalidate();
      }
      GMTrace.o(9654146957312L, 71929);
      return;
      this.mzp.setText(R.l.dGC);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */