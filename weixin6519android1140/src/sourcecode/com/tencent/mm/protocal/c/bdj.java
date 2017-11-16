package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdj
  extends azh
{
  public int tST;
  public azp tTe;
  public int uPA;
  public int uPy;
  
  public bdj()
  {
    GMTrace.i(3743735087104L, 27893);
    GMTrace.o(3743735087104L, 27893);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3743869304832L, 27894);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tTe != null)
      {
        paramVarArgs.fm(2, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tST);
      paramVarArgs.fk(4, this.uPy);
      paramVarArgs.fk(5, this.uPA);
      GMTrace.o(3743869304832L, 27894);
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
      if (this.tTe != null) {
        i = paramInt + b.a.a.a.fj(2, this.tTe.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.tST);
      int j = b.a.a.a.fh(4, this.uPy);
      int k = b.a.a.a.fh(5, this.uPA);
      GMTrace.o(3743869304832L, 27894);
      return i + paramInt + j + k;
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
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3743869304832L, 27894);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdj localbdj = (bdj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3743869304832L, 27894);
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
          localbdj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3743869304832L, 27894);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdj.tTe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3743869304832L, 27894);
        return 0;
      case 3: 
        localbdj.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3743869304832L, 27894);
        return 0;
      case 4: 
        localbdj.uPy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3743869304832L, 27894);
        return 0;
      }
      localbdj.uPA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3743869304832L, 27894);
      return 0;
    }
    GMTrace.o(3743869304832L, 27894);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */