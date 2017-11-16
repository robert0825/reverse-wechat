package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vd
  extends com.tencent.mm.bm.a
{
  public uw unx;
  public LinkedList<String> uny;
  
  public vd()
  {
    GMTrace.i(3914594254848L, 29166);
    this.uny = new LinkedList();
    GMTrace.o(3914594254848L, 29166);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3914728472576L, 29167);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.unx == null) {
        throw new b("Not all required fields were included: GameItem");
      }
      if (this.unx != null)
      {
        paramVarArgs.fm(1, this.unx.aYq());
        this.unx.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.uny);
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.unx != null) {
        paramInt = b.a.a.a.fj(1, this.unx.aYq()) + 0;
      }
      i = b.a.a.a.c(2, 1, this.uny);
      GMTrace.o(3914728472576L, 29167);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uny.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.unx == null) {
        throw new b("Not all required fields were included: GameItem");
      }
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vd localvd = (vd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3914728472576L, 29167);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((uw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localvd.unx = ((uw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3914728472576L, 29167);
        return 0;
      }
      localvd.uny.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    GMTrace.o(3914728472576L, 29167);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */