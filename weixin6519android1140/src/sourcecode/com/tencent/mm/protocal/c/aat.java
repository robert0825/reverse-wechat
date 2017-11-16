package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aat
  extends com.tencent.mm.bm.a
{
  public agx tUb;
  public int urq;
  public int urr;
  
  public aat()
  {
    GMTrace.i(3982776860672L, 29674);
    GMTrace.o(3982776860672L, 29674);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3982911078400L, 29675);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUb == null) {
        throw new b("Not all required fields were included: Device");
      }
      paramVarArgs.fk(1, this.urq);
      paramVarArgs.fk(2, this.urr);
      if (this.tUb != null)
      {
        paramVarArgs.fm(3, this.tUb.aYq());
        this.tUb.a(paramVarArgs);
      }
      GMTrace.o(3982911078400L, 29675);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.urq) + 0 + b.a.a.a.fh(2, this.urr);
      paramInt = i;
      if (this.tUb != null) {
        paramInt = i + b.a.a.a.fj(3, this.tUb.aYq());
      }
      GMTrace.o(3982911078400L, 29675);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tUb == null) {
        throw new b("Not all required fields were included: Device");
      }
      GMTrace.o(3982911078400L, 29675);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aat localaat = (aat)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3982911078400L, 29675);
        return -1;
      case 1: 
        localaat.urq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3982911078400L, 29675);
        return 0;
      case 2: 
        localaat.urr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3982911078400L, 29675);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new agx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaat.tUb = ((agx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3982911078400L, 29675);
      return 0;
    }
    GMTrace.o(3982911078400L, 29675);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */