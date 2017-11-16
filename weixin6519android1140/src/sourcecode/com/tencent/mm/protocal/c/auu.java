package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auu
  extends ayx
{
  public String uKi;
  public String uKj;
  public String uKk;
  public String uKl;
  public String uKm;
  public int uKn;
  
  public auu()
  {
    GMTrace.i(3986400739328L, 29701);
    GMTrace.o(3986400739328L, 29701);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3986534957056L, 29702);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKi != null) {
        paramVarArgs.e(2, this.uKi);
      }
      if (this.uKj != null) {
        paramVarArgs.e(3, this.uKj);
      }
      if (this.uKk != null) {
        paramVarArgs.e(4, this.uKk);
      }
      if (this.uKl != null) {
        paramVarArgs.e(5, this.uKl);
      }
      if (this.uKm != null) {
        paramVarArgs.e(6, this.uKm);
      }
      paramVarArgs.fk(7, this.uKn);
      GMTrace.o(3986534957056L, 29702);
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
      if (this.uKi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uKi);
      }
      i = paramInt;
      if (this.uKj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uKj);
      }
      paramInt = i;
      if (this.uKk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uKk);
      }
      i = paramInt;
      if (this.uKl != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uKl);
      }
      paramInt = i;
      if (this.uKm != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uKm);
      }
      i = b.a.a.a.fh(7, this.uKn);
      GMTrace.o(3986534957056L, 29702);
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
      GMTrace.o(3986534957056L, 29702);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auu localauu = (auu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3986534957056L, 29702);
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
          localauu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 2: 
        localauu.uKi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 3: 
        localauu.uKj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 4: 
        localauu.uKk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 5: 
        localauu.uKl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      case 6: 
        localauu.uKm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3986534957056L, 29702);
        return 0;
      }
      localauu.uKn = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3986534957056L, 29702);
      return 0;
    }
    GMTrace.o(3986534957056L, 29702);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\auu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */