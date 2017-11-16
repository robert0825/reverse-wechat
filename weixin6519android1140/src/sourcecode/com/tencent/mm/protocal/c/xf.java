package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xf
  extends azh
{
  public long uoY;
  public com.tencent.mm.bm.b uoZ;
  public apz upa;
  public jy upb;
  
  public xf()
  {
    GMTrace.i(3671928602624L, 27358);
    GMTrace.o(3671928602624L, 27358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3672062820352L, 27359);
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
      paramVarArgs.T(2, this.uoY);
      if (this.uoZ != null) {
        paramVarArgs.b(3, this.uoZ);
      }
      if (this.upa != null)
      {
        paramVarArgs.fm(4, this.upa.aYq());
        this.upa.a(paramVarArgs);
      }
      if (this.upb != null)
      {
        paramVarArgs.fm(5, this.upb.aYq());
        this.upb.a(paramVarArgs);
      }
      GMTrace.o(3672062820352L, 27359);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.uoY);
      paramInt = i;
      if (this.uoZ != null) {
        paramInt = i + b.a.a.a.a(3, this.uoZ);
      }
      i = paramInt;
      if (this.upa != null) {
        i = paramInt + b.a.a.a.fj(4, this.upa.aYq());
      }
      paramInt = i;
      if (this.upb != null) {
        paramInt = i + b.a.a.a.fj(5, this.upb.aYq());
      }
      GMTrace.o(3672062820352L, 27359);
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
      GMTrace.o(3672062820352L, 27359);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xf localxf = (xf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3672062820352L, 27359);
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
          localxf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3672062820352L, 27359);
        return 0;
      case 2: 
        localxf.uoY = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3672062820352L, 27359);
        return 0;
      case 3: 
        localxf.uoZ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3672062820352L, 27359);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxf.upa = ((apz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3672062820352L, 27359);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new jy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((jy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localxf.upb = ((jy)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3672062820352L, 27359);
      return 0;
    }
    GMTrace.o(3672062820352L, 27359);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\xf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */