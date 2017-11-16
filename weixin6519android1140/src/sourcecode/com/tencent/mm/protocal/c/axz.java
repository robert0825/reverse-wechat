package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axz
  extends azh
{
  public int jhc;
  public String tYR;
  public LinkedList<bmv> uMw;
  public bjl uMx;
  public int uzP;
  
  public axz()
  {
    GMTrace.i(3829500215296L, 28532);
    this.uMw = new LinkedList();
    GMTrace.o(3829500215296L, 28532);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3829634433024L, 28533);
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
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.uMw);
      if (this.tYR != null) {
        paramVarArgs.e(4, this.tYR);
      }
      paramVarArgs.fk(5, this.uzP);
      if (this.uMx != null)
      {
        paramVarArgs.fm(6, this.uMx.aYq());
        this.uMx.a(paramVarArgs);
      }
      GMTrace.o(3829634433024L, 28533);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhc) + b.a.a.a.c(3, 8, this.uMw);
      paramInt = i;
      if (this.tYR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tYR);
      }
      i = paramInt + b.a.a.a.fh(5, this.uzP);
      paramInt = i;
      if (this.uMx != null) {
        paramInt = i + b.a.a.a.fj(6, this.uMx.aYq());
      }
      GMTrace.o(3829634433024L, 28533);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uMw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3829634433024L, 28533);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axz localaxz = (axz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3829634433024L, 28533);
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
          localaxz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829634433024L, 28533);
        return 0;
      case 2: 
        localaxz.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3829634433024L, 28533);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bmv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bmv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaxz.uMw.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829634433024L, 28533);
        return 0;
      case 4: 
        localaxz.tYR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3829634433024L, 28533);
        return 0;
      case 5: 
        localaxz.uzP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3829634433024L, 28533);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bjl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bjl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaxz.uMx = ((bjl)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3829634433024L, 28533);
      return 0;
    }
    GMTrace.o(3829634433024L, 28533);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */