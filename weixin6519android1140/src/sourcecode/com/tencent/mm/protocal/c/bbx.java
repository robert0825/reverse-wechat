package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbx
  extends ayx
{
  public int uAQ;
  public LinkedList<azq> uAR;
  public String ugx;
  
  public bbx()
  {
    GMTrace.i(4037806129152L, 30084);
    this.uAR = new LinkedList();
    GMTrace.o(4037806129152L, 30084);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4037940346880L, 30085);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ugx != null) {
        paramVarArgs.e(2, this.ugx);
      }
      paramVarArgs.fk(3, this.uAQ);
      paramVarArgs.d(4, 8, this.uAR);
      GMTrace.o(4037940346880L, 30085);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ugx);
      }
      paramInt = b.a.a.a.fh(3, this.uAQ);
      int j = b.a.a.a.c(4, 8, this.uAR);
      GMTrace.o(4037940346880L, 30085);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uAR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4037940346880L, 30085);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbx localbbx = (bbx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4037940346880L, 30085);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbbx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4037940346880L, 30085);
        return 0;
      case 2: 
        localbbx.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4037940346880L, 30085);
        return 0;
      case 3: 
        localbbx.uAQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4037940346880L, 30085);
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
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbbx.uAR.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4037940346880L, 30085);
      return 0;
    }
    GMTrace.o(4037940346880L, 30085);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */