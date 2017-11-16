package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class iv
  extends com.tencent.mm.bm.a
{
  public String eQA;
  public String title;
  public String url;
  
  public iv()
  {
    GMTrace.i(3927747592192L, 29264);
    GMTrace.o(3927747592192L, 29264);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3927881809920L, 29265);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.e(1, this.url);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.eQA != null) {
        paramVarArgs.e(3, this.eQA);
      }
      GMTrace.o(3927881809920L, 29265);
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.url) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.eQA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eQA);
      }
      GMTrace.o(3927881809920L, 29265);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3927881809920L, 29265);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        iv localiv = (iv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3927881809920L, 29265);
          return -1;
        case 1: 
          localiv.url = locala.yqV.readString();
          GMTrace.o(3927881809920L, 29265);
          return 0;
        case 2: 
          localiv.title = locala.yqV.readString();
          GMTrace.o(3927881809920L, 29265);
          return 0;
        }
        localiv.eQA = locala.yqV.readString();
        GMTrace.o(3927881809920L, 29265);
        return 0;
      }
      GMTrace.o(3927881809920L, 29265);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */