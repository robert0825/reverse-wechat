package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bos
  extends azh
{
  public LinkedList<boj> tSO;
  public long uYy;
  public long uhV;
  
  public bos()
  {
    GMTrace.i(3735682023424L, 27833);
    this.tSO = new LinkedList();
    GMTrace.o(3735682023424L, 27833);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3735816241152L, 27834);
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
      paramVarArgs.T(2, this.uYy);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.d(4, 8, this.tSO);
      GMTrace.o(3735816241152L, 27834);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.S(2, this.uYy);
      int j = b.a.a.a.S(3, this.uhV);
      int k = b.a.a.a.c(4, 8, this.tSO);
      GMTrace.o(3735816241152L, 27834);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3735816241152L, 27834);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bos localbos = (bos)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3735816241152L, 27834);
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
          localbos.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3735816241152L, 27834);
        return 0;
      case 2: 
        localbos.uYy = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3735816241152L, 27834);
        return 0;
      case 3: 
        localbos.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3735816241152L, 27834);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new boj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((boj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbos.tSO.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3735816241152L, 27834);
      return 0;
    }
    GMTrace.o(3735816241152L, 27834);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */