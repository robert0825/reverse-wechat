package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class ab
  extends com.tencent.mm.bm.a
{
  public int jgO;
  public b jgP;
  public long jhz;
  public int jip;
  public int jiq;
  public long jir;
  
  public ab()
  {
    GMTrace.i(14835488129024L, 110533);
    GMTrace.o(14835488129024L, 110533);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14835622346752L, 110534);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jgO);
      if (this.jgP != null) {
        paramVarArgs.b(2, this.jgP);
      }
      paramVarArgs.fk(3, this.jip);
      paramVarArgs.fk(4, this.jiq);
      paramVarArgs.T(5, this.jir);
      paramVarArgs.T(6, this.jhz);
      GMTrace.o(14835622346752L, 110534);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jgO) + 0;
      paramInt = i;
      if (this.jgP != null) {
        paramInt = i + b.a.a.a.a(2, this.jgP);
      }
      i = b.a.a.a.fh(3, this.jip);
      int j = b.a.a.a.fh(4, this.jiq);
      int k = b.a.a.a.S(5, this.jir);
      int m = b.a.a.a.S(6, this.jhz);
      GMTrace.o(14835622346752L, 110534);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14835622346752L, 110534);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ab localab = (ab)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14835622346752L, 110534);
        return -1;
      case 1: 
        localab.jgO = locala.yqV.nj();
        GMTrace.o(14835622346752L, 110534);
        return 0;
      case 2: 
        localab.jgP = locala.csV();
        GMTrace.o(14835622346752L, 110534);
        return 0;
      case 3: 
        localab.jip = locala.yqV.nj();
        GMTrace.o(14835622346752L, 110534);
        return 0;
      case 4: 
        localab.jiq = locala.yqV.nj();
        GMTrace.o(14835622346752L, 110534);
        return 0;
      case 5: 
        localab.jir = locala.yqV.nk();
        GMTrace.o(14835622346752L, 110534);
        return 0;
      }
      localab.jhz = locala.yqV.nk();
      GMTrace.o(14835622346752L, 110534);
      return 0;
    }
    GMTrace.o(14835622346752L, 110534);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */