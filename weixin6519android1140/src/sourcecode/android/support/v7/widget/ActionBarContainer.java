package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer
  extends FrameLayout
{
  Drawable JU;
  View LA;
  private View LB;
  private View LC;
  Drawable LD;
  Drawable LE;
  boolean LF;
  boolean LG;
  private boolean Lz;
  private int mHeight;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new c(this);
      setBackgroundDrawable((Drawable)localObject);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActionBar);
      this.JU = paramContext.getDrawable(a.k.ActionBar_background);
      this.LD = paramContext.getDrawable(a.k.ActionBar_backgroundStacked);
      this.mHeight = paramContext.getDimensionPixelSize(a.k.ActionBar_height, -1);
      if (getId() == a.f.split_action_bar)
      {
        this.LF = true;
        this.LE = paramContext.getDrawable(a.k.ActionBar_backgroundSplit);
      }
      paramContext.recycle();
      if (!this.LF) {
        break label143;
      }
      if (this.LE != null) {
        break label138;
      }
      bool = true;
    }
    for (;;)
    {
      setWillNotDraw(bool);
      return;
      localObject = new b(this);
      break;
      label138:
      bool = false;
      continue;
      label143:
      if ((this.JU == null) && (this.LD == null)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private static boolean aL(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }
  
  private static int aM(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }
  
  public final void J(boolean paramBoolean)
  {
    this.Lz = paramBoolean;
    if (paramBoolean) {}
    for (int i = 393216;; i = 262144)
    {
      setDescendantFocusability(i);
      return;
    }
  }
  
  public final void a(ai paramai)
  {
    if (this.LA != null) {
      removeView(this.LA);
    }
    this.LA = paramai;
    if (paramai != null)
    {
      addView(paramai);
      ViewGroup.LayoutParams localLayoutParams = paramai.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramai.VD = false;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.JU != null) && (this.JU.isStateful())) {
      this.JU.setState(getDrawableState());
    }
    if ((this.LD != null) && (this.LD.isStateful())) {
      this.LD.setState(getDrawableState());
    }
    if ((this.LE != null) && (this.LE.isStateful())) {
      this.LE.setState(getDrawableState());
    }
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.JU != null) {
        this.JU.jumpToCurrentState();
      }
      if (this.LD != null) {
        this.LD.jumpToCurrentState();
      }
      if (this.LE != null) {
        this.LE.jumpToCurrentState();
      }
    }
  }
  
  public final void l(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.JU != null)
    {
      this.JU.setCallback(null);
      unscheduleDrawable(this.JU);
    }
    this.JU = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.LB != null) {
        this.JU.setBounds(this.LB.getLeft(), this.LB.getTop(), this.LB.getRight(), this.LB.getBottom());
      }
    }
    if (this.LF) {
      if (this.LE != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.JU != null) || (this.LD != null)) {
        bool = false;
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.LB = findViewById(a.f.action_bar);
    this.LC = findViewById(a.f.action_context_bar);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.Lz) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.LA;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramBoolean = true;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        paramInt2 = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, paramInt2 - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, paramInt2 - localLayoutParams.bottomMargin);
      }
      if (!this.LF) {
        break label143;
      }
      if (this.LE == null) {
        break label323;
      }
      this.LE.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 = i;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        invalidate();
      }
      return;
      paramBoolean = false;
      break;
      label143:
      if (this.JU != null) {
        if (this.LB.getVisibility() == 0) {
          this.JU.setBounds(this.LB.getLeft(), this.LB.getTop(), this.LB.getRight(), this.LB.getBottom());
        }
      }
      label195:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        this.LG = paramBoolean;
        if ((paramBoolean) && (this.LD != null))
        {
          this.LD.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          paramInt1 = i;
          break;
          if ((this.LC != null) && (this.LC.getVisibility() == 0))
          {
            this.JU.setBounds(this.LC.getLeft(), this.LC.getTop(), this.LC.getRight(), this.LC.getBottom());
            break label195;
          }
          this.JU.setBounds(0, 0, 0, 0);
          break label195;
        }
        break;
      }
      label323:
      paramInt1 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.LB == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        i = paramInt2;
        if (this.mHeight >= 0) {
          i = View.MeasureSpec.makeMeasureSpec(Math.min(this.mHeight, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, i);
    if (this.LB == null) {}
    do
    {
      return;
      paramInt2 = View.MeasureSpec.getMode(i);
    } while ((this.LA == null) || (this.LA.getVisibility() == 8) || (paramInt2 == 1073741824));
    if (!aL(this.LB))
    {
      paramInt1 = aM(this.LB);
      if (paramInt2 != Integer.MIN_VALUE) {
        break label168;
      }
    }
    label168:
    for (paramInt2 = View.MeasureSpec.getSize(i);; paramInt2 = Integer.MAX_VALUE)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + aM(this.LA), paramInt2));
      return;
      if (!aL(this.LC))
      {
        paramInt1 = aM(this.LC);
        break;
      }
      paramInt1 = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.JU != null) {
        this.JU.setVisible(bool, false);
      }
      if (this.LD != null) {
        this.LD.setVisible(bool, false);
      }
      if (this.LE != null) {
        this.LE.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.JU) && (!this.LF)) || ((paramDrawable == this.LD) && (this.LG)) || ((paramDrawable == this.LE) && (this.LF)) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */