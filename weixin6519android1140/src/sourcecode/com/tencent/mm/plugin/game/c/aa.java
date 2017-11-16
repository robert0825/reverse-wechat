package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class aa
  extends ayx
{
  public String lPg;
  public String lQh;
  public com.tencent.mm.bm.b lQj;
  
  public aa()
  {
    GMTrace.i(12653644742656L, 94277);
    GMTrace.o(12653644742656L, 94277);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12653778960384L, 94278);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg == null) {
        throw new b.a.a.b("Not all required fields were included: AppID");
      }
      if (this.lQh == null) {
        throw new b.a.a.b("Not all required fields were included: GroupID");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPg != null) {
        paramVarArgs.e(2, this.lPg);
      }
      if (this.lQh != null) {
        paramVarArgs.e(3, this.lQh);
      }
      if (this.lQj != null) {
        paramVarArgs.b(4, this.lQj);
      }
      GMTrace.o(12653778960384L, 94278);
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
      if (this.lQh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lQh);
      }
      paramInt = i;
      if (this.lQj != null) {
        paramInt = i + b.a.a.a.a(4, this.lQj);
      }
      GMTrace.o(12653778960384L, 94278);
      return paramInt;
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
        throw new b.a.a.b("Not all required fields were included: AppID");
      }
      if (this.lQh == null) {
        throw new b.a.a.b("Not all required fields were included: GroupID");
      }
      GMTrace.o(12653778960384L, 94278);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aa localaa = (aa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12653778960384L, 94278);
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
          localaa.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653778960384L, 94278);
        return 0;
      case 2: 
        localaa.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12653778960384L, 94278);
        return 0;
      case 3: 
        localaa.lQh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12653778960384L, 94278);
        return 0;
      }
      localaa.lQj = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(12653778960384L, 94278);
      return 0;
    }
    GMTrace.o(12653778960384L, 94278);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\c\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */