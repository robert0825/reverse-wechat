package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public class q
  extends PopupWindow
{
  private Context mContext;
  private View.OnTouchListener wdG;
  
  public q(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3320143937536L, 24737);
    this.mContext = null;
    this.mContext = paramContext;
    super.setBackgroundDrawable(null);
    GMTrace.o(3320143937536L, 24737);
  }
  
  public q(View paramView)
  {
    super(paramView);
    GMTrace.i(3320278155264L, 24738);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    GMTrace.o(3320278155264L, 24738);
  }
  
  public q(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, paramInt1, paramInt2);
    GMTrace.i(3320412372992L, 24739);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    GMTrace.o(3320412372992L, 24739);
  }
  
  public q(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramView, paramInt1, paramInt2, paramBoolean);
    GMTrace.i(3320546590720L, 24740);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    GMTrace.o(3320546590720L, 24740);
  }
  
  public void dismiss()
  {
    GMTrace.i(3320680808448L, 24741);
    try
    {
      super.dismiss();
      GMTrace.o(3320680808448L, 24741);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMPopupWindow", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(3320680808448L, 24741);
    }
  }
  
  public Drawable getBackground()
  {
    GMTrace.i(3320815026176L, 24742);
    Object localObject = getContentView();
    if (localObject == null)
    {
      GMTrace.o(3320815026176L, 24742);
      return null;
    }
    if ((localObject instanceof a))
    {
      localObject = ((View)localObject).getBackground();
      GMTrace.o(3320815026176L, 24742);
      return (Drawable)localObject;
    }
    GMTrace.o(3320815026176L, 24742);
    return null;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    int i = -2;
    GMTrace.i(3321083461632L, 24744);
    Object localObject1 = getContentView();
    if (localObject1 == null)
    {
      if (paramDrawable == null)
      {
        GMTrace.o(3321083461632L, 24744);
        return;
      }
      if (this.mContext != null) {}
      for (localObject1 = this.mContext;; localObject1 = ab.getContext())
      {
        localObject1 = new a((Context)localObject1);
        ((a)localObject1).setBackgroundDrawable(paramDrawable);
        super.setContentView((View)localObject1);
        GMTrace.o(3321083461632L, 24744);
        return;
      }
    }
    Object localObject2 = ((View)localObject1).getContext();
    if ((localObject1 instanceof a))
    {
      ((View)localObject1).setBackgroundDrawable(paramDrawable);
      GMTrace.o(3321083461632L, 24744);
      return;
    }
    Object localObject3 = ((View)localObject1).getLayoutParams();
    if ((localObject3 != null) && (((ViewGroup.LayoutParams)localObject3).height == -2)) {}
    for (;;)
    {
      localObject2 = new a((Context)localObject2);
      localObject3 = new FrameLayout.LayoutParams(-1, i);
      ((a)localObject2).setBackgroundDrawable(paramDrawable);
      ((a)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
      super.setContentView((View)localObject2);
      GMTrace.o(3321083461632L, 24744);
      return;
      i = -1;
    }
  }
  
  public void setContentView(View paramView)
  {
    int i = -2;
    GMTrace.i(3320949243904L, 24743);
    Object localObject = getContentView();
    if (localObject == null) {
      super.setContentView(paramView);
    }
    while (!(localObject instanceof a))
    {
      super.setContentView(paramView);
      GMTrace.o(3320949243904L, 24743);
      return;
    }
    localObject = (a)localObject;
    ((a)localObject).removeAllViews();
    if (paramView == null)
    {
      super.setContentView((View)localObject);
      GMTrace.o(3320949243904L, 24743);
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height == -2)) {}
    for (;;)
    {
      ((a)localObject).addView(paramView, new FrameLayout.LayoutParams(-1, i));
      super.setContentView((View)localObject);
      GMTrace.o(3320949243904L, 24743);
      return;
      i = -1;
    }
  }
  
  public void setTouchInterceptor(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(3321217679360L, 24745);
    this.wdG = paramOnTouchListener;
    GMTrace.o(3321217679360L, 24745);
  }
  
  private final class a
    extends FrameLayout
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(3341081903104L, 24893);
      GMTrace.o(3341081903104L, 24893);
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      GMTrace.i(3341350338560L, 24895);
      if (paramKeyEvent.getKeyCode() == 4)
      {
        if (getKeyDispatcherState() == null)
        {
          bool = super.dispatchKeyEvent(paramKeyEvent);
          GMTrace.o(3341350338560L, 24895);
          return bool;
        }
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          GMTrace.o(3341350338560L, 24895);
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if ((localDispatcherState != null) && (localDispatcherState.isTracking(paramKeyEvent)) && (!paramKeyEvent.isCanceled()))
          {
            q.this.dismiss();
            GMTrace.o(3341350338560L, 24895);
            return true;
          }
        }
        bool = super.dispatchKeyEvent(paramKeyEvent);
        GMTrace.o(3341350338560L, 24895);
        return bool;
      }
      boolean bool = super.dispatchKeyEvent(paramKeyEvent);
      GMTrace.o(3341350338560L, 24895);
      return bool;
    }
    
    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3341484556288L, 24896);
      if ((q.a(q.this) != null) && (q.a(q.this).onTouch(this, paramMotionEvent)))
      {
        GMTrace.o(3341484556288L, 24896);
        return true;
      }
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(3341484556288L, 24896);
      return bool;
    }
    
    protected final int[] onCreateDrawableState(int paramInt)
    {
      GMTrace.i(3341216120832L, 24894);
      int[] arrayOfInt = super.onCreateDrawableState(paramInt);
      GMTrace.o(3341216120832L, 24894);
      return arrayOfInt;
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3341618774016L, 24897);
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((paramMotionEvent.getAction() == 0) && ((i < 0) || (i >= getWidth()) || (j < 0) || (j >= getHeight())))
      {
        q.this.dismiss();
        GMTrace.o(3341618774016L, 24897);
        return true;
      }
      if (paramMotionEvent.getAction() == 4)
      {
        q.this.dismiss();
        GMTrace.o(3341618774016L, 24897);
        return true;
      }
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3341618774016L, 24897);
      return bool;
    }
    
    public final void sendAccessibilityEvent(int paramInt)
    {
      GMTrace.i(3341752991744L, 24898);
      if (getChildCount() == 1) {
        getChildAt(0).sendAccessibilityEvent(paramInt);
      }
      for (;;)
      {
        super.sendAccessibilityEvent(paramInt);
        GMTrace.o(3341752991744L, 24898);
        return;
        super.sendAccessibilityEvent(paramInt);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */