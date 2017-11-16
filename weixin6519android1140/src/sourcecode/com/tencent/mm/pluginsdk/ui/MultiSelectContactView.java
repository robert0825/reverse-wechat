package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.plugin.selectcontact.a.a;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiSelectContactView
  extends LinearLayout
{
  private LayoutInflater lVD;
  private View pKI;
  private int padding;
  private HorizontalScrollView ttR;
  private LinearLayout ttS;
  private View ttT;
  public MMEditText ttU;
  private List<String> ttV;
  private Animation ttW;
  private int ttX;
  public a ttY;
  public b ttZ;
  public c tua;
  private List<View> tub;
  boolean tuc;
  
  public MultiSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1166754709504L, 8693);
    this.ttX = 0;
    this.padding = 0;
    this.tuc = false;
    this.padding = getResources().getDimensionPixelSize(a.c.aPv);
    this.lVD = LayoutInflater.from(paramContext);
    this.lVD.inflate(a.f.oFr, this, true);
    this.ttR = ((HorizontalScrollView)findViewById(a.e.oFl));
    this.ttU = ((MMEditText)findViewById(a.e.bPh));
    this.ttS = ((LinearLayout)findViewById(a.e.oFk));
    this.ttT = findViewById(a.e.oFm);
    this.ttV = new LinkedList();
    this.ttW = AnimationUtils.loadAnimation(paramContext, a.a.aLs);
    c.d(this.ttU).Ea(100).a(null);
    this.pKI = findViewById(a.e.bZf);
    this.ttU.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(1033476505600L, 7700);
        GMTrace.o(1033476505600L, 7700);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1033342287872L, 7699);
        GMTrace.o(1033342287872L, 7699);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1033208070144L, 7698);
        MultiSelectContactView.a(MultiSelectContactView.this);
        if (MultiSelectContactView.b(MultiSelectContactView.this) != null) {
          MultiSelectContactView.b(MultiSelectContactView.this).Bv(paramAnonymousCharSequence.toString());
        }
        GMTrace.o(1033208070144L, 7698);
      }
    });
    this.ttU.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(1033744941056L, 7702);
        if ((paramAnonymousInt == 67) && (paramAnonymousKeyEvent.getAction() == 0) && (MultiSelectContactView.c(MultiSelectContactView.this).getSelectionStart() == 0) && (MultiSelectContactView.c(MultiSelectContactView.this).getSelectionEnd() == 0)) {
          MultiSelectContactView.d(MultiSelectContactView.this);
        }
        GMTrace.o(1033744941056L, 7702);
        return false;
      }
    });
    this.tub = new ArrayList();
    this.ttU.clearFocus();
    this.ttU.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1164741443584L, 8678);
        if (paramAnonymousBoolean)
        {
          MultiSelectContactView.e(MultiSelectContactView.this).setBackgroundResource(a.d.aXs);
          MultiSelectContactView.e(MultiSelectContactView.this).setPadding(MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this));
        }
        for (;;)
        {
          if (MultiSelectContactView.g(MultiSelectContactView.this) != null) {
            MultiSelectContactView.g(MultiSelectContactView.this).bKZ();
          }
          GMTrace.o(1164741443584L, 8678);
          return;
          MultiSelectContactView.e(MultiSelectContactView.this).setBackgroundResource(a.d.aXt);
          MultiSelectContactView.e(MultiSelectContactView.this).setPadding(MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this), MultiSelectContactView.f(MultiSelectContactView.this));
        }
      }
    });
    setBackgroundColor(-201326593);
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1153332936704L, 8593);
        GMTrace.o(1153332936704L, 8593);
      }
    });
    GMTrace.o(1166754709504L, 8693);
  }
  
  private View Pa(String paramString)
  {
    GMTrace.i(1168231104512L, 8704);
    int j = this.ttS.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = this.ttS.getChildAt(i);
      if (paramString.equals(localView.getTag()))
      {
        GMTrace.o(1168231104512L, 8704);
        return localView;
      }
      i += 1;
    }
    GMTrace.o(1168231104512L, 8704);
    return null;
  }
  
  private void a(final View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1167560015872L, 8699);
    if ((paramBoolean1) && (this.ttY != null)) {
      this.ttY.nw(paramView.getTag().toString());
    }
    if (paramBoolean2)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.aLt);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(1038039908352L, 7734);
          paramView.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1202859278336L, 8962);
              MultiSelectContactView.h(MultiSelectContactView.this).removeView(MultiSelectContactView.6.this.yV);
              MultiSelectContactView.i(MultiSelectContactView.this);
              MultiSelectContactView.a(MultiSelectContactView.this, MultiSelectContactView.h(MultiSelectContactView.this).getChildCount());
              GMTrace.o(1202859278336L, 8962);
            }
          });
          GMTrace.o(1038039908352L, 7734);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(1037905690624L, 7733);
          GMTrace.o(1037905690624L, 7733);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(1037771472896L, 7732);
          GMTrace.o(1037771472896L, 7732);
        }
      });
      paramView.startAnimation(localAnimation);
      GMTrace.o(1167560015872L, 8699);
      return;
    }
    this.ttS.removeView(paramView);
    bKY();
    zb(this.ttS.getChildCount());
    GMTrace.o(1167560015872L, 8699);
  }
  
  private void bKW()
  {
    GMTrace.i(1167291580416L, 8697);
    if (this.ttS.getChildCount() == 0)
    {
      GMTrace.o(1167291580416L, 8697);
      return;
    }
    if (this.tuc)
    {
      View localView = this.ttS.getChildAt(this.ttS.getChildCount() - 1);
      this.tuc = false;
      localView.findViewById(a.e.mask).setVisibility(8);
    }
    GMTrace.o(1167291580416L, 8697);
  }
  
  private void bKX()
  {
    GMTrace.i(1167694233600L, 8700);
    this.ttS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1034013376512L, 7704);
        MultiSelectContactView.j(MultiSelectContactView.this).scrollTo(MultiSelectContactView.h(MultiSelectContactView.this).getMeasuredWidth(), 0);
        GMTrace.o(1034013376512L, 7704);
      }
    });
    GMTrace.o(1167694233600L, 8700);
  }
  
  private void bKY()
  {
    GMTrace.i(1167962669056L, 8702);
    if (this.ttS.getChildCount() == 0)
    {
      this.ttT.setVisibility(0);
      GMTrace.o(1167962669056L, 8702);
      return;
    }
    this.ttT.setVisibility(8);
    GMTrace.o(1167962669056L, 8702);
  }
  
  private void zb(int paramInt)
  {
    GMTrace.i(1167828451328L, 8701);
    if (this.ttX <= 0)
    {
      this.ttX += getResources().getDimensionPixelSize(a.c.aQr);
      i = BackwardSupportUtil.b.a(getContext(), 40.0F);
      int j = (int)this.ttU.getPaint().measureText(getContext().getString(a.h.cUr));
      int k = this.ttX;
      this.ttX = (Math.max(i, j) + k);
    }
    if (this.ttX <= 0)
    {
      GMTrace.o(1167828451328L, 8701);
      return;
    }
    int i = this.pKI.getWidth();
    paramInt *= (getResources().getDimensionPixelSize(a.c.aPG) + getResources().getDimensionPixelSize(a.c.aPv));
    w.v("MicroMsg.MultiSeclectContactView", "parentWidth:%d, avatarWidth:%d, minInputAreaWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(this.ttX) });
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.ttR.getLayoutParams();
    if (i - paramInt > this.ttX)
    {
      localLayoutParams.width = -2;
      GMTrace.o(1167828451328L, 8701);
      return;
    }
    localLayoutParams.width = (i - this.ttX);
    GMTrace.o(1167828451328L, 8701);
  }
  
  public final void OY(String paramString)
  {
    GMTrace.i(1167023144960L, 8695);
    if (bg.nm(paramString))
    {
      GMTrace.o(1167023144960L, 8695);
      return;
    }
    if (this.ttV.contains(paramString))
    {
      w.i("MicroMsg.MultiSeclectContactView", "fixed user cant change");
      GMTrace.o(1167023144960L, 8695);
      return;
    }
    bKW();
    View localView = Pa(paramString);
    if (localView != null)
    {
      a(localView, false, false);
      GMTrace.o(1167023144960L, 8695);
      return;
    }
    aQ(paramString, true);
    GMTrace.o(1167023144960L, 8695);
  }
  
  public final void OZ(String paramString)
  {
    GMTrace.i(1167157362688L, 8696);
    paramString = Pa(paramString);
    if (paramString != null)
    {
      a(paramString, false, false);
      GMTrace.o(1167157362688L, 8696);
      return;
    }
    GMTrace.o(1167157362688L, 8696);
  }
  
  public final void aQ(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1167425798144L, 8698);
    zb(this.ttS.getChildCount() + 1);
    View localView = this.lVD.inflate(a.f.oFs, null, true);
    ImageView localImageView = (ImageView)localView.findViewById(a.e.bfk);
    a.b.a(localImageView, paramString);
    localImageView.setContentDescription(((a)h.h(a.class)).fs(paramString));
    localView.setTag(paramString);
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1223528808448L, 9116);
        MultiSelectContactView.a(MultiSelectContactView.this, paramAnonymousView);
        GMTrace.o(1223528808448L, 9116);
      }
    });
    if (paramBoolean) {
      localView.startAnimation(this.ttW);
    }
    this.ttS.addView(localView);
    bKY();
    paramString = (LinearLayout.LayoutParams)localView.getLayoutParams();
    paramString.height = getResources().getDimensionPixelSize(a.c.aPG);
    paramString.width = getResources().getDimensionPixelSize(a.c.aPG);
    paramString.rightMargin = getResources().getDimensionPixelSize(a.c.aPv);
    localView.setLayoutParams(paramString);
    bKX();
    GMTrace.o(1167425798144L, 8698);
  }
  
  public final String bFU()
  {
    GMTrace.i(1168096886784L, 8703);
    String str = this.ttU.getText().toString();
    GMTrace.o(1168096886784L, 8703);
    return str;
  }
  
  public void clearFocus()
  {
    GMTrace.i(1166888927232L, 8694);
    this.ttU.clearFocus();
    bKW();
    GMTrace.o(1166888927232L, 8694);
  }
  
  public static abstract interface a
  {
    public abstract void nw(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void Bv(String paramString);
  }
  
  public static abstract interface c
  {
    public abstract void bKZ();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\MultiSelectContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */