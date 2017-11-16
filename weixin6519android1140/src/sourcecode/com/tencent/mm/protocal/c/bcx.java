package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcx
  extends ayx
{
  public int jib;
  public String uPe;
  
  public bcx()
  {
    GMTrace.i(3952175218688L, 29446);
    GMTrace.o(3952175218688L, 29446);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3952309436416L, 29447);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jib);
      if (this.uPe != null) {
        paramVarArgs.e(3, this.uPe);
      }
      GMTrace.o(3952309436416L, 29447);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jib);
      paramInt = i;
      if (this.uPe != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uPe);
      }
      GMTrace.o(3952309436416L, 29447);
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
      GMTrace.o(3952309436416L, 29447);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcx localbcx = (bcx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3952309436416L, 29447);
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
          localbcx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3952309436416L, 29447);
        return 0;
      case 2: 
        localbcx.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3952309436416L, 29447);
        return 0;
      }
      localbcx.uPe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3952309436416L, 29447);
      return 0;
    }
    GMTrace.o(3952309436416L, 29447);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */