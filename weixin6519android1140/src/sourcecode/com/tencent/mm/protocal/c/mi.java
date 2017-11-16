package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mi
  extends ayx
{
  public String lQa;
  public String tUz;
  public at tYT;
  public String ucv;
  public String udf;
  public String udg;
  public String udh;
  public String udi;
  public int udj;
  public String udk;
  
  public mi()
  {
    GMTrace.i(3684947722240L, 27455);
    GMTrace.o(3684947722240L, 27455);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3685081939968L, 27456);
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
      if (this.udf != null) {
        paramVarArgs.e(3, this.udf);
      }
      if (this.tUz != null) {
        paramVarArgs.e(4, this.tUz);
      }
      if (this.udg != null) {
        paramVarArgs.e(5, this.udg);
      }
      if (this.udh != null) {
        paramVarArgs.e(6, this.udh);
      }
      if (this.udi != null) {
        paramVarArgs.e(7, this.udi);
      }
      if (this.ucv != null) {
        paramVarArgs.e(8, this.ucv);
      }
      paramVarArgs.fk(9, this.udj);
      if (this.tYT != null)
      {
        paramVarArgs.fm(10, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      if (this.udk != null) {
        paramVarArgs.e(11, this.udk);
      }
      GMTrace.o(3685081939968L, 27456);
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
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.udf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.udf);
      }
      paramInt = i;
      if (this.tUz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUz);
      }
      i = paramInt;
      if (this.udg != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.udg);
      }
      paramInt = i;
      if (this.udh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.udh);
      }
      i = paramInt;
      if (this.udi != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.udi);
      }
      paramInt = i;
      if (this.ucv != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ucv);
      }
      i = paramInt + b.a.a.a.fh(9, this.udj);
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(10, this.tYT.aYq());
      }
      i = paramInt;
      if (this.udk != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.udk);
      }
      GMTrace.o(3685081939968L, 27456);
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
      GMTrace.o(3685081939968L, 27456);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mi localmi = (mi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3685081939968L, 27456);
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
          localmi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 2: 
        localmi.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 3: 
        localmi.udf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 4: 
        localmi.tUz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 5: 
        localmi.udg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 6: 
        localmi.udh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 7: 
        localmi.udi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 8: 
        localmi.ucv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 9: 
        localmi.udj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localmi.tYT = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3685081939968L, 27456);
        return 0;
      }
      localmi.udk = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3685081939968L, 27456);
      return 0;
    }
    GMTrace.o(3685081939968L, 27456);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\mi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */