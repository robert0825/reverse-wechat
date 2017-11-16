package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adk
  extends azh
{
  public boolean tUd;
  public LinkedList<bci> tUe;
  public boolean uty;
  public LinkedList<bci> utz;
  
  public adk()
  {
    GMTrace.i(3859967639552L, 28759);
    this.tUe = new LinkedList();
    this.utz = new LinkedList();
    GMTrace.o(3859967639552L, 28759);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3860101857280L, 28760);
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
      paramVarArgs.ah(2, this.tUd);
      paramVarArgs.d(3, 8, this.tUe);
      paramVarArgs.ah(4, this.uty);
      paramVarArgs.d(5, 8, this.utz);
      GMTrace.o(3860101857280L, 28760);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.a.c(3, 8, this.tUe);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.a.c(5, 8, this.utz);
      GMTrace.o(3860101857280L, 28760);
      return paramInt + (i + 1) + j + (k + 1) + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tUe.clear();
      this.utz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3860101857280L, 28760);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adk localadk = (adk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3860101857280L, 28760);
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
          localadk.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3860101857280L, 28760);
        return 0;
      case 2: 
        localadk.tUd = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3860101857280L, 28760);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bci();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bci)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadk.tUe.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3860101857280L, 28760);
        return 0;
      case 4: 
        localadk.uty = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3860101857280L, 28760);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bci();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bci)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localadk.utz.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3860101857280L, 28760);
      return 0;
    }
    GMTrace.o(3860101857280L, 28760);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */