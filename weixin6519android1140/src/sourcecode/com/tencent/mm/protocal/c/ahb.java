package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ahb
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int nFd;
  public azp tTe;
  public long uwB;
  
  public ahb()
  {
    GMTrace.i(3636763557888L, 27096);
    GMTrace.o(3636763557888L, 27096);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3636897775616L, 27097);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      paramVarArgs.T(1, this.uwB);
      paramVarArgs.fk(2, this.nFd);
      if (this.tTe != null)
      {
        paramVarArgs.fm(3, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.jib);
      GMTrace.o(3636897775616L, 27097);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.uwB) + 0 + b.a.a.a.fh(2, this.nFd);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(3, this.tTe.aYq());
      }
      i = b.a.a.a.fh(4, this.jib);
      GMTrace.o(3636897775616L, 27097);
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
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3636897775616L, 27097);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ahb localahb = (ahb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3636897775616L, 27097);
        return -1;
      case 1: 
        localahb.uwB = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3636897775616L, 27097);
        return 0;
      case 2: 
        localahb.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3636897775616L, 27097);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahb.tTe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3636897775616L, 27097);
        return 0;
      }
      localahb.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3636897775616L, 27097);
      return 0;
    }
    GMTrace.o(3636897775616L, 27097);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */