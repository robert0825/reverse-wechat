package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class my
  extends com.tencent.mm.bm.a
{
  public int jif;
  public int kAW;
  public LinkedList<ako> lSa;
  public int tTC;
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public String tWH;
  public int udE;
  
  public my()
  {
    GMTrace.i(13098979164160L, 97595);
    this.lSa = new LinkedList();
    GMTrace.o(13098979164160L, 97595);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13099113381888L, 97596);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.kAW);
      if (this.tWF != null) {
        paramVarArgs.e(7, this.tWF);
      }
      paramVarArgs.fk(2, this.tTC);
      paramVarArgs.fk(3, this.udE);
      paramVarArgs.d(4, 8, this.lSa);
      if (this.tWD != null) {
        paramVarArgs.e(5, this.tWD);
      }
      if (this.tWE != null) {
        paramVarArgs.e(6, this.tWE);
      }
      if (this.tWG != null) {
        paramVarArgs.e(8, this.tWG);
      }
      if (this.tWH != null) {
        paramVarArgs.e(9, this.tWH);
      }
      paramVarArgs.fk(10, this.jif);
      GMTrace.o(13099113381888L, 97596);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.kAW) + 0;
      paramInt = i;
      if (this.tWF != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tWF);
      }
      i = paramInt + b.a.a.a.fh(2, this.tTC) + b.a.a.a.fh(3, this.udE) + b.a.a.a.c(4, 8, this.lSa);
      paramInt = i;
      if (this.tWD != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tWD);
      }
      i = paramInt;
      if (this.tWE != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tWE);
      }
      paramInt = i;
      if (this.tWG != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tWG);
      }
      i = paramInt;
      if (this.tWH != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tWH);
      }
      paramInt = b.a.a.a.fh(10, this.jif);
      GMTrace.o(13099113381888L, 97596);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lSa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13099113381888L, 97596);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      my localmy = (my)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13099113381888L, 97596);
        return -1;
      case 1: 
        localmy.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 7: 
        localmy.tWF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 2: 
        localmy.tTC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 3: 
        localmy.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ako();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((ako)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localmy.lSa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 5: 
        localmy.tWD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 6: 
        localmy.tWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 8: 
        localmy.tWG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      case 9: 
        localmy.tWH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13099113381888L, 97596);
        return 0;
      }
      localmy.jif = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13099113381888L, 97596);
      return 0;
    }
    GMTrace.o(13099113381888L, 97596);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */