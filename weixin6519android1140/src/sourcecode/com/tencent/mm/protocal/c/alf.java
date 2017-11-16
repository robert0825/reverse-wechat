package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class alf
  extends ayx
{
  public String lQa;
  public bvk uAq;
  public int utx;
  
  public alf()
  {
    GMTrace.i(17615003058176L, 131242);
    GMTrace.o(17615003058176L, 131242);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615137275904L, 131243);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.utx);
      if (this.uAq != null)
      {
        paramVarArgs.fm(4, this.uAq.aYq());
        this.uAq.a(paramVarArgs);
      }
      GMTrace.o(17615137275904L, 131243);
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
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      i += b.a.a.a.fh(3, this.utx);
      paramInt = i;
      if (this.uAq != null) {
        paramInt = i + b.a.a.a.fj(4, this.uAq.aYq());
      }
      GMTrace.o(17615137275904L, 131243);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17615137275904L, 131243);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alf localalf = (alf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17615137275904L, 131243);
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
          localalf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17615137275904L, 131243);
        return 0;
      case 2: 
        localalf.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17615137275904L, 131243);
        return 0;
      case 3: 
        localalf.utx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17615137275904L, 131243);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvk();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localalf.uAq = ((bvk)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17615137275904L, 131243);
      return 0;
    }
    GMTrace.o(17615137275904L, 131243);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\alf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */