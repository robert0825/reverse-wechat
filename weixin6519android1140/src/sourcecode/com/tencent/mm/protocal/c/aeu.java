package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aeu
  extends azh
{
  public int jia;
  public int uuH;
  public LinkedList<bmy> uuI;
  
  public aeu()
  {
    GMTrace.i(3825205248000L, 28500);
    this.uuI = new LinkedList();
    GMTrace.o(3825205248000L, 28500);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3825339465728L, 28501);
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
      paramVarArgs.fk(2, this.jia);
      paramVarArgs.fk(3, this.uuH);
      paramVarArgs.d(4, 8, this.uuI);
      GMTrace.o(3825339465728L, 28501);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jia);
      int j = b.a.a.a.fh(3, this.uuH);
      int k = b.a.a.a.c(4, 8, this.uuI);
      GMTrace.o(3825339465728L, 28501);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uuI.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3825339465728L, 28501);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aeu localaeu = (aeu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3825339465728L, 28501);
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
          localaeu.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3825339465728L, 28501);
        return 0;
      case 2: 
        localaeu.jia = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825339465728L, 28501);
        return 0;
      case 3: 
        localaeu.uuH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825339465728L, 28501);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bmy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bmy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaeu.uuI.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3825339465728L, 28501);
      return 0;
    }
    GMTrace.o(3825339465728L, 28501);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */