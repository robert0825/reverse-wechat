package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;

public final class ag
  extends com.tencent.mm.bm.a
{
  public String content;
  public int fPf;
  public String iconUrl;
  public int mJW;
  public int mJX;
  public String name;
  public String type;
  
  public ag()
  {
    GMTrace.i(9741925351424L, 72583);
    GMTrace.o(9741925351424L, 72583);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9742059569152L, 72584);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.fPf);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.type != null) {
        paramVarArgs.e(3, this.type);
      }
      if (this.content != null) {
        paramVarArgs.e(4, this.content);
      }
      paramVarArgs.fk(5, this.mJW);
      if (this.iconUrl != null) {
        paramVarArgs.e(6, this.iconUrl);
      }
      paramVarArgs.fk(7, this.mJX);
      GMTrace.o(9742059569152L, 72584);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.fPf) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.type != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.type);
      }
      paramInt = i;
      if (this.content != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.content);
      }
      i = paramInt + b.a.a.a.fh(5, this.mJW);
      paramInt = i;
      if (this.iconUrl != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.iconUrl);
      }
      i = b.a.a.a.fh(7, this.mJX);
      GMTrace.o(9742059569152L, 72584);
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
      GMTrace.o(9742059569152L, 72584);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ag localag = (ag)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(9742059569152L, 72584);
        return -1;
      case 1: 
        localag.fPf = locala.yqV.nj();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      case 2: 
        localag.name = locala.yqV.readString();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      case 3: 
        localag.type = locala.yqV.readString();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      case 4: 
        localag.content = locala.yqV.readString();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      case 5: 
        localag.mJW = locala.yqV.nj();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      case 6: 
        localag.iconUrl = locala.yqV.readString();
        GMTrace.o(9742059569152L, 72584);
        return 0;
      }
      localag.mJX = locala.yqV.nj();
      GMTrace.o(9742059569152L, 72584);
      return 0;
    }
    GMTrace.o(9742059569152L, 72584);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */