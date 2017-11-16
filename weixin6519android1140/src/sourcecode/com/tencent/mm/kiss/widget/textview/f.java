package com.tencent.mm.kiss.widget.textview;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.gmtrace.GMTrace;

public final class f
{
  public TextPaint gbA;
  public StaticLayout gbB;
  public Layout.Alignment gbp;
  public TextUtils.TruncateAt gbq;
  public boolean gby;
  CharSequence gbz;
  public int gravity;
  public int maxLength;
  public int maxLines;
  CharSequence text;
  
  public f(StaticLayout paramStaticLayout)
  {
    GMTrace.i(430973124608L, 3211);
    this.gby = true;
    this.gbB = paramStaticLayout;
    GMTrace.o(430973124608L, 3211);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */