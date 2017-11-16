package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hr
  extends ayx
{
  public int count;
  public int nBz;
  public int oqP;
  public String osS;
  public String osT;
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public String tWH;
  public String tWI;
  public int type;
  public String value;
  
  public hr()
  {
    GMTrace.i(3722260250624L, 27733);
    GMTrace.o(3722260250624L, 27733);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3722394468352L, 27734);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tWD != null) {
        paramVarArgs.e(2, this.tWD);
      }
      if (this.tWE != null) {
        paramVarArgs.e(3, this.tWE);
      }
      if (this.tWF != null) {
        paramVarArgs.e(4, this.tWF);
      }
      if (this.tWG != null) {
        paramVarArgs.e(5, this.tWG);
      }
      if (this.tWH != null) {
        paramVarArgs.e(6, this.tWH);
      }
      paramVarArgs.fk(7, this.oqP);
      if (this.tWI != null) {
        paramVarArgs.e(8, this.tWI);
      }
      if (this.osT != null) {
        paramVarArgs.e(9, this.osT);
      }
      if (this.osS != null) {
        paramVarArgs.e(10, this.osS);
      }
      paramVarArgs.fk(11, this.type);
      if (this.value != null) {
        paramVarArgs.e(12, this.value);
      }
      paramVarArgs.fk(13, this.count);
      paramVarArgs.fk(14, this.nBz);
      GMTrace.o(3722394468352L, 27734);
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
      if (this.tWD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWD);
      }
      i = paramInt;
      if (this.tWE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tWE);
      }
      paramInt = i;
      if (this.tWF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWF);
      }
      i = paramInt;
      if (this.tWG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWG);
      }
      paramInt = i;
      if (this.tWH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tWH);
      }
      i = paramInt + b.a.a.a.fh(7, this.oqP);
      paramInt = i;
      if (this.tWI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tWI);
      }
      i = paramInt;
      if (this.osT != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.osT);
      }
      paramInt = i;
      if (this.osS != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.osS);
      }
      i = paramInt + b.a.a.a.fh(11, this.type);
      paramInt = i;
      if (this.value != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.value);
      }
      i = b.a.a.a.fh(13, this.count);
      int j = b.a.a.a.fh(14, this.nBz);
      GMTrace.o(3722394468352L, 27734);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3722394468352L, 27734);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hr localhr = (hr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3722394468352L, 27734);
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
          localhr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 2: 
        localhr.tWD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 3: 
        localhr.tWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 4: 
        localhr.tWF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 5: 
        localhr.tWG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 6: 
        localhr.tWH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 7: 
        localhr.oqP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 8: 
        localhr.tWI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 9: 
        localhr.osT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 10: 
        localhr.osS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 11: 
        localhr.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 12: 
        localhr.value = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      case 13: 
        localhr.count = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3722394468352L, 27734);
        return 0;
      }
      localhr.nBz = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3722394468352L, 27734);
      return 0;
    }
    GMTrace.o(3722394468352L, 27734);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */