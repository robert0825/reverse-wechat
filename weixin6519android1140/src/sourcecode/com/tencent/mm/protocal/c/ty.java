package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ty
  extends com.tencent.mm.bm.a
  implements bed
{
  public int tST;
  public int tXv;
  public azp tZA;
  public nl tZD;
  
  public ty()
  {
    GMTrace.i(3662399143936L, 27287);
    GMTrace.o(3662399143936L, 27287);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3662667579392L, 27289);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tZD == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      paramVarArgs.fk(1, this.tST);
      if (this.tZD != null)
      {
        paramVarArgs.fm(2, this.tZD.aYq());
        this.tZD.a(paramVarArgs);
      }
      if (this.tZA != null)
      {
        paramVarArgs.fm(3, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tXv);
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tZD != null) {
        paramInt = i + b.a.a.a.fj(2, this.tZD.aYq());
      }
      i = paramInt;
      if (this.tZA != null) {
        i = paramInt + b.a.a.a.fj(3, this.tZA.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.tXv);
      GMTrace.o(3662667579392L, 27289);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tZD == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ty localty = (ty)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3662667579392L, 27289);
        return -1;
      case 1: 
        localty.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3662667579392L, 27289);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localty.tZD = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3662667579392L, 27289);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localty.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3662667579392L, 27289);
        return 0;
      }
      localty.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3662667579392L, 27289);
      return 0;
    }
    GMTrace.o(3662667579392L, 27289);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(3662533361664L, 27288);
    int i = this.tST;
    GMTrace.o(3662533361664L, 27288);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */