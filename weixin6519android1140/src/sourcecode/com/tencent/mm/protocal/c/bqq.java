package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqq
  extends com.tencent.mm.bm.a
{
  public azp tQa;
  public String tVe;
  public azp tVi;
  public String vaA;
  
  public bqq()
  {
    GMTrace.i(13574109921280L, 101135);
    GMTrace.o(13574109921280L, 101135);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13574244139008L, 101136);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVi == null) {
        throw new b("Not all required fields were included: KSid");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.vaA != null) {
        paramVarArgs.e(1, this.vaA);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(2, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      if (this.tVe != null) {
        paramVarArgs.e(3, this.tVe);
      }
      if (this.tQa != null)
      {
        paramVarArgs.fm(4, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      GMTrace.o(13574244139008L, 101136);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.vaA != null) {
        i = b.a.a.b.b.a.f(1, this.vaA) + 0;
      }
      paramInt = i;
      if (this.tVi != null) {
        paramInt = i + b.a.a.a.fj(2, this.tVi.aYq());
      }
      i = paramInt;
      if (this.tVe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVe);
      }
      paramInt = i;
      if (this.tQa != null) {
        paramInt = i + b.a.a.a.fj(4, this.tQa.aYq());
      }
      GMTrace.o(13574244139008L, 101136);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tVi == null) {
        throw new b("Not all required fields were included: KSid");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(13574244139008L, 101136);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqq localbqq = (bqq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13574244139008L, 101136);
        return -1;
      case 1: 
        localbqq.vaA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13574244139008L, 101136);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbqq.tVi = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13574244139008L, 101136);
        return 0;
      case 3: 
        localbqq.tVe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13574244139008L, 101136);
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
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbqq.tQa = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13574244139008L, 101136);
      return 0;
    }
    GMTrace.o(13574244139008L, 101136);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */