package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.k;
import android.support.v7.view.b;
import android.support.v7.view.menu.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView
  extends a
{
  private TextView EN;
  private View LH;
  private LinearLayout LI;
  private TextView LJ;
  private int LK;
  private int LL;
  public boolean LM;
  private int LN;
  private View jQ;
  public CharSequence tX;
  public CharSequence tY;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(paramContext, paramAttributeSet, a.k.ActionMode, paramInt);
    setBackgroundDrawable(paramContext.getDrawable(a.k.ActionMode_background));
    this.LK = paramContext.getResourceId(a.k.ActionMode_titleTextStyle, 0);
    this.LL = paramContext.getResourceId(a.k.ActionMode_subtitleTextStyle, 0);
    this.Lr = paramContext.getLayoutDimension(a.k.ActionMode_height, 0);
    this.LN = paramContext.getResourceId(a.k.ActionMode_closeItemLayout, a.h.abc_action_mode_close_item_material);
    paramContext.Yu.recycle();
  }
  
  private void dL()
  {
    int m = 8;
    int j = 1;
    if (this.LI == null)
    {
      LayoutInflater.from(getContext()).inflate(a.h.abc_action_bar_title_item, this);
      this.LI = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.EN = ((TextView)this.LI.findViewById(a.f.action_bar_title));
      this.LJ = ((TextView)this.LI.findViewById(a.f.action_bar_subtitle));
      if (this.LK != 0) {
        this.EN.setTextAppearance(getContext(), this.LK);
      }
      if (this.LL != 0) {
        this.LJ.setTextAppearance(getContext(), this.LL);
      }
    }
    this.EN.setText(this.tX);
    this.LJ.setText(this.tY);
    int i;
    label167:
    Object localObject;
    if (!TextUtils.isEmpty(this.tX))
    {
      i = 1;
      if (TextUtils.isEmpty(this.tY)) {
        break label234;
      }
      localObject = this.LJ;
      if (j == 0) {
        break label239;
      }
    }
    label234:
    label239:
    for (int k = 0;; k = 8)
    {
      ((TextView)localObject).setVisibility(k);
      localObject = this.LI;
      if (i == 0)
      {
        i = m;
        if (j == 0) {}
      }
      else
      {
        i = 0;
      }
      ((LinearLayout)localObject).setVisibility(i);
      if (this.LI.getParent() == null) {
        addView(this.LI);
      }
      return;
      i = 0;
      break;
      j = 0;
      break label167;
    }
  }
  
  public final void K(boolean paramBoolean)
  {
    if (paramBoolean != this.LM) {
      requestLayout();
    }
    this.LM = paramBoolean;
  }
  
  public final void ay(int paramInt)
  {
    this.Lr = paramInt;
  }
  
  public final void c(final b paramb)
  {
    if (this.LH == null)
    {
      this.LH = LayoutInflater.from(getContext()).inflate(this.LN, this, false);
      addView(this.LH);
    }
    for (;;)
    {
      this.LH.findViewById(a.f.action_mode_close_button).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramb.finish();
        }
      });
      paramb = (f)paramb.getMenu();
      if (this.Lq != null) {
        this.Lq.dX();
      }
      this.Lq = new ActionMenuPresenter(getContext());
      this.Lq.dW();
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      paramb.a(this.Lq, this.Lo);
      this.Lp = ((ActionMenuView)this.Lq.c(this));
      this.Lp.setBackgroundDrawable(null);
      addView(this.Lp, localLayoutParams);
      return;
      if (this.LH.getParent() == null) {
        addView(this.LH);
      }
    }
  }
  
  public final void dM()
  {
    if (this.LH == null) {
      dN();
    }
  }
  
  public final void dN()
  {
    removeAllViews();
    this.jQ = null;
    this.Lp = null;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.Lq != null)
    {
      this.Lq.hideOverflowMenu();
      this.Lq.dY();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.tX);
      }
    }
    else {
      return;
    }
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = at.bw(this);
    int i;
    int j;
    int k;
    Object localObject;
    if (paramBoolean)
    {
      i = paramInt3 - paramInt1 - getPaddingRight();
      j = getPaddingTop();
      k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = i;
      if (this.LH != null)
      {
        paramInt2 = i;
        if (this.LH.getVisibility() != 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.LH.getLayoutParams();
          if (!paramBoolean) {
            break label254;
          }
          paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
          label89:
          if (!paramBoolean) {
            break label263;
          }
          paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
          label100:
          paramInt2 = b(i, paramInt2, paramBoolean);
          paramInt2 = b(paramInt2 + a(this.LH, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
        }
      }
      paramInt4 = paramInt2;
      if (this.LI != null)
      {
        paramInt4 = paramInt2;
        if (this.jQ == null)
        {
          paramInt4 = paramInt2;
          if (this.LI.getVisibility() != 8) {
            paramInt4 = paramInt2 + a(this.LI, paramInt2, j, k, paramBoolean);
          }
        }
      }
      if (this.jQ != null) {
        a(this.jQ, paramInt4, j, k, paramBoolean);
      }
      if (!paramBoolean) {
        break label273;
      }
      paramInt1 = getPaddingLeft();
      label213:
      if (this.Lp != null)
      {
        localObject = this.Lp;
        if (paramBoolean) {
          break label286;
        }
      }
    }
    label254:
    label263:
    label273:
    label286:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a((View)localObject, paramInt1, j, k, paramBoolean);
      return;
      i = getPaddingLeft();
      break;
      paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      break label89;
      paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      break label100;
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
      break label213;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 1073741824;
    int m = 0;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    }
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i;
    int n;
    int j;
    if (this.Lr > 0)
    {
      i = this.Lr;
      int i2 = getPaddingTop() + getPaddingBottom();
      paramInt1 = i1 - getPaddingLeft() - getPaddingRight();
      n = i - i2;
      j = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
      paramInt2 = paramInt1;
      Object localObject;
      if (this.LH != null)
      {
        paramInt1 = g(this.LH, paramInt1, j);
        localObject = (ViewGroup.MarginLayoutParams)this.LH.getLayoutParams();
        paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        paramInt2 = paramInt1 - (((ViewGroup.MarginLayoutParams)localObject).rightMargin + paramInt2);
      }
      paramInt1 = paramInt2;
      if (this.Lp != null)
      {
        paramInt1 = paramInt2;
        if (this.Lp.getParent() == this) {
          paramInt1 = g(this.Lp, paramInt2, j);
        }
      }
      paramInt2 = paramInt1;
      if (this.LI != null)
      {
        paramInt2 = paramInt1;
        if (this.jQ == null)
        {
          if (!this.LM) {
            break label496;
          }
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.LI.measure(paramInt2, j);
          int i3 = this.LI.getMeasuredWidth();
          if (i3 > paramInt1) {
            break label484;
          }
          j = 1;
          label291:
          paramInt2 = paramInt1;
          if (j != 0) {
            paramInt2 = paramInt1 - i3;
          }
          localObject = this.LI;
          if (j == 0) {
            break label490;
          }
          paramInt1 = 0;
          label316:
          ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label322:
      if (this.jQ != null)
      {
        localObject = this.jQ.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject).width == -2) {
          break label510;
        }
        paramInt1 = 1073741824;
        label352:
        j = paramInt2;
        if (((ViewGroup.LayoutParams)localObject).width >= 0) {
          j = Math.min(((ViewGroup.LayoutParams)localObject).width, paramInt2);
        }
        if (((ViewGroup.LayoutParams)localObject).height == -2) {
          break label517;
        }
        paramInt2 = k;
        label387:
        if (((ViewGroup.LayoutParams)localObject).height < 0) {
          break label524;
        }
        k = Math.min(((ViewGroup.LayoutParams)localObject).height, n);
        label407:
        this.jQ.measure(View.MeasureSpec.makeMeasureSpec(j, paramInt1), View.MeasureSpec.makeMeasureSpec(k, paramInt2));
      }
      if (this.Lr > 0) {
        break label539;
      }
      j = getChildCount();
      paramInt1 = 0;
      paramInt2 = m;
      label444:
      if (paramInt2 >= j) {
        break label531;
      }
      i = getChildAt(paramInt2).getMeasuredHeight() + i2;
      if (i <= paramInt1) {
        break label547;
      }
      paramInt1 = i;
    }
    label484:
    label490:
    label496:
    label510:
    label517:
    label524:
    label531:
    label539:
    label547:
    for (;;)
    {
      paramInt2 += 1;
      break label444;
      i = View.MeasureSpec.getSize(paramInt2);
      break;
      j = 0;
      break label291;
      paramInt1 = 8;
      break label316;
      paramInt2 = g(this.LI, paramInt1, j);
      break label322;
      paramInt1 = Integer.MIN_VALUE;
      break label352;
      paramInt2 = Integer.MIN_VALUE;
      break label387;
      k = n;
      break label407;
      setMeasuredDimension(i1, paramInt1);
      return;
      setMeasuredDimension(i1, i);
      return;
    }
  }
  
  public final void setCustomView(View paramView)
  {
    if (this.jQ != null) {
      removeView(this.jQ);
    }
    this.jQ = paramView;
    if ((paramView != null) && (this.LI != null))
    {
      removeView(this.LI);
      this.LI = null;
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.tY = paramCharSequence;
    dL();
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    dL();
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final boolean showOverflowMenu()
  {
    if (this.Lq != null) {
      return this.Lq.showOverflowMenu();
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */