package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aoy
  extends ayx
{
  public int tPL;
  public LinkedList<apa> tTQ;
  public int uEN;
  public LinkedList<aox> uEO;
  public int uEP;
  public String uEQ;
  
  public aoy()
  {
    GMTrace.i(4006533398528L, 29851);
    this.uEO = new LinkedList();
    this.tTQ = new LinkedList();
    GMTrace.o(4006533398528L, 29851);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4006667616256L, 29852);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tPL);
      paramVarArgs.fk(3, this.uEN);
      paramVarArgs.d(4, 8, this.uEO);
      paramVarArgs.fk(5, this.uEP);
      paramVarArgs.d(6, 8, this.tTQ);
      if (this.uEQ != null) {
        paramVarArgs.e(7, this.uEQ);
      }
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tPL) + b.a.a.a.fh(3, this.uEN) + b.a.a.a.c(4, 8, this.uEO) + b.a.a.a.fh(5, this.uEP) + b.a.a.a.c(6, 8, this.tTQ);
      paramInt = i;
      if (this.uEQ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uEQ);
      }
      GMTrace.o(4006667616256L, 29852);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uEO.clear();
      this.tTQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aoy localaoy = (aoy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4006667616256L, 29852);
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
          localaoy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 2: 
        localaoy.tPL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 3: 
        localaoy.uEN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aox();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aox)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaoy.uEO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 5: 
        localaoy.uEP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaoy.tTQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      }
      localaoy.uEQ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    GMTrace.o(4006667616256L, 29852);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */