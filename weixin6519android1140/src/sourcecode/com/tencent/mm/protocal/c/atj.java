package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atj
  extends ayx
{
  public String nFa;
  
  public atj()
  {
    GMTrace.i(3646964105216L, 27172);
    GMTrace.o(3646964105216L, 27172);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3647098322944L, 27173);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nFa == null) {
        throw new b("Not all required fields were included: Transid");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.nFa != null) {
        paramVarArgs.e(2, this.nFa);
      }
      GMTrace.o(3647098322944L, 27173);
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
      if (this.nFa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nFa);
      }
      GMTrace.o(3647098322944L, 27173);
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
      if (this.nFa == null) {
        throw new b("Not all required fields were included: Transid");
      }
      GMTrace.o(3647098322944L, 27173);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atj localatj = (atj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3647098322944L, 27173);
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
          localatj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3647098322944L, 27173);
        return 0;
      }
      localatj.nFa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3647098322944L, 27173);
      return 0;
    }
    GMTrace.o(3647098322944L, 27173);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\atj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */