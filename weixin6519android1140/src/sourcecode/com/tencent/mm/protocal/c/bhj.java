package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhj
  extends azh
{
  public int tPV;
  public long tQd;
  public int uTo;
  public LinkedList<le> uTp;
  
  public bhj()
  {
    GMTrace.i(3732729233408L, 27811);
    this.uTp = new LinkedList();
    GMTrace.o(3732729233408L, 27811);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3732863451136L, 27812);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tPV);
      paramVarArgs.T(3, this.tQd);
      paramVarArgs.fk(4, this.uTo);
      paramVarArgs.d(5, 8, this.uTp);
      GMTrace.o(3732863451136L, 27812);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tPV);
      int j = b.a.a.a.S(3, this.tQd);
      int k = b.a.a.a.fh(4, this.uTo);
      int m = b.a.a.a.c(5, 8, this.uTp);
      GMTrace.o(3732863451136L, 27812);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uTp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3732863451136L, 27812);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhj localbhj = (bhj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3732863451136L, 27812);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbhj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3732863451136L, 27812);
        return 0;
      case 2: 
        localbhj.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3732863451136L, 27812);
        return 0;
      case 3: 
        localbhj.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3732863451136L, 27812);
        return 0;
      case 4: 
        localbhj.uTo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3732863451136L, 27812);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new le();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((le)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbhj.uTp.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3732863451136L, 27812);
      return 0;
    }
    GMTrace.o(3732863451136L, 27812);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */