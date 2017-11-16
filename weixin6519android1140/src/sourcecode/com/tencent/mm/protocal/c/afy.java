package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afy
  extends ayx
{
  public double uvA;
  public double uvB;
  public String uvC;
  public boolean uvD;
  
  public afy()
  {
    GMTrace.i(14306267627520L, 106590);
    GMTrace.o(14306267627520L, 106590);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14306401845248L, 106591);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.uvA);
      paramVarArgs.a(3, this.uvB);
      if (this.uvC != null) {
        paramVarArgs.e(4, this.uvC);
      }
      paramVarArgs.ah(5, this.uvD);
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.uvC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uvC);
      }
      i = b.a.a.b.b.a.cK(5);
      GMTrace.o(14306401845248L, 106591);
      return paramInt + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afy localafy = (afy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14306401845248L, 106591);
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
          localafy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 2: 
        localafy.uvA = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 3: 
        localafy.uvB = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 4: 
        localafy.uvC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      }
      localafy.uvD = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    GMTrace.o(14306401845248L, 106591);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */