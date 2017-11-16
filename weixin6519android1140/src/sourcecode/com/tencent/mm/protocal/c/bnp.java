package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnp
  extends azh
{
  public int uME;
  public bnw uMJ;
  public int ucS;
  
  public bnp()
  {
    GMTrace.i(3777289519104L, 28143);
    GMTrace.o(3777289519104L, 28143);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777423736832L, 28144);
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
      GMTrace.o(3777423736832L, 28144);
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
      paramInt = b.a.a.a.fh(3, this.ucS);
      int j = b.a.a.a.fh(4, this.uME);
      GMTrace.o(3777423736832L, 28144);
      return i + paramInt + j;
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
      GMTrace.o(3777423736832L, 28144);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnp localbnp = (bnp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3777423736832L, 28144);
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
          localbnp.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777423736832L, 28144);
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
          localbnp.uMJ = ((bnw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777423736832L, 28144);
        return 0;
      case 3: 
        localbnp.ucS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3777423736832L, 28144);
        return 0;
      }
      localbnp.uME = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3777423736832L, 28144);
      return 0;
    }
    GMTrace.o(3777423736832L, 28144);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bnp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */