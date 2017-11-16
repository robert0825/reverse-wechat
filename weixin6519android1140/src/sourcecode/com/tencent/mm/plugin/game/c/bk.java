package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bk
  extends com.tencent.mm.bm.a
{
  public c lPb;
  public String lSi;
  
  public bk()
  {
    GMTrace.i(12635659567104L, 94143);
    GMTrace.o(12635659567104L, 94143);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12635793784832L, 94144);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lSi == null) {
        throw new b("Not all required fields were included: Rank");
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(1, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lSi != null) {
        paramVarArgs.e(2, this.lSi);
      }
      GMTrace.o(12635793784832L, 94144);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPb != null) {
        paramInt = b.a.a.a.fj(1, this.lPb.aYq()) + 0;
      }
      i = paramInt;
      if (this.lSi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lSi);
      }
      GMTrace.o(12635793784832L, 94144);
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
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lSi == null) {
        throw new b("Not all required fields were included: Rank");
      }
      GMTrace.o(12635793784832L, 94144);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bk localbk = (bk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12635793784832L, 94144);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbk.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12635793784832L, 94144);
        return 0;
      }
      localbk.lSi = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12635793784832L, 94144);
      return 0;
    }
    GMTrace.o(12635793784832L, 94144);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */