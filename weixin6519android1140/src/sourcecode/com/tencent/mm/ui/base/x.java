package com.tencent.mm.ui.base;

import android.util.SparseArray;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class x
{
  View[] wib;
  int[] wic;
  SparseArray<View>[] wid;
  int wie;
  SparseArray<View> wif;
  
  public x()
  {
    GMTrace.i(3274375692288L, 24396);
    this.wib = new View[0];
    this.wic = new int[0];
    GMTrace.o(3274375692288L, 24396);
  }
  
  static View a(SparseArray<View> paramSparseArray, int paramInt)
  {
    GMTrace.i(3274509910016L, 24397);
    int j = paramSparseArray.size();
    if (j > 0)
    {
      int i = 0;
      while (i < j)
      {
        int k = paramSparseArray.keyAt(i);
        localView = (View)paramSparseArray.get(k);
        if (k == paramInt)
        {
          paramSparseArray.remove(k);
          GMTrace.o(3274509910016L, 24397);
          return localView;
        }
        i += 1;
      }
      paramInt = j - 1;
      View localView = (View)paramSparseArray.valueAt(paramInt);
      paramSparseArray.remove(paramSparseArray.keyAt(paramInt));
      GMTrace.o(3274509910016L, 24397);
      return localView;
    }
    GMTrace.o(3274509910016L, 24397);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */