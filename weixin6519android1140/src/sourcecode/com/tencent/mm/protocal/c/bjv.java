package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjv
  extends azh
{
  public int eGy;
  public String eGz;
  public String uUI;
  public String uUJ;
  public bdv uUK;
  public int version;
  
  public bjv()
  {
    GMTrace.i(3851914575872L, 28699);
    GMTrace.o(3851914575872L, 28699);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3852048793600L, 28700);
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
      paramVarArgs.fk(2, this.eGy);
      if (this.eGz != null) {
        paramVarArgs.e(3, this.eGz);
      }
      if (this.uUI != null) {
        paramVarArgs.e(4, this.uUI);
      }
      if (this.uUJ != null) {
        paramVarArgs.e(5, this.uUJ);
      }
      if (this.uUK != null)
      {
        paramVarArgs.fm(6, this.uUK.aYq());
        this.uUK.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.version);
      GMTrace.o(3852048793600L, 28700);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.eGy);
      paramInt = i;
      if (this.eGz != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eGz);
      }
      i = paramInt;
      if (this.uUI != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uUI);
      }
      paramInt = i;
      if (this.uUJ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uUJ);
      }
      i = paramInt;
      if (this.uUK != null) {
        i = paramInt + b.a.a.a.fj(6, this.uUK.aYq());
      }
      paramInt = b.a.a.a.fh(7, this.version);
      GMTrace.o(3852048793600L, 28700);
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
      GMTrace.o(3852048793600L, 28700);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjv localbjv = (bjv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3852048793600L, 28700);
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
          localbjv.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3852048793600L, 28700);
        return 0;
      case 2: 
        localbjv.eGy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3852048793600L, 28700);
        return 0;
      case 3: 
        localbjv.eGz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3852048793600L, 28700);
        return 0;
      case 4: 
        localbjv.uUI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3852048793600L, 28700);
        return 0;
      case 5: 
        localbjv.uUJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3852048793600L, 28700);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbjv.uUK = ((bdv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3852048793600L, 28700);
        return 0;
      }
      localbjv.version = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3852048793600L, 28700);
      return 0;
    }
    GMTrace.o(3852048793600L, 28700);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */