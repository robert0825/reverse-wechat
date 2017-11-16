package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gf
  extends ayx
{
  public int tSK;
  public String tUq;
  public int tUr;
  
  public gf()
  {
    GMTrace.i(3661593837568L, 27281);
    GMTrace.o(3661593837568L, 27281);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3661728055296L, 27282);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tSK);
      if (this.tUq != null) {
        paramVarArgs.e(3, this.tUq);
      }
      paramVarArgs.fk(4, this.tUr);
      GMTrace.o(3661728055296L, 27282);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tSK);
      paramInt = i;
      if (this.tUq != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tUq);
      }
      i = b.a.a.a.fh(4, this.tUr);
      GMTrace.o(3661728055296L, 27282);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3661728055296L, 27282);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gf localgf = (gf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3661728055296L, 27282);
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
          localgf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3661728055296L, 27282);
        return 0;
      case 2: 
        localgf.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3661728055296L, 27282);
        return 0;
      case 3: 
        localgf.tUq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3661728055296L, 27282);
        return 0;
      }
      localgf.tUr = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3661728055296L, 27282);
      return 0;
    }
    GMTrace.o(3661728055296L, 27282);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */