package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arm
  extends ayx
{
  public int ePo;
  public String nDt;
  public String rcs;
  public String tUk;
  public String tUl;
  public String uHG;
  public String uHH;
  public int uHI;
  
  public arm()
  {
    GMTrace.i(19137837400064L, 142588);
    GMTrace.o(19137837400064L, 142588);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19137971617792L, 142589);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUk != null) {
        paramVarArgs.e(2, this.tUk);
      }
      if (this.tUl != null) {
        paramVarArgs.e(3, this.tUl);
      }
      if (this.uHG != null) {
        paramVarArgs.e(4, this.uHG);
      }
      if (this.uHH != null) {
        paramVarArgs.e(5, this.uHH);
      }
      if (this.rcs != null) {
        paramVarArgs.e(6, this.rcs);
      }
      if (this.nDt != null) {
        paramVarArgs.e(7, this.nDt);
      }
      paramVarArgs.fk(8, this.ePo);
      paramVarArgs.fk(9, this.uHI);
      GMTrace.o(19137971617792L, 142589);
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
      if (this.tUk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tUk);
      }
      i = paramInt;
      if (this.tUl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUl);
      }
      paramInt = i;
      if (this.uHG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uHG);
      }
      i = paramInt;
      if (this.uHH != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uHH);
      }
      paramInt = i;
      if (this.rcs != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.rcs);
      }
      i = paramInt;
      if (this.nDt != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.nDt);
      }
      paramInt = b.a.a.a.fh(8, this.ePo);
      int j = b.a.a.a.fh(9, this.uHI);
      GMTrace.o(19137971617792L, 142589);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19137971617792L, 142589);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arm localarm = (arm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19137971617792L, 142589);
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
          localarm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 2: 
        localarm.tUk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 3: 
        localarm.tUl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 4: 
        localarm.uHG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 5: 
        localarm.uHH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 6: 
        localarm.rcs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 7: 
        localarm.nDt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      case 8: 
        localarm.ePo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19137971617792L, 142589);
        return 0;
      }
      localarm.uHI = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(19137971617792L, 142589);
      return 0;
    }
    GMTrace.o(19137971617792L, 142589);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\arm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */