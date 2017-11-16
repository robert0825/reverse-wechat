package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.content.Context;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_payu.create.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.MMAutoHeightViewPager;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.ArrayList;

public class WalletPayUOpenIntroView
  extends LinearLayout
{
  ArrayList<View> Xo;
  Context mContext;
  MMAutoHeightViewPager rtN;
  MMPageControlView rtO;
  a rtP;
  d[] rtQ;
  
  public WalletPayUOpenIntroView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(7951863513088L, 59246);
    GMTrace.o(7951863513088L, 59246);
  }
  
  public WalletPayUOpenIntroView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7951729295360L, 59245);
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(a.g.sNP, this, true);
    this.rtN = ((MMAutoHeightViewPager)paramContext.findViewById(a.f.bSU));
    this.rtO = ((MMPageControlView)paramContext.findViewById(a.f.sus));
    this.rtO.setVisibility(0);
    this.rtN.yr = new ViewPager.e()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(7950521335808L, 59236);
        if (WalletPayUOpenIntroView.a(WalletPayUOpenIntroView.this).getParent() != null) {
          WalletPayUOpenIntroView.a(WalletPayUOpenIntroView.this).getParent().requestDisallowInterceptTouchEvent(true);
        }
        WalletPayUOpenIntroView.b(WalletPayUOpenIntroView.this).uN(paramAnonymousInt);
        GMTrace.o(7950521335808L, 59236);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(7950655553536L, 59237);
        GMTrace.o(7950655553536L, 59237);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(7950387118080L, 59235);
        GMTrace.o(7950387118080L, 59235);
      }
    };
    GMTrace.o(7951729295360L, 59245);
  }
  
  private final class a
    extends u
  {
    public a()
    {
      GMTrace.i(7952534601728L, 59251);
      GMTrace.o(7952534601728L, 59251);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(7953071472640L, 59255);
      paramViewGroup.removeView((View)WalletPayUOpenIntroView.d(WalletPayUOpenIntroView.this).get(paramInt));
      GMTrace.o(7953071472640L, 59255);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(7952937254912L, 59254);
      if (paramView == paramObject)
      {
        GMTrace.o(7952937254912L, 59254);
        return true;
      }
      GMTrace.o(7952937254912L, 59254);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(7952803037184L, 59253);
      View localView = (View)WalletPayUOpenIntroView.d(WalletPayUOpenIntroView.this).get(paramInt);
      paramViewGroup.addView(localView);
      paramViewGroup = WalletPayUOpenIntroView.c(WalletPayUOpenIntroView.this)[paramInt];
      ImageView localImageView = (ImageView)localView.findViewById(a.f.logo);
      TextView localTextView1 = (TextView)localView.findViewById(a.f.sHM);
      TextView localTextView2 = (TextView)localView.findViewById(a.f.hint);
      localImageView.setImageResource(paramViewGroup.rtL);
      localTextView1.setText(paramViewGroup.titleRes);
      localTextView2.setText(paramViewGroup.rtM);
      GMTrace.o(7952803037184L, 59253);
      return localView;
    }
    
    public final int getCount()
    {
      GMTrace.i(7952668819456L, 59252);
      if (WalletPayUOpenIntroView.c(WalletPayUOpenIntroView.this) == null)
      {
        GMTrace.o(7952668819456L, 59252);
        return 0;
      }
      int i = WalletPayUOpenIntroView.c(WalletPayUOpenIntroView.this).length;
      GMTrace.o(7952668819456L, 59252);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\ui\WalletPayUOpenIntroView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */