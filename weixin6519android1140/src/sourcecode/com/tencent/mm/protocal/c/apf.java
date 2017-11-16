package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apf
  extends com.tencent.mm.bm.a
{
  public atq uEF;
  public String uEJ;
  
  public apf()
  {
    GMTrace.i(3723333992448L, 27741);
    GMTrace.o(3723333992448L, 27741);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3723468210176L, 27742);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEJ == null) {
        throw new b("Not all required fields were included: ContactUsername");
      }
      if (this.uEF == null) {
        throw new b("Not all required fields were included: PhoneNumListInfo");
      }
      if (this.uEJ != null) {
        paramVarArgs.e(1, this.uEJ);
      }
      if (this.uEF != null)
      {
        paramVarArgs.fm(2, this.uEF.aYq());
        this.uEF.a(paramVarArgs);
      }
      GMTrace.o(3723468210176L, 27742);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uEJ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.uEJ) + 0;
      }
      i = paramInt;
      if (this.uEF != null) {
        i = paramInt + b.a.a.a.fj(2, this.uEF.aYq());
      }
      GMTrace.o(3723468210176L, 27742);
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
      if (this.uEJ == null) {
        throw new b("Not all required fields were included: ContactUsername");
      }
      if (this.uEF == null) {
        throw new b("Not all required fields were included: PhoneNumListInfo");
      }
      GMTrace.o(3723468210176L, 27742);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apf localapf = (apf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3723468210176L, 27742);
        return -1;
      case 1: 
        localapf.uEJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3723468210176L, 27742);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new atq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((atq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localapf.uEF = ((atq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3723468210176L, 27742);
      return 0;
    }
    GMTrace.o(3723468210176L, 27742);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */