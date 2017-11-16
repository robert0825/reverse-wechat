package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.bm.a
{
  public int gRL;
  public int mIE;
  public long mIF;
  public int mIG;
  public long mIH;
  public int mIq;
  public LinkedList<h> mIz;
  
  public g()
  {
    GMTrace.i(9737898819584L, 72553);
    this.mIz = new LinkedList();
    GMTrace.o(9737898819584L, 72553);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9738033037312L, 72554);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.mIE);
      paramVarArgs.T(2, this.mIF);
      paramVarArgs.fk(3, this.mIG);
      paramVarArgs.T(4, this.mIH);
      paramVarArgs.fk(5, this.gRL);
      paramVarArgs.fk(6, this.mIq);
      paramVarArgs.d(7, 8, this.mIz);
      GMTrace.o(9738033037312L, 72554);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.mIE);
      i = b.a.a.a.S(2, this.mIF);
      int j = b.a.a.a.fh(3, this.mIG);
      int k = b.a.a.a.S(4, this.mIH);
      int m = b.a.a.a.fh(5, this.gRL);
      int n = b.a.a.a.fh(6, this.mIq);
      int i1 = b.a.a.a.c(7, 8, this.mIz);
      GMTrace.o(9738033037312L, 72554);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mIz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(9738033037312L, 72554);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(9738033037312L, 72554);
        return -1;
      case 1: 
        localg.mIE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      case 2: 
        localg.mIF = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      case 3: 
        localg.mIG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      case 4: 
        localg.mIH = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      case 5: 
        localg.gRL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      case 6: 
        localg.mIq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9738033037312L, 72554);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new h();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localg.mIz.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(9738033037312L, 72554);
      return 0;
    }
    GMTrace.o(9738033037312L, 72554);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */