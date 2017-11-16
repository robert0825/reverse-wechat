package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aum
  extends ayx
{
  public String lTj;
  public int nFi;
  public String tRS;
  public String uJL;
  public String uJM;
  public int uJN;
  
  public aum()
  {
    GMTrace.i(3754472505344L, 27973);
    GMTrace.o(3754472505344L, 27973);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3754606723072L, 27974);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tRS != null) {
        paramVarArgs.e(2, this.tRS);
      }
      if (this.uJL != null) {
        paramVarArgs.e(3, this.uJL);
      }
      if (this.uJM != null) {
        paramVarArgs.e(4, this.uJM);
      }
      paramVarArgs.fk(5, this.nFi);
      if (this.lTj != null) {
        paramVarArgs.e(7, this.lTj);
      }
      paramVarArgs.fk(8, this.uJN);
      GMTrace.o(3754606723072L, 27974);
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
      if (this.tRS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tRS);
      }
      i = paramInt;
      if (this.uJL != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uJL);
      }
      paramInt = i;
      if (this.uJM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uJM);
      }
      i = paramInt + b.a.a.a.fh(5, this.nFi);
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lTj);
      }
      i = b.a.a.a.fh(8, this.uJN);
      GMTrace.o(3754606723072L, 27974);
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
      GMTrace.o(3754606723072L, 27974);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aum localaum = (aum)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 6: 
      default: 
        GMTrace.o(3754606723072L, 27974);
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
          localaum.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3754606723072L, 27974);
        return 0;
      case 2: 
        localaum.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3754606723072L, 27974);
        return 0;
      case 3: 
        localaum.uJL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3754606723072L, 27974);
        return 0;
      case 4: 
        localaum.uJM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3754606723072L, 27974);
        return 0;
      case 5: 
        localaum.nFi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3754606723072L, 27974);
        return 0;
      case 7: 
        localaum.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3754606723072L, 27974);
        return 0;
      }
      localaum.uJN = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3754606723072L, 27974);
      return 0;
    }
    GMTrace.o(3754606723072L, 27974);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */