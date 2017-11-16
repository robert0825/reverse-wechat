package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public final class AppBrandNearbyShowcaseView
  extends FrameLayout
{
  private int de;
  private int iJj;
  
  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10106326482944L, 75298);
    this.de = a.fromDPToPix(getContext(), 25);
    this.iJj = a.fromDPToPix(getContext(), 19);
    GMTrace.o(10106326482944L, 75298);
  }
  
  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(10106460700672L, 75299);
    this.de = a.fromDPToPix(getContext(), 25);
    this.iJj = a.fromDPToPix(getContext(), 19);
    GMTrace.o(10106460700672L, 75299);
  }
  
  private void abY()
  {
    GMTrace.i(14323044843520L, 106715);
    if (getChildCount() > 0)
    {
      int i = getChildCount() - 1;
      while (i >= 0)
      {
        View localView = getChildAt(i);
        Object localObject = localView.getLayoutParams();
        ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
        int j = this.de;
        localLayoutParams.height = j;
        ((ViewGroup.LayoutParams)localObject).width = j;
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).gravity |= 0x5;
        ((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin = (this.iJj * i);
        i -= 1;
      }
      requestLayout();
      invalidate();
    }
    GMTrace.o(14323044843520L, 106715);
  }
  
  public final void abZ()
  {
    GMTrace.i(20047162507264L, 149363);
    if (getChildCount() > 1)
    {
      int i = getChildCount() - 1;
      while (i >= 0)
      {
        View localView = getChildAt(i);
        localView.setTranslationX(((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin);
        i -= 1;
      }
    }
    GMTrace.o(20047162507264L, 149363);
  }
  
  public final void aca()
  {
    int i = 1;
    GMTrace.i(20047296724992L, 149364);
    if (getChildCount() > 1)
    {
      int j = 200;
      while (i < getChildCount())
      {
        getChildAt(i).animate().setDuration(j).translationX(0.0F).start();
        j += 50;
        i += 1;
      }
    }
    GMTrace.o(20047296724992L, 149364);
  }
  
  public final void jR(int paramInt)
  {
    GMTrace.i(20046759854080L, 149360);
    if ((paramInt > 0) && (paramInt != this.de))
    {
      this.de = paramInt;
      abY();
    }
    GMTrace.o(20046759854080L, 149360);
  }
  
  public final void jS(int paramInt)
  {
    GMTrace.i(20046894071808L, 149361);
    if ((paramInt >= 0) && (this.iJj != paramInt))
    {
      this.iJj = paramInt;
      abY();
    }
    GMTrace.o(20046894071808L, 149361);
  }
  
  public final void jT(int paramInt)
  {
    GMTrace.i(14323179061248L, 106716);
    if ((paramInt >= 0) && (paramInt != getChildCount()))
    {
      if (paramInt > getChildCount())
      {
        int j = getChildCount();
        int i = 0;
        while (i < paramInt - j)
        {
          ImageView localImageView = new ImageView(getContext());
          FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.de, this.de);
          localLayoutParams.gravity = 16;
          addViewInLayout(localImageView, 0, localLayoutParams, true);
          i += 1;
        }
      }
      if (paramInt < getChildCount()) {
        removeViewsInLayout(0, getChildCount() - paramInt);
      }
      abY();
    }
    GMTrace.o(14323179061248L, 106716);
  }
  
  public final ImageView jU(int paramInt)
  {
    GMTrace.i(20047028289536L, 149362);
    ImageView localImageView = (ImageView)getChildAt(getChildCount() - 1 - paramInt);
    GMTrace.o(20047028289536L, 149362);
    return localImageView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\AppBrandNearbyShowcaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */