package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class na
  extends com.tencent.mm.bm.a
  implements bed
{
  public int tST;
  public int udL;
  public int udM;
  public int udN;
  public LinkedList<bhp> udO;
  public LinkedList<bhp> udP;
  public LinkedList<bhp> udQ;
  public int udR;
  public int udS;
  public int udT;
  public ahj udU;
  
  public na()
  {
    GMTrace.i(13097771204608L, 97586);
    this.udO = new LinkedList();
    this.udP = new LinkedList();
    this.udQ = new LinkedList();
    GMTrace.o(13097771204608L, 97586);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13098039640064L, 97588);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.udL);
      paramVarArgs.fk(3, this.udM);
      paramVarArgs.fk(4, this.udN);
      paramVarArgs.d(5, 8, this.udO);
      paramVarArgs.d(6, 8, this.udP);
      paramVarArgs.d(7, 8, this.udQ);
      paramVarArgs.fk(8, this.udR);
      paramVarArgs.fk(9, this.udS);
      paramVarArgs.fk(10, this.udT);
      if (this.udU != null)
      {
        paramVarArgs.fm(11, this.udU.aYq());
        this.udU.a(paramVarArgs);
      }
      GMTrace.o(13098039640064L, 97588);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0 + b.a.a.a.fh(2, this.udL) + b.a.a.a.fh(3, this.udM) + b.a.a.a.fh(4, this.udN) + b.a.a.a.c(5, 8, this.udO) + b.a.a.a.c(6, 8, this.udP) + b.a.a.a.c(7, 8, this.udQ) + b.a.a.a.fh(8, this.udR) + b.a.a.a.fh(9, this.udS) + b.a.a.a.fh(10, this.udT);
      paramInt = i;
      if (this.udU != null) {
        paramInt = i + b.a.a.a.fj(11, this.udU.aYq());
      }
      GMTrace.o(13098039640064L, 97588);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.udO.clear();
      this.udP.clear();
      this.udQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13098039640064L, 97588);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      na localna = (na)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13098039640064L, 97588);
        return -1;
      case 1: 
        localna.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 2: 
        localna.udL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 3: 
        localna.udM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 4: 
        localna.udN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localna.udO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localna.udP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localna.udQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 8: 
        localna.udR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 9: 
        localna.udS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      case 10: 
        localna.udT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098039640064L, 97588);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ahj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ahj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localna.udU = ((ahj)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13098039640064L, 97588);
      return 0;
    }
    GMTrace.o(13098039640064L, 97588);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(13097905422336L, 97587);
    int i = this.tST;
    GMTrace.o(13097905422336L, 97587);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */