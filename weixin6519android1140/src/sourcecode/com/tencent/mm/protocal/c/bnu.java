package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnu
  extends azh
{
  public int tTL;
  public LinkedList<azq> tTO;
  public String uXF;
  public int uqd;
  
  public bnu()
  {
    GMTrace.i(3655688257536L, 27237);
    this.tTO = new LinkedList();
    GMTrace.o(3655688257536L, 27237);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3655822475264L, 27238);
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
      paramVarArgs.fk(2, this.tTL);
      paramVarArgs.fk(3, this.uqd);
      paramVarArgs.d(4, 8, this.tTO);
      if (this.uXF != null) {
        paramVarArgs.e(5, this.uXF);
      }
      GMTrace.o(3655822475264L, 27238);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tTL) + b.a.a.a.fh(3, this.uqd) + b.a.a.a.c(4, 8, this.tTO);
      paramInt = i;
      if (this.uXF != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uXF);
      }
      GMTrace.o(3655822475264L, 27238);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3655822475264L, 27238);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnu localbnu = (bnu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3655822475264L, 27238);
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
          localbnu.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3655822475264L, 27238);
        return 0;
      case 2: 
        localbnu.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3655822475264L, 27238);
        return 0;
      case 3: 
        localbnu.uqd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3655822475264L, 27238);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnu.tTO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3655822475264L, 27238);
        return 0;
      }
      localbnu.uXF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3655822475264L, 27238);
      return 0;
    }
    GMTrace.o(3655822475264L, 27238);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */