package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bei
  extends com.tencent.mm.bm.a
{
  public azq uQa;
  
  public bei()
  {
    GMTrace.i(3641326960640L, 27130);
    GMTrace.o(3641326960640L, 27130);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3641461178368L, 27131);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQa != null)
      {
        paramVarArgs.fm(1, this.uQa.aYq());
        this.uQa.a(paramVarArgs);
      }
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uQa != null) {
        paramInt = b.a.a.a.fj(1, this.uQa.aYq()) + 0;
      }
      GMTrace.o(3641461178368L, 27131);
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
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bei localbei = (bei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3641461178368L, 27131);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbei.uQa = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    GMTrace.o(3641461178368L, 27131);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */