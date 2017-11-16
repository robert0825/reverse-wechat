package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jl
  extends com.tencent.mm.bm.a
{
  public String name;
  public String tMl;
  public LinkedList<oh> tYV;
  public int tYW;
  public String tYX;
  
  public jl()
  {
    GMTrace.i(3809367556096L, 28382);
    this.tYV = new LinkedList();
    GMTrace.o(3809367556096L, 28382);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3809501773824L, 28383);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.tYV);
      if (this.tMl != null) {
        paramVarArgs.e(2, this.tMl);
      }
      paramVarArgs.fk(3, this.tYW);
      if (this.tYX != null) {
        paramVarArgs.e(4, this.tYX);
      }
      if (this.name != null) {
        paramVarArgs.e(5, this.name);
      }
      GMTrace.o(3809501773824L, 28383);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.tYV) + 0;
      paramInt = i;
      if (this.tMl != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tMl);
      }
      i = paramInt + b.a.a.a.fh(3, this.tYW);
      paramInt = i;
      if (this.tYX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tYX);
      }
      i = paramInt;
      if (this.name != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.name);
      }
      GMTrace.o(3809501773824L, 28383);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3809501773824L, 28383);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jl localjl = (jl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3809501773824L, 28383);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((oh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjl.tYV.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3809501773824L, 28383);
        return 0;
      case 2: 
        localjl.tMl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3809501773824L, 28383);
        return 0;
      case 3: 
        localjl.tYW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3809501773824L, 28383);
        return 0;
      case 4: 
        localjl.tYX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3809501773824L, 28383);
        return 0;
      }
      localjl.name = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3809501773824L, 28383);
      return 0;
    }
    GMTrace.o(3809501773824L, 28383);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */