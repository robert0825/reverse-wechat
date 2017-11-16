package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public String eLQ;
  public int eQl;
  public String jWz;
  public String mJO;
  public String mJP;
  
  public a()
  {
    GMTrace.i(3697161535488L, 27546);
    GMTrace.o(3697161535488L, 27546);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3697295753216L, 27547);
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
      GMTrace.o(3697295753216L, 27547);
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
      GMTrace.o(3697295753216L, 27547);
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
      GMTrace.o(3697295753216L, 27547);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3697295753216L, 27547);
        return -1;
      case 1: 
        locala1.eQl = locala.yqV.nj();
        GMTrace.o(3697295753216L, 27547);
        return 0;
      case 2: 
        locala1.eLQ = locala.yqV.readString();
        GMTrace.o(3697295753216L, 27547);
        return 0;
      case 3: 
        locala1.mJO = locala.yqV.readString();
        GMTrace.o(3697295753216L, 27547);
        return 0;
      case 4: 
        locala1.mJP = locala.yqV.readString();
        GMTrace.o(3697295753216L, 27547);
        return 0;
      }
      locala1.jWz = locala.yqV.readString();
      GMTrace.o(3697295753216L, 27547);
      return 0;
    }
    GMTrace.o(3697295753216L, 27547);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */