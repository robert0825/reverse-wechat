package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvm
  extends com.tencent.mm.bm.a
{
  public String lTh;
  public String lTj;
  public String lTk;
  public int lTl;
  public String tVH;
  public int vdK;
  public String vdL;
  
  public bvm()
  {
    GMTrace.i(4013781155840L, 29905);
    GMTrace.o(4013781155840L, 29905);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4013915373568L, 29906);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vdK);
      if (this.tVH != null) {
        paramVarArgs.e(2, this.tVH);
      }
      if (this.lTh != null) {
        paramVarArgs.e(3, this.lTh);
      }
      if (this.vdL != null) {
        paramVarArgs.e(4, this.vdL);
      }
      if (this.lTj != null) {
        paramVarArgs.e(5, this.lTj);
      }
      if (this.lTk != null) {
        paramVarArgs.e(6, this.lTk);
      }
      paramVarArgs.fk(7, this.lTl);
      GMTrace.o(4013915373568L, 29906);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.vdK) + 0;
      paramInt = i;
      if (this.tVH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVH);
      }
      i = paramInt;
      if (this.lTh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lTh);
      }
      paramInt = i;
      if (this.vdL != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vdL);
      }
      i = paramInt;
      if (this.lTj != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lTj);
      }
      paramInt = i;
      if (this.lTk != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lTk);
      }
      i = b.a.a.a.fh(7, this.lTl);
      GMTrace.o(4013915373568L, 29906);
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
      GMTrace.o(4013915373568L, 29906);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvm localbvm = (bvm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4013915373568L, 29906);
        return -1;
      case 1: 
        localbvm.vdK = locala.yqV.nj();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      case 2: 
        localbvm.tVH = locala.yqV.readString();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      case 3: 
        localbvm.lTh = locala.yqV.readString();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      case 4: 
        localbvm.vdL = locala.yqV.readString();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      case 5: 
        localbvm.lTj = locala.yqV.readString();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      case 6: 
        localbvm.lTk = locala.yqV.readString();
        GMTrace.o(4013915373568L, 29906);
        return 0;
      }
      localbvm.lTl = locala.yqV.nj();
      GMTrace.o(4013915373568L, 29906);
      return 0;
    }
    GMTrace.o(4013915373568L, 29906);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */