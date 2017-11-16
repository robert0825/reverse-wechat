package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bop
  extends azh
{
  public int mjQ;
  public int mjW;
  public int mjX;
  public int mkb;
  public LinkedList<boj> tSO;
  public com.tencent.mm.bm.b uKu;
  public int uYD;
  public int uYE;
  public int uYF;
  public int uYG;
  public LinkedList<boj> uYH;
  public long uYy;
  public long uhV;
  
  public bop()
  {
    GMTrace.i(3679310577664L, 27413);
    this.tSO = new LinkedList();
    this.uYH = new LinkedList();
    GMTrace.o(3679310577664L, 27413);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3679444795392L, 27414);
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
      paramVarArgs.d(4, 8, this.tSO);
      paramVarArgs.fk(5, this.uYD);
      paramVarArgs.fk(6, this.mjW);
      paramVarArgs.fk(7, this.mjX);
      paramVarArgs.fk(8, this.mjQ);
      paramVarArgs.fk(9, this.mkb);
      paramVarArgs.fk(10, this.uYE);
      paramVarArgs.fk(11, this.uYF);
      if (this.uKu != null) {
        paramVarArgs.b(12, this.uKu);
      }
      paramVarArgs.fk(13, this.uYG);
      paramVarArgs.d(14, 8, this.uYH);
      GMTrace.o(3679444795392L, 27414);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.uYy) + b.a.a.a.S(3, this.uhV) + b.a.a.a.c(4, 8, this.tSO) + b.a.a.a.fh(5, this.uYD) + b.a.a.a.fh(6, this.mjW) + b.a.a.a.fh(7, this.mjX) + b.a.a.a.fh(8, this.mjQ) + b.a.a.a.fh(9, this.mkb) + b.a.a.a.fh(10, this.uYE) + b.a.a.a.fh(11, this.uYF);
      paramInt = i;
      if (this.uKu != null) {
        paramInt = i + b.a.a.a.a(12, this.uKu);
      }
      i = b.a.a.a.fh(13, this.uYG);
      int j = b.a.a.a.c(14, 8, this.uYH);
      GMTrace.o(3679444795392L, 27414);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      this.uYH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3679444795392L, 27414);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bop localbop = (bop)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3679444795392L, 27414);
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
          localbop.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 2: 
        localbop.uYy = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 3: 
        localbop.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbop.tSO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 5: 
        localbop.uYD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 6: 
        localbop.mjW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 7: 
        localbop.mjX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 8: 
        localbop.mjQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 9: 
        localbop.mkb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 10: 
        localbop.uYE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 11: 
        localbop.uYF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 12: 
        localbop.uKu = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      case 13: 
        localbop.uYG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679444795392L, 27414);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new boj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((boj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbop.uYH.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3679444795392L, 27414);
      return 0;
    }
    GMTrace.o(3679444795392L, 27414);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */