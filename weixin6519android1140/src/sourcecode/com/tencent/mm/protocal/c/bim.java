package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bim
  extends ayx
{
  public int tOG;
  public int tPN;
  public int uhU;
  public long uhV;
  public int und;
  
  public bim()
  {
    GMTrace.i(3857551720448L, 28741);
    GMTrace.o(3857551720448L, 28741);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3857685938176L, 28742);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.und);
      paramVarArgs.fk(5, this.tPN);
      paramVarArgs.fk(6, this.tOG);
      GMTrace.o(3857685938176L, 28742);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uhU);
      int j = b.a.a.a.S(3, this.uhV);
      int k = b.a.a.a.fh(4, this.und);
      int m = b.a.a.a.fh(5, this.tPN);
      int n = b.a.a.a.fh(6, this.tOG);
      GMTrace.o(3857685938176L, 28742);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3857685938176L, 28742);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bim localbim = (bim)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3857685938176L, 28742);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbim.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3857685938176L, 28742);
        return 0;
      case 2: 
        localbim.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3857685938176L, 28742);
        return 0;
      case 3: 
        localbim.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3857685938176L, 28742);
        return 0;
      case 4: 
        localbim.und = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3857685938176L, 28742);
        return 0;
      case 5: 
        localbim.tPN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3857685938176L, 28742);
        return 0;
      }
      localbim.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3857685938176L, 28742);
      return 0;
    }
    GMTrace.o(3857685938176L, 28742);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */