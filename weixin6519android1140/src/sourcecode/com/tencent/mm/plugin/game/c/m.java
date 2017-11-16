package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bm.a
{
  public int lPZ;
  public String lPf;
  public String lQa;
  public int lQb;
  public int lQc;
  
  public m()
  {
    GMTrace.i(12636733308928L, 94151);
    GMTrace.o(12636733308928L, 94151);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636867526656L, 94152);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lPZ);
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.lQb);
      if (this.lPf != null) {
        paramVarArgs.e(4, this.lPf);
      }
      paramVarArgs.fk(5, this.lQc);
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lPZ) + 0;
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt + b.a.a.a.fh(3, this.lQb);
      paramInt = i;
      if (this.lPf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPf);
      }
      i = b.a.a.a.fh(5, this.lQc);
      GMTrace.o(12636867526656L, 94152);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12636867526656L, 94152);
        return -1;
      case 1: 
        localm.lPZ = locala.yqV.nj();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 2: 
        localm.lQa = locala.yqV.readString();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 3: 
        localm.lQb = locala.yqV.nj();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 4: 
        localm.lPf = locala.yqV.readString();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      }
      localm.lQc = locala.yqV.nj();
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    GMTrace.o(12636867526656L, 94152);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */