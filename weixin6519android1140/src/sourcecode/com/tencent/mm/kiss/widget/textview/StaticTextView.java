package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public class StaticTextView
  extends View
  implements a
{
  protected g gbC;
  
  public StaticTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(444931768320L, 3315);
    this.gbC = new g(this, xR());
    this.gbC.init();
    GMTrace.o(444931768320L, 3315);
  }
  
  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(445065986048L, 3316);
    this.gbC = new g(this, xR());
    this.gbC.init();
    GMTrace.o(445065986048L, 3316);
  }
  
  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(445200203776L, 3317);
    this.gbC = new g(this, xR());
    this.gbC.init();
    GMTrace.o(445200203776L, 3317);
  }
  
  public final void J(float paramFloat)
  {
    GMTrace.i(445737074688L, 3321);
    this.gbC.setTextSize(1, paramFloat);
    GMTrace.o(445737074688L, 3321);
  }
  
  public final void b(com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    GMTrace.i(445602856960L, 3320);
    this.gbC.gbE = parama;
    GMTrace.o(445602856960L, 3320);
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(445871292416L, 3322);
    this.gbC.b(paramf);
    GMTrace.o(445871292416L, 3322);
  }
  
  public final int getLineCount()
  {
    GMTrace.i(447481905152L, 3334);
    int i = this.gbC.getLineCount();
    GMTrace.o(447481905152L, 3334);
    return i;
  }
  
  public final int getLineHeight()
  {
    GMTrace.i(447616122880L, 3335);
    int i = this.gbC.getLineHeight();
    GMTrace.o(447616122880L, 3335);
    return i;
  }
  
  public final CharSequence getText()
  {
    GMTrace.i(446945034240L, 3330);
    CharSequence localCharSequence = this.gbC.getText();
    GMTrace.o(446945034240L, 3330);
    return localCharSequence;
  }
  
  public final float getTextSize()
  {
    GMTrace.i(447079251968L, 3331);
    float f = this.gbC.getTextSize();
    GMTrace.o(447079251968L, 3331);
    return f;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(448689864704L, 3343);
    super.onAttachedToWindow();
    GMTrace.o(448689864704L, 3343);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(449226735616L, 3347);
    super.onConfigurationChanged(paramConfiguration);
    GMTrace.o(449226735616L, 3347);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(448824082432L, 3344);
    super.onDetachedFromWindow();
    GMTrace.o(448824082432L, 3344);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(448152993792L, 3339);
    super.onDraw(paramCanvas);
    if (this.gbC != null) {
      this.gbC.onDraw(paramCanvas);
    }
    GMTrace.o(448152993792L, 3339);
  }
  
  public void onFinishTemporaryDetach()
  {
    GMTrace.i(449092517888L, 3346);
    super.onFinishTemporaryDetach();
    GMTrace.o(449092517888L, 3346);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(14455115087872L, 107699);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 8192)
    {
      paramAccessibilityEvent.setFromIndex(Selection.getSelectionStart(this.gbC.getText()));
      paramAccessibilityEvent.setToIndex(Selection.getSelectionEnd(this.gbC.getText()));
      if (!bg.L(this.gbC.getText())) {
        paramAccessibilityEvent.setItemCount(this.gbC.getText().length());
      }
    }
    GMTrace.o(14455115087872L, 107699);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(14454980870144L, 107698);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (!bg.L(this.gbC.getText()))
    {
      paramAccessibilityNodeInfo.addAction(256);
      paramAccessibilityNodeInfo.addAction(512);
      paramAccessibilityNodeInfo.setMovementGranularities(31);
      if (d.et(18)) {
        paramAccessibilityNodeInfo.addAction(131072);
      }
    }
    if ((isFocused()) && (d.et(18)))
    {
      paramAccessibilityNodeInfo.addAction(16384);
      paramAccessibilityNodeInfo.addAction(32768);
      paramAccessibilityNodeInfo.addAction(65536);
    }
    g localg;
    if (d.et(19))
    {
      localg = this.gbC;
      if (localg.gbE == null) {
        break label141;
      }
    }
    label141:
    for (int i = localg.gbE.maxLines;; i = -1)
    {
      if (i > 1) {
        paramAccessibilityNodeInfo.setMultiLine(true);
      }
      GMTrace.o(14454980870144L, 107698);
      return;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(448555646976L, 3342);
    if (this.gbC == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(448555646976L, 3342);
      return;
    }
    Point localPoint = this.gbC.aH(paramInt1, paramInt2);
    if (localPoint != null)
    {
      setMeasuredDimension(localPoint.x, localPoint.y);
      GMTrace.o(448555646976L, 3342);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(448555646976L, 3342);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(14454846652416L, 107697);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (!bg.L(this.gbC.getText())) {
      paramAccessibilityEvent.getText().add(this.gbC.getText());
    }
    GMTrace.o(14454846652416L, 107697);
  }
  
  public void onStartTemporaryDetach()
  {
    GMTrace.i(448958300160L, 3345);
    super.onStartTemporaryDetach();
    GMTrace.o(448958300160L, 3345);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(447884558336L, 3337);
    if (this.gbC.xT() == null)
    {
      GMTrace.o(447884558336L, 3337);
      return false;
    }
    boolean bool1 = this.gbC.v(paramMotionEvent);
    boolean bool2 = super.onTouchEvent(paramMotionEvent);
    if (bool1)
    {
      GMTrace.o(447884558336L, 3337);
      return true;
    }
    GMTrace.o(447884558336L, 3337);
    return bool2;
  }
  
  public boolean performClick()
  {
    GMTrace.i(448018776064L, 3338);
    if (this.gbC == null)
    {
      GMTrace.o(448018776064L, 3338);
      return false;
    }
    if (!this.gbC.performClick())
    {
      GMTrace.o(448018776064L, 3338);
      return false;
    }
    boolean bool = super.performClick();
    GMTrace.o(448018776064L, 3338);
    return bool;
  }
  
  public void setClickable(boolean paramBoolean)
  {
    GMTrace.i(447750340608L, 3336);
    super.setClickable(paramBoolean);
    if (this.gbC != null) {
      this.gbC.gbK = paramBoolean;
    }
    GMTrace.o(447750340608L, 3336);
  }
  
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(446676598784L, 3328);
    if (this.gbC != null) {
      this.gbC.xV();
    }
    super.setLayoutParams(paramLayoutParams);
    GMTrace.o(446676598784L, 3328);
  }
  
  public void setMaxLines(int paramInt)
  {
    GMTrace.i(446273945600L, 3325);
    this.gbC.setMaxLines(paramInt);
    GMTrace.o(446273945600L, 3325);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(446810816512L, 3329);
    if (this.gbC != null) {
      this.gbC.xV();
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(446810816512L, 3329);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(446542381056L, 3327);
    setText(paramCharSequence, true);
    GMTrace.o(446542381056L, 3327);
  }
  
  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    GMTrace.i(446408163328L, 3326);
    this.gbC.setText(paramCharSequence, paramBoolean);
    setContentDescription(paramCharSequence);
    GMTrace.o(446408163328L, 3326);
  }
  
  public final void setTextColor(int paramInt)
  {
    GMTrace.i(446005510144L, 3323);
    this.gbC.setTextColor(paramInt);
    GMTrace.o(446005510144L, 3323);
  }
  
  public final int xL()
  {
    GMTrace.i(448287211520L, 3340);
    if (this.gbC == null)
    {
      GMTrace.o(448287211520L, 3340);
      return 0;
    }
    int i = this.gbC.gbH;
    GMTrace.o(448287211520L, 3340);
    return i;
  }
  
  public final int xM()
  {
    GMTrace.i(448421429248L, 3341);
    if (this.gbC == null)
    {
      GMTrace.o(448421429248L, 3341);
      return 0;
    }
    int i = this.gbC.gbI;
    GMTrace.o(448421429248L, 3341);
    return i;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a xQ()
  {
    GMTrace.i(445334421504L, 3318);
    if (this.gbC == null)
    {
      GMTrace.o(445334421504L, 3318);
      return null;
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = this.gbC.gbE;
    GMTrace.o(445334421504L, 3318);
    return locala;
  }
  
  public com.tencent.mm.kiss.widget.textview.a.a xR()
  {
    GMTrace.i(445468639232L, 3319);
    com.tencent.mm.kiss.widget.textview.a.a locala = new com.tencent.mm.kiss.widget.textview.a.a();
    GMTrace.o(445468639232L, 3319);
    return locala;
  }
  
  public final void xS()
  {
    GMTrace.i(446139727872L, 3324);
    this.gbC.setGravity(16);
    GMTrace.o(446139727872L, 3324);
  }
  
  public final Layout xT()
  {
    GMTrace.i(447213469696L, 3332);
    Layout localLayout = this.gbC.xT();
    GMTrace.o(447213469696L, 3332);
    return localLayout;
  }
  
  public final f xU()
  {
    GMTrace.i(447347687424L, 3333);
    if (this.gbC == null)
    {
      GMTrace.o(447347687424L, 3333);
      return null;
    }
    f localf = this.gbC.xU();
    GMTrace.o(447347687424L, 3333);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\StaticTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */