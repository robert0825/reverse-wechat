package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abe
  extends azh
{
  public int tYQ;
  public String tYR;
  public LinkedList<rz> urC;
  public int urD;
  
  public abe()
  {
    GMTrace.i(3860504510464L, 28763);
    this.urC = new LinkedList();
    GMTrace.o(3860504510464L, 28763);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3860638728192L, 28764);
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
      paramVarArgs.d(2, 8, this.urC);
      paramVarArgs.fk(3, this.urD);
      paramVarArgs.fk(4, this.tYQ);
      if (this.tYR != null) {
        paramVarArgs.e(5, this.tYR);
      }
      GMTrace.o(3860638728192L, 28764);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.urC) + b.a.a.a.fh(3, this.urD) + b.a.a.a.fh(4, this.tYQ);
      paramInt = i;
      if (this.tYR != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tYR);
      }
      GMTrace.o(3860638728192L, 28764);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.urC.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3860638728192L, 28764);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abe localabe = (abe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3860638728192L, 28764);
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
          localabe.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3860638728192L, 28764);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabe.urC.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3860638728192L, 28764);
        return 0;
      case 3: 
        localabe.urD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3860638728192L, 28764);
        return 0;
      case 4: 
        localabe.tYQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3860638728192L, 28764);
        return 0;
      }
      localabe.tYR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3860638728192L, 28764);
      return 0;
    }
    GMTrace.o(3860638728192L, 28764);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */