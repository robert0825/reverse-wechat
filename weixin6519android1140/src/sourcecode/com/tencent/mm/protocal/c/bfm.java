package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfm
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int uRj;
  public azq uRk;
  
  public bfm()
  {
    GMTrace.i(3637568864256L, 27102);
    GMTrace.o(3637568864256L, 27102);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3637703081984L, 27103);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uRj);
      if (this.uRk != null)
      {
        paramVarArgs.fm(2, this.uRk.aYq());
        this.uRk.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tOG);
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uRj) + 0;
      paramInt = i;
      if (this.uRk != null) {
        paramInt = i + b.a.a.a.fj(2, this.uRk.aYq());
      }
      i = b.a.a.a.fh(3, this.tOG);
      GMTrace.o(3637703081984L, 27103);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfm localbfm = (bfm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3637703081984L, 27103);
        return -1;
      case 1: 
        localbfm.uRj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3637703081984L, 27103);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfm.uRk = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3637703081984L, 27103);
        return 0;
      }
      localbfm.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    GMTrace.o(3637703081984L, 27103);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */