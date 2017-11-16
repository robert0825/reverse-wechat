package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zw
  extends azh
{
  public int jhc;
  public LinkedList<rb> jhd;
  public int uqA;
  public String uqB;
  public int uqC;
  
  public zw()
  {
    GMTrace.i(3805877895168L, 28356);
    this.jhd = new LinkedList();
    GMTrace.o(3805877895168L, 28356);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3806012112896L, 28357);
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
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      paramVarArgs.fk(4, this.uqA);
      if (this.uqB != null) {
        paramVarArgs.e(5, this.uqB);
      }
      paramVarArgs.fk(6, this.uqC);
      GMTrace.o(3806012112896L, 28357);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhc) + b.a.a.a.c(3, 8, this.jhd) + b.a.a.a.fh(4, this.uqA);
      paramInt = i;
      if (this.uqB != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uqB);
      }
      i = b.a.a.a.fh(6, this.uqC);
      GMTrace.o(3806012112896L, 28357);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3806012112896L, 28357);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zw localzw = (zw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3806012112896L, 28357);
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
          localzw.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3806012112896L, 28357);
        return 0;
      case 2: 
        localzw.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3806012112896L, 28357);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localzw.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3806012112896L, 28357);
        return 0;
      case 4: 
        localzw.uqA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3806012112896L, 28357);
        return 0;
      case 5: 
        localzw.uqB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3806012112896L, 28357);
        return 0;
      }
      localzw.uqC = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3806012112896L, 28357);
      return 0;
    }
    GMTrace.o(3806012112896L, 28357);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */