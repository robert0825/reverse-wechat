package com.samsung.android.sdk.look;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnHoverListener;

public class SlookPointerIcon
{
  private static final String TAG = "SlookPointerIcon";
  public Drawable mDrawable;
  private Slook mSlook = new Slook();
  
  private boolean isSupport(int paramInt)
  {
    return this.mSlook.isFeatureEnabled(4);
  }
  
  public void setHoverIcon(View paramView, Drawable paramDrawable)
  {
    if (!isSupport(1)) {
      return;
    }
    if (paramView == null) {
      throw new IllegalArgumentException("view is null.");
    }
    if (paramDrawable == null)
    {
      paramView.setOnHoverListener(null);
      try
      {
        PointerIcon.setHoveringSpenIcon(1, -1);
        return;
      }
      catch (RemoteException paramView)
      {
        return;
      }
    }
    this.mDrawable = paramDrawable;
    paramView.setOnHoverListener(new View.OnHoverListener()
    {
      public boolean onHover(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        switch (paramAnonymousMotionEvent.getAction())
        {
        default: 
          return false;
        case 9: 
          try
          {
            PointerIcon.setHoveringSpenIcon(0, SlookPointerIcon.this.mDrawable);
            return false;
          }
          catch (RemoteException paramAnonymousView)
          {
            return false;
          }
        }
        try
        {
          PointerIcon.setHoveringSpenIcon(1, -1);
          return false;
        }
        catch (RemoteException paramAnonymousView) {}
        return false;
      }
    });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\samsung\android\sdk\look\SlookPointerIcon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */