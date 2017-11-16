package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aih
  extends com.tencent.mm.bm.a
{
  public azp tQa;
  public azq uxJ;
  
  public aih()
  {
    GMTrace.i(3651661725696L, 27207);
    GMTrace.o(3651661725696L, 27207);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3651795943424L, 27208);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uxJ == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.tQa != null)
      {
        paramVarArgs.fm(1, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      if (this.uxJ != null)
      {
        paramVarArgs.fm(2, this.uxJ.aYq());
        this.uxJ.a(paramVarArgs);
      }
      GMTrace.o(3651795943424L, 27208);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tQa != null) {
        paramInt = b.a.a.a.fj(1, this.tQa.aYq()) + 0;
      }
      i = paramInt;
      if (this.uxJ != null) {
        i = paramInt + b.a.a.a.fj(2, this.uxJ.aYq());
      }
      GMTrace.o(3651795943424L, 27208);
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
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uxJ == null) {
        throw new b("Not all required fields were included: Username");
      }
      GMTrace.o(3651795943424L, 27208);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aih localaih = (aih)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3651795943424L, 27208);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaih.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3651795943424L, 27208);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaih.uxJ = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3651795943424L, 27208);
      return 0;
    }
    GMTrace.o(3651795943424L, 27208);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */