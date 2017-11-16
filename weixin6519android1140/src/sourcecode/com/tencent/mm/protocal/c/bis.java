package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bis
  extends com.tencent.mm.bm.a
{
  public azq uTT;
  public int uzM;
  
  public bis()
  {
    GMTrace.i(3989353529344L, 29723);
    GMTrace.o(3989353529344L, 29723);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3989487747072L, 29724);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uTT == null) {
        throw new b("Not all required fields were included: StatReport");
      }
      paramVarArgs.fk(1, this.uzM);
      if (this.uTT != null)
      {
        paramVarArgs.fm(2, this.uTT.aYq());
        this.uTT.a(paramVarArgs);
      }
      GMTrace.o(3989487747072L, 29724);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uzM) + 0;
      paramInt = i;
      if (this.uTT != null) {
        paramInt = i + b.a.a.a.fj(2, this.uTT.aYq());
      }
      GMTrace.o(3989487747072L, 29724);
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
      if (this.uTT == null) {
        throw new b("Not all required fields were included: StatReport");
      }
      GMTrace.o(3989487747072L, 29724);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bis localbis = (bis)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3989487747072L, 29724);
        return -1;
      case 1: 
        localbis.uzM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3989487747072L, 29724);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbis.uTT = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3989487747072L, 29724);
      return 0;
    }
    GMTrace.o(3989487747072L, 29724);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */