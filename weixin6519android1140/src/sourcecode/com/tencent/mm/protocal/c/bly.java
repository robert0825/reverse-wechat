package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bly
  extends ayx
{
  public int jhZ;
  public int lQE;
  public String lQa;
  public boolean uVQ;
  
  public bly()
  {
    GMTrace.i(20072663875584L, 149553);
    GMTrace.o(20072663875584L, 149553);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20072798093312L, 149554);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.jhZ);
      paramVarArgs.ah(4, this.uVQ);
      paramVarArgs.fk(5, this.lQE);
      GMTrace.o(20072798093312L, 149554);
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
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      paramInt = b.a.a.a.fh(3, this.jhZ);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.a.fh(5, this.lQE);
      GMTrace.o(20072798093312L, 149554);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20072798093312L, 149554);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bly localbly = (bly)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20072798093312L, 149554);
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
          localbly.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 2: 
        localbly.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 3: 
        localbly.jhZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 4: 
        localbly.uVQ = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      }
      localbly.lQE = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(20072798093312L, 149554);
      return 0;
    }
    GMTrace.o(20072798093312L, 149554);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */