package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bto
  extends com.tencent.mm.bm.a
{
  public btr vco;
  
  public bto()
  {
    GMTrace.i(14998294233088L, 111746);
    GMTrace.o(14998294233088L, 111746);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14998428450816L, 111747);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vco == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.vco != null)
      {
        paramVarArgs.fm(4, this.vco.aYq());
        this.vco.a(paramVarArgs);
      }
      GMTrace.o(14998428450816L, 111747);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.vco != null) {
        paramInt = b.a.a.a.fj(4, this.vco.aYq()) + 0;
      }
      GMTrace.o(14998428450816L, 111747);
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
      if (this.vco == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      GMTrace.o(14998428450816L, 111747);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bto localbto = (bto)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14998428450816L, 111747);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btr();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((btr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbto.vco = ((btr)localObject1);
        paramInt += 1;
      }
      GMTrace.o(14998428450816L, 111747);
      return 0;
    }
    GMTrace.o(14998428450816L, 111747);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */