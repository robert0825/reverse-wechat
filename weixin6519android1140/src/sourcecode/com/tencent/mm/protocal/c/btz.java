package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btz
  extends com.tencent.mm.bm.a
{
  public String lQe;
  public String uBf;
  public String vcF;
  
  public btz()
  {
    GMTrace.i(3863457300480L, 28785);
    GMTrace.o(3863457300480L, 28785);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3863591518208L, 28786);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vcF != null) {
        paramVarArgs.e(1, this.vcF);
      }
      if (this.lQe != null) {
        paramVarArgs.e(2, this.lQe);
      }
      if (this.uBf != null) {
        paramVarArgs.e(3, this.uBf);
      }
      GMTrace.o(3863591518208L, 28786);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vcF == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.vcF) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lQe != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQe);
      }
      i = paramInt;
      if (this.uBf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uBf);
      }
      GMTrace.o(3863591518208L, 28786);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3863591518208L, 28786);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btz localbtz = (btz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3863591518208L, 28786);
          return -1;
        case 1: 
          localbtz.vcF = locala.yqV.readString();
          GMTrace.o(3863591518208L, 28786);
          return 0;
        case 2: 
          localbtz.lQe = locala.yqV.readString();
          GMTrace.o(3863591518208L, 28786);
          return 0;
        }
        localbtz.uBf = locala.yqV.readString();
        GMTrace.o(3863591518208L, 28786);
        return 0;
      }
      GMTrace.o(3863591518208L, 28786);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */