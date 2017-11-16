package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bkg
  extends ayx
{
  public int tPM;
  public agx tUt;
  
  public bkg()
  {
    GMTrace.i(3951638347776L, 29442);
    GMTrace.o(3951638347776L, 29442);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3951772565504L, 29443);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(2, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tPM);
      GMTrace.o(3951772565504L, 29443);
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
      if (this.tUt != null) {
        i = paramInt + b.a.a.a.fj(2, this.tUt.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.tPM);
      GMTrace.o(3951772565504L, 29443);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      GMTrace.o(3951772565504L, 29443);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bkg localbkg = (bkg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 3: 
      default: 
        GMTrace.o(3951772565504L, 29443);
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
          localbkg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3951772565504L, 29443);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbkg.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3951772565504L, 29443);
        return 0;
      }
      localbkg.tPM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3951772565504L, 29443);
      return 0;
    }
    GMTrace.o(3951772565504L, 29443);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */