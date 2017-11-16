package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class alg
  extends azh
{
  public md uAm;
  public btx uAr;
  public bty uAs;
  public bvl uAt;
  
  public alg()
  {
    GMTrace.i(17616613670912L, 131254);
    GMTrace.o(17616613670912L, 131254);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17616747888640L, 131255);
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
      if (this.uAr != null)
      {
        paramVarArgs.fm(2, this.uAr.aYq());
        this.uAr.a(paramVarArgs);
      }
      if (this.uAm != null)
      {
        paramVarArgs.fm(3, this.uAm.aYq());
        this.uAm.a(paramVarArgs);
      }
      if (this.uAs != null)
      {
        paramVarArgs.fm(4, this.uAs.aYq());
        this.uAs.a(paramVarArgs);
      }
      if (this.uAt != null)
      {
        paramVarArgs.fm(5, this.uAt.aYq());
        this.uAt.a(paramVarArgs);
      }
      GMTrace.o(17616747888640L, 131255);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uAr != null) {
        paramInt = i + b.a.a.a.fj(2, this.uAr.aYq());
      }
      i = paramInt;
      if (this.uAm != null) {
        i = paramInt + b.a.a.a.fj(3, this.uAm.aYq());
      }
      paramInt = i;
      if (this.uAs != null) {
        paramInt = i + b.a.a.a.fj(4, this.uAs.aYq());
      }
      i = paramInt;
      if (this.uAt != null) {
        i = paramInt + b.a.a.a.fj(5, this.uAt.aYq());
      }
      GMTrace.o(17616747888640L, 131255);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17616747888640L, 131255);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alg localalg = (alg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17616747888640L, 131255);
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
          localalg.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localalg.uAr = ((btx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new md();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((md)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localalg.uAm = ((md)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bty();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bty)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localalg.uAs = ((bty)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17616747888640L, 131255);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localalg.uAt = ((bvl)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17616747888640L, 131255);
      return 0;
    }
    GMTrace.o(17616747888640L, 131255);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\alg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */