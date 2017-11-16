package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqw
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tTB;
  public int uHa;
  public String uHb;
  public azp uHc;
  public int uHd;
  
  public aqw()
  {
    GMTrace.i(3840640286720L, 28615);
    GMTrace.o(3840640286720L, 28615);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3840774504448L, 28616);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHc == null) {
        throw new b.a.a.b("Not all required fields were included: ClientKey");
      }
      paramVarArgs.fk(1, this.uHa);
      if (this.tTB != null) {
        paramVarArgs.b(2, this.tTB);
      }
      if (this.uHb != null) {
        paramVarArgs.e(3, this.uHb);
      }
      if (this.uHc != null)
      {
        paramVarArgs.fm(4, this.uHc.aYq());
        this.uHc.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uHd);
      GMTrace.o(3840774504448L, 28616);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uHa) + 0;
      paramInt = i;
      if (this.tTB != null) {
        paramInt = i + b.a.a.a.a(2, this.tTB);
      }
      i = paramInt;
      if (this.uHb != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uHb);
      }
      paramInt = i;
      if (this.uHc != null) {
        paramInt = i + b.a.a.a.fj(4, this.uHc.aYq());
      }
      i = b.a.a.a.fh(5, this.uHd);
      GMTrace.o(3840774504448L, 28616);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uHc == null) {
        throw new b.a.a.b("Not all required fields were included: ClientKey");
      }
      GMTrace.o(3840774504448L, 28616);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqw localaqw = (aqw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3840774504448L, 28616);
        return -1;
      case 1: 
        localaqw.uHa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3840774504448L, 28616);
        return 0;
      case 2: 
        localaqw.tTB = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3840774504448L, 28616);
        return 0;
      case 3: 
        localaqw.uHb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3840774504448L, 28616);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaqw.uHc = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3840774504448L, 28616);
        return 0;
      }
      localaqw.uHd = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3840774504448L, 28616);
      return 0;
    }
    GMTrace.o(3840774504448L, 28616);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */