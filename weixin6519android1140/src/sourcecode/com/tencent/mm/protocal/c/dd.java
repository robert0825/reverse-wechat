package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dd
  extends azh
{
  public com.tencent.mm.bm.b tRn;
  public int tRs;
  public int tRt;
  public di tRu;
  public de tRv;
  
  public dd()
  {
    GMTrace.i(3783195099136L, 28187);
    GMTrace.o(3783195099136L, 28187);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3783329316864L, 28188);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRs);
      paramVarArgs.fk(3, this.tRt);
      if (this.tRn != null) {
        paramVarArgs.b(4, this.tRn);
      }
      if (this.tRu != null)
      {
        paramVarArgs.fm(5, this.tRu.aYq());
        this.tRu.a(paramVarArgs);
      }
      if (this.tRv != null)
      {
        paramVarArgs.fm(6, this.tRv.aYq());
        this.tRv.a(paramVarArgs);
      }
      GMTrace.o(3783329316864L, 28188);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRs) + b.a.a.a.fh(3, this.tRt);
      paramInt = i;
      if (this.tRn != null) {
        paramInt = i + b.a.a.a.a(4, this.tRn);
      }
      i = paramInt;
      if (this.tRu != null) {
        i = paramInt + b.a.a.a.fj(5, this.tRu.aYq());
      }
      paramInt = i;
      if (this.tRv != null) {
        paramInt = i + b.a.a.a.fj(6, this.tRv.aYq());
      }
      GMTrace.o(3783329316864L, 28188);
      return paramInt;
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
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3783329316864L, 28188);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dd localdd = (dd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3783329316864L, 28188);
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
          localdd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3783329316864L, 28188);
        return 0;
      case 2: 
        localdd.tRs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3783329316864L, 28188);
        return 0;
      case 3: 
        localdd.tRt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3783329316864L, 28188);
        return 0;
      case 4: 
        localdd.tRn = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3783329316864L, 28188);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new di();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((di)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localdd.tRu = ((di)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3783329316864L, 28188);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new de();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((de)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localdd.tRv = ((de)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3783329316864L, 28188);
      return 0;
    }
    GMTrace.o(3783329316864L, 28188);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */