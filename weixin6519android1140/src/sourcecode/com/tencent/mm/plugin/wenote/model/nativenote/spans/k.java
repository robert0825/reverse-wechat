package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class k
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  private int sgT;
  public boolean sgU;
  public boolean sgX;
  public boolean sgY;
  public boolean sgZ;
  public boolean sha;
  private WeakReference<Drawable> shb;
  
  public k(boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    GMTrace.i(20631009624064L, 153713);
    this.sgX = false;
    this.sgY = false;
    this.sgZ = false;
    this.sha = false;
    this.sgT = paramInt;
    boolean bool1 = bool2;
    if (paramBoolean2)
    {
      bool1 = bool2;
      if (paramBoolean4)
      {
        bool1 = bool2;
        if (!paramBoolean3) {
          bool1 = true;
        }
      }
    }
    this.sgU = bool1;
    this.sha = paramBoolean1;
    this.sgX = paramBoolean3;
    this.sgY = paramBoolean4;
    this.sgZ = paramBoolean2;
    GMTrace.o(20631009624064L, 153713);
  }
  
  private k bIv()
  {
    GMTrace.i(20631412277248L, 153716);
    k localk = new k(this.sha, this.sgT, this.sgZ, this.sgX, this.sgY);
    GMTrace.o(20631412277248L, 153716);
    return localk;
  }
  
  public final void a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent, k paramk)
  {
    GMTrace.i(21058090434560L, 156895);
    if (paramMotionEvent.getX() > this.sgT)
    {
      w.e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
      GMTrace.o(21058090434560L, 156895);
      return;
    }
    int i = paramSpannable.getSpanStart(paramk);
    int j = paramSpannable.getSpanEnd(paramk);
    if (this.sha)
    {
      paramMotionEvent = "true";
      w.i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", new Object[] { paramMotionEvent });
      paramSpannable.removeSpan(this);
      if (this.sha) {
        break label182;
      }
    }
    label182:
    for (boolean bool = true;; bool = false)
    {
      this.sha = bool;
      paramSpannable.setSpan(bIv(), i, j, 33);
      paramTextView = (WXRTEditText)paramTextView;
      if (paramTextView.seM == 0)
      {
        paramTextView = c.bHo().yD(paramTextView.bHM());
        if ((paramTextView != null) && (paramTextView.getType() == 1)) {
          ((h)paramTextView).content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(paramSpannable);
        }
      }
      GMTrace.o(21058090434560L, 156895);
      return;
      paramMotionEvent = "false";
      break;
    }
  }
  
  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    GMTrace.i(20631278059520L, 153715);
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.sgU) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramLayout = this.shb;
      paramCharSequence = null;
      if (paramLayout != null) {
        paramCharSequence = (Drawable)paramLayout.get();
      }
      paramLayout = paramCharSequence;
      if (paramCharSequence == null) {
        if (!this.sha) {
          break label117;
        }
      }
      label117:
      for (paramCharSequence = a.b(ab.getContext(), R.g.aYA);; paramCharSequence = a.b(ab.getContext(), R.g.aYB))
      {
        this.shb = new WeakReference(paramCharSequence);
        paramLayout = paramCharSequence;
        if (paramLayout != null) {
          break;
        }
        GMTrace.o(20631278059520L, 153715);
        return;
      }
      paramLayout.setBounds(0, 0, paramLayout.getIntrinsicWidth(), paramLayout.getIntrinsicHeight());
      paramCanvas.save();
      paramPaint = paramPaint.getFontMetricsInt();
      paramInt1 = paramPaint.descent;
      paramCanvas.translate(0.0F, (paramPaint.ascent + (paramInt1 + paramInt4 + paramInt4)) / 2 - paramLayout.getBounds().bottom / 2);
      paramLayout.draw(paramCanvas);
      paramCanvas.restore();
    }
    GMTrace.o(20631278059520L, 153715);
  }
  
  public int getLeadingMargin(boolean paramBoolean)
  {
    GMTrace.i(20631143841792L, 153714);
    if (this.sgU)
    {
      GMTrace.o(20631143841792L, 153714);
      return 0;
    }
    int i = this.sgT;
    GMTrace.o(20631143841792L, 153714);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */