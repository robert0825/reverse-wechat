package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bej
  extends ayx
{
  public String tPP;
  public int tQP;
  public azq uQa;
  public ber uQb;
  public azq uQc;
  
  public bej()
  {
    GMTrace.i(4046127628288L, 30146);
    GMTrace.o(4046127628288L, 30146);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4046261846016L, 30147);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQb == null) {
        throw new b("Not all required fields were included: Action");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uQb != null)
      {
        paramVarArgs.fm(2, this.uQb.aYq());
        this.uQb.a(paramVarArgs);
      }
      if (this.tPP != null) {
        paramVarArgs.e(3, this.tPP);
      }
      if (this.uQa != null)
      {
        paramVarArgs.fm(4, this.uQa.aYq());
        this.uQa.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tQP);
      if (this.uQc != null)
      {
        paramVarArgs.fm(6, this.uQc.aYq());
        this.uQc.a(paramVarArgs);
      }
      GMTrace.o(4046261846016L, 30147);
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
      if (this.uQb != null) {
        paramInt = i + b.a.a.a.fj(2, this.uQb.aYq());
      }
      i = paramInt;
      if (this.tPP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tPP);
      }
      paramInt = i;
      if (this.uQa != null) {
        paramInt = i + b.a.a.a.fj(4, this.uQa.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tQP);
      paramInt = i;
      if (this.uQc != null) {
        paramInt = i + b.a.a.a.fj(6, this.uQc.aYq());
      }
      GMTrace.o(4046261846016L, 30147);
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
      if (this.uQb == null) {
        throw new b("Not all required fields were included: Action");
      }
      GMTrace.o(4046261846016L, 30147);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bej localbej = (bej)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4046261846016L, 30147);
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
          localbej.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ber();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ber)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbej.uQb = ((ber)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 3: 
        localbej.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbej.uQa = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4046261846016L, 30147);
        return 0;
      case 5: 
        localbej.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4046261846016L, 30147);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbej.uQc = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4046261846016L, 30147);
      return 0;
    }
    GMTrace.o(4046261846016L, 30147);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */