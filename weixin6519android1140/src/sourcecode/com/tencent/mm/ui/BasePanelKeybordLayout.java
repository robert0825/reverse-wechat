package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public abstract class BasePanelKeybordLayout
  extends KeyboardLinearLayout
{
  private int tAJ;
  private a vFK;
  
  public BasePanelKeybordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1881195675648L, 14016);
    this.vFK = null;
    this.tAJ = -1;
    GMTrace.o(1881195675648L, 14016);
  }
  
  public BasePanelKeybordLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1881329893376L, 14017);
    this.vFK = null;
    this.tAJ = -1;
    GMTrace.o(1881329893376L, 14017);
  }
  
  public abstract List<View> aMU();
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1881464111104L, 14018);
    int i = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    w.d("MicroMsg.BasePanelKeybordLayout", "onMeasure, width: %d, height: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(m) });
    if (m >= 0)
    {
      if (this.tAJ >= 0) {
        break label80;
      }
      this.tAJ = m;
    }
    label80:
    int n;
    label111:
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    do
    {
      do
      {
        super.onMeasure(paramInt1, paramInt2);
        GMTrace.o(1881464111104L, 14018);
        return;
        n = this.tAJ - m;
        this.tAJ = m;
      } while (n == 0);
      Iterator localIterator = aMU().iterator();
      if (!localIterator.hasNext()) {
        break;
      }
      localView = (View)localIterator.next();
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    } while (localLayoutParams == null);
    if (localLayoutParams.height < 0) {}
    for (i = 0;; i = localLayoutParams.height - n)
    {
      int j = i;
      if (i < 0) {
        j = 0;
      }
      int i1 = j.b(ab.getContext(), true);
      i = j.aL(getContext());
      int k = j;
      if (j.tG() > 0)
      {
        k = j;
        if (m >= j.tG()) {
          k = i;
        }
      }
      j = k;
      if (k > 0)
      {
        j = k;
        if (k < i1)
        {
          j = k;
          if (localView.getVisibility() != 0) {
            j = 0;
          }
        }
      }
      k = j;
      if (j > i) {
        k = i;
      }
      j = k;
      if (k > 0)
      {
        j = k;
        if (k < i) {
          j = i;
        }
      }
      w.d("MicroMsg.BasePanelKeybordLayout", "oldHeight: %d, offset: %d newHeight: %d, validPanelHeight: %d", new Object[] { Integer.valueOf(localLayoutParams.height), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i) });
      localLayoutParams.height = j;
      localView.setLayoutParams(localLayoutParams);
      break label111;
      break;
    }
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\BasePanelKeybordLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */