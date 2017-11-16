package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfu
  extends com.tencent.mm.bm.a
{
  public azp uRE;
  
  public bfu()
  {
    GMTrace.i(3718233718784L, 27703);
    GMTrace.o(3718233718784L, 27703);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3718367936512L, 27704);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uRE != null)
      {
        paramVarArgs.fm(1, this.uRE.aYq());
        this.uRE.a(paramVarArgs);
      }
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uRE != null) {
        paramInt = b.a.a.a.fj(1, this.uRE.aYq()) + 0;
      }
      GMTrace.o(3718367936512L, 27704);
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
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfu localbfu = (bfu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3718367936512L, 27704);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbfu.uRE = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    GMTrace.o(3718367936512L, 27704);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */