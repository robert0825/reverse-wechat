package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abq
  extends azh
{
  public int tPV;
  public azq tPW;
  public azq tPX;
  public long tQd;
  public int tRC;
  public int tRD;
  public int tRE;
  public azp ues;
  
  public abq()
  {
    GMTrace.i(3758499037184L, 28003);
    GMTrace.o(3758499037184L, 28003);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3758633254912L, 28004);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tPV);
      if (this.tPW != null)
      {
        paramVarArgs.fm(3, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(4, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tRC);
      paramVarArgs.fk(6, this.tRD);
      paramVarArgs.fk(7, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(8, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.T(9, this.tQd);
      GMTrace.o(3758633254912L, 28004);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tPV);
      paramInt = i;
      if (this.tPW != null) {
        paramInt = i + b.a.a.a.fj(3, this.tPW.aYq());
      }
      i = paramInt;
      if (this.tPX != null) {
        i = paramInt + b.a.a.a.fj(4, this.tPX.aYq());
      }
      i = i + b.a.a.a.fh(5, this.tRC) + b.a.a.a.fh(6, this.tRD) + b.a.a.a.fh(7, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(8, this.ues.aYq());
      }
      i = b.a.a.a.S(9, this.tQd);
      GMTrace.o(3758633254912L, 28004);
      return paramInt + i;
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
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3758633254912L, 28004);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abq localabq = (abq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3758633254912L, 28004);
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
          localabq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 2: 
        localabq.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabq.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabq.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 5: 
        localabq.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 6: 
        localabq.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 7: 
        localabq.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3758633254912L, 28004);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabq.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3758633254912L, 28004);
        return 0;
      }
      localabq.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3758633254912L, 28004);
      return 0;
    }
    GMTrace.o(3758633254912L, 28004);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\abq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */