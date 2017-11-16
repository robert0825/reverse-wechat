package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class ck
  extends ayx
{
  public String lPg;
  public String lSX;
  
  public ck()
  {
    GMTrace.i(12648812904448L, 94241);
    GMTrace.o(12648812904448L, 94241);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648947122176L, 94242);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPg != null) {
        paramVarArgs.e(2, this.lPg);
      }
      if (this.lSX != null) {
        paramVarArgs.e(3, this.lSX);
      }
      GMTrace.o(12648947122176L, 94242);
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
      if (this.lPg != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPg);
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSX);
      }
      GMTrace.o(12648947122176L, 94242);
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
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      GMTrace.o(12648947122176L, 94242);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ck localck = (ck)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12648947122176L, 94242);
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
          localck.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12648947122176L, 94242);
        return 0;
      case 2: 
        localck.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12648947122176L, 94242);
        return 0;
      }
      localck.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12648947122176L, 94242);
      return 0;
    }
    GMTrace.o(12648947122176L, 94242);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */