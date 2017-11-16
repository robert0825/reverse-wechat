package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqk
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int tST;
  public int tXv;
  public azp tZA;
  public nl tZD;
  public int uGG;
  public int uGH;
  
  public aqk()
  {
    GMTrace.i(13585115774976L, 101217);
    GMTrace.o(13585115774976L, 101217);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13585249992704L, 101218);
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
      paramVarArgs.fk(3, this.tXv);
      if (this.tZA != null)
      {
        paramVarArgs.fm(4, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.jhA);
      paramVarArgs.fk(6, this.uGG);
      paramVarArgs.fk(7, this.uGH);
      GMTrace.o(13585249992704L, 101218);
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
      i = paramInt + b.a.a.a.fh(3, this.tXv);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(4, this.tZA.aYq());
      }
      i = b.a.a.a.fh(5, this.jhA);
      int j = b.a.a.a.fh(6, this.uGG);
      int k = b.a.a.a.fh(7, this.uGH);
      GMTrace.o(13585249992704L, 101218);
      return paramInt + i + j + k;
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
      GMTrace.o(13585249992704L, 101218);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqk localaqk = (aqk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13585249992704L, 101218);
        return -1;
      case 1: 
        localaqk.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13585249992704L, 101218);
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
          localaqk.tZD = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13585249992704L, 101218);
        return 0;
      case 3: 
        localaqk.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13585249992704L, 101218);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaqk.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13585249992704L, 101218);
        return 0;
      case 5: 
        localaqk.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13585249992704L, 101218);
        return 0;
      case 6: 
        localaqk.uGG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13585249992704L, 101218);
        return 0;
      }
      localaqk.uGH = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13585249992704L, 101218);
      return 0;
    }
    GMTrace.o(13585249992704L, 101218);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */