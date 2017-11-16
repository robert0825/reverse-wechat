package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class og
  extends azh
{
  public String rcG;
  public LinkedList<jl> ufh;
  public int ufi;
  public int ufj;
  public int version;
  
  public og()
  {
    GMTrace.i(3943048413184L, 29378);
    this.ufh = new LinkedList();
    GMTrace.o(3943048413184L, 29378);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3943182630912L, 29379);
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
      paramVarArgs.d(2, 8, this.ufh);
      paramVarArgs.fk(3, this.version);
      paramVarArgs.fk(4, this.ufi);
      paramVarArgs.fk(5, this.ufj);
      if (this.rcG != null) {
        paramVarArgs.e(6, this.rcG);
      }
      GMTrace.o(3943182630912L, 29379);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.ufh) + b.a.a.a.fh(3, this.version) + b.a.a.a.fh(4, this.ufi) + b.a.a.a.fh(5, this.ufj);
      paramInt = i;
      if (this.rcG != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.rcG);
      }
      GMTrace.o(3943182630912L, 29379);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ufh.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3943182630912L, 29379);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      og localog = (og)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3943182630912L, 29379);
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
          localog.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3943182630912L, 29379);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localog.ufh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3943182630912L, 29379);
        return 0;
      case 3: 
        localog.version = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3943182630912L, 29379);
        return 0;
      case 4: 
        localog.ufi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3943182630912L, 29379);
        return 0;
      case 5: 
        localog.ufj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3943182630912L, 29379);
        return 0;
      }
      localog.rcG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3943182630912L, 29379);
      return 0;
    }
    GMTrace.o(3943182630912L, 29379);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\og.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */