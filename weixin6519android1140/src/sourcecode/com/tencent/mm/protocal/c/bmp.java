package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmp
  extends com.tencent.mm.bm.a
{
  public String title;
  public LinkedList<bik> uWA;
  public LinkedList<np> uWB;
  public LinkedList<bik> uWz;
  
  public bmp()
  {
    GMTrace.i(3921036705792L, 29214);
    this.uWz = new LinkedList();
    this.uWA = new LinkedList();
    this.uWB = new LinkedList();
    GMTrace.o(3921036705792L, 29214);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3921170923520L, 29215);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      paramVarArgs.d(2, 8, this.uWz);
      paramVarArgs.d(3, 8, this.uWA);
      paramVarArgs.d(4, 8, this.uWB);
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.title != null) {
        paramInt = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      i = b.a.a.a.c(2, 8, this.uWz);
      int j = b.a.a.a.c(3, 8, this.uWA);
      int k = b.a.a.a.c(4, 8, this.uWB);
      GMTrace.o(3921170923520L, 29215);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uWz.clear();
      this.uWA.clear();
      this.uWB.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmp localbmp = (bmp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3921170923520L, 29215);
        return -1;
      case 1: 
        localbmp.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3921170923520L, 29215);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bik();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bik)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmp.uWz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3921170923520L, 29215);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bik();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bik)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmp.uWA.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3921170923520L, 29215);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new np();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbmp.uWB.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    GMTrace.o(3921170923520L, 29215);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */