package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.d;

public class DialNumberButton
  extends RelativeLayout
{
  TextView mnb;
  TextView mnc;
  private boolean mnd;
  
  public DialNumberButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11700296220672L, 87174);
    this.mnd = false;
    LayoutInflater.from(getContext()).inflate(R.i.cur, this);
    this.mnb = ((TextView)findViewById(R.h.btU));
    this.mnc = ((TextView)findViewById(R.h.btV));
    if (d.et(16))
    {
      this.mnb.setTypeface(Typeface.create("sans-serif-light", 0));
      this.mnc.setTypeface(Typeface.create("sans-serif-normal", 0));
    }
    setClipChildren(false);
    setClipToPadding(false);
    GMTrace.o(11700296220672L, 87174);
  }
  
  public final String aJa()
  {
    GMTrace.i(11700430438400L, 87175);
    String str = this.mnb.getText().toString();
    GMTrace.o(11700430438400L, 87175);
    return str;
  }
  
  public final String aJb()
  {
    GMTrace.i(11700564656128L, 87176);
    String str = this.mnc.getText().toString();
    GMTrace.o(11700564656128L, 87176);
    return str;
  }
  
  public final void ft(boolean paramBoolean)
  {
    GMTrace.i(11700698873856L, 87177);
    this.mnd = paramBoolean;
    if (this.mnd)
    {
      if (("#".equals(this.mnb.getText())) || ("*".equals(this.mnb.getText()))) {
        this.mnb.setTextColor(getContext().getResources().getColor(R.e.aNs));
      }
      for (;;)
      {
        this.mnc.setTextColor(getContext().getResources().getColor(R.e.aNs));
        setBackgroundDrawable(getResources().getDrawable(R.g.aVW));
        GMTrace.o(11700698873856L, 87177);
        return;
        this.mnb.setTextColor(getContext().getResources().getColor(R.e.aNu));
      }
    }
    if (("#".equals(this.mnb.getText())) || ("*".equals(this.mnb.getText()))) {
      this.mnb.setTextColor(getContext().getResources().getColor(R.e.aNs));
    }
    for (;;)
    {
      this.mnc.setTextColor(getContext().getResources().getColor(R.e.aNs));
      setBackgroundDrawable(getResources().getDrawable(R.g.aVX));
      GMTrace.o(11700698873856L, 87177);
      return;
      this.mnb.setTextColor(getContext().getResources().getColor(R.e.aNt));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\DialNumberButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */