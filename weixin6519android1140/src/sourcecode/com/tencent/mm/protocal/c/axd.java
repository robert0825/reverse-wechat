package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axd
  extends ayx
{
  public int bUH;
  public azp tSj;
  public azp uLX;
  
  public axd()
  {
    GMTrace.i(3770310197248L, 28091);
    GMTrace.o(3770310197248L, 28091);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3770444414976L, 28092);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.bUH);
      if (this.tSj != null)
      {
        paramVarArgs.fm(3, this.tSj.aYq());
        this.tSj.a(paramVarArgs);
      }
      if (this.uLX != null)
      {
        paramVarArgs.fm(4, this.uLX.aYq());
        this.uLX.a(paramVarArgs);
      }
      GMTrace.o(3770444414976L, 28092);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.bUH);
      paramInt = i;
      if (this.tSj != null) {
        paramInt = i + b.a.a.a.fj(3, this.tSj.aYq());
      }
      i = paramInt;
      if (this.uLX != null) {
        i = paramInt + b.a.a.a.fj(4, this.uLX.aYq());
      }
      GMTrace.o(3770444414976L, 28092);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3770444414976L, 28092);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axd localaxd = (axd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3770444414976L, 28092);
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
          localaxd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3770444414976L, 28092);
        return 0;
      case 2: 
        localaxd.bUH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3770444414976L, 28092);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaxd.tSj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3770444414976L, 28092);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localaxd.uLX = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3770444414976L, 28092);
      return 0;
    }
    GMTrace.o(3770444414976L, 28092);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */