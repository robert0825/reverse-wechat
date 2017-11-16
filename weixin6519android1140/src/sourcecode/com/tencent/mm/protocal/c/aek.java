package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aek
  extends azh
{
  public int tRC;
  public int tRD;
  public int tRE;
  public azp ues;
  
  public aek()
  {
    GMTrace.i(3633810767872L, 27074);
    GMTrace.o(3633810767872L, 27074);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3633944985600L, 27075);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRC);
      paramVarArgs.fk(3, this.tRD);
      paramVarArgs.fk(4, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(5, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      GMTrace.o(3633944985600L, 27075);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRC) + b.a.a.a.fh(3, this.tRD) + b.a.a.a.fh(4, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(5, this.ues.aYq());
      }
      GMTrace.o(3633944985600L, 27075);
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
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3633944985600L, 27075);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aek localaek = (aek)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3633944985600L, 27075);
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
          localaek.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3633944985600L, 27075);
        return 0;
      case 2: 
        localaek.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633944985600L, 27075);
        return 0;
      case 3: 
        localaek.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633944985600L, 27075);
        return 0;
      case 4: 
        localaek.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633944985600L, 27075);
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
        localaek.ues = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3633944985600L, 27075);
      return 0;
    }
    GMTrace.o(3633944985600L, 27075);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */