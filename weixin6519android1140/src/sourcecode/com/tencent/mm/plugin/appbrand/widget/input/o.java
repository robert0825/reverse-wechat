package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.j.c;
import com.tencent.mm.plugin.appbrand.jsapi.j.c.f;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.plugin.appbrand.widget.f.a;

public final class o
  extends w
{
  private a iJM;
  private final InputFilter iMD;
  private float iME;
  float iMF;
  private float iMG;
  private boolean iMH;
  private MotionEvent iMI;
  private boolean iMJ;
  final aa<o> iMK;
  private float inQ;
  
  public o(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17278921867264L, 128738);
    this.iMD = new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(18274280538112L, 136154);
        if ((!TextUtils.isEmpty(paramAnonymousCharSequence)) && (o.a(o.this) != null))
        {
          if ((paramAnonymousCharSequence instanceof Spannable)) {}
          for (paramAnonymousCharSequence = (Spannable)paramAnonymousCharSequence;; paramAnonymousCharSequence = new SpannableStringBuilder(paramAnonymousCharSequence))
          {
            paramAnonymousCharSequence.setSpan(o.a(o.this), 0, paramAnonymousCharSequence.length(), 18);
            GMTrace.o(18274280538112L, 136154);
            return paramAnonymousCharSequence;
          }
        }
        GMTrace.o(18274280538112L, 136154);
        return null;
      }
    };
    this.iME = 0.0F;
    this.iMF = 1.2F;
    this.iMG = getTextSize();
    this.iMH = false;
    this.iMJ = false;
    this.iMK = new aa(this);
    super.setSingleLine(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setVerticalScrollbarPosition(2);
    super.setSpannableFactory(new Spannable.Factory()
    {
      public final Spannable newSpannable(CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(17284693229568L, 128781);
        paramAnonymousCharSequence = super.newSpannable(paramAnonymousCharSequence);
        if ((o.a(o.this) != null) && (!TextUtils.isEmpty(paramAnonymousCharSequence))) {
          paramAnonymousCharSequence.setSpan(o.a(o.this), 0, paramAnonymousCharSequence.length(), 18);
        }
        GMTrace.o(17284693229568L, 128781);
        return paramAnonymousCharSequence;
      }
    });
    super.a(new y.b()
    {
      public final void acO()
      {
        GMTrace.i(19862344695808L, 147986);
        o.this.acK();
        GMTrace.o(19862344695808L, 147986);
      }
    });
    super.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(19865968574464L, 148013);
        boolean bool = o.this.acc();
        GMTrace.o(19865968574464L, 148013);
        return bool;
      }
    });
    this.inQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    cP(false);
    a(0.0F, false);
    GMTrace.o(17278921867264L, 128738);
  }
  
  final void a(float paramFloat, boolean paramBoolean)
  {
    GMTrace.i(17279592955904L, 128743);
    float f = paramFloat;
    if (paramFloat <= 0.0F) {
      f = this.iMF * this.iMG + this.iME;
    }
    if ((this.iJM != null) && (!this.iJM.X(f)))
    {
      GMTrace.o(17279592955904L, 128743);
      return;
    }
    this.iJM = new a(f);
    if (!paramBoolean)
    {
      GMTrace.o(17279592955904L, 128743);
      return;
    }
    if (hasFocus())
    {
      invalidate();
      GMTrace.o(17279592955904L, 128743);
      return;
    }
    adg();
    setText(getEditableText());
    adh();
    GMTrace.o(17279592955904L, 128743);
  }
  
  protected final void acK()
  {
    GMTrace.i(17279190302720L, 128740);
    if (this.iMH)
    {
      if (getMeasuredHeight() > getMaxHeight())
      {
        setMeasuredDimension(getMeasuredWidth(), getMaxHeight());
        GMTrace.o(17279190302720L, 128740);
        return;
      }
      if ((getMeasuredHeight() < getMinHeight()) && (getMinHeight() > 0)) {
        setMeasuredDimension(getMeasuredWidth(), getMinHeight());
      }
    }
    GMTrace.o(17279190302720L, 128740);
  }
  
  public final boolean acL()
  {
    GMTrace.i(17637148983296L, 131407);
    GMTrace.o(17637148983296L, 131407);
    return true;
  }
  
  public final boolean acM()
  {
    GMTrace.i(18282736254976L, 136217);
    GMTrace.o(18282736254976L, 136217);
    return false;
  }
  
  public final void acN()
  {
    GMTrace.i(18282870472704L, 136218);
    ad.cb(this).restartInput(this);
    GMTrace.o(18282870472704L, 136218);
  }
  
  public final boolean acc()
  {
    GMTrace.i(18846316494848L, 140416);
    if (!this.iMH)
    {
      adb();
      getMeasuredHeight();
    }
    if ((!isFocusable()) && (!this.iNE))
    {
      GMTrace.o(18846316494848L, 140416);
      return true;
    }
    GMTrace.o(18846316494848L, 140416);
    return false;
  }
  
  public final View acl()
  {
    GMTrace.i(18282602037248L, 136216);
    v localv = v.bW(this);
    GMTrace.o(18282602037248L, 136216);
    return localv;
  }
  
  final Editable c(Editable paramEditable)
  {
    GMTrace.i(19868250275840L, 148030);
    paramEditable = super.c(paramEditable);
    if ((this.iJM != null) && (!TextUtils.isEmpty(paramEditable))) {
      paramEditable.setSpan(this.iJM, 0, paramEditable.length(), 18);
    }
    GMTrace.o(19868250275840L, 148030);
    return paramEditable;
  }
  
  public final void cP(boolean paramBoolean)
  {
    GMTrace.i(19868384493568L, 148031);
    this.iMH = paramBoolean;
    if (!this.iMH) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setVerticalScrollBarEnabled(paramBoolean);
      GMTrace.o(19868384493568L, 148031);
      return;
    }
  }
  
  public final boolean canScrollVertically(int paramInt)
  {
    GMTrace.i(19868921364480L, 148035);
    if (adb() <= getHeight())
    {
      GMTrace.o(19868921364480L, 148035);
      return false;
    }
    boolean bool = super.canScrollVertically(paramInt);
    GMTrace.o(19868921364480L, 148035);
    return bool;
  }
  
  public final int getLineHeight()
  {
    GMTrace.i(17280129826816L, 128747);
    if (this.iJM != null)
    {
      i = this.iJM.height;
      GMTrace.o(17280129826816L, 128747);
      return i;
    }
    int i = super.getLineHeight();
    GMTrace.o(17280129826816L, 128747);
    return i;
  }
  
  @Deprecated
  public final float getLineSpacingExtra()
  {
    GMTrace.i(17279861391360L, 128745);
    float f = super.getLineSpacingExtra();
    GMTrace.o(17279861391360L, 128745);
    return f;
  }
  
  @Deprecated
  public final float getLineSpacingMultiplier()
  {
    GMTrace.i(17279727173632L, 128744);
    float f = super.getLineSpacingMultiplier();
    GMTrace.o(17279727173632L, 128744);
    return f;
  }
  
  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19868518711296L, 148032);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(19868518711296L, 148032);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(18846450712576L, 140417);
    int i;
    float f1;
    float f2;
    label240:
    boolean bool;
    label412:
    label486:
    label513:
    label568:
    float f3;
    if ((acc()) && ((getParent() instanceof e)))
    {
      if ((paramMotionEvent.getActionMasked() != 0) || (((e)getParent()).C(paramMotionEvent)))
      {
        aa localaa = this.iMK;
        b.a(localaa.TAG, "processTouchEvent", paramMotionEvent);
        Object localObject2 = localaa.iNS;
        i = paramMotionEvent.getActionIndex();
        f1 = paramMotionEvent.getX(i);
        f2 = paramMotionEvent.getY(i);
        if ((paramMotionEvent.getActionMasked() != 0) && (localaa.iNU == null))
        {
          com.tencent.mm.sdk.platformtools.w.v(localaa.TAG, "[textscroll] no pointer down before, just return");
          localaa.adk();
          GMTrace.o(18846450712576L, 140417);
          return false;
        }
        int j = 0;
        Object localObject1;
        Object localObject3;
        switch (paramMotionEvent.getActionMasked())
        {
        default: 
          localObject1 = localaa.iNS;
          localObject3 = localaa.iNS.getText();
          if ((((TextView)localObject1).canScrollVertically(-1)) || (((TextView)localObject1).canScrollVertically(1))) {
            switch (paramMotionEvent.getActionMasked())
            {
            }
          }
          break;
        }
        for (;;)
        {
          i = 0;
          for (;;)
          {
            bool = i | j;
            b.a(localaa.TAG, "[textscroll] handled | " + bool, paramMotionEvent);
            GMTrace.o(18846450712576L, 140417);
            return bool;
            com.tencent.mm.sdk.platformtools.w.v(localaa.TAG, "[apptouch] ACTION_UP, pointerDown %B", new Object[] { Boolean.valueOf(localaa.iNV) });
            if ((localaa.iNV) && (localaa.iNU != null))
            {
              localObject1 = c.bG(localaa.iNS);
              if ((localaa.iNT != null) && (Math.abs(localaa.iNT.x - ((c.f)localObject1).x) <= 1.0F) && (Math.abs(localaa.iNT.y - ((c.f)localObject1).y) <= 1.0F)) {
                break label412;
              }
              com.tencent.mm.sdk.platformtools.w.v(localaa.TAG, "[apptouch] check tap on ACTION_UP, but view has moved.");
            }
            for (;;)
            {
              localaa.adk();
              break;
              if (!localaa.a(localaa.iNU, paramMotionEvent)) {
                com.tencent.mm.sdk.platformtools.w.v(localaa.TAG, "[apptouch] check tap on ACTION_UP exceed tap scope");
              } else {
                ((y)localObject2).p(f1, f2);
              }
            }
            localaa.iNU = MotionEvent.obtain(paramMotionEvent);
            localaa.iNT = c.bG((View)localObject2);
            if (localObject2 != null)
            {
              localObject1 = ((View)localObject2).getParent();
              if ((localObject1 != null) && ((localObject1 instanceof ViewGroup))) {
                if (((ViewGroup)localObject1).shouldDelayChildPressedState())
                {
                  i = 1;
                  ((EditText)localObject2).removeCallbacks(localaa.iNW);
                  if (i == 0) {
                    break label568;
                  }
                  ((EditText)localObject2).postDelayed(localaa.iNW, ViewConfiguration.getTapTimeout());
                }
              }
            }
            for (;;)
            {
              j = 1;
              break;
              localObject1 = ((ViewParent)localObject1).getParent();
              break label486;
              i = 0;
              break label513;
              localaa.iNW.run();
            }
            localaa.adk();
            break;
            f3 = localaa.iLm;
            if ((f1 >= -f3) && (f2 >= -f3) && (f1 < ((View)localObject2).getWidth() + f3) && (f2 < ((View)localObject2).getHeight() + f3)) {}
            for (i = 1;; i = 0)
            {
              if ((i != 0) && (localaa.a(localaa.iNU, paramMotionEvent))) {
                break label699;
              }
              localaa.iNV = false;
              ((EditText)localObject2).removeCallbacks(localaa.iNW);
              ((EditText)localObject2).removeCallbacks(localaa.iNX);
              break;
            }
            label699:
            j = 1;
            break;
            localObject2 = (ac.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ac.a.class);
            i = 0;
            while (i < localObject2.length)
            {
              ((Spannable)localObject3).removeSpan(localObject2[i]);
              i += 1;
            }
            ((Spannable)localObject3).setSpan(new ac.a(paramMotionEvent.getX(), paramMotionEvent.getY(), ((TextView)localObject1).getScrollX(), ((TextView)localObject1).getScrollY()), 0, 0, 17);
            i = 1;
            continue;
            localObject1 = ac.e((TextView)localObject1);
            if ((localObject1 != null) && (localObject1.length > 0) && (localObject1[0].iOj))
            {
              i = 1;
            }
            else
            {
              i = 0;
              continue;
              localObject2 = (ac.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ac.a.class);
              if (localObject2.length <= 0) {
                break label240;
              }
              if (!localObject2[0].iOi)
              {
                i = ViewConfiguration.get(((TextView)localObject1).getContext()).getScaledTouchSlop();
                if ((Math.abs(paramMotionEvent.getX() - localObject2[0].aao) >= i) || (Math.abs(paramMotionEvent.getY() - localObject2[0].aap) >= i)) {
                  localObject2[0].iOi = true;
                }
              }
              if (!localObject2[0].iOi) {
                break label240;
              }
              localObject2[0].iOj = true;
              if (((paramMotionEvent.getMetaState() & 0x1) != 0) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 1) == 1) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 2048) != 0))
              {
                i = 1;
                label997:
                if (i == 0) {
                  break label1085;
                }
                f2 = paramMotionEvent.getX() - localObject2[0].aao;
              }
              for (f1 = paramMotionEvent.getY() - localObject2[0].aap;; f1 = localObject2[0].aap - paramMotionEvent.getY())
              {
                localObject2[0].aao = paramMotionEvent.getX();
                localObject2[0].aap = paramMotionEvent.getY();
                if (!localObject2[0].iOl) {
                  break label1114;
                }
                localObject2[0].iOl = false;
                localObject2[0].iOi = false;
                break;
                i = 0;
                break label997;
                label1085:
                f2 = localObject2[0].aao - paramMotionEvent.getX();
              }
              label1114:
              int i1 = ((TextView)localObject1).getScrollX();
              int i2 = (int)f2;
              i = ((TextView)localObject1).getScrollY();
              int k = (int)f1;
              int m = ((TextView)localObject1).getTotalPaddingTop();
              int n = ((TextView)localObject1).getTotalPaddingBottom();
              localObject3 = ((TextView)localObject1).getLayout();
              k = Math.max(Math.min(k + i, ((Layout)localObject3).getHeight() - (((TextView)localObject1).getHeight() - (m + n))), 0);
              m = ((TextView)localObject1).getScrollX();
              n = ((TextView)localObject1).getScrollY();
              i = ((TextView)localObject1).getTotalPaddingLeft();
              int i3 = ((TextView)localObject1).getTotalPaddingRight();
              i3 = ((TextView)localObject1).getWidth() - (i + i3);
              i = ((Layout)localObject3).getLineForVertical(k);
              Layout.Alignment localAlignment = ((Layout)localObject3).getParagraphAlignment(i);
              label1260:
              int i4;
              if (((Layout)localObject3).getParagraphDirection(i) > 0)
              {
                i = 1;
                i4 = i3 + 0;
                if (i4 >= i3) {
                  break label1390;
                }
                if (localAlignment != Layout.Alignment.ALIGN_CENTER) {
                  break label1346;
                }
                i = 0 - (i3 - i4) / 2;
              }
              for (;;)
              {
                ((TextView)localObject1).scrollTo(i, k);
                if ((m == ((TextView)localObject1).getScrollX()) && (n == ((TextView)localObject1).getScrollY())) {
                  break label1408;
                }
                ((TextView)localObject1).cancelLongPress();
                localObject2[0].iOk = true;
                i = 1;
                break;
                i = 0;
                break label1260;
                label1346:
                if (((i != 0) && (localAlignment == Layout.Alignment.ALIGN_OPPOSITE)) || ((i == 0) && (localAlignment == Layout.Alignment.ALIGN_NORMAL)))
                {
                  i = 0 - (i3 - i4);
                }
                else
                {
                  i = 0;
                  continue;
                  label1390:
                  i = Math.max(Math.min(i2 + i1, 0), 0);
                }
              }
              label1408:
              if (!localObject2[0].iOk) {
                break label1424;
              }
              i = 1;
            }
          }
          label1424:
          ac.e((TextView)localObject1);
        }
      }
      GMTrace.o(18846450712576L, 140417);
      return false;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(18846450712576L, 140417);
      return bool;
      this.iMJ = false;
      if (this.iMI != null)
      {
        this.iMI.recycle();
        this.iMI = null;
      }
      if (this.iMJ)
      {
        i = ad.b.a(this, paramMotionEvent.getX(paramMotionEvent.getActionIndex()), paramMotionEvent.getY(paramMotionEvent.getActionIndex()));
        if (i >= 0)
        {
          setSelection(i);
          continue;
          this.iMI = MotionEvent.obtain(paramMotionEvent);
          this.iMJ = true;
          continue;
          if (this.iMJ)
          {
            f1 = this.iMI.getX(this.iMI.getActionIndex());
            f2 = this.iMI.getY(this.iMI.getActionIndex());
            f3 = paramMotionEvent.getX(paramMotionEvent.getActionIndex());
            float f4 = paramMotionEvent.getY(paramMotionEvent.getActionIndex());
            if ((Math.abs(f1 - f3) > this.inQ) || (Math.abs(f2 - f4) > this.inQ))
            {
              cancelLongPress();
              setPressed(false);
              this.iMJ = false;
            }
          }
        }
      }
    }
  }
  
  public final void p(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18846584930304L, 140418);
    if (!isEnabled())
    {
      GMTrace.o(18846584930304L, 140418);
      return;
    }
    if (acc())
    {
      int i = ad.b.a(this, paramFloat1, paramFloat2);
      if (i >= 0) {
        setSelection(i);
      }
    }
    super.performClick();
    GMTrace.o(18846584930304L, 140418);
  }
  
  public final boolean performHapticFeedback(int paramInt1, int paramInt2)
  {
    GMTrace.i(19869055582208L, 148036);
    boolean bool = super.performHapticFeedback(paramInt1, paramInt2);
    GMTrace.o(19869055582208L, 148036);
    return bool;
  }
  
  public final void scrollBy(int paramInt1, int paramInt2)
  {
    GMTrace.i(19868787146752L, 148034);
    super.scrollBy(paramInt1, paramInt2);
    GMTrace.o(19868787146752L, 148034);
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    GMTrace.i(19868652929024L, 148033);
    super.scrollTo(paramInt1, paramInt2);
    GMTrace.o(19868652929024L, 148033);
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    GMTrace.i(17279458738176L, 128742);
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (this.iMD != null)
    {
      arrayOfInputFilter = paramArrayOfInputFilter;
      if (paramArrayOfInputFilter == null) {
        arrayOfInputFilter = new InputFilter[0];
      }
      paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
      while (i < arrayOfInputFilter.length)
      {
        paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
        i += 1;
      }
      paramArrayOfInputFilter[i] = this.iMD;
      arrayOfInputFilter = paramArrayOfInputFilter;
    }
    super.setFilters(arrayOfInputFilter);
    GMTrace.o(17279458738176L, 128742);
  }
  
  public final void setGravity(int paramInt)
  {
    GMTrace.i(18282333601792L, 136214);
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFEF | 0x30);
    GMTrace.o(18282333601792L, 136214);
  }
  
  public final void setInputType(int paramInt)
  {
    GMTrace.i(18282467819520L, 136215);
    super.setInputType(0x20000 | paramInt);
    GMTrace.o(18282467819520L, 136215);
  }
  
  public final void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(17280264044544L, 128748);
    this.iME = paramFloat1;
    this.iMF = paramFloat2;
    a(0.0F, true);
    GMTrace.o(17280264044544L, 128748);
  }
  
  public final void setSingleLine(boolean paramBoolean)
  {
    GMTrace.i(17279324520448L, 128741);
    GMTrace.o(17279324520448L, 128741);
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    GMTrace.i(17279995609088L, 128746);
    super.setTextSize(paramInt, paramFloat);
    this.iMG = TypedValue.applyDimension(paramInt, paramFloat, getResources().getDisplayMetrics());
    a(0.0F, true);
    GMTrace.o(17279995609088L, 128746);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */