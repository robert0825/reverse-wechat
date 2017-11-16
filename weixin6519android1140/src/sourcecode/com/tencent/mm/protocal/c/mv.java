package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mv
  extends azh
{
  public int jhA;
  public awj udA;
  public int udB;
  public boa udy;
  public bmk udz;
  
  public mv()
  {
    GMTrace.i(3801046056960L, 28320);
    GMTrace.o(3801046056960L, 28320);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3801180274688L, 28321);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.udy == null) {
        throw new b("Not all required fields were included: TransRes");
      }
      if (this.udz == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.udA == null) {
        throw new b("Not all required fields were included: QueryCtx");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhA);
      if (this.udy != null)
      {
        paramVarArgs.fm(3, this.udy.aYq());
        this.udy.a(paramVarArgs);
      }
      if (this.udz != null)
      {
        paramVarArgs.fm(4, this.udz.aYq());
        this.udz.a(paramVarArgs);
      }
      if (this.udA != null)
      {
        paramVarArgs.fm(5, this.udA.aYq());
        this.udA.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.udB);
      GMTrace.o(3801180274688L, 28321);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhA);
      paramInt = i;
      if (this.udy != null) {
        paramInt = i + b.a.a.a.fj(3, this.udy.aYq());
      }
      i = paramInt;
      if (this.udz != null) {
        i = paramInt + b.a.a.a.fj(4, this.udz.aYq());
      }
      paramInt = i;
      if (this.udA != null) {
        paramInt = i + b.a.a.a.fj(5, this.udA.aYq());
      }
      i = b.a.a.a.fh(6, this.udB);
      GMTrace.o(3801180274688L, 28321);
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
      if (this.udy == null) {
        throw new b("Not all required fields were included: TransRes");
      }
      if (this.udz == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.udA == null) {
        throw new b("Not all required fields were included: QueryCtx");
      }
      GMTrace.o(3801180274688L, 28321);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mv localmv = (mv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3801180274688L, 28321);
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
          localmv.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3801180274688L, 28321);
        return 0;
      case 2: 
        localmv.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3801180274688L, 28321);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localmv.udy = ((boa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3801180274688L, 28321);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bmk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bmk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localmv.udz = ((bmk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3801180274688L, 28321);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localmv.udA = ((awj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3801180274688L, 28321);
        return 0;
      }
      localmv.udB = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3801180274688L, 28321);
      return 0;
    }
    GMTrace.o(3801180274688L, 28321);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */