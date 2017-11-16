package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hh
  extends ayx
{
  public int tOG;
  public String tRS;
  public LinkedList<String> tWk;
  public String tWl;
  public double tWm;
  public double tWn;
  
  public hh()
  {
    GMTrace.i(3732997668864L, 27813);
    this.tWk = new LinkedList();
    GMTrace.o(3732997668864L, 27813);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3733131886592L, 27814);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tRS != null) {
        paramVarArgs.e(2, this.tRS);
      }
      paramVarArgs.d(3, 1, this.tWk);
      paramVarArgs.fk(4, this.tOG);
      if (this.tWl != null) {
        paramVarArgs.e(5, this.tWl);
      }
      paramVarArgs.a(6, this.tWm);
      paramVarArgs.a(7, this.tWn);
      GMTrace.o(3733131886592L, 27814);
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
      if (this.tRS != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tRS);
      }
      i = i + b.a.a.a.c(3, 1, this.tWk) + b.a.a.a.fh(4, this.tOG);
      paramInt = i;
      if (this.tWl != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tWl);
      }
      i = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      GMTrace.o(3733131886592L, 27814);
      return paramInt + (i + 8) + (j + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tWk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3733131886592L, 27814);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hh localhh = (hh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3733131886592L, 27814);
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
          localhh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3733131886592L, 27814);
        return 0;
      case 2: 
        localhh.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3733131886592L, 27814);
        return 0;
      case 3: 
        localhh.tWk.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3733131886592L, 27814);
        return 0;
      case 4: 
        localhh.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3733131886592L, 27814);
        return 0;
      case 5: 
        localhh.tWl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3733131886592L, 27814);
        return 0;
      case 6: 
        localhh.tWm = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3733131886592L, 27814);
        return 0;
      }
      localhh.tWn = ((b.a.a.a.a)localObject1).yqV.readDouble();
      GMTrace.o(3733131886592L, 27814);
      return 0;
    }
    GMTrace.o(3733131886592L, 27814);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */