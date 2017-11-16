package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bny
  extends com.tencent.mm.bm.a
{
  public int tTL;
  public azp uVG;
  public int uXJ;
  public String udw;
  
  public bny()
  {
    GMTrace.i(3916473303040L, 29180);
    GMTrace.o(3916473303040L, 29180);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3916607520768L, 29181);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uVG == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.uVG != null)
      {
        paramVarArgs.fm(1, this.uVG.aYq());
        this.uVG.a(paramVarArgs);
      }
      if (this.udw != null) {
        paramVarArgs.e(2, this.udw);
      }
      paramVarArgs.fk(3, this.tTL);
      paramVarArgs.fk(4, this.uXJ);
      GMTrace.o(3916607520768L, 29181);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uVG != null) {
        paramInt = b.a.a.a.fj(1, this.uVG.aYq()) + 0;
      }
      i = paramInt;
      if (this.udw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.udw);
      }
      paramInt = b.a.a.a.fh(3, this.tTL);
      int j = b.a.a.a.fh(4, this.uXJ);
      GMTrace.o(3916607520768L, 29181);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uVG == null) {
        throw new b("Not all required fields were included: Text");
      }
      GMTrace.o(3916607520768L, 29181);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bny localbny = (bny)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3916607520768L, 29181);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbny.uVG = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3916607520768L, 29181);
        return 0;
      case 2: 
        localbny.udw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3916607520768L, 29181);
        return 0;
      case 3: 
        localbny.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3916607520768L, 29181);
        return 0;
      }
      localbny.uXJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3916607520768L, 29181);
      return 0;
    }
    GMTrace.o(3916607520768L, 29181);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */