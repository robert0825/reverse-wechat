package com.tencent.mm.vending.d;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class b<T>
{
  private volatile List<T> xxK;
  
  public b(List paramList)
  {
    GMTrace.i(276085866496L, 2057);
    this.xxK = paramList;
    GMTrace.o(276085866496L, 2057);
  }
  
  public final T get(int paramInt)
  {
    GMTrace.i(276354301952L, 2059);
    Object localObject = this.xxK.get(paramInt);
    GMTrace.o(276354301952L, 2059);
    return (T)localObject;
  }
  
  public final int size()
  {
    GMTrace.i(276220084224L, 2058);
    int i = this.xxK.size();
    GMTrace.o(276220084224L, 2058);
    return i;
  }
  
  public static final class a<T>
  {
    private ArrayList<T> xxL;
    
    public a()
    {
      GMTrace.i(275548995584L, 2053);
      this.xxL = new ArrayList();
      GMTrace.o(275548995584L, 2053);
    }
    
    private void bKp()
    {
      GMTrace.i(275683213312L, 2054);
      if (this.xxL == null) {
        throw new IllegalAccessError();
      }
      GMTrace.o(275683213312L, 2054);
    }
    
    public final b<T> ckf()
    {
      GMTrace.i(275951648768L, 2056);
      bKp();
      Object localObject = this.xxL;
      this.xxL = null;
      localObject = new b((List)localObject);
      GMTrace.o(275951648768L, 2056);
      return (b<T>)localObject;
    }
    
    public final a<T> s(T... paramVarArgs)
    {
      GMTrace.i(275817431040L, 2055);
      bKp();
      int i = 0;
      while (i <= 0)
      {
        T ? = paramVarArgs[0];
        this.xxL.add(?);
        i += 1;
      }
      GMTrace.o(275817431040L, 2055);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */