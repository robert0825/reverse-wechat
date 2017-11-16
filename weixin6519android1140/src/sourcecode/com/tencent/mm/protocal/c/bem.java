package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bem
  extends com.tencent.mm.bm.a
{
  public bfh uQe;
  public azq uQf;
  
  public bem()
  {
    GMTrace.i(3815810007040L, 28430);
    GMTrace.o(3815810007040L, 28430);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3815944224768L, 28431);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQe == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      if (this.uQe != null)
      {
        paramVarArgs.fm(1, this.uQe.aYq());
        this.uQe.a(paramVarArgs);
      }
      if (this.uQf != null)
      {
        paramVarArgs.fm(2, this.uQf.aYq());
        this.uQf.a(paramVarArgs);
      }
      GMTrace.o(3815944224768L, 28431);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uQe != null) {
        paramInt = b.a.a.a.fj(1, this.uQe.aYq()) + 0;
      }
      i = paramInt;
      if (this.uQf != null) {
        i = paramInt + b.a.a.a.fj(2, this.uQf.aYq());
      }
      GMTrace.o(3815944224768L, 28431);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uQe == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      GMTrace.o(3815944224768L, 28431);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bem localbem = (bem)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3815944224768L, 28431);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbem.uQe = ((bfh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3815944224768L, 28431);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbem.uQf = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3815944224768L, 28431);
      return 0;
    }
    GMTrace.o(3815944224768L, 28431);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */