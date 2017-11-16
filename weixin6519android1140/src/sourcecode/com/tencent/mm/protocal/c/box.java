package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class box
  extends azh
{
  public int uYI;
  public int uYJ;
  public int uYK;
  public int uYL;
  public com.tencent.mm.bm.b uYM;
  public long uYy;
  public long uhV;
  
  public box()
  {
    GMTrace.i(3970965700608L, 29586);
    GMTrace.o(3970965700608L, 29586);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3971099918336L, 29587);
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
      paramVarArgs.T(2, this.uYy);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uYI);
      paramVarArgs.fk(5, this.uYJ);
      paramVarArgs.fk(6, this.uYK);
      paramVarArgs.fk(7, this.uYL);
      if (this.uYM != null) {
        paramVarArgs.b(8, this.uYM);
      }
      GMTrace.o(3971099918336L, 29587);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.uYy) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.uYI) + b.a.a.a.fh(5, this.uYJ) + b.a.a.a.fh(6, this.uYK) + b.a.a.a.fh(7, this.uYL);
      paramInt = i;
      if (this.uYM != null) {
        paramInt = i + b.a.a.a.a(8, this.uYM);
      }
      GMTrace.o(3971099918336L, 29587);
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
      GMTrace.o(3971099918336L, 29587);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      box localbox = (box)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3971099918336L, 29587);
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
          localbox.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 2: 
        localbox.uYy = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 3: 
        localbox.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 4: 
        localbox.uYI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 5: 
        localbox.uYJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 6: 
        localbox.uYK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      case 7: 
        localbox.uYL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3971099918336L, 29587);
        return 0;
      }
      localbox.uYM = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3971099918336L, 29587);
      return 0;
    }
    GMTrace.o(3971099918336L, 29587);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\box.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */