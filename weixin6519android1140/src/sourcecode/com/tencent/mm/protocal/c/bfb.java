package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfb
  extends azh
{
  public int jib;
  public int tRC;
  public int tRD;
  public azp tTe;
  public String uQI;
  
  public bfb()
  {
    GMTrace.i(3969086652416L, 29572);
    GMTrace.o(3969086652416L, 29572);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3969220870144L, 29573);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.tTe != null)
      {
        paramVarArgs.fm(4, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      if (this.uQI != null) {
        paramVarArgs.e(5, this.uQI);
      }
      paramVarArgs.fk(6, this.jib);
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(4, this.tTe.aYq());
      }
      i = paramInt;
      if (this.uQI != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uQI);
      }
      paramInt = b.a.a.a.fh(6, this.jib);
      GMTrace.o(3969220870144L, 29573);
      return i + paramInt;
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
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfb localbfb = (bfb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3969220870144L, 29573);
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
          localbfb.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 2: 
        localbfb.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 3: 
        localbfb.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbfb.tTe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 5: 
        localbfb.uQI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      }
      localbfb.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    GMTrace.o(3969220870144L, 29573);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */