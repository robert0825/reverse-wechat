package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class rn
  extends ayx
{
  public int tQP;
  public String tVK;
  public b ufH;
  public b uhZ;
  
  public rn()
  {
    GMTrace.i(3767357407232L, 28069);
    GMTrace.o(3767357407232L, 28069);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3767491624960L, 28070);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVK != null) {
        paramVarArgs.e(2, this.tVK);
      }
      paramVarArgs.fk(3, this.tQP);
      if (this.uhZ != null) {
        paramVarArgs.b(4, this.uhZ);
      }
      if (this.ufH != null) {
        paramVarArgs.b(5, this.ufH);
      }
      GMTrace.o(3767491624960L, 28070);
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
      if (this.tVK != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tVK);
      }
      i += b.a.a.a.fh(3, this.tQP);
      paramInt = i;
      if (this.uhZ != null) {
        paramInt = i + b.a.a.a.a(4, this.uhZ);
      }
      i = paramInt;
      if (this.ufH != null) {
        i = paramInt + b.a.a.a.a(5, this.ufH);
      }
      GMTrace.o(3767491624960L, 28070);
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
      GMTrace.o(3767491624960L, 28070);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rn localrn = (rn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3767491624960L, 28070);
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
          localrn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3767491624960L, 28070);
        return 0;
      case 2: 
        localrn.tVK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3767491624960L, 28070);
        return 0;
      case 3: 
        localrn.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3767491624960L, 28070);
        return 0;
      case 4: 
        localrn.uhZ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3767491624960L, 28070);
        return 0;
      }
      localrn.ufH = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3767491624960L, 28070);
      return 0;
    }
    GMTrace.o(3767491624960L, 28070);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */