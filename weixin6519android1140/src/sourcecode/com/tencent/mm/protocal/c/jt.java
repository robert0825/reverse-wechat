package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jt
  extends azh
{
  public int tXv;
  public azp tZA;
  public nl tZD;
  public int tZE;
  
  public jt()
  {
    GMTrace.i(3993648496640L, 29755);
    GMTrace.o(3993648496640L, 29755);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3993782714368L, 29756);
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
      if (this.tZD != null)
      {
        paramVarArgs.fm(2, this.tZD.aYq());
        this.tZD.a(paramVarArgs);
      }
      if (this.tZA != null)
      {
        paramVarArgs.fm(3, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tXv);
      paramVarArgs.fk(5, this.tZE);
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.tZD != null) {
        paramInt = i + b.a.a.a.fj(2, this.tZD.aYq());
      }
      i = paramInt;
      if (this.tZA != null) {
        i = paramInt + b.a.a.a.fj(3, this.tZA.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.tXv);
      int j = b.a.a.a.fh(5, this.tZE);
      GMTrace.o(3993782714368L, 29756);
      return i + paramInt + j;
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
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jt localjt = (jt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3993782714368L, 29756);
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
          localjt.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localjt.tZD = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localjt.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3993782714368L, 29756);
        return 0;
      case 4: 
        localjt.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3993782714368L, 29756);
        return 0;
      }
      localjt.tZE = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3993782714368L, 29756);
      return 0;
    }
    GMTrace.o(3993782714368L, 29756);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */