package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class if
  extends azh
{
  public int jzH;
  public String jzI;
  public com.tencent.mm.bm.b tXf;
  public iw tXh;
  
  public if()
  {
    GMTrace.i(19143474544640L, 142630);
    GMTrace.o(19143474544640L, 142630);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19143608762368L, 142631);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.tXh != null)
      {
        paramVarArgs.fm(4, this.tXh.aYq());
        this.tXh.a(paramVarArgs);
      }
      if (this.tXf != null) {
        paramVarArgs.b(5, this.tXf);
      }
      GMTrace.o(19143608762368L, 142631);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.tXh != null) {
        i = paramInt + b.a.a.a.fj(4, this.tXh.aYq());
      }
      paramInt = i;
      if (this.tXf != null) {
        paramInt = i + b.a.a.a.a(5, this.tXf);
      }
      GMTrace.o(19143608762368L, 142631);
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
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19143608762368L, 142631);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      if localif = (if)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19143608762368L, 142631);
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
          localif.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19143608762368L, 142631);
        return 0;
      case 2: 
        localif.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19143608762368L, 142631);
        return 0;
      case 3: 
        localif.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19143608762368L, 142631);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localif.tXh = ((iw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19143608762368L, 142631);
        return 0;
      }
      localif.tXf = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(19143608762368L, 142631);
      return 0;
    }
    GMTrace.o(19143608762368L, 142631);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\if.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */