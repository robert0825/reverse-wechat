package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjr
  extends ayx
{
  public String tSz;
  public ahr uUD;
  public int uUE;
  public String ueB;
  
  public bjr()
  {
    GMTrace.i(3724407734272L, 27749);
    GMTrace.o(3724407734272L, 27749);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3724541952000L, 27750);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ueB != null) {
        paramVarArgs.e(2, this.ueB);
      }
      if (this.tSz != null) {
        paramVarArgs.e(3, this.tSz);
      }
      if (this.uUD != null)
      {
        paramVarArgs.fm(4, this.uUD.aYq());
        this.uUD.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uUE);
      GMTrace.o(3724541952000L, 27750);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.ueB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ueB);
      }
      i = paramInt;
      if (this.tSz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSz);
      }
      paramInt = i;
      if (this.uUD != null) {
        paramInt = i + b.a.a.a.fj(4, this.uUD.aYq());
      }
      i = b.a.a.a.fh(5, this.uUE);
      GMTrace.o(3724541952000L, 27750);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3724541952000L, 27750);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjr localbjr = (bjr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3724541952000L, 27750);
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
          localbjr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3724541952000L, 27750);
        return 0;
      case 2: 
        localbjr.ueB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3724541952000L, 27750);
        return 0;
      case 3: 
        localbjr.tSz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3724541952000L, 27750);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbjr.uUD = ((ahr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3724541952000L, 27750);
        return 0;
      }
      localbjr.uUE = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3724541952000L, 27750);
      return 0;
    }
    GMTrace.o(3724541952000L, 27750);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */