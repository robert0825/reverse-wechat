package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zz
  extends com.tencent.mm.bm.a
{
  public azp tQz;
  public String tRS;
  
  public zz()
  {
    GMTrace.i(3717965283328L, 27701);
    GMTrace.o(3717965283328L, 27701);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3718099501056L, 27702);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRS == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.tRS != null) {
        paramVarArgs.e(1, this.tRS);
      }
      if (this.tQz != null)
      {
        paramVarArgs.fm(2, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      GMTrace.o(3718099501056L, 27702);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tRS != null) {
        paramInt = b.a.a.b.b.a.f(1, this.tRS) + 0;
      }
      i = paramInt;
      if (this.tQz != null) {
        i = paramInt + b.a.a.a.fj(2, this.tQz.aYq());
      }
      GMTrace.o(3718099501056L, 27702);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tRS == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3718099501056L, 27702);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zz localzz = (zz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3718099501056L, 27702);
        return -1;
      case 1: 
        localzz.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3718099501056L, 27702);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localzz.tQz = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3718099501056L, 27702);
      return 0;
    }
    GMTrace.o(3718099501056L, 27702);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */