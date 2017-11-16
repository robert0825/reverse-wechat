package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.v7.app.i;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;

public final class c
  extends i
{
  private BottomSheetBehavior.a eG;
  
  public c(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private c(Context paramContext, byte paramByte) {}
  
  private View a(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    CoordinatorLayout localCoordinatorLayout = (CoordinatorLayout)View.inflate(getContext(), a.f.az, null);
    View localView = paramView;
    if (paramInt != 0)
    {
      localView = paramView;
      if (paramView == null) {
        localView = getLayoutInflater().inflate(paramInt, localCoordinatorLayout, false);
      }
    }
    paramView = (FrameLayout)localCoordinatorLayout.findViewById(a.e.as);
    BottomSheetBehavior.i(paramView).ey = this.eG;
    if (paramLayoutParams == null)
    {
      paramView.addView(localView);
      if (Build.VERSION.SDK_INT >= 11) {
        break label122;
      }
      paramInt = 1;
    }
    for (;;)
    {
      if (paramInt != 0) {
        localCoordinatorLayout.findViewById(a.e.ax).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            if (c.this.isShowing()) {
              c.this.cancel();
            }
          }
        });
      }
      return localCoordinatorLayout;
      paramView.addView(localView, paramLayoutParams);
      break;
      label122:
      paramView = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16843611, paramView, true))
      {
        if (paramView.data != 0) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
      else {
        paramInt = 0;
      }
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setLayout(-1, -1);
  }
  
  public final void setContentView(int paramInt)
  {
    super.setContentView(a(paramInt, null, null));
  }
  
  public final void setContentView(View paramView)
  {
    super.setContentView(a(0, paramView, null));
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(a(0, paramView, paramLayoutParams));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */