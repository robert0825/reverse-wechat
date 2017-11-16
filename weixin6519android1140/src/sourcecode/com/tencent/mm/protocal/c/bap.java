package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bap
  extends ayx
{
  public int lRx;
  public int lRy;
  
  public bap()
  {
    GMTrace.i(4012438978560L, 29895);
    GMTrace.o(4012438978560L, 29895);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4012573196288L, 29896);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lRx);
      paramVarArgs.fk(3, this.lRy);
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.lRx);
      int j = b.a.a.a.fh(3, this.lRy);
      GMTrace.o(4012573196288L, 29896);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bap localbap = (bap)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4012573196288L, 29896);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbap.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4012573196288L, 29896);
        return 0;
      case 2: 
        localbap.lRx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4012573196288L, 29896);
        return 0;
      }
      localbap.lRy = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    GMTrace.o(4012573196288L, 29896);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */