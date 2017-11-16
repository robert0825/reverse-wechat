package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asi
  extends ayx
{
  public String nFa;
  public int nFi;
  public String nFt;
  public at tYT;
  public int uIo;
  
  public asi()
  {
    GMTrace.i(3930431946752L, 29284);
    GMTrace.o(3930431946752L, 29284);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3930566164480L, 29285);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uIo);
      if (this.nFa != null) {
        paramVarArgs.e(3, this.nFa);
      }
      paramVarArgs.fk(4, this.nFi);
      if (this.nFt != null) {
        paramVarArgs.e(5, this.nFt);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(6, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uIo);
      paramInt = i;
      if (this.nFa != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nFa);
      }
      i = paramInt + b.a.a.a.fh(4, this.nFi);
      paramInt = i;
      if (this.nFt != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nFt);
      }
      i = paramInt;
      if (this.tYT != null) {
        i = paramInt + b.a.a.a.fj(6, this.tYT.aYq());
      }
      GMTrace.o(3930566164480L, 29285);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asi localasi = (asi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3930566164480L, 29285);
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
          localasi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 2: 
        localasi.uIo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 3: 
        localasi.nFa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 4: 
        localasi.nFi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 5: 
        localasi.nFt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localasi.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    GMTrace.o(3930566164480L, 29285);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\asi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */