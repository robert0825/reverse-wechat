package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asb
  extends com.tencent.mm.bm.a
{
  public int jhV;
  public int jia;
  public String lPi;
  public int lSW;
  public azp tQO;
  public azp uHZ;
  public String ugy;
  public String uhe;
  
  public asb()
  {
    GMTrace.i(3918083915776L, 29192);
    GMTrace.o(3918083915776L, 29192);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3918218133504L, 29193);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lSW);
      paramVarArgs.fk(2, this.jia);
      if (this.lPi != null) {
        paramVarArgs.e(3, this.lPi);
      }
      paramVarArgs.fk(4, this.jhV);
      if (this.tQO != null)
      {
        paramVarArgs.fm(5, this.tQO.aYq());
        this.tQO.a(paramVarArgs);
      }
      if (this.uhe != null) {
        paramVarArgs.e(6, this.uhe);
      }
      if (this.uHZ != null)
      {
        paramVarArgs.fm(7, this.uHZ.aYq());
        this.uHZ.a(paramVarArgs);
      }
      if (this.ugy != null) {
        paramVarArgs.e(8, this.ugy);
      }
      GMTrace.o(3918218133504L, 29193);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.lSW) + 0 + b.a.a.a.fh(2, this.jia);
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPi);
      }
      i = paramInt + b.a.a.a.fh(4, this.jhV);
      paramInt = i;
      if (this.tQO != null) {
        paramInt = i + b.a.a.a.fj(5, this.tQO.aYq());
      }
      i = paramInt;
      if (this.uhe != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uhe);
      }
      paramInt = i;
      if (this.uHZ != null) {
        paramInt = i + b.a.a.a.fj(7, this.uHZ.aYq());
      }
      i = paramInt;
      if (this.ugy != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.ugy);
      }
      GMTrace.o(3918218133504L, 29193);
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
      GMTrace.o(3918218133504L, 29193);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asb localasb = (asb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3918218133504L, 29193);
        return -1;
      case 1: 
        localasb.lSW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 2: 
        localasb.jia = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 3: 
        localasb.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 4: 
        localasb.jhV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localasb.tQO = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 6: 
        localasb.uhe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918218133504L, 29193);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localasb.uHZ = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3918218133504L, 29193);
        return 0;
      }
      localasb.ugy = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3918218133504L, 29193);
      return 0;
    }
    GMTrace.o(3918218133504L, 29193);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\asb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */