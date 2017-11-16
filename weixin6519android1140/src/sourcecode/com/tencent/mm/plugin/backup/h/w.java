package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class w
  extends com.tencent.mm.bm.a
{
  public String ID;
  public com.tencent.mm.bm.b jgP;
  public int jhA;
  public int jhZ;
  public int jia;
  public int jib;
  public int jic;
  
  public w()
  {
    GMTrace.i(14831193161728L, 110501);
    GMTrace.o(14831193161728L, 110501);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831327379456L, 110502);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      paramVarArgs.fk(1, this.jhZ);
      paramVarArgs.fk(2, this.jhA);
      if (this.ID != null) {
        paramVarArgs.e(3, this.ID);
      }
      if (this.jgP != null) {
        paramVarArgs.b(4, this.jgP);
      }
      paramVarArgs.fk(5, this.jia);
      paramVarArgs.fk(6, this.jib);
      paramVarArgs.fk(7, this.jic);
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jhZ) + 0 + b.a.a.a.fh(2, this.jhA);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ID);
      }
      i = paramInt;
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(4, this.jgP);
      }
      paramInt = b.a.a.a.fh(5, this.jia);
      int j = b.a.a.a.fh(6, this.jib);
      int k = b.a.a.a.fh(7, this.jic);
      GMTrace.o(14831327379456L, 110502);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      w localw = (w)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14831327379456L, 110502);
        return -1;
      case 1: 
        localw.jhZ = locala.yqV.nj();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 2: 
        localw.jhA = locala.yqV.nj();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 3: 
        localw.ID = locala.yqV.readString();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 4: 
        localw.jgP = locala.csV();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 5: 
        localw.jia = locala.yqV.nj();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      case 6: 
        localw.jib = locala.yqV.nj();
        GMTrace.o(14831327379456L, 110502);
        return 0;
      }
      localw.jic = locala.yqV.nj();
      GMTrace.o(14831327379456L, 110502);
      return 0;
    }
    GMTrace.o(14831327379456L, 110502);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */