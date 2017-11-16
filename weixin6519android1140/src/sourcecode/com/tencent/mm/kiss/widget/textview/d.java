package com.tencent.mm.kiss.widget.textview;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.InputFilter.LengthFilter;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.MetricAffectingSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private static e gbi;
  private static final SpannableString gbj;
  CharSequence gbk;
  CharSequence gbl;
  int gbm;
  int gbn;
  TextPaint gbo;
  Layout.Alignment gbp;
  TextUtils.TruncateAt gbq;
  int gbr;
  TextDirectionHeuristic gbs;
  float gbt;
  float gbu;
  boolean gbv;
  InputFilter.LengthFilter gbw;
  int gravity;
  int maxLength;
  int maxLines;
  int width;
  
  static
  {
    GMTrace.i(434462785536L, 3237);
    gbi = new e();
    gbj = new SpannableString("");
    GMTrace.o(434462785536L, 3237);
  }
  
  public d()
  {
    GMTrace.i(433791696896L, 3232);
    this.gbk = null;
    this.gbl = null;
    this.gbm = 0;
    this.gbn = 0;
    this.gbo = null;
    this.width = 0;
    this.gbp = Layout.Alignment.ALIGN_NORMAL;
    this.gravity = 51;
    this.gbq = null;
    this.gbr = -1;
    this.maxLines = Integer.MAX_VALUE;
    this.gbs = null;
    this.gbt = 0.0F;
    this.gbu = 1.0F;
    this.gbv = false;
    this.maxLength = -1;
    this.gbw = null;
    GMTrace.o(433791696896L, 3232);
  }
  
  private StaticLayout a(CharSequence paramCharSequence, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(434328567808L, 3236);
    if (paramBoolean) {
      paramCharSequence = new StaticLayout(paramCharSequence, this.gbm, this.gbn, this.gbo, this.width, this.gbp, this.gbu, this.gbt, this.gbv, this.gbq, paramInt);
    }
    for (;;)
    {
      GMTrace.o(434328567808L, 3236);
      return paramCharSequence;
      if (Build.VERSION.SDK_INT >= 18)
      {
        if (this.gbs == null) {
          this.gbs = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        paramCharSequence = com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.gbm, this.gbn, this.gbo, this.width, this.gbp, this.gbs, this.gbu, this.gbt, this.gbv, this.gbq, paramInt, this.maxLines);
      }
      else
      {
        paramCharSequence = com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.gbm, this.gbn, this.gbo, this.width, this.gbp, this.gbu, this.gbt, this.gbv, this.gbq, paramInt, this.maxLines);
      }
    }
  }
  
  private d a(Typeface paramTypeface)
  {
    GMTrace.i(434060132352L, 3234);
    this.gbo.setTypeface(paramTypeface);
    GMTrace.o(434060132352L, 3234);
    return this;
  }
  
  public static d a(CharSequence paramCharSequence, int paramInt, com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    boolean bool = false;
    GMTrace.i(433925914624L, 3233);
    Object localObject1 = paramCharSequence;
    if (paramCharSequence == null) {
      localObject1 = "";
    }
    int i = ((CharSequence)localObject1).length();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    localObject1 = gbi.xP();
    paramCharSequence = (CharSequence)localObject1;
    if (localObject1 == null) {
      paramCharSequence = new d();
    }
    paramCharSequence.gbk = ((CharSequence)localObject2).toString();
    paramCharSequence.gbl = ((CharSequence)localObject2);
    paramCharSequence.gbm = 0;
    paramCharSequence.gbn = i;
    paramCharSequence.width = paramInt;
    paramCharSequence.gbo = new TextPaint();
    if (parama.maxLines != -1)
    {
      paramInt = parama.maxLines;
      if (paramInt >= 0) {
        paramCharSequence.maxLines = paramInt;
      }
    }
    if (parama.maxLength != -1)
    {
      paramInt = parama.maxLength;
      if (paramInt >= 0)
      {
        paramCharSequence.maxLength = paramInt;
        paramCharSequence.gbw = new InputFilter.LengthFilter(paramCharSequence.maxLength);
      }
    }
    localObject1 = parama.gbp;
    if (localObject1 != null) {
      paramCharSequence.gbp = ((Layout.Alignment)localObject1);
    }
    if (parama.gbq != null)
    {
      localObject1 = parama.gbq;
      if (localObject1 != null) {
        paramCharSequence.gbq = ((TextUtils.TruncateAt)localObject1);
      }
    }
    paramCharSequence.gravity = parama.gravity;
    if (parama.gbS != -1)
    {
      paramInt = parama.gbS;
      if (paramInt >= 0) {
        paramCharSequence.gbr = paramInt;
      }
    }
    if (parama.gbs != null)
    {
      localObject1 = parama.gbs;
      if (Build.VERSION.SDK_INT >= 18) {
        paramCharSequence.gbs = ((TextDirectionHeuristic)localObject1);
      }
    }
    float f1 = parama.gbt;
    float f2 = parama.gbu;
    paramCharSequence.gbt = f1;
    paramCharSequence.gbu = f2;
    paramCharSequence.gbv = parama.gbv;
    if (parama.gbT != null)
    {
      if (parama.gbU == -1) {
        break label551;
      }
      localObject1 = parama.gbT;
      i = parama.gbU;
      if (i <= 0) {
        break label525;
      }
      if (localObject1 != null) {
        break label503;
      }
      localObject1 = Typeface.defaultFromStyle(i);
      paramCharSequence.a((Typeface)localObject1);
      if (localObject1 == null) {
        break label515;
      }
      paramInt = ((Typeface)localObject1).getStyle();
      label362:
      paramInt = (paramInt ^ 0xFFFFFFFF) & i;
      localObject1 = paramCharSequence.gbo;
      if ((paramInt & 0x1) != 0) {
        bool = true;
      }
      ((TextPaint)localObject1).setFakeBoldText(bool);
      localObject1 = paramCharSequence.gbo;
      if ((paramInt & 0x2) == 0) {
        break label520;
      }
      f1 = -0.25F;
      label406:
      ((TextPaint)localObject1).setTextSkewX(f1);
    }
    for (;;)
    {
      if (parama.gbV != -1.0F)
      {
        f1 = parama.gbV;
        paramCharSequence.gbo.setTextSize(f1);
      }
      if (parama.textColor != -1)
      {
        paramInt = parama.textColor;
        paramCharSequence.gbo.setColor(paramInt);
      }
      if (parama.linkColor != -1)
      {
        paramInt = parama.linkColor;
        paramCharSequence.gbo.linkColor = paramInt;
      }
      if (parama.gbA != null) {
        paramCharSequence.gbo = parama.gbA;
      }
      GMTrace.o(433925914624L, 3233);
      return paramCharSequence;
      label503:
      localObject1 = Typeface.create((Typeface)localObject1, i);
      break;
      label515:
      paramInt = 0;
      break label362;
      label520:
      f1 = 0.0F;
      break label406;
      label525:
      paramCharSequence.gbo.setFakeBoldText(false);
      paramCharSequence.gbo.setTextSkewX(0.0F);
      paramCharSequence.a((Typeface)localObject1);
      continue;
      label551:
      paramCharSequence.a(parama.gbT);
    }
  }
  
  @TargetApi(18)
  public final f xO()
  {
    GMTrace.i(434194350080L, 3235);
    int j;
    Object localObject1;
    if ((this.gbq == null) || (this.gbr <= 0))
    {
      j = this.width;
      if ((this.gbq == null) && (this.maxLines == 1)) {
        this.gbq = TextUtils.TruncateAt.END;
      }
      if ((this.maxLength > 0) && (this.gbw != null))
      {
        localObject1 = this.gbw.filter(this.gbl, 0, this.gbl.length(), gbj, 0, 0);
        if (localObject1 != null)
        {
          this.gbl = ((CharSequence)localObject1);
          if (this.gbn > this.gbl.length()) {
            this.gbn = this.gbl.length();
          }
        }
      }
      if (h.DEBUG) {
        w.i("StaticTextView.StaticLayoutBuilder", "StaticLayoutWrapper build " + this.gbl + " " + this.width);
      }
      if (this.gbp == Layout.Alignment.ALIGN_NORMAL) {}
      switch (this.gravity & 0x800007)
      {
      default: 
        this.gbp = Layout.Alignment.ALIGN_NORMAL;
        label251:
        this.gbo.setAntiAlias(true);
        localObject1 = null;
        if (((this.gbs != null) && ((!com.tencent.mm.compatible.util.d.et(18)) || (this.gbs != TextDirectionHeuristics.FIRSTSTRONG_LTR))) || ((this.maxLines != Integer.MAX_VALUE) && (this.maxLines != -1))) {
          break;
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      try
      {
        localObject3 = a(this.gbl, bool, j);
        localObject1 = localObject3;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Object localObject3;
          w.i("StaticTextView.StaticLayoutBuilder", "build static layout error: %s", new Object[] { localException2.getMessage() });
          int i = 0;
          if (i < 3)
          {
            int k = i;
            Object localObject4 = localObject1;
            try
            {
              SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.gbl);
              k = i;
              localObject4 = localObject1;
              MetricAffectingSpan[] arrayOfMetricAffectingSpan = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
              if (arrayOfMetricAffectingSpan != null)
              {
                k = i;
                localObject4 = localObject1;
                if (arrayOfMetricAffectingSpan.length > 0)
                {
                  k = i;
                  localObject4 = localObject1;
                  localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(arrayOfMetricAffectingSpan[0]) - 1, " ");
                  i += 1;
                }
              }
              for (;;)
              {
                k = i;
                localObject4 = localObject1;
                this.gbl = localSpannableStringBuilder;
                k = i;
                localObject4 = localObject1;
                localObject1 = a(this.gbl, bool, j);
                k = i;
                localObject4 = localObject1;
                w.i("StaticTextView.StaticLayoutBuilder", "fix from build static layout, fixCount: %s", new Object[] { Integer.valueOf(i) });
                break;
                i = 100;
              }
            }
            catch (Exception localException1)
            {
              w.i("StaticTextView.StaticLayoutBuilder", "fix, build static layout error: %s, fixCount: %s", new Object[] { localException1.getMessage(), Integer.valueOf(k) });
              i = k;
              Object localObject2 = localObject4;
            }
          }
        }
      }
      localObject3 = localObject1;
      if (localObject1 == null)
      {
        this.gbl = this.gbl.toString();
        localObject3 = a(this.gbl, bool, j);
      }
      localObject1 = new f((StaticLayout)localObject3);
      ((f)localObject1).gbz = this.gbk;
      ((f)localObject1).text = this.gbl;
      ((f)localObject1).maxLength = this.maxLength;
      ((f)localObject1).maxLines = this.maxLines;
      ((f)localObject1).gbp = this.gbp;
      ((f)localObject1).gbq = this.gbq;
      ((f)localObject1).gbA = this.gbo;
      ((f)localObject1).gravity = this.gravity;
      gbi.a(this);
      GMTrace.o(434194350080L, 3235);
      return (f)localObject1;
      j = this.gbr;
      break;
      this.gbp = Layout.Alignment.ALIGN_NORMAL;
      break label251;
      this.gbp = Layout.Alignment.ALIGN_OPPOSITE;
      break label251;
      this.gbp = Layout.Alignment.ALIGN_CENTER;
      break label251;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */