package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aw
  extends com.tencent.mm.bm.a
{
  public String lPS;
  public String lPg;
  public String lRT;
  public String tOW;
  public String tOX;
  public String tOY;
  public String tOZ;
  public String tPa;
  public String tPb;
  public bvm tPc;
  public String tPd;
  
  public aw()
  {
    GMTrace.i(3982508425216L, 29672);
    GMTrace.o(3982508425216L, 29672);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3982642642944L, 29673);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.tOW != null) {
        paramVarArgs.e(2, this.tOW);
      }
      if (this.tOX != null) {
        paramVarArgs.e(3, this.tOX);
      }
      if (this.lPS != null) {
        paramVarArgs.e(4, this.lPS);
      }
      if (this.lRT != null) {
        paramVarArgs.e(5, this.lRT);
      }
      if (this.tOY != null) {
        paramVarArgs.e(6, this.tOY);
      }
      if (this.tOZ != null) {
        paramVarArgs.e(7, this.tOZ);
      }
      if (this.tPa != null) {
        paramVarArgs.e(8, this.tPa);
      }
      if (this.tPb != null) {
        paramVarArgs.e(9, this.tPb);
      }
      if (this.tPc != null)
      {
        paramVarArgs.fm(10, this.tPc.aYq());
        this.tPc.a(paramVarArgs);
      }
      if (this.tPd != null) {
        paramVarArgs.e(11, this.tPd);
      }
      GMTrace.o(3982642642944L, 29673);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPg != null) {
        i = b.a.a.b.b.a.f(1, this.lPg) + 0;
      }
      paramInt = i;
      if (this.tOW != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tOW);
      }
      i = paramInt;
      if (this.tOX != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tOX);
      }
      paramInt = i;
      if (this.lPS != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPS);
      }
      i = paramInt;
      if (this.lRT != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lRT);
      }
      paramInt = i;
      if (this.tOY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tOY);
      }
      i = paramInt;
      if (this.tOZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tOZ);
      }
      paramInt = i;
      if (this.tPa != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tPa);
      }
      i = paramInt;
      if (this.tPb != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tPb);
      }
      paramInt = i;
      if (this.tPc != null) {
        paramInt = i + b.a.a.a.fj(10, this.tPc.aYq());
      }
      i = paramInt;
      if (this.tPd != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tPd);
      }
      GMTrace.o(3982642642944L, 29673);
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
      GMTrace.o(3982642642944L, 29673);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aw localaw = (aw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3982642642944L, 29673);
        return -1;
      case 1: 
        localaw.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 2: 
        localaw.tOW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 3: 
        localaw.tOX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 4: 
        localaw.lPS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 5: 
        localaw.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 6: 
        localaw.tOY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 7: 
        localaw.tOZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 8: 
        localaw.tPa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 9: 
        localaw.tPb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3982642642944L, 29673);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bvm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaw.tPc = ((bvm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3982642642944L, 29673);
        return 0;
      }
      localaw.tPd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3982642642944L, 29673);
      return 0;
    }
    GMTrace.o(3982642642944L, 29673);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */