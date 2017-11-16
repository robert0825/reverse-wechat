package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class h<T>
  extends a<T>
{
  private boolean ajw = false;
  private ArrayList<Integer> ajx;
  
  public h(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private int ca(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.ajx.size())) {
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.ajx.get(paramInt)).intValue();
  }
  
  private void ko()
  {
    for (;;)
    {
      int i;
      String str2;
      try
      {
        if (this.ajw) {
          break label190;
        }
        int j = this.aiY.ajj;
        this.ajx = new ArrayList();
        if (j <= 0) {
          break label185;
        }
        this.ajx.add(Integer.valueOf(0));
        String str3 = kn();
        i = this.aiY.bY(0);
        String str1 = this.aiY.b(str3, 0, i);
        i = 1;
        if (i >= j) {
          break label185;
        }
        int k = this.aiY.bY(i);
        str2 = this.aiY.b(str3, i, k);
        if (str2 == null) {
          throw new NullPointerException("Missing value for markerColumn: " + str3 + ", at row: " + i + ", for window: " + k);
        }
      }
      finally {}
      if (!str2.equals(localObject1))
      {
        this.ajx.add(Integer.valueOf(i));
        Object localObject2 = str2;
        break label193;
        label185:
        this.ajw = true;
        label190:
        return;
      }
      label193:
      i += 1;
    }
  }
  
  public abstract T aj(int paramInt1, int paramInt2);
  
  public final T get(int paramInt)
  {
    ko();
    int k = ca(paramInt);
    int j;
    if ((paramInt < 0) || (paramInt == this.ajx.size()))
    {
      j = 0;
      return (T)aj(k, j);
    }
    if (paramInt == this.ajx.size() - 1) {}
    for (int i = this.aiY.ajj - ((Integer)this.ajx.get(paramInt)).intValue();; i = ((Integer)this.ajx.get(paramInt + 1)).intValue() - ((Integer)this.ajx.get(paramInt)).intValue())
    {
      j = i;
      if (i != 1) {
        break;
      }
      paramInt = ca(paramInt);
      this.aiY.bY(paramInt);
      j = i;
      break;
    }
  }
  
  public final int getCount()
  {
    ko();
    return this.ajx.size();
  }
  
  public abstract String kn();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */