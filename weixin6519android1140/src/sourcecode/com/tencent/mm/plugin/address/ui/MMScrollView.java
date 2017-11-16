package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;

public class MMScrollView
  extends ScrollView
  implements View.OnFocusChangeListener
{
  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12809068871680L, 95435);
    GMTrace.o(12809068871680L, 95435);
  }
  
  public MMScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12809203089408L, 95436);
    GMTrace.o(12809203089408L, 95436);
  }
  
  final void a(ViewGroup paramViewGroup, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(12809337307136L, 95437);
    int j = paramViewGroup.getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof AddrEditView)) {
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
    GMTrace.o(12809337307136L, 95437);
  }
  
  public void onFocusChange(final View paramView, boolean paramBoolean)
  {
    GMTrace.i(12809471524864L, 95438);
    w.d("MicroMsg.MMScrollView", "onFocusChange:" + paramBoolean);
    if (!paramBoolean)
    {
      GMTrace.o(12809471524864L, 95438);
      return;
    }
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12817658806272L, 95499);
        MMScrollView.this.scrollTo(0, paramView.getTop() - a.fromDPToPix(MMScrollView.this.getContext(), 10));
        GMTrace.o(12817658806272L, 95499);
      }
    }, 200L);
    GMTrace.o(12809471524864L, 95438);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12809605742592L, 95439);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(12809605742592L, 95439);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\MMScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */