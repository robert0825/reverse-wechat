package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qb
  extends ayx
{
  public int jib;
  public int tWu;
  public asb ugb;
  public int ugc;
  
  public qb()
  {
    GMTrace.i(3944927461376L, 29392);
    GMTrace.o(3944927461376L, 29392);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3945061679104L, 29393);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugb == null) {
        throw new b("Not all required fields were included: Package");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ugb != null)
      {
        paramVarArgs.fm(2, this.ugb.aYq());
        this.ugb.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tWu);
      paramVarArgs.fk(4, this.ugc);
      paramVarArgs.fk(5, this.jib);
      GMTrace.o(3945061679104L, 29393);
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
      if (this.ugb != null) {
        i = paramInt + b.a.a.a.fj(2, this.ugb.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.tWu);
      int j = b.a.a.a.fh(4, this.ugc);
      int k = b.a.a.a.fh(5, this.jib);
      GMTrace.o(3945061679104L, 29393);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugb == null) {
        throw new b("Not all required fields were included: Package");
      }
      GMTrace.o(3945061679104L, 29393);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qb localqb = (qb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3945061679104L, 29393);
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
          localqb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3945061679104L, 29393);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqb.ugb = ((asb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3945061679104L, 29393);
        return 0;
      case 3: 
        localqb.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3945061679104L, 29393);
        return 0;
      case 4: 
        localqb.ugc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3945061679104L, 29393);
        return 0;
      }
      localqb.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3945061679104L, 29393);
      return 0;
    }
    GMTrace.o(3945061679104L, 29393);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */