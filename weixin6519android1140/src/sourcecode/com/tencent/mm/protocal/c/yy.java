package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yy
  extends azh
{
  public int jhA;
  public int upO;
  public int upP;
  public int upQ;
  public int upR;
  public String upS;
  public int upT;
  
  public yy()
  {
    GMTrace.i(3855135801344L, 28723);
    GMTrace.o(3855135801344L, 28723);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855270019072L, 28724);
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
      paramVarArgs.fk(2, this.jhA);
      paramVarArgs.fk(3, this.upO);
      paramVarArgs.fk(4, this.upP);
      paramVarArgs.fk(5, this.upQ);
      paramVarArgs.fk(6, this.upR);
      if (this.upS != null) {
        paramVarArgs.e(7, this.upS);
      }
      paramVarArgs.fk(8, this.upT);
      GMTrace.o(3855270019072L, 28724);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhA) + b.a.a.a.fh(3, this.upO) + b.a.a.a.fh(4, this.upP) + b.a.a.a.fh(5, this.upQ) + b.a.a.a.fh(6, this.upR);
      paramInt = i;
      if (this.upS != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.upS);
      }
      i = b.a.a.a.fh(8, this.upT);
      GMTrace.o(3855270019072L, 28724);
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
      GMTrace.o(3855270019072L, 28724);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yy localyy = (yy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3855270019072L, 28724);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localyy.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 2: 
        localyy.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 3: 
        localyy.upO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 4: 
        localyy.upP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 5: 
        localyy.upQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 6: 
        localyy.upR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      case 7: 
        localyy.upS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3855270019072L, 28724);
        return 0;
      }
      localyy.upT = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3855270019072L, 28724);
      return 0;
    }
    GMTrace.o(3855270019072L, 28724);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\yy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */