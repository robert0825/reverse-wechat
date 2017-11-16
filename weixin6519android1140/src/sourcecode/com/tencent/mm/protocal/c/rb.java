package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rb
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public LinkedList<alb> jhd;
  public String ugy;
  
  public rb()
  {
    GMTrace.i(3915131125760L, 29170);
    this.jhd = new LinkedList();
    GMTrace.o(3915131125760L, 29170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3915265343488L, 29171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugy != null) {
        paramVarArgs.e(1, this.ugy);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      GMTrace.o(3915265343488L, 29171);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ugy != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ugy) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.c(3, 8, this.jhd);
      GMTrace.o(3915265343488L, 29171);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3915265343488L, 29171);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rb localrb = (rb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3915265343488L, 29171);
        return -1;
      case 1: 
        localrb.ugy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3915265343488L, 29171);
        return 0;
      case 2: 
        localrb.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3915265343488L, 29171);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new alb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((alb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localrb.jhd.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3915265343488L, 29171);
      return 0;
    }
    GMTrace.o(3915265343488L, 29171);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */