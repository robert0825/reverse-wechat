package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blt
  extends azh
{
  public int tTL;
  public azp uVG;
  
  public blt()
  {
    GMTrace.i(3998211899392L, 29789);
    GMTrace.o(3998211899392L, 29789);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3998346117120L, 29790);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uVG == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tTL);
      if (this.uVG != null)
      {
        paramVarArgs.fm(3, this.uVG.aYq());
        this.uVG.a(paramVarArgs);
      }
      GMTrace.o(3998346117120L, 29790);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tTL);
      paramInt = i;
      if (this.uVG != null) {
        paramInt = i + b.a.a.a.fj(3, this.uVG.aYq());
      }
      GMTrace.o(3998346117120L, 29790);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uVG == null) {
        throw new b("Not all required fields were included: Text");
      }
      GMTrace.o(3998346117120L, 29790);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blt localblt = (blt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3998346117120L, 29790);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localblt.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3998346117120L, 29790);
        return 0;
      case 2: 
        localblt.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998346117120L, 29790);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localblt.uVG = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3998346117120L, 29790);
      return 0;
    }
    GMTrace.o(3998346117120L, 29790);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */