package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bno
  extends ayx
{
  public int uME;
  public int uMG;
  public bnw uXz;
  public String uuN;
  
  public bno()
  {
    GMTrace.i(3644816621568L, 27156);
    GMTrace.o(3644816621568L, 27156);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3644950839296L, 27157);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXz == null) {
        throw new b("Not all required fields were included: Piece");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uXz != null)
      {
        paramVarArgs.fm(2, this.uXz.aYq());
        this.uXz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uME);
      paramVarArgs.fk(4, this.uMG);
      if (this.uuN != null) {
        paramVarArgs.e(5, this.uuN);
      }
      GMTrace.o(3644950839296L, 27157);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uXz != null) {
        i = paramInt + b.a.a.a.fj(2, this.uXz.aYq());
      }
      i = i + b.a.a.a.fh(3, this.uME) + b.a.a.a.fh(4, this.uMG);
      paramInt = i;
      if (this.uuN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uuN);
      }
      GMTrace.o(3644950839296L, 27157);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXz == null) {
        throw new b("Not all required fields were included: Piece");
      }
      GMTrace.o(3644950839296L, 27157);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bno localbno = (bno)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3644950839296L, 27157);
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
          localbno.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3644950839296L, 27157);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbno.uXz = ((bnw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3644950839296L, 27157);
        return 0;
      case 3: 
        localbno.uME = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3644950839296L, 27157);
        return 0;
      case 4: 
        localbno.uMG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3644950839296L, 27157);
        return 0;
      }
      localbno.uuN = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3644950839296L, 27157);
      return 0;
    }
    GMTrace.o(3644950839296L, 27157);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */