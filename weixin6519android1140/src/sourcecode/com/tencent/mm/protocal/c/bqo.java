package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqo
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public LinkedList<bqn> vaz;
  
  public bqo()
  {
    GMTrace.i(3778094825472L, 28149);
    this.vaz = new LinkedList();
    GMTrace.o(3778094825472L, 28149);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3778229043200L, 28150);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.vaz);
      paramVarArgs.fk(2, this.jhc);
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.vaz);
      i = b.a.a.a.fh(2, this.jhc);
      GMTrace.o(3778229043200L, 28150);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vaz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqo localbqo = (bqo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3778229043200L, 28150);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bqn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbqo.vaz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3778229043200L, 28150);
        return 0;
      }
      localbqo.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    GMTrace.o(3778229043200L, 28150);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */