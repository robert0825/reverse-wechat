package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yi
  extends ayx
{
  public int eTL;
  public String sign;
  public String tNH;
  public String tNI;
  public int tNJ;
  public LinkedList<jn> tNM;
  public String tQt;
  public String upt;
  public String upu;
  
  public yi()
  {
    GMTrace.i(3984253255680L, 29685);
    this.tNM = new LinkedList();
    GMTrace.o(3984253255680L, 29685);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3984387473408L, 29686);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tNM);
      paramVarArgs.fk(3, this.eTL);
      if (this.upu != null) {
        paramVarArgs.e(4, this.upu);
      }
      if (this.tQt != null) {
        paramVarArgs.e(5, this.tQt);
      }
      if (this.sign != null) {
        paramVarArgs.e(6, this.sign);
      }
      if (this.tNH != null) {
        paramVarArgs.e(7, this.tNH);
      }
      if (this.tNI != null) {
        paramVarArgs.e(8, this.tNI);
      }
      if (this.upt != null) {
        paramVarArgs.e(9, this.upt);
      }
      paramVarArgs.fk(10, this.tNJ);
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tNM) + b.a.a.a.fh(3, this.eTL);
      paramInt = i;
      if (this.upu != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.upu);
      }
      i = paramInt;
      if (this.tQt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tQt);
      }
      paramInt = i;
      if (this.sign != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.sign);
      }
      i = paramInt;
      if (this.tNH != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tNH);
      }
      paramInt = i;
      if (this.tNI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tNI);
      }
      i = paramInt;
      if (this.upt != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.upt);
      }
      paramInt = b.a.a.a.fh(10, this.tNJ);
      GMTrace.o(3984387473408L, 29686);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tNM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yi localyi = (yi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3984387473408L, 29686);
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
          localyi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localyi.tNM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 3: 
        localyi.eTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 4: 
        localyi.upu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 5: 
        localyi.tQt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 6: 
        localyi.sign = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 7: 
        localyi.tNH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 8: 
        localyi.tNI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 9: 
        localyi.upt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      }
      localyi.tNJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    GMTrace.o(3984387473408L, 29686);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\yi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */