package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qe
  extends azh
{
  public String jhi;
  public String lQa;
  public int tRC;
  public int tRD;
  public int tRE;
  public azp ues;
  public String ugf;
  
  public qe()
  {
    GMTrace.i(3992843190272L, 29749);
    GMTrace.o(3992843190272L, 29749);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3992977408000L, 29750);
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
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.ugf != null) {
        paramVarArgs.e(3, this.ugf);
      }
      if (this.jhi != null) {
        paramVarArgs.e(4, this.jhi);
      }
      paramVarArgs.fk(5, this.tRC);
      paramVarArgs.fk(6, this.tRD);
      paramVarArgs.fk(7, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(8, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      GMTrace.o(3992977408000L, 29750);
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
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.ugf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugf);
      }
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jhi);
      }
      i = paramInt + b.a.a.a.fh(5, this.tRC) + b.a.a.a.fh(6, this.tRD) + b.a.a.a.fh(7, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(8, this.ues.aYq());
      }
      GMTrace.o(3992977408000L, 29750);
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
      GMTrace.o(3992977408000L, 29750);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qe localqe = (qe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3992977408000L, 29750);
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
          localqe.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 2: 
        localqe.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 3: 
        localqe.ugf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 4: 
        localqe.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 5: 
        localqe.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 6: 
        localqe.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3992977408000L, 29750);
        return 0;
      case 7: 
        localqe.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3992977408000L, 29750);
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
        localqe.ues = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3992977408000L, 29750);
      return 0;
    }
    GMTrace.o(3992977408000L, 29750);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */