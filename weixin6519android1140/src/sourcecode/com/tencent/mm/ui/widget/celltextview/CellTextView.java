package com.tencent.mm.ui.widget.celltextview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.b.a.a;
import com.tencent.mm.ui.widget.celltextview.b.a.b;
import com.tencent.mm.ui.widget.celltextview.c.c;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CellTextView
  extends View
  implements a.b
{
  private static final LruCache<String, Boolean> xtl;
  private GestureDetector imP;
  protected Context mContext;
  public TextView xte;
  public boolean xtf;
  private a.a xtg;
  protected ArrayList<e> xth;
  protected LinkedList<com.tencent.mm.ui.widget.celltextview.c.b> xti;
  public b xtj;
  public c xtk;
  
  static
  {
    GMTrace.i(20302847279104L, 151268);
    xtl = new LruCache(200);
    GMTrace.o(20302847279104L, 151268);
  }
  
  public CellTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18757061705728L, 139751);
    b(paramContext, paramAttributeSet, 0);
    GMTrace.o(18757061705728L, 139751);
  }
  
  public CellTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18757195923456L, 139752);
    b(paramContext, paramAttributeSet, paramInt);
    GMTrace.o(18757195923456L, 139752);
  }
  
  private void Em(int paramInt)
  {
    GMTrace.i(18759074971648L, 139766);
    this.xte.setMaxLines(paramInt);
    cjw().Em(paramInt);
    GMTrace.o(18759074971648L, 139766);
  }
  
  private void Xj(String paramString)
  {
    GMTrace.i(19012478042112L, 141654);
    if (paramString == null)
    {
      GMTrace.o(19012478042112L, 141654);
      return;
    }
    setContentDescription(paramString);
    Object localObject;
    if (this.xtj != null)
    {
      localObject = this.xtj;
      TextView.BufferType localBufferType = TextView.BufferType.NORMAL;
      ((b)localObject).S(paramString);
    }
    boolean bool;
    if (xtl.get(paramString) == null)
    {
      localObject = xtl;
      if (!paramString.matches("^[[^\000-￿]\\u000A-\\u00b7\\u4E00-\\u9FA5\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uff1f\\uff5e\\ue107-\\ue14c\\ue403-\\ue41D\\ue312]+$"))
      {
        bool = true;
        ((LruCache)localObject).put(paramString, Boolean.valueOf(bool));
      }
    }
    else
    {
      this.xth.clear();
      bool = ((Boolean)xtl.get(paramString)).booleanValue();
      this.xtf = bool;
      if (!bool) {
        break label156;
      }
      this.xte.setLayoutParams(getLayoutParams());
      this.xte.setText(paramString);
    }
    for (;;)
    {
      requestLayout();
      invalidate();
      GMTrace.o(19012478042112L, 141654);
      return;
      bool = false;
      break;
      label156:
      this.xth.add(new e(cjw().getPaint(), 0, paramString, getTextSize()));
      cjw().a(this.xth, paramString);
    }
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(18758806536192L, 139764);
    this.mContext = paramContext;
    this.xth = new ArrayList();
    this.xti = new LinkedList();
    this.imP = new GestureDetector(paramContext, new a((byte)0));
    Object localObject = new TextView(paramContext);
    ((TextView)localObject).setClickable(true);
    ((TextView)localObject).setFocusable(true);
    this.xte = ((TextView)localObject);
    cjw();
    setOnTouchListener(new com.tencent.mm.ui.widget.celltextview.e.a());
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.emG, paramInt, 0);
    for (;;)
    {
      int i5;
      int n;
      int i1;
      int i2;
      int i3;
      try
      {
        int i4 = paramAttributeSet.getIndexCount();
        m = 0;
        k = 0;
        j = 0;
        i = 0;
        paramInt = 0;
        if (paramInt >= i4) {
          break label952;
        }
        i5 = paramAttributeSet.getIndex(paramInt);
        if (i5 == a.j.xvQ)
        {
          setTextSize(paramAttributeSet.getDimensionPixelSize(i5, (int)com.tencent.mm.ui.widget.celltextview.g.b.f(paramContext, 13.0F)));
          n = m;
          i1 = k;
          i2 = j;
          i3 = i;
        }
        else if (i5 == a.j.xvP)
        {
          n = paramAttributeSet.getColor(i5, -1);
          this.xte.setTextColor(n);
          cjw().setTextColor(n);
          invalidate();
          n = m;
          i1 = k;
          i2 = j;
          i3 = i;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      if (i5 == a.j.xvN)
      {
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
        if (paramAttributeSet.getBoolean(i5, false))
        {
          Em(1);
          n = m;
          i1 = k;
          i2 = j;
          i3 = i;
        }
      }
      else if (i5 == a.j.xvC)
      {
        n = paramAttributeSet.getInt(i5, 16);
        this.xte.setGravity(n);
        cjw().En(n);
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvG)
      {
        setMaxWidth(paramAttributeSet.getDimensionPixelSize(i5, -1));
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvE)
      {
        n = paramAttributeSet.getDimensionPixelSize(i5, -1);
        this.xte.setMaxHeight(n);
        cjw().setMaxHeight(n);
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvD)
      {
        n = paramAttributeSet.getDimensionPixelSize(i5, 0);
        this.xte.setLineSpacing(n, 1.0F);
        cjw().Eo(n);
        invalidate();
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvI)
      {
        n = paramAttributeSet.getDimensionPixelSize(i5, -1);
        this.xte.setMinWidth(n);
        cjw().setMinWidth(n);
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvH)
      {
        n = paramAttributeSet.getDimensionPixelSize(i5, -1);
        this.xte.setMinHeight(n);
        cjw().setMinHeight(n);
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvF)
      {
        Em(paramAttributeSet.getInt(i5, -1));
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvO)
      {
        Xj(paramAttributeSet.getString(i5));
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvK)
      {
        i3 = paramAttributeSet.getDimensionPixelSize(i5, 0);
        n = m;
        i1 = k;
        i2 = j;
      }
      else if (i5 == a.j.xvL)
      {
        i2 = paramAttributeSet.getDimensionPixelSize(i5, 0);
        n = m;
        i1 = k;
        i3 = i;
      }
      else if (i5 == a.j.xvM)
      {
        i1 = paramAttributeSet.getDimensionPixelSize(i5, 0);
        n = m;
        i2 = j;
        i3 = i;
      }
      else if (i5 == a.j.xvJ)
      {
        n = paramAttributeSet.getDimensionPixelSize(i5, 0);
        i1 = k;
        i2 = j;
        i3 = i;
      }
      else
      {
        n = m;
        i1 = k;
        i2 = j;
        i3 = i;
        if (i5 == a.j.xvB)
        {
          n = paramAttributeSet.getResourceId(i5, -1);
          localObject = getResources().getDrawable(n);
          if (localObject != null) {
            cjw().setBackgroundDrawable((Drawable)localObject);
          }
          for (;;)
          {
            this.xte.setBackground((Drawable)localObject);
            n = m;
            i1 = k;
            i2 = j;
            i3 = i;
            break;
            cjw().Ep(getResources().getColor(n));
          }
          label952:
          setPadding(i, k, j, m);
          paramAttributeSet.recycle();
          GMTrace.o(18758806536192L, 139764);
          return;
        }
      }
      paramInt += 1;
      int m = n;
      int k = i1;
      int j = i2;
      int i = i3;
    }
  }
  
  public final void U(CharSequence paramCharSequence)
  {
    GMTrace.i(19012612259840L, 141655);
    if (paramCharSequence == null)
    {
      GMTrace.o(19012612259840L, 141655);
      return;
    }
    setContentDescription(paramCharSequence);
    if ((paramCharSequence instanceof Spannable))
    {
      if (this.xtj != null)
      {
        localObject1 = this.xtj;
        localObject2 = TextView.BufferType.SPANNABLE;
        ((b)localObject1).S(paramCharSequence);
      }
      Object localObject1 = paramCharSequence.toString();
      if (xtl.get(localObject1) == null)
      {
        localObject2 = xtl;
        if (!((String)localObject1).matches("^[[^\000-￿]\\u000A-\\u00b7\\u4E00-\\u9FA5\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uff1f\\uff5e\\ue107-\\ue14c\\ue403-\\ue41D\\ue312]+$"))
        {
          bool = true;
          ((LruCache)localObject2).put(localObject1, Boolean.valueOf(bool));
        }
      }
      else
      {
        this.xth.clear();
        if ((!((Boolean)xtl.get(localObject1)).booleanValue()) && (isOpen())) {
          break label199;
        }
      }
      label199:
      for (boolean bool = true;; bool = false)
      {
        this.xtf = bool;
        if (!bool) {
          break label205;
        }
        this.xte.setLayoutParams(getLayoutParams());
        this.xte.setText(paramCharSequence);
        requestLayout();
        invalidate();
        GMTrace.o(19012612259840L, 141655);
        return;
        bool = false;
        break;
      }
      label205:
      this.xti.clear();
      localObject1 = cjw().getPaint();
      Object localObject2 = this.xti;
      ArrayList localArrayList = new ArrayList();
      if ((TextUtils.isEmpty(paramCharSequence)) || (localObject2 == null)) {}
      for (;;)
      {
        this.xth.addAll(localArrayList);
        cjw().a(this.xth, paramCharSequence);
        cjw().aB(this.xti);
        break;
        if ((paramCharSequence instanceof Spannable))
        {
          int k = paramCharSequence.length();
          Spannable localSpannable = (Spannable)paramCharSequence;
          int i = 0;
          if (i < k)
          {
            int j = localSpannable.nextSpanTransition(i, k, ForegroundColorSpan.class);
            int n = localSpannable.nextSpanTransition(i, k, BackgroundColorSpan.class);
            int i1 = localSpannable.nextSpanTransition(i, k, ClickableSpan.class);
            int i2 = localSpannable.nextSpanTransition(i, k, AbsoluteSizeSpan.class);
            int m = localSpannable.nextSpanTransition(i, k, ImageSpan.class);
            j = Math.min(m, Math.min(Math.min(i2, Math.min(j, i1)), n));
            Object localObject3 = (ImageSpan[])localSpannable.getSpans(i, j, ImageSpan.class);
            Object localObject4;
            if (localObject3.length > 0)
            {
              localObject3 = localObject3[0];
              localObject3 = new c((Paint)localObject1, localSpannable.subSequence(i, m).toString(), (ImageSpan)localObject3, i, m, ((Paint)localObject1).getTextSize());
              ((c)localObject3).aB(((Paint)localObject1).getTextSize());
              localObject4 = (AbsoluteSizeSpan[])localSpannable.getSpans(i, m, AbsoluteSizeSpan.class);
              if (localObject4.length > 0) {
                ((c)localObject3).aB(localObject4[0].getSize());
              }
              localArrayList.add(localObject3);
            }
            for (;;)
            {
              i = j;
              break;
              localObject3 = new e((Paint)localObject1);
              ((e)localObject3).aB(((Paint)localObject1).getTextSize());
              ((e)localObject3).setColor(((Paint)localObject1).getColor());
              ((e)localObject3).setText(localSpannable.subSequence(i, j).toString());
              localObject4 = (ForegroundColorSpan[])localSpannable.getSpans(i, j, ForegroundColorSpan.class);
              if (localObject4.length > 0) {
                ((e)localObject3).setColor(localObject4[0].getForegroundColor());
              }
              localObject4 = (BackgroundColorSpan[])localSpannable.getSpans(i, j, BackgroundColorSpan.class);
              if (localObject4.length > 0) {
                ((e)localObject3).Eu(localObject4[0].getBackgroundColor());
              }
              localObject4 = (AbsoluteSizeSpan[])localSpannable.getSpans(i, j, AbsoluteSizeSpan.class);
              if (localObject4.length > 0) {
                ((e)localObject3).aB(localObject4[0].getSize());
              }
              localObject4 = (ClickableSpan[])localSpannable.getSpans(i, j, ClickableSpan.class);
              if (localObject4.length > 0)
              {
                TextPaint localTextPaint = new TextPaint();
                localObject4[0].updateDrawState(localTextPaint);
                ((e)localObject3).setColor(localTextPaint.getColor());
                ((e)localObject3).setUnderlineText(localTextPaint.isUnderlineText());
                ((LinkedList)localObject2).add(new com.tencent.mm.ui.widget.celltextview.c.b(localObject4[0], i, j));
              }
              localArrayList.add(localObject3);
            }
          }
        }
      }
    }
    Xj(paramCharSequence.toString());
    GMTrace.o(19012612259840L, 141655);
  }
  
  public final a.a cjw()
  {
    GMTrace.i(18757330141184L, 139753);
    if (this.xtg == null)
    {
      this.xtg = new com.tencent.mm.ui.widget.celltextview.d.a(this.mContext, this.xte.getPaint());
      this.xtg.a(this);
    }
    a.a locala = this.xtg;
    GMTrace.o(18757330141184L, 139753);
    return locala;
  }
  
  public final String cjx()
  {
    GMTrace.i(18918122979328L, 140951);
    if ((this.xtf) || (!isOpen()))
    {
      str = this.xte.getText().toString();
      GMTrace.o(18918122979328L, 140951);
      return str;
    }
    String str = cjw().cjA();
    GMTrace.o(18918122979328L, 140951);
    return str;
  }
  
  public int getPaddingBottom()
  {
    GMTrace.i(18758135447552L, 139759);
    int i = cjw().getPaddingBottom();
    GMTrace.o(18758135447552L, 139759);
    return i;
  }
  
  public int getPaddingLeft()
  {
    GMTrace.i(18758269665280L, 139760);
    int i = cjw().getPaddingLeft();
    GMTrace.o(18758269665280L, 139760);
    return i;
  }
  
  public int getPaddingRight()
  {
    GMTrace.i(18758403883008L, 139761);
    int i = cjw().getPaddingRight();
    GMTrace.o(18758403883008L, 139761);
    return i;
  }
  
  public int getPaddingTop()
  {
    GMTrace.i(18758538100736L, 139762);
    int i = cjw().getPaddingTop();
    GMTrace.o(18758538100736L, 139762);
    return i;
  }
  
  public final float getTextSize()
  {
    GMTrace.i(19012746477568L, 141656);
    float f = cjw().getTextSize();
    GMTrace.o(19012746477568L, 141656);
    return f;
  }
  
  public final View getView()
  {
    GMTrace.i(18758672318464L, 139763);
    GMTrace.o(18758672318464L, 139763);
    return this;
  }
  
  public boolean isOpen()
  {
    GMTrace.i(21010577358848L, 156541);
    GMTrace.o(21010577358848L, 156541);
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(18757598576640L, 139755);
    super.onDraw(paramCanvas);
    if ((!this.xtf) && (isOpen()))
    {
      cjw().onDraw(paramCanvas);
      GMTrace.o(18757598576640L, 139755);
      return;
    }
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    this.xte.getLayout().draw(paramCanvas);
    paramCanvas.restore();
    GMTrace.o(18757598576640L, 139755);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18760148713472L, 139774);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 8192)
    {
      paramAccessibilityEvent.setFromIndex(Selection.getSelectionStart(cjx()));
      paramAccessibilityEvent.setToIndex(Selection.getSelectionEnd(cjx()));
      if (!TextUtils.isEmpty(cjx())) {
        paramAccessibilityEvent.setItemCount(cjx().length());
      }
    }
    GMTrace.o(18760148713472L, 139774);
  }
  
  @TargetApi(19)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(18760282931200L, 139775);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (!TextUtils.isEmpty(cjx()))
    {
      paramAccessibilityNodeInfo.addAction(256);
      paramAccessibilityNodeInfo.addAction(512);
      paramAccessibilityNodeInfo.setMovementGranularities(31);
      if (Build.VERSION.SDK_INT >= 18) {
        paramAccessibilityNodeInfo.addAction(131072);
      }
    }
    if ((isFocused()) && (Build.VERSION.SDK_INT >= 18))
    {
      paramAccessibilityNodeInfo.addAction(16384);
      paramAccessibilityNodeInfo.addAction(32768);
      paramAccessibilityNodeInfo.addAction(65536);
    }
    if ((Build.VERSION.SDK_INT >= 19) && (cjw().getMaxLines() > 1)) {
      paramAccessibilityNodeInfo.setMultiLine(true);
    }
    GMTrace.o(18760282931200L, 139775);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(18757464358912L, 139754);
    int i;
    if ((!this.xtf) && (isOpen()))
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      int k = View.MeasureSpec.getSize(paramInt1);
      i = paramInt1;
      if (j == 0)
      {
        i = paramInt1;
        if (k == 0) {
          i = Integer.MIN_VALUE;
        }
      }
    }
    for (;;)
    {
      try
      {
        cjw().onMeasure(i, paramInt2);
        setMeasuredDimension(cjw().getMeasuredWidth(), cjw().getMeasuredHeight());
        w.i("Changelcai", "[onMeasure] %s - %s", new Object[] { Integer.valueOf(cjw().getMeasuredWidth()), Integer.valueOf(cjw().getMeasuredHeight()) });
        setContentDescription(cjw().getText());
        GMTrace.o(18757464358912L, 139754);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.CellTextView", "break err!!! change to use sys textview", new Object[] { localException });
        xtl.put(cjw().getText(), Boolean.valueOf(true));
        this.xtf = true;
        this.xte.setText(this.xtg.getText());
        this.xte.measure(i, paramInt2);
        setMeasuredDimension(this.xte.getMeasuredWidth(), this.xte.getMeasuredHeight());
        GMTrace.o(18757464358912L, 139754);
        return;
      }
      this.xte.measure(paramInt1, paramInt2);
      setMeasuredDimension(this.xte.getMeasuredWidth(), this.xte.getMeasuredHeight());
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18760014495744L, 139773);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (!TextUtils.isEmpty(cjx())) {
      paramAccessibilityEvent.getText().add(cjx());
    }
    GMTrace.o(18760014495744L, 139773);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(18757867012096L, 139757);
    this.imP.onTouchEvent(paramMotionEvent);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(18757867012096L, 139757);
    return bool;
  }
  
  public void requestLayout()
  {
    GMTrace.i(18758001229824L, 139758);
    if (this.mContext != null) {
      cjw().requestLayout();
    }
    super.requestLayout();
    GMTrace.o(18758001229824L, 139758);
  }
  
  public final void setMaxWidth(int paramInt)
  {
    GMTrace.i(19012343824384L, 141653);
    this.xte.setMaxWidth(paramInt);
    cjw().setMaxWidth(paramInt);
    GMTrace.o(19012343824384L, 141653);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18757732794368L, 139756);
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mContext != null)
    {
      cjw().setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      this.xte.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    GMTrace.o(18757732794368L, 139756);
  }
  
  public final void setTextSize(float paramFloat)
  {
    GMTrace.i(19012209606656L, 141652);
    int i = (int)(paramFloat / this.mContext.getResources().getDisplayMetrics().density + 0.5F);
    this.xte.setTextSize(1, i);
    cjw().setTextSize(paramFloat);
    requestLayout();
    invalidate();
    GMTrace.o(19012209606656L, 141652);
  }
  
  private final class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private a()
    {
      GMTrace.i(18760685584384L, 139778);
      GMTrace.o(18760685584384L, 139778);
    }
    
    public final boolean onDoubleTap(MotionEvent paramMotionEvent)
    {
      GMTrace.i(18760819802112L, 139779);
      if (CellTextView.b(CellTextView.this) != null) {
        CellTextView.b(CellTextView.this).dv(CellTextView.this);
      }
      GMTrace.o(18760819802112L, 139779);
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract void S(CharSequence paramCharSequence);
  }
  
  public static abstract interface c
  {
    public abstract boolean dv(View paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\CellTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */