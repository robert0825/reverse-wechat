package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class baj
  extends ayx
{
  public int tMX;
  public azp tQz;
  public int uJH;
  public int uOf;
  public azq ufy;
  
  public baj()
  {
    GMTrace.i(3769773326336L, 28087);
    GMTrace.o(3769773326336L, 28087);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3769907544064L, 28088);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(2, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tMX);
      if (this.tQz != null)
      {
        paramVarArgs.fm(4, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uJH);
      paramVarArgs.fk(6, this.uOf);
      GMTrace.o(3769907544064L, 28088);
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
      if (this.ufy != null) {
        i = paramInt + b.a.a.a.fj(2, this.ufy.aYq());
      }
      i += b.a.a.a.fh(3, this.tMX);
      paramInt = i;
      if (this.tQz != null) {
        paramInt = i + b.a.a.a.fj(4, this.tQz.aYq());
      }
      i = b.a.a.a.fh(5, this.uJH);
      int j = b.a.a.a.fh(6, this.uOf);
      GMTrace.o(3769907544064L, 28088);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      GMTrace.o(3769907544064L, 28088);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      baj localbaj = (baj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3769907544064L, 28088);
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
          localbaj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3769907544064L, 28088);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbaj.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3769907544064L, 28088);
        return 0;
      case 3: 
        localbaj.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3769907544064L, 28088);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbaj.tQz = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3769907544064L, 28088);
        return 0;
      case 5: 
        localbaj.uJH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3769907544064L, 28088);
        return 0;
      }
      localbaj.uOf = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3769907544064L, 28088);
      return 0;
    }
    GMTrace.o(3769907544064L, 28088);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\baj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */