package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afc
  extends ayx
{
  public String jhi;
  public azp tUK;
  public int uuP;
  
  public afc()
  {
    GMTrace.i(4051764772864L, 30188);
    GMTrace.o(4051764772864L, 30188);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4051898990592L, 30189);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.uuP);
      if (this.tUK != null)
      {
        paramVarArgs.fm(4, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(4051898990592L, 30189);
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
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      i += b.a.a.a.fh(3, this.uuP);
      paramInt = i;
      if (this.tUK != null) {
        paramInt = i + b.a.a.a.fj(4, this.tUK.aYq());
      }
      GMTrace.o(4051898990592L, 30189);
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
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      GMTrace.o(4051898990592L, 30189);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afc localafc = (afc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4051898990592L, 30189);
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
          localafc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4051898990592L, 30189);
        return 0;
      case 2: 
        localafc.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4051898990592L, 30189);
        return 0;
      case 3: 
        localafc.uuP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4051898990592L, 30189);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localafc.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4051898990592L, 30189);
      return 0;
    }
    GMTrace.o(4051898990592L, 30189);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\afc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */