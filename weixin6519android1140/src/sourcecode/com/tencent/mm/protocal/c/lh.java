package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lh
  extends ayx
{
  public String mhU;
  public String nDt;
  public String ubZ;
  public String uca;
  
  public lh()
  {
    GMTrace.i(20857971802112L, 155404);
    GMTrace.o(20857971802112L, 155404);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20858106019840L, 155405);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ubZ != null) {
        paramVarArgs.e(2, this.ubZ);
      }
      if (this.uca != null) {
        paramVarArgs.e(3, this.uca);
      }
      if (this.mhU != null) {
        paramVarArgs.e(4, this.mhU);
      }
      if (this.nDt != null) {
        paramVarArgs.e(5, this.nDt);
      }
      GMTrace.o(20858106019840L, 155405);
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
      if (this.ubZ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ubZ);
      }
      i = paramInt;
      if (this.uca != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uca);
      }
      paramInt = i;
      if (this.mhU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mhU);
      }
      i = paramInt;
      if (this.nDt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.nDt);
      }
      GMTrace.o(20858106019840L, 155405);
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
      GMTrace.o(20858106019840L, 155405);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lh locallh = (lh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20858106019840L, 155405);
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
          locallh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20858106019840L, 155405);
        return 0;
      case 2: 
        locallh.ubZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20858106019840L, 155405);
        return 0;
      case 3: 
        locallh.uca = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20858106019840L, 155405);
        return 0;
      case 4: 
        locallh.mhU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20858106019840L, 155405);
        return 0;
      }
      locallh.nDt = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20858106019840L, 155405);
      return 0;
    }
    GMTrace.o(20858106019840L, 155405);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */