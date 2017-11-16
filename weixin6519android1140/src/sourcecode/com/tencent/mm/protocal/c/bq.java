package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bq
  extends ayx
{
  public int jib;
  public String tPP;
  public int tPQ;
  public String tPR;
  public String tPS;
  
  public bq()
  {
    GMTrace.i(3835540013056L, 28577);
    GMTrace.o(3835540013056L, 28577);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835674230784L, 28578);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tPP != null) {
        paramVarArgs.e(2, this.tPP);
      }
      paramVarArgs.fk(3, this.jib);
      paramVarArgs.fk(4, this.tPQ);
      if (this.tPR != null) {
        paramVarArgs.e(5, this.tPR);
      }
      if (this.tPS != null) {
        paramVarArgs.e(6, this.tPS);
      }
      GMTrace.o(3835674230784L, 28578);
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
      if (this.tPP != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tPP);
      }
      i = i + b.a.a.a.fh(3, this.jib) + b.a.a.a.fh(4, this.tPQ);
      paramInt = i;
      if (this.tPR != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tPR);
      }
      i = paramInt;
      if (this.tPS != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tPS);
      }
      GMTrace.o(3835674230784L, 28578);
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
      GMTrace.o(3835674230784L, 28578);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bq localbq = (bq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3835674230784L, 28578);
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
          localbq.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 2: 
        localbq.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 3: 
        localbq.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 4: 
        localbq.tPQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      case 5: 
        localbq.tPR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3835674230784L, 28578);
        return 0;
      }
      localbq.tPS = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3835674230784L, 28578);
      return 0;
    }
    GMTrace.o(3835674230784L, 28578);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */