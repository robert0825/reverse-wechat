package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aaq
  extends azh
{
  public String jhi;
  public int tRC;
  public int tRD;
  public azp ues;
  
  public aaq()
  {
    GMTrace.i(3768162713600L, 28075);
    GMTrace.o(3768162713600L, 28075);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3768296931328L, 28076);
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
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.tRC);
      paramVarArgs.fk(4, this.tRD);
      if (this.ues != null)
      {
        paramVarArgs.fm(5, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      GMTrace.o(3768296931328L, 28076);
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
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = i + b.a.a.a.fh(3, this.tRC) + b.a.a.a.fh(4, this.tRD);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(5, this.ues.aYq());
      }
      GMTrace.o(3768296931328L, 28076);
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
      GMTrace.o(3768296931328L, 28076);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aaq localaaq = (aaq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3768296931328L, 28076);
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
          localaaq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3768296931328L, 28076);
        return 0;
      case 2: 
        localaaq.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3768296931328L, 28076);
        return 0;
      case 3: 
        localaaq.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3768296931328L, 28076);
        return 0;
      case 4: 
        localaaq.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3768296931328L, 28076);
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
        localaaq.ues = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3768296931328L, 28076);
      return 0;
    }
    GMTrace.o(3768296931328L, 28076);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */