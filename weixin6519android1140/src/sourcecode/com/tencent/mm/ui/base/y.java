package com.tencent.mm.ui.base;

import android.os.Build.VERSION;
import android.support.v4.view.u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;

public abstract class y
  extends u
{
  private final x wig;
  
  public y()
  {
    this(new x());
    GMTrace.i(3279341748224L, 24433);
    GMTrace.o(3279341748224L, 24433);
  }
  
  private y(x paramx)
  {
    GMTrace.i(3279475965952L, 24434);
    this.wig = paramx;
    SparseArray[] arrayOfSparseArray = new SparseArray[1];
    int i = 0;
    while (i <= 0)
    {
      arrayOfSparseArray[0] = new SparseArray();
      i += 1;
    }
    paramx.wie = 1;
    paramx.wif = arrayOfSparseArray[0];
    paramx.wid = arrayOfSparseArray;
    GMTrace.o(3279475965952L, 24434);
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    GMTrace.i(3279878619136L, 24437);
    paramObject = (View)paramObject;
    paramViewGroup.removeView((View)paramObject);
    paramViewGroup = this.wig;
    if (paramViewGroup.wie == 1) {
      paramViewGroup.wif.put(paramInt, paramObject);
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 14) {
        ((View)paramObject).setAccessibilityDelegate(null);
      }
      GMTrace.o(3279878619136L, 24437);
      return;
      paramViewGroup.wid[0].put(paramInt, paramObject);
    }
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    GMTrace.i(3280012836864L, 24438);
    if (paramView == paramObject)
    {
      GMTrace.o(3280012836864L, 24438);
      return true;
    }
    GMTrace.o(3280012836864L, 24438);
    return false;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(3279744401408L, 24436);
    Object localObject = this.wig;
    if (((x)localObject).wie == 1) {
      localObject = x.a(((x)localObject).wif, paramInt);
    }
    for (;;)
    {
      localObject = c(paramInt, (View)localObject);
      paramViewGroup.addView((View)localObject);
      GMTrace.o(3279744401408L, 24436);
      return localObject;
      if (((x)localObject).wid.length > 0) {
        localObject = x.a(localObject.wid[0], paramInt);
      } else {
        localObject = null;
      }
    }
  }
  
  public abstract View c(int paramInt, View paramView);
  
  public void notifyDataSetChanged()
  {
    GMTrace.i(3279610183680L, 24435);
    x localx = this.wig;
    View[] arrayOfView = localx.wib;
    int[] arrayOfInt = localx.wic;
    int j;
    label53:
    View localView;
    Object localObject2;
    if (localx.wie > 1)
    {
      i = 1;
      localObject1 = localx.wif;
      j = arrayOfView.length - 1;
      if (j < 0) {
        break label168;
      }
      localView = arrayOfView[j];
      localObject2 = localObject1;
      if (localView != null)
      {
        m = arrayOfInt[j];
        arrayOfView[j] = null;
        arrayOfInt[j] = -1;
        if (m < 0) {
          break label163;
        }
      }
    }
    label163:
    for (int k = 1;; k = 0)
    {
      localObject2 = localObject1;
      if (k != 0)
      {
        if (i != 0) {
          localObject1 = localx.wid[m];
        }
        ((SparseArray)localObject1).put(j, localView);
        localObject2 = localObject1;
        if (Build.VERSION.SDK_INT >= 14)
        {
          localView.setAccessibilityDelegate(null);
          localObject2 = localObject1;
        }
      }
      j -= 1;
      localObject1 = localObject2;
      break label53;
      i = 0;
      break;
    }
    label168:
    int m = localx.wib.length;
    int n = localx.wie;
    Object localObject1 = localx.wid;
    int i = 0;
    while (i < n)
    {
      localObject2 = localObject1[i];
      int i1 = ((SparseArray)localObject2).size();
      j = i1 - 1;
      k = 0;
      while (k < i1 - m)
      {
        ((SparseArray)localObject2).remove(((SparseArray)localObject2).keyAt(j));
        k += 1;
        j -= 1;
      }
      i += 1;
    }
    super.notifyDataSetChanged();
    GMTrace.o(3279610183680L, 24435);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */