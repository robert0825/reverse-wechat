package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdr
  extends azh
{
  public LinkedList<bdp> glr;
  public int jAO;
  public long uPF;
  public int uPH;
  
  public bdr()
  {
    GMTrace.i(3766283665408L, 28061);
    this.glr = new LinkedList();
    GMTrace.o(3766283665408L, 28061);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3766417883136L, 28062);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.glr);
      paramVarArgs.fk(3, this.uPH);
      paramVarArgs.T(4, this.uPF);
      paramVarArgs.fk(5, this.jAO);
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.glr);
      int j = b.a.a.a.fh(3, this.uPH);
      int k = b.a.a.a.S(4, this.uPF);
      int m = b.a.a.a.fh(5, this.jAO);
      GMTrace.o(3766417883136L, 28062);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.glr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdr localbdr = (bdr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3766417883136L, 28062);
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
          localbdr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdr.glr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 3: 
        localbdr.uPH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 4: 
        localbdr.uPF = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3766417883136L, 28062);
        return 0;
      }
      localbdr.jAO = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    GMTrace.o(3766417883136L, 28062);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */