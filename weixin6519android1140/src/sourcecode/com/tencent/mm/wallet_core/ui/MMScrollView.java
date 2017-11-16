package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class MMScrollView
  extends ScrollView
  implements View.OnFocusChangeListener
{
  public a xEF;
  
  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1504849166336L, 11212);
    GMTrace.o(1504849166336L, 11212);
  }
  
  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1504983384064L, 11213);
    GMTrace.o(1504983384064L, 11213);
  }
  
  public final void a(ViewGroup paramViewGroup, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1505117601792L, 11214);
    int j = paramViewGroup.getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = paramViewGroup.getChildAt(i);
      if (((localView instanceof WalletFormView)) || ((localView instanceof EditHintPasswdView))) {
        localView.setOnFocusChangeListener(paramOnFocusChangeListener);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((localView instanceof ViewGroup)) {
          a((ViewGroup)localView, paramOnFocusChangeListener);
        }
      }
    }
    GMTrace.o(1505117601792L, 11214);
  }
  
  public void onFocusChange(final View paramView, boolean paramBoolean)
  {
    GMTrace.i(1505251819520L, 11215);
    w.d("MicroMsg.MMScrollView", "onFocusChange:" + paramBoolean);
    if (!paramBoolean)
    {
      GMTrace.o(1505251819520L, 11215);
      return;
    }
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1507801956352L, 11234);
        MMScrollView.this.scrollTo(0, paramView.getTop() - a.fromDPToPix(MMScrollView.this.getContext(), 10));
        GMTrace.o(1507801956352L, 11234);
      }
    }, 200L);
    GMTrace.o(1505251819520L, 11215);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1505520254976L, 11217);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(1505520254976L, 11217);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1505386037248L, 11216);
    a locala;
    if ((this.xEF != null) && (paramInt2 != paramInt4))
    {
      locala = this.xEF;
      if (paramInt2 >= paramInt4) {
        break label65;
      }
    }
    label65:
    for (boolean bool = true;; bool = false)
    {
      locala.iV(bool);
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      GMTrace.o(1505386037248L, 11216);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void iV(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\MMScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */