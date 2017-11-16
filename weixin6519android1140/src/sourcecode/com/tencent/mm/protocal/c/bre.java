package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bre
  extends azh
{
  public String tWC;
  public int tWu;
  public int vbd;
  
  public bre()
  {
    GMTrace.i(4002775302144L, 29823);
    GMTrace.o(4002775302144L, 29823);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4002909519872L, 29824);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.vbd);
      paramVarArgs.fk(3, this.tWu);
      if (this.tWC != null) {
        paramVarArgs.e(4, this.tWC);
      }
      GMTrace.o(4002909519872L, 29824);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.vbd) + b.a.a.a.fh(3, this.tWu);
      paramInt = i;
      if (this.tWC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWC);
      }
      GMTrace.o(4002909519872L, 29824);
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
      GMTrace.o(4002909519872L, 29824);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bre localbre = (bre)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4002909519872L, 29824);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbre.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002909519872L, 29824);
        return 0;
      case 2: 
        localbre.vbd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002909519872L, 29824);
        return 0;
      case 3: 
        localbre.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002909519872L, 29824);
        return 0;
      }
      localbre.tWC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4002909519872L, 29824);
      return 0;
    }
    GMTrace.o(4002909519872L, 29824);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bre.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */