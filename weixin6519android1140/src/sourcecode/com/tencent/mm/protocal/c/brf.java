package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brf
  extends ayx
{
  public String eQb;
  public int vaT;
  public String vaX;
  public String vaY;
  public String vbe;
  
  public brf()
  {
    GMTrace.i(3867752267776L, 28817);
    GMTrace.o(3867752267776L, 28817);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3867886485504L, 28818);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eQb != null) {
        paramVarArgs.e(2, this.eQb);
      }
      paramVarArgs.fk(3, this.vaT);
      if (this.vaX != null) {
        paramVarArgs.e(99, this.vaX);
      }
      if (this.vaY != null) {
        paramVarArgs.e(100, this.vaY);
      }
      if (this.vbe != null) {
        paramVarArgs.e(101, this.vbe);
      }
      GMTrace.o(3867886485504L, 28818);
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
      if (this.eQb != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eQb);
      }
      i += b.a.a.a.fh(3, this.vaT);
      paramInt = i;
      if (this.vaX != null) {
        paramInt = i + b.a.a.b.b.a.f(99, this.vaX);
      }
      i = paramInt;
      if (this.vaY != null) {
        i = paramInt + b.a.a.b.b.a.f(100, this.vaY);
      }
      paramInt = i;
      if (this.vbe != null) {
        paramInt = i + b.a.a.b.b.a.f(101, this.vbe);
      }
      GMTrace.o(3867886485504L, 28818);
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
      GMTrace.o(3867886485504L, 28818);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brf localbrf = (brf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3867886485504L, 28818);
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
          localbrf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3867886485504L, 28818);
        return 0;
      case 2: 
        localbrf.eQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3867886485504L, 28818);
        return 0;
      case 3: 
        localbrf.vaT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3867886485504L, 28818);
        return 0;
      case 99: 
        localbrf.vaX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3867886485504L, 28818);
        return 0;
      case 100: 
        localbrf.vaY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3867886485504L, 28818);
        return 0;
      }
      localbrf.vbe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3867886485504L, 28818);
      return 0;
    }
    GMTrace.o(3867886485504L, 28818);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */