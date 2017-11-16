package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;

public class SOSEditTextView
  extends FTSEditTextView
{
  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16797482876928L, 125151);
    GMTrace.o(16797482876928L, 125151);
  }
  
  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16797617094656L, 125152);
    GMTrace.o(16797617094656L, 125152);
  }
  
  public final void chI()
  {
    GMTrace.i(16798019747840L, 125155);
    this.wjB.setOnFocusChangeListener(this.wbP);
    GMTrace.o(16798019747840L, 125155);
  }
  
  protected final void chx()
  {
    GMTrace.i(16797751312384L, 125153);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(R.i.cGL, this, true);
    GMTrace.o(16797751312384L, 125153);
  }
  
  protected final void init()
  {
    GMTrace.i(16797885530112L, 125154);
    super.init();
    this.wjB.setOnFocusChangeListener(null);
    GMTrace.o(16797885530112L, 125154);
  }
  
  public final void v(Drawable paramDrawable)
  {
    GMTrace.i(16798153965568L, 125156);
    this.iub.setImageDrawable(paramDrawable);
    GMTrace.o(16798153965568L, 125156);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\fts\widget\SOSEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */