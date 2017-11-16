package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bel
  extends com.tencent.mm.bm.a
{
  public int tQP;
  public azq uQa;
  public azq uQc;
  public int uQd;
  
  public bel()
  {
    GMTrace.i(3670854860800L, 27350);
    GMTrace.o(3670854860800L, 27350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3670989078528L, 27351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQa != null)
      {
        paramVarArgs.fm(1, this.uQa.aYq());
        this.uQa.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tQP);
      if (this.uQc != null)
      {
        paramVarArgs.fm(3, this.uQc.aYq());
        this.uQc.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.uQd);
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uQa != null) {
        paramInt = b.a.a.a.fj(1, this.uQa.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tQP);
      paramInt = i;
      if (this.uQc != null) {
        paramInt = i + b.a.a.a.fj(3, this.uQc.aYq());
      }
      i = b.a.a.a.fh(4, this.uQd);
      GMTrace.o(3670989078528L, 27351);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bel localbel = (bel)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3670989078528L, 27351);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbel.uQa = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3670989078528L, 27351);
        return 0;
      case 2: 
        localbel.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3670989078528L, 27351);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbel.uQc = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3670989078528L, 27351);
        return 0;
      }
      localbel.uQd = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    GMTrace.o(3670989078528L, 27351);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */