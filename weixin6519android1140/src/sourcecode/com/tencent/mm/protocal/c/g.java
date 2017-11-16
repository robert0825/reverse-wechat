package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends azh
{
  public int jWs;
  public String jWt;
  public String tLZ;
  public String tMb;
  public y tMh;
  
  public g()
  {
    GMTrace.i(3898756562944L, 29048);
    this.jWs = 268513600;
    this.jWt = "请求不成功，请稍候再试";
    GMTrace.o(3898756562944L, 29048);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3898890780672L, 29049);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.tLZ != null) {
        paramVarArgs.e(4, this.tLZ);
      }
      if (this.tMb != null) {
        paramVarArgs.e(5, this.tMb);
      }
      if (this.tMh != null)
      {
        paramVarArgs.fm(6, this.tMh.aYq());
        this.tMh.a(paramVarArgs);
      }
      GMTrace.o(3898890780672L, 29049);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.tLZ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tLZ);
      }
      paramInt = i;
      if (this.tMb != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMb);
      }
      i = paramInt;
      if (this.tMh != null) {
        i = paramInt + b.a.a.a.fj(6, this.tMh.aYq());
      }
      GMTrace.o(3898890780672L, 29049);
      return i;
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
      GMTrace.o(3898890780672L, 29049);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3898890780672L, 29049);
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
          localg.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3898890780672L, 29049);
        return 0;
      case 2: 
        localg.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3898890780672L, 29049);
        return 0;
      case 3: 
        localg.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3898890780672L, 29049);
        return 0;
      case 4: 
        localg.tLZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3898890780672L, 29049);
        return 0;
      case 5: 
        localg.tMb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3898890780672L, 29049);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new y();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((y)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localg.tMh = ((y)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3898890780672L, 29049);
      return 0;
    }
    GMTrace.o(3898890780672L, 29049);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */