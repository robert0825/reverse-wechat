package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acw
  extends ayx
{
  public int usQ;
  public azp usR;
  public int usS;
  public int usT;
  
  public acw()
  {
    GMTrace.i(4022505308160L, 29970);
    GMTrace.o(4022505308160L, 29970);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4022639525888L, 29971);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.usR == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.usQ);
      if (this.usR != null)
      {
        paramVarArgs.fm(3, this.usR.aYq());
        this.usR.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.usS);
      paramVarArgs.fk(5, this.usT);
      GMTrace.o(4022639525888L, 29971);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.usQ);
      paramInt = i;
      if (this.usR != null) {
        paramInt = i + b.a.a.a.fj(3, this.usR.aYq());
      }
      i = b.a.a.a.fh(4, this.usS);
      int j = b.a.a.a.fh(5, this.usT);
      GMTrace.o(4022639525888L, 29971);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.usR == null) {
        throw new b("Not all required fields were included: Url");
      }
      GMTrace.o(4022639525888L, 29971);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acw localacw = (acw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4022639525888L, 29971);
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
          localacw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4022639525888L, 29971);
        return 0;
      case 2: 
        localacw.usQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4022639525888L, 29971);
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
          localacw.usR = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4022639525888L, 29971);
        return 0;
      case 4: 
        localacw.usS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4022639525888L, 29971);
        return 0;
      }
      localacw.usT = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4022639525888L, 29971);
      return 0;
    }
    GMTrace.o(4022639525888L, 29971);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\acw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */