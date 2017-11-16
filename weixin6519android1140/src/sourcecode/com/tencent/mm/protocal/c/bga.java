package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bga
  extends azh
{
  public int tXv;
  public azp tZA;
  public nl tZD;
  
  public bga()
  {
    GMTrace.i(3868557574144L, 28823);
    GMTrace.o(3868557574144L, 28823);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3868691791872L, 28824);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tZD == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
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
      paramVarArgs.fk(3, this.tXv);
      if (this.tZA != null)
      {
        paramVarArgs.fm(4, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.tZD != null) {
        i = paramInt + b.a.a.a.fj(2, this.tZD.aYq());
      }
      i += b.a.a.a.fh(3, this.tXv);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(4, this.tZA.aYq());
      }
      GMTrace.o(3868691791872L, 28824);
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
      if (this.tZD == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bga localbga = (bga)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3868691791872L, 28824);
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
          localbga.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3868691791872L, 28824);
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
          localbga.tZD = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3868691791872L, 28824);
        return 0;
      case 3: 
        localbga.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3868691791872L, 28824);
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
        localbga.tZA = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3868691791872L, 28824);
      return 0;
    }
    GMTrace.o(3868691791872L, 28824);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */