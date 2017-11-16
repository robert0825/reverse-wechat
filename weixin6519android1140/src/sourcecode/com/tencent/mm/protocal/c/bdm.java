package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdm
  extends ayx
{
  public int eTL;
  public LinkedList<bdo> glr;
  public bhb tNL;
  public int uPB;
  public String uPC;
  public bdw uPD;
  public String upt;
  
  public bdm()
  {
    GMTrace.i(3730044878848L, 27791);
    this.glr = new LinkedList();
    GMTrace.o(3730044878848L, 27791);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3730179096576L, 27792);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uPB);
      paramVarArgs.d(3, 8, this.glr);
      if (this.uPC != null) {
        paramVarArgs.e(4, this.uPC);
      }
      if (this.upt != null) {
        paramVarArgs.e(5, this.upt);
      }
      if (this.uPD != null)
      {
        paramVarArgs.fm(6, this.uPD.aYq());
        this.uPD.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.eTL);
      if (this.tNL != null)
      {
        paramVarArgs.fm(8, this.tNL.aYq());
        this.tNL.a(paramVarArgs);
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uPB) + b.a.a.a.c(3, 8, this.glr);
      paramInt = i;
      if (this.uPC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uPC);
      }
      i = paramInt;
      if (this.upt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.upt);
      }
      paramInt = i;
      if (this.uPD != null) {
        paramInt = i + b.a.a.a.fj(6, this.uPD.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.eTL);
      paramInt = i;
      if (this.tNL != null) {
        paramInt = i + b.a.a.a.fj(8, this.tNL.aYq());
      }
      GMTrace.o(3730179096576L, 27792);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.glr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdm localbdm = (bdm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3730179096576L, 27792);
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
          localbdm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 2: 
        localbdm.uPB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbdm.glr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 4: 
        localbdm.uPC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 5: 
        localbdm.upt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbdm.uPD = ((bdw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 7: 
        localbdm.eTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730179096576L, 27792);
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
        localbdm.tNL = ((bhb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    GMTrace.o(3730179096576L, 27792);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */