package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  protected f gbD;
  public a gbE;
  protected StaticLayout gbF;
  protected boolean gbG;
  int gbH;
  int gbI;
  private boolean gbJ;
  boolean gbK;
  private boolean gbL;
  private boolean gbM;
  View gbN;
  private int gbO;
  private int gbP;
  protected CharSequence text;
  
  public g(View paramView, a parama)
  {
    GMTrace.i(441442107392L, 3289);
    this.text = null;
    this.gbG = false;
    this.gbJ = false;
    this.gbK = false;
    this.gbL = false;
    this.gbM = false;
    this.gbO = 0;
    this.gbP = 0;
    this.gbN = paramView;
    this.gbE = parama;
    GMTrace.o(441442107392L, 3289);
  }
  
  private boolean fi(int paramInt)
  {
    GMTrace.i(444126461952L, 3309);
    if ((this.gbG) || (this.gbD == null) || (this.gbF == null))
    {
      if (this.gbE == null)
      {
        GMTrace.o(444126461952L, 3309);
        return false;
      }
      if (paramInt > 0)
      {
        xV();
        long l1 = 0L;
        if (h.DEBUG) {
          l1 = System.nanoTime();
        }
        this.gbD = d.a(this.text, paramInt, this.gbE).xO();
        this.gbF = this.gbD.gbB;
        this.gbG = false;
        if (h.DEBUG)
        {
          long l2 = System.nanoTime();
          w.d("MicroMsg.StaticTextViewHolder", "recreateLayoutIfNeed, width: %d, hasCode: %d, used: %fms, text: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), Double.valueOf((l2 - l1) / 1000000.0D), this.text });
        }
        GMTrace.o(444126461952L, 3309);
        return true;
      }
    }
    GMTrace.o(444126461952L, 3309);
    return false;
  }
  
  public final Point aH(int paramInt1, int paramInt2)
  {
    GMTrace.i(444260679680L, 3310);
    long l = 0L;
    if (h.DEBUG) {
      l = System.nanoTime();
    }
    int n = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    fi(i);
    if (this.gbF != null) {
      if (n == 1073741824) {
        paramInt1 = i;
      }
    }
    for (;;)
    {
      if (m == 1073741824) {
        paramInt2 = j;
      }
      Object localObject1;
      Object localObject2;
      for (;;)
      {
        localObject1 = new Point(paramInt1, paramInt2);
        if (h.DEBUG)
        {
          double d = (System.nanoTime() - l) / 1000000.0D;
          paramInt1 = hashCode();
          CharSequence localCharSequence = this.text;
          if (localObject1 != null) {
            break label606;
          }
          localObject2 = "";
          label130:
          w.d("MicroMsg.StaticTextViewHolder", "onMeasure used: %fms, hashCode: %d, text: %s result: %s", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1), localCharSequence, localObject2 });
        }
        GMTrace.o(444260679680L, 3310);
        return (Point)localObject1;
        paramInt1 = 0;
        if (this.gbE.gbq == null)
        {
          localObject1 = this.gbF;
          if (this.gbO == 0) {
            break label301;
          }
          paramInt1 = this.gbO;
        }
        for (;;)
        {
          k = (int)Math.ceil(Layout.getDesiredWidth(this.gbF.getText(), this.gbF.getPaint()));
          paramInt2 = paramInt1;
          if (k > paramInt1) {
            paramInt2 = k;
          }
          if (h.DEBUG) {
            w.d("MicroMsg.StaticTextViewHolder", "onMeasure  hashCode: %d, des: %d newdes: %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(k) });
          }
          if (n != Integer.MIN_VALUE) {
            break label622;
          }
          paramInt1 = Math.min(i, paramInt2);
          break;
          label301:
          paramInt2 = ((Layout)localObject1).getLineCount();
          localObject2 = ((Layout)localObject1).getText();
          float f = 0.0F;
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 >= paramInt2 - 1) {
              break label358;
            }
            if (((CharSequence)localObject2).charAt(((Layout)localObject1).getLineEnd(paramInt1) - 1) != '\n')
            {
              paramInt1 = -1;
              break;
            }
            paramInt1 += 1;
          }
          label358:
          paramInt1 = 0;
          while (paramInt1 < paramInt2)
          {
            f = Math.max(f, ((Layout)localObject1).getLineWidth(paramInt1));
            paramInt1 += 1;
          }
          this.gbO = ((int)Math.ceil(f));
          this.gbO += this.gbN.getPaddingLeft() + this.gbN.getPaddingRight();
          paramInt1 = this.gbO;
        }
        localObject1 = this.gbF;
        if (this.gbP == 0) {
          break label468;
        }
        i = this.gbP;
        label447:
        paramInt2 = i;
        if (m == Integer.MIN_VALUE) {
          paramInt2 = Math.min(i, j);
        }
      }
      label468:
      i = ((Layout)localObject1).getLineCount();
      paramInt2 = i;
      if (this.gbD.maxLines > 0)
      {
        paramInt2 = i;
        if (this.gbD.maxLines < i) {
          paramInt2 = this.gbD.maxLines;
        }
      }
      int k = this.gbN.getPaddingTop();
      n = this.gbN.getPaddingBottom();
      i = ((Layout)localObject1).getLineTop(paramInt2);
      int i1;
      if ((this.gbE.minLines > 0) && (paramInt2 < this.gbE.minLines)) {
        i1 = getLineHeight();
      }
      for (paramInt2 = (this.gbE.minLines - paramInt2) * i1 + i;; paramInt2 = i)
      {
        this.gbP = (paramInt2 + (k + n));
        i = this.gbP;
        break label447;
        localObject1 = null;
        break;
        label606:
        localObject2 = ((Point)localObject1).toString();
        break label130;
      }
      label622:
      paramInt1 = paramInt2;
    }
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(442113196032L, 3294);
    if ((paramf == null) || (paramf.gbB == null))
    {
      this.gbD = null;
      GMTrace.o(442113196032L, 3294);
      return;
    }
    if (this.gbE == null)
    {
      com.tencent.mm.kiss.widget.textview.a.b localb = new com.tencent.mm.kiss.widget.textview.a.b();
      localb.gbE = new a();
      localb.gbE.maxLines = paramf.maxLines;
      localb.gbE.maxLength = paramf.maxLength;
      localb.gbE.gbA = paramf.gbA;
      localb.gbE.gbp = paramf.gbp;
      localb.gbE.gbq = paramf.gbq;
      localb.gbE.gravity = paramf.gravity;
      localb.gbE.gbV = paramf.gbA.getTextSize();
      localb.gbE.textColor = paramf.gbA.getColor();
      this.gbE = localb.gbE;
    }
    xV();
    this.gbN.setWillNotDraw(false);
    this.gbD = paramf;
    this.gbF = paramf.gbB;
    this.text = paramf.text;
    this.gbJ = (this.text instanceof Spannable);
    if (this.gbJ)
    {
      this.text = this.gbD.text;
      com.tencent.mm.kiss.widget.textview.b.b.xY();
      com.tencent.mm.kiss.widget.textview.b.b.a((Spannable)this.text);
    }
    this.gbN.requestLayout();
    this.gbN.invalidate();
    GMTrace.o(442113196032L, 3294);
  }
  
  public final int getLineCount()
  {
    GMTrace.i(443589591040L, 3305);
    if (this.gbF == null)
    {
      GMTrace.o(443589591040L, 3305);
      return 0;
    }
    int i = this.gbF.getLineCount();
    GMTrace.o(443589591040L, 3305);
    return i;
  }
  
  public final int getLineHeight()
  {
    GMTrace.i(442650066944L, 3298);
    TextPaint localTextPaint2 = this.gbD.gbB.getPaint();
    TextPaint localTextPaint1 = localTextPaint2;
    if (localTextPaint2 == null) {
      localTextPaint1 = this.gbE.gbA;
    }
    int i = Math.round(localTextPaint1.getFontMetricsInt(null) * this.gbE.gbu + this.gbE.gbt);
    GMTrace.o(442650066944L, 3298);
    return i;
  }
  
  public final CharSequence getText()
  {
    GMTrace.i(443052720128L, 3301);
    CharSequence localCharSequence = this.text;
    GMTrace.o(443052720128L, 3301);
    return localCharSequence;
  }
  
  public final float getTextSize()
  {
    GMTrace.i(443186937856L, 3302);
    if (this.gbD == null)
    {
      if (this.gbE != null)
      {
        f = this.gbE.gbV;
        GMTrace.o(443186937856L, 3302);
        return f;
      }
      GMTrace.o(443186937856L, 3302);
      return 0.0F;
    }
    float f = this.gbD.gbA.getTextSize();
    GMTrace.o(443186937856L, 3302);
    return f;
  }
  
  public final void init()
  {
    GMTrace.i(441576325120L, 3290);
    this.text = "";
    this.gbN.setWillNotDraw(false);
    GMTrace.o(441576325120L, 3290);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(443992244224L, 3308);
    if ((this.gbF == null) || (this.gbD == null))
    {
      boolean bool = fi(this.gbN.getMeasuredWidth());
      if (h.DEBUG) {
        w.d("MicroMsg.StaticTextViewHolder", "onDraw, textLayout==null:%b, layoutWrapper==null:%b recreate:%b", new Object[] { this.gbF, this.gbD, Boolean.valueOf(bool) });
      }
      if (bool)
      {
        this.gbN.requestLayout();
        this.gbN.invalidate();
      }
      GMTrace.o(443992244224L, 3308);
      return;
    }
    long l = 0L;
    if (h.DEBUG) {
      l = System.nanoTime();
    }
    paramCanvas.save();
    int k = this.gbN.getPaddingLeft();
    int m = this.gbN.getPaddingTop();
    int n = this.gbN.getRight() - this.gbN.getLeft() - this.gbN.getPaddingRight();
    int i1 = this.gbN.getBottom() - this.gbN.getTop() - this.gbN.getPaddingBottom();
    paramCanvas.clipRect(k, m, n, i1);
    int j;
    int i;
    int i2;
    int i3;
    if ((this.gbH == 0) || (this.gbI == 0))
    {
      j = this.gbN.getPaddingLeft();
      i = this.gbN.getRight() - this.gbN.getLeft() - this.gbN.getPaddingLeft() - this.gbN.getPaddingRight();
      i2 = this.gbF.getWidth();
      if (i2 > i)
      {
        i = j;
        this.gbH = i;
        j = this.gbN.getPaddingTop();
        i2 = this.gbN.getBottom() - this.gbN.getTop() - this.gbN.getPaddingTop() - this.gbN.getPaddingBottom();
        i = 0;
        i3 = this.gbF.getHeight();
        if (i3 <= i2) {
          break label574;
        }
        i = j;
        this.gbI = i;
      }
    }
    else
    {
      paramCanvas.translate(this.gbH, this.gbI);
      this.gbF.draw(paramCanvas, null, null, 0);
      paramCanvas.restore();
      if (h.DEBUG) {
        w.d("MicroMsg.StaticTextViewHolder", "onDraw used: %fms, hashCode: %d, text: %s clipLeft:%d clipTop:%d clipRight:%d clipBottom:%d", new Object[] { Double.valueOf((System.nanoTime() - l) / 1000000.0D), Integer.valueOf(hashCode()), this.text, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1) });
      }
      GMTrace.o(443992244224L, 3308);
      return;
    }
    switch (this.gbD.gravity & 0x800007)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      i += j;
      break;
      i = 0;
      continue;
      i = i / 2 - i2 / 2;
      continue;
      i -= i2;
    }
    label574:
    switch (this.gbD.gravity & 0x70)
    {
    }
    for (;;)
    {
      i += j;
      break;
      i = 0;
      continue;
      i = i2 / 2 - i3 / 2;
      continue;
      i = i2 - i3;
    }
  }
  
  public final boolean performClick()
  {
    GMTrace.i(443858026496L, 3307);
    if ((this.gbM) || (!this.gbK))
    {
      GMTrace.o(443858026496L, 3307);
      return false;
    }
    GMTrace.o(443858026496L, 3307);
    return true;
  }
  
  public final void setGravity(int paramInt)
  {
    GMTrace.i(442381631488L, 3296);
    if ((this.gbE != null) && (paramInt != this.gbE.gravity))
    {
      this.gbE.gravity = paramInt;
      this.gbG = true;
      if (h.DEBUG) {
        w.i("MicroMsg.StaticTextViewHolder", "setGravity isNeedRecreateLayout");
      }
    }
    GMTrace.o(442381631488L, 3296);
  }
  
  public final void setLines(int paramInt)
  {
    GMTrace.i(441844760576L, 3292);
    if ((this.gbE.maxLines != paramInt) || (this.gbE.minLines != paramInt))
    {
      this.gbG = true;
      xV();
      this.gbE.maxLines = paramInt;
      this.gbE.minLines = paramInt;
      this.gbN.requestLayout();
      this.gbN.invalidate();
      if (h.DEBUG) {
        w.i("MicroMsg.StaticTextViewHolder", "setLines isNeedRecreateLayout");
      }
    }
    GMTrace.o(441844760576L, 3292);
  }
  
  public final void setMaxLines(int paramInt)
  {
    GMTrace.i(442515849216L, 3297);
    if ((this.gbE != null) && (paramInt != this.gbE.maxLines))
    {
      this.gbE.maxLines = paramInt;
      this.gbG = true;
      xV();
      if (h.DEBUG) {
        w.i("MicroMsg.StaticTextViewHolder", "setMaxLines isNeedRecreateLayout");
      }
      this.gbN.requestLayout();
      this.gbN.invalidate();
    }
    GMTrace.o(442515849216L, 3297);
  }
  
  public final void setSingleLine(boolean paramBoolean)
  {
    GMTrace.i(441710542848L, 3291);
    if (paramBoolean) {}
    for (int i = 1;; i = Integer.MAX_VALUE)
    {
      if (this.gbE.maxLines != i)
      {
        this.gbE.maxLines = i;
        this.gbG = true;
        xV();
        this.gbN.requestLayout();
        this.gbN.invalidate();
      }
      GMTrace.o(441710542848L, 3291);
      return;
    }
  }
  
  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    GMTrace.i(442784284672L, 3299);
    if (paramCharSequence == null)
    {
      GMTrace.o(442784284672L, 3299);
      return;
    }
    if ((this.text == null) || (!this.text.equals(paramCharSequence)) || (paramBoolean))
    {
      this.text = paramCharSequence;
      this.gbG = true;
      this.gbN.requestLayout();
      this.gbN.invalidate();
      if (h.DEBUG) {
        w.i("MicroMsg.StaticTextViewHolder", "setText isNeedRecreateLayout " + paramCharSequence + " hashcode " + hashCode() + " " + new ah().toString());
      }
    }
    GMTrace.o(442784284672L, 3299);
  }
  
  public final void setTextColor(int paramInt)
  {
    GMTrace.i(442247413760L, 3295);
    if ((this.gbE != null) && (paramInt != this.gbE.textColor))
    {
      this.gbE.textColor = paramInt;
      this.gbG = true;
      if (h.DEBUG) {
        w.i("MicroMsg.StaticTextViewHolder", "setTextColor isNeedRecreateLayout");
      }
    }
    GMTrace.o(442247413760L, 3295);
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    GMTrace.i(441978978304L, 3293);
    Object localObject = ab.getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
      if ((paramFloat != 0.0F) && (this.gbE != null) && (paramFloat != this.gbE.gbV))
      {
        this.gbE.gbV = paramFloat;
        this.gbG = true;
        if (h.DEBUG) {
          w.i("MicroMsg.StaticTextViewHolder", "setRawTextSize isNeedRecreateLayout");
        }
      }
      GMTrace.o(441978978304L, 3293);
      return;
    }
  }
  
  public final boolean v(MotionEvent paramMotionEvent)
  {
    int j = -1;
    boolean bool2 = false;
    GMTrace.i(443723808768L, 3306);
    int i;
    boolean bool1;
    float f2;
    if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      i = 1;
      bool1 = bool2;
      if (this.gbN.isEnabled())
      {
        bool1 = bool2;
        if (this.gbJ)
        {
          com.tencent.mm.kiss.widget.textview.b.b.xY();
          bool1 = com.tencent.mm.kiss.widget.textview.b.b.a(this.gbN, this.gbF, (Spannable)this.text, paramMotionEvent);
          this.gbM = bool1;
          if ((!this.gbL) || (i == 0)) {
            break label298;
          }
          float f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((f1 >= this.gbH) && (f1 <= this.gbF.getWidth() + this.gbH)) {
            break label234;
          }
          i = 0;
          label143:
          if (i == 0) {
            break label298;
          }
          paramMotionEvent = (Spannable)this.text;
          if (this.text != null) {
            break label274;
          }
          i = -1;
          label166:
          if (this.text != null) {
            break label286;
          }
          label173:
          paramMotionEvent = (ClickableSpan[])paramMotionEvent.getSpans(i, j, ClickableSpan.class);
          if (paramMotionEvent.length <= 0) {
            break label298;
          }
          w.d("MicroMsg.StaticTextViewHolder", "perform clickable span click");
          paramMotionEvent[0].onClick(this.gbN);
          bool1 = true;
        }
      }
    }
    label234:
    label274:
    label286:
    label298:
    for (;;)
    {
      GMTrace.o(443723808768L, 3306);
      return bool1;
      i = 0;
      break;
      if ((f2 < this.gbI) || (f2 > this.gbF.getHeight() + this.gbI))
      {
        i = 0;
        break label143;
      }
      i = 1;
      break label143;
      i = Selection.getSelectionStart(this.text);
      break label166;
      j = Selection.getSelectionEnd(this.text);
      break label173;
    }
  }
  
  public final Layout xT()
  {
    GMTrace.i(443321155584L, 3303);
    StaticLayout localStaticLayout = this.gbF;
    GMTrace.o(443321155584L, 3303);
    return localStaticLayout;
  }
  
  public final f xU()
  {
    GMTrace.i(443455373312L, 3304);
    f localf = this.gbD;
    GMTrace.o(443455373312L, 3304);
    return localf;
  }
  
  final void xV()
  {
    GMTrace.i(442918502400L, 3300);
    this.gbP = 0;
    this.gbO = 0;
    this.gbH = 0;
    this.gbI = 0;
    GMTrace.o(442918502400L, 3300);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */