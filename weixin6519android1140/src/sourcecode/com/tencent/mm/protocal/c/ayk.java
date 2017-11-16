package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayk
  extends ayx
{
  public String uMM;
  public int uMN;
  
  public ayk()
  {
    GMTrace.i(13582431420416L, 101197);
    GMTrace.o(13582431420416L, 101197);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13582565638144L, 101198);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uMM == null) {
        throw new b("Not all required fields were included: clientCheckData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uMM != null) {
        paramVarArgs.e(2, this.uMM);
      }
      paramVarArgs.fk(3, this.uMN);
      GMTrace.o(13582565638144L, 101198);
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
      if (this.uMM != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uMM);
      }
      paramInt = b.a.a.a.fh(3, this.uMN);
      GMTrace.o(13582565638144L, 101198);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uMM == null) {
        throw new b("Not all required fields were included: clientCheckData");
      }
      GMTrace.o(13582565638144L, 101198);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayk localayk = (ayk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13582565638144L, 101198);
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
          localayk.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13582565638144L, 101198);
        return 0;
      case 2: 
        localayk.uMM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13582565638144L, 101198);
        return 0;
      }
      localayk.uMN = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13582565638144L, 101198);
      return 0;
    }
    GMTrace.o(13582565638144L, 101198);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */