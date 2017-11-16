package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout.d;
import android.support.v7.app.i;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.bx.a.f;
import com.tencent.mm.bx.a.i;
import com.tencent.mm.ui.af;

public final class a
  extends i
{
  private Context mContext;
  
  public a(Context paramContext)
  {
    this(paramContext, (byte)0);
    GMTrace.i(21009637834752L, 156534);
    GMTrace.o(21009637834752L, 156534);
  }
  
  private a(Context paramContext, byte paramByte)
  {
    super(paramContext, a.i.xvz);
    GMTrace.i(21009772052480L, 156535);
    this.mContext = paramContext;
    cY();
    GMTrace.o(21009772052480L, 156535);
  }
  
  private boolean aOU()
  {
    GMTrace.i(21010443141120L, 156540);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(21010443141120L, 156540);
      return true;
    }
    GMTrace.o(21010443141120L, 156540);
    return false;
  }
  
  private View b(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    int i = 0;
    GMTrace.i(21010308923392L, 156539);
    Object localObject1 = getWindow();
    Object localObject2;
    label77:
    ViewGroup localViewGroup;
    View localView;
    if (aOU())
    {
      ((Window)localObject1).setGravity(5);
      ((Window)localObject1).setWindowAnimations(a.i.emc);
      ((Window)localObject1).getDecorView().setPadding(0, 0, 0, 0);
      localObject2 = ((Window)localObject1).getAttributes();
      if (!aOU()) {
        break label318;
      }
      ((WindowManager.LayoutParams)localObject2).width = -2;
      ((WindowManager.LayoutParams)localObject2).height = -1;
      ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
      localViewGroup = (ViewGroup)LayoutInflater.from(this.mContext).inflate(a.f.xvp, null);
      localView = localViewGroup.findViewById(a.e.ax);
      localObject1 = paramView;
      if (paramInt != 0)
      {
        localObject1 = paramView;
        if (paramView == null) {
          localObject1 = getLayoutInflater().inflate(paramInt, localViewGroup, false);
        }
      }
      if (!aOU()) {
        break label358;
      }
      localObject2 = (FrameLayout)localViewGroup.findViewById(a.e.bMW);
      paramView = (View)localObject2;
      if (localObject2 != null)
      {
        paramView = (CoordinatorLayout.d)((FrameLayout)localObject2).getLayoutParams();
        if (!af.fe(this.mContext)) {
          break label426;
        }
        if (!af.fe(this.mContext)) {
          break label334;
        }
        paramInt = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
        if (paramInt <= 0) {
          break label334;
        }
        paramInt = Resources.getSystem().getDimensionPixelSize(paramInt);
      }
    }
    for (;;)
    {
      label222:
      if (getRotation() == 1)
      {
        paramView.setMargins(0, 0, paramInt, 0);
        label238:
        ((FrameLayout)localObject2).setLayoutParams(paramView);
        paramView = (View)localObject2;
        label247:
        paramView.setVisibility(0);
        if (paramLayoutParams != null) {
          break label373;
        }
        paramView.addView((View)localObject1);
        label262:
        if (Build.VERSION.SDK_INT >= 11) {
          break label383;
        }
        paramInt = 1;
      }
      for (;;)
      {
        if (paramInt != 0) {
          localView.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(21009503617024L, 156533);
              if (a.this.isShowing()) {
                a.this.cancel();
              }
              GMTrace.o(21009503617024L, 156533);
            }
          });
        }
        GMTrace.o(21010308923392L, 156539);
        return localViewGroup;
        ((Window)localObject1).setGravity(80);
        ((Window)localObject1).setWindowAnimations(a.i.elS);
        break;
        label318:
        ((WindowManager.LayoutParams)localObject2).width = -1;
        ((WindowManager.LayoutParams)localObject2).height = -2;
        break label77;
        label334:
        paramInt = 0;
        break label222;
        if (getRotation() != 3) {
          break label238;
        }
        paramView.setMargins(paramInt, 0, 0, 0);
        break label238;
        label358:
        paramView = (FrameLayout)localViewGroup.findViewById(a.e.bMV);
        break label247;
        label373:
        paramView.addView((View)localObject1, paramLayoutParams);
        break label262;
        label383:
        paramView = new TypedValue();
        paramInt = i;
        if (getContext().getTheme().resolveAttribute(16843611, paramView, true))
        {
          paramInt = i;
          if (paramView.data != 0) {
            paramInt = 1;
          }
        }
      }
      label426:
      paramInt = 0;
    }
  }
  
  @SuppressLint({"WrongConstant"})
  private int getRotation()
  {
    GMTrace.i(21068425199616L, 156972);
    int i = getWindow().getWindowManager().getDefaultDisplay().getRotation();
    GMTrace.o(21068425199616L, 156972);
    return i;
  }
  
  public final void setContentView(int paramInt)
  {
    GMTrace.i(21010174705664L, 156538);
    super.setContentView(b(paramInt, null, null));
    GMTrace.o(21010174705664L, 156538);
  }
  
  public final void setContentView(View paramView)
  {
    GMTrace.i(21009906270208L, 156536);
    super.setContentView(b(0, paramView, null));
    GMTrace.o(21009906270208L, 156536);
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(21010040487936L, 156537);
    super.setContentView(b(0, paramView, paramLayoutParams));
    GMTrace.o(21010040487936L, 156537);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */