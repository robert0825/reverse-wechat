package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public int count;
  public int oNd;
  public int tLd;
  public com.tencent.mm.bm.b tLm;
  public int tLn;
  
  public d()
  {
    GMTrace.i(13102737260544L, 97623);
    GMTrace.o(13102737260544L, 97623);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13102871478272L, 97624);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tLm == null) {
        throw new b.a.a.b("Not all required fields were included: value");
      }
      paramVarArgs.fk(1, this.tLd);
      if (this.tLm != null) {
        paramVarArgs.b(2, this.tLm);
      }
      paramVarArgs.fk(3, this.tLn);
      paramVarArgs.fk(4, this.oNd);
      paramVarArgs.fk(5, this.count);
      GMTrace.o(13102871478272L, 97624);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tLd) + 0;
      paramInt = i;
      if (this.tLm != null) {
        paramInt = i + b.a.a.a.a(2, this.tLm);
      }
      i = b.a.a.a.fh(3, this.tLn);
      int j = b.a.a.a.fh(4, this.oNd);
      int k = b.a.a.a.fh(5, this.count);
      GMTrace.o(13102871478272L, 97624);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tLm == null) {
        throw new b.a.a.b("Not all required fields were included: value");
      }
      GMTrace.o(13102871478272L, 97624);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13102871478272L, 97624);
        return -1;
      case 1: 
        locald.tLd = locala.yqV.nj();
        GMTrace.o(13102871478272L, 97624);
        return 0;
      case 2: 
        locald.tLm = locala.csV();
        GMTrace.o(13102871478272L, 97624);
        return 0;
      case 3: 
        locald.tLn = locala.yqV.nj();
        GMTrace.o(13102871478272L, 97624);
        return 0;
      case 4: 
        locald.oNd = locala.yqV.nj();
        GMTrace.o(13102871478272L, 97624);
        return 0;
      }
      locald.count = locala.yqV.nj();
      GMTrace.o(13102871478272L, 97624);
      return 0;
    }
    GMTrace.o(13102871478272L, 97624);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */