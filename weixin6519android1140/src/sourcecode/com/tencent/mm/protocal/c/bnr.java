package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnr
  extends azh
{
  public int uME;
  public bnw uMJ;
  public String uXA;
  public int ucS;
  
  public bnr()
  {
    GMTrace.i(3731118620672L, 27799);
    GMTrace.o(3731118620672L, 27799);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3731252838400L, 27800);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uMJ == null) {
        throw new b("Not all required fields were included: NextPiece");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uMJ != null)
      {
        paramVarArgs.fm(2, this.uMJ.aYq());
        this.uMJ.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.ucS);
      paramVarArgs.fk(4, this.uME);
      if (this.uXA != null) {
        paramVarArgs.e(5, this.uXA);
      }
      GMTrace.o(3731252838400L, 27800);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uMJ != null) {
        i = paramInt + b.a.a.a.fj(2, this.uMJ.aYq());
      }
      i = i + b.a.a.a.fh(3, this.ucS) + b.a.a.a.fh(4, this.uME);
      paramInt = i;
      if (this.uXA != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uXA);
      }
      GMTrace.o(3731252838400L, 27800);
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uMJ == null) {
        throw new b("Not all required fields were included: NextPiece");
      }
      GMTrace.o(3731252838400L, 27800);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnr localbnr = (bnr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3731252838400L, 27800);
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
          localbnr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731252838400L, 27800);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbnr.uMJ = ((bnw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731252838400L, 27800);
        return 0;
      case 3: 
        localbnr.ucS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3731252838400L, 27800);
        return 0;
      case 4: 
        localbnr.uME = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3731252838400L, 27800);
        return 0;
      }
      localbnr.uXA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3731252838400L, 27800);
      return 0;
    }
    GMTrace.o(3731252838400L, 27800);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */