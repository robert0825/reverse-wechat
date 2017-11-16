package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cd
  extends com.tencent.mm.bm.a
{
  public String eLQ;
  public int eQl;
  public String jWz;
  public String mJO;
  public String mJP;
  
  public cd()
  {
    GMTrace.i(20865219559424L, 155458);
    GMTrace.o(20865219559424L, 155458);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20865353777152L, 155459);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.eQl);
      if (this.eLQ != null) {
        paramVarArgs.e(2, this.eLQ);
      }
      if (this.mJO != null) {
        paramVarArgs.e(3, this.mJO);
      }
      if (this.mJP != null) {
        paramVarArgs.e(4, this.mJP);
      }
      if (this.jWz != null) {
        paramVarArgs.e(5, this.jWz);
      }
      GMTrace.o(20865353777152L, 155459);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.eQl) + 0;
      paramInt = i;
      if (this.eLQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eLQ);
      }
      i = paramInt;
      if (this.mJO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mJO);
      }
      paramInt = i;
      if (this.mJP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mJP);
      }
      i = paramInt;
      if (this.jWz != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jWz);
      }
      GMTrace.o(20865353777152L, 155459);
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
      GMTrace.o(20865353777152L, 155459);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cd localcd = (cd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20865353777152L, 155459);
        return -1;
      case 1: 
        localcd.eQl = locala.yqV.nj();
        GMTrace.o(20865353777152L, 155459);
        return 0;
      case 2: 
        localcd.eLQ = locala.yqV.readString();
        GMTrace.o(20865353777152L, 155459);
        return 0;
      case 3: 
        localcd.mJO = locala.yqV.readString();
        GMTrace.o(20865353777152L, 155459);
        return 0;
      case 4: 
        localcd.mJP = locala.yqV.readString();
        GMTrace.o(20865353777152L, 155459);
        return 0;
      }
      localcd.jWz = locala.yqV.readString();
      GMTrace.o(20865353777152L, 155459);
      return 0;
    }
    GMTrace.o(20865353777152L, 155459);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */