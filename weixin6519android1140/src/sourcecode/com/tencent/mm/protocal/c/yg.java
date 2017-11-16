package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yg
  extends ayx
{
  public String eTJ;
  public String eTK;
  public int eTL;
  public String jyR;
  public String tNH;
  public String tNI;
  public int tNJ;
  public bhb tNL;
  public String upt;
  
  public yg()
  {
    GMTrace.i(3864531042304L, 28793);
    GMTrace.o(3864531042304L, 28793);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864665260032L, 28794);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eTJ != null) {
        paramVarArgs.e(2, this.eTJ);
      }
      paramVarArgs.fk(3, this.eTL);
      if (this.jyR != null) {
        paramVarArgs.e(4, this.jyR);
      }
      if (this.eTK != null) {
        paramVarArgs.e(5, this.eTK);
      }
      if (this.tNH != null) {
        paramVarArgs.e(6, this.tNH);
      }
      if (this.tNI != null) {
        paramVarArgs.e(7, this.tNI);
      }
      paramVarArgs.fk(8, this.tNJ);
      if (this.upt != null) {
        paramVarArgs.e(9, this.upt);
      }
      if (this.tNL != null)
      {
        paramVarArgs.fm(10, this.tNL.aYq());
        this.tNL.a(paramVarArgs);
      }
      GMTrace.o(3864665260032L, 28794);
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
      if (this.eTJ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eTJ);
      }
      i += b.a.a.a.fh(3, this.eTL);
      paramInt = i;
      if (this.jyR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jyR);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eTK);
      }
      paramInt = i;
      if (this.tNH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tNH);
      }
      i = paramInt;
      if (this.tNI != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tNI);
      }
      i += b.a.a.a.fh(8, this.tNJ);
      paramInt = i;
      if (this.upt != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.upt);
      }
      i = paramInt;
      if (this.tNL != null) {
        i = paramInt + b.a.a.a.fj(10, this.tNL.aYq());
      }
      GMTrace.o(3864665260032L, 28794);
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
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      GMTrace.o(3864665260032L, 28794);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yg localyg = (yg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3864665260032L, 28794);
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
          localyg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 2: 
        localyg.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 3: 
        localyg.eTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 4: 
        localyg.jyR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 5: 
        localyg.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 6: 
        localyg.tNH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 7: 
        localyg.tNI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 8: 
        localyg.tNJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 9: 
        localyg.upt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localyg.tNL = ((bhb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3864665260032L, 28794);
      return 0;
    }
    GMTrace.o(3864665260032L, 28794);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */