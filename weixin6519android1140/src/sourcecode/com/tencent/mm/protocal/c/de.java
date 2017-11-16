package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class de
  extends com.tencent.mm.bm.a
{
  public int tRo;
  public int tRp;
  public int tRw;
  public df tRx;
  
  public de()
  {
    GMTrace.i(4031900549120L, 30040);
    GMTrace.o(4031900549120L, 30040);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4032034766848L, 30041);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRo);
      paramVarArgs.fk(2, this.tRp);
      paramVarArgs.fk(3, this.tRw);
      if (this.tRx != null)
      {
        paramVarArgs.fm(4, this.tRx.aYq());
        this.tRx.a(paramVarArgs);
      }
      GMTrace.o(4032034766848L, 30041);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tRo) + 0 + b.a.a.a.fh(2, this.tRp) + b.a.a.a.fh(3, this.tRw);
      paramInt = i;
      if (this.tRx != null) {
        paramInt = i + b.a.a.a.fj(4, this.tRx.aYq());
      }
      GMTrace.o(4032034766848L, 30041);
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
      GMTrace.o(4032034766848L, 30041);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      de localde = (de)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4032034766848L, 30041);
        return -1;
      case 1: 
        localde.tRo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032034766848L, 30041);
        return 0;
      case 2: 
        localde.tRp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032034766848L, 30041);
        return 0;
      case 3: 
        localde.tRw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032034766848L, 30041);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new df();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((df)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localde.tRx = ((df)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4032034766848L, 30041);
      return 0;
    }
    GMTrace.o(4032034766848L, 30041);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */