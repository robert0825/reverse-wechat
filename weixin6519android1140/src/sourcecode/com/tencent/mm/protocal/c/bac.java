package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bac
  extends ayx
{
  public String eSd;
  public String state;
  public int uGQ;
  public LinkedList<String> uGR;
  public String uOc;
  
  public bac()
  {
    GMTrace.i(17875922321408L, 133186);
    this.uGR = new LinkedList();
    GMTrace.o(17875922321408L, 133186);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17876056539136L, 133187);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uGQ);
      paramVarArgs.d(4, 1, this.uGR);
      if (this.eSd != null) {
        paramVarArgs.e(5, this.eSd);
      }
      if (this.state != null) {
        paramVarArgs.e(6, this.state);
      }
      if (this.uOc != null) {
        paramVarArgs.e(7, this.uOc);
      }
      GMTrace.o(17876056539136L, 133187);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(3, this.uGQ) + b.a.a.a.c(4, 1, this.uGR);
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.eSd);
      }
      i = paramInt;
      if (this.state != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.state);
      }
      paramInt = i;
      if (this.uOc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uOc);
      }
      GMTrace.o(17876056539136L, 133187);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uGR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17876056539136L, 133187);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bac localbac = (bac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      default: 
        GMTrace.o(17876056539136L, 133187);
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
          localbac.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17876056539136L, 133187);
        return 0;
      case 3: 
        localbac.uGQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17876056539136L, 133187);
        return 0;
      case 4: 
        localbac.uGR.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(17876056539136L, 133187);
        return 0;
      case 5: 
        localbac.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17876056539136L, 133187);
        return 0;
      case 6: 
        localbac.state = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17876056539136L, 133187);
        return 0;
      }
      localbac.uOc = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17876056539136L, 133187);
      return 0;
    }
    GMTrace.o(17876056539136L, 133187);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */