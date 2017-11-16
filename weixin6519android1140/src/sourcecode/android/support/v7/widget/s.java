package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class s
{
  final b PC;
  final a PD;
  final List<View> PE;
  
  s(b paramb)
  {
    this.PC = paramb;
    this.PD = new a();
    this.PE = new ArrayList();
  }
  
  final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.PC.getChildCount();; paramInt = aM(paramInt))
    {
      this.PD.f(paramInt, paramBoolean);
      if (paramBoolean) {
        aN(paramView);
      }
      this.PC.attachViewToParent(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.PC.getChildCount();; paramInt = aM(paramInt))
    {
      this.PD.f(paramInt, paramBoolean);
      if (paramBoolean) {
        aN(paramView);
      }
      this.PC.addView(paramView, paramInt);
      return;
    }
  }
  
  final int aM(int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = -1;
      return paramInt;
    }
    int j = this.PC.getChildCount();
    int i = paramInt;
    for (;;)
    {
      if (i >= j) {
        break label72;
      }
      int k = paramInt - (i - this.PD.aP(i));
      if (k == 0) {
        for (;;)
        {
          paramInt = i;
          if (!this.PD.get(i)) {
            break;
          }
          i += 1;
        }
      }
      i += k;
    }
    label72:
    return -1;
  }
  
  final View aN(int paramInt)
  {
    return this.PC.getChildAt(paramInt);
  }
  
  final void aN(View paramView)
  {
    this.PE.add(paramView);
    this.PC.aR(paramView);
  }
  
  final boolean aO(View paramView)
  {
    if (this.PE.remove(paramView))
    {
      this.PC.aS(paramView);
      return true;
    }
    return false;
  }
  
  final boolean aP(View paramView)
  {
    return this.PE.contains(paramView);
  }
  
  final void detachViewFromParent(int paramInt)
  {
    paramInt = aM(paramInt);
    this.PD.aO(paramInt);
    this.PC.detachViewFromParent(paramInt);
  }
  
  final int eF()
  {
    return this.PC.getChildCount();
  }
  
  final View getChildAt(int paramInt)
  {
    paramInt = aM(paramInt);
    return this.PC.getChildAt(paramInt);
  }
  
  final int getChildCount()
  {
    return this.PC.getChildCount() - this.PE.size();
  }
  
  final int indexOfChild(View paramView)
  {
    int i = this.PC.indexOfChild(paramView);
    if (i == -1) {}
    while (this.PD.get(i)) {
      return -1;
    }
    return i - this.PD.aP(i);
  }
  
  public final String toString()
  {
    return this.PD.toString() + ", hidden list:" + this.PE.size();
  }
  
  static final class a
  {
    long PF = 0L;
    a PG;
    
    private void eG()
    {
      if (this.PG == null) {
        this.PG = new a();
      }
    }
    
    final boolean aO(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.eG();
        locala = locala.PG;
        paramInt -= 64;
      }
      long l1 = 1L << paramInt;
      if ((locala.PF & l1) != 0L) {}
      for (boolean bool = true;; bool = false)
      {
        locala.PF &= (l1 ^ 0xFFFFFFFFFFFFFFFF);
        l1 -= 1L;
        long l2 = locala.PF;
        locala.PF = (Long.rotateRight((l1 ^ 0xFFFFFFFFFFFFFFFF) & locala.PF, 1) | l2 & l1);
        if (locala.PG != null)
        {
          if (locala.PG.get(0)) {
            locala.set(63);
          }
          locala.PG.aO(0);
        }
        return bool;
      }
    }
    
    final int aP(int paramInt)
    {
      if (this.PG == null)
      {
        if (paramInt >= 64) {
          return Long.bitCount(this.PF);
        }
        return Long.bitCount(this.PF & (1L << paramInt) - 1L);
      }
      if (paramInt < 64) {
        return Long.bitCount(this.PF & (1L << paramInt) - 1L);
      }
      return this.PG.aP(paramInt - 64) + Long.bitCount(this.PF);
    }
    
    final void clear(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        if (locala.PG == null) {
          return;
        }
        locala = locala.PG;
        paramInt -= 64;
      }
      locala.PF &= (1L << paramInt ^ 0xFFFFFFFFFFFFFFFF);
    }
    
    final void f(int paramInt, boolean paramBoolean)
    {
      boolean bool = paramBoolean;
      a locala = this;
      while (paramInt >= 64)
      {
        locala.eG();
        locala = locala.PG;
        paramInt -= 64;
      }
      if ((locala.PF & 0x8000000000000000) != 0L)
      {
        paramBoolean = true;
        label47:
        long l1 = (1L << paramInt) - 1L;
        long l2 = locala.PF;
        locala.PF = (((l1 ^ 0xFFFFFFFFFFFFFFFF) & locala.PF) << 1 | l2 & l1);
        if (!bool) {
          break label132;
        }
        locala.set(paramInt);
      }
      for (;;)
      {
        if ((!paramBoolean) && (locala.PG == null)) {
          return;
        }
        locala.eG();
        locala = locala.PG;
        paramInt = 0;
        bool = paramBoolean;
        break;
        paramBoolean = false;
        break label47;
        label132:
        locala.clear(paramInt);
      }
    }
    
    final boolean get(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.eG();
        locala = locala.PG;
        paramInt -= 64;
      }
      return (locala.PF & 1L << paramInt) != 0L;
    }
    
    final void set(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.eG();
        locala = locala.PG;
        paramInt -= 64;
      }
      locala.PF |= 1L << paramInt;
    }
    
    public final String toString()
    {
      if (this.PG == null) {
        return Long.toBinaryString(this.PF);
      }
      return this.PG.toString() + "xx" + Long.toBinaryString(this.PF);
    }
  }
  
  static abstract interface b
  {
    public abstract RecyclerView.t aQ(View paramView);
    
    public abstract void aR(View paramView);
    
    public abstract void aS(View paramView);
    
    public abstract void addView(View paramView, int paramInt);
    
    public abstract void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);
    
    public abstract void detachViewFromParent(int paramInt);
    
    public abstract View getChildAt(int paramInt);
    
    public abstract int getChildCount();
    
    public abstract int indexOfChild(View paramView);
    
    public abstract void removeAllViews();
    
    public abstract void removeViewAt(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */