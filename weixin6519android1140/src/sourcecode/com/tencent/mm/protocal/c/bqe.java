package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqe
  extends azh
{
  public int tXv;
  public azp tZA;
  public int uhU;
  public long uhV;
  public bpb van;
  
  public bqe()
  {
    GMTrace.i(3907346497536L, 29112);
    GMTrace.o(3907346497536L, 29112);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3907480715264L, 29113);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.van == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uhU);
      if (this.tZA != null)
      {
        paramVarArgs.fm(4, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      if (this.van != null)
      {
        paramVarArgs.fm(5, this.van.aYq());
        this.van.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.tXv);
      paramVarArgs.T(8, this.uhV);
      GMTrace.o(3907480715264L, 29113);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(3, this.uhU);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(4, this.tZA.aYq());
      }
      i = paramInt;
      if (this.van != null) {
        i = paramInt + b.a.a.a.fj(5, this.van.aYq());
      }
      paramInt = b.a.a.a.fh(7, this.tXv);
      int j = b.a.a.a.S(8, this.uhV);
      GMTrace.o(3907480715264L, 29113);
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
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.van == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      GMTrace.o(3907480715264L, 29113);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqe localbqe = (bqe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 2: 
      case 6: 
      default: 
        GMTrace.o(3907480715264L, 29113);
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
          localbqe.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3907480715264L, 29113);
        return 0;
      case 3: 
        localbqe.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3907480715264L, 29113);
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
          localbqe.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3907480715264L, 29113);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbqe.van = ((bpb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3907480715264L, 29113);
        return 0;
      case 7: 
        localbqe.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3907480715264L, 29113);
        return 0;
      }
      localbqe.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3907480715264L, 29113);
      return 0;
    }
    GMTrace.o(3907480715264L, 29113);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */