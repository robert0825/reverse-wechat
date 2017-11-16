package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfw
  extends com.tencent.mm.bm.a
{
  public int uNp;
  public int uRG;
  public LinkedList<bfd> uRH;
  public int uRI;
  public int uRJ;
  
  public bfw()
  {
    GMTrace.i(3696356229120L, 27540);
    this.uRH = new LinkedList();
    GMTrace.o(3696356229120L, 27540);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3696490446848L, 27541);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uRG);
      paramVarArgs.d(2, 8, this.uRH);
      paramVarArgs.fk(3, this.uRI);
      paramVarArgs.fk(4, this.uNp);
      paramVarArgs.fk(5, this.uRJ);
      GMTrace.o(3696490446848L, 27541);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uRG);
      i = b.a.a.a.c(2, 8, this.uRH);
      int j = b.a.a.a.fh(3, this.uRI);
      int k = b.a.a.a.fh(4, this.uNp);
      int m = b.a.a.a.fh(5, this.uRJ);
      GMTrace.o(3696490446848L, 27541);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uRH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3696490446848L, 27541);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfw localbfw = (bfw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3696490446848L, 27541);
        return -1;
      case 1: 
        localbfw.uRG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696490446848L, 27541);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bfd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfw.uRH.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3696490446848L, 27541);
        return 0;
      case 3: 
        localbfw.uRI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696490446848L, 27541);
        return 0;
      case 4: 
        localbfw.uNp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3696490446848L, 27541);
        return 0;
      }
      localbfw.uRJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3696490446848L, 27541);
      return 0;
    }
    GMTrace.o(3696490446848L, 27541);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */