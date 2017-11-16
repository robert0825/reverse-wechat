package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aca
  extends ayx
{
  public int jhc;
  public LinkedList<asb> jhd;
  public int jib;
  public int tPM;
  
  public aca()
  {
    GMTrace.i(3726286782464L, 27763);
    this.jhd = new LinkedList();
    GMTrace.o(3726286782464L, 27763);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3726421000192L, 27764);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      paramVarArgs.fk(4, this.jib);
      paramVarArgs.fk(5, this.tPM);
      GMTrace.o(3726421000192L, 27764);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.c(3, 8, this.jhd);
      int k = b.a.a.a.fh(4, this.jib);
      int m = b.a.a.a.fh(5, this.tPM);
      GMTrace.o(3726421000192L, 27764);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3726421000192L, 27764);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aca localaca = (aca)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3726421000192L, 27764);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaca.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3726421000192L, 27764);
        return 0;
      case 2: 
        localaca.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3726421000192L, 27764);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaca.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3726421000192L, 27764);
        return 0;
      case 4: 
        localaca.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3726421000192L, 27764);
        return 0;
      }
      localaca.tPM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3726421000192L, 27764);
      return 0;
    }
    GMTrace.o(3726421000192L, 27764);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */