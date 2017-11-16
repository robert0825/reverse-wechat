package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.r.b;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.widget.b.a;
import com.tencent.mm.plugin.appbrand.widget.b.f;
import com.tencent.mm.plugin.appbrand.widget.b.f.a;
import com.tencent.xweb.WebView;

@SuppressLint({"ViewConstructor"})
public final class e
  extends FrameLayout
  implements r.b, com.tencent.mm.plugin.appbrand.page.w
{
  public final f iLk;
  private final AbsoluteLayout iLl;
  private final float iLm;
  private final AppBrandPageView ibO;
  
  public e(Context paramContext, AppBrandPageView paramAppBrandPageView)
  {
    super(paramContext);
    GMTrace.i(18286360133632L, 136244);
    super.setId(o.f.hBf);
    this.ibO = paramAppBrandPageView;
    this.iLm = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    paramAppBrandPageView.ivj.iwd = this;
    this.iLl = new a(paramContext);
    this.iLk = new f(this.iLl);
    addView(this.iLl);
    GMTrace.o(18286360133632L, 136244);
  }
  
  private <Input extends View,  extends y> boolean a(t paramt, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(18286494351360L, 136245);
    if ((paramt == null) || (paramt.getView() == null) || (paramInput == null))
    {
      GMTrace.o(18286494351360L, 136245);
      return false;
    }
    m(paramt);
    if (((y)paramInput).adi())
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt1, paramInt2);
      localLayoutParams.leftMargin = (paramInt3 - paramt.getScrollX());
      localLayoutParams.topMargin = (paramInt4 - paramt.getScrollY());
      localLayoutParams.bottomMargin = 0;
      localLayoutParams.rightMargin = 0;
      addView(paramInput, localLayoutParams);
      if (paramBoolean) {
        ((y)paramInput).n(this.ibO);
      }
      GMTrace.o(18286494351360L, 136245);
      return true;
    }
    paramt = new AbsoluteLayout.LayoutParams(paramInt1, paramInt2, paramInt3, paramInt4);
    this.iLl.addView(paramInput, paramt);
    if (paramBoolean) {
      ((y)paramInput).n(this.ibO);
    }
    GMTrace.o(18286494351360L, 136245);
    return true;
  }
  
  private <Input extends View,  extends y> boolean bO(Input paramInput)
  {
    GMTrace.i(10066866470912L, 75004);
    int i = 1;
    while (i < getChildCount())
    {
      if (paramInput == getChildAt(i))
      {
        GMTrace.o(10066866470912L, 75004);
        return true;
      }
      i += 1;
    }
    GMTrace.o(10066866470912L, 75004);
    return false;
  }
  
  private void m(t paramt)
  {
    GMTrace.i(10066598035456L, 75002);
    if ((this.iLl.getWidth() != paramt.getWidth()) || (this.iLl.getHeight() != paramt.getHeight()))
    {
      ViewGroup.LayoutParams localLayoutParams = this.iLl.getLayoutParams();
      localLayoutParams.width = paramt.getWidth();
      localLayoutParams.height = paramt.getHeight();
      this.iLl.setLayoutParams(localLayoutParams);
    }
    if ((this.iLl.getScrollX() != paramt.getWebScrollX()) || (this.iLl.getScrollY() != paramt.getWebScrollY())) {
      this.iLl.scrollTo(paramt.getWebScrollX(), paramt.getWebScrollY());
    }
    GMTrace.o(10066598035456L, 75002);
  }
  
  public final <Input extends View,  extends y> boolean a(t paramt, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10066463817728L, 75001);
    boolean bool = a(paramt, paramInput, paramInt1, paramInt2, paramInt3, paramInt4, true);
    GMTrace.o(10066463817728L, 75001);
    return bool;
  }
  
  public final <Input extends View,  extends y> boolean b(t paramt, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10066732253184L, 75003);
    if ((paramt == null) || (paramt.getView() == null) || (paramInput == null))
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
    }
    int i;
    if (paramInput != null) {
      if (bO(paramInput)) {
        i = 1;
      }
    }
    while (i == 0)
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
      if (this.iLl != null)
      {
        i = 0;
        for (;;)
        {
          if (i >= this.iLl.getChildCount()) {
            break label113;
          }
          if (paramInput == this.iLl.getChildAt(i))
          {
            i = 1;
            break;
          }
          i += 1;
        }
      }
      label113:
      i = 0;
    }
    m(paramt);
    if (bO(paramInput))
    {
      if (((y)paramInput).adi()) {
        if (paramInput.getLayoutParams() != null)
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramInput.getLayoutParams();
          localLayoutParams.leftMargin = (paramInt3 - paramt.getScrollX());
          localLayoutParams.topMargin = (paramInt4 - paramt.getScrollY());
          localLayoutParams.width = paramInt1;
          localLayoutParams.height = paramInt2;
          paramInput.setLayoutParams(localLayoutParams);
        }
      }
      for (;;)
      {
        GMTrace.o(10066732253184L, 75003);
        return true;
        removeView(paramInput);
        a(paramt, paramInput, paramInt1, paramInt2, paramInt3, paramInt4, false);
      }
    }
    if ((paramInput.getLayoutParams() == null) || (!(paramInput.getLayoutParams() instanceof AbsoluteLayout.LayoutParams)))
    {
      GMTrace.o(10066732253184L, 75003);
      return false;
    }
    if ((paramInput.getWidth() != paramInt1) || (paramInput.getHeight() != paramInt2) || (paramInput.getLeft() != paramInt3) || (paramInput.getTop() != paramInt4))
    {
      paramt = (AbsoluteLayout.LayoutParams)paramInput.getLayoutParams();
      paramt.x = paramInt3;
      paramt.y = paramInt4;
      paramt.width = paramInt1;
      paramt.height = paramInt2;
      paramInput.setLayoutParams(paramt);
    }
    GMTrace.o(10066732253184L, 75003);
    return true;
  }
  
  public final <Input extends View,  extends y> void bP(Input paramInput)
  {
    GMTrace.i(10067000688640L, 75005);
    if (paramInput == null)
    {
      GMTrace.o(10067000688640L, 75005);
      return;
    }
    paramInput.setVisibility(8);
    this.iLl.removeView(paramInput);
    removeView(paramInput);
    ((y)paramInput).o(this.ibO);
    GMTrace.o(10067000688640L, 75005);
  }
  
  public final void ji(int paramInt)
  {
    GMTrace.i(10067269124096L, 75007);
    setTranslationY(paramInt);
    GMTrace.o(10067269124096L, 75007);
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    GMTrace.i(10067134906368L, 75006);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputContainer", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.iLl != null)
    {
      ViewGroup.LayoutParams localLayoutParams2 = this.iLl.getLayoutParams();
      ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
      if (localLayoutParams2 == null)
      {
        localLayoutParams1 = new ViewGroup.LayoutParams(paramView.getWidth(), paramView.getHeight());
        this.iLl.setLayoutParams(localLayoutParams1);
      }
      if ((paramView.getWidth() != localLayoutParams1.width) || (paramView.getHeight() != localLayoutParams1.height))
      {
        localLayoutParams1.width = paramView.getWidth();
        localLayoutParams1.height = paramView.getHeight();
        this.iLl.setLayoutParams(localLayoutParams1);
      }
      this.iLl.scrollTo(paramInt1, paramInt2);
    }
    GMTrace.o(10067134906368L, 75006);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(18846719148032L, 140419);
    GMTrace.o(18846719148032L, 140419);
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    GMTrace.i(18846853365760L, 140420);
    GMTrace.o(18846853365760L, 140420);
    return false;
  }
  
  private final class a
    extends AbsoluteLayout
    implements com.tencent.mm.plugin.appbrand.widget.b.e
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(19864626397184L, 148003);
      GMTrace.o(19864626397184L, 148003);
    }
    
    public final boolean C(MotionEvent paramMotionEvent)
    {
      GMTrace.i(19864894832640L, 148005);
      if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0))
      {
        GMTrace.o(19864894832640L, 148005);
        return false;
      }
      f localf = e.this.iLk;
      if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0) || (localf.iKz == null))
      {
        GMTrace.o(19864894832640L, 148005);
        return false;
      }
      if ((paramMotionEvent.getDownTime() == localf.iKz.iKA) && (paramMotionEvent.getEventTime() == localf.iKz.iKB))
      {
        GMTrace.o(19864894832640L, 148005);
        return true;
      }
      GMTrace.o(19864894832640L, 148005);
      return false;
    }
    
    public final boolean acc()
    {
      GMTrace.i(19864760614912L, 148004);
      if (getChildCount() <= 0)
      {
        GMTrace.o(19864760614912L, 148004);
        return false;
      }
      int i = 0;
      while (i <= getChildCount())
      {
        if (a.bM(getChildAt(i)))
        {
          GMTrace.o(19864760614912L, 148004);
          return true;
        }
        i += 1;
      }
      GMTrace.o(19864760614912L, 148004);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */