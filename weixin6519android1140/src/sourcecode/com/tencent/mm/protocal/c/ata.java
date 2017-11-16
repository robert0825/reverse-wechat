package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class ata
  extends ayx
{
  public int tMZ;
  public at tYT;
  public String uIT;
  public String uIU;
  public b uIV;
  public int uIW;
  public int uIX;
  
  public ata()
  {
    GMTrace.i(3874731589632L, 28869);
    GMTrace.o(3874731589632L, 28869);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3874865807360L, 28870);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uIT != null) {
        paramVarArgs.e(2, this.uIT);
      }
      if (this.uIU != null) {
        paramVarArgs.e(3, this.uIU);
      }
      if (this.uIV != null) {
        paramVarArgs.b(4, this.uIV);
      }
      paramVarArgs.fk(5, this.uIW);
      paramVarArgs.fk(6, this.tMZ);
      paramVarArgs.fk(7, this.uIX);
      if (this.tYT != null)
      {
        paramVarArgs.fm(8, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uIT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uIT);
      }
      i = paramInt;
      if (this.uIU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uIU);
      }
      paramInt = i;
      if (this.uIV != null) {
        paramInt = i + b.a.a.a.a(4, this.uIV);
      }
      i = paramInt + b.a.a.a.fh(5, this.uIW) + b.a.a.a.fh(6, this.tMZ) + b.a.a.a.fh(7, this.uIX);
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(8, this.tYT.aYq());
      }
      GMTrace.o(3874865807360L, 28870);
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
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ata localata = (ata)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3874865807360L, 28870);
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
          localata.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 2: 
        localata.uIT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 3: 
        localata.uIU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 4: 
        localata.uIV = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 5: 
        localata.uIW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 6: 
        localata.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 7: 
        localata.uIX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874865807360L, 28870);
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
        localata.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    GMTrace.o(3874865807360L, 28870);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */