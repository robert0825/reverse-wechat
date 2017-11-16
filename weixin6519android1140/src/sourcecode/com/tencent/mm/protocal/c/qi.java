package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qi
  extends azh
{
  public int tPV;
  public String tQN;
  public long tQd;
  public int tTL;
  public int tWu;
  public azp ues;
  public int ugl;
  public int ugn;
  public int ugo;
  
  public qi()
  {
    GMTrace.i(4005191221248L, 29841);
    GMTrace.o(4005191221248L, 29841);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4005325438976L, 29842);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      paramVarArgs.fk(1, this.tPV);
      paramVarArgs.fk(2, this.tWu);
      paramVarArgs.fk(3, this.ugl);
      paramVarArgs.fk(5, this.ugn);
      if (this.tQN != null) {
        paramVarArgs.e(6, this.tQN);
      }
      if (this.ues != null)
      {
        paramVarArgs.fm(7, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.tTL);
      if (this.uND != null)
      {
        paramVarArgs.fm(9, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.ugo);
      paramVarArgs.T(11, this.tQd);
      GMTrace.o(4005325438976L, 29842);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tPV) + 0 + b.a.a.a.fh(2, this.tWu) + b.a.a.a.fh(3, this.ugl) + b.a.a.a.fh(5, this.ugn);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQN);
      }
      i = paramInt;
      if (this.ues != null) {
        i = paramInt + b.a.a.a.fj(7, this.ues.aYq());
      }
      i += b.a.a.a.fh(8, this.tTL);
      paramInt = i;
      if (this.uND != null) {
        paramInt = i + b.a.a.a.fj(9, this.uND.aYq());
      }
      i = b.a.a.a.fh(10, this.ugo);
      int j = b.a.a.a.S(11, this.tQd);
      GMTrace.o(4005325438976L, 29842);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4005325438976L, 29842);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qi localqi = (qi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 4: 
      default: 
        GMTrace.o(4005325438976L, 29842);
        return -1;
      case 1: 
        localqi.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 2: 
        localqi.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 3: 
        localqi.ugl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 5: 
        localqi.ugn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 6: 
        localqi.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqi.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 8: 
        localqi.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005325438976L, 29842);
        return 0;
      case 10: 
        localqi.ugo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005325438976L, 29842);
        return 0;
      }
      localqi.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(4005325438976L, 29842);
      return 0;
    }
    GMTrace.o(4005325438976L, 29842);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */