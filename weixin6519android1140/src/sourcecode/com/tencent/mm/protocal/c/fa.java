package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class fa
  extends azh
{
  public LinkedList<String> tSJ;
  public int tTI;
  public int tTL;
  public LinkedList<qp> tTM;
  
  public fa()
  {
    GMTrace.i(3960765153280L, 29510);
    this.tSJ = new LinkedList();
    this.tTM = new LinkedList();
    GMTrace.o(3960765153280L, 29510);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3960899371008L, 29511);
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
      paramVarArgs.fk(2, this.tTI);
      paramVarArgs.d(3, 1, this.tSJ);
      paramVarArgs.fk(4, this.tTL);
      paramVarArgs.d(5, 8, this.tTM);
      GMTrace.o(3960899371008L, 29511);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tTI);
      int j = b.a.a.a.c(3, 1, this.tSJ);
      int k = b.a.a.a.fh(4, this.tTL);
      int m = b.a.a.a.c(5, 8, this.tTM);
      GMTrace.o(3960899371008L, 29511);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSJ.clear();
      this.tTM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3960899371008L, 29511);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      fa localfa = (fa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3960899371008L, 29511);
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
          localfa.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3960899371008L, 29511);
        return 0;
      case 2: 
        localfa.tTI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3960899371008L, 29511);
        return 0;
      case 3: 
        localfa.tSJ.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3960899371008L, 29511);
        return 0;
      case 4: 
        localfa.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3960899371008L, 29511);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new qp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((qp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localfa.tTM.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3960899371008L, 29511);
      return 0;
    }
    GMTrace.o(3960899371008L, 29511);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */