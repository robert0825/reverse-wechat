package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  boolean Aa;
  TextWatcher WD;
  private TextPaint iOt;
  TextView jU;
  ArrayList<Object> mListeners;
  private float mej;
  private int mek;
  float mel;
  private float mem;
  float men;
  boolean meo;
  
  a(TextView paramTextView)
  {
    GMTrace.i(12582777782272L, 93749);
    this.WD = new a();
    float f = paramTextView.getContext().getResources().getDisplayMetrics().scaledDensity;
    this.jU = paramTextView;
    this.iOt = new TextPaint();
    ac(paramTextView.getTextSize());
    int i = -1;
    TransformationMethod localTransformationMethod = paramTextView.getTransformationMethod();
    if ((localTransformationMethod != null) && ((localTransformationMethod instanceof SingleLineTransformationMethod))) {
      i = 1;
    }
    for (;;)
    {
      this.mek = i;
      this.mel = (8.0F * f);
      this.mem = this.mej;
      this.men = 0.5F;
      GMTrace.o(12582777782272L, 93749);
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        i = paramTextView.getMaxLines();
      }
    }
  }
  
  private static float a(CharSequence paramCharSequence, TextPaint paramTextPaint, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4, DisplayMetrics paramDisplayMetrics)
  {
    GMTrace.i(12582643564544L, 93748);
    float f1 = paramFloat2;
    paramFloat2 = (f1 + paramFloat3) / 2.0F;
    paramTextPaint.setTextSize(TypedValue.applyDimension(0, paramFloat2, paramDisplayMetrics));
    StaticLayout localStaticLayout;
    if (paramInt != 1) {
      localStaticLayout = new StaticLayout(paramCharSequence, paramTextPaint, (int)paramFloat1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }
    for (int i = localStaticLayout.getLineCount();; i = 1)
    {
      if (i > paramInt)
      {
        if (paramFloat3 - f1 < paramFloat4)
        {
          GMTrace.o(12582643564544L, 93748);
          return f1;
        }
        paramFloat3 = paramFloat2;
        break;
      }
      if (i < paramInt)
      {
        f1 = paramFloat2;
        break;
      }
      float f3;
      if (paramInt == 1)
      {
        f3 = paramTextPaint.measureText(paramCharSequence, 0, paramCharSequence.length());
        if (paramFloat3 - f1 < paramFloat4)
        {
          GMTrace.o(12582643564544L, 93748);
          return f1;
        }
      }
      else
      {
        float f2 = 0.0F;
        int j = 0;
        for (;;)
        {
          f3 = f2;
          if (j >= i) {
            break;
          }
          f3 = f2;
          if (localStaticLayout.getLineWidth(j) > f2) {
            f3 = localStaticLayout.getLineWidth(j);
          }
          j += 1;
          f2 = f3;
        }
      }
      if (f3 > paramFloat1)
      {
        paramFloat3 = paramFloat2;
        break;
      }
      if (f3 < paramFloat1)
      {
        f1 = paramFloat2;
        break;
      }
      GMTrace.o(12582643564544L, 93748);
      return paramFloat2;
      localStaticLayout = null;
    }
  }
  
  private void aGT()
  {
    GMTrace.i(12583314653184L, 93753);
    if (this.mListeners == null)
    {
      GMTrace.o(12583314653184L, 93753);
      return;
    }
    Iterator localIterator = this.mListeners.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
    GMTrace.o(12583314653184L, 93753);
  }
  
  public final void aGS()
  {
    GMTrace.i(12583180435456L, 93752);
    float f4 = this.jU.getTextSize();
    this.meo = true;
    TextView localTextView = this.jU;
    TextPaint localTextPaint = this.iOt;
    float f3 = this.mel;
    float f1 = this.mem;
    int i = this.mek;
    float f2 = this.men;
    if ((i <= 0) || (i == Integer.MAX_VALUE)) {}
    int j;
    do
    {
      this.meo = false;
      if (this.jU.getTextSize() != f4) {
        aGT();
      }
      GMTrace.o(12583180435456L, 93752);
      return;
      j = localTextView.getWidth() - localTextView.getPaddingLeft() - localTextView.getPaddingRight();
    } while (j <= 0);
    Object localObject2 = localTextView.getText();
    Object localObject3 = localTextView.getTransformationMethod();
    Object localObject1 = localObject2;
    if (localObject3 != null) {
      localObject1 = ((TransformationMethod)localObject3).getTransformation((CharSequence)localObject2, localTextView);
    }
    localObject3 = localTextView.getContext();
    localObject2 = Resources.getSystem();
    if (localObject3 != null) {
      localObject2 = ((Context)localObject3).getResources();
    }
    localObject2 = ((Resources)localObject2).getDisplayMetrics();
    localTextPaint.set(localTextView.getPaint());
    localTextPaint.setTextSize(f1);
    if ((i != 1) || (localTextPaint.measureText((CharSequence)localObject1, 0, ((CharSequence)localObject1).length()) <= j))
    {
      float f5 = j;
      localTextPaint.setTextSize(TypedValue.applyDimension(0, f1, (DisplayMetrics)localObject2));
      if (new StaticLayout((CharSequence)localObject1, localTextPaint, (int)f5, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true).getLineCount() <= i) {}
    }
    else
    {
      f1 = a((CharSequence)localObject1, localTextPaint, j, i, 0.0F, f1, f2, (DisplayMetrics)localObject2);
    }
    for (;;)
    {
      f2 = f1;
      if (f1 < f3) {
        f2 = f3;
      }
      localTextView.setTextSize(0, f2);
      break;
    }
  }
  
  final void ac(float paramFloat)
  {
    GMTrace.i(12583046217728L, 93751);
    if (this.mej != paramFloat) {
      this.mej = paramFloat;
    }
    GMTrace.o(12583046217728L, 93751);
  }
  
  public final a oW(int paramInt)
  {
    GMTrace.i(12582912000000L, 93750);
    if (this.mek != paramInt)
    {
      this.mek = paramInt;
      aGS();
    }
    GMTrace.o(12582912000000L, 93750);
    return this;
  }
  
  private final class a
    implements TextWatcher
  {
    public a()
    {
      GMTrace.i(12579690774528L, 93726);
      GMTrace.o(12579690774528L, 93726);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(12580093427712L, 93729);
      GMTrace.o(12580093427712L, 93729);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(12579824992256L, 93727);
      GMTrace.o(12579824992256L, 93727);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(12579959209984L, 93728);
      a.this.aGS();
      GMTrace.o(12579959209984L, 93728);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */