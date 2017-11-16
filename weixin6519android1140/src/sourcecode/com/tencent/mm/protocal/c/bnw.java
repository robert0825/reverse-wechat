package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnw
  extends com.tencent.mm.bm.a
{
  public int tRD;
  public int uXG;
  public int uXH;
  public azp uXI;
  
  public bnw()
  {
    GMTrace.i(4042369531904L, 30118);
    GMTrace.o(4042369531904L, 30118);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4042503749632L, 30119);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXI == null) {
        throw new b("Not all required fields were included: PieceData");
      }
      paramVarArgs.fk(1, this.tRD);
      paramVarArgs.fk(2, this.uXG);
      paramVarArgs.fk(3, this.uXH);
      if (this.uXI != null)
      {
        paramVarArgs.fm(4, this.uXI.aYq());
        this.uXI.a(paramVarArgs);
      }
      GMTrace.o(4042503749632L, 30119);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tRD) + 0 + b.a.a.a.fh(2, this.uXG) + b.a.a.a.fh(3, this.uXH);
      paramInt = i;
      if (this.uXI != null) {
        paramInt = i + b.a.a.a.fj(4, this.uXI.aYq());
      }
      GMTrace.o(4042503749632L, 30119);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXI == null) {
        throw new b("Not all required fields were included: PieceData");
      }
      GMTrace.o(4042503749632L, 30119);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnw localbnw = (bnw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4042503749632L, 30119);
        return -1;
      case 1: 
        localbnw.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4042503749632L, 30119);
        return 0;
      case 2: 
        localbnw.uXG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4042503749632L, 30119);
        return 0;
      case 3: 
        localbnw.uXH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4042503749632L, 30119);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbnw.uXI = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4042503749632L, 30119);
      return 0;
    }
    GMTrace.o(4042503749632L, 30119);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */