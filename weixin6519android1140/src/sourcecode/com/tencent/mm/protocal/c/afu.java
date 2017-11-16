package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afu
  extends ayx
{
  public String eSd;
  public int uvu;
  public LinkedList<btw> uvv;
  
  public afu()
  {
    GMTrace.i(17827335503872L, 132824);
    this.uvv = new LinkedList();
    GMTrace.o(17827335503872L, 132824);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17827469721600L, 132825);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      paramVarArgs.fk(3, this.uvu);
      paramVarArgs.d(4, 8, this.uvv);
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eSd);
      }
      paramInt = b.a.a.a.fh(3, this.uvu);
      int j = b.a.a.a.c(4, 8, this.uvv);
      GMTrace.o(17827469721600L, 132825);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uvv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afu localafu = (afu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17827469721600L, 132825);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localafu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17827469721600L, 132825);
        return 0;
      case 2: 
        localafu.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17827469721600L, 132825);
        return 0;
      case 3: 
        localafu.uvu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17827469721600L, 132825);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((btw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localafu.uvv.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    GMTrace.o(17827469721600L, 132825);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */